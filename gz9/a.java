package gz9.a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import brd.t;

public final class a	// class@002513
{
    public final PublishSubject a;
    public final PublishSubject b;
    public final PublishSubject c;

    public void a(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.a = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<PayVideoMeta>\(\)");
       this.b = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.c = publishSubje;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.a.onNext(Boolean.TRUE);
       return;
    }
    public final b b(g p0,g p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "onNext");
       a.p(p1, "onError");
       b uob = this.c.subscribe(p0, p1);
       a.o(uob, "mPayCourseTrailFinishVis¡­ubscribe\(onNext, onError\)");
       return uob;
    }
    public final b c(g p0,g p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "onNext");
       a.p(p1, "onError");
       b uob = this.b.subscribe(p0, p1);
       a.o(uob, "payVideoMetaSubject.subscribe\(onNext, onError\)");
       return uob;
    }
    public final void d(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "5")) {
          return;
       }
       this.c.onNext(Boolean.valueOf(p0));
       return;
    }
}
