package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.like.AdLikeElement$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.like.AdLikeElement;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.x0;
import qp7.b;
import com.kwai.slide.play.detail.rightactionbar.like.b;
import com.yxcorp.gifshow.entity.QPhoto;

public class AdLikeElement$1 implements DefaultLifecycleObserver	// class@001723
{
    public final AdLikeElement b;

    public void AdLikeElement$1(AdLikeElement p0){
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
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdLikeElement$1.class, "1")) {
          return;
       }
       this.b.E().i(this.b.u.isLiked());
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
