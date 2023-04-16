package bm0.f$b;
import bm0.f$d;
import bm0.f;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import tkd.b;
import tkd.d;
import lm9.a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import ul9.e;
import brd.t;
import bm0.g;
import erd.g;
import crd.b;
import bm0.f$c;
import java.lang.ref.WeakReference;
import lm9.a$b;

public class f$b implements f$d	// class@0003bf
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public boolean a(LiveStreamFeed p0,boolean p1){
       LiveLogTag obj1;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (p1) {
          obj1 = PatchProxy.applyOneRefs(p0, this, uob, "5");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             b.Z(LiveLogTag.LIVE_TVC_AD, "check canShowTvcSync for "+p0.getId());
             obj1.s = p0;
             b = d.a(-1638991736).Zg(p0);
          }
          return b;
       }else {
          obj1 = PatchProxy.applyOneRefs(p0, this, uob, "4");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             obj1.s = p0;
             obj1 = LiveLogTag.LIVE_TVC_AD;
             b.Z(obj1, "check canShowTvcAsync for "+p0.getId());
             if (d.a(-1638991736).SW(p0, Boolean.FALSE)) {
                b.Z(obj1, "Tvc tag valid for "+p0.getId());
                b = true;
             }else {
                b = false;
             }
          }
          return b;
       }
    }
    public void b(LiveAudienceParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "2")) {
          return;
       }
       e a = e.a;
       if (!a.b()) {
          a.a().subscribe(new g(this, p0));
       }else {
          this.c(p0);
       }
       return;
    }
    public final void c(LiveAudienceParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "3")) {
          return;
       }
       if (p0.mPhoto == null) {
          b.B(LiveLogTag.LIVE_TVC_AD, "tryShowTvc for mPhoto is null");
       }
       LiveLogTag lIVE_TVC_AD = LiveLogTag.LIVE_TVC_AD;
       b.Z(lIVE_TVC_AD, "tryShowTvc for "+p0.mPhoto.getId());
       f$b ta = this.a;
       ta.s = p0.mPhoto;
       ta.u = p0;
       int i = -1638991736;
       if (d.a(i).Zg(p0.mPhoto)) {
          b.Z(lIVE_TVC_AD, "Tvc data valid");
          this.a.R8();
       }else {
          d.a(i).RI(p0.mPhoto, new f$c(new WeakReference(this.a)), false);
       }
       return;
    }
}
