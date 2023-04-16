package com.kuaishou.live.gameinteractive.auth.model.a;
import java.lang.Object;
import org.json.JSONArray;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashSet;
import java.lang.Integer;
import pp.a;
import org.json.JSONException;
import q87.c;
import java.util.Collections;
import org.json.JSONObject;
import android.util.SparseArray;
import com.kuaishou.live.gameinteractive.auth.model.a$a;
import java.util.Collection;
import java.util.Iterator;

public class a	// class@001bd0
{
    public Set a;
    public Set b;
    public SparseArray c;

    public void a(){
       super();
    }
    public static Set b(JSONArray p0){
       HashSet obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || !p0.length()) {
          return Collections.emptySet();
       }
       obj = new HashSet();
       try{
          for (int i = 0; i < p0.length(); i = i + 1) {
             obj.add(Integer.valueOf(p0.getInt(i)));
          }
       }catch(org.json.JSONException e4){
          Object[] objArray = new Object[0];
          a.C().t("GameLiveAuthCategory", e4.getMessage(), objArray);
       }
       return obj;
    }
    public static a c(JSONObject p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       JSONObject obj = null;
       a obj1 = PatchProxy.applyOneRefs(p0, obj, uoa, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new a();
       obj1.a = a.b(p0.optJSONArray("authorized"));
       JSONArray jSONArray = p0.optJSONArray("required");
       SparseArray sparseArray = PatchProxy.applyTwoRefs(jSONArray, obj1, obj, uoa, "2");
       if (sparseArray != patchProxyRe) {
       }else if(jSONArray == null || !jSONArray.length()){
          sparseArray = new SparseArray();
       }else {
          sparseArray = new SparseArray();
          obj1.b = new HashSet();
          int i = 0;
          while (i < jSONArray.length()) {
             obj = jSONArray.optJSONObject(i);
             if (obj != null) {
                a$a uoa1 = new a$a();
                uoa1.a = obj.optInt("id");
                uoa1.b = obj.optString("text");
                uoa1.relatedUserAuth = a.b(obj.optJSONArray("userInfo"));
                sparseArray.put(uoa1.a, uoa1);
                obj1.b.add(Integer.valueOf(uoa1.a));
             }
             i = i + 1;
          }
          obj1.b.removeAll(obj1.a);
       }
       obj1.c = sparseArray;
       return obj1;
    }
    public Set a(Set p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || !p0.size()) {
          obj = new Object[0];
          a.C().t("GameLiveAuthCategory", "fetchWordSet error! authCodes empty!", obj);
          return Collections.emptySet();
       }else {
          HashSet hashSet = new HashSet();
          if (this.c != null) {
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                Integer integer = iterator.next();
                if (integer != null && this.b.contains(integer)) {
                   a$a uoa = this.c.get(integer.intValue());
                   if (uoa != null) {
                      hashSet.add(uoa.b);
                   }
                }
             }
          }
          return hashSet;
       }
    }
    public void d(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       if (p0 != null && p0.length > 0) {
          HashSet hashSet = new HashSet();
          int len = p0.length;
          for (int i = 0; i < len; i = i + 1) {
             hashSet.add(Integer.valueOf(p0[i]));
          }
          this.a = hashSet;
          this.b.removeAll(hashSet);
       }
       return;
    }
}
