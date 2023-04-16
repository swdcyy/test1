package com.kwai.video.ksuploaderkit.uploader.HttpUploadAgentListener;
import java.lang.String;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;

public interface abstract HttpUploadAgentListener	// class@0009ca
{

    void onComplete(String p0,KSUploaderKitCommon$Status p1,int p2,String p3,String p4,String p5,long p6,HttpRequestInfo p7);
    void onProgress(String p0,double p1,int p2);
}
