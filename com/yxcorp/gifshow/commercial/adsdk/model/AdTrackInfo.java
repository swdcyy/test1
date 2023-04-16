package com.yxcorp.gifshow.commercial.adsdk.model.AdTrackInfo;
import java.io.Serializable;
import pl9.a;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.json.JSONArray;
import com.kwai.robust.PatchProxyResult;
import ol9.b;

public class AdTrackInfo implements Serializable, a	// class@001117
{
    public int type;
    public String[] urls;
    public static final long serialVersionUID = 0xe39393bd762e0cd4;

    public void AdTrackInfo(){
       super();
    }
    public void parseJson(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdTrackInfo.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.type = p0.optInt("type");
       JSONArray jSONArray = p0.optJSONArray("url");
       if (jSONArray != null) {
          String[] stringArray = new String[jSONArray.length()];
          this.urls = stringArray;
          for (int i = 0; i < jSONArray.length(); i = i + 1) {
             this.urls[i] = jSONArray.optString(i);
          }
       }
       return;
    }
    public JSONObject toJson(){
       JSONObject obj = PatchProxy.apply(null, this, AdTrackInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONObject();
       b.c(obj, "type", this.type);
       JSONArray jSONArray = new JSONArray();
       AdTrackInfo turls = this.urls;
       if (turls != null) {
          int len = turls.length;
          for (int i = 0; i < len; i = i + 1) {
             jSONArray.put(turls[i]);
          }
       }
       b.f(obj, "url", jSONArray);
       return obj;
    }
}
