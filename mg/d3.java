package mg.d3;
import java.lang.Runnable;
import java.lang.String;
import f55.g;
import java.lang.Object;
import com.feature.post.bridge.jsmodel.JsSetActivityCallback;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import i46.b;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;
import java.lang.Throwable;
import w46.b;
import kotlin.jvm.internal.a;
import mg.e0;
import mg.f0;
import java.util.List;

public final class d3 implements Runnable	// class@0025ef
{
    public final String b;
    public final g c;

    public void d3(String p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       String str3;
       String str4;
       JSONObject jSONObject1;
       JSONObject jSONObject2;
       String str5;
       d3 uod3 = this;
       d3 b = uod3.b;
       d3 c = uod3.c;
       String str = "activityId";
       String str1 = 1;
       l ol = (b == null || !b.length())? 1: null;
       if (ol) {
          if (c != null) {
             c.onSuccess(JsSetActivityCallback.getFailedParams());
          }
       }else {
          Object[] objArray = new Object[0];
          l.D().w("JsGrowthBridgeFuns", "setActivityParam: "+b, objArray);
          x6 ox6 = y6.r(b.class);
          if (ox6 == null) {
             Object[] objArray1 = new Object[0];
             l.D().w("JsGrowthBridgeFuns", "not found postGrowthPlugin", objArray1);
             if (c != null) {
                c.onSuccess(JsSetActivityCallback.getFailedParams());
             }
          }else {
             JSONObject jSONObject = new JSONObject(b);
             String str2 = jSONObject.optString("activityDetail");
             ArrayList uArrayList = new ArrayList();
             JSONArray jSONArray = jSONObject.optJSONArray("topics");
             if (jSONArray != null) {
                try{
                   int i = jSONArray.length();
                   for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                      uArrayList.add(jSONArray.getString(i1));
                   }
                }catch(org.json.JSONException e0){
                   l.D().e("JsGrowthBridgeFuns", "topicJsonArray error", e0);
                }
             }
          }
       }
    label_00f0 :
       return;
    }
}
