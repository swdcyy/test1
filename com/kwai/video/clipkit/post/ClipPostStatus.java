package com.kwai.video.clipkit.post.ClipPostStatus;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuffer;

public class ClipPostStatus	// class@001aee
{
    public int coverUploadStatusWithoutPreUpload;
    public int encodeStatus;
    public int uploadStatus;
    public int watermarkStatus;

    public void ClipPostStatus(){
       super();
       this.encodeStatus = 1;
       this.uploadStatus = 1;
       this.watermarkStatus = 1;
       this.coverUploadStatusWithoutPreUpload = 1;
    }
    public static String getEncodeStatusString(int p0){
       if (p0 == 1) {
          return "idle";
       }
       if (p0 == 2) {
          return "encoding";
       }
       if (p0 == 3) {
          return "success";
       }
       if (p0 != 4) {
          return "unKnown";
       }
       return "failed";
    }
    public static String getUploadStatusString(int p0){
       if (p0 == 1) {
          return "idle";
       }
       if (p0 == 2) {
          return "uploading";
       }
       if (p0 == 3) {
          return "success";
       }
       if (p0 != 4) {
          return "unKnown";
       }
       return "failed";
    }
    public Object clone(){
       ClipPostStatus obj = PatchProxy.apply(null, this, ClipPostStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClipPostStatus();
       obj.encodeStatus = this.encodeStatus;
       obj.uploadStatus = this.uploadStatus;
       obj.watermarkStatus = this.watermarkStatus;
       obj.coverUploadStatusWithoutPreUpload = this.coverUploadStatusWithoutPreUpload;
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ClipPostStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "encodeStatus:"+ClipPostStatus.getEncodeStatusString(this.encodeStatus)+",uploadStatus:"+ClipPostStatus.getUploadStatusString(this.uploadStatus)+",saveWaterStatus:"+ClipPostStatus.getEncodeStatusString(this.watermarkStatus)+",coverUploadStatusWithoutPreUpload:"+ClipPostStatus.getUploadStatusString(this.coverUploadStatusWithoutPreUpload);
    }
}
