package com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBar;
import pp3.b;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBar$mTunaItem$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import x61.c;
import lp3.c;
import lp3.e;
import pp3.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.m;
import nl8.l;
import com.kuaishou.livestream.message.nano.LiveBsStateMessages$SCLiveCurrentBsState;
import kotlin.jvm.internal.a;
import z61.e;
import z61.b;
import java.lang.Boolean;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import com.kuaishou.livestream.message.nano.LiveBsStateMessages$SCLiveCurrentBsState$Button;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.tuna.util.LiveTunaUtils;
import com.kwai.robust.PatchProxyResult;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import z61.l;
import pp3.b$a;
import nl8.o;

public final class LiveTunaAudienceBottomBar implements b	// class@000f92
{
    public e a;
    public final MutableLiveData b;
    public final p c;
    public boolean d;
    public b$a e;

    public void LiveTunaAudienceBottomBar(){
       super();
       this.b = new MutableLiveData();
       this.c = s.c(new LiveTunaAudienceBottomBar$mTunaItem$2(this));
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveTunaAudienceBottomBar.class, "4")) {
          return;
       }
       LiveTunaAudienceBottomBar ta = this.a;
       if (ta != null) {
          c uoc = ta.a(c.class);
          if (uoc != null) {
             uoc.O0(1017);
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveTunaAudienceBottomBar.class, "3")) {
          return;
       }
       LiveTunaAudienceBottomBar ta = this.a;
       if (ta != null) {
          c uoc = ta.a(c.class);
          if (uoc != null) {
             this.b.setValue(this.l());
             uoc.v1(this.b);
          }
       }
       return;
    }
    public void e(PresenterV2 p0){
       l.a(this, p0);
    }
    public void g(LiveBsStateMessages$SCLiveCurrentBsState p0){
       boolean b1;
       LiveTunaAudienceBottomBar liveTunaAudi = LiveTunaAudienceBottomBar.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveTunaAudi, "6")) {
          return;
       }
       a.p(p0, "msg");
       p0 = p0.activeButton;
       boolean b = true;
       this.l().b = b;
       this.l().mShouldReportLogWithBottomBar = false;
       this.l().mIsVisible = Boolean.FALSE;
       this.l().mIconRes = 0x7f081135;
       this.l().mTextRes = 0x7f10040d;
       this.l().mIconUrl = LiveTunaUtils.d(p0.iconV2);
       Object obj = PatchProxy.apply(null, this, liveTunaAudi, "7");
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else {
          boolean b2 = a.t().d("tunaLiveBottomIconLottie", false);
          if (!l.c("test_switch_tuna_plc_live_bottom_bar_lottie", false) && !b2) {
             b = 0;
          }
          b1 = b;
       }
       if (b1) {
          this.l().mLottieAnimation = LiveTunaUtils.d(p0.lottieIcon);
       }
       this.b.setValue(this.l());
       return;
    }
    public void h(b$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTunaAudienceBottomBar.class, "8")) {
          return;
       }
       a.p(p0, "listener");
       this.e = p0;
       return;
    }
    public void i(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTunaAudienceBottomBar.class, "2")) {
          return;
       }
       a.p(p0, "injector");
       this.a = p0.f("LIVE_SERVICE_MANAGER");
       return;
    }
    public boolean isVisible(){
       return this.d;
    }
    public final c l(){
       Object obj = PatchProxy.apply(null, this, LiveTunaAudienceBottomBar.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public void setVisible(boolean p0){
       LiveTunaAudienceBottomBar liveTunaAudi = LiveTunaAudienceBottomBar.class;
       if (PatchProxy.isSupport(liveTunaAudi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveTunaAudi, "5")) {
          return;
       }
       this.l().mIsVisible = Boolean.valueOf(p0);
       this.b.setValue(this.l());
       return;
    }
}
