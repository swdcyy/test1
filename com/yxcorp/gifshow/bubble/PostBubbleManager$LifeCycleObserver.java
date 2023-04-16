package com.yxcorp.gifshow.bubble.PostBubbleManager$LifeCycleObserver;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import java.lang.Object;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleObserver;
import crd.b;
import java.util.Map;
import lnc.l3;
import q87.c;
import com.yxcorp.gifshow.bubble.a;
import java.util.List;
import ra9.c;

public class PostBubbleManager$LifeCycleObserver implements DefaultLifecycleObserver	// class@001c6e
{
    public final Object b;
    public final Lifecycle c;
    public final PostBubbleManager d;

    public void PostBubbleManager$LifeCycleObserver(PostBubbleManager p0,Object p1,Lifecycle p2){
       this.d = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostBubbleManager$LifeCycleObserver.class, "4")) {
          return;
       }
       this.c.removeObserver(this);
       PostBubbleManager e = this.d.e;
       if (e != null) {
          e.dispose();
          e.e = null;
       }
       PostBubbleManager.n.remove(this.b);
       return;
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostBubbleManager$LifeCycleObserver.class, "2")) {
          return;
       }
       p0.a = false;
       Object[] objArray = new Object[false];
       l3.C().w("PostBubbleManager", "onPause", objArray);
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostBubbleManager$LifeCycleObserver.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       l3.C().w("PostBubbleManager", "onResume", objArray);
       PostBubbleManager$LifeCycleObserver td = this.d;
       td.a = true;
       td.r(td.j);
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostBubbleManager$LifeCycleObserver.class, "3")) {
          return;
       }
       this.d.g.clear();
       PostBubbleManager j = this.d.j;
       if (j != null && j.d().isAutoDismissWhenPageStop()) {
          this.d.c();
       }
       Object[] objArray = new Object[0];
       l3.C().w("PostBubbleManager", "onStop", objArray);
       return;
    }
}
