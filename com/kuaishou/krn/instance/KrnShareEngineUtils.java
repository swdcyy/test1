package com.kuaishou.krn.instance.KrnShareEngineUtils;
import com.kuaishou.krn.instance.KrnShareEngineUtils$getShareEngineBundleConfigs$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import vj0.b;
import fk0.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import jk0.b;
import jk0.c;
import java.lang.StringBuilder;
import ek0.d;
import com.kuaishou.krn.instance.JsFramework;
import java.lang.Enum;
import java.util.Objects;
import java.util.Map;

public final class KrnShareEngineUtils	// class@0008cd
{
    public static final p a;
    public static final KrnShareEngineUtils b;

    static {
       KrnShareEngineUtils.b = new KrnShareEngineUtils();
       KrnShareEngineUtils.a = s.c(KrnShareEngineUtils$getShareEngineBundleConfigs$2.INSTANCE);
    }
    public void KrnShareEngineUtils(){
       super();
    }
    public final boolean a(b p0,a p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KrnShareEngineUtils krnShareEngi = KrnShareEngineUtils.class;
       JsFramework obj = PatchProxy.applyTwoRefs(p0, p1, this, krnShareEngi, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "params");
       if (c.a().r()) {
          d.e("force share engine by debug util: "+p0.b());
          return true;
       }else {
          obj = p0.c();
          String str = p0.b();
          Object[] objArray = PatchProxy.applyTwoRefs(obj, str, this, krnShareEngi, "2");
          if (objArray != patchProxyRe) {
          }else {
             a.p(obj, "jsFramework");
             a.p(str, "bundleId");
             String str2 = obj.name();
             Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
             str2 = str2.toLowerCase();
             a.o(str2, "\(this as java.lang.String\).toLowerCase\(\)");
             objArray = null;
             Object obj1 = PatchProxy.apply(objArray, this, krnShareEngi, "1");
             if (obj1 != patchProxyRe) {
             }else {
                obj1 = KrnShareEngineUtils.a.getValue();
             }
             Map map = obj1.get(str2);
             if (map != null) {
                objArray = map.get(str);
             }
          }
          if (objArray != null) {
             String str1 = (objArray.booleanValue())? "enabled": "disabled";
             d.e("share engine "+str1+" by switch: "+p0.b());
             return objArray.booleanValue();
          }else if(p0.f != null){
             d.e("force share engine by instance params: "+p0.b());
             return true;
          }else if(p1 != null && p1.c == true){
             d.e("force share engine by bundle: "+p0.b());
             return true;
          }else {
             return false;
          }
       }
    }
}
