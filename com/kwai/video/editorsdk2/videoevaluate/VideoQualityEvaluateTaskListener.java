package com.kwai.video.editorsdk2.videoevaluate.VideoQualityEvaluateTaskListener;
import com.kwai.video.editorsdk2.videoevaluate.VideoQualityEvaluateTaskImpl;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;

public interface abstract VideoQualityEvaluateTaskListener	// class@001d99
{

    void onCancel(VideoQualityEvaluateTaskImpl p0);
    void onError(VideoQualityEvaluateTaskImpl p0,EditorSdk2$EditorSdkError p1);
    void onProgress(double p0);
    void onSuccess(VideoQualityEvaluateTaskImpl p0);
}
