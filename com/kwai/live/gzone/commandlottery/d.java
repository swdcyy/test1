package com.kwai.live.gzone.commandlottery.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import c47.m;
import com.kwai.live.gzone.commandlottery.d$a;
import c47.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.common.keyswitch.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.live.gzone.common.keyswitch.b;
import com.kwai.live.gzone.common.keyswitch.LiveGzoneKeys;
import com.kwai.live.gzone.common.keyswitch.b$d;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneLiveActivityCommonNotice;
import lf3.g;
import hf3.a;
import mq5.h;
import mq5.b;
import crd.b;
import lnc.b9;
import oq5.c;
import oq5.a;
import ekd.k1;
import com.kwai.library.widget.popup.common.c;
import androidx.fragment.app.KwaiDialogFragment;
import fq5.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import ft5.b;
import vq5.d;
import oq5.b;

public class d extends PresenterV2	// class@000c95
{
    public c A;
    public final g B;
    public d$b C;
    public a D;
    public LiveGzoneAudienceCommandLotteryResultDialog E;
    public LiveGzoneAudienceCommandLotteryNoticeDialog F;
    public h G;
    public boolean p;
    public b q;
    public a r;
    public b s;
    public LiveStreamFeedWrapper t;
    public b u;
    public d v;
    public b w;
    public a x;
    public c y;
    public b z;

    public void d(){
       super();
       this.y = PublishSubject.g();
       this.B = new m(this);
       this.C = new d$a(this);
       this.G = new n(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "2")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, objArray, a.class, "25");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): b.b().a(LiveGzoneKeys.KEY_ENABLE_LIVE_GAME_PASSWORD_LOTTERY_FEATURE).a();
       if (!b) {
          return;
       }else {
          this.r.u0(916, SCGzoneLiveActivityCommonNotice.class, this.B);
          this.s.Km(this.G);
          return;
       }
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "9")) {
          return;
       }
       b9.a(this.z);
       d tA = this.A;
       if (tA != null) {
          this.x.Q0(tA);
          this.A = objArray;
       }
       this.r.o(916, this.B);
       this.s.le(this.G);
       k1.n(this);
       this.P8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       d tD = this.D;
       if (tD != null && tD.K()) {
          this.D.q(0);
          this.D = null;
       }
       tD = this.E;
       if (tD != null) {
          tD.dismissAllowingStateLoss();
          this.E = null;
       }
       tD = this.F;
       if (tD != null) {
          tD.dismissAllowingStateLoss();
          this.F = null;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_BASIC_CONTEXT");
       this.r = this.r8("LIVE_LONG_CONNECTION");
       this.s = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.t = this.r8("LIVE_PHOTO");
       this.u = this.r8("LIVE_AUDIENCE_SEND_COMMENTS_SERVICE");
       this.v = this.r8("LIVE_ROUTER_SERVICE");
       this.w = this.s8(b.class);
       this.x = this.r8("LIVE_CONFIGURATION_SERVICE");
       return;
    }
}
