package com.loc.eq;
import android.hardware.SensorEventListener;
import android.content.Context;
import java.lang.Object;
import android.os.Handler;
import java.lang.String;
import android.hardware.SensorManager;
import android.hardware.Sensor;
import java.lang.Throwable;
import com.loc.fj;
import java.lang.System;
import java.lang.Math;
import com.loc.fq;
import android.hardware.SensorEvent;

public final class eq implements SensorEventListener	// class@001415
{
    public SensorManager a;
    public Sensor b;
    public Sensor c;
    public Sensor d;
    public boolean e;
    public double f;
    public float g;
    public Handler h;
    public double i;
    public double j;
    public double k;
    public double l;
    public double[] m;
    public double n;
    public long o;
    public long p;
    public final int q;
    public final int r;
    public Context s;
    public float t;
    public float u;

    public void eq(Context p0){
       super();
       this.s = null;
       this.a = null;
       this.b = null;
       this.c = null;
       this.d = null;
       this.e = false;
       this.f = 0;
       this.g = 0;
       this.t = 1013.25f;
       this.u = 0;
       this.h = new Handler();
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.l = 0;
       double[] uodoubleArra = new double[3];
       this.m = uodoubleArra;
       this.n = 0;
       this.o = 0;
       this.p = 0;
       this.q = 100;
       this.r = 30;
       this.s = p0;
       if (this.a == null) {
          this.a = p0.getSystemService("sensor");
       }
       this.b = this.a.getDefaultSensor(6);
       this.c = this.a.getDefaultSensor(11);
       this.d = this.a.getDefaultSensor(1);
       return;
    }
    public final void a(){
       eq ta = this.a;
       if (ta == null || this.e != null) {
          return;
       }
       this.e = true;
       eq tb = this.b;
       if (tb != null) {
          ta.registerListener(this, tb, 3, this.h);
       }
       ta = this.c;
       if (ta != null) {
          this.a.registerListener(this, ta, 3, this.h);
       }
       ta = this.d;
       if (ta != null) {
          this.a.registerListener(this, ta, 3, this.h);
       }
       return;
    }
    public final void a(float[] p0){
       eq tm = this.m;
       tm[0] = (tm[0] * 0x3fe99999a0000000) + (double)(p0[0] * 0.20f);
       tm[1] = (tm[1] * 0x3fe99999a0000000) + (double)(p0[1] * 0.20f);
       tm[2] = (tm[2] * 0x3fe99999a0000000) + (double)(p0[2] * 0.20f);
       this.i = (double)p0[0] - tm[0];
       this.j = (double)p0[1] - tm[1];
       this.k = (double)p0[2] - tm[2];
       long l = System.currentTimeMillis();
       if ((l - this.o) - 100 < 0) {
          return;
       }
       this.p = this.p + 1;
       this.o = l;
       this.n = this.n + Math.sqrt((((this.i * this.i) + (this.j * this.j)) + (this.k * this.k)));
       if (this.p - 30 >= 0) {
          this.l = this.n / (double)this.p;
          this.n = 0;
          this.p = 0;
       }
       return;
    }
    public final void b(){
       eq ta = this.a;
       if (ta != null && this.e != null) {
          this.e = false;
          eq tb = this.b;
          if (tb != null) {
             ta.unregisterListener(this, tb);
          }
          ta = this.c;
          if (ta != null) {
             this.a.unregisterListener(this, ta);
          }
          ta = this.d;
          if (ta != null) {
             this.a.unregisterListener(this, ta);
          }
       }
    label_0024 :
       return;
    }
    public final void b(float[] p0){
       if (p0 != null) {
          this.f = (double)fq.a(SensorManager.getAltitude(this.t, p0[0]));
       }
       return;
    }
    public final double c(){
       return this.f;
    }
    public final void c(float[] p0){
       if (p0 != null) {
          float[] uofloatArray = new float[9];
          SensorManager.getRotationMatrixFromVector(uofloatArray, p0);
          p0 = new float[3];
          SensorManager.getOrientation(uofloatArray, p0);
          float f = (float)Math.toDegrees((double)p0[0]);
          this.u = f;
          if (f <= 0) {
             f = f + 360.00f;
          }
          this.u = (float)Math.floor((double)f);
       }
       return;
    }
    public final float d(){
       return this.u;
    }
    public final double e(){
       return this.l;
    }
    public final void f(){
       this.b();
       this.b = null;
       this.c = null;
       this.a = null;
       this.d = null;
       this.e = false;
    }
    public final void onAccuracyChanged(Sensor p0,int p1){
    }
    public final void onSensorChanged(SensorEvent p0){
       if (p0 == null) {
          return;
       }
       int type = p0.sensor.getType();
       if (type != 1) {
          if (type != 6) {
             if (type == 11) {
                if (this.c != null) {
                   this.c(p0.values.clone());
                }
                return;
             }
          }else if(this.b != null){
             float[] uofloatArray = p0.values.clone();
             this.g = uofloatArray[0];
             this.b(uofloatArray);
          }
          return;
       }else if(this.d != null){
          this.a(p0.values.clone());
       }
       return;
    }
}
