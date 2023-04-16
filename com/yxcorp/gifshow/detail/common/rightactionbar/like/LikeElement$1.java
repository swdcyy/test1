package com.yxcorp.gifshow.detail.common.rightactionbar.like.LikeElement$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.detail.common.rightactionbar.like.LikeElement;
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

public class LikeElement$1 implements DefaultLifecycleObserver	// class@0014a2
{
    public final LikeElement b;

    public void LikeElement$1(LikeElement p0){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, LikeElement$1.class, "1")) {
          return;
       }
       this.b.E().i(this.b.v.isLiked());
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
