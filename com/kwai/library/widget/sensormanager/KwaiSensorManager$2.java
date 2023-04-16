package com.kwai.library.widget.sensormanager.KwaiSensorManager$2;
import androidx.lifecycle.LifecycleEventObserver;
import com.kwai.library.widget.sensormanager.KwaiSensorManager;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle;
import java.lang.String;
import com.kwai.library.widget.sensormanager.KwaiSensorManager$b;
import java.lang.Enum;
import androidx.lifecycle.LifecycleObserver;
import java.util.Map;

public class KwaiSensorManager$2 implements LifecycleEventObserver	// class@0009f3
{
    public final KwaiSensorManager b;

    public void KwaiSensorManager$2(KwaiSensorManager p0){
       this.b = p0;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       Lifecycle lifecycle = p0.getLifecycle();
       String str = KwaiSensorManager.e(lifecycle);
       int i = KwaiSensorManager$b.a[p1.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                lifecycle.removeObserver(this);
                this.b.i(lifecycle);
                this.b.h(lifecycle);
             }
          }else {
             this.b.i(lifecycle);
             this.b.c();
          }
       }else if(this.b.b.containsKey(str)){
          this.b.a(lifecycle);
       }else if(this.b.c.containsKey(str)){
          this.b.i(lifecycle);
       }
       this.b.b();
       return;
    }
}
