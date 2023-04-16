package com.kuaishou.live.core.show.floatingwindow.e$a;
import com.kuaishou.live.core.show.floatingwindow.e$h;
import com.kuaishou.live.core.show.floatingwindow.e;
import java.lang.Object;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowCloseType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.floatingwindow.z;
import java.util.List;
import java.lang.ref.WeakReference;
import t02.a0;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.basic.utils.e;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.System;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import pp.d;

public class e$a implements e$h	// class@000b7b
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(LiveFloatingWindowCloseType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       b.a(0x432c5e03).c(p0);
       return;
    }
    public int b(){
       return this.a.v;
    }
    public void c(int p0){
       this.a.v = p0;
    }
    public boolean d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       e$a obj = PatchProxy.apply(objArray, this, e$a.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       int b1 = (ActivityContext.g().e() == this.a.getActivity())? true: false;
       e w = this.a.w;
       z oz = z.class;
       if (PatchProxy.isSupport(oz)) {
          Activity obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(b1), objArray, oz, "9");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else if(!b1){
             objArray = ActivityContext.g().e();
          }else {
             List list = ActivityContext.g().c();
             b1 = list.size() - 2;
             while (b1 >= 0) {
                obj1 = list.get(b1).get();
                if (obj1 != null) {
                   objArray = obj1;
                   break ;
                }
                b1 = b1 - 1;
             }
          }
       }else {
          goto label_0045 ;
       }
       if (!z.f(w, objArray)) {
          obj = this.a;
          if (!b.a(0x432c5e03).p(obj.D, obj.B)) {
             b = false;
          }
       }
       return b;
    }
    public boolean e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       e$a obj = PatchProxy.apply(objArray, this, e$a.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int i = 0x432c5e03;
       if (ActivityContext.g().e() != null && e.m(this.a.getActivity())) {
          obj = this.a;
          if (z.g(obj.w, obj.getActivity())) {
             obj = this.a;
             if (obj.I.mIsActivityClosedBySwipeOut != null) {
                obj.v = 1;
             }
             obj.D.clearAllListener();
             if (!b.a(i).o().booleanValue()) {
                obj = this.a;
                Objects.requireNonNull(obj);
                Object obj1 = PatchProxy.apply(objArray, obj, e.class, "11");
                if (obj1 != patchProxyRe) {
                   objArray = obj1;
                }else if(obj.w.g == null){
                   e h = obj.H;
                   if (h != null) {
                      LiveAudienceParam$a uoa = new LiveAudienceParam$a(h);
                      uoa.v(System.currentTimeMillis());
                      LiveAudienceParam liveAudience = uoa.a();
                      LiveSlidePlayEnterParam$b uob = new LiveSlidePlayEnterParam$b();
                      uob.o(liveAudience.mLiveSourceType);
                      uob.m(liveAudience);
                      uob.G(1);
                      objArray = uob.a();
                   }
                }
                this.a.F.h(LiveLogTag.PLAY_FRAGMENT, "showFloatingWindow");
                e$a ta = this.a;
                ta.Y8(ta.D, ta.B, ta.v, objArray);
             }
             return 1;
          }
       }
       obj = this.a;
       return b.a(i).p(obj.D, obj.B);
    }
}
