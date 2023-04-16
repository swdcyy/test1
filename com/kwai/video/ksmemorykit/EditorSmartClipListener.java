package com.kwai.video.ksmemorykit.EditorSmartClipListener;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.kwai.video.ksmemorykit.EditorSmartClipResult;
import com.kwai.kve.MediaAsset;
import android.graphics.Bitmap;

public interface abstract EditorSmartClipListener	// class@0008f4
{

    void onCancel();
    void onError(EditorSdk2$EditorSdkError p0);
    void onFinish(EditorSmartClipResult p0);
    void onFlashImage(MediaAsset p0,Bitmap p1,int p2);
    void onFrameResult(Bitmap p0);
    void onProgress(double p0);
}
