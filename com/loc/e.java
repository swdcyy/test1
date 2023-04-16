package com.loc.e;
import android.content.Context;
import java.lang.Object;
import java.util.HashMap;
import com.amap.api.location.AMapLocationClientOption;
import java.lang.String;
import com.loc.eo;
import com.amap.api.location.AMapLocation;
import java.lang.Throwable;
import com.loc.fj;
import com.loc.j;
import android.os.Messenger;
import android.os.Bundle;
import android.os.Message;
import com.loc.ei;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.o;
import java.util.List;
import com.loc.fo;
import com.loc.e$b;
import android.os.HandlerThread;
import com.loc.e$a;
import android.os.Looper;
import java.util.ArrayList;
import android.content.Intent;
import android.os.Handler;
import com.loc.ej;
import android.location.Location;
import com.loc.fi;
import com.loc.fq;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;
import java.lang.Long;
import com.amap.api.location.AMapLocationClientOption$GeoLanguage;
import com.loc.m;
import com.loc.l;
import java.lang.StringBuilder;
import com.loc.fm;
import com.loc.an;
import android.os.Process;

public final class e	// class@0013f9
{
    public String a;
    public e$b b;
    public AMapLocation c;
    public e$a d;
    public Context e;
    public ej f;
    public HashMap h;
    public fo i;
    public long j;
    public long k;
    public String l;
    public AMapLocationClientOption m;
    public AMapLocationClientOption n;
    public boolean o;
    public boolean p;
    public long q;
    public long r;
    public eo s;
    public long t;
    public int u;
    public j v;
    public List w;
    public boolean x;
    public String y;
    public static boolean g;

