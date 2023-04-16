package com.kwai.video.ksuploaderkit.uploader.IUploader$EventListener;
import com.ks.ksuploader.KSUploaderCloseReason;
import java.lang.String;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$TokenType;
import com.kwai.video.ksuploaderkit.UploadResponse;
import com.kwai.video.ksuploaderkit.uploader.IUploader$UploadStatus;

public interface abstract IUploader$EventListener	// class@0009cf
{

    void onComplete(KSUploaderCloseReason p0,int p1,long p2,String p3,String p4,long p5,ApiManager$TokenType p6);
    void onFinished(KSUploaderCloseReason p0,UploadResponse p1);
    void onProgress(double p0,int p1);
    void onStateChanged(IUploader$UploadStatus p0);
}
