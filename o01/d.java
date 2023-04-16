package o01.d;
import k51.c;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import o01.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.SCLiveGiftPanelRefresh;
import lf3.g;
import hf3.a;
import crd.b;
import lnc.b9;
import java.lang.Boolean;
import com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchInfo;
import com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchContainer;
import com.kwai.framework.model.user.QCurrentUser;
import wz2.a$a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import wz2.a;
import com.kuaishou.live.effect.resource.download.common.e;
import vz2.a;
import t02.a0;
import p91.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mk1.h;

public class d extends c	// class@003447
{
    public final List p;
    public h q;
    public b r;
    public a s;
    public a0 t;
    public final g u;
    public static String sLivePresenterClassName = "LiveAudienceGiftInfoUpdatePresenter";

    public void d(){
       super();
       this.p = LiveLogTag.GIFT.appendTag("LiveAudienceGiftInfoUpdatePresenter");
       this.u = new a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.s.u0(797, SCLiveGiftPanelRefresh.class, this.u);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.s.o(797, this.u);
       b9.a(this.r);
       return;
    }
    public final void P8(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "5")) {
          return;
       }
       if (p0) {
          return;
       }
       LiveEffectDownloadSwitchInfo matchedSwitc = LiveEffectDownloadSwitchContainer.getMatchedSwitchInfo();
       if (QCurrentUser.me().isLogined() && matchedSwitc.enablePreDownloadOnUpdateGift != null) {
          a$a uoa = new a$a();
          uoa.e(4);
          uoa.c(1);
          uoa.d(3);
          uoa.h(1);
          uoa.f((matchedSwitc.enablePreDownloadOnUpdateGift ^ 1));
          uoa.j(RequestTiming.DEFAULT);
          a uoa1 = uoa.a();
          e.b().he().c(this.t.Z2.getLiveStreamId(), false, uoa1);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.t = this.q8(a0.class);
       this.q = this.q8(h.class);
       this.s = this.r8("LIVE_LONG_CONNECTION");
       return;
    }
}
