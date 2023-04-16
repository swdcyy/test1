package d59.i$a;
import z1.a;
import d59.i;
import java.lang.String;
import a59.a;
import java.lang.Object;
import c59.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter;
import kotlin.jvm.internal.a;
import im8.f;
import java.lang.System;
import java.lang.StringBuilder;
import yx.j0;
import c59.b;
import android.os.SystemClock;
import com.kwai.adclient.kscommerciallogger.snapshot.Span;
import a59.a$a;

public final class i$a implements a	// class@00204e
{
    public final long a;
    public final i b;
    public final String c;
    public final a d;

    public void i$a(long p0,i p1,String p2,a p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i$a.class, "1")) {
       }else {
          AdMKPageLoadPresenter x = this.b.d.x;
          if (x == null) {
             a.S("mMKPageJsonInfo");
          }
          x.set(p0);
          Object[] objArray = new Object[0];
          j0.f("AdMKLoadPresenter", "load "+this.c+" time cost "+(System.currentTimeMillis() - this.a), objArray);
          x = this.b.d.E;
          if (x != null && !PatchProxy.applyVoid(null, x, b.class, "4")) {
             x.d = SystemClock.elapsedRealtime();
          }
          a.o(p0, "it");
          this.b.d.R8().c("getPageJson = "+p0.a());
          i$a td = this.d;
          if (td != null) {
             a$a.a(td, p0.a(), null, 2, null);
          }
          PatchProxy.onMethodExit(i$a.class, "1");
       }
       return;
    }
}
