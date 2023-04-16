package com.yxcorp.gifshow.tti.module.MiniSetInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.tti.module.MiniSetInitModule$a;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public final class MiniSetInitModule extends TTIInitModule	// class@001dc0
{

    public void MiniSetInitModule(){
       super();
    }
    public int f0(){
       return 19;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MiniSetInitModule.class, "1")) {
          return;
       }
       e.i(new MiniSetInitModule$a(this), "MiniSetInitModule", 1000);
       return;
    }
}
