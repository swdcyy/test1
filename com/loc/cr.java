package com.loc.cr;
import java.lang.Object;
import com.loc.cr$a;
import java.util.ArrayList;
import com.loc.dx;
import java.lang.String;
import java.util.List;
import com.loc.dr;
import com.loc.dn;
import java.util.Iterator;
import android.os.SystemClock;
import java.util.Collection;
import java.lang.Math;
import com.loc.dw;

public final class cr	// class@0013c8
{
    public dr a;
    public dr b;
    public dx c;
    public cr$a d;
    public final List e;

    public void cr(){
       super();
       this.d = new cr$a();
       this.e = new ArrayList(3);
    }
    public final cr$a a(dx p0,boolean p1,byte p2,String p3,List p4){
       if (p1) {
          this.d.a();
          return null;
       }else {
          this.d.a(p2, p3, p4);
          if (this.d.c == null) {
             return null;
          }
          cr uocr = (this.c != null && (!this.a(p0) && (!cr$a.a(this.d.d, this.a) || !cr$a.a(this.d.e, this.b))))? 1: null;
          if (uocr) {
             uocr = this.d;
             this.a = uocr.d;
             this.b = uocr.e;
             this.c = p0;
             dn.a(uocr.f);
             this.a(this.d);
             return this.d;
          }else {
             return null;
          }
       }
    }
    public final void a(cr$a p0){
       cr te = this.e;
       _monitor_enter(te);
       Iterator iterator = p0.f.iterator();
       while (iterator.hasNext()) {
          dr uodr = iterator.next();
          if (uodr != null && uodr.h != null) {
             uodr = uodr.a();
             uodr.e = SystemClock.elapsedRealtime();
             this.a(uodr);
          }
       }
       this.d.g.clear();
       this.d.g.addAll(this.e);
       _monitor_exit(te);
       return;
    }
    public final void a(dr p0){
       if (p0 == null) {
          return;
       }
       int i = this.e.size();
       if (i) {
          long l = Long.MAX_VALUE;
          int i1 = 0;
          int i2 = -1;
          dr uodr = -1;
          while (true) {
             if (i1 < i) {
                dr uodr1 = this.e.get(i1);
                if (p0.equals(uodr1)) {
                   dr c = p0.c;
                   if (c != uodr1.c) {
                      uodr1.e = (long)c;
                      uodr1.c = c;
                   label_0046 :
                      if (i2 >= null) {
                         if (i >= 3) {
                            if (p0.e - l > 0 && i2 < i) {
                               this.e.remove(i2);
                               this.e.add(p0);
                            }
                         }
                      }
                      return;
                   }else {
                      goto label_0046 ;
                   }
                }else {
                   l = Math.min(l, uodr1.e);
                   if (!l - uodr1.e) {
                      uodr = i1;
                   }
                   i1 = i1 + 1;
                }
             }else {
                i2 = uodr;
                goto label_0046 ;
             }
          }
       }
       this.e.add(p0);
       return;
    }
    public final boolean a(dx p0){
       float f;
       dw g = p0.g;
       if (g - 0x41200000 > 0) {
          f = 0x44fa0000;
       }else if(g - 0x40000000 > 0){
          f = 0x43fa0000;
       }else {
          f = 100.00f;
       }
       if (p0.a(this.c) - (double)f > 0) {
          return true;
       }else {
          return false;
       }
    }
}
