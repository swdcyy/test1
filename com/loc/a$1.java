package com.loc.a$1;
import com.amap.api.location.AMapLocationListener;
import com.loc.a;
import java.lang.Object;
import com.amap.api.location.AMapLocation;
import com.loc.fq;
import android.os.Bundle;
import java.lang.String;
import java.lang.StringBuilder;

public final class a$1 implements AMapLocationListener	// class@00135a
{
    public final a a;

    public void a$1(a p0){
       this.a = p0;
       super();
    }
    public final void onLocationChanged(AMapLocation p0){
       int errorCode;
       a$1 u1;
       if (this.a.y != null) {
          return;
       }
       if (this.a.o == null) {
          return;
       }
       this.a.s = p0;
       long l = 0;
       int i = 8;
       if (p0 != null) {
          errorCode = p0.getErrorCode();
          if (!p0.getErrorCode()) {
             p0.t = fq.b();
             this.a.a(5, null, l);
             u1 = 1;
          }else {
             String[] stringArray = new String[]{"locationDetail:"+p0.getLocationDetail()};
             a.a("¶¨Î»Ê§°Ü", p0.getErrorCode(), p0.getErrorInfo(), stringArray);
             u1 = null;
          }
       }else {
          u1 = null;
          errorCode = 8;
       }
       if (u1) {
          u1 = this.a;
          u1.v = 0;
          u1.a(6, null, l);
          return;
       }else {
          Bundle uBundle = new Bundle();
          if (this.a.m == null) {
             this.a.b(7);
             long l1 = 2000;
             uBundle.putLong("interval", l1);
             this.a.a(i, uBundle, l1);
          }
          a$1 ta = this.a;
          int i1 = ta.v + 1;
          ta.v = i1;
          if (i1 >= 3) {
             uBundle.putInt("location_errorcode", errorCode);
             this.a.a(1002, uBundle);
          }
          return;
       }
    }
}
