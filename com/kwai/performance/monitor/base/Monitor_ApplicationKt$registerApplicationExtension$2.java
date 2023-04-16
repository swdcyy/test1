package com.kwai.performance.monitor.base.Monitor_ApplicationKt$registerApplicationExtension$2;
import androidx.lifecycle.LifecycleEventObserver;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.String;
import kotlin.jvm.internal.a;
import yf7.n;
import java.lang.Enum;
import yf7.p;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class Monitor_ApplicationKt$registerApplicationExtension$2 implements LifecycleEventObserver	// class@000dbe
{

    public void Monitor_ApplicationKt$registerApplicationExtension$2(){
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       a.q(p0, "source");
       a.q(p1, "event");
       int i = n.a[p1.ordinal()];
       boolean b = true;
       if (i != b) {
          if (i == 2) {
             p.b = false;
          }
       }else {
          p.b = b;
       }
       Iterator iterator = p.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().onStateChanged(p0, p1);
       }
       return;
    }
}
