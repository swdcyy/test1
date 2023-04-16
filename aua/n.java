package aua.n;
import ja5.h;
import lnc.a1;
import aua.n$a;
import aua.l;
import aua.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import im8.f;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;
import android.widget.ImageView;
import android.view.View;
import android.view.ViewStub;
import com.kwai.library.widget.specific.misc.CircleWithStrokeView;
import android.widget.FrameLayout;
import aua.o;
import android.view.View$OnClickListener;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.framework.model.live.LiveTipInfo;
import com.kwai.slide.play.detail.rightactionbar.follow.element.h;
import lnc.c3$a;
import lnc.c3;
import java.lang.Runnable;
import ekd.k1;
import aua.k;
import com.kwai.slide.play.detail.rightactionbar.follow.element.i;
import android.animation.AnimatorSet;
import com.kwai.robust.PatchProxyResult;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import com.kuaishou.android.model.mix.CommonMeta;
import ga5.b;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder;
import l27.g;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHelper;
import com.kwai.library.wolverine.contract.WolverinePerformanceLevelInterface;
import xzc.a;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import aua.n$b;
import android.animation.Animator$AnimatorListener;
import ekd.m1;
import android.view.ViewGroup;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import ha5.e;

public class n extends h	// class@000319
{
    public f A;
    public ViewGroup B;
    public View C;
    public ViewStub D;
    public ViewStub E;
    public CircleWithStrokeView F;
    public ImageView G;
    public FrameLayout H;
    public AnimatorSet I;
    public AnimatorSet J;
    public boolean K;
    public boolean L;
    public RecyclerView M;
    public final RecyclerView$r N;
    public final Runnable O;
    public final Runnable P;
    public f u;
    public BaseFragment v;
    public PhotoMeta w;
    public CommonMeta x;
    public QPhoto y;
    public e z;
    public static final float Q;

    static {
       n.Q = (float)a1.d(0x7f0702b8);
    }
    public void n(){
       super();
       this.N = new n$a(this);
       this.O = new l(this);
       this.P = new m(this);
    }
    public void E8(){
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "3")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, on, "5")) {
          if (!this.V8()) {
             on = this.A;
             if (on != null) {
                on.set(Boolean.FALSE);
             }
          }else {
             n tA = this.A;
             if (tA != null) {
                tA.set(Boolean.TRUE);
             }
             this.K = true;
             RecyclerView recyclerView = this.v.h0();
             this.M = recyclerView;
             recyclerView.addOnScrollListener(this.N);
             if (!PatchProxy.applyVoid(objArray, this, on, "8")) {
                float f = 0x3f800000;
                if (this.q.getScaleX() - f) {
                   this.q.setScaleX(f);
                }
                if (this.q.getScaleY() - f) {
                   this.q.setScaleY(f);
                }
                if (this.F == null) {
                   this.F = this.D.inflate();
                }
                int i = 0;
                if (this.F.getVisibility()) {
                   float e = CircleWithStrokeView.e;
                   if (this.F.getStrokeWidth() - e) {
                      this.F.setStrokeWidth(e);
                   }
                   e = CircleWithStrokeView.f;
                   if (this.F.getRadius() - e) {
                      this.F.setRadius(e);
                   }
                   this.F.setVisibility(i);
                }
                if (this.H == null) {
                   this.H = this.E.inflate();
                }
                if (this.G == null) {
                   this.G = this.H.findViewById(0x7f0a268d);
                }
                this.G.setImageResource(R.drawable.arg_RES_7f08072c);
                this.G.setVisibility(i);
                on = this.C;
                if (on != null) {
                   on.setVisibility(i);
                }
                this.q.setOnClickListener(new o(this));
                this.w.mLiveTipInfo.mRealShown = true;
             }
             if (!this.M.getScrollState()) {
                this.W8();
             }
          }
       }
       return;
    }
    public void J8(){
       n on = n.class;
       if (PatchProxy.applyVoid(null, this, on, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, on, "7") && this.V8()) {
          this.K = false;
          this.M.removeOnScrollListener(this.N);
          if (!PatchProxy.applyVoid(null, this, on, "15")) {
             on = this.A;
             if (on != null) {
                on.set(Boolean.FALSE);
             }
             this.R8();
             on = this.C;
             if (on != null) {
                on.setVisibility(8);
             }
             this.q.setPadding(false, false, false, false);
             this.q.setOnClickListener(null);
             on = this.F;
             if (on != null) {
                on.setVisibility(8);
             }
             on = this.G;
             if (on != null) {
                on.setVisibility(8);
             }
          }
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, n.class, "14")) {
          return;
       }
       this.L = true;
       c3.c(this.I, h.a);
       c3.c(this.J, h.a);
       k1.m(this.O);
       k1.m(this.P);
       c3.c(this.H, k.a);
       c3.c(this.F, i.a);
       this.q.clearAnimation();
       return;
    }
    public final AnimatorSet S8(View p0){
       AnimatorSet obj = PatchProxy.applyOneRefs(p0, this, n.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(p0, "scaleX", new float[3]{0x3f4ccccd,0x3f800000,0x3f4ccccd}),ObjectAnimator.ofFloat(p0, "scaleY", new float[3]{0x3f4ccccd,0x3f800000,0x3f4ccccd})};
       obj.playTogether(uAnimatorArr);
       return obj;
    }
    public final boolean V8(){
       Object obj = PatchProxy.apply(null, this, n.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (b.d(this.x)) {
          return b;
       }
       if (this.w.mLiveTipInfo != null) {
          b = true;
       }
       return b;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, n.class, "9")) {
          return;
       }
       g og = FeedWolverinePerformanceHolder.c.c();
       WolverinePerformanceLevel wolverinePer = FeedWolverinePerformanceHelper.a("feed_wolverine_live_guide_anim_demotion_grade");
       if (og != null && wolverinePer != null) {
          WolverinePerformanceLevel wolverinePer1 = og.a();
          if (wolverinePer1.isAtMost(wolverinePer)) {
             a.a("avatarLiveAnimation", wolverinePer1);
             n tF = this.F;
             if (tF != null) {
                tF.setVisibility(8);
             }
             return;
          }
       }
       this.X8();
       k1.r(this.P, 415);
       this.L = false;
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, n.class, "10")) {
          return;
       }
       this.q.clearAnimation();
       this.H.clearAnimation();
       AnimatorSet uAnimatorSet = new AnimatorSet();
       this.I = uAnimatorSet;
       uAnimatorSet.setDuration(830);
       this.I.setInterpolator(new LinearInterpolator());
       Animator[] uAnimatorArr = new Animator[]{this.S8(this.q),this.S8(this.H)};
       this.I.playTogether(uAnimatorArr);
       this.I.addListener(new n$b(this));
       this.I.start();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.E = m1.f(p0, 0x7f0a0e2b);
       this.C = m1.f(p0, 0x7f0a12ba);
       this.B = m1.f(p0, 0x7f0a0923);
       this.D = m1.f(p0, 0x7f0a0e2a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       super.j8();
       this.u = this.x8("ADAPTER_POSITION");
       this.v = this.r8("FRAGMENT");
       this.w = this.q8(PhotoMeta.class);
       this.x = this.q8(CommonMeta.class);
       this.y = this.q8(QPhoto.class);
       this.z = this.t8("PHOTO_CLICK_LISTENER");
       this.A = this.w8("FEED_HAS_SHOWN_LIVE_ICON");
       return;
    }
}
