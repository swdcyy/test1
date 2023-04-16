package com.yxcorp.gifshow.page.cost.list.ListPageFirstRenderObserver$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.page.cost.list.ListPageFirstRenderObserver;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;

public class ListPageFirstRenderObserver$1 implements DefaultLifecycleObserver	// class@000e1f
{
    public final ListPageFirstRenderObserver b;

    public void ListPageFirstRenderObserver$1(ListPageFirstRenderObserver p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ListPageFirstRenderObserver$1.class, "1")) {
          return;
       }
       ListPageFirstRenderObserver$1 tb = this.b;
       tb.c.removeFrameCallback(tb);
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
