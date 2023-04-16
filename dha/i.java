package dha.i;
import vga.b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import t45.d;
import brd.z;
import dha.h;
import erd.g;

public class i implements b	// class@0024a9
{
    public final PublishSubject a;
    public b b;

    public void i(){
       super();
       this.a = PublishSubject.g();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       b9.a(this.b);
       this.b = null;
       return;
    }
    public t b(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = RxBus.f.f(n.class).observeOn(d.a).subscribe(new h(this));
       }
       return this.a;
    }
}
