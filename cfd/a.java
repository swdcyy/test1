package cfd.a;
import u99.g;
import cfd.d;
import java.lang.Object;
import u99.f;
import u99.b;
import q7d.e0;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import k2b.i3;
import uy5.a;
import java.lang.StringBuilder;
import q87.c;
import u99.c;
import brd.t;
import cfd.c;
import erd.o;
import t45.d;
import brd.z;
import cfd.b;
import yed.c;
import erd.g;
import crd.b;

public final class a implements g	// class@000319
{
    public final d a;

    public void a(d p0){
       this.a = p0;
    }
    public final void a(f p0,b p1){
       z c;
       a a = this.a;
       e0 uoe0 = e0.class;
       SearchItem mStatRecord = a.r.mStatRecord;
       Objects.requireNonNull(mStatRecord);
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, mStatRecord, uoe0, "3");
       long l = (obj != PatchProxyResult.class)? obj.longValue(): mStatRecord.a.k();
       long l1 = (l > 0)? l: p0.d();
       Object[] objArray1 = new Object[0];
       a.C().s("VideoStateReportPresenter", "searchCollectPlayedDuration : "+l+", collector playDuration : "+p0.d(), objArray1);
       mStatRecord = a.r.mStatRecord;
       Objects.requireNonNull(mStatRecord);
       if (!PatchProxy.applyVoid(objArray, mStatRecord, uoe0, "4")) {
          mStatRecord.a = new i3();
          mStatRecord.b = objArray;
       }
       b b = p1.b;
       if (l1 + b) {
          int i = a.s.a();
          c uoc = new c(a, p0, p1, l1, b, i);
          t ot = t.just(a.p).map(v15);
          if (i != 14) {
             c = d.c;
             ot = ot.observeOn(c).subscribeOn(c);
          }
          ot.subscribe(new b(a), c.a);
       }
       return;
    }
}
