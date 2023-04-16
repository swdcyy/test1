package com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkScoreProgressBar$b;
import ws1.e;
import com.kuaishou.live.viewcontroller.ViewController;
import zs1.b;
import ut1.d;
import hu1.c;
import du1.d;
import ws1.c;
import ht1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig;
import com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController$a;
import com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController$progressBarViewModel$2;
import com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import ot1.g;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController$$special$$inlined$viewModels$2;
import msd.a;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkScoreProgressBar;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ws1.d;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.TextView;
import android.view.ViewStub;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkSwitchManager;
import pu1.n;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.Double;
import java.lang.reflect.Type;
import android.app.Activity;
import com.yxcorp.utility.n;
import qsd.d;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig;
import wg3.a;
import com.kuaishou.live.common.core.component.multipk.widget.LiveMultiPkScoreProgressAnimHelper;
import hw1.j;
import hw1.h;
import java.util.Objects;
import com.kuaishou.live.common.core.component.multipk.widget.LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import xh3.g;
import com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController$bindViewModel$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import ot1.a;
import androidx.lifecycle.Observer;
import androidx.lifecycle.MutableLiveData;
import ot1.b;
import ot1.c;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import ot1.d;
import zh3.b;
import ot1.e;
import android.widget.ImageView;
import w4.h;
import v5.a;
import android.animation.ValueAnimator;
import java.lang.Float;
import android.widget.FrameLayout;
import qrd.p;
import com.kuaishou.live.common.core.component.pk.ScoreTextAnimatorType;
import qrd.l1;
import com.kuaishou.live.common.core.component.recommendgift.LivePkScoreBarSprintAnimView;
import android.view.ViewGroup$LayoutParams;
import cu1.d;
import ot1.j$b;
import ot1.j;
import java.lang.Boolean;
import ot1.j$a;
import java.lang.Integer;
import java.lang.Math;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import java.lang.Long;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import com.kuaishou.live.common.core.component.multipk.container.LiveMultiPKAreaType;

public final class LiveMultiPkProgressBarDefaultController extends ViewController implements LiveMultiPkScoreProgressBar$b, e	// class@001641
{
    public final LiveMultiPkProgressBarDefaultController$a A;
    public final p B;
    public final b C;
    public final d D;
    public final c E;
    public final d F;
    public final c G;
    public final a H;
    public View j;
    public LiveMultiPkScoreProgressBar k;
    public LottieAnimationView l;
    public TextView m;
    public TextView n;
    public ViewStub o;
    public LivePkScoreBarSprintAnimView p;
    public h q;
    public int r;
    public long s;
    public long t;
    public LiveMultiPkScoreProgressAnimHelper u;
    public LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig v;
    public boolean w;
    public long x;
    public boolean y;
    public boolean z;

