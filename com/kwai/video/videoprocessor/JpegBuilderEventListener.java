package com.kwai.video.videoprocessor.JpegBuilderEventListener;
import com.kwai.video.videoprocessor.JpegBuilderException;

public interface abstract JpegBuilderEventListener	// class@000c90
{

    void onCancelled();
    void onError(JpegBuilderException p0);
    void onFinished();
    void onProgress(double p0);
}
