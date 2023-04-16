package com.tachikoma.core.debug.a;
import com.tachikoma.core.debug.d$a;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import com.tachikoma.core.debug.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import no8.a;
import java.lang.Boolean;
import java.util.Map;
import org.json.JSONObject;
import java.lang.Exception;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import android.util.Pair;
import java.lang.Long;

public abstract class a implements d$a	// class@000db9
{
    public final Map a;
    public final Map b;

    public void a(){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
    }
    public void b(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.a.put(p0, p1);
          p1.b = this;
       }
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (a.c.booleanValue()) {
          d uod = this.a.remove(p0);
          if (uod != null) {
             uod.destroyOnLooperThread();
             this.b.remove(uod);
          }
       }
       return;
    }
    public final void d(d p0,String p1,JSONObject p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "7")) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("type", "notification");
          JSONObject jSONObject1 = new JSONObject();
          jSONObject1.put("method", p1);
          jSONObject1.put("params", p2);
          jSONObject.put("data", jSONObject1);
          p0.a(jSONObject.toString());
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
       return;
    }
    public void e(String p0,JSONObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       if (a.c.booleanValue() && this.a.size() > 0) {
          Iterator iterator = this.a.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (!PatchProxy.applyVoidThreeRefs(str, p0, p1, this, a.class, "6") && a.c.booleanValue()) {
                d uod = this.a.get(str);
                if (uod != null) {
                   if (uod.c != null) {
                      this.d(uod, p0, p1);
                   }else {
                      ArrayList uArrayList = this.b.get(uod);
                      if (uArrayList == null) {
                         uArrayList = new ArrayList();
                         this.b.put(uod, uArrayList);
                      }
                      uArrayList.add(new Pair(p0, p1));
                   }
                }
             }
          }
       }
       return;
    }
    public void f(String p0,long p1,JSONObject p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, this, a.class, "3")) {
          return;
       }
       if (a.c.booleanValue()) {
          d uod = this.a.get(p0);
          if (uod != null) {
             try{
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "response");
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("id", p1);
                jSONObject1.put("result", p2);
                jSONObject.put("data", jSONObject1);
                uod.a(jSONObject.toString());
             }catch(java.lang.Exception e8){
                e8.printStackTrace();
             }
          }
       }
    }
}
