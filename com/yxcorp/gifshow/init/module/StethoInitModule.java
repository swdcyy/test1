package com.yxcorp.gifshow.init.module.StethoInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;

public class StethoInitModule extends a	// class@0019a2
{

    public void StethoInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       Object obj = PatchProxy.applyWithListener(null, this, StethoInitModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(StethoInitModule.class, "1");
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 19;
    }
    public void n(){
    }
}
