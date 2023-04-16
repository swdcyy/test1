package com.kuaishou.live.lite.feedback.LiveLiteFeedbackController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.feedback.LiveLiteFeedbackController$a;
import nsd.u;
import e93.c;
import e93.a;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import id3.h;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService;
import xp5.i;
import o63.a;
import kd3.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.feedback.LiveLiteFeedbackController$c;
import com.kuaishou.live.lite.feedback.LiveLiteFeedbackController$photo$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.lite.feedback.LiveLiteFeedbackController$token$2;
import com.kuaishou.live.lite.feedback.LiveLiteFeedbackController$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.feedback.LiveLiteFeedbackController$d;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import lnc.u1;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$b;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService$EnableLeftSwipeBizType;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import ci3.b;
import cda.i;
import a43.m;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import tkd.b;
import tkd.d;
import nl9.u;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveLiteFeedbackController extends ViewController	// class@0008fb
{
    public b j;
    public boolean k;
    public final LiveLiteGestureService$b l;
    public final p m;
    public final p n;
    public final a o;
    public final c p;
    public final a q;
    public final LiveLiteGestureService r;
    public final h s;
    public final LiveLiteRecommendSideBarService t;
    public final i u;
    public final a v;
    public final i w;
    public static final LiveLiteFeedbackController$a x;

    static {
       LiveLiteFeedbackController.x = new LiveLiteFeedbackController$a(null);
    }
    public void LiveLiteFeedbackController(c p0,a p1,LiveLiteGestureService p2,h p3,LiveLiteRecommendSideBarService p4,i p5,a p6,i p7){
       a.p(p0, "liteFragmentService");
       a.p(p1, "liteAudienceInfoManager");
       a.p(p2, "liteGestureService");
       a.p(p3, "slideManager");
       a.p(p4, "recommendSideBarService");
       a.p(p5, "liveLogPackageProvider");
       a.p(p6, "liveJsBridgeService");
       a.p(p7, "liveNewSquareService");
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.t = p4;
       this.u = p5;
       this.v = p6;
       this.w = p7;
       this.k = true;
       this.l = new LiveLiteFeedbackController$c(this);
       this.m = s.c(new LiveLiteFeedbackController$photo$2(this));
       this.n = s.c(new LiveLiteFeedbackController$token$2(this));
       this.o = new LiveLiteFeedbackController$b(this);
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFeedbackController.class, "3")) {
          return;
       }
       this.w.a().observe(this, new LiveLiteFeedbackController$d(this));
       u1.a(this);
       this.r.d(this.l);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFeedbackController.class, "6")) {
          return;
       }
       u1.b(this);
       this.X2();
       this.r.c(this.l);
       this.t.w9(false, LiveLiteRecommendSideBarService$EnableLeftSwipeBizType.FEEDBACK, this.W2());
       return;
    }
    public void M2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFeedbackController.class, "4")) {
          return;
       }
       Activity uActivity = this.B2();
       Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       uActivity.F2(this.o);
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFeedbackController.class, "5")) {
          return;
       }
       this.X2();
       Activity uActivity = this.B2();
       Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       uActivity.l3(this.o);
       return;
    }
    public final QPhoto V2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFeedbackController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.getValue();
    }
    public final String W2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFeedbackController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n.getValue();
    }
    public final void X2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFeedbackController.class, "10")) {
          return;
       }
       LiveLiteFeedbackController tj = this.j;
       if (tj != null) {
          tj.a();
       }
       return;
    }
    public final void onEventMainThread(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFeedbackController.class, "11")) {
          return;
       }
       a.p(p0, "event");
       if (p0.b != null && (a.g(p0.a, this.V2().getPhotoId()) && (m.d(p0.c) && this.q.j0() != null))) {
          d.a(-1694791652).a60(this.V2(), this.p.a().getParentFragment(), 0);
          b.Z(LiveLiteLogTag.LITE_FEEDBACK, "remove current feed");
          LiveStreamFeed liveStreamFe = this.q.j0();
          a.m(liveStreamFe);
          a.o(liveStreamFe, "liteAudienceInfoManager.liveStreamFeed!!");
          this.s.r(liveStreamFe);
       }
    label_0069 :
       return;
    }
}
