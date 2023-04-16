package com.yxcorp.gifshow.tti.module.SensitiveFileDefenderInitModule$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.files.security.SensitiveFileDefender;

public final class SensitiveFileDefenderInitModule$a implements Runnable	// class@001dce
{
    public static final SensitiveFileDefenderInitModule$a b;

    static {
       SensitiveFileDefenderInitModule$a.b = new SensitiveFileDefenderInitModule$a();
    }
    public void SensitiveFileDefenderInitModule$a(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SensitiveFileDefenderInitModule$a.class, "1")) {
          return;
       }
       SensitiveFileDefender.a();
       return;
    }
}
