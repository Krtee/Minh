package com.example.homeactivity;

import android.graphics.Bitmap;

import java.io.File;

public interface ImageCaptureCallback {
    void onImageCaptured(Bitmap image);
}