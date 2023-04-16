package com.kwai.live.gzone.tab.hybrid.LiveGzoneHybridTabWrapperFragment$a;
import o63.c;
import com.kwai.live.gzone.tab.hybrid.LiveGzoneHybridTabWrapperFragment;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zj0.x;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import java.lang.Boolean;

public final class LiveGzoneHybridTabWrapperFragment$a implements c	// class@000e0f
{
    public final LiveGzoneHybridTabWrapperFragment b;

    public void LiveGzoneHybridTabWrapperFragment$a(LiveGzoneHybridTabWrapperFragment p0){
       this.b = p0;
       super();
    }
    public Integer I2(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneHybridTabWrapperFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public void L(){
    }
    public x ea(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneHybridTabWrapperFragment$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public Lifecycle getLifecycle(){
       Lifecycle obj = PatchProxy.apply(null, this, LiveGzoneHybridTabWrapperFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.getLifecycle();
       a.o(obj, "this@LiveGzoneHybridTabWrapperFragment.lifecycle");
       return obj;
    }
    public void l0(boolean p0){
       if (PatchProxy.isSupport(LiveGzoneHybridTabWrapperFragment$a.class)) {
          PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGzoneHybridTabWrapperFragment$a.class, "4");
       }
       return;
    }
    public void n0(){
       PatchProxy.applyVoid(null, this, LiveGzoneHybridTabWrapperFragment$a.class, "5");
    }
}