    public void e(Context p0){
       super();
       this.o = false;
       this.p = false;
       this.a = null;
       this.b = null;
       this.q = 0;
       this.r = 0;
       this.s = null;
       this.c = null;
       this.t = 0;
       this.u = 0;
       this.d = null;
       this.e = null;
       this.v = null;
       this.f = null;
       this.h = new HashMap();
       this.i = null;
       this.j = 0;
       this.k = 0;
       this.l = null;
       this.x = true;
       this.y = "";
       this.m = null;
       this.n = new AMapLocationClientOption();
       this.e = p0;
    }
    public static eo a(int p0,String p1){
       eo uoeo = new eo("");
       uoeo.setErrorCode(p0);
       uoeo.setLocationDetail(p1);
       return uoeo;
    }
    public static j a(e p0,j p1){
       p0.v = p1;
       return p1;
    }
    public static void a(Messenger p0,int p1,Bundle p2){
       if (p0 != null) {
          Message message = Message.obtain();
          message.setData(p2);
          message.what = p1;
          p0.send(message);
       }
       return;
    }
    public static void a(e p0){
       p0.f();
    }
    public static void a(e p0,Bundle p1){
       p0.a(p1);
    }
    public static void a(e p0,Messenger p1){
       p0.a(p1);
    }
    public static void a(e p0,Messenger p1,Bundle p2){
       p0.a(p1, p2);
    }
    public static void a(e p0,Messenger p1,AMapLocation p2,String p3,ei p4){
       p0.a(p1, p2, p3, p4);
    }
    public static AMapLocationClientOption b(Bundle p0){
       AMapLocationClientOption uAMapLocatio = fj.a(p0.getBundle("optBundle"));
       String str = p0.getString("d");
       if (!TextUtils.isEmpty(str)) {
          o.a(str);
       }
    label_002a :
       return uAMapLocatio;
    }
    public static eo b(String p0){
       return e.a(10, p0);
    }
    public static List b(e p0){
       return p0.w;
    }
    public static void b(e p0,Messenger p1,Bundle p2){
       p0.b(p1, p2);
    }
    public static void c(e p0){
       p0.e();
    }
    public static void d(){
       e.g = false;
    }
    public final void a(){
       this.i = new fo();
       e$b uob = new e$b(this, "amapLocCoreThread");
       this.b = uob;
       uob.setPriority(5);
       this.b.start();
       this.d = new e$a(this, this.b.getLooper());
       this.w = new ArrayList();
    }
    public final void a(Intent p0){
       if (("true").equals(p0.getStringExtra("as"))) {
          e td = this.d;
          if (td != null) {
             td.sendEmptyMessageDelayed(9, 100);
          }
       }
       return;
    }
    public final void a(Bundle p0){
       e tf;
       if (this.o != null) {
          tf = this.f;
          if (tf != null) {
             tf.a();
          }
          return;
       }else {
          fj.a(this.e);
          if (p0 != null) {
             this.n = fj.a(p0.getBundle("optBundle"));
          }
          this.f.a(this.e);
          this.f.b();
          this.a(this.n);
          this.f.c();
          this.o = true;
          this.x = true;
          this.y = "";
          tf = this.w;
          if (tf != null && tf.size() > 0) {
             this.e();
          }
          return;
       }
    }
    public final void a(Messenger p0){
       this.h.remove(p0);
    }
    public final void a(Messenger p0,Bundle p1){
       if (p1 == null || p1.isEmpty()) {
          return;
       }
       if (this.p != null) {
          return;
       }
       this.p = true;
       this.b(p0);
       return;
    }
    public final void a(Messenger p0,Bundle p1,String p2){
       float f;
       if (p1 == null || p1.isEmpty()) {
          return;
       }
       double doublex = p1.getDouble("lat");
       double doublex1 = p1.getDouble("lon");
       float floatx = p1.getFloat("radius");
       long longx = p1.getLong("time");
       int i = 1;
       if (("FINE_LOC").equals(p2)) {
          AMapLocation uAMapLocatio = new AMapLocation("gps");
          uAMapLocatio.setLatitude(doublex);
          uAMapLocatio.setLocationType(i);
          uAMapLocatio.setLongitude(doublex1);
          uAMapLocatio.setAccuracy(floatx);
          uAMapLocatio.setTime(longx);
          this.f.a(uAMapLocatio);
       }
       if (!fi.h()) {
          return;
       }else {
          AMapLocationClientOption uAMapLocatio1 = e.b(p1);
          if (uAMapLocatio1 != null && uAMapLocatio1.isNeedAddress()) {
             this.a(uAMapLocatio1);
             e tc = this.c;
             if (tc != null) {
                double[] uodoubleArra = new double[]{doublex,doublex1,tc.getLatitude(),this.c.getLongitude()};
                f = fq.a(uodoubleArra);
                if (f - (float)(fi.i() * 3) < 0) {
                   this.a(p0, p2);
                }
             }else {
                f = 0xbf800000;
             }
             if (!f - 0xbf800000 || f - (float)fi.i() > 0) {
                this.a(p1);
                eo uoeo = this.f.a(doublex, doublex1);
                this.c = uoeo;
                if (uoeo != null && !TextUtils.isEmpty(uoeo.getAdCode())) {
                   this.a(p0, p2);
                }
             }
          }
       label_00b7 :
          return;
       }
    }
    public final void a(Messenger p0,AMapLocation p1,String p2,ei p3){
       Bundle uBundle = new Bundle();
       uBundle.setClassLoader(AMapLocation.class.getClassLoader());
       uBundle.putParcelable("loc", p1);
       uBundle.putString("nb", p2);
       uBundle.putParcelable("statics", p3);
       this.h.put(p0, Long.valueOf(fq.b()));
       e.a(p0, 1, uBundle);
    }
    public final void a(Messenger p0,String p1){
       Bundle uBundle = new Bundle();
       uBundle.setClassLoader(AMapLocation.class.getClassLoader());
       uBundle.putInt("I_MAX_GEO_DIS", (fi.i() * 3));
       uBundle.putInt("I_MIN_GEO_DIS", fi.i());
       uBundle.putParcelable("loc", this.c);
       int i = (("COARSE_LOC").equals(p1))? 103: 6;
       e.a(p0, i, uBundle);
       return;
    }
    public final void a(AMapLocationClientOption p0){
       e tf = this.f;
       if (tf != null) {
          tf.a(p0);
       }
       if (p0 != null) {
          e.g = p0.isKillProcess();
          if (this.m != null) {
             if (p0.isOffset() == this.m.isOffset() && (p0.isNeedAddress() == this.m.isNeedAddress() && (p0.isLocationCacheEnable() != this.m.isLocationCacheEnable() || this.m.getGeoLanguage() != p0.getGeoLanguage()))) {
                this.r = 0;
             }
             if (p0.isOffset() != this.m.isOffset() || this.m.getGeoLanguage() != p0.getGeoLanguage()) {
                this.c = null;
             }
          }
          this.m = p0;
       }
       return;
    }
    public final boolean a(String p0){
       if (TextUtils.isEmpty(this.l)) {
          this.l = fj.b(this.e);
       }
       if (TextUtils.isEmpty(p0) || !p0.equals(this.l)) {
          return false;
       }else {
          return true;
       }
    }
    public final Handler b(){
       return this.d;
    }
    public final void b(Intent p0){
       String stringExtra = p0.getStringExtra("a");
       if (!TextUtils.isEmpty(stringExtra)) {
          m.a(this.e, stringExtra);
       }
       stringExtra = p0.getStringExtra("b");
       this.a = stringExtra;
       l.a(stringExtra);
       String stringExtra1 = p0.getStringExtra("d");
       if (!TextUtils.isEmpty(stringExtra1)) {
          o.a(stringExtra1);
       }
       return;
    }
    public final void b(Messenger p0){
       this.f.f();
       if (fi.k()) {
          Bundle uBundle = new Bundle();
          uBundle.putBoolean("installMockApp", true);
          e.a(p0, 9, uBundle);
       }
       return;
    }
    public final void b(Messenger p0,Bundle p1){
       e ts;
       String str = "#0901";
       String str1 = "#0801";
       if (p1 == null || p1.isEmpty()) {
          return;
       }
       ei uoei = new ei();
       uoei.e("conitue");
       AMapLocationClientOption uAMapLocatio = e.b(p1);
       this.a(uAMapLocatio);
       if (this.h.containsKey(p0) && (!uAMapLocatio.isOnceLocation() && (fq.b() - this.h.get(p0).longValue()) - 800 < 0)) {
          return;
       }
       String str2 = null;
       if (this.x == null) {
          this.s = e.a(9, "init error : "+this.y+str);
          uoei.f(str);
          ts = this.s;
          this.a(p0, ts, ts.k(), uoei);
          fo.a(str2, 2091);
          return;
       }else {
          long l = fq.b();
          int i = 3;
          if (fq.a(this.s) && (l - this.r) - 600 < 0) {
             ts = this.s;
             this.a(p0, ts, ts.k(), uoei);
             this.f.a(this.s, i);
             return;
          }else {
             uoei.c(fq.b());
             int i1 = 8;
             eo uoeo = this.f.a(uoei);
             this.s = uoeo;
             if (uoeo.getLocationType() == 6 || this.s.getLocationType() == 5) {
                this.f.a(this.s, 2);
             }else if(this.s.getLocationType() == 2){
                this.f.a(this.s, i);
             }else {
                int i2 = 4;
                if (this.s.getLocationType() == i2) {
                   this.f.a(this.s, i2);
                }
             }
             this.s = this.f.a(this.s);
             if (fq.a(this.s)) {
                this.r = fq.b();
             }
             if (this.s == null) {
                this.s = e.a(i1, "loc is null#0801");
                uoei.f(str1);
             }
             e ts1 = this.s;
             if (ts1 != null) {
                str2 = this.s.clone();
                str = ts1.k();
             }else {
                str = str2;
             }
             if (uAMapLocatio.isLocationCacheEnable()) {
                e tv = this.v;
                if (tv != null) {
                   str2 = tv.a(str2, str, uAMapLocatio.getLastLocationLifeCycle());
                }
             }
             this.a(p0, str2, str, uoei);
             return;
          }
       }
    }
    public final void c(){
       e th = this.h;
       HashMap hashMap = null;
       if (th != null) {
          th.clear();
          this.h = hashMap;
       }
       th = this.w;
       if (th != null) {
          th.clear();
       }
       th = this.v;
       if (th != null) {
          th.c();
          this.v = hashMap;
       }
       boolean b = false;
       this.o = b;
       this.p = b;
       this.f.e();
       e td = this.d;
       if (td != null) {
          td.removeCallbacksAndMessages(hashMap);
       }
       this.d = hashMap;
       td = this.b;
       if (td != null) {
          Object[] objArray = new Object[b];
          fm.a(td, HandlerThread.class, "quitSafely", objArray);
       }
       this.b = hashMap;
       if (this.i != null) {
          td = null;
          if (this.j - td && this.k - td) {
             fo.a(this.e, this.i.c(this.e), this.i.d(this.e), this.k, (fq.b() - this.j));
             this.i.e(this.e);
          }
       }
       fo.a(this.e);
       an.b();
       if (e.g) {
          Process.killProcess(Process.myPid());
       }
       return;
    }
    public final void e(){
       if (fq.m(this.e)) {
          return;
       }
       e tf = this.f;
       if (tf != null && tf != null) {
          tf.a(this.d);
          this.f.g();
       }
       return;
    }
    public final void f(){
       fi.c(this.e);
    }
}
