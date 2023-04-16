package com.kuaishou.live.core.show.luckystar.v2.openresult.LiveAudienceLuckyStarOpenResultPresenterV2;
import a51.c;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.live.core.show.luckystar.v2.openresult.LiveLuckyStarOpenResultPanelState;
import com.kuaishou.live.core.show.luckystar.v2.openresult.LiveAudienceLuckyStarOpenResultPresenterV2$b;
import com.kuaishou.live.core.show.luckystar.v2.openresult.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import com.kuaishou.live.core.show.luckystar.util.b;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import yb2.i;
import jc2.s;
import brd.x;
import brd.t;
import jc2.m;
import erd.g;
import crd.b;
import lnc.b9;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarOpenResultResponse;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger$StatusValue;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import java.lang.Integer;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import mkc.b;
import android.view.View;
import mkc.c;
import dc2.a;
import zb2.o;
import t45.d;
import brd.z;
import jc2.n;
import com.kuaishou.live.core.show.luckystar.v2.openresult.c;
import jc2.l;
import com.kuaishou.live.core.show.luckystar.v2.openresult.b;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiImageView;
import lnc.a1;
import z12.x;
import android.widget.ImageView;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import ekd.m1;
import com.kuaishou.live.core.show.luckystar.v2.openresult.LiveAudienceLuckyStarOpenResultPresenterV2$a;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import jc2.k;
import jc2.j;
import com.kuaishou.live.core.show.gift.LiveGiftResourcePathConstant;
import l12.d;
import va1.f0;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import android.graphics.drawable.Animatable;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class LiveAudienceLuckyStarOpenResultPresenterV2 extends c	// class@000d08
{
    public KwaiImageView A;
    public FrameLayout B;
    public KwaiImageView C;
    public KwaiImageView D;
    public View E;
    public View F;
    public TextView G;
    public ImageView H;
    public s I;
    public LiveLuckyStarOpenResultPanelState J;
    public boolean K;
    public LiveLuckyStarOpenResultResponse L;
    public LiveAudienceLuckyStarOpenResultPresenterV2$b M;
    public b N;
    public b O;
    public String P;
    public final h Q;
    public KwaiImageView v;
    public TextView w;
    public ImageView x;
    public KwaiImageView y;
    public TextView z;
    public static final List R;
    public static String sLivePresenterClassName;

    static {
       LiveAudienceLuckyStarOpenResultPresenterV2.R = LiveLogTag.LUCKY_STAR.appendTag("openResultV2");
    }
    public void LiveAudienceLuckyStarOpenResultPresenterV2(){
       super();
       this.J = LiveLuckyStarOpenResultPanelState.EMPTY;
       this.M = LiveAudienceLuckyStarOpenResultPresenterV2$b.c;
       this.Q = a.b;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceLuckyStarOpenResultPresenterV2.class, "3")) {
          return;
       }
       super.E8();
       b uob = new b();
       uob.g(KwaiRadiusStyles.R32);
       uob.v(b.e());
       this.C.setPlaceHolderImage(uob.a());
       this.M = new LiveAudienceLuckyStarOpenResultPresenterV2$b(this.V8().c, this.V8().p);
       this.I.b.compose(this.P8()).subscribe(new m(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceLuckyStarOpenResultPresenterV2.class, "4")) {
          return;
       }
       super.J8();
       this.S8();
       this.e9();
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceLuckyStarOpenResultPresenterV2.class, "18")) {
          return;
       }
       b9.a(this.N);
       b9.a(this.O);
       return;
    }
    public i V8(){
       return this.I.c;
    }
    public final void W8(LiveLuckyStarOpenResultResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLuckyStarOpenResultPresenterV2.class, "19")) {
          return;
       }
       LiveLuckyStarOpenResultResponse liveLuckySta = null;
       if (p0 != null) {
          liveLuckySta = p0.mWinType;
       }
       LiveAudienceLuckyStarOpenResultPresenterV2 tM = this.M;
       LiveLuckyStarLogger.o(this.V8().a.a(), tM.a, tM.b, Integer.valueOf(liveLuckySta));
       return;
    }
    public void X8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLuckyStarOpenResultPresenterV2.class, "21")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.V8().a.a();
       LiveAudienceLuckyStarOpenResultPresenterV2 tM = this.M;
       LiveAudienceLuckyStarOpenResultPresenterV2$b a = tM.a;
       LiveAudienceLuckyStarOpenResultPresenterV2$b b = tM.b;
       LiveAudienceLuckyStarOpenResultPresenterV2 tL = this.L;
       int i = (tL == null)? 0: tL.mWinType;
       LiveLuckyStarLogger.n(liveStreamPa, a, b, Integer.valueOf(i), p0);
       return;
    }
    public final void Y8(boolean p0){
       LiveAudienceLuckyStarOpenResultPresenterV2 liveAudience = LiveAudienceLuckyStarOpenResultPresenterV2.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "7")) {
          return;
       }
       b.S(LiveAudienceLuckyStarOpenResultPresenterV2.R, "requestOpenResult", "shouldShowLoadingView", Boolean.valueOf(p0));
       b[] uobArray = new b[]{b.g};
       c.d(this.E, uobArray);
       if (p0) {
          b.k(this.E);
          this.F.setVisibility(8);
       }
       this.S8();
       this.O = this.V8().n.a(new a(this.V8().a.getLiveStreamId(), this.M.a)).observeOn(d.a).subscribe(new n(this), new c(this));
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceLuckyStarOpenResultPresenterV2.class, "5")) {
          return;
       }
       b.P(LiveAudienceLuckyStarOpenResultPresenterV2.R, "requestRollingInfo");
       b[] uobArray = new b[]{b.g};
       c.d(this.E, uobArray);
       b.k(this.E);
       this.F.setVisibility(8);
       this.S8();
       this.N = this.V8().m.a(new a(this.V8().a.getLiveStreamId(), this.M.a)).observeOn(d.a).subscribe(new l(this), new b(this));
       return;
    }
    public final void a9(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLuckyStarOpenResultPresenterV2.class, "10")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       b.a(this.C, p0);
       return;
    }
    public final void b9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLuckyStarOpenResultPresenterV2.class, "8")) {
          return;
       }
       this.P = p0;
       this.H.setColorFilter(x.A(p0, a1.a(R.color.arg_RES_7f06060a)));
       return;
    }
    public final void c9(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceLuckyStarOpenResultPresenterV2.class, "9")) {
          return;
       }
       this.z.setText(TextUtils.k(p0));
       this.z.setTextColor(x.A(p1, a1.a(R.color.arg_RES_7f06147f)));
       return;
    }
    public final void d9(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLuckyStarOpenResultPresenterV2.class, "11")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       b.b(this.y, p0, a1.d(R.dimen.arg_RES_7f07081c));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLuckyStarOpenResultPresenterV2.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a215a);
       this.w = m1.f(p0, 0x7f0a2158);
       this.x = m1.f(p0, 0x7f0a2159);
       this.H = m1.f(p0, 0x7f0a2153);
       LiveAudienceLuckyStarOpenResultPresenterV2$a uoa = new LiveAudienceLuckyStarOpenResultPresenterV2$a(this);
       this.w.setOnClickListener(uoa);
       this.x.setOnClickListener(uoa);
       this.y = m1.f(p0, 0x7f0a215b);
       this.z = m1.f(p0, 0x7f0a2137);
       this.A = m1.f(p0, 0x7f0a2156);
       FrameLayout uFrameLayout = m1.f(p0, R.id.live_lucky_star_v2_result_got_it_container);
       this.B = uFrameLayout;
       uFrameLayout.setOnClickListener(new k(this));
       this.G = m1.f(p0, 0x7f0a2157);
       this.C = m1.f(p0, 0x7f0a2109);
       this.D = m1.f(p0, 0x7f0a2152);
       this.E = m1.f(p0, 0x7f0a2126);
       m1.a(p0, new j(this), R.id.live_lucky_star_v2_result_close_btn);
       this.F = m1.f(p0, 0x7f0a2154);
       f0.a(this.D, LiveGiftResourcePathConstant.LIVE_LUCKY_STAR_V2_GIFT);
       return;
    }
    public final void e9(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceLuckyStarOpenResultPresenterV2.class, "17")) {
          return;
       }
       a controller = this.v.getController();
       if (controller == null) {
          return;
       }
       Animatable animatable = controller.getAnimatable();
       if (animatable != null && animatable.isRunning()) {
          animatable.stop();
       }
       return;
    }
    public final void h9(boolean p0){
       LiveAudienceLuckyStarOpenResultPresenterV2 liveAudience = LiveAudienceLuckyStarOpenResultPresenterV2.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "15")) {
          return;
       }
       if (p0) {
          this.A.setVisibility(0);
          this.B.setVisibility(0);
          this.G.setVisibility(0);
          this.D.setVisibility(0);
       }else {
          this.A.setVisibility(8);
          this.B.setVisibility(8);
          this.G.setVisibility(8);
          this.w.setVisibility(8);
          this.x.setVisibility(8);
          this.D.setVisibility(8);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceLuckyStarOpenResultPresenterV2.class, "1")) {
          return;
       }
       this.I = this.q8(s.class);
       return;
    }
}
