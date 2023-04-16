package c.t.m.g.cq;
import java.lang.Object;
import c.t.m.g.ed;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Math;

public class cq	// class@000c1c
{
    public float a;
    public float b;
    public long c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public double j;

    public void cq(){
       super();
       this.d = 0xbff0000000000000;
       this.e = 0xbff0000000000000;
       this.f = 0xbff0000000000000;
       this.a = 0xbf800000;
       this.c = -1;
       this.h = 0;
       this.i = 0;
    }
    public void a(){
       this.f = 0xbff0000000000000;
       this.a = 0xbf800000;
       this.c = -1;
       this.h = 0;
       this.i = 0;
    }
    public void a(double p0,double p1,double p2,long p3){
       double d4;
       double d9;
       cq d10;
       cq uocq = this;
       double d = p0;
       double d1 = p1;
       long l = p3;
       int i = 0x3ff0000000000000;
       double d2 = (p2 - i < 0)? i: p2;
       if (ed.a) {
          ed.b("a", "lat_me:"+d+",lng_me:"+d1+",accuracy:"+d2+",time:"+l+",lat:"+uocq.d+",lng:"+uocq.e);
       }
       if ((l - uocq.c) - 0x4e20 >= 0) {
          if (ed.a) {
             ed.b("a", "Time:"+l+",last_time:"+uocq.c);
          }
          this.a();
       }
       double d3 = 1000000.00f;
       uocq.a = (float)(Math.abs((d - uocq.d)) * d3);
       uocq.b = (float)(Math.abs((d1 - uocq.e)) * d3);
       if (ed.a) {
          ed.b("a", "Q:"+uocq.a+",QLng:"+uocq.b);
       }
       cq f = uocq.f;
       if (f - null < 0) {
          uocq.c = l;
          uocq.d = d;
          uocq.e = d1;
          uocq.f = d2 * d2;
       }else {
          long l1 = l - uocq.c;
          long l2 = 1000;
          if (l1 - l2 < 0) {
             l1 = l2;
          }
          if (l1 > 0) {
             d4 = (double)l1;
             uocq.f = f + d4;
             uocq.g = uocq.g + d4;
          }
          cq f1 = uocq.f;
          double d5 = d2 * d2;
          double d6 = d2;
          d4 = f1 / ((f1 + d5) + (double)(uocq.a * 5.00f));
          cq g = uocq.g;
          double d7 = g + d5;
          double d8 = d5;
          d2 = g / (d7 + (double)(uocq.b * 5.00f));
          if (ed.a) {
             ed.b("a", "K:"+d4+",KLng:"+d2);
          }
          f = 0x3fd999999999999a;
          if (d4 - f >= 0 && d2 - f >= 0) {
             f = uocq.d;
             d7 = d2;
             g = uocq.h;
             d9 = 0;
             if (g - d9 <= 0 || ((d - f) - d9 > 0 || (g - d9 < 0 && (d - f) - d9 < 0))) {
                uocq.d = (g * (double)(l1 / l2)) + f;
             }
             d10 = uocq.d;
             uocq.d = d10 + ((d - d10) * d4);
             String str = ",timeInc:";
             String str1 = ",tmp:";
             if (ed.a) {
                ed.b("a", "lat:"+uocq.d+str1+f+str+l1);
             }
             d5 = (double)(l1 / l2);
             uocq.h = (uocq.d - f) / d5;
             cq e = uocq.e;
             cq i1 = uocq.i;
             double d11 = 0;
             d9 = d4;
             d4 = p1;
             if (i1 - d11 <= 0 || ((d4 - e) - d11 > 0 || (i1 - d11 < 0 && (d4 - e) - d11 < 0))) {
                uocq.e = (i1 * d5) + e;
             }
             i1 = uocq.e;
             uocq.e = i1 + ((d4 - i1) * d7);
             if (ed.a) {
                ed.b("a", "lng:"+uocq.e+str1+e+str+l1);
             }
             uocq.i = (uocq.e - e) / d5;
             uocq.f = (0x3ff0000000000000 - d9) * uocq.f;
             uocq.g = (0x3ff0000000000000 - d7) * uocq.g;
             uocq.c = p3;
             if (ed.a) {
                ed.b("a", "last_metres_per_second:"+uocq.h+",last_metres_per_second_lng:"+uocq.i);
             }
             d = p0;
          }else {
             d9 = d4;
             d7 = d2;
             d4 = d1;
             d10 = uocq.h;
             g = null;
             if (d10 - g > 0) {
                d = p0;
                if ((d - uocq.d) - g > 0) {
                label_0266 :
                   uocq.d = uocq.d + (d10 * (double)(l1 / l2));
                label_0270 :
                   d10 = uocq.i;
                   g = null;
                   if (d10 - g <= 0 || ((d4 - uocq.e) - g > 0 || (d10 - g < 0 && (d4 - uocq.e) - g < 0))) {
                      uocq.e = uocq.e + (d10 * (double)(l1 / l2));
                   }
                   double d12 = (double)l1;
                   uocq.f = uocq.f - d12;
                   uocq.g = uocq.g - d12;
                }
             }else {
                d = p0;
             }
             if (d10 - g < 0 && (d - uocq.d) - g < 0) {
                goto label_0266 ;
             }else {
                goto label_0270 ;
             }
          }
          if (ed.a) {
             ed.b("a", "variance:"+uocq.f+",vaLng:"+uocq.g);
          }
          if (!d6 - 0x403e000000000000) {
             l1 = 0x3fe0000000000000;
             if (d9 - l1 >= 0 && d7 - l1 >= 0) {
                uocq.d = d;
                uocq.e = d4;
                uocq.h = 0;
                uocq.i = 0;
                l1 = p3;
                uocq.c = l1;
                d2 = d8;
                uocq.f = d2;
             label_02ec :
                if (uocq.j - 0x4059000000000000 > 0 && d6 - 0x403e000000000000 <= 0) {
                   uocq.d = d;
                   uocq.e = d4;
                   uocq.h = 0;
                   uocq.i = 0;
                   uocq.c = l1;
                   uocq.f = d2;
                }
                uocq.j = d6;
             }
          }
          l1 = p3;
          d2 = d8;
          goto label_02ec ;
       }
       return;
    }
    public double b(){
       return this.d;
    }
    public double c(){
       return this.e;
    }
}
