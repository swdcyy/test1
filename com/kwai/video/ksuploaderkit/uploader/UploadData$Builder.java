package com.kwai.video.ksuploaderkit.uploader.UploadData$Builder;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.uploader.UploadData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksuploaderkit.uploader.UploadData$1;
import com.ks.ksuploader.KSEncryptConfig;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;

public class UploadData$Builder	// class@0009d7
{
    public KSEncryptConfig coverEncryptConfig;
    public long duration;
    public boolean enableResume;
    public KSEncryptConfig encryptConfig;
    public String filePath;
    public String innerTaskId;
    public KSUploaderKitCommon$MediaType mediaType;
    public String taskId;
    public KSUploaderKitCommon$UploadMode uploadMode;

    public void UploadData$Builder(KSUploaderKitCommon$UploadMode p0,String p1){
       super();
       this.uploadMode = p0;
       this.filePath = p1;
    }
    public UploadData build(){
       Object obj = PatchProxy.apply(null, this, UploadData$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new UploadData(this, null);
    }
    public UploadData$Builder setCoverEncryptConfig(KSEncryptConfig p0){
       this.coverEncryptConfig = p0;
       return this;
    }
    public UploadData$Builder setDuration(long p0){
       this.duration = p0;
       return this;
    }
    public UploadData$Builder setEnableResume(boolean p0){
       this.enableResume = p0;
       return this;
    }
    public UploadData$Builder setEncryptConfig(KSEncryptConfig p0){
       this.encryptConfig = p0;
       return this;
    }
    public UploadData$Builder setInnerTaskId(String p0){
       this.innerTaskId = p0;
       return this;
    }
    public UploadData$Builder setMediaType(KSUploaderKitCommon$MediaType p0){
       this.mediaType = p0;
       return this;
    }
    public UploadData$Builder setTaskId(String p0){
       this.taskId = p0;
       return this;
    }
}
