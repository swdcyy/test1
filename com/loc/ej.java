package com.loc.ej;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import com.amap.api.location.AMapLocationClientOption;
import java.lang.StringBuilder;
import com.amap.api.location.AMapLocationClientOption$GeoLanguage;
import com.loc.eo;
import com.amap.api.location.AMapLocation;
import com.loc.fo;
import android.content.Context;
import com.loc.fe;
import java.lang.CharSequence;
import com.loc.fg;
import com.loc.ei;
import com.loc.fq;
import android.location.Location;
import com.loc.fi;
import com.loc.eq;
import com.loc.ex;
import java.lang.Throwable;
import com.loc.fj;
import com.loc.et;
import android.text.TextUtils;
import com.loc.ez;
import com.loc.es;
import com.loc.en;
import com.loc.bm;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Handler;
import com.loc.ev;
import com.loc.eu;
import java.lang.Integer;
import com.loc.o;
import com.loc.x;
import com.loc.ff;
import com.loc.m;
import com.loc.fc;
import com.loc.ek;
import com.loc.ey;
import com.loc.k;
import java.lang.Math;
import com.loc.fh;
import android.location.LocationManager;
import com.loc.fm;
import java.lang.Boolean;
import android.content.ContentResolver;
import android.provider.Settings$Secure;
import android.net.wifi.WifiInfo;
import com.loc.dy;
import java.util.Locale;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.loc.an;
import com.amap.api.location.AMapLocationClientOption$AMapLocationProtocol;
import java.lang.Enum;
import com.loc.ej$1;
import com.loc.ej$a;
import android.content.IntentFilter;
import android.content.Intent;

public final class ej	// class@001408
{
    public eq A;
    public boolean B;
    public en D;
    public String E;
    public boolean H;
    public IntentFilter I;
    public LocationManager J;
    public int K;
    public String L;
    public String N;
    public boolean O;
    public Handler P;
    public ev Q;
    public String R;
    public ek T;
    public Context a;
    public ConnectivityManager b;
    public ex c;
    public et d;
    public ez e;
    public fg f;
    public ArrayList g;
    public ej$a h;
    public AMapLocationClientOption i;
    public eo j;
    public long k;
    public fh l;
    public boolean m;
    public fe n;
    public StringBuilder o;
    public boolean p;
    public boolean q;
    public AMapLocationClientOption$GeoLanguage r;
    public boolean s;
    public boolean t;
    public WifiInfo u;
    public boolean v;
    public StringBuilder w;
    public boolean x;
    public boolean y;
    public int z;
    public static int C = 255;
    public static String[] F;
    public static String G;
    public static boolean M;
    public static boolean S;

