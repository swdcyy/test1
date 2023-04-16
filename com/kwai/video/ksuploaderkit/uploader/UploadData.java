package com.kwai.video.ksuploaderkit.uploader.UploadData;
import com.kwai.video.ksuploaderkit.uploader.UploadData$Builder;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.uploader.UploadData$ExtInfo;
import java.lang.String;
import com.kwai.video.ksuploaderkit.uploader.UploadData$1;
import com.ks.ksuploader.KSEncryptConfig;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;

public class UploadData	// class@0009d9
{
    public KSEncryptConfig mCoverEncryptConfig;
    public long mDuration;
    public boolean mEnableResume;
    public KSEncryptConfig mEncryptConfig;
    public UploadData$ExtInfo mExtInfo;
    public String mFilePath;
    public String mInnerTaskId;
    public KSUploaderKitCommon$MediaType mMediaType;
    public String mTaskId;
    public KSUploaderKitCommon$UploadMode mUploadMode;

    public void UploadData(UploadData$Builder p0){
       super();
       this.mTaskId = p0.taskId;
       this.mUploadMode = p0.uploadMode;
       UploadData$Builder filePath = p0.filePath;
       this.mFilePath = filePath;
       this.mEnableResume = p0.enableResume;
       this.mDuration = p0.duration;
       this.mInnerTaskId = p0.innerTaskId;
       this.mExtInfo = new UploadData$ExtInfo(filePath, null);
       this.mMediaType = p0.mediaType;
       this.mEncryptConfig = p0.encryptConfig;
       this.mCoverEncryptConfig = p0.coverEncryptConfig;
    }
    public void UploadData(UploadData$Builder p0,UploadData$1 p1){
       super(p0);
    }
    public KSEncryptConfig coverEncryptConfig(){
       return this.mCoverEncryptConfig;
    }
    public long duration(){
       return this.mDuration;
    }
    public boolean enableResume(){
       return this.mEnableResume;
    }
    public KSEncryptConfig encryptConfig(){
       return this.mEncryptConfig;
    }
    public UploadData$ExtInfo extInfo(){
       return this.mExtInfo;
    }
    public String filePath(){
       return this.mFilePath;
    }
    public String innerTaskId(){
       return this.mInnerTaskId;
    }
    public KSUploaderKitCommon$MediaType mediaType(){
       return this.mMediaType;
    }
    public String taskId(){
       return this.mTaskId;
    }
    public KSUploaderKitCommon$UploadMode uploadMode(){
       return this.mUploadMode;
    }
}
