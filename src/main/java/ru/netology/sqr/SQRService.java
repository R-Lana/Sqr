package ru.netology.sqr;

public class SQRService {
    public int numberSqr(int under, int up) {
            int n = 0;
            for (int i = 10; i <= 99; i++) {
                if (under <= i * i & i * i <= up) {
                    n = n + 1;
                }
            }
            return n;
        }


}


