package com.kwai.performance.fluency.thermal.monitor.ThermalMonitor;
import com.kwai.performance.monitor.base.Monitor;
import android.os.Build$VERSION;
import android.app.Application;
import yf7.k;
import java.lang.String;
import java.lang.Object;
import android.os.PowerManager;
import com.kwai.performance.fluency.thermal.monitor.ThermalMonitor$startSection$2;
import android.os.PowerManager$OnThermalStatusChangedListener;
import java.lang.Exception;
import yf7.h;
import kotlin.TypeCastException;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import java.lang.RuntimeException;
import vf7.a;
import android.content.Context;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public final class ThermalMonitor extends Monitor	// class@0010ed
{
    public static final ThermalMonitor INSTANCE;
    public static int mLastThermalStatus;
    public static long mLastThermalTime;
    public static PowerManager$OnThermalStatusChangedListener mListener;
    public static PowerManager mPowerManager;

    static {
       ThermalMonitor.INSTANCE = new ThermalMonitor();
    }
    public void ThermalMonitor(){
       super();
    }
    public static final int access$getMLastThermalStatus$p(ThermalMonitor p0){
       return ThermalMonitor.mLastThermalStatus;
    }
    public static final long access$getMLastThermalTime$p(ThermalMonitor p0){
       return ThermalMonitor.mLastThermalTime;
    }
    public static final void access$setMLastThermalStatus$p(ThermalMonitor p0,int p1){
       ThermalMonitor.mLastThermalStatus = p1;
    }
    public static final void access$setMLastThermalTime$p(ThermalMonitor p0,long p1){
       ThermalMonitor.mLastThermalTime = p1;
    }
    public static final void startSection(){
       if (Build$VERSION.SDK_INT < 29) {
          return;
       }
       if (ThermalMonitor.INSTANCE.isInitialized()) {
          Object systemServic = k.b().getSystemService("power");
          if (systemServic == null) {
             throw new TypeCastException("null cannot be cast to non-null type android.os.PowerManager");
          }
          ThermalMonitor.mPowerManager = systemServic;
          ThermalMonitor$startSection$2 a = ThermalMonitor$startSection$2.a;
          try{
             systemServic.addThermalStatusListener(a);
          }catch(java.lang.Exception e0){
             h.b("ThermalMonitor", e0.toString());
          }
          ThermalMonitor.mListener = a;
          return;
       }else if(!MonitorBuildConfig.b()){
          return;
       }else {
          throw new RuntimeException("Monitor is not initialized");
       }
    }
    public static final void stopSection(){
       if (Build$VERSION.SDK_INT < 29) {
          return;
       }
       if (ThermalMonitor.INSTANCE.isInitialized()) {
          PowerManager$OnThermalStatusChangedListener mListener = ThermalMonitor.mListener;
          if (mListener != null) {
             PowerManager mPowerManage = ThermalMonitor.mPowerManager;
             if (mPowerManage != null) {
                mPowerManage.removeThermalStatusListener(mListener);
             }
          }
          return;
       }else if(!MonitorBuildConfig.b()){
          return;
       }else {
          throw new RuntimeException("Monitor is not initialized");
       }
    }
    public final void collectBatteryStat(a p0,Context p1){
       Intent intent = UniversalReceiver.e(p1, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
       if (intent != null) {
          p0.batteryTemperature = intent.getIntExtra("temperature", 0);
          p0.batteryLevel = intent.getIntExtra("level", 0);
          int intExtra = intent.getIntExtra("status", -1);
          String str = (intExtra == 2 || intExtra == 5)? String.valueOf(true): String.valueOf(0);
          p0.isCharging = str;
       }
       return;
    }
}
