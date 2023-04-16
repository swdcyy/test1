package com.xiaomi.push.service.i0$c$a;
import java.lang.Object;
import com.xiaomi.push.service.i0$d;
import ys8.c1;
import com.xiaomi.push.service.i0$b;
import java.lang.System;
import com.xiaomi.push.service.XMPushService$d;
import ws8.p4;
import ys8.e;
import com.xiaomi.push.service.XMPushService$i;
import android.content.Intent;
import java.lang.String;

public final class i0$c$a	// class@001173
{
    public int a;
    public i0$d[] b;
    public int c;
    public int d;

    public void i0$c$a(){
       super();
       this.a = 256;
       i0$d[] uodArray = new i0$d[256];
       this.b = uodArray;
       this.c = 0;
       this.d = 0;
    }
    public void i0$c$a(c1 p0){
       super();
    }
    public static int a(i0$c$a p0,i0$d p1){
       return p0.b(p1);
    }
    public final int b(i0$d p0){
       int i = 0;
       while (true) {
          i0$c$a tb = this.b;
          if (i >= tb.length) {
             return -1;
          }
          if (tb[i] == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public i0$d c(){
       return this.b[0];
    }
    public void d(){
       i0$d[] uodArray = new i0$d[this.a];
       this.b = uodArray;
       this.c = 0;
    }
    public void e(int p0){
       int i = 0;
       while (i < this.c) {
          i0$c$a tb = this.b;
          if (tb[i].e == p0) {
             tb[i].b();
          }
          i = i + 1;
       }
       this.j();
       return;
    }
    public void f(int p0,i0$b p1){
       p0 = 0;
       while (p0 < this.c) {
          i0$c$a tb = this.b;
          if (tb[p0].d == p1) {
             tb[p0].b();
          }
          p0++;
       }
       this.j();
       return;
    }
    public void g(i0$d p0){
       i0$c$a tb = this.b;
       i0$c$a tc = this.c;
       if (tb.length == tc) {
          i0$d[] uodArray = new i0$d[(tc * 2)];
          System.arraycopy(tb, 0, uodArray, 0, tc);
          this.b = uodArray;
       }
       i0$c$a tc1 = this.c;
       this.c = tc1 + 1;
       this.b[tc1] = p0;
       this.m();
       this.l(p0);
       return;
    }
    public boolean h(){
       boolean b = (this.c == null)? true: false;
       return b;
    }
    public boolean i(int p0){
       int i = 0;
       while (true) {
          if (i >= this.c) {
             return false;
          }
          if (this.b[i].e == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public void j(){
       int i = 0;
       while (i < this.c) {
          if (this.b[i].b != null) {
             int i1 = this.d + 1;
             this.d = i1;
             this.k(i);
             i = i - 1;
          }
          i = i + 1;
       }
       return;
    }
    public void k(int p0){
       if (p0 >= 0) {
          i0$c$a tc = this.c;
          if (p0 < tc) {
             i0$c$a tb = this.b;
             int i = tc - 1;
             this.c = i;
             tb[p0] = tb[i];
             tb[i] = null;
             this.n(p0);
          }
       }
       return;
    }
    public final void l(i0$d p0){
       i0$d d = p0.d;
       i0$b b = d.b;
       if (b == 8) {
          if (d.c().f != null) {
             d.c().f.f = System.currentTimeMillis();
             d.c().f.b = this.b(p0);
          }
       }else if(b == 15){
          Intent intent = d.c();
          if (intent != null && ("10").equals(intent.getStringExtra("ext_chid"))) {
             intent.putExtra("enqueue", System.currentTimeMillis());
             intent.putExtra("num", this.b(p0));
          }
       }
       return;
    }
    public final void m(){
       int i = this.c - 1;
       int i1 = (i - 1) / 2;
       i0$c$a tb = this.b;
       while (tb[i].c - tb[i1].c < 0) {
          object oobject = tb[i];
          tb[i] = tb[i1];
          tb[i1] = oobject;
          i = i1 - 1;
          i = i / 2;
          i1 = i;
          i = i1;
       }
       return;
    }
    public final void n(int p0){
       int i = (p0 * 2) + 1;
       i0$c$a tc = this.c;
       while (i < tc && tc > null) {
          int i1 = i + 1;
          if (i1 < tc) {
             tc = this.b;
             if (tc[i1].c - tc[i].c < 0) {
                i = i1;
             }
          }
          tc = this.b;
          if (tc[p0].c - tc[i].c < 0) {
             break ;
          }
          object oobject = tc[p0];
          tc[p0] = tc[i];
          tc[i] = oobject;
          p0 = i * 2;
          p0++;
          i = p0;
          p0 = i;
       }
       return;
    }
}
