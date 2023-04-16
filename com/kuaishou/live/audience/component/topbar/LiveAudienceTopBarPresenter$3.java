package com.kuaishou.live.audience.component.topbar.LiveAudienceTopBarPresenter$3;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.audience.component.topbar.LiveAudienceTopBarPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ea1.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import g31.g;
import java.lang.Runnable;

public class LiveAudienceTopBarPresenter$3 implements DefaultLifecycleObserver	// class@000bde
{
    public final LiveAudienceTopBarPresenter b;

    public void LiveAudienceTopBarPresenter$3(LiveAudienceTopBarPresenter p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceTopBarPresenter$3.class, "2")) {
          return;
       }
       LiveAudienceTopBarPresenter y = this.b.Y;
       if (y != null) {
          y.b();
       }
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceTopBarPresenter$3.class, "1")) {
          return;
       }
       if (!this.b.V.isGRPRCustomizedLive()) {
          p0.Y = new a(ViewElement.TOP_BAR, new g(this));
          this.b.Y.c();
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
