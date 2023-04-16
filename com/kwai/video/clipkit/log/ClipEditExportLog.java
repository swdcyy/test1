package com.kwai.video.clipkit.log.ClipEditExportLog;
import com.kwai.video.clipkit.log.ClipEditBaseLog;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import com.kwai.video.editorsdk2.ExportTask;
import com.kwai.video.editorsdk2.ExportTaskStatsInfo;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.clipkit.log.ClipEditLogger;
import com.kwai.video.clipkit.config.ClipKitConfigManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.lang.Boolean;
import com.kwai.video.clipkit.ClipKitUtils;
import java.lang.System;
import com.kwai.video.clipkit.ClipExportException;
import java.lang.Exception;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.kwai.video.clipkit.utils.Utils;
import org.json.JSONArray;
import com.kwai.video.clipkit.log.ClipEditExtraInfo;
import java.lang.Throwable;
import com.kwai.video.clipkit.KSClipLog;

public class ClipEditExportLog extends ClipEditBaseLog	// class@001a89
{
    public int audioSegmentCount;
    public JSONObject capeStats;
    public Context context;
    public double coverDuration;
    public EditorSdk2$EditorSdkError editorError;
    public long encodeEndTime;
    public JSONObject encodeQos;
    public long encodeStartTime;
    public ClipExportException exportException;
    public int exportFlag;
    public ClipEditExtraInfo extraInfo;
    public boolean isPipeline;
    public int lastErrorCode;
    public EditorSdk2V2$VideoEditorProject project;
    public long segmentTotalLength;
    public int skipTranscode;
    public int softReason;
    public int transcodeReason;
    public int videoSegmentCount;
    public int videoType;

    public void ClipEditExportLog(){
       super();
       this.skipTranscode = 1;
       this.exportFlag = 0;
       this.coverDuration = 0;
       this.encodeStartTime = 0;
       this.encodeEndTime = 0;
       this.lastErrorCode = 0;
       this.softReason = 0;
    }
    public void setCapeStats(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipEditExportLog.class, "4")) {
          return;
       }
       if (p0 != null) {
          this.capeStats = new JSONObject(p0);
       }
       return;
    }
    public void setEncodeQos(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipEditExportLog.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.encodeQos = new JSONObject(p0.getExportTaskStats().serializeToMap());
       }
       return;
    }
    public void setEncodeQos(ExportTaskStatsInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipEditExportLog.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.encodeQos = new JSONObject(p0.serializeToMap());
       }
       return;
    }
    public void setEncodeQos(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipEditExportLog.class, "3")) {
          return;
       }
       if (p0 != null) {
          this.encodeQos = new JSONObject(p0);
       }
       return;
    }
    public String toJson(){
       int i;
       String str = "status";
       JSONObject obj = PatchProxy.apply(null, this, ClipEditExportLog.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          ClipEditExportLog tproject = this.project;
          if (tproject != null) {
             ClipEditLogger.addProjectJsonObject(obj, tproject);
          }
          JSONObject jSONObject = new JSONObject();
          if (this.context != null) {
             jSONObject.put("lowDevice", ClipKitConfigManager.getInstance().isLowDevice(this.context));
          }
          this.toJsonBase(obj);
          obj.put(str, jSONObject);
          ClipEditExportLog tcontext = this.context;
          if (tcontext != null) {
             Intent intent = UniversalReceiver.e(tcontext, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
             if (intent != null) {
                i = -1;
                jSONObject.put("battery_level", ((intent.getIntExtra("level", i) * 100) / intent.getIntExtra("scale", i)));
                boolean intExtra = intent.getIntExtra(str, i);
                intExtra = (intExtra == 2 || intExtra == 5)? true: false;
                jSONObject.put("is_charging", Boolean.valueOf(intExtra));
             }
          }
          tcontext = this.encodeEndTime;
          i = 0;
          if (tcontext - i > 0) {
             ClipEditExportLog tencodeStart = this.encodeStartTime;
             if (tencodeStart - i > 0) {
                jSONObject.put("encodeCostTime", (tcontext - tencodeStart));
             }
          }
          jSONObject.put("skipTranscode", ClipKitUtils.getLogSkipTransCode(this.skipTranscode));
          jSONObject.put("transcodeReason", this.transcodeReason);
          jSONObject.put("exportFlag", this.exportFlag);
          jSONObject.put("videoType", this.videoType);
          jSONObject.put("clientTimeStamp", System.currentTimeMillis());
          if (this.isPipeline != null) {
             jSONObject.put("videoSegmentCount", this.videoSegmentCount);
             jSONObject.put("audioSegmentCount", this.audioSegmentCount);
             jSONObject.put("segmentTotalLength", this.segmentTotalLength);
          }
          tcontext = this.coverDuration;
          if (tcontext - null) {
             jSONObject.put("coverDuration", tcontext);
          }
          ClipEditExportLog texportExcep = this.exportException;
          String str1 = "errorMsg";
          if (texportExcep != null) {
             jSONObject.put("errorCode", texportExcep.errorCode);
             jSONObject.put("errorType", this.exportException.errorType);
             jSONObject.put(str1, this.exportException.getMessage());
          }else {
             texportExcep = this.editorError;
             if (texportExcep != null) {
                jSONObject.put("errorCode", texportExcep.code());
                jSONObject.put("errorType", this.editorError.type());
                jSONObject.put(str1, this.editorError.message());
             }
          }
          texportExcep = this.lastErrorCode;
          if (texportExcep != null) {
             jSONObject.put("lastErrorCode", texportExcep);
          }
          texportExcep = this.softReason;
          if (texportExcep > null) {
             jSONObject.put("softReason", texportExcep);
          }
          jSONObject.put("isPipeline", this.isPipeline);
          jSONObject.put("totalDiskSpace", Utils.getRomTotalSpace());
          jSONObject.put("freeDiskSpace", Utils.getRomAvailableSpace());
          texportExcep = this.encodeQos;
          if (texportExcep != null) {
             obj.put("qos", texportExcep);
          }
          texportExcep = this.capeStats;
          if (texportExcep != null) {
             obj.put("cape", texportExcep);
          }
          texportExcep = this.extraInfo;
          if (texportExcep != null) {
             texportExcep.assetInfoArray = ClipEditExtraInfo.addTemplateJsonObject(this.project);
             obj.put("extraInfo", this.extraInfo.toJsonObject());
          }
          return obj.toString();
       }catch(java.lang.Exception e0){
          KSClipLog.e("ClipEditExportLog", "to Json Error", e0);
          return null;
       }
    }
}
