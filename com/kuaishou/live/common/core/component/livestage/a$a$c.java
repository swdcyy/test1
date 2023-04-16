package com.kuaishou.live.common.core.component.livestage.a$a$c;
import com.kuaishou.live.common.core.component.livestage.a;
import u71.a;
import com.kuaishou.live.common.core.component.livestage.a$b;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.livestage.CloseCameraReason;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import je3.e;
import fe3.c;
import je3.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import je3.l;

public final class a$a$c extends a	// class@0014af
{
    public final a e;
    public final a$b f;
    public final a g;

    public void a$a$c(a p0){
       this.g = p0;
       super();
       this.e = p0;
       View view = p0.n1();
       a.o(view, "camera.cameraView");
       this.f = new a$b(true, view);
    }
    public void b(CloseCameraReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$c.class, "3")) {
          return;
       }
       a.p(p0, "reason");
       return;
    }
    public void c(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$c.class, "5")) {
          return;
       }
       a.p(p0, "callback");
       return;
    }
    public void e(c p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a$c.class, "4")) {
          return;
       }
       a.p(p0, "streamId");
       a.p(p1, "param");
       return;
    }
    public void f(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$c.class, "6")) {
          return;
       }
       a.p(p0, "callback");
       return;
    }
    public a g(){
       return this.e;
    }
    public boolean h(){
       return true;
    }
    public boolean isFrontCamera(){
       Object obj = PatchProxy.apply(null, this, a$a$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.g.I();
    }
    public a$b j(){
       return this.f;
    }
    public void l(a p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a$c.class, "1")) {
          return;
       }
       a.p(p0, "camera");
       return;
    }
    public void release(){
    }
}
