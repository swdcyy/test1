package com.kwai.live.gzone.accompanyplay.audience.i0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import io.reactivex.subjects.PublishSubject;
import com.kwai.live.gzone.accompanyplay.audience.i0$a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.live.gzone.accompanyplay.audience.q;
import com.kwai.live.gzone.accompanyplay.audience.k0$h;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import brd.t;
import k37.b0;
import erd.g;
import crd.b;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyLoading$STYLE;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import mkc.b;
import mkc.c;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAudienceAccompanyState$State;
import com.kwai.live.gzone.accompanyplay.audience.i0$b;
import java.lang.Enum;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyPanelStyle;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import ekd.m1;
import o37.a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyUserOrderInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k37.a0;
import lnc.i3;
import com.kwai.live.gzone.accompanyplay.audience.p0$e;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$e;
import mrd.c;

public class i0 extends PresenterV2	// class@000b85
{
    public View A;
    public a B;
    public View C;
    public View D;
    public View E;
    public Map F;
    public ProgressFragment G;
    public PublishSubject H;
    public k0$g I;
    public LiveGzoneAccompanyTabHostFragment$e J;
    public c K;
    public q L;
    public k0$h M;
    public p0$e p;
    public View q;
    public View r;
    public View s;
    public View t;
    public View u;
    public View v;
    public View w;
    public View x;
    public View y;
    public View z;

