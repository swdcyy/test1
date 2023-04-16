package com.kwai.video.ksuploaderkit.UploadResponse;
import com.kwai.video.ksuploaderkit.UploadResponse$Builder;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.UploadResponse$1;
import java.lang.String;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;

public class UploadResponse	// class@000986
{
    public String coverPath;
    public String coverToken;
    public KSUploaderKitCommon$MediaType fileMediaType;
    public String filePath;
    public String fileToken;
    public String response;
    public long status;
    public String taskId;

    public void UploadResponse(UploadResponse$Builder p0){
       super();
       this.status = p0.status;
       this.coverToken = p0.coverToken;
       this.fileToken = p0.fileToken;
       this.taskId = p0.taskId;
       this.coverPath = p0.coverPath;
       this.filePath = p0.filePath;
       this.fileMediaType = p0.fileMediaType;
       this.response = p0.response;
    }
    public void UploadResponse(UploadResponse$Builder p0,UploadResponse$1 p1){
       super(p0);
    }
    public String coverToken(){
       return this.coverToken;
    }
    public KSUploaderKitCommon$MediaType fileMediaType(){
       UploadResponse tfileMediaTy = this.fileMediaType;
       if (tfileMediaTy != null) {
       }else {
          tfileMediaTy = KSUploaderKitCommon$MediaType.File;
       }
       return tfileMediaTy;
    }
    public String filePath(){
       return this.filePath;
    }
    public String fileToken(){
       return this.fileToken;
    }
    public String response(){
       return this.response;
    }
    public long status(){
       return this.status;
    }
    public String taskId(){
       return this.taskId;
    }
}
