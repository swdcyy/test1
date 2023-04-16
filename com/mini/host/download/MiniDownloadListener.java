package com.mini.host.download.MiniDownloadListener;
import com.mini.host.download.MiniDownloadTask;

public interface abstract MiniDownloadListener	// class@001925
{

    void onCancel(MiniDownloadTask p0);
    void onFailure(MiniDownloadTask p0);
    void onProgress(MiniDownloadTask p0);
    void onStart(MiniDownloadTask p0);
    void onSuccess(MiniDownloadTask p0);
}
