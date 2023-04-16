package com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskListener;
import com.kwai.video.clipkit.ClipExportException;

public interface abstract ClipVideoQualityEvaluateTaskListener	// class@001b04
{

    void onCancel();
    void onError(ClipExportException p0);
    void onProgress(double p0);
    void onSuccess();
}
