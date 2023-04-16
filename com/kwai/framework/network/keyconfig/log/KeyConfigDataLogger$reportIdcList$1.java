package com.kwai.framework.network.keyconfig.log.KeyConfigDataLogger$reportIdcList$1;
import java.lang.Runnable;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.network.keyconfig.log.KeyConfigDataLogger$reportIdcList$1$copyHostFun$1;
import java.util.LinkedHashMap;
import msd.q;
import fg6.a;
import com.google.gson.Gson;
import k2b.u1;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public final class KeyConfigDataLogger$reportIdcList$1 implements Runnable	// class@0017f4
{
    public final Map b;
    public final String c;

    public void KeyConfigDataLogger$reportIdcList$1(Map p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       String str;
       if (PatchProxy.applyVoid(null, this, KeyConfigDataLogger$reportIdcList$1.class, "1")) {
          return;
       }
       KeyConfigDataLogger$reportIdcList$1$copyHostFun$1 iNSTANCE = KeyConfigDataLogger$reportIdcList$1$copyHostFun$1.INSTANCE;
       KeyConfigDataLogger$reportIdcList$1 tb = this.b;
       if (tb != null) {
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          iNSTANCE.invoke("api", tb, linkedHashMa);
          iNSTANCE.invoke("live", tb, linkedHashMa);
          str = a.a.q(linkedHashMa);
          if (str != null) {
          label_002c :
             u1.R(this.c, str, 0);
             return;
          }
       }
       str = "{}";
       goto label_002c ;
    }
}
