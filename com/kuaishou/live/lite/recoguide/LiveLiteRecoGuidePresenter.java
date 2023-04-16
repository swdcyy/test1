package com.kuaishou.live.lite.recoguide.LiveLiteRecoGuidePresenter;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eq3.d;
import com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController;
import n93.b;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import xp5.i;
import e93.a;
import com.kuaishou.live.viewcontroller.ViewController;
import c93.b;
import d93.a;

public class LiveLiteRecoGuidePresenter extends d	// class@000ada
{
    public i v;
    public a w;
    public LiveLiteGuidanceMessageQueueManager x;
    public b y;

    public void LiveLiteRecoGuidePresenter(){
       super();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteRecoGuidePresenter.class, "3")) {
          return;
       }
       super.F8();
       this.P8().xg(new LiveLiteRecoGuideController(this.y, this.x, this.v, this.w));
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteRecoGuidePresenter.class, "1")) {
          return;
       }
       this.x = p0.a(LiveLiteGuidanceMessageQueueManager.class);
       this.v = p0.a(i.class);
       this.w = p0.a(a.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteRecoGuidePresenter.class, "2")) {
          return;
       }
       this.y = p0.a(b.class);
       return;
    }
}
