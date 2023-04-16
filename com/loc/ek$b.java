package com.loc.ek$b;
import com.loc.ck;
import com.loc.ek;
import android.location.Location;
import android.content.Context;
import com.loc.fq;
import android.os.Bundle;
import java.lang.String;
import com.loc.ex;
import java.util.ArrayList;
import java.util.List;
import com.loc.et;
import com.loc.cs$a;
import com.loc.dx;
import com.loc.dw;
import java.lang.System;
import android.net.wifi.WifiInfo;
import com.kwai.framework.deviceid.a;
import com.loc.dy;
import com.loc.o;
import com.loc.cu;
import com.loc.do;
import java.lang.Object;
import java.lang.Throwable;
import com.loc.fj;
import com.loc.bn;
import com.loc.cg;
import java.io.File;
import com.loc.bd;
import com.loc.x;
import com.loc.p;
import com.loc.ey;
import com.loc.an;

public final class ek$b extends ck	// class@00140b
{
    public final ek a;
    public int b;
    public Location c;

    public void ek$b(ek p0,int p1){
       this.a = p0;
       super();
       this.b = 0;
       this.b = p1;
    }
    public void ek$b(ek p0,Location p1){
       this.c = p1;
    }
    public final void a(){
       ek$b tb = this.b;
       if (tb == 1) {
          this.b();
          return;
       }else if(tb == 2){
          this.c();
          return;
       }else if(tb == 3){
          ek.c(this.a);
       }
       return;
    }
    public final void b(){
       if (this.c == null) {
          return;
       }
       if (!ek.a(this.a)) {
          return;
       }
       if (fq.m(this.a.a)) {
          return;
       }
       Bundle extras = this.c.getExtras();
       String str = null;
       if (extras != null) {
          str = extras.getInt("satellites");
       }
       if (fq.a(this.c, str)) {
          return;
       }else {
          ek b = this.a.b;
          if (b != null && b.s == null) {
             b.f();
          }
          List list = this.a.c.a();
          cs$a uoa = new cs$a();
          dx uodx = new dx();
          uodx.i = this.c.getAccuracy();
          uodx.f = this.c.getAltitude();
          uodx.d = this.c.getLatitude();
          uodx.h = this.c.getBearing();
          uodx.e = this.c.getLongitude();
          uodx.j = this.c.isFromMockProvider();
          uodx.a = this.c.getProvider();
          uodx.g = this.c.getSpeed();
          uodx.l = (byte)str;
          uodx.b = System.currentTimeMillis();
          uodx.c = this.c.getTime();
          uodx.k = this.c.getTime();
          uoa.a = uodx;
          uoa.b = this.a.b.a();
          WifiInfo wifiInfo = this.a.b.c();
          if (wifiInfo != null) {
             uoa.c = dy.a(a.a(wifiInfo));
          }
          uoa.d = ex.A;
          uoa.f = this.c.getTime();
          uoa.g = (byte)o.n(this.a.a);
          uoa.h = o.s(this.a.a);
          uoa.e = this.a.b.k();
          uoa.j = fq.a(this.a.a);
          uoa.i = list;
          cu uocu = do.a(uoa);
          if (uocu == null) {
             return;
          }else {
             ArrayList uArrayList = ek.b(this.a);
             _monitor_enter(uArrayList);
             ek.b(this.a).add(uocu);
             if (ek.b(this.a).size() >= 5) {
                this.a.e();
             }
             _monitor_exit(uArrayList);
             this.a.d();
             return;
          }
       }
    }
    public final void c(){
       if (fq.m(this.a.a)) {
          return;
       }
       bd uobd = null;
       ek.a(System.currentTimeMillis());
       if (this.a.e.f.c()) {
          uobd = bd.a(new File(this.a.e.a), this.a.e.b);
          ArrayList uArrayList = new ArrayList();
          byte[] uobyteArray = ek.f();
          if (uobyteArray == null) {
             uobd.close();
             return;
          }else {
             List list = ek.a(uobd, this.a.e, uArrayList, uobyteArray);
             if (list == null || !list.size()) {
                uobd.close();
                return;
             }else {
                this.a.e.f.a(true);
                if (do.a(x.b(do.a(ey.a(uobyteArray), p.b(uobyteArray, do.a(), x.c()), list)))) {
                   ek.a(uobd, uArrayList);
                }
             }
          }
       }
       if (uobd != null) {
          uobd.close();
          return;
       }else {
          return;
       }
    }
}
