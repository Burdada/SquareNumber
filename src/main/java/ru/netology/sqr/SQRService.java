package ru.netology.sqr;

public class SQRService {
    public int sqrNumber(int borderX, int borderY) {
        int number = 0;
        for (int sqrRt = 10; sqrRt < 100; sqrRt++) {
            if ((sqrRt * sqrRt >= borderX) && (sqrRt * sqrRt <= borderY)) {
                number = number + 1;
            }

        }
        return number;
    }
}
