package com.loc.ek;
import com.loc.ee;
import android.content.Context;
import java.lang.Object;
import java.util.ArrayList;
import com.loc.bn;
import com.loc.al;
import java.lang.String;
import com.loc.bt;
import com.loc.cf;
import com.loc.fi;
import com.loc.cd;
import com.loc.cg;
import com.loc.aw;
import com.loc.bd;
import java.util.List;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.File;
import java.lang.CharSequence;
import com.loc.bd$b;
import java.io.InputStream;
import com.loc.fq;
import com.loc.x;
import com.loc.p;
import com.loc.cu;
import java.lang.Throwable;
import com.loc.an;
import java.util.Iterator;
import com.loc.ec;
import com.loc.ed;
import com.loc.fd;
import java.util.Map;
import com.loc.bg;
import com.loc.bl;
import com.loc.bm;
import android.location.LocationListener;
import android.location.LocationManager;
import com.loc.ek$a;
import com.loc.ex;
import com.loc.et;
import com.loc.fj;
import android.location.Location;
import com.loc.ek$b;
import java.lang.Runnable;
import android.os.Handler;
import com.kwai.privacykit.interceptor.LocationInterceptor;
import com.loc.do;
import com.loc.l;
import com.loc.o;
import android.os.Build;
import android.os.Build$VERSION;
import com.loc.dy;
import com.loc.ek$1;
import java.lang.System;
import com.loc.cj;
import com.loc.ck;
import com.loc.cl;
import java.util.Collection;
import java.io.ByteArrayOutputStream;
import java.lang.Long;
import com.loc.bo;

public final class ek implements ee	// class@00140c
{
    public Context a;
    public ex b;
    public et c;
    public do d;
    public bn e;
    public ArrayList f;
    public Handler g;
    public LocationManager h;
    public ek$a i;
    public boolean j;
    public static long k;

