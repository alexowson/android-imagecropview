package com.naver.android.helloyako.imagecrop.view;

import android.graphics.PointF;

public class Vector2D extends PointF {

    public Vector2D() {
        super();
    }

    public Vector2D(float x, float y) {
        super(x, y);
    }

    public static float getAngleRadians(Vector2D vector1, Vector2D vector2) {
        vector1.normalize();
        vector2.normalize();
        double radians = Math.atan2(vector2.y, vector2.x) - Math.atan2(vector1.y, vector1.x);
        return (float) radians;
    }

    public static float getAngleDegrees(Vector2D vector1, Vector2D vector2) {
        double degrees = (180.0 / Math.PI) * getAngleRadians(vector1, vector2);
        return (float) degrees;
    }

    public void normalize() {
        float length = (float) Math.sqrt(x * x + y * y);
        x /= length;
        y /= length;
    }
}