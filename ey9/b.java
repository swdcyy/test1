package ey9.b;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import jh5.a;
import xq7.d;
import rp7.a;
import rq7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ey9.b$b;
import java.lang.Boolean;
import qp7.b;
import qp7.g;
import xq7.e;
import ey9.a;
import io.reactivex.internal.functions.Functions;
import java.util.Objects;
import crd.b;
import kotlin.jvm.internal.a;
import erd.g;
import brd.t;
import qp7.d;
import ey9.b$a;
import qp7.c;

public class b extends DispatchBaseElement	// class@00224e
{

    public void b(a p0){
       super(d.b, p0);
    }
    public a f0(a p0){
       b$b uob = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b$b();
       }
       return uob;
    }
    public void j0(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.b0();
       e uoe = this.D();
       a uoa = new a(this);
       g e = Functions.e;
       Objects.requireNonNull(uoe);
       b uob1 = PatchProxy.applyTwoRefs(uoa, e, uoe, e.class, "9");
       if (uob1 != PatchProxyResult.class) {
       }else {
          a.p(uoa, "onNext");
          a.p(e, "onError");
          uob1 = uoe.c.subscribe(uoa, e);
          a.o(uob1, "plcUglySecondaryStrongSh¡­ubscribe\(onNext, onError\)");
       }
       this.j(uob1);
       return;
    }
    public d q(){
       b$a uoa = PatchProxy.apply(null, this, b.class, "3");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new b$a();
       }
       return uoa;
    }
    public c r(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
}
