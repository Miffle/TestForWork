package org.work.task2;

public class RepeatedLetters {
    /**
     * Метод принимает слово и ищет первый повторяющийся символ
     * @param word Слово, в котором надо найти повторяющийся символ
     * @return Повторяющийся символ или 0, если таких символов нет
     */
    public static char getRepeatedLetter(String word) {
        char[] wordAsArray = word.toCharArray();
        int wordLength = wordAsArray.length;
        for (int i = 0; i < wordLength; i++) {
            for (int j = i + 1; j < wordLength; j++) {
                if (wordAsArray[i] == wordAsArray[j]) {
                    return wordAsArray[i];
                }
            }
        }
        return 0;
    }
}
