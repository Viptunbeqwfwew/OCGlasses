package com.bymarcin.openglasses.utils;

public class OGUtils {

    public static int getIntFromColor(float red, float green, float blue, float alpha) {
        int R = Math.round(255 * red);
        int G = Math.round(255 * green);
        int B = Math.round(255 * blue);
        int A = Math.round(255 * alpha);
        A = (A << 24) & 0xFF000000;
        R = (R << 16) & 0x00FF0000;
        G = (G << 8) & 0x0000FF00;
        B = B & 0x000000FF;
        return A | R | G | B;
    }

    public static boolean inRange(double x, double y, double z, double sx, double sy, double sz, double r) {
        return (((x - sx) * (x - sx)) + ((y - sy) * (y - sy)) + ((z - sz) * (z - sz))) <= (r * r);
    }
}