    static {
       String[] stringArray = new String[]{"android.permission.ACCESS_COARSE_LOCATION","android.permission.ACCESS_FINE_LOCATION"};
       ej.F = stringArray;
       ej.G = "android.permission.ACCESS_BACKGROUND_LOCATION";
       ej.S = false;
    }
    public void ej(boolean p0){
       super();
       this.a = null;
       this.b = null;
       this.c = null;
       this.d = null;
       this.e = null;
       this.f = null;
       this.g = new ArrayList();
       this.h = null;
       this.i = new AMapLocationClientOption();
       this.j = null;
       this.k = 0;
       this.K = 0;
       this.l = null;
       this.m = false;
       this.L = null;
       this.n = null;
       this.o = "";
       this.p = true;
       this.q = true;
       this.r = AMapLocationClientOption$GeoLanguage.DEFAULT;
       this.s = true;
       this.t = false;
       this.u = null;
       this.v = true;
       this.N = null;
       this.w = null;
       this.x = false;
       this.y = false;
       this.z = 12;
       this.O = true;
       this.A = null;
       this.B = false;
       this.D = null;
       this.E = null;
       this.H = false;
       this.I = null;
       this.J = null;
       this.H = p0;
    }
    public static eo a(int p0,String p1){
       eo uoeo = new eo("");
       uoeo.setErrorCode(p0);
       uoeo.setLocationDetail(p1);
       if (p0 == 15) {
          fo.a(null, 2151);
       }
       return uoeo;
    }
    public static void c(eo p0){
       if (!p0.getErrorCode() && !p0.getLocationType()) {
          if (!("-5").equals(p0.d()) && (!("1").equals(p0.d()) && (!("2").equals(p0.d()) && (!("14").equals(p0.d()) && (("24").equals(p0.d()) || ("-1").equals(p0.d())))))) {
             p0.setLocationType(5);
          }else {
             p0.setLocationType(6);
          }
       }
       return;
    }
    public final eo a(double p0,double p1){
       String str = this.n.a(this.a, p0, p1);
       if (!str.contains("\"status\":\"1\"")) {
          return null;
       }
       eo uoeo = this.f.a(str);
       uoeo.setLatitude(p0);
       uoeo.setLongitude(p1);
       return uoeo;
    }
    public final eo a(ei p0){
       String str;
       eo uoeo;
       float f;
       ej uoej = this;
       ei uoei = p0;
       this.d();
       uoei.e("conitue");
       int i = 1;
       if (uoej.a == null) {
          uoei.f("#0101");
          str = uoej.o+"context is null#0101";
          return ej.a(i, uoej.o);
       }else {
          boolean i1 = uoej.K + i;
          uoej.K = i1;
          if (i1 == i) {
             this.o();
          }
          int i2 = 2;
          if (uoej.a(uoej.k) && fq.a(uoej.j)) {
             if (uoej.s != null && fi.a(uoej.j.getTime())) {
                uoej.j.setLocationType(i2);
             }
             return uoej.j;
          }else {
             ej a = uoej.A;
             if (a != null) {
                if (uoej.B != null) {
                   a.a();
                }else {
                   a.b();
                }
             }
             i1 = (uoej.i.isOnceLocationLatest() || !uoej.i.isOnceLocation())? true: false;
             uoej.c.b(i1);
             uoej.g = uoej.c.e();
             uoej.d.a(false, this.p());
             str = this.c(p0);
             uoej.N = str;
             if (TextUtils.isEmpty(str)) {
                return ej.a(uoej.z, uoej.o);
             }else {
                uoej.w = uoej.a(uoej.w);
                int i3 = 4;
                if (uoej.c.n()) {
                   uoeo = ej.a(15, "networkLocation has been mocked!#1502");
                   uoei.f("#1502");
                   uoeo.setMock(i);
                   uoeo.setTrustedLevel(i3);
                   return uoeo;
                }else {
                   uoeo = uoej.e.a(uoej.d, this.n(), uoej.j, uoej.c, uoej.w, uoej.N, uoej.a, false);
                   if (fq.a(uoeo)) {
                      uoeo.setTrustedLevel(i2);
                   label_0103 :
                      uoej.d(uoeo);
                   }else {
                      uoeo = uoej.b(i, uoei);
                      if (fq.a(uoeo)) {
                         uoeo.e("new");
                         uoej.e.a(uoej.w);
                         uoej.e.a(uoej.d.e());
                         goto label_0103 ;
                      }else {
                         eo uoeo1 = uoej.e.a(uoej.d, false, uoej.j, uoej.c, uoej.w, uoej.N, uoej.a, true);
                         if (fq.a(uoeo1)) {
                            uoei.f("#0001");
                            uoeo1.setTrustedLevel(i2);
                            uoej.d(uoeo1);
                            uoeo = uoeo1;
                         }
                      }
                   }
                   if (uoej.c != null && uoeo != null) {
                      long l = ex.b();
                      if (l - 15 <= 0) {
                         uoeo.setTrustedLevel(i);
                      }else if(l - 120 <= 0){
                         uoeo.setTrustedLevel(i2);
                      }else if(l - 600 <= 0){
                         uoeo.setTrustedLevel(3);
                      }else {
                         uoeo.setTrustedLevel(i3);
                      }
                   }
                   uoej.e.a(uoej.N, uoej.w, uoeo, uoej.a, true);
                   fq.a(uoeo);
                   ej w = uoej.w;
                   w.delete(false, w.length());
                   if (uoeo != null) {
                      if (uoej.B != null) {
                         w = uoej.A;
                         if (w != null) {
                            uoeo.setAltitude(w.c());
                            uoeo.setBearing(uoej.A.d());
                            f = (float)uoej.A.e();
                         label_01c6 :
                            uoeo.setSpeed(f);
                         }
                      }
                      uoeo.setAltitude(0);
                      f = 0;
                      uoeo.setBearing(f);
                      goto label_01c6 ;
                   }
                   uoej.d(uoeo);
                   return uoej.j;
                }
             }
          }
       }
    }
    public final eo a(eo p0){
       this.D.a(this.s);
       return this.D.a(p0);
    }
    public final eo a(eo p0,bm p1,ei p2){
       StringBuilder str2;
       if (p1 != null) {
          bm a = p1.a;
          if (a != null && a.length) {
             fg uofg = new fg();
             String str1 = new String(p1.a, "UTF-8");
             if (str1.contains("\"status\":\"0\"")) {
                p0 = uofg.a(str1, this.a, p1, p2);
                p0.h(this.w);
                return p0;
             }else if(str1.contains("</body></html>")){
                p0.setErrorCode(5);
                ej tc = this.c;
                if (tc != null && tc.a(this.b)) {
                   p2.f("#0501");
                   str2 = this.o+"您连接的是一个需要登录的网络，请确认已经登入网络#0501";
                   fo.a(null, 2051);
                }else {
                   p2.f("#0502");
                   str2 = this.o+"请求可能被劫持了#0502";
                   fo.a(null, 2052);
                }
                p0.setLocationDetail(this.o);
                return p0;
             }else {
                return null;
             }
          }
       }
       p0.setErrorCode(4);
       StringBuilder str = this.o+"网络异常,请求异常#0403";
       p2.f("#0403");
       p0.h(this.w);
       p0.setLocationDetail(this.o);
       if (p1 != null) {
          fo.a(p1.d, 2041);
       }
       return p0;
    }
    public final eo a(boolean p0){
       int i;
       String str;
       if (this.c.n()) {
          i = 15;
          str = "networkLocation has been mocked!#1502";
       }else if(TextUtils.isEmpty(this.N)){
          i = this.z;
          str = this.o;
       }else {
          eo uoeo = this.e.a(this.a, this.N, this.w, true, p0);
          if (fq.a(uoeo)) {
             this.d(uoeo);
          }
          return uoeo;
       }
       return ej.a(i, str);
    }
    public final eo a(boolean p0,ei p1){
       String str = (p0)? "statics": "first";
       p1.e(str);
       if (this.a == null) {
          p1.f("#0101");
          StringBuilder str1 = this.o+"context is null#0101";
          fo.a(null, 2011);
          return ej.a(1, this.o);
       }else if(this.c.n()){
          p1.f("#1502");
          return ej.a(15, "networkLocation has been mocked!#1502");
       }else {
          this.b();
          if (TextUtils.isEmpty(this.N)) {
             return ej.a(this.z, this.o);
          }else {
             eo uoeo = this.b(p0, p1);
             if (fq.a(uoeo) && !ej.S) {
                this.e.a(this.w);
                this.e.a(this.d.e());
                this.d(uoeo);
             }
             ej.S = true;
             return uoeo;
          }
       }
    }
    public final StringBuilder a(StringBuilder p0){
       if (p0 == null) {
          p0 = new StringBuilder(700);
       }else {
          p0.delete(0, p0.length());
       }
       return p0+this.d.m()+this.c.o();
    }
    public final void a(){
       ej td = this.d;
       if (td != null) {
          td.b();
       }
       return;
    }
    public final void a(Context p0){
       if (this.a != null) {
          return;
       }
       this.D = new en();
       Context applicationC = p0.getApplicationContext();
       this.a = applicationC;
       fq.b(applicationC);
       if (this.c == null) {
          this.c = new ex(this.a, fq.a(this.a, "wifi"), this.P);
       }
       if (this.d == null) {
          this.d = new et(this.a, this.P);
       }
       this.Q = new ev(p0, this.P);
       if (this.e == null) {
          this.e = new ez();
       }
       if (this.f == null) {
          this.f = new fg();
       }
       return;
    }
    public final void a(Handler p0){
       this.P = p0;
    }
    public final void a(AMapLocation p0){
       if (p0.getErrorCode()) {
          return;
       }
       eu uoeu = new eu();
       uoeu.a = p0.getLocationType();
       uoeu.d = p0.getTime();
       uoeu.e = (int)p0.getAccuracy();
       uoeu.b = p0.getLatitude();
       uoeu.c = p0.getLongitude();
       if (p0.getLocationType() == 1) {
          this.Q.a(uoeu);
       }
       return;
    }
    public final void a(AMapLocationClientOption p0){
       this.i = p0;
       if (p0 == null) {
          this.i = new AMapLocationClientOption();
       }
       ej tc = this.c;
       if (tc != null) {
          this.i.isWifiActiveScan();
          tc.a(this.i.isWifiScan(), this.i.isMockEnable(), AMapLocationClientOption.isOpenAlwaysScanWifi(), p0.getScanWifiInterval());
       }
       this.i();
       ej te = this.e;
       if (te != null) {
          te.a(this.i);
       }
       te = this.f;
       if (te != null) {
          te.a(this.i);
       }
       this.k();
       return;
    }
    public final void a(eo p0,int p1){
       if (p0 == null) {
          return;
       }
       if (p0.getErrorCode()) {
          return;
       }
       eu uoeu = new eu();
       uoeu.d = p0.getTime();
       uoeu.e = (int)p0.getAccuracy();
       uoeu.b = p0.getLatitude();
       uoeu.c = p0.getLongitude();
       uoeu.a = p1;
       uoeu.g = Integer.parseInt(p0.d());
       uoeu.h = p0.l();
       this.Q.b(uoeu);
       return;
    }
    public final boolean a(long p0){
       boolean b = true;
       if (this.O == null) {
          this.O = b;
          return false;
       }else if((fq.b() - p0) - 800 < 0){
          p0 = 0;
          if (fq.a(this.j)) {
             p0 = fq.a() - this.j.getTime();
          }
          if (p0 - 0x2710 <= 0) {
          label_0031 :
             return b;
          }
       }
       b = false;
       goto label_0031 ;
    }
    public final eo b(boolean p0,ei p1){
       bm d;
       String str = "FAIL";
       if (TextUtils.isEmpty(this.R)) {
          this.R = x.b(o.a(this.a)+","+o.h(this.a));
       }
       StringBuilder str1 = this.o+"#id:"+this.R;
       String str2 = "";
       eo uoeo = new eo(str2);
       ej uoej = null;
       long l = fq.b();
       this.k = l;
       p1.a(l);
       fj.c(this.a);
       ff uoff = this.n.a(this.a, this.m(), fj.a(), fj.b(), p0);
       uoff.b();
       String str3 = uoff.c();
       m.a(this.a);
       boolean b = (!TextUtils.isEmpty(str3) && str3.contains("dualstack"))? true: false;
       int a = fc.a;
       if (m.a() && (m.c() && b)) {
          a = fc.b;
       }
    label_0098 :
       if (!m.b()) {
          uoej = fc.a(this.a).a(uoff, a);
       }
       str3 = (a == fc.b)? "v6": "v4";
       p1.a(str3);
       bm uobm = this.n.a(uoff);
       long l1 = fq.b();
       if (!TextUtils.isEmpty(uoej)) {
          if (uobm.f == null) {
             fc.a(this.a).a(true, a);
          }else {
             fc.a(this.a).a(false, a);
             fc.a(this.a).a(a);
          }
       }
       str3 = "SUCCESS";
       if (uobm != null && !TextUtils.isEmpty(uoej)) {
          if (uobm.f == null) {
             p1.b(uoej);
             p1.c(str3);
          label_0102 :
             uoej = this.T;
             if (uoej != null) {
                uoej.d();
             }
             p1.b(l1);
             if (uobm != null) {
                if (!TextUtils.isEmpty(uobm.c)) {
                   str = this.o+"#csid:"+uobm.c;
                }
                d = uobm.d;
                uoeo.h(this.w);
             }else {
                d = str2;
             }
             eo uoeo1 = this.a(uoeo, uobm, p1);
             if (uoeo1 != null) {
                return uoeo1;
             }else {
                byte[] uobyteArray = ey.b(uobm.a);
                if (uobyteArray == null) {
                   uoeo.setErrorCode(5);
                   p1.f("#0503");
                   StringBuilder str4 = this.o+"解密数据失败#0503";
                   uoeo.setLocationDetail(this.o);
                   fo.a(d, 2053);
                   return uoeo;
                }else {
                   eo uoeo2 = this.f.a(uoeo, uobyteArray, p1);
                   if (!fq.a(uoeo2)) {
                      str1 = uoeo2.b();
                      this.L = str1;
                      int i = (!TextUtils.isEmpty(str1))? 2062: 2061;
                      fo.a(d, i);
                      uoeo2.setErrorCode(6);
                      str = "#0601";
                      p1.f(str);
                      ej to = this.o;
                      str1 = "location faile retype:"+uoeo2.d()+" rdesc:";
                      if (!TextUtils.isEmpty(this.L)) {
                         str2 = this.L;
                      }
                      StringBuilder str5 = to+str1+str2+str;
                      uoeo2.h(this.w);
                      uoeo2.setLocationDetail(this.o);
                      return uoeo2;
                   }else {
                      ej.c(uoeo2);
                      uoeo2.setOffset(this.q);
                      uoeo2.a(this.p);
                      uoeo2.f(String.valueOf(this.r));
                      uoeo2.e("new");
                      uoeo2.setLocationDetail(this.o);
                      this.E = uoeo2.a();
                      return uoeo2;
                   }
                }
             }
          }else {
             p1.b(uoej);
             p1.c(str);
          }
       }
       p1.d(str3);
       goto label_0102 ;
    }
    public final void b(){
       this.n = fe.a(this.a);
       this.i();
       if (this.b == null) {
          this.b = fq.a(this.a, "connectivity");
       }
       if (this.l == null) {
          this.l = new fh();
       }
       return;
    }
    public final void b(Context p0){
       if (!p0.checkCallingOrSelfPermission(x.c("EYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFQ1VSRV9TRVRUSU5HUw=="))) {
          this.m = true;
       }
       return;
    }
    public final void b(ei p0){
       if (this.x != null) {
          return;
       }
       this.q();
       if (this.t != null) {
          this.l();
       }
       this.c.b(this.t);
       this.g = this.c.e();
       this.d.a(true, this.p());
       String str = this.c(p0);
       this.N = str;
       if (!TextUtils.isEmpty(str)) {
          this.w = this.a(this.w);
       }
       this.x = true;
       return;
    }
    public final void b(eo p0){
       if (fq.a(p0)) {
          this.e.a(this.N, this.w, p0, this.a, true);
       }
       return;
    }
    public final String c(ei p0){
       String str2;
       String str3;
       String str5;
       ej o;
       StringBuilder str6;
       ej uoej = this;
       ei uoei = p0;
       int i = uoej.d.h();
       es uoes = uoej.d.e();
       es uoes1 = uoej.d.f();
       ej g = uoej.g;
       String str = 1;
       int i1 = 0;
       g = (g == null || g.isEmpty())? 1: null;
       String str1 = "";
       if (uoes == null && (uoes1 == null && g)) {
          if (uoej.b == null) {
             uoej.b = fq.a(uoej.a, "connectivity");
          }
          int i2 = 2132;
          int i3 = 18;
          if (fq.c() >= 31) {
             if (fq.a(uoej.a) && !uoej.c.l()) {
                uoej.z = i3;
                str2 = uoej.o+"飞行模式下关闭了WIFI开关，请关闭飞行模式或者打开WIFI开关#1802";
                fo.a(null, i2);
                uoei.f("#1802");
                return str1;
             }
          }else if(fq.a(uoej.a) && !uoej.c.k()){
             uoej.z = i3;
             str2 = uoej.o+"飞行模式下关闭了WIFI开关，请关闭飞行模式或者打开WIFI开关#1801";
             fo.a(null, i2);
             uoei.f("#1801");
             return str1;
          }
          str3 = "#1206";
          String str4 = "定位服务没有开启，请在设置中打开定位服务开关#1206";
          str5 = 28;
          if (fq.c() >= str5) {
             if (uoej.J == null) {
                uoej.J = uoej.a.getApplicationContext().getSystemService("location");
             }
             Object[] objArray = new Object[i1];
             if (!fm.a(uoej.J, "isLocationEnabled", objArray).booleanValue()) {
                uoej.z = 12;
                uoej.o+str4;
                uoei.f(str3);
                fo.a(null, 2121);
                return str1;
             }
          }
          if (!fq.e(uoej.a)) {
             uoej.z = 12;
             str2 = uoej.o+"定位权限被禁用,请授予应用定位权限#1201";
             uoei.f("#1201");
             fo.a(null, 2121);
             return str1;
          }else if(fq.c() >= 24 && (fq.c() < str5 && !Settings$Secure.getInt(uoej.a.getContentResolver(), "location_mode", i1))){
             uoej.z = 12;
             uoei.f(str3);
             uoej.o+str4;
             fo.a(null, 2121);
             return str1;
          }else {
             str2 = uoej.d.k();
             str3 = uoej.c.d();
             if (uoej.c.a(uoej.b) && str3 != null) {
                uoej.z = 12;
                uoei.f("#1202");
                uoej.o+"获取基站与获取WIFI的权限都被禁用，请在安全软件中打开应用的定位权限#1202";
                fo.a(null, 2121);
                return str1;
             }else if(str2 != null){
                uoej.z = 12;
                if (!uoej.c.k()) {
                   uoei.f("#1204");
                   o = uoej.o;
                   str2 = "WIFI开关关闭，并且获取基站权限被禁用，请在安全软件中打开应用的定位权限或者打开WIFI开关#1204";
                }else {
                   uoei.f("#1205");
                   o = uoej.o;
                   str2 = "获取的WIFI列表为空，并且获取基站权限被禁用，请在安全软件中打开应用的定位权限#1205";
                }
                o+str2;
                fo.a(null, 2121);
                return str1;
             }else if(!uoej.c.k() && !uoej.d.n()){
                uoej.z = 19;
                uoei.f("#1901");
                str6 = uoej.o+"没有检查到SIM卡，并且WIFI开关关闭，请打开WIFI开关或者插入SIM卡#1901";
                fo.a(null, 2133);
                return str1;
             }else if(!uoej.c.k()){
                uoei.f("#1301");
                o = uoej.o;
                str2 = "获取到的基站为空，并且关闭了WIFI开关，请您打开WIFI开关再发起定位#1301";
             }else {
                str2 = "#1302";
                uoei.f(str2);
                if (uoej.c.c() != null) {
                   str6 = uoej.o+"获取到的基站和WIFI信息均为空，请检查是否授予APP定位权限";
                   if (!fq.f(uoej.a)) {
                   label_01d0 :
                      str6 = uoej.o+"或后台运行没有后台定位权限";
                   }
                }else {
                   str6 = uoej.o+"获取到的基站和WIFI信息均为空，请移动到有WIFI的区域，若确定当前区域有WIFI，请检查是否授予APP定位权限";
                   if (!fq.f(uoej.a)) {
                      goto label_01d0 ;
                   }
                }
                o = uoej.o;
             }
             str6 = o+str2;
             uoej.z = 13;
             fo.a(null, 2131);
             return str1;
          }
       }else {
          WifiInfo wifiInfo = uoej.c.m();
          uoej.u = wifiInfo;
          uoej.v = ex.a(wifiInfo);
          str5 = "cgi";
          int i4 = 2;
          if (i) {
             if (i != str) {
                if (i != i4) {
                   uoej.z = 11;
                   fo.a(null, 2111);
                   uoei.f("#1101");
                   str6 = uoej.o+"get cgi failure#1101";
                }else if(uoes != null){
                   str6 = uoes.a+"#"+uoes.b+"#"+uoes.h+"#"+uoes.i+"#"+uoes.j+"#"+"network"+"#";
                   if (uoej.g.isEmpty() && uoej.v == null) {
                   label_0293 :
                      str6 = str6+str5;
                   label_0296 :
                      str1 = str6;
                   }
                }
             }else if(uoes != null){
                str6 = uoes.a+"#"+uoes.b+"#"+uoes.c+"#"+uoes.d+"#"+"network"+"#";
                if (uoej.g.isEmpty() && uoej.v == null) {
                }
             }
             str5 = "cgiwifi";
             goto label_0293 ;
          }else if(!uoej.g.isEmpty() || uoej.v != null){
             str2 = 1;
          }else {
             str2 = null;
          }
          str3 = (uoes1 != null)? 1: 0;
          int i5 = 2022;
          if (!str3) {
             i1 = 2021;
             if (uoej.v != null && uoej.g.isEmpty()) {
                uoej.z = i4;
                uoei.f("#0201");
                uoej.o+"当前基站为伪基站，并且WIFI权限被禁用，请在安全软件中打开应用的定位权限#0201";
                fo.a(null, i1);
                return str1;
             }else if(uoej.g.size() == str){
                uoej.z = i4;
                String str7 = "当前基站为伪基站，并且搜到的WIFI数量不足，请移动到WIFI比较丰富的区域#0202";
                str = "#0202";
                if (uoej.v == null) {
                   uoei.f(str);
                   uoej.o+str7;
                   fo.a(null, i5);
                   return str1;
                }else if(uoej.g.get(0).h != null){
                   uoei.f(str);
                   uoej.o+str7;
                   fo.a(null, i1);
                   return str1;
                }
             }
          }
          Object[] objArray1 = new Object[]{"network"};
          str = String.format(Locale.US, "#%s#", objArray1);
          if (str3) {
             str6 = uoes1.b();
             if (!uoej.g.isEmpty() || uoej.v != null) {
                str5 = "cgiwifi";
             }
             str6 = str6+"network"+"#";
             goto label_0293 ;
          }else if(str2 != null){
             str6 = str+"wifi";
             goto label_0296 ;
          }else {
             uoej.z = 2;
             if (!uoej.c.k()) {
                uoei.f("#0203");
                o = uoej.o;
                str2 = "当前基站为伪基站,并且关闭了WIFI开关，请在设置中打开WIFI开关#0203";
             }else {
                uoei.f("#0204");
                o = uoej.o;
                str2 = "当前基站为伪基站,并且没有搜索到WIFI，请移动到WIFI比较丰富的区域#0204";
             }
             str6 = o+str2;
             fo.a(null, 2022);
          }
          if (!TextUtils.isEmpty(str1)) {
             if (!str1.startsWith("#")) {
                str1 = "#"+str1;
             }
             str1 = fq.e()+str1;
          }
          return str1;
       }
    }
    public final void c(){
       if (this.A == null) {
          this.A = new eq(this.a);
       }
       this.l();
       this.c.b(false);
       this.g = this.c.e();
       this.d.a(false, this.p());
       this.e.a(this.a);
       this.b(this.a);
       this.y = true;
       return;
    }
    public final void d(){
       if ((this.o).length() > 0) {
          ej to = this.o;
          to.delete(0, to.length());
       }
       return;
    }
    public final void d(eo p0){
       if (p0 != null) {
          this.j = p0;
       }
       return;
    }
    public final void e(){
       this.E = null;
       this.x = false;
       this.y = false;
       ej te = this.e;
       if (te != null) {
          te.b(this.a);
       }
       te = this.D;
       if (te != null) {
          te.a();
       }
       if (this.f != null) {
          this.f = null;
       }
       te = this.Q;
       if (te != null) {
          te.a(this.H);
       }
       te = this.a;
       if (te != null) {
          ej th = this.h;
          if (th != null) {
             UniversalReceiver.f(te, th);
          }
       }
       this.h = null;
       te = this.d;
       if (te != null) {
          te.a(this.H);
       }
       te = this.c;
       if (te != null) {
          te.c(this.H);
       }
       te = this.g;
       if (te != null) {
          te.clear();
       }
       te = this.A;
       if (te != null) {
          te.f();
       }
       this.j = null;
       this.a = null;
       this.w = null;
       this.J = null;
       return;
    }
    public final void f(){
       ej tT = this.T;
       if (tT != null) {
          tT.d();
       }
       return;
    }
    public final void g(){
       ej ta = this.a;
       if (ta == null) {
          return;
       }
       if (this.T == null) {
          this.T = new ek(ta);
       }
       this.T.a(this.d, this.c, this.P);
       return;
    }
    public final void h(){
       ej tT = this.T;
       if (tT != null) {
          tT.a();
       }
       return;
    }
    public final void i(){
       if (this.n != null) {
          if (this.i == null) {
             this.i = new AMapLocationClientOption();
          }
          int i = this.j();
          ej tn = this.n;
          long httpTimeOut = this.i.getHttpTimeOut();
          boolean b = (this.i.getLocationProtocol().equals(AMapLocationClientOption$AMapLocationProtocol.HTTPS))? true: false;
          tn.a(httpTimeOut, b, i);
       }
       return;
    }
    public final int j(){
       int i = 2;
       int i1 = 1;
       if (this.i.getGeoLanguage() != null) {
          int i2 = ej$1.a[this.i.getGeoLanguage().ordinal()];
          if (i2 != i1) {
             if (i2 != i) {
                if (i2 == 3) {
                label_0024 :
                   return i;
                }
             }else {
                i = 1;
                goto label_0024 ;
             }
          }
       }
       i = 0;
       goto label_0024 ;
    }
    public final void k(){
       AMapLocationClientOption$GeoLanguage geoLanguage = this.i.getGeoLanguage();
       boolean b = this.i.isNeedAddress();
       boolean b1 = this.i.isOffset();
       boolean b2 = this.i.isLocationCacheEnable();
       this.t = this.i.isOnceLocationLatest();
       this.B = this.i.isSensorEnable();
       if (b1 == this.q && (b == this.p && (b2 != this.s || geoLanguage != this.r))) {
          this.r();
       }
       this.q = b1;
       this.p = b;
       this.s = b2;
       this.r = geoLanguage;
       return;
    }
    public final void l(){
       if (this.h == null) {
          this.h = new ej$a(this);
       }
       if (this.I == null) {
          IntentFilter intentFilter = new IntentFilter();
          this.I = intentFilter;
          intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
          this.I.addAction("android.net.wifi.SCAN_RESULTS");
       }
       UniversalReceiver.e(this.a, this.h, this.I);
       return;
    }
    public final byte[] m(){
       if (this.l == null) {
          this.l = new fh();
       }
       if (this.i == null) {
          this.i = new AMapLocationClientOption();
       }
       this.l.a(this.a, this.i.isNeedAddress(), this.i.isOffset(), this.d, this.c, this.b, this.E, this.Q);
       return this.l.a();
    }
    public final boolean n(){
       if (!this.k - null) {
          return true;
       }
       if ((fq.b() - this.k) - 0x4e20 > 0) {
          return true;
       }
       return false;
    }
    public final void o(){
       ej tc = this.c;
       if (tc == null) {
          return;
       }
       tc.a(this.m);
       return;
    }
    public final boolean p(){
       ArrayList uArrayList = this.c.e();
       this.g = uArrayList;
       boolean b = (uArrayList != null && uArrayList.size() > 0)? false: true;
       return b;
    }
    public final void q(){
       if (this.N != null) {
          this.N = null;
       }
       ej tw = this.w;
       if (tw != null) {
          tw.delete(0, tw.length());
       }
       return;
    }
    public final void r(){
       ej te = this.e;
       if (te != null) {
          te.a();
       }
       this.d(null);
       this.O = false;
       te = this.D;
       if (te != null) {
          te.a();
       }
       return;
    }
}
