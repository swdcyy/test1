package com.yxcorp.gifshow.init.module.SDCardStateInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.init.module.SDCardStateInitModule$1;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public class SDCardStateInitModule extends TTIInitModule	// class@00199f
{

    public void SDCardStateInitModule(){
       super();
    }
    public int f0(){
       return 19;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SDCardStateInitModule.class, "1")) {
          return;
       }
       e.g(new SDCardStateInitModule$1(this), "SDCardStateInitModule");
       PatchProxy.onMethodExit(SDCardStateInitModule.class, "1");
       return;
    }
}
