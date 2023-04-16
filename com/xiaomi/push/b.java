package com.xiaomi.push.b;
import java.lang.Object;
import com.xiaomi.push.a;
import com.xiaomi.push.b$a;
import ws8.l4;
import com.xiaomi.push.ez;
import android.content.Context;
import java.lang.String;
import ws8.k0;
import java.lang.System;
import com.xiaomi.push.a$a;
import com.xiaomi.push.ey;
import com.xiaomi.push.fa;
import java.util.ArrayList;
import java.util.List;
import ws8.i6;
import ws8.v6;
import com.xiaomi.push.jj$a;
import ws8.x6;
import ws8.q6;
import java.util.LinkedList;
import java.lang.StringBuilder;
import rs8.c;
import com.xiaomi.push.service.XMPushService;
import ys8.e0;
import ws8.m4;
import ys8.e0$a;

public class b	// class@0010fb
{
    public String a;
    public boolean b;
    public int c;
    public long d;
    public l4 e;
    public a f;

    public void b(){
       super();
       this.b = false;
       this.f = a.b();
    }
    public static b e(){
       return b$a.a;
    }
    public static l4 f(){
       b a = b$a.a;
       _monitor_enter(a);
       _monitor_exit(a);
       return a.e;
    }
    public synchronized ez a(){
       ez uoez = new ez();
       uoez.a(k0.e(this.e.b));
       uoez.a = 0;
       uoez.b = 1;
       uoez.d((int)(System.currentTimeMillis() / 1000));
       return uoez;
    }
    public final ez b(a$a p0){
       ez uoez;
       if (p0.a == null) {
          p0 = p0.c;
          if (p0 instanceof ez) {
          }else {
             uoez = null;
          }
       }else {
          ez uoez1 = this.a();
          uoez1.a(ey.k.a());
          uoez1.c(p0.a);
          uoez1.c(p0.b);
          uoez = uoez1;
       }
       return p0;
    }
    public synchronized fa c(){
       fa uofa = null;
       if (this.l()) {
          int i = 750;
          if (!k0.s(this.e.b)) {
             i = 375;
          }
          uofa = this.d(i);
       }
       return uofa;
    }
    public final fa d(int p0){
       ArrayList uArrayList = new ArrayList();
       fa uofa = new fa(this.a, uArrayList);
       if (!k0.s(this.e.b)) {
          uofa.a(i6.u(this.e.b));
       }
       v6 ov6 = new v6(p0);
       q6 oq6 = new jj$a().a(ov6);
       try{
          uofa.b(oq6);
          LinkedList linkedList = this.f.c();
          try{
             while (linkedList.size() > 0) {
                ez uoez = this.b(linkedList.getLast());
                if (uoez != null) {
                   uoez.b(oq6);
                }
                if (ov6.h() > p0) {
                   break ;
                }else if(uoez != null){
                   e0.add(uoez);
                }
                linkedList.removeLast();
             }
          label_005d :
             return uofa;
          }catch(java.util.NoSuchElementException e0){
          }catch(com.xiaomi.push.ix e0){
          }
       }catch(com.xiaomi.push.ix e0){
       }
    }
    public final void g(){
       if (this.b != null && (System.currentTimeMillis() - this.d) - (long)this.c > 0) {
          this.b = false;
          this.d = 0;
       }
       return;
    }
    public void h(int p0){
       if (p0 > 0) {
          p0 = p0 * 1000;
          if (p0 > 0x240c8400) {
             p0 = 0x240c8400;
          }
          if (this.c != p0 || this.b == null) {
             this.b = true;
             this.d = System.currentTimeMillis();
             this.c = p0;
             c.t("enable dot duration = "+p0+" start = "+this.d);
          }
       }
       return;
    }
    public synchronized void i(ez p0){
       this.f.e(p0);
    }
    public synchronized void j(XMPushService p0){
       this.e = new l4(p0);
       this.a = "";
       e0.h().k(new m4(this));
    }
    public boolean k(){
       return this.b;
    }
    public boolean l(){
       this.g();
       boolean b = (this.b != null && this.f.a() > 0)? true: false;
       return b;
    }
}
