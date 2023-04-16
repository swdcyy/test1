package com.kwai.video.ksspark.NewSparkDownloadListener;
import java.lang.String;

public interface abstract NewSparkDownloadListener	// class@000926
{

    void onCancel();
    void onFail(int p0,String p1);
    void onProgress(float p0);
    void onStart(String p0);
    void onSuccess(String p0);
}
