package com.example.android.miwok;

public class Word {

    // Constant value that represents no image was provided for this word
    private static final int NO_IMAGE_PROVIDED = -1;
    // Default translation for the word
    private String mDefaultTranslation;
    // Miwok translation for the word
    private String mMiwokTranslation;
    // Image resource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    // Audio resource ID for the word
    private int mAudioResourceId;

    public Word(String mDefaultTranslation, String miwokTranslation, int mAudioResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioResourceId = mAudioResourceId;
    }

    public Word(String mDefaultTranslation, String miwokTranslation, int mImageResourceId, int mAudioResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mAudioResourceId = mAudioResourceId;
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
     * Get the audio resource ID of the word
     */
    public int getAudioResourceId(){
        return mAudioResourceId;
    }

    /**
     * Returns true or false if there is an image for the word
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