    public void ek(Context p0){
       super();
       this.a = null;
       this.f = new ArrayList();
       this.b = null;
       this.c = null;
       this.j = false;
       this.a = p0;
       bn uobn = new bn();
       this.e = uobn;
       bt.a(this.a, uobn, al.k, 100, 0xfa000, "0");
       int f = fi.f;
       cd uocd = new cd(p0, fi.e, f, (f * 10), "carrierLocKey");
       this.e.f = new cf(p0, fi.g, "kKey", v9);
       p0.e = new aw();
    }
    public static int a(byte[] p0){
       return (((p0[0] & 0x00ff) << 24) | (((p0[3] & 0x00ff) | ((p0[2] & 0x00ff) << 8)) | ((p0[1] & 0x00ff) << 16)));
    }
    public static long a(long p0){
       ek.k = p0;
       return p0;
    }
    public static List a(bd p0,bn p1,List p2,byte[] p3){
       return ek.b(p0, p1, p2, p3);
    }
    public static void a(bd p0,List p1){
       ek.b(p0, p1);
    }
    public static boolean a(ek p0){
       return p0.j;
    }
    public static byte[] a(int p0){
       KeyGenerator instance = KeyGenerator.getInstance("AES");
       if (instance == null) {
          return null;
       }
       instance.init(p0);
       return instance.generateKey().getEncoded();
    }
    public static ArrayList b(ek p0){
       return p0.f;
    }
    public static List b(bd p0,bn p1,List p2,byte[] p3){
       String[] stringArray1;
       ArrayList uArrayList = new ArrayList();
       File uFile = p0.b();
       if (uFile == null || !uFile.exists()) {
          return uArrayList;
       }
       String[] stringArray = uFile.list();
       if (stringArray == null) {
          return uArrayList;
       }
       int len = stringArray.length;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (i1 < len) {
          object oobject = stringArray[i1];
          if (oobject.contains(".0")) {
             oobject = oobject.split("\\.")[i];
             bd$b uob = p0.a(oobject);
             if (uob == null) {
                if (uob == null) {
                label_00f3 :
                   stringArray1 = stringArray;
                   int i3 = p3;
                label_00fb :
                   i1 = i1 + 1;
                   stringArray = stringArray1;
                   i = 0;
                }
             }else {
                InputStream inputStream = uob.a();
                if (inputStream == null) {
                   if (inputStream != null) {
                      inputStream.close();
                   }
                }else {
                   int i4 = 2;
                   byte[] uobyteArray = new byte[i4];
                   inputStream.read(uobyteArray);
                   int i5 = fq.b(uobyteArray);
                   if (i5 && i5 <= 0xffff) {
                      uobyteArray = new byte[i5];
                      inputStream.read(uobyteArray);
                      byte[] uobyteArray1 = new byte[i4];
                      int i6 = 0;
                      while (inputStream.read(uobyteArray1) >= 0) {
                         byte[] uobyteArray2 = new byte[fq.b(uobyteArray1)];
                         inputStream.read(uobyteArray2);
                         uobyteArray2 = p.a(uobyteArray, uobyteArray2, x.c());
                         i6 = i6 + uobyteArray2.length;
                         byte[] uobyteArray3 = new byte[4];
                         inputStream.read(uobyteArray3);
                         uArrayList.add(new cu(ek.a(uobyteArray3), p.b(p3, x.b(uobyteArray2), x.c())));
                         stringArray = stringArray;
                         i = 0;
                      }
                      stringArray1 = stringArray;
                      i2 = i2 + i6;
                      p2.add(oobject);
                      if (i2 <= p1.f.b()) {
                         inputStream.close();
                         uob.close();
                         goto label_00fb ;
                      }
                   }
                   inputStream.close();
                   uob.close();
                   break ;
                }
             }
             uob.close();
             goto label_00f3 ;
          }else {
             int i7 = p0;
             goto label_00f3 ;
          }
       }
       return uArrayList;
    }
    public static void b(bd p0,List p1){
       if (p0 == null) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          p0.c(iterator.next());
       }
       p0.close();
       return;
    }
    public static byte[] b(int p0){
       byte[] uobyteArray = new byte[]{(byte)((p0 >> 24) & 0x00ff),(byte)((p0 >> 16) & 0x00ff),(byte)((p0 >> 8) & 0x00ff),(byte)(p0 & 0x00ff)};
       return uobyteArray;
    }
    public static void c(ek p0){
       p0.g();
    }
    public static byte[] c(int p0){
       byte[] uobyteArray = new byte[]{(byte)((p0 & 0xff00) >> 8),(byte)(p0 & 0x00ff)};
       return uobyteArray;
    }
    public static byte[] f(){
       return ek.a(128);
    }
    public final ed a(ec p0){
       fd uofd = new fd();
       uofd.a(p0.b);
       uofd.b(p0.a);
       uofd.a(p0.d);
       bg.a();
       bm uobm = bg.a(uofd);
       ed uoed = new ed();
       uoed.c = uobm.a;
       uoed.b = uobm.b;
       uoed.a = 200;
       return uoed;
    }
    public final void a(){
       if (fq.m(this.a)) {
          return;
       }
       ek ti = this.i;
       if (ti != null) {
          ek th = this.h;
          if (th != null) {
             th.removeUpdates(ti);
          }
       }
       ti = this.i;
       if (ti != null) {
          ti.a();
       }
       if (this.j != null) {
          this.g();
          this.b.a(null);
          this.c.a(null);
          this.c = null;
          this.b = null;
          this.g = null;
          this.j = false;
       }
       return;
    }
    public final void a(Location p0){
       ek tg = this.g;
       if (tg != null) {
          tg.post(new ek$b(this, p0));
       }
       return;
    }
    public final void a(et p0,ex p1,Handler p2){
       if (this.j != null) {
          return;
       }
       if (p0 != null && (p1 == null || p2 == null)) {
          return;
       }
       if (fq.m(this.a)) {
          return;
       }
       this.j = true;
       this.c = p0;
       this.b = p1;
       p1.a(this);
       this.c.a(this);
       this.g = p2;
       if (this.h == null) {
          this.h = this.a.getSystemService("location");
       }
       if (this.i == null) {
          this.i = new ek$a(this);
       }
       this.i.a(this);
       ek ti = this.i;
       if (ti != null) {
          ek th = this.h;
          if (th != null) {
             LocationInterceptor.requestLocationUpdates(th, "passive", 1000, 0xbf800000, ti);
          }
       }
       if (this.d == null) {
          do uodo = new do("6.1.0", l.f(this.a), "S128DF1572465B890OE3F7A13167KLEI", l.c(this.a), this);
          this.d = this.d;
          this.d.a(o.v(this.a)).b(o.h(this.a)).c(o.a(this.a)).d(o.g(this.a)).e(o.y(this.a)).f(o.i(this.a)).g(Build.MODEL).h(Build.MANUFACTURER).i(Build.BRAND).a(Build$VERSION.SDK_INT).j(Build$VERSION.RELEASE).a(dy.a(o.k(this.a))).k(o.k(this.a));
          do.b();
       }
       return;
    }
    public final void b(){
       ek tg = this.g;
       if (tg != null) {
          tg.post(new ek$1(this));
       }
       return;
    }
    public final void c(){
       if (this.d != null) {
          ek tc = this.c;
          if (tc != null) {
             do.a(tc.a());
          }
       }
       return;
    }
    public final void d(){
       if (fq.m(this.a)) {
          return;
       }
       if ((System.currentTimeMillis() - ek.k) - 0xea60 < 0) {
          return;
       }
       cj.a().b(new ek$b(this, 2));
       return;
    }
    public final void e(){
       cj.a().b(new ek$b(this, 3));
    }
    public final void g(){
       if (fq.m(this.a)) {
          return;
       }
       ek tf = this.f;
       if (tf == null || !tf.size()) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       ek tf1 = this.f;
       _monitor_enter(tf1);
       uArrayList.addAll(this.f);
       this.f.clear();
       _monitor_exit(tf1);
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       byte[] uobyteArray = ek.a(256);
       if (uobyteArray == null) {
          return;
       }
       uByteArrayOu.write(ek.c(uobyteArray.length));
       uByteArrayOu.write(uobyteArray);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          cu uocu = iterator.next();
          byte[] uobyteArray1 = uocu.b();
          if (uobyteArray1.length >= 10 && uobyteArray1.length <= 0xffff) {
             uobyteArray1 = p.b(uobyteArray, uobyteArray1, x.c());
             uByteArrayOu.write(ek.c(uobyteArray1.length));
             uByteArrayOu.write(uobyteArray1);
             uByteArrayOu.write(ek.b(uocu.a()));
          }
       }
       bo.a(Long.toString(System.currentTimeMillis()), uByteArrayOu.toByteArray(), this.e);
       return;
    }
}
