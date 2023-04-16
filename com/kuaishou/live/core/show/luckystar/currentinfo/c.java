package com.kuaishou.live.core.show.luckystar.currentinfo.c;
import a51.c;
import java.lang.Object;
import com.google.common.base.Optional;
import com.kuaishou.live.core.show.luckystar.currentinfo.c$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import ac2.k;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b9;
import yb2.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger$StatusValue;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger;
import java.util.Objects;
import mkc.b;
import android.view.View;
import mkc.c;
import android.view.ViewGroup;
import ok.k;
import ac2.o;
import java.lang.Runnable;
import com.kuaishou.live.core.show.luckystar.util.b;
import cc2.c;
import cc2.b;
import brd.x;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.luckystar.currentinfo.a;
import ac2.j;
import com.kwai.framework.model.user.User;
import lnc.a1;
import ekd.p1;
import android.widget.ImageView;
import d61.c0;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.live.core.show.luckystar.currentinfo.c$a;
import android.animation.Animator$AnimatorListener;
import ac2.g;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarInfo;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.kuaishou.live.core.basic.widget.LiveTextView;
import zb2.t;
import io.reactivex.android.schedulers.a;
import ac2.l;
import com.kuaishou.live.core.show.luckystar.currentinfo.b;
import ac2.h;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import ac2.f;

public class c extends c	// class@000cc5
{
    public LottieAnimationView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public LiveTextView E;
    public TextView F;
    public TextView G;
    public View H;
    public View I;
    public ViewGroup J;
    public final c$b K;
    public LiveLuckyStarInfoResponse$LiveLuckyStarInfo L;
    public b M;
    public boolean N;
    public i v;
    public Runnable w;
    public Optional x;
    public KwaiImageView y;
    public KwaiImageView z;
    public static final Object O;
    public static String sLivePresenterClassName;

    static {
       c.O = new Object();
    }
    public void c(){
       super();
       this.x = Optional.absent();
       this.K = new c$b(this);
       this.N = false;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       super.E8();
       this.X7(RxBus.f.f(n.class).observeOn(d.a).subscribe(new k(this)));
       this.V8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       super.J8();
       b9.a(this.M);
       this.L = null;
       this.N = false;
       return;
    }
    public final void S8(String p0){
       c tv;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "13")) {
          return;
       }
       boolean b = true;
       if (this.N == null) {
          tv = this.v;
          LiveLuckyStarLogger.c(this.v.a.a(), tv.c, LiveLuckyStarLogger$StatusValue.UNKNOWN, tv.o, "", this.x);
          this.N = b;
       }
       tv = this.K;
       Objects.requireNonNull(tv);
       c$b uob = c$b.class;
       if (!PatchProxy.applyVoidOneRefs(p0, tv, uob, "4")) {
          b[] uobArray = new b[b];
          int i = 0;
          uobArray[i] = b.d;
          c.d(tv.a.H, uobArray);
          c j = tv.a.J;
          int childCount = j.getChildCount();
          while (i < childCount) {
             View childAt = j.getChildAt(i);
             if (!childAt.getVisibility() && !k.a(childAt.getTag(), "compatible_with_load_tips")) {
                childAt.setVisibility(8);
                if (!PatchProxy.applyVoidOneRefs(childAt, tv, uob, "3")) {
                   childAt.setTag(R.id.live_lucky_star_loading_tips_tag, c.O);
                }
             }
             i = i + 1;
          }
          b.i(tv.a.H, p0, new o(tv));
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.K.a();
       b.b().g(b.g(this.v.a.e()), this.v.a.getLiveStreamId(), this.v.c).compose(this.P8()).map(new e()).subscribe(new a(this), new j(this));
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       if (this.v.a.I().isFollowingOrFollowRequesting() || this.v.a.e()) {
          this.A.setVisibility(8);
       }else {
          p1.c(this.A, a1.e(8.00f), a1.e(8.00f), a1.e(8.00f), a1.e(8.00f));
          this.A.setAlpha(0x3f800000);
          this.A.setVisibility(0);
          this.A.setAnimationFromUrl(c0.a.b("/udata/pkg/kwai-client-image/live_pendant/live_lucky_star_follow.json"));
          this.A.t();
          this.A.a(new c$a(this));
          this.A.setFrame(0);
          this.A.setOnClickListener(new g(this));
       }
       return;
    }
    public final void X8(LiveLuckyStarInfoResponse$LiveLuckyStarInfo p0){
       LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo mDisplayActi;
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "7")) {
          return;
       }
       b9.a(this.M);
       int i = 0x7f06148a;
       int i1 = 8;
       int i2 = 0;
       if (this.v.a.e()) {
          mDisplayActi = p0.getUserParticipateInfo().mDisplayAction;
          if (!TextUtils.x(mDisplayActi)) {
             this.E.setVisibility(i2);
             this.E.setBackgroundResource(i2);
             this.E.setTextColor(a1.a(i));
             this.E.setText(mDisplayActi);
             this.E.setEnablePressedAlphaEffect(i2);
          }else {
             this.E.setVisibility(i1);
          }
          this.F.setVisibility(i1);
          this.G.setText(p0.mDisplayParticipantCount);
       }else {
          mDisplayActi = p0.getUserParticipateInfo();
          if (mDisplayActi.mParticipated != null) {
             this.E.setVisibility(i1);
             this.G.setText(p0.mDisplayParticipantWithTips);
             this.M = this.v.i.b().observeOn(a.c()).subscribe(new l(this), b.b);
          }else {
             this.G.setText(p0.mDisplayParticipantCount);
             this.F.setVisibility(i1);
             if (!TextUtils.x(mDisplayActi.mDisplayAction)) {
                LiveLuckyStarLogger.l(this.v.a.a(), this.v.c, p0.mType, "");
                this.E.setVisibility(i2);
                b = true;
                if (mDisplayActi.mDisplayStyle != b) {
                   b = false;
                }
                c tE = this.E;
                if (b) {
                   i2 = 0x7f081370;
                }
                tE.setBackgroundResource(i2);
                this.E.setEnabled(b);
                tE = this.E;
                i = (b)? a1.a(R.color.arg_RES_7f061488): a1.a(i);
                tE.setTextColor(i);
                this.E.setEnablePressedAlphaEffect(b);
                this.E.setText(mDisplayActi.mDisplayAction);
                this.E.setOnClickListener(new h(this, p0));
             }else {
                this.E.setVisibility(i1);
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.J = m1.f(p0, 0x7f0a2116);
       this.y = m1.f(p0, 0x7f0a2109);
       this.z = m1.f(p0, 0x7f0a2108);
       this.A = m1.f(p0, 0x7f0a2117);
       this.B = m1.f(p0, 0x7f0a214c);
       this.C = m1.f(p0, 0x7f0a2114);
       this.D = m1.f(p0, 0x7f0a212b);
       this.E = m1.f(p0, 0x7f0a213d);
       this.F = m1.f(p0, 0x7f0a2113);
       this.G = m1.f(p0, 0x7f0a214b);
       this.H = m1.f(p0, 0x7f0a2126);
       this.I = m1.f(p0, 0x7f0a2107);
       m1.a(p0, new f(this), R.id.live_lucky_star_close_view);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.v = this.q8(i.class);
       this.w = this.q8(Runnable.class);
       this.x = this.r8("popupSource");
       return;
    }
}
