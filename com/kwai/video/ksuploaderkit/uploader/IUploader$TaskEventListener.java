package com.kwai.video.ksuploaderkit.uploader.IUploader$TaskEventListener;
import java.lang.String;
import com.kwai.video.ksuploaderkit.uploader.IUploader$UploadStatus;
import com.ks.ksuploader.KSUploaderCloseReason;

public interface abstract IUploader$TaskEventListener	// class@0009d0
{

    void onProgress(String p0,double p1);
    void onStateChanged(String p0,IUploader$UploadStatus p1);
    void onUploadFinished(String p0,KSUploaderCloseReason p1,long p2,String p3,String p4);
}
