package e59.b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import fy8.b;
import msd.l;
import t45.d;
import brd.z;
import brd.t;
import e59.a;
import g59.u;
import erd.g;
import crd.b;

public class b	// class@002145
{
    public final PublishSubject a;
    public final ArrayList b;

    public void b(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<UIData>\(\)");
       this.a = publishSubje;
       this.b = new ArrayList();
    }
    public final void a(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       this.a.onNext(new b(p0, null));
       return;
    }
    public final void b(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       this.b.add(this.a.observeOn(d.a).subscribe(new a(p0), u.a));
       return;
    }
}
