package com.frog.engine.network.download.FrogDownloadCallBack;
import java.lang.String;

public interface abstract FrogDownloadCallBack	// class@001549
{

    void onFail(String p0);
    void onProcessUpdate(int p0,long p1,long p2);
    void onResult(int p0);
}
