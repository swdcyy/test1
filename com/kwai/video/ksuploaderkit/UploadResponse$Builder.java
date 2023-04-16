package com.kwai.video.ksuploaderkit.UploadResponse$Builder;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.UploadResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksuploaderkit.UploadResponse$1;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;

public class UploadResponse$Builder	// class@000985
{
    public String coverPath;
    public String coverToken;
    public KSUploaderKitCommon$MediaType fileMediaType;
    public String filePath;
    public String fileToken;
    public String response;
    public long status;
    public String taskId;

    public void UploadResponse$Builder(){
       super();
    }
    public UploadResponse build(){
       Object obj = PatchProxy.apply(null, this, UploadResponse$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new UploadResponse(this, null);
    }
    public UploadResponse$Builder coverPath(String p0){
       this.coverPath = p0;
       return this;
    }
    public UploadResponse$Builder coverToken(String p0){
       this.coverToken = p0;
       return this;
    }
    public UploadResponse$Builder fileMediaType(KSUploaderKitCommon$MediaType p0){
       this.fileMediaType = p0;
       return this;
    }
    public UploadResponse$Builder filePath(String p0){
       this.filePath = p0;
       return this;
    }
    public UploadResponse$Builder fileToken(String p0){
       this.fileToken = p0;
       return this;
    }
    public UploadResponse$Builder response(String p0){
       this.response = p0;
       return this;
    }
    public UploadResponse$Builder status(long p0){
       this.status = p0;
       return this;
    }
    public UploadResponse$Builder taskId(String p0){
       this.taskId = p0;
       return this;
    }
}
