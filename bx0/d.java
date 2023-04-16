package bx0.d;
import k51.c;
import bx0.b;
import bx0.a;
import bx0.d$a;
import bx0.d$b;
import bx0.d$c;
import bx0.d$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.c$b;
import kq5.b;
import com.kwai.video.waynelive.listeners.LivePlayerBufferListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCAuthorPause;
import lf3.g;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCAuthorResume;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kuaishou.live.core.basic.utils.e;
import bx0.e;
import bx0.c;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import mq5.h;
import mq5.b;
import java.lang.Runnable;
import e93.f;
import e17.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import s91.b;
import com.kuaishou.live.core.basic.activity.x;
import e17.i$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.video.waynelive.LivePlayerController;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.android.live.model.QLivePlayConfig;
import yp5.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import tf1.b;
import t02.a0;

public class d extends c	// class@00042a
{
    public b A;
    public b B;
    public LiveSlidePlayService C;
    public final g D;
    public final g E;
    public c$b F;
    public Runnable G;
    public LivePlayerBufferListener H;
    public LivePlayerStateChangeListener I;
    public h J;
    public c K;
    public i L;
    public LivePlayerController p;
    public a0 q;
    public BaseFragment r;
    public QLivePlayConfig s;
    public a t;
    public LiveStreamFeedWrapper u;
    public LiveAudienceParam v;
    public a w;
    public b x;
    public x y;
    public b z;
    public static String sLivePresenterClassName = "LiveAudienceToastPresenter";

    public void d(){
       super();
       this.D = new b(this);
       this.E = new a(this);
       this.F = new d$a(this);
       this.G = new d$b(this);
       this.H = new d$c(this);
       this.I = new d$d(this);
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "2")) {
          return;
       }
       this.z.c(this.F);
       this.p.addBufferListener(this.H);
       this.p.addStateChangeListener(this.I);
       if (!a.t().d("liveAuchorBackgroundMask2", false)) {
          this.w.u0(301, LiveStreamMessages$SCAuthorPause.class, this.D);
          this.w.u0(302, LiveStreamMessages$SCAuthorResume.class, this.E);
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "9") && e.s(this.r.getActivity())) {
          e uoe = new e(this);
          this.K = uoe;
          this.J = new c(this);
          this.C.P4(uoe);
          this.B.Km(this.J);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       f.f(this.G);
       this.z.a(this.F);
       this.p.removeBufferListener(this.H);
       this.p.removeStateChangeListener(this.I);
       if (!a.t().d("liveAuchorBackgroundMask2", false)) {
          this.w.o(301, this.D);
          this.w.o(302, this.E);
       }
       d tK = this.K;
       if (tK != null) {
          this.C.d5(tK);
       }
       tK = this.J;
       if (tK != null) {
          this.B.le(tK);
       }
       this.P8();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       d tL = this.L;
       if (tL != null) {
          tL.h();
          this.L = null;
       }
       return;
    }
    public boolean R8(){
       Object obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.r.isAdded() && (!this.B.U0() && (!this.x.e() && this.y.a())))? true: false;
       return b;
    }
    public boolean S8(){
       d obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.L;
       if (obj == null) {
          return false;
       }
       this.L = i.z(obj.j());
       return true;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_PLAYER_CONTROLLER");
       this.r = this.r8("LIVE_FRAGMENT");
       this.s = this.r8("LIVE_PLAY_CONFIG");
       this.t = this.r8("LIVE_AUDIENCE_SKIN_CONFIG");
       this.u = this.r8("LIVE_PHOTO");
       this.v = this.r8("LIVE_AUDIENCE_PARAM");
       this.w = this.r8("LIVE_LONG_CONNECTION");
       this.x = this.r8("LIVE_AUDIENCE_SERVER_EXCEPTION_SERVICE");
       this.y = this.r8("LIVE_FRAGMENT_SERVICE");
       this.z = this.r8("FRAGMENT_LIFE_CYCLE_SERVICE");
       this.A = this.r8("LIVE_AUDIENCE_LOADING_SERVICE");
       this.B = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.C = this.r8("LIVE_SLIDE_PLAY_SERVICE");
       this.q = this.q8(a0.class);
       return;
    }
}
