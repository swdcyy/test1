package com.kwai.framework.location.CurrentLocationCityManager$c;
import sid.s;
import com.kwai.framework.location.CurrentLocationCityManager;
import java.lang.String;
import q96.d;
import sid.j;
import brd.g;
import java.lang.Object;
import java.lang.System;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.framework.location.k;
import com.kwai.framework.location.util.a;
import p96.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Long;
import s96.a;
import o96.s;
import java.lang.Runnable;
import ekd.k1;
import sid.g;
import com.kwai.framework.location.j;
import java.lang.Boolean;

public class CurrentLocationCityManager$c implements s	// class@001628
{
    public long b;
    public final String c;
    public final String d;
    public final String e;
    public final d f;
    public final boolean g;
    public final j h;
    public final g i;
    public final CurrentLocationCityManager j;

    public void CurrentLocationCityManager$c(CurrentLocationCityManager p0,String p1,String p2,String p3,d p4,boolean p5,j p6,g p7){
       this.j = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       super();
       this.b = System.currentTimeMillis();
    }
    public void a(int p0,String p1,String p2){
       int this;
       CurrentLocationCityManager$c uoc = this;
       if (PatchProxy.isSupport(CurrentLocationCityManager$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, CurrentLocationCityManager$c.class, "2")) {
          return;
       }
       uoc.j.mLocationEndTime = System.currentTimeMillis();
       a.d("Tencent", 1002, 0, System.currentTimeMillis(), uoc.c, uoc.d, uoc.e, p0, k.f());
       this = p0;
       String str = p1;
       Object[] objArray = new Object[0];
       a.C().s("ks.location.log:SDK", "[onLocateFailed] : errorCode= "+this+", reason = "+str+" vendor = "+p2, objArray);
       a.f(p0, Long.valueOf(uoc.j.mLocationStartTime), Long.valueOf((uoc.j.mLocationEndTime - uoc.j.mLocationStartTime)), 0, 0, "FALSE", "FALSE", 0xbf800000, uoc.c, uoc.d, uoc.e, p2, "", "", "", "FALSE");
       s os = new s(this, uoc.c, this, str, uoc.f);
       k1.o(v7);
       CurrentLocationCityManager$c h = uoc.h;
       if (h != null) {
          h.e();
       }
       uoc.i.onComplete();
       return;
    }
    public void b(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CurrentLocationCityManager$c.class, "1")) {
          return;
       }
       String str = p0.a();
       int i = 1002;
       CurrentLocationCityManager$c tb = this.b;
       long l = System.currentTimeMillis() - tb;
       CurrentLocationCityManager$c tc = this.c;
       CurrentLocationCityManager$c td = this.d;
       CurrentLocationCityManager$c te = this.e;
       int i1 = 1;
       int i2 = j.e() ^ 0x01;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[9];
          objArray[0] = str;
          objArray[i1] = Integer.valueOf(i);
          objArray[2] = Long.valueOf(l);
          objArray[3] = Long.valueOf(tb);
          objArray[4] = tc;
          objArray[5] = td;
          objArray[6] = te;
          objArray[7] = Integer.valueOf(0);
          objArray[8] = Boolean.valueOf(i2);
          if (PatchProxy.applyVoid(objArray, null, uoa, "3")) {
          label_0073 :
             this.j.mLocationEndTime = System.currentTimeMillis();
             this.j.locationSuccess(this.c, p0, this.d, this.e, this.f, this.g);
             CurrentLocationCityManager$c th = this.h;
             if (th != null && this.g != null) {
                th.e();
             }
             this.i.onComplete();
             return;
          }
       }
       a.c(str, 1002, l, tb, tc, td, te, 0, i2, "LOCATION_UPDATE_EVENT");
       goto label_0073 ;
    }
    public void c(String p0,int p1,String p2){
    }
}
