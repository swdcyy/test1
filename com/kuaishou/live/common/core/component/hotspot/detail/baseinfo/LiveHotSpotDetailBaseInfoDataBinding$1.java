package com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoDataBinding$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoDataBinding;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import un1.d;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.lifecycle.MutableLiveData;
import un1.k;
import ln1.c;

public final class LiveHotSpotDetailBaseInfoDataBinding$1 implements DefaultLifecycleObserver	// class@00136b
{
    public final LiveHotSpotDetailBaseInfoDataBinding b;

    public void LiveHotSpotDetailBaseInfoDataBinding$1(LiveHotSpotDetailBaseInfoDataBinding p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotDetailBaseInfoDataBinding$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       this.b.e.C0().removeOnScrollListener(this.b.b);
       this.b.f.o0().setValue(new c(0));
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
