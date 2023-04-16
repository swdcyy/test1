package c.t.m.g.cu;
import android.location.GpsStatus$Listener;
import android.location.LocationListener;
import c.t.m.g.ce;
import java.lang.Object;
import java.util.ArrayList;
import c.t.m.g.co;
import android.location.LocationManager;
import android.content.Context;
import android.location.Location;
import android.location.GpsStatus;
import java.lang.String;
import com.kwai.privacykit.interceptor.LocationInterceptor;
import c.t.m.g.cs;
import c.t.m.g.dz;
import c.t.m.g.ej;
import android.os.Message;
import android.os.Handler;
import c.t.m.g.ed;
import java.lang.StringBuilder;
import android.os.Looper;
import java.lang.Thread;
import c.t.m.g.cd;
import java.lang.Throwable;
import android.os.Bundle;
import c.t.m.g.cu$a;
import java.lang.Double;
import java.lang.Math;
import c.t.m.g.dk;
import java.util.Arrays;
import java.lang.System;
import c.t.m.g.dg;
import c.t.m.g.dg$a;
import android.os.Build$VERSION;
import c.t.m.g.dy;
import java.lang.Iterable;
import java.util.Iterator;
import android.location.GpsSatellite;
import java.lang.Float;
import java.lang.Exception;
import java.lang.CharSequence;
import android.text.format.DateFormat;
import java.util.Locale;

public final class cu implements GpsStatus$Listener, LocationListener	// class@000c24
{
    public final ce a;
    public int b;
    public GpsStatus c;
    public Location d;
    public long e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public ArrayList l;
    public boolean m;
    public cu n;
    public boolean o;
    public co p;
    public long q;
    public cu$a r;
    public LocationManager s;
    public Location t;
    public final double[] u;
    public boolean v;

