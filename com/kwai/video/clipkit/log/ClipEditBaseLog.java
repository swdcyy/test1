package com.kwai.video.clipkit.log.ClipEditBaseLog;
import java.lang.Object;
import java.lang.String;
import org.json.JSONObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;

public abstract class ClipEditBaseLog	// class@001a88
{

    public void ClipEditBaseLog(){
       super();
    }
    public abstract String toJson();
    public void toJsonBase(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipEditBaseLog.class, "1")) {
          return;
       }
       if (p0 != null) {
          try{
             p0.put("tag", "5.6.1.4");
          }catch(org.json.JSONException e3){
             KSClipLog.e("ClipEditBaseLog", "toJsonBase put json field error"+e3);
          }
       }
    }
}
