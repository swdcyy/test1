package com.xiaomi.push.service.s;
import com.xiaomi.push.service.XMPushService;
import java.lang.Object;
import java.lang.Math;
import java.lang.System;
import com.xiaomi.push.service.XMPushService$e;
import java.util.Objects;
import com.xiaomi.push.service.XMPushService$j;
import java.lang.StringBuilder;
import java.lang.String;
import rs8.c;
import com.xiaomi.push.b;
import ys8.g;

public class s	// class@001192
{
    public XMPushService a;
    public int b;
    public long c;
    public int d;
    public int e;
    public static int f = 300000;

    public void s(XMPushService p0){
       super();
       this.d = 0;
       this.e = 0;
       this.a = p0;
       this.b = 500;
       this.c = 0;
    }
    public final int a(){
       if (this.d > 8) {
          return 0x493e0;
       }
       double d = (Math.random() * 2.00f) + 0x3ff0000000000000;
       s td = this.d;
       double d1 = -0.00f;
       if (td > d1) {
          return (int)(d * 60000.00f);
       }
       if (td > 1) {
          return (int)(d * 10000.00f);
       }
       int i = 0;
       if (!this.c - null) {
          return i;
       }
       if ((System.currentTimeMillis() - this.c) - 0x4baf0 < 0) {
          td = this.b;
          int f = s.f;
          if (td >= f) {
             return td;
          }
          int i1 = this.e + 1;
          this.e = i1;
          if (i1 >= d1) {
             i = f;
          }else {
             this.b = (int)((double)td * 0x3ff8000000000000);
          }
          return i;
       }else {
          this.b = 1000;
          this.e = i;
          return i;
       }
    }
    public void b(){
       this.c = System.currentTimeMillis();
       this.a.a(1);
       this.d = 0;
    }
    public void c(boolean p0){
       if (this.a.a()) {
          int i = 1;
          if (p0) {
             if (!this.a.a(i)) {
                this.d = this.d + i;
             }
             this.a.a(i);
             s ta = this.a;
             Objects.requireNonNull(ta);
             ta.a(new XMPushService$e(ta));
          }else if(this.a.a(i)){
             return;
          }else {
             int i1 = this.a();
             this.d = this.d + i;
             c.l("schedule reconnect in "+i1+"ms");
             s ta1 = this.a;
             Objects.requireNonNull(ta1);
             ta1.a(new XMPushService$e(ta1), (long)i1);
             if (this.d == 2 && b.e().k()) {
                g.e();
             }
             if (this.d == 3) {
                g.b();
             }
          }
       }else {
          c.t("should not reconnect as no client or network.");
       }
       return;
    }
}
