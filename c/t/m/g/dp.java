package c.t.m.g.dp;
import java.lang.Object;
import java.util.ArrayList;
import org.json.JSONObject;
import java.lang.String;
import c.t.m.g.dt;
import org.json.JSONArray;
import c.t.m.g.ed;
import java.lang.StringBuilder;
import c.t.m.g.ds;
import java.lang.Throwable;
import java.util.Iterator;
import com.tencent.map.geolocation.TencentPoi;
import android.os.Bundle;
import c.t.m.g.do;
import android.os.Parcelable;

public class dp	// class@000c50
{
    public int a;
    public final ArrayList b;
    public dt c;

    public void dp(){
       super();
       this.b = new ArrayList();
    }
    public void dp(JSONObject p0){
       super();
       this.b = new ArrayList();
       this.a = p0.optInt("stat");
       String str = "subnation";
       if (p0.has(str)) {
          this.c = new dt(p0.optJSONObject(str));
       }else {
          str = "results";
          if (p0.has(str)) {
             this.c = this.a(p0.optJSONArray(str));
          }else {
             this.c = dt.a;
             if (ed.a) {
                ed.b("DetailsData", "DetailsData: unknown json "+p0.toString());
             }
          }
       }
       JSONArray jSONArray = p0.optJSONArray("poilist");
       if (jSONArray != null) {
          try{
             int i = jSONArray.length();
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                this.b.add(new ds(jSONArray.getJSONObject(i1)));
             }
          }catch(org.json.JSONException e6){
             if (ed.a) {
                ed.a("DetailsData", "json error", e6);
             }
          }
       }
    }
    public static dp a(dp p0){
       if (p0 == null) {
          return null;
       }
       dp uodp = new dp();
       uodp.a = p0.a;
       uodp.c = dt.a(p0.c);
       Iterator iterator = p0.b.iterator();
       while (iterator.hasNext()) {
          uodp.b.add(new ds(iterator.next()));
       }
       return uodp;
    }
    public final dt a(JSONArray p0){
       JSONObject jSONObject;
       dt uodt = null;
       if (p0 == null) {
          return uodt;
       }
       dt uodt1 = dt.a(dt.a);
       if (uodt1 == null) {
          return uodt;
       }
       int i = p0.length();
       if (i > 0) {
          jSONObject = p0.optJSONObject(0);
          if (jSONObject != null) {
             uodt1.b = jSONObject.optString("n", uodt);
             uodt1.f = jSONObject.optString("p", uodt);
             uodt1.g = jSONObject.optString("c", uodt);
             uodt1.h = jSONObject.optString("d", uodt);
             uodt1.d = jSONObject.optString("adcode", uodt);
          }
       }
       int i1 = 1;
       if (i > i1) {
          JSONObject jSONObject1 = p0.optJSONObject(i1);
          uodt1.n.putString("addrdesp.name", jSONObject1.optString("address_name"));
          jSONObject = jSONObject1.optJSONObject("landmark");
          jSONObject1 = jSONObject1.optJSONObject("second_landmark");
          if (jSONObject != null) {
             uodt1.n.putParcelable("addrdesp.landmark", new do(jSONObject));
          }
          if (jSONObject1 != null) {
             uodt1.n.putParcelable("addrdesp.second_landmark", new do(jSONObject1));
          }
       }
       i1 = 2;
       if (i > i1) {
          ArrayList uArrayList = new ArrayList();
          while (i1 < i) {
             do uodo = new do(p0.optJSONObject(i1));
             uArrayList.add(uodo);
             if (("ST").equals(uodo.b)) {
                uodt1.k = uodo.a;
             }else if(("ST_NO").equals(uodo.b)){
                uodt1.l = uodo.a;
             }
             i1 = i1 + 1;
          }
          uodt1.n.putParcelableArrayList("addrdesp.results", uArrayList);
       }
       return uodt1;
    }
    public String toString(){
       String str = ",";
       StringBuilder str1 = "DetailsData{"+"subnation="+this.c+str+"poilist=[";
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          str1 = str1+iterator.next()+str;
       }
       return str1+"]"+"}";
    }
}