    public void cu(ce p0){
       super();
       this.b = 1024;
       this.e = 0;
       this.f = false;
       this.g = false;
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.l = new ArrayList();
       this.q = -1;
       double[] uodoubleArra = new double[2];
       this.u = uodoubleArra;
       this.v = true;
       this.a = p0;
       this.p = co.a();
       this.n = this;
       this.s = p0.d();
    }
    public static int a(cu p0,int p1){
       p0.b = p1;
       return p1;
    }
    public static long a(cu p0,long p1){
       p0.q = p1;
       return p1;
    }
    public static ce a(cu p0){
       return p0.a;
    }
    public static void a(cu p0,boolean p1){
       p0.b(p1);
    }
    public static boolean a(cu p0,Context p1,Location p2){
       return p0.a(p1, p2);
    }
    public static boolean a(cu p0,Location p1){
       return p0.a(p1);
    }
    public static boolean a(cu p0,Location p1,Location p2){
       return p0.a(p1, p2);
    }
    public static int b(cu p0,int p1){
       p0.h = p1;
       return p1;
    }
    public static Location b(cu p0){
       return p0.t;
    }
    public static Location b(cu p0,Location p1){
       p0.t = p1;
       return p1;
    }
    public static boolean b(cu p0,boolean p1){
       p0.k = p1;
       return p1;
    }
    public static int c(cu p0,int p1){
       p0.i = p1;
       return p1;
    }
    public static void c(cu p0){
       p0.h();
    }
    public static boolean c(cu p0,Location p1){
       return p0.c(p1);
    }
    public static boolean c(cu p0,boolean p1){
       p0.f = p1;
       return p1;
    }
    public static int d(cu p0){
       return p0.b;
    }
    public static void d(cu p0,Location p1){
       p0.b(p1);
    }
    public static long e(cu p0){
       return p0.q;
    }
    public static int f(cu p0){
       return p0.h;
    }
    public static int g(cu p0){
       return p0.i;
    }
    public static boolean h(cu p0){
       return p0.i();
    }
    public static GpsStatus i(cu p0){
       return p0.c;
    }
    public static ArrayList j(cu p0){
       return p0.l;
    }
    public static co k(cu p0){
       return p0.p;
    }
    public static boolean l(cu p0){
       return p0.k;
    }
    public static void m(cu p0){
       p0.e();
    }
    public static void n(cu p0){
       p0.f();
    }
    public static void o(cu p0){
       p0.g();
    }
    public Location a(){
       Location lastKnownLoc = LocationInterceptor.getLastKnownLocation(this.a.d(), "network");
       if (lastKnownLoc == null) {
          return cs.b;
       }
       int i = 1;
       int i1 = 0;
       cu uocu = (this.o != null && dz.a(lastKnownLoc.getLatitude(), lastKnownLoc.getLongitude()))? 1: null;
       if (uocu) {
          ej.a(lastKnownLoc, this.u);
          uocu = this.u;
          this.a(lastKnownLoc, uocu[i1], uocu[i], 0);
       }else {
          this.a(lastKnownLoc, lastKnownLoc.getLatitude(), lastKnownLoc.getLongitude(), 0);
       }
       return lastKnownLoc;
    }
    public final void a(int p0){
       cu tr = this.r;
       if (tr != null) {
          tr.obtainMessage(p0).sendToTarget();
       }
       return;
    }
    public final void a(int p0,Location p1){
       cu tr = this.r;
       if (tr != null) {
          if (ed.a) {
             ed.a("TxGpsProvider", "innerthread isalive:"+tr.getLooper().getThread().isAlive());
          }
          Message message = tr.obtainMessage(p0);
          message.obj = p1;
          tr.sendMessage(message);
       }
       return;
    }
    public final void a(Location p0,double p1,double p2,int p3){
       Bundle extras = p0.getExtras();
       if (extras == null) {
          extras = new Bundle();
       }
       extras.putDouble("lat", p1);
       extras.putDouble("lng", p2);
       extras.putInt("rssi", p3);
       p0.setExtras(extras);
       return;
    }
    public void a(Handler p0,Handler p1,Handler p2,boolean p3){
       if (this.m != null) {
          return;
       }
       this.m = true;
       this.e = 0;
       Looper looper = (p0 == null)? null: p0.getLooper();
       cu tr = this.r;
       if (tr == null || tr.getLooper() != looper) {
          this.r = (looper != null)? new cu$a(this, looper): new cu$a(this, Looper.getMainLooper());
       }
    label_0033 :
       if (!p3) {
          this.f();
          this.k = false;
       }else {
          LocationInterceptor.requestLocationUpdates(this.s, "passive", 2000, 0x3f800000, this);
       }
       if (this.d()) {
          this.b = 4;
          this.g();
       }
       if (ed.a) {
          ed.a("TxGpsProvider", "startup: state=[start]");
       }
       return;
    }
    public void a(boolean p0){
       this.o = p0;
    }
    public final boolean a(double p0){
       if (Math.abs(((double)Double.valueOf(p0).longValue() - p0)) - 1 < 0) {
          return true;
       }
       return false;
    }
    public final boolean a(Context p0,Location p1){
       if (!dk.a) {
          return false;
       }
       if (!this.a.d().isProviderEnabled("gps")) {
          return true;
       }
       if (p1.isFromMockProvider()) {
          return true;
       }
       return false;
    }
    public final boolean a(Location p0){
       if (p0.getAccuracy() - 0x461c4000 > 0) {
          return false;
       }
       if (this.a(p0.getLatitude()) && this.a(p0.getLongitude())) {
          return false;
       }
       int i = 0x3e45798ee2308c3a;
       if (Math.abs(p0.getLatitude()) - i >= 0 && Math.abs(p0.getLongitude()) - i >= 0) {
          double d = 0x3ff0000000000000;
          if (Math.abs((p0.getLatitude() - d)) - i >= 0 && (Math.abs((p0.getLongitude() - d)) - i < 0 || (p0.getLatitude() - 0xc056800000000000 < 0 || (p0.getLatitude() - 0x4056800000000000 > 0 || (p0.getLongitude() - 0xc066800000000000 >= 0 && p0.getLongitude() - 0x4066800000000000 <= 0))))) {
             return true;
          }
       }
    label_0091 :
       return false;
    }
    public final boolean a(Location p0,Location p1){
       if (p0 == null) {
          return true;
       }
       if (p1 == null) {
          return false;
       }
       if (this.i >= 0.00f || (p0.getLongitude() - p1.getLongitude() || (p0.getLatitude() - p1.getLatitude() || (p0.getAccuracy() - p1.getAccuracy() || (p0.getSpeed() || (p1.getSpeed() || (p0.getBearing() || (p1.getBearing() || (p0.getAltitude() || p1.getAltitude()))))))))) {
          return false;
       }
       if (ed.a) {
          ed.a("TxGpsProvider", "cur loc and last loc coordinate,speed,bearing,altitude is all same and =0,so filter current location");
       }
       return true;
    }
    public final void b(){
       if (this.m == null) {
          return;
       }
       this.m = false;
       this.b = 1024;
       this.f = false;
       this.g = false;
       this.j = 0;
       this.i = 0;
       this.h = 0;
       this.l.clear();
       this.q = -1;
       this.o = false;
       this.k = false;
       Arrays.fill(this.u, 0);
       this.e();
       this.r = null;
       this.d = null;
       this.t = null;
       if (ed.a) {
          ed.a("TxGpsProvider", "shutdown: state=[shutdown]");
       }
       return;
    }
    public final void b(Location p0){
       int i1;
       cu ti = this.i;
       cu uocu = 3;
       int i = 1;
       if (ti >= 4 && ti <= 6) {
          i1 = 2;
       }else if(ti >= 7){
          i1 = 3;
       }else {
          i1 = 1;
       }
       int i2 = 0;
       long l = (this.o != null && dz.a(p0.getLatitude(), p0.getLongitude()))? 1: 0;
       if (l) {
          int i3 = 0;
          while (i3 <= uocu) {
             cu tu = this.u;
             long l1 = 0;
             tu[i2] = l1;
             tu[i] = l1;
             ej.a(p0, tu);
             if (ed.a) {
                ed.a("TxGpsProvider", "deflected, "+i3+","+this.u[i2]+","+this.u[i]);
             }
             tu = this.u;
             if (tu[i2] - l1 && tu[i] - l1) {
                break ;
             }
             i3 = i3 + 1;
          }
          ti = this.u;
          this.a(p0, ti[i2], ti[i], i1);
          if (ed.a) {
             ed.a("TxGpsProvider", "deflected, "+this.u[i2]+","+this.u[i]);
          }
       }else {
          this.a(p0, p0.getLatitude(), p0.getLongitude(), i1);
       }
       this.e = System.currentTimeMillis();
       dg uodg = new dg(p0, this.e, this.h, this.i, this.b, dg$a.b);
       this.a.b(ti);
       return;
    }
    public final void b(boolean p0){
       int i = (p0)? 3: 4;
       Message message = new Message();
       message.what = 0x32c7;
       message.arg1 = 0x2ee4;
       message.arg2 = i;
       this.a.b(message);
       return;
    }
    public boolean c(){
       boolean b = ((System.currentTimeMillis() - this.e) - 0x4e20 < 0)? true: false;
       return b;
    }
    public final boolean c(Location p0){
       if (this.i == null && (!p0.getBearing() && p0.getSpeed() <= 0)) {
          return false;
       }
       return true;
    }
    public boolean d(){
       boolean b = this.a.d().isProviderEnabled("gps");
       return b;
    }
    public final void e(){
       LocationManager locationMana = this.a.d();
       try{
          locationMana.removeGpsStatusListener(this.n);
          try{
             e0.removeUpdates(this.n);
             return;
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e0){
       }
    }
    public final void f(){
       String str = "gps";
       String str1 = "]";
       String str2 = "request in thread[";
       if (Build$VERSION.SDK_INT >= 24) {
          LocationInterceptor.requestLocationUpdates(this.s, "gps", 1000, 0, this, Looper.getMainLooper());
          cd.c().a("G", str2+Thread.currentThread().getName()+str1);
       }else {
          cu ts = this.s;
          cu tr = this.r;
          Looper mainLooper = (tr == null)? Looper.getMainLooper(): tr.getLooper();
          LocationInterceptor.requestLocationUpdates(ts, "gps", 1000, 0, this, mainLooper);
          cd.c().a("G", str2+Thread.currentThread().getName()+str1);
       }
       Bundle uBundle = new Bundle();
       this.s.sendExtraCommand(str, "force_xtra_injection", uBundle);
       this.s.sendExtraCommand(str, "force_time_injection", uBundle);
       cd.c().a("G", "add status:"+this.s.addGpsStatusListener(this));
       return;
    }
    public final void g(){
       int i;
       if (this.b == 4) {
          i = 1;
       }else if(this.b == null){
          i = 0;
       }else {
          i = -1;
       }
       Message message = new Message();
       message.what = 0x32c7;
       message.arg1 = 0x2ee2;
       message.arg2 = i;
       this.a.b(message);
       return;
    }
    public final void h(){
       int i = 0;
       try{
          this.j = i;
          this.i = i;
          this.h = i;
          cu tc = this.c;
          if (tc == null) {
             return;
          }else {
             this.l.clear();
             this.j = tc.getMaxSatellites();
             Iterator iterator = tc.getSatellites().iterator();
             if (iterator == null) {
                return;
             }else {
                while (iterator.hasNext() && this.h <= this.j) {
                   GpsSatellite gpsSatellite = iterator.next();
                   int i1 = this.h + 1;
                   this.h = i1;
                   this.l.add(Float.valueOf(gpsSatellite.getSnr()));
                   if (gpsSatellite.usedInFix()) {
                      int i2 = this.i + 1;
                      this.i = i2;
                   }
                }
                if (ed.a) {
                   ed.a("TxGpsProvider", "gps fun_v:"+this.h+",used:"+this.i);
                }
             }
          }
       }catch(java.lang.Exception e1){
          if (ed.a) {
             ed.b("TxGpsProvider", e1.toString());
          }
       }
       return;
    }
    public final boolean i(){
       cu th = this.h;
       cu ti = this.i;
       if (th > null) {
          this.g = true;
       }
       if (ti > null) {
          this.f = true;
       }
       if (this.g != null && th <= 2) {
          return false;
       }else if(this.f != null){
          if (ti >= 3 || ti == null) {
             return true;
          }
       }else if(ti == null){
          return true;
       }
       return false;
    }
    public void onGpsStatusChanged(int p0){
       cd.c().a("G", "e["+p0+"]");
       int i = 1;
       if (p0 != i) {
          i = 2;
          if (p0 != i) {
             if (p0 != 3) {
                if (p0 == 4) {
                   LocationManager locationMana = this.a.d();
                   if (this.c == null) {
                      this.c = locationMana.getGpsStatus(null);
                      cd.c().a("G", "maxSates="+this.c.getMaxSatellites());
                   }else {
                      locationMana.getGpsStatus(this.c);
                   }
                   this.a(1102);
                }
             }else {
                _monitor_enter(cu.class);
                this.b = i | this.b;
                _monitor_exit(cu.class);
             }
          }else {
             this.b = 0;
          }
       }else {
          _monitor_enter(cu.class);
          this.b = i | this.b;
          _monitor_exit(cu.class);
       }
       return;
    }
    public void onLocationChanged(Location p0){
       String str = ",";
       String str1 = "TxGpsProvider";
       if (p0 == null) {
          if (ed.a) {
             ed.a(str1, "location is null.");
          }
          return;
       }else if(ed.a){
          ed.a(str1, "onLocationChanged: "+DateFormat.format("yyyy-MM-dd kk:mm:ss", p0.getTime())+str+p0.getElapsedRealtimeNanos()+str+p0.getLatitude()+str+p0.getLongitude()+str+p0.toString());
       }
       if (("gps").equals(p0.getProvider())) {
          int i = 0;
          if (p0.getExtras() != null) {
             int intx = p0.getExtras().getInt("SourceType", i);
             if ((intx & 0x0080) == 128) {
                cd.c().a("G", "SourceType:"+intx);
                return;
             }
          }
          if (this.d != null && ((p0.getTime() - this.d.getTime()) - 0x2710 > 0 || this.v != null)) {
             Object[] objArray = new Object[]{Double.valueOf(p0.getLatitude()),Double.valueOf(p0.getLongitude()),Double.valueOf(p0.getAltitude()),Float.valueOf(p0.getAccuracy()),Float.valueOf(p0.getBearing()),Float.valueOf(p0.getSpeed())};
             cd.c().a("G", String.format(Locale.ENGLISH, "l,%.6f,%.6f,%.1f,%.1f,%.1f,%.1f", objArray));
          }
          if (this.v == null) {
             i = true;
          }
          this.v = i;
          this.d = p0;
          this.a(1101, p0);
       }
       return;
    }
    public void onProviderDisabled(String p0){
       if (("gps").equals(p0)) {
          this.a(1104);
       }
       return;
    }
    public void onProviderEnabled(String p0){
       if (("gps").equals(p0)) {
          this.a(1103);
       }
       return;
    }
    public void onStatusChanged(String p0,int p1,Bundle p2){
    }
}
