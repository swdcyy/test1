package com.kwai.library.widget.sensormanager.KwaiSensorManager;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.library.widget.sensormanager.KwaiSensorManager$a;
import com.kwai.library.widget.sensormanager.KwaiSensorManager$2;
import android.content.Context;
import lnc.a1;
import java.lang.String;
import android.hardware.SensorManager;
import u17.d;
import java.lang.Runnable;
import u17.e;
import androidx.lifecycle.Lifecycle;
import java.lang.StringBuilder;
import java.lang.Class;
import java.util.Map;
import java.util.List;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import u17.c;
import erd.r;
import brd.z;
import lrd.b;
import io.reactivex.android.schedulers.a;
import u17.b;
import erd.g;
import v17.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.LifecycleObserver;

public class KwaiSensorManager	// class@0009f6
{
    public final SensorManager a;
    public final Map b;
    public final Map c;
    public final d d;
    public final e e;
    public boolean f;
    public final Runnable g;
    public LifecycleEventObserver h;
    public static KwaiSensorManager i;

    public void KwaiSensorManager(){
       super();
       this.b = new HashMap();
       this.c = new HashMap();
       this.f = false;
       KwaiSensorManager$a uoa = new KwaiSensorManager$a(this);
       this.g = uoa;
       this.h = new KwaiSensorManager$2(this);
       this.a = a1.c().getSystemService("sensor");
       this.d = new d(uoa);
       this.e = new e();
    }
    public static KwaiSensorManager d(){
       if (KwaiSensorManager.i == null) {
          KwaiSensorManager kwaiSensorMa = KwaiSensorManager.class;
          _monitor_enter(kwaiSensorMa);
          if (KwaiSensorManager.i == null) {
             KwaiSensorManager.i = new KwaiSensorManager();
          }
          _monitor_exit(kwaiSensorMa);
       }
       return KwaiSensorManager.i;
    }
    public static String e(Lifecycle p0){
       return p0.getClass().getCanonicalName()+":"+p0.hashCode();
    }
    public void a(Lifecycle p0){
       String str = KwaiSensorManager.e(p0);
       if (this.f(this.b.get(str))) {
          return;
       }
       this.c.put(str, this.b.get(str));
       return;
    }
    public void b(){
       if (this.f == null && !this.c.isEmpty()) {
          this.f = true;
          KwaiSensorManager ta = this.a;
          ta.registerListener(this.e, ta.getDefaultSensor(9), 2);
          ta = this.d;
          d c = ta.c;
          if (c == null || c.isDisposed()) {
             ta.b = false;
             ta.c = t.interval(20, TimeUnit.MILLISECONDS).filter(new c(ta)).subscribeOn(b.a()).observeOn(a.c()).retry().subscribe(new b(ta));
          }
       }
       return;
    }
    public void c(){
       if (this.c.isEmpty()) {
          KwaiSensorManager td = this.d;
          td.b = true;
          d c = td.c;
          if (c != null && !c.isDisposed()) {
             td.c.dispose();
             td.c = null;
          }
          this.a.unregisterListener(this.e);
          this.f = false;
       }
       return;
    }
    public boolean f(List p0){
       boolean b = (p0 == null || p0.isEmpty())? true: false;
       return b;
    }
    public boolean g(Lifecycle p0,b p1){
       if (this.a == null) {
          return false;
       }
       String str = KwaiSensorManager.e(p0);
       if (!this.b.containsKey(str) || this.f(this.b.get(str))) {
          this.b.put(str, new ArrayList());
       }
       Iterator iterator = this.b.get(str).iterator();
       while (true) {
          if (iterator.hasNext()) {
             WeakReference weakReferenc = iterator.next();
             if (weakReferenc == null || weakReferenc.get() != p1) {
                continue ;
             }
          }else {
             this.b.get(str).add(new WeakReference(p1));
          }
          if (p0.getCurrentState().isAtLeast(Lifecycle$State.STARTED)) {
             this.a(p0);
             break ;
          }
          break ;
       }
       p0.addObserver(this.h);
       this.b();
       return true;
    }
    public void h(Lifecycle p0){
       String str = KwaiSensorManager.e(p0);
       List list = this.b.get(str);
       if (list != null) {
          list.clear();
       }
       this.b.remove(str);
       return;
    }
    public void i(Lifecycle p0){
       this.c.remove(KwaiSensorManager.e(p0));
    }
    public void j(Lifecycle p0){
       this.i(p0);
       this.h(p0);
       this.c();
    }
}
