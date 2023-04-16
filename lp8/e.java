package lp8.e;
import com.tachikoma.core.debug.a;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.lang.Long;
import no8.a;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Iterator;
import android.util.Pair;
import java.lang.Exception;
import java.util.Set;
import java.lang.Integer;
import org.json.JSONArray;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;

public abstract class e extends a	// class@002d87
{
    public long c;
    public final Map d;
    public final Map e;

    public void e(){
       super();
       this.c = 0;
       this.d = new HashMap();
       this.e = new HashMap();
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       super.c(p0);
       this.d.remove(p0);
       return;
    }
    public void g(String p0,String p1,long p2,String p3,String p4,Object p5){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uoe, "4")) {
             return;
          }
       }
       if (a.c.booleanValue()) {
          try{
             Map map = this.d.get(p0);
             if (map == null) {
                map = new HashMap();
                this.d.put(p0, map);
             }
             ArrayList uArrayList = map.get(p1);
             if (uArrayList == null) {
                uArrayList = new ArrayList();
                map.put(p1, uArrayList);
             }else {
                Iterator iterator = uArrayList.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      Pair pair = iterator.next();
                      if (!pair.first.longValue() - p2) {
                         pair.second.second.put(p4, p5);
                         return;
                      }
                   }
                }
             }
             HashMap hashMap = new HashMap();
             hashMap.put(p4, p5);
             uArrayList.add(new Pair(Long.valueOf(p2), new Pair(p3, hashMap)));
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
          }
       }
    }
    public void h(String p0,String p1,long p2,String p3,Map p4){
       object oobject = p4;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),p3,oobject};
          if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
             return;
          }
       }else {
          int i = this;
       }
       try{
          if (a.c.booleanValue() && p4.size() > 0) {
             Iterator iterator = p4.keySet().iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                this.g(p0, p1, p2, p3, obj, oobject.get(obj));
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public void i(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "2")) {
          return;
       }
       if (a.c.booleanValue()) {
          Map map = this.d.get(p0);
          if (map != null) {
             ArrayList uArrayList = map.get(p1);
             if (uArrayList != null) {
                ArrayList uArrayList1 = this.e.get(p1);
                if (uArrayList1 == null) {
                   uArrayList1 = new ArrayList();
                   this.e.put(p1, uArrayList1);
                }
                uArrayList1.add(new Pair(p2, Integer.valueOf((uArrayList.size() - 1))));
             }
          }
       }
       return;
    }
    public JSONArray j(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k(p0, p1, null);
    }
    public JSONArray k(String p0,String p1,String p2){
       int this;
       int i1;
       JSONObject jSONObject;
       Iterator iterator1;
       String str1;
       JSONArray obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONArray();
       if (a.c.booleanValue()) {
          Map map = this.d.get(p0);
          if (map != null) {
             ArrayList uArrayList = map.get(p1);
             if (uArrayList != null) {
                int i = -1;
                this = 0;
                if (!TextUtils.isEmpty(p2)) {
                   ArrayList uArrayList1 = this.e.get(p1);
                   if (uArrayList1 != null) {
                      Iterator iterator = uArrayList1.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            Pair pair = iterator.next();
                            if ((pair.first).equals(p2)) {
                               i1 = pair.second.intValue();
                            label_0071 :
                               i = i + 1;
                            label_0075 :
                               int i2 = uArrayList.size();
                               while (this < i2) {
                                  try{
                                     Pair pair1 = uArrayList.get(this);
                                     String str = "functionName";
                                     if (!TextUtils.isEmpty(p2)) {
                                        if (this >= i && this <= i1) {
                                           jSONObject = new JSONObject();
                                           jSONObject.put(str, pair1.second.first);
                                           iterator1 = pair1.second.second.keySet().iterator();
                                           while (iterator1.hasNext()) {
                                              str1 = iterator1.next();
                                              jSONObject.put(str1, pair1.second.second.get(str1));
                                           }
                                           obj.put(jSONObject);
                                        }
                                     }else {
                                        jSONObject = new JSONObject();
                                        jSONObject.put(str, pair1.second.first);
                                        iterator1 = pair1.second.second.keySet().iterator();
                                        while (iterator1.hasNext()) {
                                           str1 = iterator1.next();
                                           jSONObject.put(str1, pair1.second.second.get(str1));
                                        }
                                        obj.put(jSONObject);
                                     }
                                  }catch(java.lang.Exception e4){
                                     e4.printStackTrace();
                                  }
                                  this++;
                               }
                            }else {
                               i = pair.second.intValue();
                            }
                         }else {
                            i1 = 0;
                            goto label_0071 ;
                         }
                      }
                   }
                }
                i1 = 0;
                goto label_0075 ;
             }
          }
       }
       return obj;
    }
    public JSONArray l(){
       JSONArray obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONArray();
          if (a.c.booleanValue() && this.d.size() > 0) {
             Iterator iterator = this.d.keySet().iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                Iterator iterator1 = this.d.get(str).keySet().iterator();
                while (iterator1.hasNext()) {
                   JSONObject jSONObject = new JSONObject();
                   jSONObject.put("bundleId", str);
                   jSONObject.put("sessionId", iterator1.next());
                   obj.put(jSONObject);
                }
             }
          }
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       return obj;
    }
    public long m(){
       e tc = this.c;
       this.c = 1 + tc;
       return tc;
    }
}
