package com.yxcorp.gifshow.detail.logger.slideprocess.SlideUserProcessInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e0a.j;
import com.yxcorp.gifshow.detail.logger.slideprocess.b;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public class SlideUserProcessInitModule extends TTIInitModule	// class@001575
{
    public static final int q;

    public void SlideUserProcessInitModule(){
       super();
    }
    public int f0(){
       return 5;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideUserProcessInitModule.class, "1")) {
          return;
       }
       if (j.a()) {
          e.d(b.b, "SlideUserProcessInitModule");
       }
       return;
    }
}
