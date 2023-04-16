package d59.w;
import z1.a;
import d59.v;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.lang.StringBuilder;
import yx.j0;
import kotlin.jvm.internal.a;
import x49.q;
import com.yxcorp.gifshow.ad.tachikoma.a;

public final class w implements a	// class@002065
{
    public final v a;
    public final long b;
    public final PhotoAdvertisement$TkTemplateInfo c;

    public void w(v p0,long p1,PhotoAdvertisement$TkTemplateInfo p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "1")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          j0.f("adtkLoadPresenter", "asyncInit end,state :"+p0+" costTime = "+(System.currentTimeMillis() - this.b), objArray);
          a.o(p0, "initState");
          if (p0.booleanValue()) {
             p0 = this.a;
             p0.y.b(this.c, p0.D);
          }else {
             p0 = new Object[i];
             j0.c("adtkLoadPresenter", "async init failed ", p0);
          }
       }
       return;
    }
}
