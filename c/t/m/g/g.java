package c.t.m.g.g;
import c.t.m.g.av;
import java.io.File;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Looper;
import android.location.Location;
import c.t.m.g.ay;
import java.lang.System;
import java.lang.String;
import java.lang.Object;
import c.t.m.g.j;
import java.util.Locale;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Float;
import android.os.Handler;
import c.t.m.g.bp;
import c.t.m.g.bt;
import java.lang.Throwable;
import android.os.Message;
import java.util.Arrays;
import c.t.m.g.by;
import c.t.m.g.l;
import c.t.m.g.e;
import java.lang.Class;
import c.t.m.g.bu;
import c.t.m.g.bh;
import c.t.m.g.bm;
import c.t.m.g.cb;
import android.os.Build;
import c.t.m.g.bx;
import c.t.m.g.c;
import android.os.Build$VERSION;
import c.t.m.g.m;
import c.t.m.g.bv$a;
import c.t.m.g.bv;
import c.t.m.g.ca;
import c.t.m.g.g$1;
import java.lang.Runnable;
import c.t.m.g.bn;
import java.lang.CharSequence;
import c.t.m.g.g$2;
import c.t.m.g.ap;
import android.os.Bundle;
import c.t.m.g.aq;

public class g extends av	// class@000c95
{
    public final StringBuilder c;
    public final File d;
    public long e;
    public long f;
    public final long[] g;
    public final int[] h;
    public ArrayList i;
    public ArrayList j;
    public HashSet k;
    public long l;
    public int m;
    public int n;
    public int o;
    public float p;
    public float q;
    public AtomicBoolean r;

