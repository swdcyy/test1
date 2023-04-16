package com.yxcorp.gifshow.init.module.DFPInitModule$3;
import h30.b;
import com.yxcorp.gifshow.init.module.DFPInitModule;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.HashMap;
import fg6.a;
import com.google.gson.Gson;
import pxa.e;
import java.lang.StringBuilder;
import q87.c;
import k2b.u1;
import oe6.a;

public class DFPInitModule$3 implements b	// class@00196a
{
    public final DFPInitModule a;

    public void DFPInitModule$3(DFPInitModule p0){
       this.a = p0;
       super();
    }
    public void onFailed(int p0,String p1){
       if (PatchProxy.isSupport2(DFPInitModule$3.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p0), p1, this, DFPInitModule$3.class, "2")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("errorCode", Integer.valueOf(p0));
       hashMap.put("errorMessage", p1);
       String str = a.a.q(hashMap);
       Object[] objArray = new Object[0];
       e.C().t("DFP", "getEGid onFailed. "+str, objArray);
       u1.Q("dfp_get_egid_failed", str);
       PatchProxy.onMethodExit(DFPInitModule$3.class, "2");
       return;
    }
    public void onSuccess(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, DFPInitModule$3.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().s("DFP", "getEGid onSuccess eGid: "+p0, objArray);
       DFPInitModule.s = p0;
       a.V(p0);
       PatchProxy.onMethodExit(DFPInitModule$3.class, "1");
       return;
    }
}
