package com.kwai.live.gzone.propshop.h;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.propshop.h$a;
import java.lang.reflect.Type;
import el.a;
import com.kwai.live.gzone.propshop.h$e;
import v67.j;
import com.kwai.live.gzone.propshop.f;
import v67.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.propshop.c;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import x61.c;
import lp3.c;
import lp3.e;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneVirtualTradeOpened;
import com.kwai.live.gzone.propshop.e;
import lf3.g;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneVirtualTradeClosed;
import v67.i;
import mq5.h;
import mq5.b;
import com.kwai.live.gzone.propshop.h$b;
import vq5.b;
import vq5.d;
import crd.b;
import lnc.b9;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import aq5.d;
import oq5.c;
import oq5.a;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.Context;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import f37.o0;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import v67.m;
import erd.g;
import com.kwai.library.widget.popup.common.c;
import v67.d;
import android.view.View$OnClickListener;
import fq5.b;
import v67.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import lnc.a1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.live.gzone.widget.f$b;
import androidx.fragment.app.FragmentActivity;
import com.kwai.live.gzone.widget.e$a;
import com.kwai.live.gzone.propshop.h$d;
import m67.c0$a;
import m67.c0;
import f37.a;
import android.content.SharedPreferences;
import u07.t$a;
import u07.f;
import com.kwai.live.gzone.propshop.g;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.KwaiDialogFragment;
import u37.d;
import u37.e;
import cjd.e;
import erd.o;
import v67.l;
import erd.a;
import com.kwai.live.gzone.propshop.i;
import com.kwai.live.gzone.propshop.d;
import m67.b;
import com.kwai.live.gzone.propshop.h$c;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GzoneVirtualTradeBubble;
import v67.h;
import v67.p;
import java.util.Map;
import java.util.HashMap;
import j47.c;
import nl8.m;

public class h extends PresenterV2 implements g	// class@000dea
{
    public String A;
    public boolean B;
    public boolean C;
    public e D;
    public b E;
    public b F;
    public c G;
    public LiveStreamMessages$GzoneVirtualTradeBubble H;
    public ProgressFragment I;
    public c J;
    public c0 K;
    public final h L;
    public b M;
    public c N;
    public boolean p;
    public final a q;
    public LinkedHashMap r;
    public b s;
    public a t;
    public c u;
    public a v;
    public b w;
    public d x;
    public d y;
    public e z;
    public static final Type O;

