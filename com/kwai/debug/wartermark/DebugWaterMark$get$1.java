package com.kwai.debug.wartermark.DebugWaterMark$get$1;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import com.kwai.debug.wartermark.DebugWaterMark;
import java.util.HashMap;

public final class DebugWaterMark$get$1 implements LifecycleObserver	// class@000cf9
{
    public final LifecycleOwner b;

    public void DebugWaterMark$get$1(LifecycleOwner p0){
       this.b = p0;
       super();
    }
    public final void onDestroy(){
       if (PatchProxy.applyVoid(null, this, DebugWaterMark$get$1.class, "1")) {
          return;
       }
       this.b.getLifecycle().removeObserver(this);
       DebugWaterMark.c.remove(this.b);
       DebugWaterMark.d.remove(this.b);
       return;
    }
}
