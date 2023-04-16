package com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$d$b;
import t99.b;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter;
import oha.t$a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import java.util.HashMap;
import u99.d;
import com.kwai.video.waynelive.LivePlayerController;

public final class HomeLiveAutoPlayPresenter$d$b implements b	// class@0010bf
{
    public final HomeLiveAutoPlayPresenter$d a;

    public void HomeLiveAutoPlayPresenter$d$b(HomeLiveAutoPlayPresenter$d p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,int p1,int p2,int p3,int p4){
       HomeLiveAutoPlayPresenter$d$b uod$b = HomeLiveAutoPlayPresenter$d$b.class;
       if (PatchProxy.isSupport(uod$b)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uod$b, "1")) {
             return;
          }
       }
       if (p2) {
          this.a.c.Y = ((float)p1 * 0x3f800000) / (float)p2;
       }
       HomeLiveAutoPlayPresenter$d c = this.a.c;
       int b = (p0)? t$a.b: t$a.c;
       c.X = b;
       r1.M4(c.Y8().getEntity(), this.a.c.X);
       r1.Z4(this.a.c.Y8().getEntity(), this.a.c.Y);
       HomeLiveAutoPlayPresenter r = this.a.c.R;
       if (r == null) {
          a.S("mPlayModule");
       }
       Objects.requireNonNull(r);
       LiveAutoPlayModule liveAutoPlay = LiveAutoPlayModule.class;
       if (!PatchProxy.isSupport(liveAutoPlay) || (PatchProxy.applyVoidTwoRefs(Integer.valueOf(p3), Integer.valueOf(p4), r, liveAutoPlay, "38") || (p3 > 0 && (p4 >= 0 && (r.G != p3 || r.H != p4))))) {
          r.G = p3;
          r.H = p4;
          d.h("LiveAutoPlayModule", "setViewSize", r.Q());
          liveAutoPlay = r.k;
          if (liveAutoPlay != null) {
             liveAutoPlay.setViewPixelSize(r.G, r.H);
          }
       }
    label_00ca :
       return;
    }
}