    static {
       h.O = new h$a().getType();
    }
    public void h(){
       super();
       this.p = true;
       this.q = new h$e(this);
       this.L = new j(this);
       this.M = new f(this);
       this.N = new k(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "3")) {
          return;
       }
       c uoc = this.X8();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoid(objArray, uoc, c.class, "5")) {
          uoc.c.setValue(uoc.b);
          uoc.a.a(c.class).v1(uoc.c);
       }
       this.v.u0(670, LiveStreamMessages$SCGzoneVirtualTradeOpened.class, new e(this));
       this.v.u0(671, LiveStreamMessages$SCGzoneVirtualTradeClosed.class, new i(this));
       this.w.Km(this.L);
       this.x.t5("gzonesellvirtualprops", new h$b(this));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "11")) {
          return;
       }
       this.A = objArray;
       this.H = objArray;
       this.B = false;
       this.C = false;
       this.V8();
       this.w.le(this.L);
       b9.a(this.E);
       this.x.Z4("gzonesellvirtualprops");
       this.W8();
       b9.a(this.F);
       a[] uoaArray = new a[]{AudienceBizRelation.BOTTOM_BAR_TIP};
       this.y.G5(this.M, uoaArray);
       this.t.Q0(this.N);
       k1.n(this);
       c uoc = this.X8();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoid(objArray, uoc, c.class, "6")) {
          uoc.a.a(c.class).O0(4001);
       }
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, h.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.H != null && (!this.t.H2() && !this.y.r2(AudienceBizRelation.BOTTOM_BAR_TIP)))? true: false;
       return b;
    }
    public final boolean R8(){
       Object obj = PatchProxy.apply(null, this, h.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (QCurrentUser.me().isLogined()) {
          return true;
       }
       o0.j(this.getContext(), this.getActivity().getUrl(), "live_play_gzone_prop_shop", 0, null, null, null, null, null);
       return false;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, h.class, "6")) {
          return;
       }
       if (!this.P8()) {
          return;
       }
       b9.a(this.F);
       this.F = t.timer(3000, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new m(this));
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, h.class, "23")) {
          return;
       }
       h tD = this.D;
       if (tD != null && tD.K()) {
          this.D.o();
          this.D = null;
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, h.class, "16")) {
          return;
       }
       h tG = this.G;
       if (tG != null) {
          tG.o();
          this.G = null;
       }
       return;
    }
    public c X8(){
       Object obj = PatchProxy.apply(null, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.J == null) {
          this.J = new c(new d(this));
       }
       return this.J;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, h.class, "19")) {
          return;
       }
       this.a9();
       String str = this.s.d();
       String id = QCurrentUser.ME.getId();
       if (!PatchProxy.applyVoidTwoRefs(str, id, null, c.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GAME_PROPS_CART";
          uElementPack.params = c.a(str, id);
          u1.u(1, uElementPack, null);
       }
       return;
    }
    public void Z8(String p0){
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "20")) {
          return;
       }
       this.V8();
       GifshowActivity activity = this.getActivity();
       if (!a1.i(activity) || (!this.s.b().isAdded() || (this.s.b().getFragmentManager() != null && !TextUtils.x(p0)))) {
          f$b uob = new f$b(activity);
          uob.g0(p0);
          boolean b = true;
          uob.e0(b);
          uob.f0(this.s);
          uob.b0(a1.e(300.00f));
          this.K.S0(uob, new h$d(this));
          if (this.B != null && (!PatchProxy.applyVoid(null, this, oh, "10") && a.a.getBoolean("isShowLiabilityExemptionDialog", b))) {
             t$a uoa = f.e(new t$a(this.getActivity()));
             uoa.W0(R.string.arg_RES_7f101481);
             uoa.y0(R.string.arg_RES_7f101480);
             uoa.S0(R.string.arg_RES_7f1012a9);
             uoa.u0(g.b);
             uoa.z(false);
             uoa.A(false);
             uoa.Y(PopupInterface.a);
          }
       }
    label_00a6 :
       return;
    }
    public void a9(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "18")) {
          return;
       }
       if (!this.R8()) {
          return;
       }
       if (this.B != null && TextUtils.x(this.A)) {
          if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, this, oh, "9")) {
             if (!PatchProxy.applyVoid(objArray, this, oh, "21")) {
                oh = this.I;
                if (oh == null || !oh.isAdded()) {
                   ProgressFragment progressFrag = new ProgressFragment();
                   this.I = progressFrag;
                   progressFrag.Jh(a1.p(R.string.arg_RES_7f103667));
                   this.I.Cb(this.getActivity().getSupportFragmentManager(), "gzone-loading");
                }
             }
             b9.a(this.E);
             this.E = e.b().i(this.s.getLiveStreamId(), "").map(new e()).doFinally(new l(this)).subscribe(new i(this), d.b);
          }
       }else {
          this.Z8(this.A);
       }
       return;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, h.class, "13")) {
          return;
       }
       if (!this.P8()) {
          return;
       }
       int[] ointArray = this.z.a(c.class).T0(4001, 2);
       if (ointArray == null) {
          return;
       }
       h tH = this.H;
       c$b uob = new c$b(this.getActivity());
       uob.M(new h$c(this, tH));
       b uob1 = new b(uob, ointArray, tH, new h(this, tH));
       uob1.Z();
       this.G = uob1;
       this.H = null;
       return;
    }
    public void c9(String p0,boolean p1){
       this.B = p1;
       if (!p1) {
          this.A = p0;
       }
       return;
    }
    public final void d9(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "12")) {
          return;
       }
       if (p0) {
          this.X8().setVisible(true);
       }else {
          this.X8().setVisible(false);
          this.W8();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, h.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(h.class, new p());
       }else {
          obj.put(h.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.s = this.r8("LIVE_BASIC_CONTEXT");
       this.t = this.r8("LIVE_CONFIGURATION_SERVICE");
       this.u = this.q8(c.class);
       this.v = this.r8("LIVE_LONG_CONNECTION");
       this.w = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.x = this.r8("LIVE_ROUTER_SERVICE");
       this.y = this.r8("LIVE_BIZ_RELATION_SERVICE");
       this.z = this.r8("LIVE_SERVICE_MANAGER");
       this.K = this.q8(c0.class);
       this.X8().e(this);
       return;
    }
}
