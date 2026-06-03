void main() {
        long startTime = System.currentTimeMillis(); // или System.nanoTime() для наносекунд

        String word;
        String[] uniqueWords = new String[100];
        String[] characters = new String[300];
        int wcount = 0;
        int ccount = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("words.txt"))) {
            label:
            while (bufferedReader.ready()) {
                word = bufferedReader.readLine();
                if (word.length() != 5) continue;
                String[] wordCharBuffer = new String[5];
                for (int i = 0; i < 5; i++) {
                    wordCharBuffer[i] = String.valueOf(word.charAt(i));
                }

                for (String ch : characters) {
                    for (String wch : wordCharBuffer) {
                        if (ch == null) {
                        } else if (ch.equalsIgnoreCase(wch)) continue label;
                    }
                }
                for (int i = 0; i < 5; i++) {
                    characters[ccount] = wordCharBuffer[i];
                    ccount++;
                }
                uniqueWords[wcount] = word;
                wcount++;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Затрачено времени: " + (endTime - startTime) + " миллисекунд");
}
