package dub.y;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import dub.x;
import erd.o;
import t45.d;
import brd.z;
import io.reactivex.subjects.PublishSubject;
import dub.v;
import erd.g;
import java.util.concurrent.TimeUnit;
import brd.w;
import wkd.b;
import j9c.d;
import dub.s;
import j9c.a;
import k2b.f2;
import java.lang.Boolean;
import dub.m;
import erd.r;
import dub.w;

public class y	// class@002583
{
    public a a;
    public PublishSubject b;

    public void y(){
       super();
    }
    public t a(String p0,List p1,List p2,long p3){
       if (PatchProxy.isSupport(y.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Long.valueOf(p3), this, y.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       t ot = this.b(p0, p1, p2).map(x.b);
       if (p3 - 100 <= 0) {
          return ot.distinctUntilChanged().observeOn(d.a);
       }else {
          PublishSubject publishSubje = PublishSubject.g();
          return t.merge(publishSubje, ot.doOnNext(new v(publishSubje)).throttleLatest(p3, TimeUnit.MILLISECONDS, d.c)).distinctUntilChanged().observeOn(d.a);
       }
    }
    public final t b(String p0,List p1,List p2){
       Object[] obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, y.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = PublishSubject.g();
          if (!PatchProxy.applyVoid(null, this, y.class, "7")) {
             d uod = b.a(0x2c71dec4);
             if (this.a == null) {
                this.a = new s(this, uod);
             }
             uod.h(this.a);
          }
       }
       obj = new Object[]{p0,p1,p2};
       f2.b("NotifyDispatcher", "observeInternal: [%1$s] start observeInternal red dots types:=%2$s, ranges:=%3$s", obj);
       z c = d.c;
       return t.merge(t.just(Boolean.TRUE).observeOn(c), this.b.hide().observeOn(c).filter(super(p1, p0, p2)).debounce(500, TimeUnit.MILLISECONDS, c)).map(new w(p1, p2));
    }
}
