package com.example.android.mediafiles;

class Music {

    private String textview;
    private String textname;
    private int image;

    public Music(String textview,String textname, int image) {
        this.textview = textview;
        this.textname = textname;
        this.image = image;
    }

    public String getTextview() {
        return textview;
    }

    public String getTextname() {
        return textname;
    }

    public int getImage() {
        return image;
    }
}
