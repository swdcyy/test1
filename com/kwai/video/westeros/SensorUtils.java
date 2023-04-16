package com.kwai.video.westeros.SensorUtils;
import android.hardware.SensorEventListener;
import android.content.Context;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Handler;
import android.os.Looper;
import android.hardware.SensorManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.westeros.error.WesterosErrorCode$Result;
import java.lang.StringBuilder;
import com.kwai.camerasdk.log.Log;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.concurrent.TimeUnit;
import java.lang.System;
import android.os.SystemClock;
import com.kwai.video.westeros.SensorUtils$1;
import java.lang.Runnable;
import com.kwai.video.westeros.SensorUtils$2;
import java.lang.Exception;
import java.lang.Float;
import com.kwai.video.westeros.SensorUtils$3;

public class SensorUtils implements SensorEventListener	// class@000e64
{
    public Sensor accelertion_sensor_;
    public WeakReference contextWeakReference;
    public boolean disposed;
    public long event_no_sensor_timestamp;
    public Sensor gravity_sensor_;
    public Sensor gyro_sensor_;
    public final Handler handler;
    public long imu_timestamp_shift;
    public Sensor magnetic_sensor_;
    public long native_sensor_manager;
    public Sensor rotation_sensor_;
    public SensorManager sensorManagerInstance;
    public boolean use_event_time_flag;
    public static final float G = 9.810000;
    public static final String TAG = "SensorUtils";
    public static int server_rate;

