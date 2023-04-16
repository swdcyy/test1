package com.kwai.video.clipkit.post.ClipPostInfo;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.clipkit.post.ClipPostInfo$ClipUploadInfo;
import com.kwai.video.clipkit.post.ClipPostInfo$ClipEncodeInfo;
import com.kwai.video.clipkit.post.ClipPostInfo$ClipWatermarkParam;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.clipkit.post.ClipPostInfo$1;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.clipkit.ClipKitUtils;
import java.lang.Boolean;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$SceneType;
import com.kwai.video.editorsdk2.ExternalFilterRequestListenerV2;
import org.json.JSONObject;
import java.lang.Integer;
import com.kwai.video.clipkit.log.ClipEditLogger;

public class ClipPostInfo	// class@001ae1
{
    public ClipPostInfo$ClipUploadInfo coverUploadInfoWithoutPreUpload;
    public EditorEncodeConfigModule editorEncodeConfigModule;
    public ClipPostInfo$ClipEncodeInfo encodeInfo;
    public String exportPath;
    public String id;
    public int postBusiness;
    public int postFlag;
    public KSUploaderKitCommon$SceneType sceneType;
    public ClipPostInfo$ClipUploadInfo uploadInfo;
    public ClipPostInfo$ClipWatermarkParam watermarkParam;
    public boolean willAddWatermark;
    public static final int FLAG_EXPORT_OPTIONS_USE_MIX = 2;