    public void g(File p0){
       super();
       this.c = "";
       this.e = 0;
       this.f = 0;
       long[] olongArray = new long[2];
       this.g = olongArray;
       int[] ointArray = new int[2];
       this.h = ointArray;
       this.i = new ArrayList();
       this.j = new ArrayList();
       this.k = new HashSet();
       this.r = new AtomicBoolean(false);
       this.d = p0;
    }
    public static AtomicBoolean a(g p0){
       return p0.r;
    }
    public static void b(g p0){
       p0.i();
    }
    public int a(Looper p0){
       this.l = 0;
       this.o = -1;
       this.n = -1;
       this.a(1001, 0);
       return 0;
    }
    public void a(){
       this.a(1002, 0);
       this.i.clear();
       this.j.clear();
       this.k.clear();
    }
    public void a(int p0,Location p1){
       String str;
       ay uoay = this;
       ay b = uoay.b;
       _monitor_enter(b);
       if (!this.e()) {
          _monitor_exit(b);
          return;
       }else {
          long l = System.currentTimeMillis();
          g g = uoay.g;
          if ((l - g[0]) - 900 < 0) {
             _monitor_exit(b);
             return;
          }else {
             g[0] = l;
             g = uoay.h;
             g[0] = g[0] + 1;
             if (p1 == null || !("gps").equals(p1.getProvider())) {
                _monitor_exit(b);
                return;
             }else if(!j.h && p1.isFromMockProvider()){
                _monitor_exit(b);
                return;
             }else {
                int i = 9;
                if ((l - uoay.l) - 2000 > 0) {
                   Object[] objArray = new Object[i];
                   objArray[0] = Long.valueOf(l);
                   objArray[1] = Long.valueOf(p1.getTime());
                   objArray[2] = Integer.valueOf(p0);
                   objArray[3] = Double.valueOf(p1.getLatitude());
                   objArray[4] = Double.valueOf(p1.getLongitude());
                   objArray[5] = Double.valueOf(p1.getAltitude());
                   objArray[6] = Float.valueOf(p1.getAccuracy());
                   objArray[7] = Float.valueOf(p1.getSpeed());
                   objArray[8] = Float.valueOf(p1.getBearing());
                   str = String.format(Locale.ENGLISH, "%d,G,%d,%d,%.6f,%.6f,%.1f,%.1f,%.1f,%.1f,-1,-1,0,-1,0", objArray);
                }else {
                   Object[] objArray1 = new Object[14];
                   objArray1[0] = Long.valueOf(l);
                   objArray1[1] = Long.valueOf(p1.getTime());
                   objArray1[2] = Integer.valueOf(p0);
                   objArray1[3] = Double.valueOf(p1.getLatitude());
                   objArray1[4] = Double.valueOf(p1.getLongitude());
                   objArray1[5] = Double.valueOf(p1.getAltitude());
                   objArray1[6] = Float.valueOf(p1.getAccuracy());
                   objArray1[7] = Float.valueOf(p1.getSpeed());
                   objArray1[8] = Float.valueOf(p1.getBearing());
                   objArray1[i] = Integer.valueOf(uoay.m);
                   objArray1[10] = Integer.valueOf(uoay.n);
                   objArray1[11] = Float.valueOf(uoay.p);
                   objArray1[12] = Integer.valueOf(uoay.o);
                   objArray1[13] = Float.valueOf(uoay.q);
                   str = String.format(Locale.ENGLISH, "%d,G,%d,%d,%.6f,%.6f,%.1f,%.1f,%.1f,%.1f,%d,%d,%.2f,%d,%.2f", objArray1);
                }
                bp.a(this.d(), 1003, 0, 0, str);
                _monitor_exit(b);
                return;
             }
          }
       }
    }
    public void a(long p0){
       int i = 0;
       if (p0 - i < 0) {
          p0 = i;
       }
       this.a(1004, p0);
       return;
    }
    public void a(long p0,int p1,double p2,double p3,double p4){
    }
    public void a(Message p0){
       int i = 1004;
       switch (p0.what){
           case 1001:
             this.f();
             this.e = System.currentTimeMillis() - 0x9c40;
             this.a(i, 0x493e0);
             break;
           case 1002:
             bp.b(this.d());
             g th = this.h;
             if ((th[0] + th[1]) >= 3) {
                this.b(this.c);
             }
             this.f();
             this.h();
             break;
           case 1003:
             this.a(p0.obj);
             break;
           case 1004:
             this.a(i, 0x1b7740);
             this.h();
             break;
           default:
       }
       return;
    }
    public final void a(String p0){
       StringBuilder str;
       long l = System.currentTimeMillis();
       if (!(this.c).length()) {
          str = this.c+this.g();
          this.f = l;
       }
       str = this.c+'$'+p0;
       if ((long)(this.c).length() - 0x3c00 >= 0 || (this.f && (l - this.f) - 0x927c0 >= 0)) {
          g th = this.h;
          if ((th[0] + th[1]) >= 3) {
             this.b(this.c);
          }
          (this.c).setLength(0);
          Arrays.fill(this.h, 0);
       }
       return;
    }
    public String b(){
       return "UserTrackPro";
    }
    public final void b(String p0){
       String str = "_";
       if (by.a(p0)) {
          return;
       }
       byte[] bytes = p0.getBytes("UTF-8");
       byte[] uobyteArray = l.a(bytes, 3);
       if (bt.a()) {
          bt.a("UserTrackPro", "srcBytes.len="+bytes.length+",encBytes.len="+uobyteArray.length);
       }
       File uFile = new File(this.d, "utr_"+(bu.a(e.class.getName(), "SHA-256")).substring(0, 8)+str+bh.b("yyyyMMdd"));
       bm.a(uFile, uobyteArray, true);
       if (uFile.length() - 0xc800 > 0) {
          uFile.renameTo(new File(uFile.getParent(), uFile.getName()+str+bh.b("HHmmss")));
       }
    label_00b5 :
       return;
    }
    public final void f(){
       this.f = System.currentTimeMillis();
       (this.c).setLength(0);
       Arrays.fill(this.h, 0);
       Arrays.fill(this.g, 0);
    }
    public final String g(){
       String str = (cb.i()).replaceAll("[| _,]", "")+"_"+cb.h()+"_"+cb.j();
       String str1 = (bx.a(Build.MANUFACTURER, "")).replaceAll("[| _,]", "")+"_"+(bx.a(cb.g(), "")).replaceAll("[| _,]", "");
       StringBuilder str2 = "SYSTEM,"+System.currentTimeMillis()+','+cb.d()+',';
       String str3 = (j.i == null)? "": j.i.d();
       return str2+str3+','+str+','+str1+','+Build$VERSION.SDK_INT+','+m.a()+','+m.c()+','+((m.d()).replaceAll(":", "")).toLowerCase()+','+m.b();
    }
    public final void h(){
       long l = System.currentTimeMillis();
       if ((l - this.e) - 0xea60 < 0) {
          if (bt.a()) {
             bt.a("UserTrackPro", "last upload time: < 1min");
          }
          return;
       }else {
          this.e = l;
          bv$a uoa = bv.a();
          int i = 1;
          if (uoa == bv$a.a) {
             i = 0;
          }else if(uoa == bv$a.b){
             boolean f = j.f;
             if (!f && j.g) {
                long l1 = ca.b("LocationSDK", "log_utr_up_in_m", Long.valueOf(l)).longValue();
                if ((l - l1) - 0x5265c00 > 0) {
                   ca.a("LocationSDK", "log_utr_up_in_m", Long.valueOf(l));
                   if (bt.a()) {
                      bt.a("UserTrackPro", "upload in mobile once today. lastUpT="+l1+",curT="+l);
                   }
                }
             }
             i = f;
          }
          if (i) {
             bn.a("th_loc_task_t_consume", new g$1(this));
          }
          return;
       }
    }
    public final void i(){
       g td = this.d;
       File[] uFileArray = (td != null && td.exists())? this.d.listFiles(): null;
       if (by.b(uFileArray)) {
          return;
       }else {
          long l = System.currentTimeMillis();
          bv$a uoa = bv.a();
          String str = bh.b("yyyyMMdd");
          int i = 0;
          int i1 = 0;
          while (i < uFileArray.length) {
             object oobject = uFileArray[i];
             String name = oobject.getName();
             if (!oobject.exists() || (!oobject.isFile() || (name.startsWith("utr_") && !name.contains(str)))) {
                long l1 = l - oobject.lastModified();
                if (l1 - 0x4d3f6400 > 0) {
                   if (bt.a()) {
                      bt.a("UserTrackPro", "del file:"+oobject.getName());
                   }
                   oobject.delete();
                }else {
                   byte[] uobyteArray = bm.a(oobject);
                   i1 = i1 + uobyteArray.length;
                   if (bt.a()) {
                      bt.a("UserTrackPro", "upload file:"+oobject.getName()+",len="+uobyteArray.length+",sum="+i1+",netType="+uoa);
                   }
                   if (!uobyteArray.length) {
                      oobject.delete();
                   }else {
                      j.k.a(this.j(), uobyteArray, new g$2(this, oobject));
                      if (uoa == bv$a.b || i1 >= 0x7d000) {
                         break ;
                      }
                   }
                }
             }
          label_00db :
             i = i + 1;
          }
          return;
       }
    }
    public final String j(){
       String str = (j.h)? "https://testdatalbs.sparta.html5.qq.com/tr?utr": "https://analytics.map.qq.com/tr?utr";
       if (!j.e) {
          str = str.replace("https:", "http:");
       }
       return str;
    }
}
