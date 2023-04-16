package com.kwai.performance.stability.crash.monitor.anr.config.AnrConfigTypeAdapterFactory;
import zk.j;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv$JvmtiControl;
import com.kwai.performance.stability.crash.monitor.anr.config.AsyncScheduleConfig;
import java.util.Map;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdapter;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdvAdapter;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdvAdapter$JvmtiControlAdapter;
import com.kwai.performance.stability.crash.monitor.anr.config.AsyncScheduleConfigAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import zk.i;
import com.google.gson.b;

public class AnrConfigTypeAdapterFactory implements j	// class@000e02
{
    public final Map b;

    public void AnrConfigTypeAdapterFactory(){
       super();
       this.b = new ConcurrentHashMap();
    }
    public TypeAdapter a(Gson p0,a p1){
       AnrMonitorConfigAdapter uAnrMonitorC;
       Class rawType = p1.getRawType();
       if (rawType != AnrMonitorConfig.class && (rawType != AnrMonitorConfigAdv.class && (rawType != AnrMonitorConfigAdv$JvmtiControl.class && rawType != AsyncScheduleConfig.class))) {
          return null;
       }
       TypeAdapter typeAdapter = this.b.get(rawType);
       if (typeAdapter != null) {
          return typeAdapter;
       }
       AnrConfigTypeAdapterFactory tb = this.b;
       _monitor_enter(tb);
       TypeAdapter typeAdapter1 = this.b.get(rawType);
       if (typeAdapter1 != null) {
          _monitor_exit(tb);
          return typeAdapter1;
       }else if(rawType == AnrMonitorConfig.class){
          uAnrMonitorC = new AnrMonitorConfigAdapter();
       }else if(rawType == AnrMonitorConfigAdv.class){
          uAnrMonitorC = new AnrMonitorConfigAdvAdapter();
       }else if(rawType == AnrMonitorConfigAdv$JvmtiControl.class){
          uAnrMonitorC = new AnrMonitorConfigAdvAdapter$JvmtiControlAdapter();
       }else {
          uAnrMonitorC = new AsyncScheduleConfigAdapter();
       }
       AnrMonitorConfigAdapter uAnrMonitorC1 = uAnrMonitorC;
       TreeTypeAdapter treeTypeAdap = new TreeTypeAdapter(uAnrMonitorC1, uAnrMonitorC1, p0, p1, this);
       this.b.put(rawType, uAnrMonitorC);
       _monitor_exit(tb);
       return uAnrMonitorC;
    }
}
