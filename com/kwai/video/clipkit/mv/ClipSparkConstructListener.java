package com.kwai.video.clipkit.mv.ClipSparkConstructListener;
import java.lang.String;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;

public interface abstract ClipSparkConstructListener	// class@001ab3
{

    void onCancel();
    void onFail(int p0,String p1);
    void onProgress(float p0);
    void onStart(String p0);
    void onSuccess(EditorSdk2MvCreationResult p0);
}
