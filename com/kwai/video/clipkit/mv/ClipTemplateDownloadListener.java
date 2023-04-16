package com.kwai.video.clipkit.mv.ClipTemplateDownloadListener;
import java.lang.String;

public interface abstract ClipTemplateDownloadListener	// class@001ab6
{

    void onCancel();
    void onFail(int p0,String p1);
    void onProgress(float p0);
    void onStart(String p0);
    void onSuccess(String p0);
}
