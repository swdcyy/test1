package com.kwai.video.ksmemorykit.EditorEnhanceTask$EventListener;
import com.kwai.kve.ErrorInfo;
import com.kwai.video.ksmemorykit.EditorEnhanceResult;

public interface abstract EditorEnhanceTask$EventListener	// class@0008e7
{

    void onCancel();
    void onError(ErrorInfo p0);
    void onFinish(EditorEnhanceResult p0);
}
