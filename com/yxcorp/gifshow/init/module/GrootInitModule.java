package com.yxcorp.gifshow.init.module.GrootInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dx6.d;
import lw6.a;

public class GrootInitModule extends a	// class@001983
{

    public void GrootInitModule(){
       super();
    }
    public int f0(){
       return 5;
    }
    public void n(){
       if (PatchProxy.applyVoidWithListener(null, this, GrootInitModule.class, "1")) {
          return;
       }
       a.a = new d();
       PatchProxy.onMethodExit(GrootInitModule.class, "1");
       return;
    }
}
