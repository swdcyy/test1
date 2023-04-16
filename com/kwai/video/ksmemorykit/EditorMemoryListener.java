package com.kwai.video.ksmemorykit.EditorMemoryListener;
import com.kwai.video.ksmemorykit.EditorMemoryTask;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.kwai.video.ksmemorykit.EditorMemoryResult;

public interface abstract EditorMemoryListener	// class@0008eb
{

    void onCancelled(EditorMemoryTask p0);
    void onError(EditorMemoryTask p0,EditorSdk2$EditorSdkError p1);
    void onFinish(EditorMemoryTask p0,EditorMemoryResult p1);
    void onProgress(EditorMemoryTask p0,double p1);
}
