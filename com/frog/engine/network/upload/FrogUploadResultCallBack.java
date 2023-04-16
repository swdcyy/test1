package com.frog.engine.network.upload.FrogUploadResultCallBack;
import java.lang.String;

public interface abstract FrogUploadResultCallBack	// class@001555
{

    void onFail(String p0);
    void onProcessUpdate(int p0,long p1,long p2);
    void onResult(int p0,String p1);
}
