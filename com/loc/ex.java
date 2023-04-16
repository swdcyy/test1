package com.loc.ex;
import java.util.HashMap;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Handler;
import java.lang.Object;
import java.util.ArrayList;
import com.loc.ew;
import java.lang.String;
import com.loc.ep;
import java.lang.Throwable;
import com.loc.fj;
import android.net.wifi.WifiInfo;
import com.kwai.framework.deviceid.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.fq;
import com.loc.ek;
import com.loc.fi;
import android.content.ContentResolver;
import java.lang.Class;
import com.loc.fm;
import java.lang.Integer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.List;
import java.util.Collection;
import java.lang.Exception;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Collections;
import com.loc.dy;
import java.util.Iterator;
import java.lang.System;
import java.lang.StringBuilder;
import java.util.Locale;
import com.kwai.privacykit.interceptor.LocationInterceptor;
import android.net.wifi.ScanResult;
import java.lang.Long;
import android.os.SystemClock;
import java.lang.SecurityException;
import android.os.Build$VERSION;
import java.lang.Thread;

public final class ex	// class@00141f
{
    public boolean B;
    public WifiInfo C;
    public long D;
    public ek E;
    public WifiManager a;
    public ArrayList b;
    public ArrayList c;
    public Context i;
    public boolean j;
    public StringBuilder k;
    public boolean l;
    public boolean m;
    public boolean n;
    public String o;
    public TreeMap p;
    public boolean q;
    public boolean r;
    public boolean s;
    public ew t;
    public String u;
    public long v;
    public ConnectivityManager z;
    public static long A;
    public static long d;
    public static long e;
    public static long f;
    public static long g;
    public static long h;
    public static HashMap w;
    public static long x;
    public static int y;

