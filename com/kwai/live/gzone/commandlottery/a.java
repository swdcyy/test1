package com.kwai.live.gzone.commandlottery.a;
import com.kwai.live.gzone.widget.e;
import com.kwai.live.gzone.commandlottery.a$c;
import com.kwai.live.gzone.widget.e$a;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import c47.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.airbnb.lottie.LottieAnimationView;
import androidx.appcompat.widget.AppCompatImageView;
import bjd.d;
import bb6.c;
import com.kwai.framework.network.cdn.CdnHostGroupType;
import java.util.Map;
import java.util.Collections;
import com.airbnb.lottie.RenderMode;
import c47.k;
import android.animation.Animator$AnimatorListener;
import mkc.b;
import mkc.c;
import d47.c;
import ok.x;
import e47.a;
import e47.a$a;
import brd.t;
import cjd.e;
import erd.o;
import com.kwai.live.gzone.commandlottery.b;
import com.kwai.live.gzone.commandlottery.c;
import erd.g;
import crd.b;
import com.kwai.library.widget.popup.common.c;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import ekd.m1;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import c47.f;
import android.view.View$OnClickListener;
import c47.g;
import c47.h;
import c47.i;
import com.yxcorp.gifshow.tips.TipsContainer;
import android.os.Bundle;
import lnc.l1;
import java.lang.Integer;
import c47.j;
import android.view.ViewOutlineProvider;
import android.view.ViewGroup;
import ekd.e0;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.app.Activity;
import u07.t$a;
import u07.f;
import com.kwai.live.gzone.commandlottery.a$b;
import u07.u;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.live.gzone.commandlottery.a$a;
import java.lang.Boolean;

public class a extends e	// class@000c90
{
    public ImageView A;
    public TextView B;
    public KwaiImageView C;
    public TextView D;
    public TextView E;
    public LottieAnimationView F;
    public LottieAnimationView G;
    public LottieAnimationView H;
    public TipsContainer I;
    public a J;
    public b K;
    public d$b L;
    public b M;
    public c N;
    public ConstraintLayout x;
    public ImageView y;
    public ImageView z;

