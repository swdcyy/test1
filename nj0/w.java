package nj0.w;
import ju6.c;
import com.kuaishou.krn.delegate.k;
import java.lang.String;
import java.lang.Object;
import iu6.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.krn.experiment.ExpConfigKt;
import qrd.p;
import hj0.d;
import java.util.List;
import kotlin.jvm.internal.a;
import org.json.JSONObject;
import java.lang.StringBuilder;
import ek0.d;
import com.google.gson.Gson;
import trd.n;
import java.lang.Throwable;
import java.util.Collection;
import ekd.q;
import bk0.f;
import com.kuaishou.krn.delegate.KrnDelegate;
import com.kuaishou.krn.instance.JsFramework;
import com.kuaishou.krn.model.LaunchModel;
import bk0.f$a;
import bk0.e;
import java.lang.Enum;
import bk0.j;

public class w implements c	// class@003344
{
    public final String a;
    public final k b;

    public void w(k p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(a p0){
       f$a a;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StringBuilder str = "1";
       w obj = PatchProxy.applyOneRefs(p0, this, w.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b;
       w ta = this.a;
       Objects.requireNonNull(obj);
       Boolean obj1 = PatchProxy.applyTwoRefs(p0, ta, obj, k.class, "15");
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          Object[] objArray = null;
          obj1 = PatchProxy.apply(objArray, objArray, ExpConfigKt.class, "40");
          if (obj1 == patchProxyRe) {
             obj1 = ExpConfigKt.M.getValue();
          }
          if (obj1.booleanValue()) {
             JSONObject obj2 = PatchProxy.applyOneRefs(p0, objArray, d.class, str);
             if (obj2 != patchProxyRe) {
                objArray = obj2;
             }else {
                a.p(p0, "$this$getComponentNameList");
                JSONObject jSONObject = p0.d();
                StringBuilder str2 = (jSONObject != null)? jSONObject.optString("componentName"): objArray;
                str2 = (str2 == null || !str2.length())? 1: null;
                if (str2) {
                   d.e("getComponentNameList: "+p0.a()+" -> not exist componentName");
                }else {
                   Gson gson = new Gson();
                   obj2 = p0.d();
                   str = (obj2 != null)? obj2.optString("componentName"): objArray;
                   String[] stringArray = gson.h(str, String[].class);
                   List list = (stringArray != null)? n.t(stringArray): objArray;
                   str = "getComponentNameList:  "+p0.a()+" -> ";
                   if (list != null) {
                      objArray = list.toString();
                   }
                   d.e(str+objArray);
                   objArray = list;
                }
             }
             if (!q.f(objArray)) {
                boolean b1 = objArray.contains(ta);
                if (!b1) {
                   a = f.a;
                   JsFramework jsFramework = obj.d.d();
                   Objects.requireNonNull(a);
                   if (!PatchProxy.applyVoidThreeRefs(p0, ta, jsFramework, a, f$a.class, "1")) {
                      a.p(p0, "kxbBundleInfo");
                      a.p(ta, "componentName");
                      a.p(jsFramework, "jsFramework");
                      obj2 = new JSONObject();
                      int i = e.a[jsFramework.ordinal()];
                      String str1 = "platform";
                      if (i != b) {
                         if (i != 2) {
                            obj2.put(str1, "UNKNOWN");
                         }else {
                            obj2.put(str1, "VUE");
                         }
                      }else {
                         obj2.put(str1, "KRN");
                      }
                      obj2.put("componentName", ta);
                      obj2.put("bundleId", p0.a());
                      obj2.put("bundleVersionCode", p0.h());
                      obj2.put("bundleVersionName", p0.i());
                      str = obj2.toString();
                      a.o(str, "json.toString\(\)");
                      j.b.b("krn_bundle_componentName_check_result", str);
                   }
                }
                b = b1;
             }
          }
       }
       return b;
    }
    public String getName(){
       return "krn component";
    }
}
