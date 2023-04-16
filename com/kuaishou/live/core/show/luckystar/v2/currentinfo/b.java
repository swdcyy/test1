package com.kuaishou.live.core.show.luckystar.v2.currentinfo.b;
import a51.c;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.google.common.base.Optional;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.gift.LiveGiftResourcePathConstant;
import com.yxcorp.gifshow.image.KwaiImageView;
import l12.d;
import va1.f0;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import com.kuaishou.live.core.show.luckystar.util.b;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import crd.b;
import lnc.b9;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger$StatusValue;
import yb2.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger;
import android.view.View;
import mkc.b;
import mkc.c;
import hc2.h;
import java.lang.Runnable;
import cc2.c;
import cc2.b;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.luckystar.v2.currentinfo.a;
import hc2.f;
import erd.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import android.widget.ImageView;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import com.kuaishou.live.core.show.luckystar.widget.LiveLuckyStarParticipateButton;
import com.kuaishou.live.core.show.luckystar.v2.currentinfo.LiveLuckyStarCurrentInfoFragmentV2;
import androidx.fragment.app.Fragment;

public class b extends c	// class@000cfe
{
    public TextView A;
    public TextView B;
    public LiveMediumTextView C;
    public ImageView D;
    public LiveMediumTextView E;
    public KwaiImageView F;
    public KwaiImageView G;
    public TextView H;
    public TextView I;
    public View J;
    public TextView K;
    public TextView L;
    public View M;
    public TextView N;
    public LiveLuckyStarParticipateButton O;
    public View P;
    public i Q;
    public Fragment R;
    public Optional S;
    public LiveLuckyStarInfoResponse$LiveLuckyStarInfo T;
    public boolean U;
    public b V;
    public KwaiImageView v;
    public View w;
    public KwaiImageView x;
    public View y;
    public TextView z;
    public static final List W;
    public static String sLivePresenterClassName;

    static {
       b.W = LiveLogTag.LUCKY_STAR.appendTag("currentInfoV2");
    }
    public void b(){
       super();
       this.S = Optional.absent();
       this.U = false;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       super.E8();
       f0.a(this.G, LiveGiftResourcePathConstant.LIVE_LUCKY_STAR_V2_GIFT);
       b uob = new b();
       uob.g(KwaiRadiusStyles.R16);
       uob.v(b.e());
       this.v.setPlaceHolderImage(uob.a());
       this.W8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       super.J8();
       this.U = false;
       b9.a(this.V);
       return;
    }
    public final void S8(LiveLuckyStarLogger$StatusValue p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "9")) {
          return;
       }
       if (this.U == null) {
          b tQ = this.Q;
          LiveLuckyStarLogger.c(this.Q.a.a(), tQ.c, p0, tQ.p, p1, this.S);
          this.U = true;
       }
       return;
    }
    public final void V8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       this.S8(LiveLuckyStarLogger$StatusValue.UNKNOWN, "");
       this.w.setVisibility(8);
       b[] uobArray = new b[]{b.d};
       c.d(this.P, uobArray);
       b.j(this.P, p0, new h(this));
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       b[] uobArray = new b[]{b.g};
       c.d(this.P, uobArray);
       b.k(this.P);
       this.X7(b.b().g(b.g(this.Q.a.e()), this.Q.a.getLiveStreamId(), this.Q.c).map(new e()).subscribe(new a(this), new f(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a2109);
       this.w = m1.f(p0, 0x7f0a2110);
       this.x = m1.f(p0, 0x7f0a2127);
       this.y = m1.f(p0, 0x7f0a2121);
       this.z = m1.f(p0, 0x7f0a2123);
       this.A = m1.f(p0, 0x7f0a2124);
       this.B = m1.f(p0, 0x7f0a2122);
       this.C = m1.f(p0, 0x7f0a2111);
       this.E = m1.f(p0, 0x7f0a2112);
       this.D = m1.f(p0, 0x7f0a29cf);
       this.z.setTypeface(d0.a("alte-din.ttf", this.getContext()));
       this.A.setTypeface(d0.a("alte-din.ttf", this.getContext()));
       this.F = m1.f(p0, 0x7f0a211a);
       this.G = m1.f(p0, 0x7f0a211d);
       this.H = m1.f(p0, 0x7f0a211b);
       this.I = m1.f(p0, 0x7f0a211e);
       this.J = m1.f(p0, 0x7f0a213f);
       this.K = m1.f(p0, 0x7f0a2120);
       this.L = m1.f(p0, 0x7f0a2118);
       this.M = m1.f(p0, 0x7f0a2125);
       this.N = m1.f(p0, 0x7f0a211f);
       this.O = m1.f(p0, 0x7f0a2140);
       this.P = m1.f(p0, 0x7f0a2126);
       f0.a(this.G, LiveGiftResourcePathConstant.LIVE_LUCKY_STAR_V2_GIFT);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.Q = this.q8(i.class);
       this.R = this.q8(LiveLuckyStarCurrentInfoFragmentV2.class);
       this.S = this.r8("popupSource");
       return;
    }
}
