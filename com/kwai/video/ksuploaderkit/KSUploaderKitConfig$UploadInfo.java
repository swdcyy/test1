package com.kwai.video.ksuploaderkit.KSUploaderKitConfig$UploadInfo;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.System;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import com.kwai.video.ksuploaderkit.uploader.UploadData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksuploaderkit.uploader.UploadData$Builder;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;
import com.ks.ksuploader.KSEncryptConfig;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class KSUploaderKitConfig$UploadInfo	// class@000974
{
    public KSEncryptConfig coverEncryptConfig;
    public String coverPath;
    public String coverToken;
    public long durationMS;
    public KSEncryptConfig fileEncryptConfig;
    public String fileMetaData;
    public String filePath;
    public String fileToken;
    public boolean forceDisableResume;
    public String innerTaskId;
    public KSUploaderKitCommon$MediaType mediaType;
    public String serverSignature;
    public String taskID;
    public KSUploaderKitCommon$UploadMode uploadMode;
    public static AtomicLong sInnerIdFactory;

    static {
       KSUploaderKitConfig$UploadInfo.sInnerIdFactory = new AtomicLong(System.currentTimeMillis());
    }
    public void KSUploaderKitConfig$UploadInfo(){
       super();
       this.innerTaskId = String.valueOf(KSUploaderKitConfig$UploadInfo.sInnerIdFactory.getAndIncrement());
       this.mediaType = KSUploaderKitCommon$MediaType.File;
       this.forceDisableResume = false;
    }
    public UploadData convertUploadData(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig$UploadInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new UploadData$Builder(this.uploadMode, this.filePath).setInnerTaskId(this.innerTaskId).setMediaType(this.mediaType).setTaskId(this.taskID).setEnableResume(this.enableResume()).setDuration(this.durationMS).setEncryptConfig(this.fileEncryptConfig).setCoverEncryptConfig(this.coverEncryptConfig).build();
    }
    public boolean enableResume(){
       Object obj = PatchProxy.apply(null, this, KSUploaderKitConfig$UploadInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.forceDisableResume != null) {
          return false;
       }
       return (TextUtils.isEmpty(this.taskID) ^ 0x01);
    }
    public String getCoverPath(){
       return this.coverPath;
    }
    public String getCoverToken(){
       return this.coverToken;
    }
    public long getDurationMS(){
       return this.durationMS;
    }
    public KSEncryptConfig getEncryptConfig(){
       return this.fileEncryptConfig;
    }
    public String getFileMetaData(){
       return this.fileMetaData;
    }
    public String getFilePath(){
       return this.filePath;
    }
    public String getFileToken(){
       return this.fileToken;
    }
    public String getInnerTaskId(){
       return this.innerTaskId;
    }
    public KSUploaderKitCommon$MediaType getMediaType(){
       return this.mediaType;
    }
    public String getServerSignature(){
       return this.serverSignature;
    }
    public String getTaskID(){
       return this.taskID;
    }
    public KSUploaderKitCommon$UploadMode getUploadMode(){
       return this.uploadMode;
    }
    public boolean needEncryption(){
       KSUploaderKitConfig$UploadInfo tfileEncrypt = this.fileEncryptConfig;
       if (tfileEncrypt != null && tfileEncrypt.cipher != null) {
          return true;
       }
       return false;
    }
}
