package com.yxcorp.gifshow.init.module.UpdateAppVersionModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sxa.i0;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public class UpdateAppVersionModule extends TTIInitModule	// class@0019a6
{
    public static final int q;

    public void UpdateAppVersionModule(){
       super();
    }
    public int f0(){
       return 21;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UpdateAppVersionModule.class, "1")) {
          return;
       }
       e.g(new i0(this), "UpdateAppVersionModule");
       PatchProxy.onMethodExit(UpdateAppVersionModule.class, "1");
       return;
    }
}
