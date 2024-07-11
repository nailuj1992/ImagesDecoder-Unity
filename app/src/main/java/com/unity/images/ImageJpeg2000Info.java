package com.unity.images;

public class ImageJpeg2000Info {
    private int width;
    private int height;
    private int[] colors;

    public ImageJpeg2000Info(int[] colors, int width, int height) {
        this.setColors(colors);
        this.setWidth(width);
        this.setHeight(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int[] getColors() {
        return colors;
    }

    public void setColors(int[] colors) {
        this.colors = colors;
    }
}