    public void LiveMultiPkProgressBarDefaultController(b p0,d p1,c p2,d p3,c p4,a p5){
       a.p(p0, "pkCoreModel");
       a.p(p1, "countDownModel");
       a.p(p2, "renderModel");
       a.p(p3, "renderDelegate");
       a.p(p4, "pkContainerLayout");
       a.p(p5, "skinManager");
       super();
       this.C = p0;
       this.D = p1;
       this.E = p2;
       this.F = p3;
       this.G = p4;
       this.H = p5;
       this.s = -1;
       this.t = -1;
       this.v = new LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig();
       this.x = 0x2710;
       this.z = true;
       this.A = new LiveMultiPkProgressBarDefaultController$a(this);
       this.B = new ViewModelLazy(m0.d(g.class), new LiveMultiPkProgressBarDefaultController$$special$$inlined$viewModels$2(new LiveMultiPkProgressBarDefaultController$$special$$inlined$viewModels$1(this)), new LiveMultiPkProgressBarDefaultController$progressBarViewModel$2(this));
    }
    public static final LiveMultiPkScoreProgressBar V2(LiveMultiPkProgressBarDefaultController p0){
       p0 = p0.k;
       if (p0 == null) {
          a.S("progressBar");
       }
       return p0;
    }
    public View B1(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkProgressBarDefaultController.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parentViewGroup");
       LiveMultiPkProgressBarDefaultController tj = this.j;
       if (tj == null) {
          a.S("progressBarView");
       }
       return tj;
    }
    public void D(){
       d.a(this);
    }
    public void F2(){
       boolean b;
       LiveMultiPkProgressBarDefaultController tH;
       LiveMultiPkProgressBarDefaultController liveMultiPkP = LiveMultiPkProgressBarDefaultController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMultiPkP, "2")) {
          return;
       }
       b.Z(LiveCommonLogTag.MULTI_PK, "progress onCreate");
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkP, "4")) {
          b = false;
          View view = a.c(LayoutInflater.from(this.D2()), R.layout.arg_RES_7f0d0cca, objArray, b);
          a.o(view, "LayoutInflater.from\(cont¡­_bar_layout, null, false\)");
          this.j = view;
          if (view == null) {
             a.S("progressBarView");
          }
          view = view.findViewById(R.id.live_multi_pk_score_progressbar);
          a.o(view, "progressBarView.findView¡­lti_pk_score_progressbar\)");
          this.k = view;
          LiveMultiPkProgressBarDefaultController tj = this.j;
          if (tj == null) {
             a.S("progressBarView");
          }
          view = tj.findViewById(R.id.live_multi_pk_progress_lottie_view);
          a.o(view, "progressBarView.findView¡­_pk_progress_lottie_view\)");
          this.l = view;
          tj = this.j;
          if (tj == null) {
             a.S("progressBarView");
          }
          view = tj.findViewById(R.id.live_multi_pk_left_score_text_view);
          a.o(view, "progressBarView.findView¡­_pk_left_score_text_view\)");
          this.m = view;
          tj = this.j;
          if (tj == null) {
             a.S("progressBarView");
          }
          view = tj.findViewById(R.id.live_multi_pk_right_score_text_view);
          a.o(view, "progressBarView.findView¡­pk_right_score_text_view\)");
          this.n = view;
          tj = this.j;
          if (tj == null) {
             a.S("progressBarView");
          }
          view = tj.findViewById(R.id.live_pk_score_bar_sprint_anim_view_stub);
          a.o(view, "progressBarView.findView¡­ar_sprint_anim_view_stub\)");
          this.o = view;
          if (!LiveMultiPkSwitchManager.d.a()) {
             this.Y2();
          }
          tj = this.k;
          if (tj == null) {
             a.S("progressBar");
          }
          tj.setLivePkScoreProgressBarListener(this);
          tj = this.k;
          if (tj == null) {
             a.S("progressBar");
          }
          if (!PatchProxy.applyVoidOneRefs(tj, this, liveMultiPkP, "5")) {
             n on = n.class;
             _monitor_enter(on);
             Object obj = PatchProxy.apply(objArray, objArray, on, "2");
             double d = (obj != PatchProxyResult.class)? obj.doubleValue(): a.t().u("SOURCE_LIVE").getValue("multiPkScoreBarMarginMinWidthScreenScale", Double.TYPE, Double.valueOf(0x3fc3333333333333)).doubleValue();
             _monitor_exit(on);
             if (d - (double)b >= 0) {
                tj.setMinWidth(d.G0((d * (double)n.k(this.B2()))));
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, liveMultiPkP, "8")) {
             LiveConfigStartupResponse$LivePkConfig livePkConfig = a.B(LiveConfigStartupResponse$LivePkConfig.class);
             LiveConfigStartupResponse$LivePkConfig mLivePkProgr = livePkConfig.mLivePkProgressAnimationConfig;
             a.o(mLivePkProgr, "pkConfig.mLivePkProgressAnimationConfig");
             this.v = mLivePkProgr;
             livePkConfig = livePkConfig.mCoolScoreAnimationMinIncrement;
             this.r = livePkConfig;
             if (livePkConfig <= null) {
                this.r = 208;
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, liveMultiPkP, "10")) {
             tH = this.l;
             if (tH == null) {
                a.S("progressAnimView");
             }
             this.u = new LiveMultiPkScoreProgressAnimHelper(tH, this.v, this.A, this.H);
             this.q = new h();
          }
          if (!PatchProxy.applyVoid(objArray, this, liveMultiPkP, "9")) {
             tj = this.k;
             if (tj == null) {
                a.S("progressBar");
             }
             tH = this.H;
             Objects.requireNonNull(tj);
             if (!PatchProxy.applyVoidOneRefs(tH, tj, LiveMultiPkScoreProgressBar.class, "4")) {
                tj.setDefaultProgressBarColor(tH);
             }
             tj = this.u;
             if (tj == null) {
                a.S("progressAnimHelper");
             }
             Objects.requireNonNull(tj);
             if (!PatchProxy.applyVoid(objArray, tj, LiveMultiPkScoreProgressAnimHelper.class, "15")) {
                tj.c(tj.b);
             }
          }
       }
    label_01ae :
       g og = this.W2();
       if (!PatchProxy.applyVoidOneRefs(og, this, liveMultiPkP, "6")) {
          liveMultiPkP = this.m;
          if (liveMultiPkP == null) {
             a.S("leftScoreTextView");
          }
          g.a(liveMultiPkP, this, og.a);
          liveMultiPkP = this.n;
          if (liveMultiPkP == null) {
             a.S("rightScoreTextView");
          }
          g.a(liveMultiPkP, this, og.b);
          LiveDataOperators.e(og.w0(), og.x0(), new LiveMultiPkProgressBarDefaultController$bindViewModel$1(this)).observe(this, a.b);
          og.l.a().observe(this, new b(this));
          og.m.d().observe(this, new c(this));
          og.y0().observe(this, new d(this));
          og.v0().observe(this, new e(this));
       }
       this.G.w(this);
       return;
    }
    public void H(){
       this.z = true;
    }
    public void J2(){
       LiveMultiPkProgressBarDefaultController liveMultiPkP = LiveMultiPkProgressBarDefaultController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMultiPkP, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, liveMultiPkP, "17")) {
          if (!PatchProxy.applyVoid(objArray, this, liveMultiPkP, "13")) {
             liveMultiPkP = this.l;
             String str = "progressAnimView";
             if (liveMultiPkP == null) {
                a.S(str);
             }
             liveMultiPkP.setVisibility(4);
             liveMultiPkP = this.l;
             if (liveMultiPkP == null) {
                a.S(str);
             }
             liveMultiPkP.setTag(objArray);
             liveMultiPkP = this.l;
             if (liveMultiPkP == null) {
                a.S(str);
             }
             liveMultiPkP.f();
             liveMultiPkP = this.l;
             if (liveMultiPkP == null) {
                a.S(str);
             }
             liveMultiPkP.t();
             liveMultiPkP = this.l;
             if (liveMultiPkP == null) {
                a.S(str);
             }
             liveMultiPkP.g.d.removeAllUpdateListeners();
          }
          liveMultiPkP = this.k;
          if (liveMultiPkP == null) {
             a.S("progressBar");
          }
          Objects.requireNonNull(liveMultiPkP);
          if (!PatchProxy.applyVoid(objArray, liveMultiPkP, LiveMultiPkScoreProgressBar.class, "6")) {
             boolean b = false;
             liveMultiPkP.g = b;
             LiveMultiPkScoreProgressBar n = liveMultiPkP.n;
             if (n != null) {
                n.cancel();
             }
             liveMultiPkP.h = b;
             liveMultiPkP.i = b;
             liveMultiPkP.j = 50;
          }
       }
       this.G.n(this);
       return;
    }
    public void V0(float p0){
       LiveMultiPkProgressBarDefaultController liveMultiPkP = LiveMultiPkProgressBarDefaultController.class;
       if (PatchProxy.isSupport(liveMultiPkP) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, liveMultiPkP, "14")) {
          return;
       }
       liveMultiPkP = this.u;
       if (liveMultiPkP == null) {
          a.S("progressAnimHelper");
       }
       LiveMultiPkProgressBarDefaultController tk = this.k;
       String str = "progressBar";
       if (tk == null) {
          a.S(str);
       }
       int width = tk.getWidth();
       LiveMultiPkProgressBarDefaultController tk1 = this.k;
       if (tk1 == null) {
          a.S(str);
       }
       liveMultiPkP.f(p0, width, tk1.getMinWidth());
       liveMultiPkP = this.u;
       if (liveMultiPkP == null) {
          a.S("progressAnimHelper");
       }
       liveMultiPkP.e((int)p0);
       return;
    }
    public final g W2(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkProgressBarDefaultController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getValue();
    }
    public final ScoreTextAnimatorType X2(long p0,long p1){
       int i = 0;
       if (p0 - i < 0) {
          return ScoreTextAnimatorType.NONE;
       }
       p1 = p1 - p0;
       if (p1 - i <= 0) {
          return ScoreTextAnimatorType.NONE;
       }
       ScoreTextAnimatorType lARGE = (p1 - (long)this.r > 0)? ScoreTextAnimatorType.LARGE: ScoreTextAnimatorType.SMALL;
       return lARGE;
    }
    public final void Y2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkProgressBarDefaultController.class, "7")) {
          return;
       }
       if (this.p == null) {
          LiveMultiPkProgressBarDefaultController to = this.o;
          if (to == null) {
             a.S("sprintAnimViewStub");
          }
          View view = to.inflate();
          view.setVisibility(8);
          this.p = view;
       }
       return;
    }
    public int getPriority(){
       return 1;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkProgressBarDefaultController.class, "20")) {
          return;
       }
       LiveMultiPkProgressBarDefaultController tj = this.j;
       if (tj == null) {
          a.S("progressBarView");
       }
       ViewGroup$LayoutParams layoutParams = tj.getLayoutParams();
       if (layoutParams != null) {
          layoutParams.height = d.e();
       }
       this.W2().z0(j$b.a);
       return;
    }
    public void p2(boolean p0){
       LiveMultiPkProgressBarDefaultController liveMultiPkP = LiveMultiPkProgressBarDefaultController.class;
       if (PatchProxy.isSupport(liveMultiPkP) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveMultiPkP, "16")) {
          return;
       }
       this.W2().z0(new j$a(p0));
       return;
    }
    public void w0(int p0,int p1,float p2){
       LiveMultiPkProgressBarDefaultController this;
       LiveMultiPkProgressBarDefaultController tu1;
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre1;
       LiveMultiPkScoreProgressAnimHelper c;
       LiveMultiPkScoreProgressAnimHelper liveMultiPkS = LiveMultiPkScoreProgressAnimHelper.class;
       if (PatchProxy.isSupport(LiveMultiPkProgressBarDefaultController.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), this, LiveMultiPkProgressBarDefaultController.class, "15")) {
          return;
       }
       LiveMultiPkProgressBarDefaultController tu = this.u;
       String str = "progressAnimHelper";
       if (tu == null) {
          a.S(str);
       }
       LiveMultiPkProgressBarDefaultController tk = this.k;
       String str1 = "progressBar";
       if (tk == null) {
          a.S(str1);
       }
       int width = tk.getWidth();
       this = this.k;
       if (this == null) {
          a.S(str1);
       }
       tu.f(p2, width, this.getMinWidth());
       if (this.A.c()) {
          tu1 = this.u;
          if (tu1 == null) {
             a.S(str);
          }
          Objects.requireNonNull(tu1);
          if (!PatchProxy.isSupport(liveMultiPkS) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), tu1, liveMultiPkS, "14")) {
             LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre = tu1.b(p1);
             tu1.b = livePkProgre;
             tu1.c = 0;
             tu1.c(livePkProgre);
          }
          return;
       }else {
          LiveMultiPkProgressBarDefaultController tk1 = this.k;
          if (tk1 == null) {
             a.S(str1);
          }
          if (tk1.g == null) {
             tu1 = this.u;
             if (tu1 == null) {
                a.S(str);
             }
             Objects.requireNonNull(tu1);
             if (!PatchProxy.applyVoid(null, tu1, liveMultiPkS, "13")) {
                tu1.b = LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_LIGHT;
                tu1.c = 0;
                tu1.d();
             }
          }else if(this.y != null){
             tu1 = this.u;
             if (tu1 == null) {
                a.S(str);
             }
             tu1.e(p1);
          }else if(this.z != null){
             this.z = false;
             tk1 = this.u;
             if (tk1 == null) {
                a.S(str);
             }
             Objects.requireNonNull(tk1);
             if (!PatchProxy.isSupport(liveMultiPkS) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), tk1, liveMultiPkS, "1")) {
                if (PatchProxy.isSupport(liveMultiPkS)) {
                   livePkProgre1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), tk1, liveMultiPkS, "12");
                   if (livePkProgre1 != PatchProxyResult.class) {
                   }else if(p0 == p1){
                      livePkProgre1 = tk1.a(p1);
                   }else {
                      int i = p1 - p0;
                      float f = (float)Math.abs(i) / 100.00f;
                      LiveLogTag pK = LiveLogTag.PK;
                      pK.appendTag("LiveMultiPkScoreProgressAnimHelper");
                      b.Q(pK, "proportion", c.k("change proportion", Float.valueOf(f), "pkCountDownMs", Long.valueOf(tk1.e.b())));
                      if (p1 > p0) {
                         pK.appendTag("LiveMultiPkScoreProgressAnimHelper");
                         b.Q(pK, "changeProgressAnim", c.j("changeProgress left", Integer.valueOf(i)));
                         c = tk1.d;
                         if (f - c.mLargeTriggerLevel >= 0) {
                            livePkProgre1 = LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_BIG_LEFT;
                         }else if(f - c.mTriggerLevel >= 0 && tk1.b != LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_BIG_LEFT){
                            livePkProgre1 = LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_SMALL_LEFT;
                         }else {
                            livePkProgre1 = tk1.a(p1);
                         }
                      }else {
                         pK.appendTag("LiveMultiPkScoreProgressAnimHelper");
                         b.Q(pK, "changeProgressAnim", c.j("changeProgress right", Integer.valueOf((p0 - p1))));
                         c = tk1.d;
                         if (f - c.mLargeTriggerLevel >= 0) {
                            livePkProgre1 = LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_BIG_RIGHT;
                         }else if(f - c.mTriggerLevel >= 0 && tk1.b != LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_BIG_RIGHT){
                            livePkProgre1 = LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_SMALL_RIGHT;
                         }else {
                            livePkProgre1 = tk1.a(p1);
                         }
                      }
                   }
                }else {
                   goto label_00fb ;
                }
                b.Q(LiveLogTag.PK.appendTag("LiveMultiPkScoreProgressAnimHelper"), "changeProgressAnim", c.l("animType", livePkProgre1, "currentAnimType", tk1.b, "keepCount", Integer.valueOf(tk1.c)));
                if (tk1.b.isFlameAnimation()) {
                   if (livePkProgre1.isFlameAnimation()) {
                      tk1.c = 0;
                      if (livePkProgre1 == tk1.b && tk1.a.p()) {
                         tk1.c = tk1.c + 1;
                      }else {
                         tk1.b = livePkProgre1;
                         tk1.c(livePkProgre1);
                         tk1.c = tk1.c + 1;
                      }
                   }else {
                      c = tk1.c;
                      if (c < tk1.d.mPeriods) {
                         c++;
                         tk1.c = c;
                      }else {
                         tk1.b = livePkProgre1;
                         tk1.c(livePkProgre1);
                         tk1.c = 0;
                      }
                   }
                }else if(livePkProgre1.isFlameAnimation()){
                   tk1.c = 0;
                   tk1.b = livePkProgre1;
                   tk1.c(livePkProgre1);
                   tk1.c = tk1.c + 1;
                }else if(livePkProgre1 == tk1.b && tk1.a.p()){
                   tk1.b = livePkProgre1;
                   tk1.c(livePkProgre1);
                }
             }
          }
          return;
       }
    }
    public LiveMultiPKAreaType w1(){
       return LiveMultiPKAreaType.PROGRESS;
    }
}
