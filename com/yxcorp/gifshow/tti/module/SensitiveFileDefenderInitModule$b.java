package com.yxcorp.gifshow.tti.module.SensitiveFileDefenderInitModule$b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.files.security.SensitiveFileDefender;

public final class SensitiveFileDefenderInitModule$b implements Runnable	// class@001dcf
{
    public static final SensitiveFileDefenderInitModule$b b;

    static {
       SensitiveFileDefenderInitModule$b.b = new SensitiveFileDefenderInitModule$b();
    }
    public void SensitiveFileDefenderInitModule$b(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SensitiveFileDefenderInitModule$b.class, "1")) {
          return;
       }
       SensitiveFileDefender.a();
       return;
    }
}
