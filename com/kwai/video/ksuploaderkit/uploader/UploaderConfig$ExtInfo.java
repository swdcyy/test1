package com.kwai.video.ksuploaderkit.uploader.UploaderConfig$ExtInfo;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.uploader.IUploader$UploadStatus;

public class UploaderConfig$ExtInfo	// class@0009da
{
    public AtomicInteger completeTaskTicker;
    public AtomicInteger cursor;
    public IUploader$UploadStatus status;
    public double totalPercent;

    public void UploaderConfig$ExtInfo(){
       super();
       this.cursor = new AtomicInteger(0);
       this.completeTaskTicker = new AtomicInteger(0);
       this.init();
    }
    public void init(){
       if (PatchProxy.applyVoid(null, this, UploaderConfig$ExtInfo.class, "1")) {
          return;
       }
       this.totalPercent = 0;
       this.status = IUploader$UploadStatus.Init;
       this.cursor.set(0);
       this.completeTaskTicker.set(0);
       return;
    }
}
