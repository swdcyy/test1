package com.kwai.video.clipkit.post.ClipPostInfo$ClipUploadInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksuploaderkit.KSUploaderKitEndPointAgent;
import java.util.List;

public class ClipPostInfo$ClipUploadInfo	// class@001adf
{
    public String authentication;
    public String coverAuthentication;
    public String coverPath;
    public boolean enableUpload;
    public KSUploaderKitEndPointAgent endPointAgent;
    public List endPoints;
    public List extraUploadInfos;
    public List httpEndPoints;
    public String tokenID;
    public int uploadType;

    public void ClipPostInfo$ClipUploadInfo(){
       super();
       this.enableUpload = true;
    }
    public static ClipPostInfo$ClipUploadInfo buildCoverUploadInfo(String p0,String p1){
       ClipPostInfo$ClipUploadInfo obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipPostInfo$ClipUploadInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClipPostInfo$ClipUploadInfo();
       obj.coverAuthentication = p0;
       obj.coverPath = p1;
       obj.uploadType = 2;
       return obj;
    }
    public static ClipPostInfo$ClipUploadInfo buildEmptyUploadInfo(){
       ClipPostInfo$ClipUploadInfo obj = PatchProxy.apply(null, null, ClipPostInfo$ClipUploadInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClipPostInfo$ClipUploadInfo();
       obj.enableUpload = false;
       return obj;
    }
    public static ClipPostInfo$ClipUploadInfo buildEndPointUploadInfo(String p0,KSUploaderKitEndPointAgent p1){
       ClipPostInfo$ClipUploadInfo obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipPostInfo$ClipUploadInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClipPostInfo$ClipUploadInfo();
       obj.uploadType = 3;
       obj.coverPath = p0;
       obj.endPointAgent = p1;
       return obj;
    }
    public static ClipPostInfo$ClipUploadInfo buildMediaCloudUploadInfo(String p0,String p1){
       ClipPostInfo$ClipUploadInfo obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipPostInfo$ClipUploadInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClipPostInfo$ClipUploadInfo();
       obj.uploadType = 1;
       obj.authentication = p0;
       obj.coverPath = p1;
       return obj;
    }
    public static ClipPostInfo$ClipUploadInfo buildServerUploadInfo(String p0,String p1,String p2){
       ClipPostInfo$ClipUploadInfo obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ClipPostInfo$ClipUploadInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClipPostInfo$ClipUploadInfo();
       obj.uploadType = 2;
       obj.authentication = p0;
       obj.coverAuthentication = p1;
       obj.coverPath = p2;
       return obj;
    }
    public static ClipPostInfo$ClipUploadInfo buildServerUploadInfo(String p0,String p1,String p2,List p3,List p4,String p5){
       ClipPostInfo$ClipUploadInfo uClipUploadI = ClipPostInfo$ClipUploadInfo.class;
       if (PatchProxy.isSupport(uClipUploadI)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          Object obj = PatchProxy.apply(objArray, null, uClipUploadI, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ClipPostInfo$ClipUploadInfo uClipUploadI1 = ClipPostInfo$ClipUploadInfo.buildServerUploadInfo(p0, p1, p2);
       uClipUploadI1.endPoints = p3;
       uClipUploadI1.httpEndPoints = p4;
       uClipUploadI1.tokenID = p5;
       return uClipUploadI1;
    }
    public KSUploaderKitEndPointAgent getEndPointAgent(){
       return this.endPointAgent;
    }
}
