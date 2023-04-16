package com.kuaishou.live.core.show.subscribe.pendant.LiveAudienceSubscribePendantPresenter$3;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.core.show.subscribe.pendant.LiveAudienceSubscribePendantPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ea1.a;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import yk2.i;
import java.lang.Runnable;

public class LiveAudienceSubscribePendantPresenter$3 implements DefaultLifecycleObserver	// class@001144
{
    public final LiveAudienceSubscribePendantPresenter b;

    public void LiveAudienceSubscribePendantPresenter$3(LiveAudienceSubscribePendantPresenter p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSubscribePendantPresenter$3.class, "2")) {
          return;
       }
       LiveAudienceSubscribePendantPresenter s = this.b.S;
       if (s != null) {
          s.b();
       }
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSubscribePendantPresenter$3.class, "1")) {
          return;
       }
       p0.S = new a(ViewElement.SUBSCRIBE_PENDANT, new i(this));
       this.b.S.c();
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
