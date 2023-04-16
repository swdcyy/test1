package com.kwai.video.ksmodelmanager.downloader.ModelDownloadListener;
import java.lang.String;
import java.lang.Throwable;

public interface abstract ModelDownloadListener	// class@00091d
{

    void onCancel(String p0,String p1);
    void onCompleted(String p0,String p1,String p2,boolean p3,int p4,int p5);
    void onFailed(String p0,Throwable p1,String p2);
    void onProgress(String p0,float p1);
}
