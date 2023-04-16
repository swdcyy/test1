package com.kuaishou.live.preview.item.presenter.ad.LivePreviewAdAutoToLivePresenter$2;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.preview.item.presenter.ad.LivePreviewAdAutoToLivePresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;

public class LivePreviewAdAutoToLivePresenter$2 implements DefaultLifecycleObserver	// class@000e02
{
    public final LivePreviewAdAutoToLivePresenter b;

    public void LivePreviewAdAutoToLivePresenter$2(LivePreviewAdAutoToLivePresenter p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewAdAutoToLivePresenter$2.class, "2")) {
          return;
       }
       LivePreviewAdAutoToLivePresenter$2 tb = this.b;
       tb.w = false;
       b9.a(tb.u);
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewAdAutoToLivePresenter$2.class, "1")) {
          return;
       }
       LivePreviewAdAutoToLivePresenter$2 tb = this.b;
       tb.w = true;
       tb.S8();
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
