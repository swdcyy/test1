package com.kwai.performance.monitor.base.MonitorManager$registerMonitorEventObserver$1;
import androidx.lifecycle.LifecycleEventObserver;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import yf7.k;
import java.util.Objects;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.performance.monitor.base.Monitor;
import yf7.i;
import org.json.JSONObject;
import yf7.d;
import yf7.d$a;

public final class MonitorManager$registerMonitorEventObserver$1 implements LifecycleEventObserver	// class@000dbd
{
    public boolean b;

    public void MonitorManager$registerMonitorEventObserver$1(){
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       a.q(p0, "source");
       a.q(p1, "event");
       if (p1 == Lifecycle$Event.ON_START && this.b == null) {
          this.b = true;
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          Objects.requireNonNull(k.c);
          Iterator iterator = k.a.entrySet().iterator();
          while (iterator.hasNext()) {
             linkedHashMa.putAll(iterator.next().getValue().getLogParams());
          }
          d$a.c(i.a, "switch-stat", new JSONObject(linkedHashMa).toString(), false, 4, null);
       }
       return;
    }
}
