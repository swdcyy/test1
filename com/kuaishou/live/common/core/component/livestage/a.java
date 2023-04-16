package com.kuaishou.live.common.core.component.livestage.a;
import je3.c;
import com.kuaishou.live.common.core.component.livestage.a$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import je3.l;
import u71.a;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.NotImplementedError;
import com.kuaishou.live.common.core.component.livestage.a$b;
import fe3.c;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import fe3.c$d;
import fe3.c$a;
import u71.e;
import je3.m;
import qrd.l1;
import java.lang.StringBuilder;
import xo1.d;

public abstract class a implements c	// class@0014b2
{
    public l b;
    public c c;
    public static final a$a d;

    static {
       a.d = new a$a(null);
    }
    public void a(){
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.n();
       return;
    }
    public final void d(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.b = p0;
       this.n();
       this.l(this.g(), p0);
       return;
    }
    public abstract a g();
    public void i(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "6")) {
          return;
       }
       if (this.g().I() != p0) {
          this.g().switchCamera();
       }
       return;
    }
    public boolean isFrontCamera(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
    public abstract a$b j();
    public final c k(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          String id = qCurrentUser.getId();
          a.o(id, "QCurrentUser.me\(\).id");
          c$d uod = c.a.a(id);
       }
       return obj;
    }
    public abstract void l(a p0,l p1);
    public final void m(c p0){
       this.c = p0;
    }
    public final void n(){
       l1 a;
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       e cameraCaptur = this.g().getCameraCaptureSize();
       a tb = this.b;
       if (tb != null) {
          a = l1.a;
          int i = (cameraCaptur != null)? cameraCaptur.getWidth(): 0;
          int i1 = (cameraCaptur != null)? cameraCaptur.getHeight(): 0;
          m om = new m(a, i, i1, this.k(), this.j());
          tb.a(v9);
       }
       d.a(false, cameraCaptur+' '+this.b);
       return;
    }
}
