package com.yxcorp.gifshow.tti.module.SensitiveFileDefenderInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.tti.module.SensitiveFileDefenderInitModule$a;
import java.lang.Runnable;
import com.kwai.framework.init.c;
import com.yxcorp.gifshow.tti.module.SensitiveFileDefenderInitModule$b;

public final class SensitiveFileDefenderInitModule extends TTIInitModule	// class@001dd0
{

    public void SensitiveFileDefenderInitModule(){
       super();
    }
    public int f0(){
       return 19;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, SensitiveFileDefenderInitModule.class, "2")) {
          return;
       }
       c.c(SensitiveFileDefenderInitModule$a.b);
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, SensitiveFileDefenderInitModule.class, "1")) {
          return;
       }
       c.d(SensitiveFileDefenderInitModule$b.b);
       return;
    }
}