    public void a(a$c p0){
       super(p0);
       this.J = p0.I;
       this.K = p0.J;
       this.L = p0.K;
    }
    public static void l0(a p0,View p1){
       Objects.requireNonNull(p0);
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p1, p0, uoa, "11")) {
       }else {
          ClientContent$LiveStreamPackage liveStreamPa = p0.K.a();
          if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, a.class, "5")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "OP_ACTIVITY_GAME_CNY2022_PASSWORD_DRAW_TAB";
             i3 oi3 = i3.f();
             oi3.d("button_type", "draw");
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(1, uElementPack, uContentPack);
          }
          if (p1 instanceof LottieAnimationView && !PatchProxy.applyVoidOneRefs(p1, p0, uoa, "7")) {
             p1.f();
             p1.t();
             p1.setBackgroundResource(R.drawable.arg_RES_7f08122b);
             p1.setAnimationFromUrl(c.a().h(CdnHostGroupType.GAME.getTypeName(), "udata/pkg/kwai-client-image/gzone/spring/live_gzone_command_lottery_fudai_click_new.zip", Collections.emptyMap()));
             p1.setRenderMode(RenderMode.HARDWARE);
             p1.setRepeatCount(1);
             p1.a(new k(p0, p1));
             p1.s();
          }
          c.h(p0.I, b.d);
          a j = p0.J;
          p0.M = c.a.get().a(p0.K.getLiveStreamId(), j.d.mToken, 1, j.b).map(new e()).subscribe(new b(p0), new c(p0));
       }
       return;
    }
    public void b(c p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "15")) {
          return;
       }
       b9.a(this.M);
       if (!PatchProxy.applyVoid(null, this, uoa, "6")) {
          this.F.f();
          this.F.t();
          this.G.f();
          this.G.t();
          this.H.f();
          this.H.t();
       }
       if (!PatchProxy.applyVoid(null, this, uoa, "14")) {
          uoa = this.N;
          if (uoa != null && uoa.K()) {
             this.N.q(0);
             this.N = null;
          }
       }
       return;
    }
    public int c0(){
       Object obj = PatchProxy.apply(null, this, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(0x43cf0000);
    }
    public int d0(){
       return 0x7f0d0b89;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a1e29);
       this.y = m1.f(p0, 0x7f0a1e12);
       this.z = m1.f(p0, 0x7f0a1e17);
       this.A = m1.f(p0, 0x7f0a1e16);
       this.B = m1.f(p0, 0x7f0a1e24);
       this.C = m1.f(p0, 0x7f0a1e19);
       this.D = m1.f(p0, 0x7f0a1e1c);
       this.E = m1.f(p0, 0x7f0a1e1a);
       this.F = m1.f(p0, 0x7f0a1e1f);
       this.G = m1.f(p0, 0x7f0a1e20);
       this.H = m1.f(p0, 0x7f0a1e21);
       m1.a(p0, new f(this), R.id.live_gzone_audience_command_lottery_image_view1);
       m1.a(p0, new f(this), R.id.live_gzone_audience_command_lottery_image_view2);
       m1.a(p0, new f(this), R.id.live_gzone_audience_command_lottery_image_view3);
       m1.a(p0, new g(this), R.id.live_gzone_audience_command_lottery_close_view);
       m1.a(p0, new h(this), R.id.live_gzone_audience_command_lottery_close_land_view);
       m1.a(p0, new i(this), R.id.live_gzone_audience_command_lottery_follow_button);
       this.I = m1.f(p0, 0x7f0a1e38);
       return;
    }
    public int e0(){
       return -2;
    }
    public void f0(View p0,Bundle p1){
       int i;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "2")) {
          return;
       }
       if (l1.a()) {
          this.y.setBackgroundColor(a1.a(R.color.arg_RES_7f06140e));
          i = a1.d(R.dimen.arg_RES_7f070421);
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, uoa, "3")) {
             this.x.setOutlineProvider(new j(this, i));
             this.x.setClipToOutline(true);
          }
          this.A.setVisibility(0);
          this.z.setVisibility(8);
       }
       if (!PatchProxy.applyVoid(null, this, uoa, "4")) {
          i = (l1.a())? a1.e(0x43cf0000): n.z(e0.b);
          i = ((i - (a1.e(45.00f) * 2)) - (a1.e(12.00f) * 2)) / 3;
          float f = 100.00f;
          if (i > a1.e(f)) {
             i = a1.e(f);
          }
          f.width = i;
          f.height = i;
          f.width = i;
          f.height = i;
          f.width = i;
          f.height = i;
       }
       this.B.setText(a1.r(R.string.arg_RES_7f10246c, "¡°"+this.J.d.mSponsorName+"¡±"));
       if (!j.h(this.J.d.mSponsorIcon)) {
          this.C.U(this.J.d.mSponsorIcon);
       }
       this.D.setText(this.J.d.mSponsorName);
       this.o0(this.J.d.mIsFollowing);
       this.n0(this.F);
       this.n0(this.G);
       this.n0(this.H);
       return;
    }
    public boolean j0(){
       return true;
    }
    public final void m0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "13")) {
          return;
       }
       if (!a1.i(this.u())) {
          return;
       }
       a tN = this.N;
       if (tN != null && tN.K()) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.K.a();
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, a.class, "6")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "OP_ACTIVITY_GAME_CNY2022_PASSWORD_DRAW_TAB";
          i3 oi3 = i3.f();
          oi3.d("button_type", "close");
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u(1, uElementPack, uContentPack);
       }
       t$a uoa = new t$a(this.u());
       uoa.y0(R.string.arg_RES_7f102463);
       uoa.S0(R.string.arg_RES_7f10246e);
       uoa = f.e(uoa);
       uoa.Q0(R.string.arg_RES_7f102468);
       uoa.t0(new a$b(this));
       this.N = uoa.Y(PopupInterface.a);
       return;
    }
    public void n0(LottieAnimationView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       p0.f();
       p0.t();
       p0.setAnimationFromUrl(c.a().h(CdnHostGroupType.GAME.getTypeName(), "udata/pkg/kwai-client-image/gzone/spring/live_gzone_command_lottery_fudai_new.zip", Collections.emptyMap()));
       p0.setRenderMode(RenderMode.HARDWARE);
       p0.setRepeatMode(1);
       p0.setRepeatCount(-1);
       p0.a(new a$a(this, p0));
       p0.s();
       return;
    }
    public void o0(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "9")) {
          return;
       }
       if (p0) {
          this.E.setText(R.string.arg_RES_7f101034);
          this.E.setTextColor(a1.a(R.color.arg_RES_7f061413));
       }else {
          this.E.setText(R.string.arg_RES_7f100f8f);
       }
       this.E.setEnabled((p0 ^ 0x01));
       return;
    }
}
