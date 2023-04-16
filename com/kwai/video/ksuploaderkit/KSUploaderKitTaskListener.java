package com.kwai.video.ksuploaderkit.KSUploaderKitTaskListener;
import java.lang.String;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import com.ks.ksuploader.KSUploaderCloseReason;

public interface abstract KSUploaderKitTaskListener	// class@000982
{

    void onProgress(String p0,double p1);
    void onStateChanged(String p0,KSUploaderKitCommon$Status p1);
    void onUploadFinished(String p0,KSUploaderCloseReason p1,long p2,String p3,String p4);
}
