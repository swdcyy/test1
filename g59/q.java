package g59.q;
import g59.q$b;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import g59.q$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.TimeUnit;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import brd.t;
import com.yxcorp.gifshow.feed.g;
import t45.d;
import brd.z;
import g59.r;
import g59.s;
import erd.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.k1;
import xf6.d;
import wkd.b;
import kka.h;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.VideoFeed;
import g59.t;
import tl8.d;
import ok.h;
import tl8.e;
import android.os.SystemClock;

public final class q	// class@002414
{
    public final long a;
    public long b;
    public b c;
    public final QPhoto d;
    public final q$a e;
    public static final q$b f;

    static {
       q.f = new q$b(null);
    }
    public void q(QPhoto p0,q$a p1){
       a.p(p0, "photo");
       a.p(p1, "callback");
       super();
       this.d = p0;
       this.e = p1;
       this.a = TimeUnit.SECONDS.toMillis(5);
    }
    public final void a(){
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq, "5")) {
          return;
       }
       if (this.c()) {
          if (!PatchProxy.applyVoid(objArray, this, oq, "6") && (this.b(this.d) && this.d.isVideoType())) {
             this.d.setNeedRetryFreeTraffic(true);
          }
       label_0031 :
          if (!PatchProxy.applyVoid(objArray, this, oq, "7")) {
             b9.a(this.c);
             t ot = g.c(this.d);
             a.o(ot, "PhotoApi.getPhoto\(photo\)");
             this.c = ot.observeOn(d.a).subscribe(new r(this), new s(this));
          }
       }else {
          this.e.a(this.d);
       }
       return;
    }
    public final boolean b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       k1.a(p0);
       boolean b = (d.S() || b.a(-1592356291).n(this.d.mEntity))? true: false;
       return b;
    }
    public final boolean c(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       q oq = q.class;
       Object[] objArray = null;
       q obj = PatchProxy.apply(objArray, this, oq, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.d;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, oq, "2");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): e.a(obj.getEntity(), VideoFeed.class, t.b);
       if (b) {
          Object obj2 = PatchProxy.apply(objArray, this, oq, "3");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else if((SystemClock.elapsedRealtime() - this.b) - this.a > 0){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             return true;
          }
       }
       if (this.b(this.d)) {
          return true;
       }else {
          return false;
       }
    }
}