    public void ClipPostInfo(){
       super();
       this.willAddWatermark = false;
    }
    public void ClipPostInfo(String p0,int p1,String p2,ClipPostInfo$ClipUploadInfo p3){
       super(p0, p2, p3);
       p0.videoType = p1;
    }
    public void ClipPostInfo(String p0,String p1,ClipPostInfo$ClipEncodeInfo p2,ClipPostInfo$ClipUploadInfo p3,ClipPostInfo$ClipWatermarkParam p4){
       super();
       this.willAddWatermark = false;
       this.id = p0;
       this.exportPath = p1;
       this.encodeInfo = p2;
       int i = 1;
       this.postFlag = i;
       if (p3 != null) {
          this.postFlag = i | 0x02;
          if (p3.enableUpload != null) {
             this.uploadInfo = p3;
          }
       }
       this.watermarkParam = p4;
       if (p4 != null) {
          this.postFlag = this.postFlag | 0x04;
       }
       KSClipLog.v("ClipPostInfo", "sessionId:"+p0+",videoType:"+p2.videoType+",remuxFlag:"+p2.remuxFlag+",postFlag:"+this.postFlag);
       return;
    }
    public void ClipPostInfo(String p0,String p1,ClipPostInfo$ClipUploadInfo p2){
       super();
       this.willAddWatermark = false;
       this.id = p0;
       this.exportPath = p1;
       this.encodeInfo = new ClipPostInfo$ClipEncodeInfo(null);
       this.uploadInfo = p2;
       this.postFlag = this.postFlag | 0x02;
    }
    public void ClipPostInfo(String p0,String p1,ClipPostInfo$ClipWatermarkParam p2){
       super();
       this.willAddWatermark = false;
       this.id = p0;
       this.exportPath = p1;
       this.watermarkParam = p2;
       p2.ignoreFailStatus = false;
       this.postFlag = this.postFlag | 0x04;
    }
    public void ClipPostInfo(String p0,String p1,EditorSdk2V2$VideoEditorProject p2,EditorSdk2$ExportOptions p3,int p4,ClipPostInfo$ClipUploadInfo p5,int p6){
       super(p0, p1, p2, p3, p4, p5, p6, null);
    }
    public void ClipPostInfo(String p0,String p1,EditorSdk2V2$VideoEditorProject p2,EditorSdk2$ExportOptions p3,int p4,ClipPostInfo$ClipUploadInfo p5,int p6,ClipPostInfo$ClipWatermarkParam p7){
       super(p0, p1, new ClipPostInfo$ClipEncodeInfo(p2, p3, p4, p6), p5, p7);
    }
    public static ClipPostInfo buildPostInfoFromImagePath(String[] p0,String p1,ClipPostInfo$ClipUploadInfo p2){
       ClipPostInfo obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ClipPostInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClipPostInfo();
       obj.id = ClipKitUtils.createSessionId();
       obj.encodeInfo = new ClipPostInfo$ClipEncodeInfo(p0);
       obj.exportPath = p1;
       int i = 1;
       obj.postFlag = i;
       if (p2 != null) {
          obj.postFlag = i | 0x02;
       }
       return obj;
    }
    public static ClipPostInfo buildPostInfoFromVideoPath(String p0,String p1,ClipPostInfo$ClipUploadInfo p2){
       ClipPostInfo obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ClipPostInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClipPostInfo();
       obj.id = ClipKitUtils.createSessionId();
       obj.encodeInfo = new ClipPostInfo$ClipEncodeInfo(p0);
       obj.exportPath = p1;
       obj.uploadInfo = p2;
       int i = 1;
       obj.postFlag = i;
       if (p2 != null) {
          obj.postFlag = i | 0x02;
       }
       return obj;
    }
    public static boolean isNeedEncode(int p0){
       int i = 1;
       if (p0 & i) {
       }else {
          i = false;
       }
       return i;
    }
    public static boolean isNeedUpload(int p0){
       boolean b = (p0 & 0x02)? true: false;
       return b;
    }
    public static boolean isNeedUploadCoverAfterPublish(int p0){
       boolean b = (p0 & 0x08)? true: false;
       return b;
    }
    public static boolean isNeedWatermark(int p0){
       boolean b = (p0 & 0x04)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipPostInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof ClipPostInfo) {
          return (this.id).equals(p0.id);
       }
       return false;
    }
    public String getId(){
       return this.id;
    }
    public KSUploaderKitCommon$SceneType getSceneTypeByVideoType(){
       ClipPostInfo tencodeInfo = this.encodeInfo;
       if (tencodeInfo != null) {
          ClipPostInfo$ClipEncodeInfo videoType = tencodeInfo.videoType;
          if (videoType != null) {
             if (videoType != 12) {
                if (videoType == 13) {
                   return KSUploaderKitCommon$SceneType.SaySthVideo;
                }
             }else {
                return KSUploaderKitCommon$SceneType.PersonalBagVideo;
             }
          }
       }
       return this.sceneType;
    }
    public void setExternalFilterRequestListenerV2(ExternalFilterRequestListenerV2 p0){
       this.encodeInfo.externalFilterRequestListenerV2 = p0;
    }
    public void setForceCloseCape(boolean p0){
       ClipPostInfo uClipPostInf = ClipPostInfo.class;
       if (PatchProxy.isSupport(uClipPostInf) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uClipPostInf, "3")) {
          return;
       }
       KSClipLog.i("ClipPostInfo", "setForceCloseCape "+p0);
       uClipPostInf = this.encodeInfo;
       if (uClipPostInf == null) {
          KSClipLog.e("ClipPostInfo", "setForceCloseCape fail encodeInfo is null");
          return;
       }else {
          uClipPostInf.forceCloseCape = p0;
          return;
       }
    }
    public JSONObject toJsonObject(){
       JSONObject obj = PatchProxy.apply(null, this, ClipPostInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONObject();
       obj.putOpt("sessionId", this.id);
       obj.putOpt("postFlag", Integer.valueOf((this.postFlag & 0xfb)));
       ClipPostInfo tencodeInfo = this.encodeInfo;
       if (tencodeInfo != null) {
          ClipEditLogger.addProjectJsonObject(obj, tencodeInfo.project);
          obj.putOpt("comment", this.encodeInfo.comment);
          obj.putOpt("videoType", Integer.valueOf(this.encodeInfo.videoType));
          obj.putOpt("forceCloseCape", Boolean.valueOf(this.encodeInfo.forceCloseCape));
          if (this.encodeInfo.exportOptions != null) {
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("width", this.encodeInfo.exportOptions.width());
             jSONObject.put("height", this.encodeInfo.exportOptions.height());
             obj.put("exportOptions", jSONObject);
          }
          if (this.postBusiness == 1) {
             obj.putOpt("postBusiness", "kuaiyingUpload");
          }
       }
       obj.putOpt("exportPath", this.exportPath);
       tencodeInfo = this.uploadInfo;
       if (tencodeInfo != null) {
          obj.putOpt("coverPath", tencodeInfo.coverPath);
          obj.putOpt("uploadType", Integer.valueOf(this.uploadInfo.uploadType));
       }
       return obj;
    }
}
