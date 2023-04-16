package com.kwai.feature.post.api.util.PostService$2;
import androidx.lifecycle.LifecycleObserver;
import q46.r;
import androidx.lifecycle.Lifecycle;
import r26.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r16.f;
import java.util.List;
import java.util.Map;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;

public class PostService$2 implements LifecycleObserver	// class@00145c
{
    public final Lifecycle b;
    public final e c;
    public final r d;

    public void PostService$2(r p0,Lifecycle p1,e p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PostService$2.class, "1")) {
          return;
       }
       this.b.removeObserver(this);
       r.c.K3(this.c);
       this.d.a.clear();
       PostService$2 tb = this.b;
       r or = r.class;
       _monitor_enter(or);
       int i = 0;
       if (PatchProxy.applyVoidOneRefs(tb, objArray, or, "2")) {
          _monitor_exit(or);
       }else {
          Map b = r.b;
          b.remove(tb);
          objArray = new Object[i];
          p3.D().w("PostService", "removePostService: activityId="+tb+" size="+b.size(), objArray);
          _monitor_exit(or);
       }
       Object[] objArray1 = new Object[i];
       p3.D().w("PostService", "onDestroy: remove all listeners", objArray1);
       return;
    }
}
