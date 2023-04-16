package h82.z;
import c12.f;
import h82.b0;
import androidx.lifecycle.MutableLiveData;
import h82.q;
import h82.r;
import h82.z$a;
import h82.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import x61.c;
import lp3.c;
import lp3.i;
import t02.a0;
import androidx.lifecycle.LiveData;
import kg1.f;
import androidx.lifecycle.Observer;
import kg1.f$b;
import kg1.e;
import crd.b;
import lnc.b9;
import com.kwai.framework.model.user.QCurrentUser;
import hq5.a;
import lnc.a1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import va1.d0;
import h82.w;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import wj2.r0;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import z61.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import h82.t;
import h82.v;
import h82.u;
import h82.n;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import kg1.i;
import crd.a;
import brd.t;
import ry1.b;
import h82.x;
import h82.y;
import erd.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import t45.d;
import brd.z;
import h82.p;
import lj1.f;
import h82.o;
import eoc.f;

public class z extends f	// class@002cf2
{
    public final String K;
    public i L;
    public a0 M;
    public r0 N;
    public LivePlayLogger O;
    public LiveStreamFeedWrapper P;
    public final b0 Q;
    public final MutableLiveData R;
    public a S;
    public boolean T;
    public final Observer U;
    public final Observer V;
    public final f$b W;
    public final Observer X;
    public static String sLivePresenterClassName = "LiveAudienceBottomBarFollowUserAndFansGroupPresenterV3";

    public void z(){
       super();
       this.K = "LiveAudienceBottomBarFollowUserAndFansGroupPresenterV3";
       this.Q = new b0();
       this.R = new MutableLiveData();
       this.U = new q(this);
       this.V = new r(this);
       this.W = new z$a(this);
       this.X = new s(this);
    }
    public void Q(boolean p0){
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oz, "4")) {
          return;
       }
       boolean b = false;
       if (!PatchProxy.applyVoid(null, this, oz, "5")) {
          oz = this.Q;
          oz.g = b;
          oz.d = b;
          oz.c = b;
          oz.f = b;
          oz.e = b;
          this.L.a(c.class).O0(1015);
       }
       this.T = b;
       this.M.r1.sn().removeObserver(this.U);
       this.M.r1.md().removeObserver(this.V);
       this.M.r1.W2().removeObserver(this.X);
       this.M.r1.rn(this.W);
       b9.a(this.S);
       this.S = null;
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, z.class, "9")) {
          return;
       }
       if (QCurrentUser.me().isLogined()) {
          this.M.Y.Wj(158);
          return;
       }else {
          y.a(this.getActivity(), d0.a(this.M.c), "live_follow", 42, a1.p(R.string.arg_RES_7f103077), this.M.c.mEntity, null, null, new w(this));
          return;
       }
    }
    public final int b9(){
       int i;
       z obj = PatchProxy.apply(null, this, z.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = null;
       if (this.M.r1.sn().getValue() != null) {
          i = this.M.r1.sn().getValue().intValue();
       }
       return i;
    }
    public final int c9(){
       Object obj = PatchProxy.apply(null, this, z.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!this.e9()) {
          return 0;
       }
       if (this.Q.c == null) {
          return 1;
       }
       if (this.b9() > 0) {
          return 3;
       }
       return 2;
    }
    public final boolean d9(){
       Object obj = PatchProxy.apply(null, this, z.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.e9() || this.Q.c != null)? true: false;
       return b;
    }
    public final boolean e9(){
       Object obj = PatchProxy.apply(null, this, z.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (QCurrentUser.me().isLogined() && this.P.getUser().isFollowingOrFollowRequesting())? true: false;
       return b;
    }
    public void h9(boolean p0){
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oz, "3")) {
          return;
       }
       oz = this.Q;
       oz.i = p0;
       this.R.setValue(oz);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       super.j8();
       this.M = this.q8(a0.class);
       this.N = this.s8(r0.class);
       this.P = this.r8("LIVE_PHOTO");
       this.O = this.t8("LIVE_PLAY_LOGGER");
       this.L = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
    public final void j9(boolean p0){
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oz, "8")) {
          return;
       }
       this.Q.mFeatureId = 1015;
       if (this.P.getUser() != null && !TextUtils.x(this.P.getUser().mAvatar)) {
          this.Q.a = this.P.getUser().mAvatar;
       }
       LiveData liveData = this.M.r1.W2();
       if (liveData != null && liveData.getValue() != null) {
          this.Q.f = liveData.getValue().intValue();
       }
       oz = this.Q;
       oz.c = p0;
       oz.d = this.b9();
       p0.e = this.M.r1.u3();
       p0.g = this.c9();
       p0.mIsVisible = Boolean.valueOf(this.d9());
       t ot = new t(this);
       oz = this.Q;
       oz.mClickLogParamsSupplier = ot;
       oz.mShowLogParamsSupplier = ot;
       oz.b = new v(this);
       oz.mClickCallback = new u(this);
       oz.l = new n(this);
       this.R.setValue(oz);
       this.L.a(c.class).v1(this.R);
       if (this.Q.mIsVisible.booleanValue()) {
          this.k9();
       }
       return;
    }
    public final void k9(){
       if (PatchProxy.applyVoid(null, this, z.class, "15")) {
          return;
       }
       if (this.T != null) {
          return;
       }
       b0 g = this.Q.g;
       if (g == 3 || g == 2) {
          this.T = true;
          i.h(this.M.Z2.b(), false, this.M.Z2.a());
       }
       return;
    }
    public void x(boolean p0){
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oz, "2")) {
          return;
       }
       a uoa = new a();
       this.S = uoa;
       uoa.c(this.M.b3.T3().subscribe(new x(this), new y(this)));
       this.M.r1.W2().observeForever(this.X);
       this.S.c(RxBus.f.f(n.class).observeOn(d.a).subscribe(new p(this)));
       this.M.r1.sn().observeForever(this.U);
       this.M.r1.md().observeForever(this.V);
       this.M.r1.Mb(this.W);
       this.S.c(f.a(f.class, new o(this)));
       return;
    }
}
