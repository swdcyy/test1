package bq7.e;
import bq7.b;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import bq7.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import brd.t;

public final class e extends b	// class@00044a
{
    public final PublishSubject a;

    public void e(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Bo¡­omPanelVisibilityEvent>\(\)");
       this.a = publishSubje;
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          a.p(p0, "show");
          this.a.onNext(p0);
       }
       return;
    }
    public b b(g p0,g p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "onNext");
       a.p(p1, "onError");
       b uob = this.a.subscribe(p0, p1);
       a.o(uob, "surveyLayoutShownSubject¡­ubscribe\(onNext, onError\)");
       return uob;
    }
}
