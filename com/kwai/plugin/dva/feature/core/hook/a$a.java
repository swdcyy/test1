package com.kwai.plugin.dva.feature.core.hook.a$a;
import com.kwai.plugin.dva.feature.core.receiver.a$b;
import java.lang.String;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import qj7.d;

public class a$a implements a$b	// class@001304
{
    public final String a;
    public final String b;
    public final Runnable c;

    public void a$a(String p0,String p1,Runnable p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       d.a("ServiceLauncherHook: install "+this.a+" success on "+this.b);
       this.c.run();
       return;
    }
    public void onFailed(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       d.c("ServiceLauncherHook: install "+this.a+" failed on "+this.b+", error="+p0);
       return;
    }
}
