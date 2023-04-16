package com.kwai.performance.stability.crash.monitor.LifecycleCallbacksHandler$recordActivityLifeCycleLog$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.app.Activity;
import com.kwai.performance.stability.crash.monitor.LifecycleCallbacksHandler$LifeCycle;
import android.os.Bundle;
import java.lang.Object;
import qrd.l1;
import com.kwai.performance.stability.crash.monitor.LifecycleCallbacksHandler;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;
import vg7.j;
import java.lang.Class;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.Exception;

public final class LifecycleCallbacksHandler$recordActivityLifeCycleLog$1 extends Lambda implements a	// class@001197
{
    public final Activity $activity;
    public final Bundle $bundle;
    public final LifecycleCallbacksHandler$LifeCycle $name;
    public final boolean $recordBundle;

    public void LifecycleCallbacksHandler$recordActivityLifeCycleLog$1(Activity p0,LifecycleCallbacksHandler$LifeCycle p1,boolean p2,Bundle p3){
       this.$activity = p0;
       this.$name = p1;
       this.$recordBundle = p2;
       this.$bundle = p3;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       try{
          StringBuilder str = LifecycleCallbacksHandler.d+"\ntime: "+j.a(System.currentTimeMillis())+",name: "+this.$activity.getClass().getName()+"@"+this.$activity.hashCode()+",method: "+this.$name;
          if (this.$recordBundle != null) {
             str = str+",has bundle: ";
             boolean b = (this.$bundle != null)? true: false;
             str = str+b;
          }
          String str1 = str;
          a.o(str1, "mStringBuilder.toString\(\)");
          List list = LifecycleCallbacksHandler.b();
          _monitor_enter(list);
          if (LifecycleCallbacksHandler.b().size() >= 50) {
             LifecycleCallbacksHandler.b().remove(0);
          }
          LifecycleCallbacksHandler.b().add(str1);
          _monitor_exit(list);
          str.setLength(0);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
}
