package com.loc.en;
import java.lang.Object;
import com.amap.api.location.AMapLocation;
import com.loc.fq;
import java.lang.String;
import android.location.Location;
import java.lang.Math;
import com.loc.eo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.fi;

public final class en	// class@00140f
{
    public eo a;
    public long b;
    public long c;
    public int d;
    public long e;
    public AMapLocation f;
    public long g;
    public boolean h;

    public void en(){
       super();
       this.a = null;
       this.b = 0;
       this.c = 0;
       this.h = true;
       this.d = 0;
       this.e = 0;
       this.f = null;
       this.g = 0;
    }
    public final AMapLocation a(AMapLocation p0){
       if (!fq.a(p0)) {
          return p0;
       }
       this.g = fq.b();
       if ((fq.b() - this.g) - -9319058778853432500000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f > 0) {
          return p0;
       }
       en tf = this.f;
       if (tf == null) {
          this.f = p0;
          return p0;
       }else if(1 != tf.getLocationType() && !("gps").equalsIgnoreCase(this.f.getProvider())){
          this.f = p0;
          return p0;
       }else if(!this.f.getAltitude() - p0.getAltitude() && !this.f.getLongitude() - p0.getLongitude()){
          this.f = p0;
          return p0;
       }else {
          long l = Math.abs((p0.getTime() - this.f.getTime()));
          if (0x7530 - l < 0) {
             this.f = p0;
             return p0;
          }else if(fq.a(p0, this.f) - (((((this.f.getSpeed() + p0.getSpeed()) * (float)l) / 0x44fa0000) + ((this.f.getAccuracy() + p0.getAccuracy()) * 2.00f)) + 3000.00f) > 0){
             return this.f;
          }else {
             this.f = p0;
             return p0;
          }
       }
    }
    public final eo a(eo p0){
       en uoen = this;
       eo uoeo = p0;
       if ((fq.b() - uoen.e) - 0x7530 > 0) {
          uoen.a = uoeo;
          uoen.e = fq.b();
          return uoen.a;
       }else {
          uoen.e = fq.b();
          if (!fq.a(uoen.a) || !fq.a(p0)) {
             uoen.b = fq.b();
             uoen.a = uoeo;
             return uoeo;
          }else {
             int i = 0x43960000;
             if (!p0.getTime() - uoen.a.getTime() && p0.getAccuracy() - i < 0) {
                return uoeo;
             }
             if (("gps").equals(p0.getProvider())) {
                uoen.b = fq.b();
                uoen.a = uoeo;
                return uoeo;
             }else if(p0.c() != uoen.a.c()){
                uoen.b = fq.b();
                uoen.a = uoeo;
                return uoeo;
             }else if(p0.getBuildingId() != null && (!(p0.getBuildingId()).equals(uoen.a.getBuildingId()) && !TextUtils.isEmpty(p0.getBuildingId()))){
                uoen.b = fq.b();
                uoen.a = uoeo;
                return uoeo;
             }else {
                uoen.d = p0.getLocationType();
                float f = fq.a(uoeo, uoen.a);
                float accuracy = uoen.a.getAccuracy();
                float accuracy1 = p0.getAccuracy();
                float f1 = accuracy1 - accuracy;
                long l = fq.b();
                long l1 = l - uoen.b;
                int i1 = 1;
                int i2 = (accuracy - 0x42c80000 <= 0 && accuracy1 - 0x43958000 > 0)? 1: 0;
                if ((v18 = accuracy - 0x43958000) <= 0 || accuracy1 - 0x43958000 <= 0) {
                   i1 = 0;
                }
                long l2 = 0;
                if (i2 || i1) {
                   en c = uoen.c;
                   if (!c - l2) {
                      uoen.c = l;
                   }else if((l - c) - 0x7530 > 0){
                      uoen.b = l;
                      uoen.a = uoeo;
                      uoen.c = l2;
                      return uoeo;
                   }
                   uoeo = uoen.b(uoen.a);
                   uoen.a = uoeo;
                   return uoeo;
                }else if(accuracy1 - 0x42c80000 < 0 && v18 > 0){
                   uoen.b = l;
                   uoen.a = uoeo;
                   uoen.c = l2;
                   return uoeo;
                }else if(accuracy1 - 0x43958000 <= 0){
                   uoen.c = l2;
                }
                if (f - 0x41200000 < 0 && ((double)f - 0x3fb999999999999a > 0 && accuracy1 - 0x40a00000 > 0)) {
                   if (f1 - 0xc3960000 >= 0) {
                      uoeo = uoen.b(uoen.a);
                      uoen.a = uoeo;
                      return uoeo;
                   }else if((accuracy / accuracy1) - 0x40000000 >= 0){
                      uoen.b = l;
                      uoen.a = uoeo;
                      return uoeo;
                   }else {
                      uoeo = uoen.b(uoen.a);
                      uoen.a = uoeo;
                      return uoeo;
                   }
                }else if(f1 - i >= 0){
                   if (l1 - 0x7530 >= 0) {
                      uoen.b = fq.b();
                      uoen.a = uoeo;
                      return uoeo;
                   }else {
                      uoeo = uoen.b(uoen.a);
                      uoen.a = uoeo;
                      return uoeo;
                   }
                }else {
                   uoen.b = fq.b();
                   uoen.a = uoeo;
                   return uoeo;
                }
             }
          }
       }
    }
    public final void a(){
       this.a = null;
       this.b = 0;
       this.c = 0;
       this.f = null;
       this.g = 0;
    }
    public final void a(boolean p0){
       this.h = p0;
    }
    public final eo b(eo p0){
       int i;
       if (fq.a(p0)) {
          if (this.h != null && fi.a(p0.getTime())) {
             if (p0.getLocationType() == 5 || p0.getLocationType() == 6) {
                i = 4;
             }
          }else {
             i = this.d;
          }
          p0.setLocationType(i);
       }
       return p0;
    }
}
