package gz8.b;
import com.kwai.framework.player.core.b;
import gz8.b$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.player.multisource.d;
import com.kwai.framework.player.multisource.e;
import p5a.c;
import p5a.e;
import gc6.k;
import gz8.c;
import java.lang.Integer;
import gz8.b$b;
import gz8.b$c;

public final class b	// class@002525
{
    public Boolean a;
    public b$b b;
    public e c;
    public k d;
    public final b e;
    public final b$a f;

    public void b(b p0,b$a p1){
       boolean b;
       a.p(p0, "mPlayer");
       a.p(p1, "mStateListener");
       super();
       this.e = p0;
       this.f = p1;
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "1")) {
       }else {
          d obj = PatchProxy.apply(null, this, uob, "4");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(p0 instanceof d){
             this.b();
             obj = p0;
             this.a(obj.i());
             obj.d(this.c);
          }else if(p0 instanceof c){
             this.b();
             c uoc = p0;
             this.a(uoc.i());
             uoc.d(this.c);
             if (p0 instanceof e) {
                p0.c(this.d);
             }
          }else {
             b = false;
          }
          b = true;
          if (!b && !PatchProxy.applyVoid(null, this, uob, "3")) {
             this.d(p0.b());
             this.b = new c(this);
          }
       }
       return;
    }
    public final void a(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "5")) {
          return;
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 == 3) {
             label_0024 :
                this.c(1);
             }
          }else {
             this.c(false);
          }
       }else {
          goto label_0024 ;
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       this.c = new b$b(this);
       this.d = new b$c(this);
       return;
    }
    public final void c(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "9")) {
          return;
       }
       uob = this.a;
       if (uob != null && a.g(uob, Boolean.valueOf(p0))) {
          return;
       }
       if (p0) {
          this.f.b();
       }else {
          this.f.a();
       }
       this.a = Boolean.valueOf(p0);
       return;
    }
    public final void d(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "8")) {
          return;
       }
       switch (p0){
           case 1:
           case 3:
           case 4:
           case 2:
             this.c(true);
             break;
           case 5:
           case 7:
           case 8:
           case 6:
             this.c(false);
             break;
           default:
       }
       return;
    }
}
