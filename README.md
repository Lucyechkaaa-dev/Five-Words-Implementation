# Wordle-Inspired Computational Challenge: 5 Words, 25 Unique Letters

An elegant and highly optimized solver inspired by Matt Parker's challenge (*Stand-up Maths*) to find **five distinct five-letter words that collectively use 25 unique letters of the alphabet**, leaving exactly one letter unused.

[![Matt Parker's Video](https://img.shields.io/badge/Watch-Matt%20Parker's%20Video-red?style=flat&logo=youtube)](https://www.youtube.com/watch?v=c33AZBnRHks)

---

## 📖 The Problem Statement

The challenge originates from a viral math/computation puzzle based on the mechanics of Wordle. The objective is to parse a standard wordlist (typically the Wordle allowed guesses or Wordle answers list) and extract a combination of **5 words** such that:
1. Each word is exactly **5 letters** long.
2. Every single letter among all 5 words is **unique** (anagrams of the same letter sets are handled effectively).
3. The total set uses **25 unique letters** out of the 26 in the English alphabet, meaning exactly 1 letter remains unused.

*(Total unique characters: 25. Unused letter: **V**)*

---

## ⚡ The Optimization Journey

This repository implements/is inspired by the evolutionary leap in computation speeds showcased in the community response to Matt Parker's original code:

* **Matt's Original Python Script:** Took roughly **32 days** (2,760,670 seconds) to complete.
* **My Java Script:** Took only +-60 ms to solve!
