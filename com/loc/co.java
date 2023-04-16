package com.loc.co;
import com.loc.cn;
import java.util.List;
import java.util.Iterator;
import java.lang.Object;
import com.loc.dr;
import com.loc.dt;
import com.loc.dn;
import com.loc.du;
import com.loc.dv;
import com.loc.ds;
import com.loc.dy;
import java.lang.CharSequence;
import com.loc.cp;
import com.loc.fs;
import com.loc.dk;
import com.loc.dj;
import com.loc.cr$a;
import com.loc.de;
import com.loc.df;
import com.loc.cy;
import com.loc.di;
import com.loc.db;
import com.loc.cz;
import android.os.SystemClock;
import com.loc.dh;
import com.loc.dg;
import com.loc.da;
import com.loc.dx;
import com.loc.dw;
import com.loc.dd;
import com.loc.cw;
import java.lang.Throwable;
import com.loc.eb;

public final class co extends cn	// class@0013c4
{

    public void co(){
       super(2048);
    }
    public static void a(List p0){
       dr uodr1;
       dt j;
       dt k;
       if (p0 != null && p0.size()) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             dr uodr = iterator.next();
             if (uodr instanceof dt) {
                uodr1 = uodr;
                j = uodr1.j;
                k = uodr1.k;
             }else if(uodr instanceof du){
                uodr1 = uodr;
                j = uodr1.j;
                k = uodr1.k;
             }else if(uodr instanceof dv){
                uodr1 = uodr;
                j = uodr1.j;
                k = uodr1.k;
             }else if(uodr instanceof ds){
                uodr1 = uodr;
                j = uodr1.k;
                k = uodr1.l;
             }
             uodr.g = dn.a(dn.a(j, k));
          }
       }
       return;
    }
    public static void b(List p0){
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          dy uody = iterator.next();
          uody.g = dn.b(uody.a);
       }
       return;
    }
    public final int a(long p0,List p1){
       cn uocn = this;
       co.b(p1);
       int i = p1.size();
       if (i > 0) {
          int[] ointArray = new int[i];
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             dy uody = p1.get(i1);
             int i2 = uocn.a.a(uody.b);
             dy a = uody.a;
             boolean b = (!a - p0 && a - -1)? true: false;
             ointArray[i1] = dk.a(uocn.a, b, a, (short)uody.c, i2, uody.g, (short)uody.d);
          }
          i = dj.a(uocn.a, dj.a(uocn.a, ointArray));
       }else {
          i = -1;
       }
       return i;
    }
    public final int a(cr$a p0){
       dr uodr;
       int i3;
       dr uodr2;
       byte b;
       int i4;
       int i5;
       ds k;
       int i6;
       cn a1;
       dt j1;
       dt k1;
       int i9;
       int i10;
       cn uocn = this;
       cr$a uoa = p0;
       co.a(uoa.f);
       int i = uoa.f.size();
       int[] ointArray = new int[i];
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             uodr = uoa.f.get(i1);
             if (uodr instanceof dt) {
                dr uodr1 = uodr;
                int i2 = (uodr1.i == null)? de.a(uocn.a, uodr1.j, uodr1.k, uodr1.c, uodr1.l): de.a(uocn.a, uodr1.b(), uodr1.c(), uodr1.j, uodr1.k, uodr1.c, uodr1.m, uodr1.n, uodr1.d, uodr1.l);
                i3 = i2;
                uodr2 = -1;
                b = 1;
             }else if(uodr instanceof du){
                uodr2 = uodr;
                i4 = uodr2.b();
                i5 = uodr2.c();
                i3 = df.a(uocn.a, i4, i5, uodr2.j, uodr2.k, uodr2.l, uodr2.c, uodr2.m, uodr2.d);
                uodr2 = -1;
                b = 3;
             }else if(uodr instanceof ds){
                uodr2 = uodr;
                cn a = uocn.a;
                ds j = uodr2.j;
                k = uodr2.k;
                ds l = uodr2.l;
                ds m = uodr2.m;
                ds n = uodr2.n;
                dr c = uodr2.c;
                i6 = (uodr2.i == null)? cy.a(a, j, k, l, m, n, c): cy.a(a, j, k, l, m, n, c, uodr2.d);
                i3 = i6;
                uodr2 = -1;
                b = 2;
             }else if(uodr instanceof dv){
                uodr2 = uodr;
                i4 = uodr2.b();
                i5 = uodr2.c();
                i3 = di.a(uocn.a, i4, i5, uodr2.j, uodr2.k, uodr2.l, uodr2.c, uodr2.m, uodr2.d);
                uodr2 = -1;
                b = 4;
             }else {
                uodr2 = -1;
                b = 0;
                i3 = -1;
             }
             if (i3 != uodr2) {
                ointArray[i1] = db.a(uocn.a, (byte)uodr.h, (byte)uodr.i, (short)uodr.g, b, i3);
                i1 = i1 + 1;
             }else {
                break ;
             }
          }else {
             i = uocn.a.a(uoa.b);
             int i7 = cz.a(uocn.a, ointArray);
             i6 = uoa.g.size();
             int[] ointArray1 = new int[i6];
             for (int i8 = 0; i8 < i6; i8 = i8 + 1) {
                uodr = uoa.g.get(i8);
                long l1 = SystemClock.elapsedRealtime() - uodr.e;
                l1 = l1 / 1000;
                k = 0x7fff;
                if (l1 - k > 0 || l1 - null < 0) {
                   l1 = k;
                }
                if (uodr instanceof dt) {
                   a1 = uocn.a;
                   j1 = uodr.j;
                   k1 = uodr.k;
                }else if(uodr instanceof du){
                   a1 = uocn.a;
                   j1 = uodr.j;
                   k1 = uodr.k;
                }else if(uodr instanceof ds){
                   i9 = dg.a(uocn.a, uodr.j, uodr.k, uodr.l, (short)(int)l1);
                   i10 = 2;
                label_0179 :
                   ointArray1[i8] = da.a(uocn.a, (byte)i10, i9);
                }else if(uodr instanceof dv){
                   a1 = uocn.a;
                   j1 = uodr.j;
                   k1 = uodr.k;
                }else {
                   i9 = 0;
                   i10 = 0;
                   goto label_0179 ;
                }
                i9 = dh.a(a1, j1, k1, (short)(int)l1);
                i10 = 1;
                goto label_0179 ;
             }
             return cz.a(uocn.a, i, uoa.a, i7, cz.b(uocn.a, ointArray1));
          }
       }
       return uodr2;
    }
    public final int a(dx p0){
       return dd.a(this.a, p0.c, p0.k, (int)(p0.e * 1000000.00f), (int)(p0.d * 1000000.00f), (int)p0.f, (int)p0.i, (int)p0.g, (short)(int)p0.h, p0.l);
    }
    public final byte[] a(dx p0,cr$a p1,long p2,List p3){
       int i2;
       super.a();
       int i = this.a(p0);
       int i1 = -1;
       if (p1 != null) {
          cr$a f = p1.f;
          if (f != null && f.size() > 0) {
             i2 = this.a(p1);
          label_001a :
             if (p3 != null && p3.size() > 0) {
                i1 = this.a(p2, p3);
             }
             cw.a(this.a);
             cw.a(this.a, i);
             if (i2 > 0) {
                cw.c(this.a, i2);
             }
             if (i1 > 0) {
                cw.b(this.a, i1);
             }
             this.a.c(cw.b(this.a));
             byte[] uobyteArray = this.a.c();
             return uobyteArray;
          }
       }
       i2 = -1;
       goto label_001a ;
    }
}
