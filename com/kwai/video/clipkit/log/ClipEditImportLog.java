package com.kwai.video.clipkit.log.ClipEditImportLog;
import com.kwai.video.clipkit.log.ClipEditBaseLog;
import android.content.Context;
import java.lang.String;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.clipkit.log.ClipEditExtraInfo;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.editorsdk2.ExportTaskStatsInfo;
import org.json.JSONObject;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.clipkit.log.ClipEditLogger;
import com.kwai.video.clipkit.config.ClipKitConfigManager;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportResult;
import com.google.gson.JsonArray;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.video.clipkit.ClipImportException;
import java.lang.Exception;
import org.json.JSONArray;
import java.lang.Throwable;
import com.kwai.video.clipkit.KSClipLog;

public class ClipEditImportLog extends ClipEditBaseLog	// class@001a8f
{
    public long encodeEndTime;
    public long encodeStartTime;
    public List exportQos;
    public ClipEditExtraInfo extraInfo;
    public ClipImportHandler$ClipImportResult importResult;
    public Context mContext;
    public int mType;
    public EditorSdk2V2$VideoEditorProject project;
    public String sessionId;
    public boolean useHwEncode;

    public void ClipEditImportLog(Context p0,int p1,String p2,EditorSdk2V2$VideoEditorProject p3,ClipEditExtraInfo p4){
       super();
       this.encodeStartTime = 0;
       this.encodeEndTime = 0;
       this.mContext = p0;
       this.mType = p1;
       this.sessionId = p2;
       this.project = p3;
       this.extraInfo = p4;
    }
    public void addExportQos(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipEditImportLog.class, "1")) {
          return;
       }
       if (p0 != null) {
          JSONObject jSONObject = new JSONObject(p0.getExportTaskStats().serializeToMap());
          if (this.exportQos == null) {
             this.exportQos = new ArrayList();
          }
          this.exportQos.add(jSONObject);
       }
       return;
    }
    public String toJson(){
       JSONObject obj = PatchProxy.apply(null, this, ClipEditImportLog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          ClipEditLogger.addProjectJsonObject(obj, this.project);
          JSONObject jSONObject = new JSONObject();
          if (this.mContext != null) {
             jSONObject.put("lowDevice", ClipKitConfigManager.getInstance().isLowDevice(this.mContext));
          }
          this.toJsonBase(obj);
          obj.put("status", jSONObject);
          ClipEditImportLog tencodeEndTi = this.encodeEndTime;
          long l = 0;
          if (tencodeEndTi - l) {
             ClipEditImportLog tencodeStart = this.encodeStartTime;
             if (tencodeStart - l) {
                long l1 = tencodeEndTi - tencodeStart;
                tencodeStart = this.importResult;
                if (tencodeStart == null || tencodeStart.isNeedRebuild()) {
                   l = l1;
                }
                jSONObject.put("timeCost", l);
             }
          }
          tencodeEndTi = this.importResult;
          if (tencodeEndTi != null) {
             if (tencodeEndTi.isNeedRebuild()) {
                jSONObject.put("useHwEncode", this.useHwEncode);
             }
             JsonArray jsonArray = new JsonArray();
             int i = 0;
             boolean i1 = 0;
             ClipImportHandler$ClipImportResult isRebuild = this.importResult.isRebuild;
             while (i1 < isRebuild.length) {
                jsonArray.N(Integer.valueOf(isRebuild[i1]));
                i1 = i1 + 1;
             }
             obj.put("isNeedRebuilds", jsonArray);
             String str = "isAllNotNeedRebuild";
             i1 = (!this.importResult.isNeedRebuild())? true: false;
             obj.put(str, i1);
             if (this.importResult.importExceptions != null) {
                jsonArray = new JsonArray();
                ClipImportHandler$ClipImportResult importExcept = this.importResult.importExceptions;
                while (i < importExcept.length) {
                   if (importExcept[i] == null) {
                      jsonArray.a0("null");
                   }else {
                      JSONObject jSONObject1 = new JSONObject();
                      jSONObject1.put("errorCode", this.importResult.importExceptions[i].errorCode);
                      jSONObject1.put("errorType", this.importResult.importExceptions[i].errorType);
                      jSONObject1.put("errorMsg", this.importResult.importExceptions[i].getMessage());
                      jSONObject1.put("inputPath", this.importResult.importExceptions[i].inputPath);
                      jsonArray.a0(jSONObject1.toString());
                   }
                   i = i + 1;
                }
                obj.put("importExceptions", jsonArray);
             }
          }
          jSONObject.put("type", this.mType);
          ClipEditImportLog texportQos = this.exportQos;
          if (texportQos != null) {
             obj.put("qos", texportQos);
          }
          texportQos = this.extraInfo;
          if (texportQos != null) {
             texportQos.assetInfoArray = ClipEditExtraInfo.addTemplateJsonObject(this.project);
             obj.put("extraInfo", this.extraInfo.toJsonObject());
          }
          return obj.toString();
       }catch(org.json.JSONException e0){
          KSClipLog.e("ClipEditImportLog", "to Json Error", e0);
          return "";
       }
    }
}
