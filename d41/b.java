package d41.b;
import fu4.b;
import lp3.a;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import lm3.b;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import brd.v;
import brd.g;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import d41.a;
import io.reactivex.g;
import t45.d;
import brd.z;
import java.lang.Throwable;

public class b extends a implements b	// class@001f04
{
    public Throwable d;
    public b e;
    public final List f;

    public void b(){
       super();
       this.f = new LinkedList();
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.f.clear();
       this.d = null;
       return;
    }
    public void Uc(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.e = p0;
       if (!q.f(this.f)) {
          Iterator iterator = this.f.iterator();
          while (iterator.hasNext()) {
             v ov = iterator.next();
             if (!ov.isDisposed()) {
                ov.onNext(p0);
                ov.onComplete();
             }
          }
          this.f.clear();
       }
       return;
    }
    public t W(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new a(this)).observeOn(d.a);
    }
    public b d0(){
       return this.e;
    }
    public void k2(){
       this.e = null;
    }
    public void uo(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       this.d = p0;
       if (!q.f(this.f)) {
          Iterator iterator = this.f.iterator();
          while (iterator.hasNext()) {
             v ov = iterator.next();
             if (!ov.isDisposed()) {
                ov.onError(p0);
             }
          }
          this.f.clear();
       }
       return;
    }
}