    public void SensorUtils(Context p0,long p1){
       super();
       this.native_sensor_manager = 0;
       this.disposed = false;
       this.imu_timestamp_shift = 0;
       this.use_event_time_flag = false;
       this.event_no_sensor_timestamp = 0;
       this.native_sensor_manager = p1;
       this.contextWeakReference = new WeakReference(p0);
       HandlerThread handlerThrea = new HandlerThread("WSensorUtilsThread");
       handlerThrea.start();
       this.handler = new Handler(handlerThrea.getLooper());
    }
    public static void setRate(int p0){
       SensorUtils.server_rate = p0;
    }
    public SensorManager getSensorManager(){
       Object[] objArray = null;
       SensorUtils obj = PatchProxy.apply(objArray, this, SensorUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.sensorManagerInstance;
       if (obj != null) {
          return obj;
       }
       obj = this.contextWeakReference;
       if (obj == null) {
          Log.e("SensorUtils", "getSensorManager return null,no context ref,errorCode:"+WesterosErrorCode$Result.kSensorManagerReturnNull.getName());
          return objArray;
       }else {
          Context uContext = obj.get();
          if (uContext == null) {
             Log.e("SensorUtils", "getSensorManager return null,no context,errorCode:"+WesterosErrorCode$Result.kSensorManagerReturnNull.getName());
             return objArray;
          }else {
             SensorManager systemServic = uContext.getSystemService("sensor");
             this.sensorManagerInstance = systemServic;
             this.accelertion_sensor_ = systemServic.getDefaultSensor(1);
             this.gyro_sensor_ = this.sensorManagerInstance.getDefaultSensor(4);
             this.gravity_sensor_ = this.sensorManagerInstance.getDefaultSensor(9);
             this.rotation_sensor_ = this.sensorManagerInstance.getDefaultSensor(15);
             this.magnetic_sensor_ = this.sensorManagerInstance.getDefaultSensor(2);
             if (this.rotation_sensor_ == null) {
                Log.w("SensorUtils", "getSensorManager ,errorCode:"+WesterosErrorCode$Result.kSensorManagerNoRotationSensor.getName());
                this.rotation_sensor_ = this.sensorManagerInstance.getDefaultSensor(11);
             }
             if (this.gravity_sensor_ == null) {
                Log.w("SensorUtils", "getSensorManager ,errorCode:"+WesterosErrorCode$Result.kSensorManagerNoGravitySensor.getName());
                this.gravity_sensor_ = this.sensorManagerInstance.getDefaultSensor(1);
             }
             return this.sensorManagerInstance;
          }
       }
    }
    public native final void nativeSensorUpdateAcceleration(long p0,float p1,float p2,float p3,long p4);
    public native final void nativeSensorUpdateMagnetic(long p0,float p1,float p2,float p3,long p4);
    public native final void nativeSensorUpdateOrientation(long p0,float p1,float p2,float p3,long p4);
    public native final void nativeSensorUpdateQuaternion(long p0,float p1,float p2,float p3,float p4,long p5);
    public native final void nativeSensorUpdateRotationRate(long p0,float p1,float p2,float p3,long p4);
    public void onAccuracyChanged(Sensor p0,int p1){
    }
    public synchronized void onSensorChanged(SensorEvent p0){
       SensorEvent sensor;
       if (PatchProxy.applyVoidOneRefs(p0, this, SensorUtils.class, "6")) {
          return;
       }
       TimeUnit nANOSECONDS = TimeUnit.NANOSECONDS;
       long l = nANOSECONDS.toMillis(System.nanoTime());
       float f = 0.00f;
       int i = 0;
       if (!this.imu_timestamp_shift - i) {
          this.imu_timestamp_shift = System.nanoTime() - SystemClock.elapsedRealtimeNanos();
          if (nANOSECONDS.toMillis((SystemClock.elapsedRealtimeNanos() - p0.timestamp)) - f < 0) {
             this.use_event_time_flag = true;
             Log.i("sensor", "event timestamp for sensor is used.");
          }
       }
       if (this.use_event_time_flag != null) {
          l = nANOSECONDS.toMillis((p0.timestamp + this.imu_timestamp_shift));
       }
       long l1 = l;
       if (this.disposed != null) {
          return;
       }else {
          sensor = p0.sensor;
          if (sensor == null) {
             long l2 = System.currentTimeMillis();
             SensorUtils tevent_no_se = this.event_no_sensor_timestamp;
             if (!tevent_no_se - i && (l2 - tevent_no_se) - f > 0) {
                Log.e("SensorUtils", "no event sensor");
                this.event_no_sensor_timestamp = l2;
             }
             return;
          }else {
             float f1 = 0x411cf5c3;
             int i1 = 2;
             int i2 = 0;
             if (sensor.getType() == 9) {
                p0 = p0.values;
                this.nativeSensorUpdateOrientation(this.native_sensor_manager, ((- p0[i2]) / f1), ((- p0[1]) / f1), ((- p0[i1]) / f1), l1);
             }else {
                SensorUtils sensorUtils = 4;
                if (p0.sensor.getType() == sensorUtils) {
                   p0 = p0.values;
                   this.nativeSensorUpdateRotationRate(this.native_sensor_manager, p0[i2], p0[1], p0[i1], l1);
                }else if(p0.sensor.getType() == 1){
                   p0 = p0.values;
                   this.nativeSensorUpdateAcceleration(this.native_sensor_manager, p0[i2], p0[1], p0[i1], l1);
                }else if(p0.sensor.getType() == 1){
                   p0 = p0.values;
                   this.nativeSensorUpdateOrientation(this.native_sensor_manager, ((- p0[i2]) / f1), ((- p0[1]) / f1), ((- p0[i1]) / f1), l1);
                }else if(p0.sensor.getType() == 11 || p0.sensor.getType() == 15){
                   float[] uofloatArray = new float[sensorUtils];
                   p0 = p0.values;
                   if (p0.length > sensorUtils) {
                      int i3 = 16;
                      float[] uofloatArray1 = new float[i3];
                      if (p0.length <= i3) {
                         System.arraycopy(p0, i2, uofloatArray1, i2, p0.length);
                      }else {
                         System.arraycopy(p0, i2, uofloatArray1, i2, i3);
                      }
                      SensorManager.getQuaternionFromVector(uofloatArray, uofloatArray1);
                   }else {
                      SensorManager.getQuaternionFromVector(uofloatArray, p0);
                   }
                   this.nativeSensorUpdateQuaternion(this.native_sensor_manager, uofloatArray[1], uofloatArray[i1], uofloatArray[3], uofloatArray[i2], l1);
                }else if(p0.sensor.getType() == i1){
                   p0 = p0.values;
                   this.nativeSensorUpdateMagnetic(this.native_sensor_manager, p0[i2], p0[1], p0[i1], l1);
                }
             }
             return;
          }
       }
    }
    public synchronized void release(){
       if (PatchProxy.applyVoid(null, this, SensorUtils.class, "2")) {
          return;
       }
       if (this.disposed != null) {
          return;
       }
       this.disposed = true;
       this.native_sensor_manager = 0;
       this.handler.post(new SensorUtils$1(this));
       return;
    }
    public void stopListenDevice(){
       if (PatchProxy.applyVoid(null, this, SensorUtils.class, "3")) {
          return;
       }
       this.handler.post(new SensorUtils$2(this));
       return;
    }
    public void unregisterListener(){
       if (PatchProxy.applyVoid(null, this, SensorUtils.class, "4")) {
          return;
       }
       try{
          SensorUtils tsensorManag = this.sensorManagerInstance;
          if (tsensorManag != null) {
             tsensorManag.unregisterListener(this, this.gyro_sensor_);
             this.sensorManagerInstance.unregisterListener(this, this.accelertion_sensor_);
             this.sensorManagerInstance.unregisterListener(this, this.rotation_sensor_);
             this.sensorManagerInstance.unregisterListener(this, this.gravity_sensor_);
             this.sensorManagerInstance.unregisterListener(this, this.magnetic_sensor_);
          }
       }catch(java.lang.Exception e0){
          Log.e("WSensorUtils", "unregisterListener : "+e0.toString());
       }
       return;
    }
    public void updateInterval(float p0){
       if (PatchProxy.isSupport(SensorUtils.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SensorUtils.class, "5")) {
          return;
       }
       this.handler.post(new SensorUtils$3(this, p0));
       return;
    }
}
