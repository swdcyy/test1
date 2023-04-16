package com.kuaishou.live.core.voiceparty.playway.sixseats.BaseAudioPlaywayViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.core.voiceparty.g0;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import ru2.a;
import ws5.c;
import qc2.a;
import i81.f;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.FrameLayout;
import d61.h;
import crd.b;
import com.kuaishou.live.core.voiceparty.playway.sixseats.BaseAudioPlaywayViewController$initUI$1$1;
import androidx.lifecycle.LifecycleOwner;
import msd.a;
import u63.a;
import com.kuaishou.live.core.voiceparty.playway.sixseats.BaseAudioPlaywayViewController$playEnterAnimation$1;
import bv2.c;
import com.kwai.robust.PatchProxyResult;
import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import qt2.b;
import android.animation.ObjectAnimator;
import bv2.b;
import android.animation.Animator$AnimatorListener;
import i81.f$a$b;
import i81.f$a;
import com.kuaishou.live.comments.bulletin.LiveBulletinStageType;
import i81.c;
import com.kuaishou.live.core.voiceparty.playway.sixseats.BaseAudioPlaywayViewController$onResume$1;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import com.kuaishou.live.core.voiceparty.playway.sixseats.BaseAudioPlaywayViewController$adjustLyricsPositionIfNeed$1;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import qc2.u;
import qc2.u$a;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LyricsMode;
import com.kuaishou.live.core.show.music.audiencelyrics.view.ConstraintType;
import android.graphics.PointF;

public abstract class BaseAudioPlaywayViewController extends ViewController	// class@0018af
{
    public ViewController j;
    public FrameLayout k;
    public boolean l;
    public final g0 m;
    public final MicSeatsDataManager n;
    public final a o;
    public final c p;
    public final a q;
    public final f r;
    public final LiveBulletinLayoutManager s;

    public void BaseAudioPlaywayViewController(g0 p0,MicSeatsDataManager p1,a p2,c p3,a p4,f p5,LiveBulletinLayoutManager p6){
       a.p(p0, "moduleSubject");
       a.p(p1, "micSeatsDataManager");
       a.p(p2, "micSeatActionDelegate");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       this.q = p4;
       this.r = p5;
       this.s = p6;
    }
    public void F2(){
       BaseAudioPlaywayViewController uBaseAudioPl = BaseAudioPlaywayViewController.class;
       if (PatchProxy.applyVoid(null, this, uBaseAudioPl, "3")) {
          return;
       }
       int i = 0x7f0a27af;
       if (!PatchProxy.applyVoid(null, this, uBaseAudioPl, "5")) {
          this.Q2(R.layout.arg_RES_7f0d0e39);
          View view1 = this.A2(R.id.top_bar_place_holder);
          FrameLayout uFrameLayout = this.A2(i);
          this.k = uFrameLayout;
          if (uFrameLayout == null) {
             a.S("container");
          }
          h.i(uFrameLayout);
          BaseAudioPlaywayViewController tp = this.p;
          if (tp != null) {
             a.a(this, new BaseAudioPlaywayViewController$initUI$1$1(tp.a(view1)));
          }
       }
       ViewController viewControll = this.W2();
       this.j = viewControll;
       if (viewControll == null) {
          a.S("chatViewController");
       }
       this.x2(i, viewControll);
       if (!PatchProxy.applyVoid(null, this, uBaseAudioPl, "6")) {
          View view = this.A2(i);
          BaseAudioPlaywayViewController$playEnterAnimation$1 oplayEnterAn = new BaseAudioPlaywayViewController$playEnterAnimation$1(this);
          ObjectAnimator objectAnimat = PatchProxy.applyTwoRefs(view, oplayEnterAn, null, c.class, "1");
          if (objectAnimat != PatchProxyResult.class) {
          }else {
             a.p(view, "chatView");
             a.p(oplayEnterAn, "onComplete");
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{b.b(new float[2]{0x3f19999a,0x3f800000}),b.c(new float[2]{0x3f19999a,0x3f800000}),b.a()};
             objectAnimat = ObjectAnimator.ofPropertyValuesHolder(view, propertyValu);
             a.o(objectAnimat, "ObjectAnimator.ofPropert¡­til.inAlphaProperty\(\)\n  \)");
             objectAnimat.addListener(new b(oplayEnterAn));
             objectAnimat.setDuration(80);
          }
          objectAnimat.start();
          uBaseAudioPl = this.r;
          if (uBaseAudioPl != null) {
             BaseAudioPlaywayViewController tk = this.k;
             if (tk == null) {
                a.S("container");
             }
             uBaseAudioPl.b(new f$a$b(tk));
          }
          uBaseAudioPl = this.s;
          if (uBaseAudioPl != null) {
             uBaseAudioPl.i(LiveBulletinStageType.AudioChat, null);
          }
       }
       return;
    }
    public void L2(){
       if (PatchProxy.applyVoid(null, this, BaseAudioPlaywayViewController.class, "4")) {
          return;
       }
       Monitor_ThreadKt.e(0, new BaseAudioPlaywayViewController$onResume$1(this), 1, null);
       return;
    }
    public final void V2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseAudioPlaywayViewController.class, "7")) {
          return;
       }
       if (this.l != null) {
          return;
       }
       View view = this.A2(R.id.live_voice_party_six_seats_container_view_container);
       if (!view.getHeight()) {
          Monitor_ThreadKt.e(0, new BaseAudioPlaywayViewController$adjustLyricsPositionIfNeed$1(this), 1, objArray);
          return;
       }else {
          int[] ointArray = new int[2]{0,0};
          view.getLocationInWindow(ointArray);
          float f = (float)n.k(this.B2()) - (float)a1.d(0x7f070878);
          float f1 = (u.c.a())? (float)a1.d(0x7f070881): (float)a1.d(0x7f070880) + (float)20;
          float f2 = (float)(ointArray[1] + view.getHeight()) + f1;
          BaseAudioPlaywayViewController tq = this.q;
          if (tq != null) {
             tq.e(LyricsMode.LEFT, ConstraintType.RIGHT_TOP, new PointF(f, f2), 1);
          }
          this.l = true;
          return;
       }
    }
    public abstract ViewController W2();
    public final FrameLayout X2(){
       BaseAudioPlaywayViewController obj = PatchProxy.apply(null, this, BaseAudioPlaywayViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          a.S("container");
       }
       return obj;
    }
}
