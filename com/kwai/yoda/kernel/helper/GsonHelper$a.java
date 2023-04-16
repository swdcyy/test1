package com.kwai.yoda.kernel.helper.GsonHelper$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.Gson;
import com.kwai.yoda.kernel.helper.GsonHelper;
import qrd.p;

public final class GsonHelper$a	// class@0012a4
{

    public void GsonHelper$a(){
       super();
    }
    public void GsonHelper$a(u p0){
       super();
    }
    public final String a(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GsonHelper$a uoa = GsonHelper$a.class;
       String obj = PatchProxy.applyOneRefs(p0, this, uoa, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "";
       if (p0 == null) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uoa, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = GsonHelper.a.getValue();
       }
       p0 = obj1.q(p0);
       if (p0 != null) {
          obj = p0;
       }
       return obj;
    }
}
