package com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$d;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qe6.b;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$d$a;
import t45.c;

public final class PushSdkInitModuleForMainProcess$d implements Runnable	// class@00164b
{
    public static final PushSdkInitModuleForMainProcess$d b;

    static {
       PushSdkInitModuleForMainProcess$d.b = new PushSdkInitModuleForMainProcess$d();
    }
    public void PushSdkInitModuleForMainProcess$d(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PushSdkInitModuleForMainProcess$d.class, "1")) {
          return;
       }
       if (b.a()) {
          c.a(PushSdkInitModuleForMainProcess$d$a.b);
       }
       return;
    }
}
