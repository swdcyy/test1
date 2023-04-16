package com.kwai.video.clipkit.log.ClipEditImagePublishLog;
import com.kwai.video.clipkit.log.ClipEditBaseLog;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.lang.Throwable;
import com.kwai.video.clipkit.KSClipLog;

public class ClipEditImagePublishLog extends ClipEditBaseLog	// class@001a8e
{
    public boolean mSuccess;

    public void ClipEditImagePublishLog(){
       super();
    }
    public String toJson(){
       JSONObject obj = PatchProxy.apply(null, this, ClipEditImagePublishLog.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          obj.put("Success", this.mSuccess);
          return obj.toString();
       }catch(org.json.JSONException e0){
          KSClipLog.e("ClipEditImagePublishLog", "to Json Error", e0);
          return "";
       }
    }
}
