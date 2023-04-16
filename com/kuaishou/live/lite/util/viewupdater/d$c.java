package com.kuaishou.live.lite.util.viewupdater.d$c;
import com.kuaishou.live.lite.util.viewupdater.d$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import e93.f;
import java.lang.Runnable;

public final class d$c implements d$b	// class@000bac
{

    public void d$c(){
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "2")) {
          return;
       }
       a.p(p0, "token");
       f.g(p0);
       return;
    }
    public void b(Runnable p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$c.class, "1")) {
          return;
       }
       a.p(p0, "action");
       a.p(p1, "token");
       f.i("ILiveUpdateViewHelper", p0, p1);
       return;
    }
}
