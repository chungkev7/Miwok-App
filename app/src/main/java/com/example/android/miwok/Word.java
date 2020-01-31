package com.example.android.miwok;

public class Word {

    // Default translation for the word
    private String mDefaultTranslation;

    // Miwok translation for the word
    private String mMiwokTranslation;

    // Image resource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mDefaultTranslation, String miwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
    }

    public Word(String mDefaultTranslation, String miwokTranslation, int mImageResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = mImageResourceId;
    }

    /**
     * Get the default translation of the word
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the related image of the word
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns true or false if there is an image for the word
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
