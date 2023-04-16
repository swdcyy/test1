package com.yxcorp.gifshow.live.widget.SurfaceSnapshotController$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.live.widget.SurfaceSnapshotController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import l1b.b;

public class SurfaceSnapshotController$1 implements LifecycleObserver	// class@001a90
{
    public final SurfaceSnapshotController b;

    public void SurfaceSnapshotController$1(SurfaceSnapshotController p0){
       this.b = p0;
       super();
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, SurfaceSnapshotController$1.class, "1")) {
          return;
       }
       SurfaceSnapshotController f = this.b.f;
       if (f instanceof Activity && f.isFinishing()) {
          return;
       }
       b.b("SurfaceSnapshotController", "onPause");
       this.b.f();
       return;
    }
}
