package com.kwai.video.editorsdk2.Mp4RemuxerEventListener;
import com.kwai.video.editorsdk2.Mp4RemuxerException;

public interface abstract Mp4RemuxerEventListener	// class@001c70
{

    void onCancelled();
    void onError(Mp4RemuxerException p0);
    void onFinished();
    void onProgress(double p0);
}
