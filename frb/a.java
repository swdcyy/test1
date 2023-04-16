package frb.a;
import xl8.d;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.y;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import brd.z;
import io.reactivex.android.schedulers.a;

public class a implements d	// class@0029d4
{
    public final c b;
    public Object c;

    public void a(Object p0){
       super();
       this.c = p0;
       this.b = PublishSubject.g();
    }
    public Object a(){
       return this.c;
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.b.onError(p0);
       return;
    }
    public void notifyChanged(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a tc = this.c;
       if (tc == null) {
          return;
       }
       this.b.onNext(tc);
       return;
    }
    public void notifyChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       p0 = this.c;
       if (p0 == null) {
          return;
       }
       this.b.onNext(p0);
       return;
    }
    public t observable(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.observeOn(a.c());
    }
}
