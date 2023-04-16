package com.kuaishou.live.lite.background.LiveLiteBackgroundPresenter;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.model.LiveAudienceCustomSkinConfig;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.android.live.model.QLivePlayConfig;
import xp5.a;
import u53.b;
import tma.c;
import com.yxcorp.gifshow.gamezone.model.LiveGzoneAudienceCustomSkinConfig;
import com.kuaishou.live.lite.background.a;
import ga1.e;
import or5.d;
import vb3.m;
import na3.b;
import vb3.h;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;
import vb3.n;
import a93.a;
import ec3.f;
import msd.a;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import c93.b;
import d93.a;
import sj3.l;

public class LiveLiteBackgroundPresenter extends d	// class@001e79
{
    public b A;
    public LiveLiteScatterLoadManager B;
    public h C;
    public n v;
    public e w;
    public d x;
    public l y;
    public m z;

    public void LiveLiteBackgroundPresenter(){
       super();
    }
    public void F8(){
       LiveAudienceCustomSkinConfig liveAudience;
       Object[] objArray1;
       LiveLiteBackgroundPresenter liveLiteBack = LiveLiteBackgroundPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteBack, "3")) {
          return;
       }
       super.F8();
       LiveStreamFeed liveStreamFe = this.x.j0();
       if (liveStreamFe != null) {
          LiveStreamFeed mLiveStreamM = liveStreamFe.mLiveStreamModel;
          LiveStreamModel mLiveAudienc = (mLiveStreamM != null)? mLiveStreamM.mLiveAudienceCustomSkinConfig: objArray;
          if (mLiveAudienc == null) {
             liveAudience = PatchProxy.applyOneRefs(liveStreamFe, this, liveLiteBack, "4");
             if (liveAudience != PatchProxyResult.class) {
             }else {
                LiveStreamFeed mConfig = liveStreamFe.mConfig;
                if (mConfig != null && b.b(mConfig, r1.U1(liveStreamFe)).b()) {
                   LiveGzoneAudienceCustomSkinConfig liveGzoneAud = c.a.a(liveStreamFe);
                   if (liveGzoneAud != null) {
                      liveAudience = liveGzoneAud.convertToCustomSkinConfigForLiteLive(b.b(liveStreamFe.mConfig, r1.U1(liveStreamFe)).f());
                   }
                }
             }
             objArray = liveAudience;
          }else {
             objArray1 = mLiveAudienc;
          label_005f :
             a uoa = new a(this.w, this.x, this.z, this.A, this.C, objArray1);
             this.v.c(LayoutViewType.PlayerViewBackground, liveAudience);
             a uoa1 = new a(this);
             if (f.h()) {
                this.B.W1("LoadingVc", uoa1);
             }else {
                uoa1.invoke();
             }
             return;
          }
       }
    label_005e :
       objArray1 = objArray;
       goto label_005f ;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBackgroundPresenter.class, "1")) {
          return;
       }
       this.x = p0.a(d.class);
       this.B = p0.a(LiveLiteScatterLoadManager.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBackgroundPresenter.class, "2")) {
          return;
       }
       this.v = p0.a(n.class);
       this.w = p0.a(e.class);
       this.y = p0.a(l.class);
       this.z = p0.a(m.class);
       this.A = p0.a(b.class);
       this.C = p0.a(h.class);
       return;
    }
}
