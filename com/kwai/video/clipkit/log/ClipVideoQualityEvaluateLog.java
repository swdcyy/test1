package com.kwai.video.clipkit.log.ClipVideoQualityEvaluateLog;
import com.kwai.video.clipkit.log.ClipEditBaseLog;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.lang.Double;
import com.kwai.video.editorsdk2.videoevaluate.VideoQualityEvaluateTaskStats;
import java.lang.Integer;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import org.json.JSONObject;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.clipkit.log.ClipEditLogger;
import java.lang.Throwable;
import com.kwai.video.clipkit.KSClipLog;

public class ClipVideoQualityEvaluateLog extends ClipEditBaseLog	// class@001a94
{
    public String business;
    public EditorSdk2$EditorSdkError editorError;
    public int errorCode;
    public String errorMsg;
    public int errorType;
    public EditorSdk2$VideoEvaluateTaskOptions mOptions;
    public EditorSdk2V2$VideoEditorProject mProject;
    public VideoQualityEvaluateTaskStats mStats;
    public long mUploadEndTime;
    public long mUploadStartTime;
    public int videoType;

    public void ClipVideoQualityEvaluateLog(){
       super();
       this.errorType = 0;
    }
    public final Map extraQos(){
       HashMap obj = PatchProxy.apply(null, this, ClipVideoQualityEvaluateLog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       double d = (double)(this.mUploadEndTime - this.mUploadStartTime) / 0x408f400000000000;
       obj.put("upload_cost", Double.valueOf(d));
       ClipVideoQualityEvaluateLog tmStats = this.mStats;
       if (tmStats != null) {
          obj.put("total_cost", Double.valueOf((d + tmStats.getTranscodeCost())));
       }
       return obj;
    }
    public void setVideoEvaluateTaskStats(VideoQualityEvaluateTaskStats p0){
       this.mStats = p0;
    }
    public final Map status(){
       HashMap obj = PatchProxy.apply(null, this, ClipVideoQualityEvaluateLog.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("video_type", Integer.valueOf(this.videoType));
       obj.put("business", this.business);
       ClipVideoQualityEvaluateLog terrorType = this.errorType;
       if (terrorType != null) {
          obj.put("error_type", Integer.valueOf(terrorType));
          obj.put("error_code", Integer.valueOf(this.errorCode));
          terrorType = this.editorError;
          if (terrorType != null) {
             obj.put("error_message", terrorType.message());
          }else {
             terrorType = this.errorMsg;
             if (terrorType != null) {
                obj.put("error_message", terrorType);
             }
          }
       }
       return obj;
    }
    public String toJson(){
       String str = "";
       JSONObject obj = PatchProxy.apply(null, this, ClipVideoQualityEvaluateLog.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (this.mStats == null) {
             return str;
          }
          obj = new JSONObject();
          ClipVideoQualityEvaluateLog tmProject = this.mProject;
          if (tmProject != null) {
             ClipEditLogger.addProjectJsonObject(obj, tmProject);
          }
          this.mStats.insertExtraKeyValue(this.extraQos());
          obj.put("status", new JSONObject(this.status()));
          obj.put("qos", new JSONObject(this.mStats.serializeToMap()));
          return obj.toString();
       }catch(java.lang.Exception e1){
          KSClipLog.e("ClipVideoQualityEvaluateLog", "to Json Error", e1);
          return str;
       }
    }
}
