package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$i;
import sj3.b;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import java.lang.Object;
import sj3.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveFloatingWindowManager$i implements b	// class@000b69
{
    public final LiveFloatingWindowManager b;

    public void LiveFloatingWindowManager$i(LiveFloatingWindowManager p0){
       this.b = p0;
       super();
    }
    public void c(){
       a.a(this);
    }
    public void e(){
       a.d(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       a.b(this, p0, p1);
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingWindowManager$i.class, "1")) {
          return;
       }
       this.b.j(p0);
       return;
    }
}
