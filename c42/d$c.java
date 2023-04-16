package c42.d$c;
import a42.a;
import c42.d;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import a42.b;
import yj2.a;
import kp.r1;
import com.yxcorp.gifshow.log.c0;

public class d$c implements a	// class@0004b3
{
    public final d a;

    public void d$c(d p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = x.e(p0.getEntity(), 2);
       liveStreamPa.showIndexPlusOne = (long)(this.a.D.s1(p0) + 1);
       this.a.V8(p0);
       this.a.R8(p0);
       a.c(p0.mEntity, liveStreamPa, 7, 7, false);
       return;
    }
    public void b(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "2")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = x.e(p0.getEntity(), 2);
       int i = 1;
       liveStreamPa.showIndexPlusOne = (long)(this.a.D.s1(p0) + i);
       if (!p0.isShowed()) {
          p0.setShowed(i);
          a.d(p0.mEntity, liveStreamPa, 7, 7);
          r1.g5(p0.mEntity, this.a.D.s1(p0));
          c0.q().k(p0.mEntity);
       }
       return;
    }
}
