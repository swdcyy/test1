package com.kwai.video.ksuploaderkit.KSUploaderKitEventListener;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import java.lang.String;
import com.ks.ksuploader.KSUploaderCloseReason;
import com.kwai.video.ksuploaderkit.UploadResponse;

public interface abstract KSUploaderKitEventListener	// class@000978
{

    void onComplete(KSUploaderKitCommon$Status p0,int p1,String p2);
    void onProgress(double p0);
    void onStateChanged(KSUploaderKitCommon$Status p0);
    void onUploadFinished(KSUploaderCloseReason p0,UploadResponse p1);
}
