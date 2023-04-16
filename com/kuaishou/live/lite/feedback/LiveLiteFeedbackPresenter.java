package com.kuaishou.live.lite.feedback.LiveLiteFeedbackPresenter;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.feedback.LiveLiteFeedbackController;
import e93.c;
import e93.a;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import id3.h;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService;
import xp5.i;
import o63.a;
import kd3.i;
import eq3.d;
import com.kuaishou.live.viewcontroller.ViewController;
import c93.b;
import d93.a;

public class LiveLiteFeedbackPresenter extends d	// class@0008fc
{
    public LiveLiteRecommendSideBarService A;
    public a B;
    public i C;
    public LiveLiteGestureService v;
    public a w;
    public c x;
    public h y;
    public i z;

    public void LiveLiteFeedbackPresenter(){
       super();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFeedbackPresenter.class, "3")) {
          return;
       }
       super.F8();
       LiveLiteFeedbackController liveLiteFeed = new LiveLiteFeedbackController(this.x, this.w, this.v, this.y, this.A, this.z, this.B, this.C);
       this.P8().xg(v0);
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFeedbackPresenter.class, "1")) {
          return;
       }
       this.w = p0.a(a.class);
       this.z = p0.a(i.class);
       this.y = p0.a(h.class);
       this.B = p0.a(a.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFeedbackPresenter.class, "2")) {
          return;
       }
       this.v = p0.a(LiveLiteGestureService.class);
       this.x = p0.a(c.class);
       this.A = p0.a(LiveLiteRecommendSideBarService.class);
       this.C = p0.a(i.class);
       return;
    }
}
