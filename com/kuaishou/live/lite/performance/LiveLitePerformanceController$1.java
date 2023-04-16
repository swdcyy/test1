package com.kuaishou.live.lite.performance.LiveLitePerformanceController$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.lite.performance.LiveLitePerformanceController;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.util.Objects;
import o56.a;
import ec3.f;
import android.content.Context;
import lnc.a1;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.Toast;

public class LiveLitePerformanceController$1 implements LifecycleEventObserver	// class@000a36
{
    public final LifecycleOwner b;
    public final LiveLitePerformanceController c;

    public void LiveLitePerformanceController$1(LiveLitePerformanceController p0,LifecycleOwner p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLitePerformanceController$1.class, "1")) {
          return;
       }
       if (p1 == Lifecycle$Event.ON_PAUSE) {
          this.c.b();
       }else if(p1 == Lifecycle$Event.ON_DESTROY){
          this.c.b();
          this.b.getLifecycle().removeObserver(this);
       }else if(p1 == Lifecycle$Event.ON_RESUME){
          LiveLitePerformanceController$1 tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(null, tc, LiveLitePerformanceController.class, "4") && (a.d() && !f.b())) {
             Context uContext = a1.c();
             StringBuilder str = "Lite: 启用布局AX2C："+f.j()+"\nLite: 启用Class预加载："+f.g()+"\nLite: 启用码率选择优化："+f.f()+"\nLite: 打散策略: ";
             String str1 = (f.k())? "VSYNC + POST": "POST";
             Toast.makeText(uContext, str+str1, 1).show();
          }
       }
       return;
    }
}
