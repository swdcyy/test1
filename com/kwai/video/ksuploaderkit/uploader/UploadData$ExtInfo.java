package com.kwai.video.ksuploaderkit.uploader.UploadData$ExtInfo;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.uploader.UploadData$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.ksuploaderkit.utils.FileUtils;
import com.kwai.video.ksuploaderkit.uploader.IUploader$UploadStatus;

public class UploadData$ExtInfo	// class@0009d8
{
    public String mFilePath;
    public long mFileSize;
    public double mPercent;
    public long mStartTime;
    public IUploader$UploadStatus mUploadStatus;

    public void UploadData$ExtInfo(String p0){
       super();
       this.mFilePath = p0;
    }
    public void UploadData$ExtInfo(String p0,UploadData$1 p1){
       super(p0);
    }
    public long fileSize(){
       Object obj = PatchProxy.apply(null, this, UploadData$ExtInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long fileSize = FileUtils.getFileSize(this.mFilePath);
       this.mFileSize = fileSize;
       return fileSize;
    }
    public double percent(){
       return this.mPercent;
    }
    public long startTime(){
       return this.mStartTime;
    }
    public void updatePercent(double p0){
       this.mPercent = p0;
    }
    public void updateStartTime(long p0){
       this.mStartTime = p0;
    }
    public void updateUploadStatus(IUploader$UploadStatus p0){
       this.mUploadStatus = p0;
    }
    public IUploader$UploadStatus uploadStatus(){
       return this.mUploadStatus;
    }
}