    static {
       ex.w = new HashMap(36);
       ex.x = 0;
       ex.y = 0;
       ex.A = 0;
    }
    public void ex(Context p0,WifiManager p1,Handler p2){
       super();
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.j = false;
       this.k = null;
       this.l = true;
       this.m = true;
       this.n = true;
       this.C = null;
       this.o = null;
       this.p = null;
       this.q = true;
       this.r = true;
       this.s = false;
       this.u = "";
       this.v = 0;
       this.z = null;
       this.D = 0x7530;
       this.B = false;
       this.a = p1;
       this.i = p0;
       ew uoew = new ew(p0, "wifiAgee", p2);
       this.t = uoew;
       uoew.a();
    }
    public static boolean a(int p0){
       int i = 20;
       try{
          i = WifiManager.calculateSignalLevel(p0, i);
       }catch(java.lang.ArithmeticException e3){
          fj.a(e3, "Aps", "wifiSigFine");
       }
       if (i > 0) {
          return true;
       }
       return false;
    }
    public static boolean a(WifiInfo p0){
       boolean b = false;
       if (p0 == null) {
       }else if(TextUtils.isEmpty(a.f(p0)) || !fq.a(a.a(p0))){
          b = true;
       }
       return b;
    }
    public static long b(){
       return (((fq.b() - ex.x) / 1000) + 1);
    }
    public static String p(){
       return String.valueOf((fq.b() - ex.g));
    }
    public final void A(){
       if (fq.c(this.i, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) {
          this.r = this.a.isWifiEnabled();
       }
       return;
    }
    public final boolean B(){
       this.q = this.v();
       this.A();
       boolean b = true;
       if (this.q == null || this.l == null) {
       label_000f :
          b = false;
       }else if(!ex.f){
          if ((fq.b() - ex.f) - 4900 < 0 || (fq.b() - ex.g) - 1500 < 0) {
             goto label_000f ;
          }else {
             fq.b();
          }
       }
       return b;
    }
    public final ArrayList a(){
       if (this.s == null) {
          return this.c;
       }
       this.b(true);
       return this.c;
    }
    public final void a(ek p0){
       this.E = p0;
    }
    public final void a(boolean p0){
       String str = String.class;
       ex ti = this.i;
       if (!fi.m() || (this.n != null && (this.a != null && (ti == null || !p0)))) {
          return;
       }
       if (fq.c() <= 17) {
          return;
       }
       ContentResolver contentResol = ti.getContentResolver();
       Object[] objArray = new Object[]{contentResol,"wifi_scan_always_enabled"};
       Class[] uClassArray = new Class[]{ContentResolver.class,str};
       if (!fm.a("android.provider.Settings$Global", "getInt", objArray, uClassArray).intValue()) {
          Object[] objArray1 = new Object[]{contentResol,"wifi_scan_always_enabled",Integer.valueOf(1)};
          Class[] uClassArray1 = new Class[]{ContentResolver.class,str,Integer.TYPE};
          fm.a("android.provider.Settings$Global", "putInt", objArray1, uClassArray1);
       }
       return;
    }
    public final void a(boolean p0,boolean p1,boolean p2,long p3){
       this.l = p0;
       this.m = p1;
       this.n = p2;
       if (p3 - 0x2710 < 0) {
          this.D = 0x2710;
          return;
       }else {
          this.D = p3;
          return;
       }
    }
    public final boolean a(ConnectivityManager p0){
       boolean b = false;
       if (fq.a(p0.getActiveNetworkInfo()) == 1 && ex.a(this.c())) {
          b = true;
       }
    label_0020 :
       return b;
    }
    public final void b(boolean p0){
       if (p0) {
          this.w();
       }else {
          this.x();
       }
       boolean b = false;
       if (this.B != null) {
          this.B = b;
          this.z();
       }
       this.y();
       if ((fq.b() - ex.g) - 0x4e20 > 0) {
          this.b.clear();
       }
       ex.e = fq.b();
       if (this.b.isEmpty()) {
          ex.g = fq.b();
          List list = this.r();
          if (list != null) {
             this.b.addAll(list);
             b = true;
          }
       }
       this.d(b);
       return;
    }
    public final WifiInfo c(){
       String str = "gci_n_aws";
       if (this.a != null) {
          if (fq.c(this.i, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) {
             return this.a.getConnectionInfo();
          }else {
             fj.a(new Exception(str), "OPENSDK_WMW", str);
          }
       }
       return null;
    }
    public final void c(boolean p0){
       this.g();
       this.b.clear();
       this.t.a(p0);
    }
    public final String d(){
       return this.o;
    }
    public final void d(boolean p0){
       String str;
       ex tb = this.b;
       if (tb != null && !tb.isEmpty()) {
          if ((fq.b() - ex.g) - 0x36ee80 > 0) {
             this.g();
          }
          if (this.p == null) {
             this.p = new TreeMap(Collections.reverseOrder());
          }
          this.p.clear();
          if (this.s != null && p0) {
             this.c.clear();
          }
          int i = this.b.size();
          this.v = 0;
          int i1 = 0;
          while (i1 < i) {
             dy uody = this.b.get(i1);
             if (uody.h != null) {
                this.v = uody.f;
             }
             if (fq.a(dy.a(uody.a)) && (i <= 20 || ex.a(uody.c))) {
                if (this.s != null && p0) {
                   this.c.add(uody);
                }
                if (!TextUtils.isEmpty(uody.b)) {
                   if (!("<unknown ssid>").equals(uody.b)) {
                      str = String.valueOf(i1);
                   }else {
                   label_0097 :
                      int i2 = uody.c * 25;
                      i2 = i2 + i1;
                      this.p.put(Integer.valueOf(i2), uody);
                   }
                }else {
                   str = "unkwn";
                }
                uody.b = str;
                goto label_0097 ;
             }
             i1 = i1 + 1;
          }
          this.b.clear();
          Iterator iterator = this.p.values().iterator();
          while (iterator.hasNext()) {
             this.b.add(iterator.next());
          }
          this.p.clear();
       }
       return;
    }
    public final ArrayList e(){
       if (this.b == null) {
          return null;
       }
       ArrayList uArrayList = new ArrayList();
       if (!this.b.isEmpty()) {
          uArrayList.addAll(this.b);
       }
       return uArrayList;
    }
    public final void f(){
       this.s = true;
       List list = this.r();
       if (list != null) {
          this.b.clear();
          this.b.addAll(list);
       }
       this.d(true);
       return;
    }
    public final void g(){
       this.C = null;
       this.b.clear();
    }
    public final void h(){
       ex.A = System.currentTimeMillis();
       ex tE = this.E;
       if (tE != null) {
          tE.b();
       }
       return;
    }
    public final void i(){
       if (this.a == null) {
          return;
       }
       if ((fq.b() - ex.g) - 4900 > 0) {
          ex.g = fq.b();
       }
       return;
    }
    public final void j(){
       if (this.a == null) {
          return;
       }
       this.B = true;
       return;
    }
    public final boolean k(){
       return this.q;
    }
    public final boolean l(){
       return this.r;
    }
    public final WifiInfo m(){
       this.C = this.c();
       return this.C;
    }
    public final boolean n(){
       return this.j;
    }
    public final String o(){
       ex uoex;
       ex tk = this.k;
       boolean b = false;
       if (tk == null) {
          this.k = new StringBuilder(700);
       }else {
          tk.delete(b, tk.length());
       }
       this.j = b;
       int i = this.b.size();
       int i1 = 0;
       int i2 = 0;
       String str = null;
       while (i1 < i) {
          String str1 = dy.a(this.b.get(i1).a);
          if (this.m == null && !("<unknown ssid>").equals(this.b.get(i1).b)) {
             i2 = 1;
          }
          if (!TextUtils.isEmpty(this.u) && (this.u).equals(str1)) {
             str = "access";
             uoex = 1;
          }else {
             uoex = str;
             str = "nb";
          }
          Object[] objArray = new Object[2];
          objArray[b] = str1;
          objArray[1] = str;
          StringBuilder str2 = this.k+String.format(Locale.US, "#%s,%s", objArray);
          i1 = i1 + 1;
          str = uoex;
       }
       if (!this.b.size()) {
          i2 = 1;
       }
       if (this.m == null && !i2) {
          this.j = true;
       }
       if (str == null && !TextUtils.isEmpty(this.u)) {
          StringBuilder str3 = this.k+"#"+this.u;
          str3 = this.k+",access";
       }
       return this.k;
    }
    public final long q(){
       return this.v;
    }
    public final List r(){
       List scanResults;
       if (this.a != null) {
          try{
             if (fq.c(this.i, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) {
                scanResults = LocationInterceptor.getScanResults(this.a);
             }else {
                fj.a(new Exception("gst_n_aws"), "OPENSDK_WMW", "gsr_n_aws");
                scanResults = null;
             }
             HashMap hashMap = new HashMap(36);
             if (scanResults != null) {
                Iterator iterator = scanResults.iterator();
                while (iterator.hasNext()) {
                   ScanResult scanResult = iterator.next();
                   hashMap.put(scanResult.BSSID, Long.valueOf(scanResult.timestamp));
                }
             }
             if (ex.w.isEmpty() || !ex.w.equals(hashMap)) {
                ex.w = hashMap;
                ex.x = fq.b();
             }
             this.o = null;
             ArrayList uArrayList = new ArrayList();
             this.u = "";
             this.C = this.m();
             if (ex.a(this.C)) {
                this.u = a.a(this.C);
             }
             if (scanResults != null && scanResults.size() > 0) {
                int i = scanResults.size();
                for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                   ScanResult scanResult1 = scanResults.get(i1);
                   ScanResult bSSID = scanResult1.BSSID;
                   boolean b = (!TextUtils.isEmpty(this.u) && (this.u).equals(bSSID))? true: false;
                   dy uody = new dy(b);
                   uody.b = scanResult1.SSID;
                   uody.d = scanResult1.frequency;
                   uody.e = scanResult1.timestamp;
                   uody.a = dy.a(scanResult1.BSSID);
                   uody.c = (short)scanResult1.level;
                   long l = scanResult1.timestamp / 1000;
                   long l1 = SystemClock.elapsedRealtime() - l;
                   l1 = l1 / 1000;
                   short s = (short)(int)l1;
                   uody.g = s;
                   if (s < 0) {
                      uody.g = 0;
                   }
                   uody.f = fq.b();
                   uArrayList.add(uody);
                }
             }
             this.t.a(uArrayList);
             return uArrayList;
          }catch(java.lang.SecurityException e0){
             this.o = e0.getMessage();
          }
       label_0103 :
          return null;
       }else {
          goto label_0103 ;
       }
    }
    public final int s(){
       ex ta = this.a;
       if (ta != null) {
          return ta.getWifiState();
       }
       return 4;
    }
    public final boolean t(){
       long l = fq.b() - ex.d;
       if (l - 4900 < 0) {
          return false;
       }
       if (this.u() && l - 9900 < 0) {
          return false;
       }
       if (ex.y > 1) {
          ex tD = this.D;
          int i = 0x7530;
          if (!tD - i) {
             tD = (fi.n() - -1)? fi.n(): i;
          }
       label_003a :
          if (Build$VERSION.SDK_INT >= 28 && l - tD < 0) {
             return false;
          }
       }
    label_0045 :
       if (this.a != null) {
          ex.d = fq.b();
          int y = ex.y;
          if (y < 2) {
             ex.y = y + 1;
          }
          if (fq.c(this.i, "WYW5kcm9pZC5wZXJtaXNzaW9uLkNIQU5HRV9XSUZJX1NUQVRF")) {
             return this.a.startScan();
          }else {
             fj.a(new Exception("n_cws"), "OPENSDK_WMW", "wfs_n_cws");
          }
       }
       return false;
    }
    public final boolean u(){
       if (this.z == null) {
          this.z = fq.a(this.i, "connectivity");
       }
       return this.a(this.z);
    }
    public final boolean v(){
       if (this.a == null) {
          return false;
       }
       return fq.g(this.i);
    }
    public final void w(){
       if (this.B()) {
          long l = fq.b();
          int i = 20;
          int i1 = 0x2710;
          if ((l - ex.e) - i1 >= 0) {
             this.b.clear();
             ex.h = ex.g;
          }
          this.x();
          if ((l - ex.e) - i1 >= 0) {
             while (i > 0 && !ex.g - ex.h) {
                Thread.sleep(150);
                i = i - 1;
             }
          }
       }
       return;
    }
    public final void x(){
       if (!this.B()) {
          return;
       }
       if (this.t()) {
          ex.f = fq.b();
       }
       return;
    }
    public final void y(){
       if (ex.h - ex.g) {
          List list = this.r();
          ex.h = ex.g;
          if (list != null) {
             this.b.clear();
             this.b.addAll(list);
             return;
          }else {
             this.b.clear();
          }
       }
       return;
    }
    public final void z(){
       if (this.a == null) {
          return;
       }
       int i = this.s();
       if (this.b == null) {
          this.b = new ArrayList();
       }
       if (!i || (i == 1 || i == 4)) {
          this.g();
       }
       return;
    }
}
