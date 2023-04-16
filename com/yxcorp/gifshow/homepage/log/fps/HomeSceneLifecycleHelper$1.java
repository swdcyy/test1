package com.yxcorp.gifshow.homepage.log.fps.HomeSceneLifecycleHelper$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.homepage.log.fps.HomeSceneLifecycleHelper;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import com.kwai.component.tti.TTIStrategy;
import java.lang.StringBuilder;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor;

public class HomeSceneLifecycleHelper$1 implements DefaultLifecycleObserver	// class@00176c
{
    public final HomeSceneLifecycleHelper b;

    public void HomeSceneLifecycleHelper$1(HomeSceneLifecycleHelper p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       StringBuilder str;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeSceneLifecycleHelper$1.class, "2")) {
          return;
       }
       if (this.b.a.Vg().c()) {
          HomeSceneLifecycleHelper$1 tb = this.b;
          HomeSceneLifecycleHelper b = tb.b;
          if (b != null) {
             FpsMonitor.stopSection(b, tb.a.getActivity());
             TTIStrategy.b(this.b.b, true);
             HomeSceneLifecycleHelper a = this.b.a;
             if (a != null && a.getActivity() != null) {
                str = "stop Battery Monitor Session when onPause : "+this.b.b+" £º"+this.b.a;
                BatteryMonitor.stopSection(this.b.a.getActivity().getClass().getSimpleName()+"_"+this.b.b);
             }
             str.b = null;
          }
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeSceneLifecycleHelper$1.class, "1")) {
          return;
       }
       if (this.b.a.Vg().c()) {
          HomeSceneLifecycleHelper$1 tb = this.b;
          tb.c = tb.a(tb.a);
          tb = this.b;
          tb.b = tb.b(tb.a, tb.c);
          String str = " £º";
          StringBuilder str1 = "start Monitor when onResume : "+this.b.b+str+this.b.c+str+this.b.a;
          tb = this.b;
          FpsMonitor.startSection(tb.b, tb.a.getActivity());
          tb = this.b;
          TTIStrategy.a(tb.b, tb.c, true);
          HomeSceneLifecycleHelper a = this.b.a;
          if (a != null && a.getActivity() != null) {
             str1 = "start Battery Monitor Session when onResume : "+this.b.b+str+this.b.a;
             BatteryMonitor.startSection(this.b.a.getActivity().getClass().getSimpleName()+"_"+this.b.b);
          }
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
