package com.kwai.video.cache.CacheSessionListener;
import java.lang.String;

public interface abstract CacheSessionListener	// class@0019f6
{

    void onDownloadPaused();
    void onDownloadProgress(long p0,long p1);
    void onDownloadResumed();
    void onDownloadStarted(long p0,String p1,String p2,String p3,int p4,long p5);
    void onDownloadStopped(int p0,long p1,long p2,String p3,int p4,String p5,String p6,String p7,String p8);
    void onSessionClosed(int p0,long p1,long p2,long p3,String p4,boolean p5);
    void onSessionStart(String p0,long p1,long p2,long p3);
}
