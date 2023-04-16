package com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import androidx.lifecycle.LiveData;
import java.util.LinkedHashMap;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent$a;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent$observe$observerWrapper$1;
import msd.a;

public abstract class LiveEvent extends LiveData	// class@000d19
{
    public final Map a;
    public boolean b;

    public void LiveEvent(){
       super();
       this.a = new LinkedHashMap();
    }
    public void observe(LifecycleOwner p0,Observer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveEvent.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       a.p(p1, "observer");
       if (this.a.get(p1) != null) {
          return;
       }
       LiveEvent$a uoa = new LiveEvent$a(p1, new LiveEvent$observe$observerWrapper$1(this));
       this.a.put(p1, uoa);
       super.observe(p0, uoa);
       return;
    }
    public void removeObserver(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEvent.class, "2")) {
          return;
       }
       a.p(p0, "observer");
       if (p0 instanceof LiveEvent$a) {
          super.removeObserver(p0);
       }else {
          LiveEvent$a uoa = this.a.remove(p0);
          if (uoa != null) {
             super.removeObserver(uoa);
          }
       }
       return;
    }
    public void setValue(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEvent.class, "3")) {
          return;
       }
       this.b = true;
       super.setValue(p0);
       this.b = false;
       return;
    }
}
