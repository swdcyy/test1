package com.kuaishou.live.krn.dialog.container.LiveKrnActivity$b;
import o63.c;
import com.kuaishou.live.krn.dialog.container.LiveKrnActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kds.krn.api.page.KwaiRnActivity;
import zj0.x;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import java.lang.Boolean;

public final class LiveKrnActivity$b implements c	// class@001d44
{
    public final LiveKrnActivity b;

    public void LiveKrnActivity$b(LiveKrnActivity p0){
       a.p(p0, "activity");
       super();
       this.b = p0;
    }
    public Integer I2(){
       Object obj = PatchProxy.apply(null, this, LiveKrnActivity$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, LiveKrnActivity$b.class, "1")) {
          return;
       }
       this.b.finish();
       return;
    }
    public x ea(){
       Object obj = PatchProxy.apply(null, this, LiveKrnActivity$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public Lifecycle getLifecycle(){
       Lifecycle obj = PatchProxy.apply(null, this, LiveKrnActivity$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.getLifecycle();
       a.o(obj, "activity.lifecycle");
       return obj;
    }
    public void l0(boolean p0){
       if (PatchProxy.isSupport(LiveKrnActivity$b.class)) {
          PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveKrnActivity$b.class, "5");
       }
       return;
    }
    public void n0(){
       PatchProxy.applyVoid(null, this, LiveKrnActivity$b.class, "6");
    }
}
