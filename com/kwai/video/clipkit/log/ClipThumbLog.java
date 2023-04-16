package com.kwai.video.clipkit.log.ClipThumbLog;
import com.kwai.video.clipkit.log.ClipEditBaseLog;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.util.Map;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.kwai.video.clipkit.log.ClipEditExtraInfo;
import java.lang.Throwable;
import com.kwai.video.clipkit.KSClipLog;

public class ClipThumbLog extends ClipEditBaseLog	// class@001a93
{
    public Context context;
    public EditorSdk2$EditorSdkError editorSdkError;
    public ClipEditExtraInfo extraInfo;
    public Map qosMap;

    public void ClipThumbLog(){
       super();
    }
    public String toJson(){
       JSONObject obj = PatchProxy.apply(null, this, ClipThumbLog.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          obj.put("qos", new JSONObject(this.qosMap));
          JSONObject jSONObject = new JSONObject();
          this.toJsonBase(obj);
          obj.put("status", jSONObject);
          ClipThumbLog teditorSdkEr = this.editorSdkError;
          if (teditorSdkEr != null) {
             jSONObject.put("errorCode", teditorSdkEr.code());
             jSONObject.put("errorType", teditorSdkEr.type());
             jSONObject.put("errorMsg", teditorSdkEr.message());
          }
          ClipThumbLog textraInfo = this.extraInfo;
          if (textraInfo != null) {
             obj.put("extraInfo", textraInfo.toJsonObject());
          }
          return obj.toString();
       }catch(org.json.JSONException e0){
          KSClipLog.e("ClipThumbnail", "to Json Error", e0);
          return null;
       }
    }
}
