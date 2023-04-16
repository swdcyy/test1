package az0.c;
import tj3.o;
import com.kuaishou.live.audience.component.gift.gift.b;
import java.lang.Object;
import java.util.Map;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.Iterator;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;
import t02.a0;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import pp.d;

public final class c implements o	// class@0002d1
{
    public final b a;

    public void c(b p0){
       this.a = p0;
    }
    public final void a(Map p0){
       b u0 = this.a.U0;
       if (!u0.isEmpty()) {
          JSONObject jSONObject = new JSONObject();
          try{
             JSONArray jSONArray = new JSONArray();
             Iterator iterator = u0.iterator();
             while (iterator.hasNext()) {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.putOpt("magic_face_id", String.valueOf(iterator.next()));
                jSONObject1.putOpt("play_count", Integer.valueOf(1));
                jSONArray.put(jSONObject1);
             }
             jSONObject.putOpt("gift_magic_face_usage", jSONArray);
          }catch(org.json.JSONException e0){
             e0.Z.H2.c(LiveLogTag.STATISTICS, "addFeatureStatisticInfoToQos error");
          }
          u0.clear();
          p0.put("feature_usage", jSONObject);
       }
       return;
    }
}