    public void i0(){
       super();
       this.F = new HashMap();
       this.H = PublishSubject.g();
       this.L = new i0$a(this);
    }
    public static void V8(View p0,boolean p1){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, oi0, "21")) {
          return;
       }
       int i = (p1)? 0: 8;
       p0.setVisibility(i);
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "22")) {
          return;
       }
       k0$h oh = this.I.C(this.L);
       this.M = oh;
       oh.a(100);
       this.X7(this.I.n().subscribe(new b0(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "23")) {
          return;
       }
       this.M.a(200);
       this.I.C(null);
       this.P8();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "5")) {
          return;
       }
       LiveGzoneAccompanyLoading$STYLE[] sTYLEArray = LiveGzoneAccompanyLoading$STYLE.values();
       int len = sTYLEArray.length;
       for (int i = 0; i < len; i = i + 1) {
          this.R8(sTYLEArray[i]);
       }
       return;
    }
    public void R8(LiveGzoneAccompanyLoading$STYLE p0){
       i0 oi0 = i0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi0, "3")) {
          return;
       }
       Object[] objArray = null;
       if (p0 == LiveGzoneAccompanyLoading$STYLE.FLOAT_LOADING) {
          if (!PatchProxy.applyVoid(objArray, this, oi0, "9")) {
             i0 tG = this.G;
             if (tG != null && (tG.isAdded() && this.G.getFragmentManager() != null)) {
                this.G.dismiss();
             }
          label_0030 :
             this.G = objArray;
          }
       }else if(p0 != LiveGzoneAccompanyLoading$STYLE.INNER_LOADING || PatchProxy.applyVoid(objArray, this, oi0, "8")){
          b[] uobArray = new b[]{b.d};
          c.d(this.A, uobArray);
       }
       return;
    }
    public void S8(LiveGzoneAudienceAccompanyState$State p0,boolean p1){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oi0, "10")) {
          return;
       }
       switch (i0$b.a[p0.ordinal()]){
           case 1:
             if (!p1) {
                this.b9(p0, false);
                this.Z8(p0, false);
                this.X8(false);
                this.d9(false);
                this.W8(false);
                this.c9(false);
                this.e9(false);
                this.h9(false);
                this.Y8(false);
                this.a9(false);
             }
             break;
           case 3:
             this.b9(p0, p1);
             this.Z8(p0, p1);
             this.X8(p1);
             this.d9(p1);
             this.W8(p1);
             this.a9(p1);
             break;
           case 4:
           case 6:
           case 5:
             this.b9(p0, p1);
             this.Z8(p0, p1);
             this.X8(p1);
             this.Y8(p1);
             this.W8(p1);
             this.h9(p1);
             break;
           case 7:
             this.b9(p0, p1);
             this.Z8(p0, p1);
             this.X8(p1);
             this.Y8(p1);
             this.W8(p1);
             this.c9(p1);
             break;
           case 8:
             this.e9(p1);
             break;
           default:
       }
       if (p1) {
          this.I.l(p0.mPanelStyle);
       }
       return;
    }
    public final void W8(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "17")) {
          return;
       }
       i0.V8(this.w, p0);
       return;
    }
    public final void X8(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "13")) {
          return;
       }
       i0.V8(this.r, p0);
       return;
    }
    public final void Y8(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "14")) {
          return;
       }
       i0.V8(this.s, p0);
       return;
    }
    public final void Z8(LiveGzoneAudienceAccompanyState$State p0,boolean p1){
       if (PatchProxy.isSupport(i0.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, i0.class, "11")) {
          return;
       }
       i0.V8(this.q, p1);
       return;
    }
    public final void a9(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "15")) {
          return;
       }
       i0.V8(this.u, p0);
       i0.V8(this.t, p0);
       return;
    }
    public final void b9(LiveGzoneAudienceAccompanyState$State p0,boolean p1){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oi0, "12")) {
          return;
       }
       i0.V8(this.C, p1);
       if (p0 == LiveGzoneAudienceAccompanyState$State.UN_PAYMENT) {
          this.D.setMinimumHeight(a1.d(R.dimen.arg_RES_7f0707ad));
          p1.height = 0;
       }
       if (p0 == LiveGzoneAudienceAccompanyState$State.PLAYING) {
          this.D.setMinimumHeight(0);
          p0.height = -2;
       }else {
          this.D.setMinimumHeight(a1.d(R.dimen.arg_RES_7f0707ae));
          p0.height = 0;
       }
       if (this.C.getLayoutParams() instanceof LinearLayout$LayoutParams) {
          LinearLayout$LayoutParams layoutParams = this.C.getLayoutParams();
          layoutParams.weight = (layoutParams.height == null)? 0x3f800000: 0;
       }
    label_0078 :
       return;
    }
    public final void c9(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "18")) {
          return;
       }
       i0.V8(this.z, p0);
       return;
    }
    public final void d9(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "16")) {
          return;
       }
       i0.V8(this.v, p0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a11cb);
       this.r = m1.f(p0, 0x7f0a121b);
       this.v = m1.f(p0, 0x7f0a11d1);
       this.w = m1.f(p0, 0x7f0a11c3);
       this.x = m1.f(p0, 0x7f0a11ec);
       this.y = m1.f(p0, 0x7f0a11d5);
       this.z = m1.f(p0, 0x7f0a11cf);
       this.s = m1.f(p0, 0x7f0a11e2);
       this.u = m1.f(p0, 0x7f0a1220);
       this.t = m1.f(p0, 0x7f0a11c5);
       this.A = m1.f(p0, 0x7f0a11ed);
       this.E = m1.f(p0, 0x7f0a11cc);
       this.D = m1.f(p0, 0x7f0a11ee);
       this.C = m1.f(p0, 0x7f0a11ef);
       return;
    }
    public final void e9(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "19")) {
          return;
       }
       i0.V8(this.y, p0);
       if (p0) {
          i0 tB = this.B;
          if (tB != null) {
             this.I.A(tB.mUserOrderInfo.mOrderId);
          }
       }
       return;
    }
    public final void h9(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "20")) {
          return;
       }
       i0.V8(this.x, p0);
       if (p0) {
          i0 tB = this.B;
          if (tB != null && tB.mGameInfo.mEnableOneClick != null) {
             ClientContent$LiveStreamPackage liveStreamPa = this.I.a();
             oi0 = this.B;
             if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, oi0, null, a0.class, "25")) {
                a0.k("ACCOMPANY_USER_START_GAME_BUTTON", a0.a(oi0).e(), liveStreamPa, oi0);
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "1")) {
          return;
       }
       this.I = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE");
       this.p = this.r8("LIVE_GZONE_ACCOMPANY_SDK_SERVICE");
       this.J = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_TAB_HOST_SERVICE");
       this.K = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_MODIFY_GAME_INFO_SUBJECT");
       return;
    }
}
