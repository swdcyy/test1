package ev2.c;
import ev2.k;
import ge3.g;
import ge3.f;
import msd.l;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ge3.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import je3.b;
import je3.d;
import nv2.a;
import dp1.d;
import com.kuaishou.live.common.core.component.livestage.a;
import u71.a;

public final class c implements k, g	// class@0027f9
{
    public d b;
    public boolean c;
    public a d;
    public final f e;
    public final l f;
    public final a g;
    public final boolean h;

    public void c(f p0,l p1,a p2,boolean p3){
       a.p(p0, "liveStageCameraHandler");
       a.p(p1, "createLiveCameraParams");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.c = true;
       p0.c(this);
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.e.a(this.f.invoke(Boolean.valueOf(this.c)));
       return this.e.d();
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.e.b();
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       if (this.h != null) {
          c tb = this.b;
          if (tb != null) {
             this.e.a(this.f.invoke(Boolean.valueOf(tb.isFrontCamera())));
          }
       }
       this.b = null;
       this.j();
       return;
    }
    public boolean d(){
       return this.c;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       if (this.c == null) {
          this.switchCamera();
       }
       return;
    }
    public void f(d p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "2")) {
          return;
       }
       a.p(p0, "camera");
       this.b = p0;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uoc, "7")) {
          uoc = this.b;
          if (uoc != null && this.d == null) {
             c tg = this.g;
             if (tg != null) {
                objArray = tg.invoke();
             }
             a uoa = new a(objArray);
             this.d = uoa;
             a.m(uoa);
             uoa.a(uoc.g());
          }
       }
       return;
    }
    public void g(boolean p0){
       if (PatchProxy.isSupport(c.class)) {
          PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, c.class, "11");
       }
       return;
    }
    public boolean h(){
       c obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = true;
       if (obj == null || obj.h() != b) {
          b = false;
       }
       return b;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       this.b = null;
       this.c = true;
       this.e.e(this);
       this.j();
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       c td = this.d;
       if (td != null) {
          td.b();
       }
       this.d = null;
       return;
    }
    public void switchCamera(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.c = this.c ^ 0x01;
       c tb = this.b;
       if (tb != null) {
          tb.i(this.c);
       }
       this.e.a(this.f.invoke(Boolean.valueOf(this.c)));
       return;
    }
}
