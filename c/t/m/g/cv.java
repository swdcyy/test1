package c.t.m.g.cv;
import android.util.SparseArray;
import java.lang.Object;
import java.util.HashMap;
import c.t.m.g.ei;
import c.t.m.g.p;
import c.t.m.g.cv$1;
import c.t.m.g.ce;
import com.tencent.map.geolocation.TencentLocationRequest;
import c.t.m.g.cv$b;
import c.t.m.g.cf;
import java.lang.String;
import com.tencent.map.geolocation.TencentLocationManagerOptions;
import java.lang.CharSequence;
import android.text.TextUtils;
import c.t.m.g.ed;
import java.lang.Throwable;
import android.content.Context;
import c.t.m.g.cd;
import java.lang.StringBuilder;
import c.t.m.g.da;
import java.util.concurrent.CopyOnWriteArrayList;
import c.t.m.g.cw;
import c.t.m.g.cz;
import c.t.m.g.ct;
import c.t.m.g.cp;
import c.t.m.g.dc;
import c.t.m.g.cx;
import c.t.m.g.cu;
import c.t.m.g.ef;
import c.t.m.g.dj;
import c.t.m.g.dv;
import android.os.Looper;
import com.tencent.map.geolocation.TencentLocationListener;
import c.t.m.g.dh;
import c.t.m.g.b;
import java.util.List;
import java.lang.System;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.util.SoUtils;
import java.lang.Integer;
import java.lang.IllegalStateException;
import c.t.m.g.dy;
import c.t.m.g.em;
import android.os.Message;
import android.os.Handler;
import android.os.Bundle;
import c.t.m.g.cv$a;
import android.os.HandlerThread;
import c.t.m.g.dz;
import java.lang.Math;
import c.t.m.g.ej;
import c.t.m.g.df;
import java.util.Collections;
import android.net.wifi.WifiManager;
import java.util.Locale;
import java.lang.Float;
import c.t.m.g.dg;
import c.t.m.g.cs;
import android.location.Location;
import c.t.m.g.dv$a;
import android.net.wifi.ScanResult;
import java.lang.Thread;
import c.t.m.g.cv$c;
import java.lang.Long;
import c.t.m.g.q;
import c.t.m.g.cb;
import java.lang.Boolean;
import c.t.m.g.bg;
import c.t.m.g.aw;
import c.t.m.g.cr;
import c.t.m.g.c;
import c.t.m.g.cv$2;
import java.lang.Runnable;
import c.t.m.g.ax;
import c.t.m.g.cg;
import c.t.m.g.d;
import java.lang.Enum;
import java.util.ArrayList;
import c.t.m.g.ee;
import android.os.Parcelable;

public class cv	// class@000c2a
{
    public long A;
    public boolean B;
    public long C;
    public int D;
    public TencentLocation E;
    public long F;
    public final Object G;
    public final TencentLocationRequest H;
    public dv I;
    public double J;
    public double K;
    public dv L;
    public int M;
    public long N;
    public cv$b O;
    public String P;
    public b Q;
    public cd R;
    public boolean S;
    public boolean T;
    public final byte[] U;
    public String V;
    public int W;
    public int c;
    public cv$a d;
    public cv$c e;
    public Handler f;
    public boolean g;
    public cr h;
    public cx i;
    public boolean j;
    public cu k;
    public dc l;
    public ct m;
    public cp n;
    public cw o;
    public cz p;
    public int q;
    public da r;
    public df s;
    public dj t;
    public dj u;
    public dg v;
    public final ce w;
    public cf x;
    public TencentLocationListener y;
    public List z;
    public static SparseArray a;
    public static final TencentLocationListener b;

    static {
       SparseArray sparseArray = new SparseArray();
       cv.a = sparseArray;
       sparseArray.put(0, "OK");
       cv.a.put(1, "ERROR_NETWORK");
       cv.a.put(2, "ERROR_NOCELL&WIFI_LOCATIONSWITCHOFF");
       cv.a.put(4, "DEFLECT_FAILED");
       cv.a.put(404, "ERROR_SERVER_NOT_LOCATION");
       p.a(ei.a());
       cv.b = new cv$1();
    }
    public void cv(ce p0){
       super();
       int i = 1;
       this.c = i;
       this.A = 0;
       this.B = false;
       this.C = 0;
       this.D = 0;
       this.G = new Object();
       this.H = TencentLocationRequest.create();
       this.M = 404;
       this.O = cv$b.d;
       b uob = null;
       this.Q = uob;
       this.R = uob;
       this.S = false;
       this.T = false;
       byte[] uobyteArray = new byte[false];
       this.U = uobyteArray;
       this.V = "";
       this.W = -1;
       this.q = 0;
       this.w = p0;
       this.x = p0.h();
       if (!TextUtils.isEmpty(TencentLocationManagerOptions.getKey())) {
          this.x.f(TencentLocationManagerOptions.getKey());
       }
    label_0066 :
       cd.a(this.w.a, "7.3.7.0.official_1-210910");
       String str = this.x.h();
       String str1 = this.a(str);
       this.P = str1;
       if (TextUtils.isEmpty(str1)) {
          if (ed.a) {
             ed.b("TxLocationManagerImpl", "requestLocationUpdates: illegal key ["+str+"]");
          }
          this.q = 2;
          return;
       }else {
          this.w.a(this);
          this.r = new da(10, 4);
          this.z = new CopyOnWriteArrayList();
          this.o = new cw(this.w);
          this.p = cz.a(this.w);
          ct uoct = ct.a(p0.a);
          try{
             this.m = uoct;
             this.n = new cp(this.w.a);
          }catch(java.lang.Exception e0){
             this.n = uob;
          }
          this.j = e0;
          this.h = uob;
          dc uodc = this.t();
          this.l = uodc;
          cx uocx = this.s();
          this.i = uocx;
          Object[] objArray = new Object[e0];
          cu uocu = this.q();
          this.k = uocu;
          objArray[0] = uocu;
          this.g = ef.a(uodc, uocx, objArray);
          if (this.g != null) {
             this.q = e0;
             return;
          }else {
             p.a(this.w.a, "txsdk", "7.3.7.0.official_1");
             p.a(this.P);
             return;
          }
       }
    }
    public static int a(cv p0,int p1){
       p0.D = p1;
       return p1;
    }
    public static long a(cv p0,long p1){
       p0.N = p1;
       return p1;
    }
    public static ce a(cv p0){
       return p0.w;
    }
    public static cv$b a(cv p0,cv$b p1){
       p0.O = p1;
       return p1;
    }
    public static dj a(cv p0,dj p1){
       p0.u = p1;
       return p1;
    }
    public static void a(cv p0,int p1,dv p2){
       p0.a(p1, p2);
    }
    public static void a(cv p0,Looper p1){
       p0.a(p1);
    }
    public static void a(cv p0,dv p1){
       p0.a(p1);
    }
    public static void a(cv p0,dv p1,int p2,int p3){
       p0.a(p1, p2, p3);
    }
    public static boolean a(cv p0,boolean p1){
       p0.T = p1;
       return p1;
    }
    public static long b(cv p0,long p1){
       p0.F = p1;
       return p1;
    }
    public static dj b(cv p0,dj p1){
       p0.t = p1;
       return p1;
    }
    public static dv b(cv p0,dv p1){
       p0.L = p1;
       return p1;
    }
    public static Object b(cv p0){
       return p0.G;
    }
    public static long c(cv p0,long p1){
       p0.A = p1;
       return p1;
    }
    public static TencentLocationListener c(cv p0){
       return p0.y;
    }
    public static cv$b d(cv p0){
       return p0.O;
    }
    public static SparseArray e(){
       return cv.a;
    }
    public static TencentLocationRequest e(cv p0){
       return p0.H;
    }
    public static long f(cv p0){
       return p0.C;
    }
    public static dv g(cv p0){
       return p0.I;
    }
    public static int h(cv p0){
       return p0.M;
    }
    public static boolean i(cv p0){
       return p0.m();
    }
    public static long j(cv p0){
       return p0.F;
    }
    public static boolean k(cv p0){
       return p0.S;
    }
    public static long l(cv p0){
       return p0.N;
    }
    public static int m(cv p0){
       return p0.c;
    }
    public static dh n(cv p0){
       return p0.p();
    }
    public static String o(cv p0){
       return p0.P;
    }
    public static cz p(cv p0){
       return p0.p;
    }
    public static boolean q(cv p0){
       return p0.T;
    }
    public static b r(cv p0){
       return p0.Q;
    }
    public static int s(cv p0){
       return p0.D;
    }
    public static boolean t(cv p0){
       return p0.n();
    }
    public static cf u(cv p0){
       return p0.x;
    }
    public static List v(cv p0){
       return p0.z;
    }
    public static cu w(cv p0){
       return p0.k;
    }
    public int a(TencentLocationRequest p0,TencentLocationListener p1,Looper p2){
       if (this.q != null) {
          return this.q;
       }
       this.l();
       this.M = 404;
       this.I = null;
       cv tG = this.G;
       _monitor_enter(tG);
       this.y = p1;
       _monitor_exit(tG);
       TencentLocationRequest.copy(this.H, p0);
       if (this.H.isIndoorLocationMode()) {
          this.D = 1;
       }
       cv tx = this.x;
       if (tx != null) {
          tx.a(System.currentTimeMillis());
          if ((this.x.c()).equals(this.x.b())) {
             this.w.a();
          }
          this.x.e(p0.getQQ());
          this.x.d(p0.getSmallAppKey());
          this.x.a(p0.getInterval(), this.H.isIndoorLocationMode());
       }
       this.C = p0.getInterval();
       this.O = cv$b.a;
       this.a(p2);
       if (ed.a) {
          ed.a("TxLocationManagerImpl", "requestLocationUpdates request:"+this.H.toString());
       }
       return 0;
    }
    public TencentLocation a(){
       if (this.M != null) {
          return null;
       }
       this.a(this.I);
       return this.I;
    }
    public final String a(String p0){
       try{
          String str = ",";
          String str1 = "";
          String str2 = "hh";
          if (p0.contains(str)) {
             String[] stringArray = p0.split(str);
             if (ed.a) {
                ed.a(str2, "fun_w");
             }
             int i = 1;
             if (stringArray == null || (stringArray.length <= i || (stringArray[0] == null || (stringArray[i] == null || SoUtils.fun_w(stringArray[0], stringArray[i]) <= 0)))) {
                i = 0;
             }
             if (i) {
                str1 = stringArray[0];
             }
             return str1;
          }else if(ed.a){
             ed.a(str2, "fun_v");
          }
          int i1 = SoUtils.fun_v(p0);
          if (i1 >= 0) {
             str1 = Integer.toString(i1);
          }
          return str1;
       }catch(java.lang.UnsatisfiedLinkError e0){
          return null;
       }
    }
    public void a(int p0){
       if (this.c == p0) {
          return;
       }
       cv tG = this.G;
       _monitor_enter(tG);
       if (ef.b(this.y)) {
          throw new IllegalStateException("removeUpdates MUST called before set coordinate type!");
       }
       _monitor_exit(tG);
       this.c = p0;
       return;
    }
    public final void a(int p0,int p1,int p2){
       String str = "location permission denied";
       String str1 = "gps";
       String str2 = null;
       String str3 = "unknown";
       switch (p1){
           case 0x2ee1:
             int i = 5;
             if (p2) {
                if (p2 != 1) {
                   if (p2 == i) {
                      str3 = "location service switch is off";
                   }
                }else {
                   str3 = "wifi enabled";
                }
             }else {
                str3 = "wifi disabled";
             }
             if (p2 != i && em.a) {
                str1 = "wifi";
             label_002e :
                p2 = 2;
             }else {
                str = str3;
                str1 = "wifi";
             }
             break;
           case 0x2ee2:
             if (p2) {
                if (p2 != 1) {
                label_0037 :
                   str = str3;
                }else {
                   str = "gps enabled";
                }
             }else {
                str = "gps disabled";
             }
             break;
           case 0x2ee3:
             if (p2 == 1) {
                str3 = "cell enabled";
             }else if(!p2){
                str3 = "cell disabled";
             }
             if (dy.a) {
                str1 = "cell";
                goto label_002e ;
             }else {
                str = str3;
                str1 = "cell";
             }
             break;
           case 0x2ee4:
             if (p2 != 3) {
                if (p2 != 4) {
                   goto label_0037 ;
                }else {
                   str = "gps unavailable";
                }
             }else {
                str = "gps available";
             }
             break;
           default:
             str = str2;
             str1 = str;
       }
       str2 = "s:";
       if (p1 == 0x2ee4) {
          if (this.W != p2) {
             cd.c().a(str1, str2+p2);
          }
          this.W = p2;
       }else {
          cd.c().a(str1, str2+p2);
       }
       if (ed.a) {
          ed.a("TxLocationManagerImpl", "onStatusChanged: "+str);
       }
       cv te = this.e;
       if (te != null) {
          Message message = te.obtainMessage(3102);
          Bundle data = message.getData();
          if (data == null) {
             data = new Bundle();
          }
          data.clear();
          data.putString("name", str1);
          data.putInt("status", p2);
          data.putString("desc", str);
          message.setData(data);
          message.sendToTarget();
       }
       return;
    }
    public final void a(int p0,long p1){
       if (this.d == null) {
          if (ed.a) {
             ed.b("TxLocationManagerImpl", "mHandler is null delayed");
          }
          this.d = new cv$a(this, this.w.j().getLooper());
       }
       this.d.removeMessages(p0);
       this.d.sendEmptyMessageDelayed(p0, p1);
       return;
    }
    public final void a(int p0,dv p1){
       StringBuilder str1;
       cv uocv = this;
       int i = p0;
       dv uodv = p1;
       if (!uodv) {
          return;
       }
       boolean b = false;
       float f = 0;
       if (!i && (p1.getLatitude() - f && p1.getLongitude() - f)) {
          int i1 = (uocv.c == 1 && dz.a(p1.getLatitude(), p1.getLongitude()))? 1: 0;
          dv.a(uodv, i1);
       }
    label_0037 :
       String str = null;
       int i2 = 0x459c4000;
       if (this.m()) {
          if (p1.getAccuracy() - i2 < 0 && p1.getAccuracy() - str > 0) {
             uocv.r.a(uodv);
             if (uocv.B != null) {
                uocv.E = uodv;
             }
          }
          uocv.J = p1.getLatitude();
          uocv.K = p1.getLongitude();
          if (ef.b(uocv.y)) {
             this.h();
          }
       }else if(!i && (p1.getLatitude() - f && p1.getLongitude() - f)){
          double d = 0.00f;
          if (Math.abs((p1.getLatitude() - uocv.J)) - d >= 0 && Math.abs((p1.getLongitude() - uocv.K)) - d >= 0) {
             if (!uocv.r.a(uodv, uocv.w, uocv.k.d())) {
                if (ed.a) {
                   ed.a("TxLocationManagerImpl", "discard "+uodv);
                }
                return;
             }else {
                uocv.J = p1.getLatitude();
                uocv.K = p1.getLongitude();
                if (p1.getAccuracy() - i2 < 0 && p1.getAccuracy() - str > 0) {
                   uocv.r.a(uodv);
                   uocv.r.a(uodv);
                   if (uocv.B != null) {
                      cv e = uocv.E;
                      if (e != null) {
                         double d1 = ej.a(e.getLatitude(), uocv.E.getLongitude(), p1.getLatitude(), p1.getLongitude());
                         if (!(p1.getProvider()).equalsIgnoreCase("network") || (d1 - 0x4024000000000000 > 0 || ((p1.getProvider()).equalsIgnoreCase("gps") && d1 - 0x4008000000000000 > 0))) {
                            uocv.E = uodv;
                         }
                      }else {
                         uocv.E = uodv;
                      }
                   }
                }
             }
          }
       }
       f = (uocv.M != null && !i)? 1: 0;
       uocv.M = i;
       uocv.I = uodv;
       if (ed.a) {
          ed.a("TxLocationManagerImpl", "mLastLocation location:"+uocv.I.toString());
       }
       if (!uocv.H.getInterval() && ef.b(uocv.y)) {
          if (ed.a) {
             str1 = "mHandler is null? ";
             if (uocv.d == null) {
                b = true;
             }
             ed.b("TxLocationManagerImpl", str1+b);
          }
          uocv.b(0x2ede);
       }else if(f && ef.b(uocv.y)){
          if (ed.a) {
             str1 = "mHandler is null? ";
             if (uocv.d == null) {
                b = true;
             }
             ed.b("TxLocationManagerImpl", str1+b);
          }
          uocv.b(0x2ede);
       }
       return;
    }
    public final void a(Looper p0){
       if (ed.a) {
          ed.b("TxLocationManagerImpl", "restartProviders in");
       }
       cv tU = this.U;
       _monitor_enter(tU);
       if (ed.a) {
          ed.b("TxLocationManagerImpl", "restartProviders in got lock");
       }
       this.b(p0);
       this.k();
       this.f();
       _monitor_exit(tU);
       return;
    }
    public final void a(df p0){
       int i;
       String str1;
       String str3;
       this.s = p0;
       long l = Math.max(this.H.getInterval(), 0x4e20);
       List list = Collections.emptyList();
       String str = "TxLocationManagerImpl";
       if (this.S == null) {
          i = this.o();
          if (i != 1) {
             cv tw = this.w;
             if (tw != null) {
                list = em.c(tw.c());
                if (!list.size() && ed.a) {
                   ed.a(str, "Wi-Fi List is 0, status:"+i);
                }
             }
          }
       }else {
          i = 1;
       }
       if (i != 1 && list.size()) {
          cv tF = this.F;
          if (tF - -1 && (tF - null <= 0 || (System.currentTimeMillis() - this.F) - l <= 0)) {
          label_00a5 :
             if (ed.a) {
                ed.b(str, "cell change run prepare json,because status:"+i+",mLastWF:"+this.F+",current:"+System.currentTimeMillis());
             }
             if (p0 != null) {
                String str2 = ",";
                str1 = p0.d+str2+p0.f;
                if (!(this.V).equals(str1)) {
                   str2 = "cell:"+p0.b+str2+p0.c+str2+p0.d+str2+p0.f+str2+p0.e+str2;
                   i = Integer.MAX_VALUE;
                   if (p0.g != i && p0.h != i) {
                      Object[] objArray = new Object[]{Float.valueOf(((float)p0.g / 14400.00f)),Float.valueOf(((float)p0.h / 14400.00f))};
                      str3 = str2+String.format(Locale.ENGLISH, "%.6f,%.6f", objArray);
                   }else {
                      str3 = str2+"-1,-1";
                   }
                   cd.c().a("CELL", str3);
                   this.V = str1;
                }
             }
             return;
          }
       }
       cd.c().a("CELL", "cell req");
       if (ed.a) {
          str1 = "mHandler is null? ";
          boolean b = (this.d == null)? true: false;
          ed.b(str, str1+b);
       }
       if (ed.a) {
          ed.a(str, "onCellChanged: --> prepare json");
       }
       this.b(3999);
       goto label_00a5 ;
    }
    public final void a(dg p0){
       double doublex;
       double doublex1;
       dv uodv;
       if (p0.a == cs.b) {
          return;
       }
       this.v = p0;
       cv tc = this.c;
       int requestLevel = this.H.getRequestLevel();
       cv tL = this.L;
       Location location = new Location(p0.a);
       Bundle extras = location.getExtras();
       String str = null;
       if (extras != null) {
          doublex = extras.getDouble("lat");
          doublex1 = extras.getDouble("lng");
       }else {
          doublex = str;
          doublex1 = doublex;
       }
       if (ed.a) {
          ed.a("TxLocationManagerImpl", "ongpschanged location extras:"+doublex+","+doublex1);
       }
       if (!doublex - str && !doublex1 - str) {
          cd.c().a("g", "defl error");
          return;
       }else if(ej.a(tc)){
          uodv = new dv$a().a(tL).b("gps").a(requestLevel).a(new Location(p0.a)).a();
          location.setLatitude(doublex);
          location.setLongitude(doublex1);
          uodv.a(location);
       }else if(this.m()){
          if (ed.a) {
             StringBuilder str2 = "mHandler is null? ";
             boolean b = (this.d == null)? true: false;
             ed.b("TxLocationManagerImpl", str2+b);
          }
          this.b(3999);
       }
       uodv = new dv$a().a(tL).b("gps").a(requestLevel).a(new Location(p0.a)).a();
       location.setLatitude(doublex);
       location.setLongitude(doublex1);
       uodv.a(location);
       if (ed.a) {
          ed.a("TxLocationManagerImpl", "ongpschanged location:"+uodv.getLatitude()+","+uodv.getLongitude());
       }
       String str1 = "UPDATE_LOCATION";
       if (ed.a) {
          ed.a(str1, "ongpschanged updateLastLocation: mIndoorLocationStatus: "+this.D+", beforeFirstFix: "+this.m());
       }
       if (this.D != 2) {
          this.a(0, uodv);
          if (ed.a) {
             ed.a(str1, "ongpschanged updateLastLocation:"+uodv.getLatitude()+","+uodv.getLongitude());
          }
       }
       this.a(0x32c7, 0x2ee4, 3);
       return;
    }
    public final void a(dj p0){
       StringBuilder str;
       boolean b = true;
       if (ed.a) {
          str = "onWifiChanged mHandler is null? ";
          boolean b1 = (this.d == null)? true: false;
          ed.b("TxLocationManagerImpl", str+b1);
       }
       cv tu = this.u;
       boolean b2 = (tu != null)? tu.a(p0): false;
       if (b2) {
          this.F = System.currentTimeMillis();
       }
       List list = (p0 == null)? Collections.emptyList(): p0.c();
       StringBuilder str1 = "len:"+list.size()+",sim:";
       String str2 = (b2)? "1": "0";
       String str3 = str1+str2;
       int i = 0;
       int i1 = 3;
       while (i < Math.min(i1, list.size())) {
          ScanResult scanResult = list.get(i);
          str3 = str3+','+(scanResult.BSSID).replaceAll(":", "")+'_'+scanResult.level;
          i = i + 1;
       }
       cd.c().a("WIFI", str3);
       if (ed.a) {
          ed.b("TxLocationManagerImpl", "mIndoorLocationStatus"+this.D);
       }
       if (this.t != null && (this.D != 2 && (p0 != dj.a && (this.F - -1 && (p0.c().size() < i1 || !b2))))) {
          if (ed.a) {
             ed.a("TxLocationManagerImpl", "onWifiChanged: --> prepare json");
          }
          cd.c().a("WIFI", "wifi req");
          if (ed.a) {
             str = "mHandler is null? ";
             if (this.d != null) {
                b = false;
             }
             ed.b("TxLocationManagerImpl", str+b);
          }
          this.b(3999);
       }
       this.t = p0;
       return;
    }
    public final void a(dv p0){
       try{
          if (p0 != null) {
             if (this.m != null && this.H.isAllowDirection()) {
                p0.getExtra().putDouble("direction", this.m.b());
             }
             p0.getExtra().putAll(this.H.getExtras());
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final void a(dv p0,int p1,int p2){
       if (p0 == null || this.e == null) {
          cd.c().a("G", "user handler is null or loc is null");
          return;
       }else if(ed.a){
          ed.a("TxLocationManagerImpl", "processLocationChanged location:"+p0.getLatitude()+","+p0.getLongitude());
       }
       Message message = this.e.obtainMessage(p2);
       message.arg1 = p1;
       message.obj = p0;
       message.sendToTarget();
       if (this.e.getLooper() != null && (this.e.getLooper().getThread() == null || !this.e.getLooper().getThread().isAlive())) {
          cd.c().a("U", p1+",user thread is invalid");
       }
       return;
    }
    public void a(TencentLocationListener p0){
       cv tU = this.U;
       _monitor_enter(tU);
       this.k();
       cv td = this.d;
       if (td != null) {
          td.a();
          if (ed.a) {
             ed.b("TxLocationManagerImpl", "mHandler set null");
          }
          this.d = null;
       }
    label_0028 :
       _monitor_exit(tU);
       td = this.G;
       _monitor_enter(td);
       this.y = null;
       tU = this.z;
       if (tU != null) {
          tU.clear();
       }
       _monitor_exit(td);
       this.l();
       this.j();
       return;
    }
    public int b(TencentLocationRequest p0,TencentLocationListener p1,Looper p2){
       if (this.q != null) {
          return this.q;
       }
       if (p1 != null) {
          cv tz = this.z;
          if (tz != null) {
             tz.add(p1);
          }
       }
       int i = 0;
       if ((System.currentTimeMillis() - this.A) - 2000 < 0) {
          if (ed.a) {
             ed.b("TxLocationManagerImpl", "is running,and in 2s,so we add list,then return");
          }
          return i;
       }else {
          this.A = System.currentTimeMillis();
          if (this.z != null && (this.M == null && (this.I != null && (this.x.k() && (!(this.I.getProvider()).equals("gps") || ((System.currentTimeMillis() - this.I.getTime()) - 0x15f90 <= 0 || ((this.I.getProvider()).equals("network") && (System.currentTimeMillis() - this.I.getTime()) - 0x7530 <= 0))))))) {
             this.a(this.I, this.M, 3103);
             if (ed.a) {
                ed.b("TxLocationManagerImpl", "cache hit");
             }
             this.A = 0;
             return i;
          }else if(this.O == cv$b.a){
             if (ed.a) {
                ed.b("TxLocationManagerImpl", "conninus callback is running,send single prapare");
             }
             this.b(3997);
             if (ed.a) {
                StringBuilder str = "mHandler is null? ";
                boolean b = (this.d == null)? true: false;
                ed.b("TxLocationManagerImpl", str+b);
             }
             return i;
          }else if(ed.a){
             ed.b("TxLocationManagerImpl", "no continus callback, start all provider");
          }
          if (p0 != null) {
             p0.setSmallAppKey(p0.getSmallAppKey()).setInterval(0);
          }else {
             p0 = TencentLocationRequest.create().setInterval(0);
          }
          this.O = cv$b.c;
          return this.a(p0, cv.b, p2);
       }
    }
    public final void b(int p0){
       if (this.d == null) {
          if (ed.a) {
             ed.b("TxLocationManagerImpl", "mHandler is null");
          }
          this.d = new cv$a(this, this.w.j().getLooper());
       }
       this.d.sendEmptyMessage(p0);
       return;
    }
    public final void b(Looper p0){
       if (Looper.myLooper() == null) {
          Looper.prepare();
       }
       if (ef.a(this.e) || this.e.getLooper() != p0) {
          this.e = new cv$c(this, p0);
       }
       this.e.removeCallbacksAndMessages(null);
       cv tf = this.f;
       if (tf == null || tf.getLooper() != Looper.getMainLooper()) {
          this.f = new Handler(Looper.getMainLooper());
       }
       return;
    }
    public boolean b(){
       this.D = 1;
       cd.c().a("LOC", "start indoor");
       return 1;
    }
    public boolean c(){
       if (this.D > null) {
          if (ef.b(this.l)) {
             this.l.a(this.x.n());
          }
          if (ef.b(Long.valueOf(this.C))) {
             this.C = this.H.getInterval();
          }
          this.D = 0;
       }
       cd.c().a("LOC", "stop indoor");
       return true;
    }
    public int d(){
       return this.c;
    }
    public final void f(){
       boolean b4;
       cv td = this.d;
       if (td == null) {
          this.d = new cv$a(this, this.w.j().getLooper());
          if (ed.a) {
             ed.b("TxLocationManagerImpl", "new mHandler");
          }
       }else {
          td.a();
          if (ed.a) {
             ed.b("TxLocationManagerImpl", "mHandler != null");
          }
       }
       boolean b = true;
       if (q.a().d("deny_secret_info")) {
          cb.a(b);
       }
       boolean b1 = this.g();
       boolean b2 = (cv$b.b == this.O)? true: false;
       cv td1 = this.d;
       if (ed.a) {
          StringBuilder str = "startupProviders start mHandler is null? ";
          boolean b3 = (this.d == null)? true: false;
          ed.b("TxLocationManagerImpl", str+b3);
       }
       cd uocd = cd.c();
       this.R = uocd;
       if (uocd != null && !b2) {
          b4 = bg.b("CONF_USER_DEBUGGABLE", Boolean.FALSE).booleanValue();
          this.R.a(b4);
          if (b4) {
             this.R.e();
             this.R.a("LOC", "request {interval: "+this.H.getInterval()+", level: "+this.H.getRequestLevel()+", gps: "+this.H.isAllowGPS()+", direct: "+this.H.isAllowDirection()+"}");
          }
       }
       this.p.a(td1, b2);
       if (this.j != null) {
          if (b1 && (ef.b(this.i) && ef.b(td1))) {
             this.i.a(td1, b2);
          }
       }else if(b1 && (ef.b(this.h) && ef.b(td1))){
          this.h.a(td1);
       }
       if (b1 && (ef.b(this.l) && ef.b(td1))) {
          this.l.a(this.x.n());
          this.l.a(td1, this.e, this.f, b2);
       }
    label_0135 :
       if (ef.b(this.k) && (this.H.isAllowGPS() && ef.b(td1))) {
          td = this.k;
          b4 = (this.c == b)? true: false;
          td.a(b4);
          this.k.a(td1, this.e, this.f, b2);
       }
    label_0160 :
       b uob = null;
       if (!b2) {
          if (!q.a().d("collect_bles")) {
             this.n = uob;
          }
          if (ef.b(this.n) && ef.b(td1)) {
             this.n.a(td1);
          }
          if (ef.b(td1)) {
             this.o.a(td1);
          }
          if (ef.b(this.m) && (this.H.isAllowDirection() && ef.b(td1))) {
             this.m.a(td1);
          }
       }
    label_01ab :
       if (td1 != null) {
          td1.sendEmptyMessageDelayed(3991, 0x2710);
       }
       if (ef.b(td1)) {
          b4 = q.a().b("f_coll_item");
          this.Q = (b4 == b || (b4 == 2 && this.Q == null))? new b(this.w.a): uob;
          if (this.Q != null && td1 != null) {
             if (ed.a) {
                ed.a("TxLocationManagerImpl", "fc,set:"+b4+",daemon:"+b2+",version:"+b.c());
             }
             if (b4 == 2 || (b4 == b && !b2)) {
                this.Q.a(this.i());
                this.Q.a("D_UP_NET", q.a().e("f_coll_up_net"));
                this.Q.a("D_UP_U_TRACK_INFO", Boolean.toString(b));
                this.Q.a(td1.getLooper());
             }
          }
       }
    label_0241 :
       if (ed.a) {
          StringBuilder str1 = "startupProviders end mHandler is null? ";
          if (this.d != null) {
             b = false;
          }
          ed.b("TxLocationManagerImpl", str1+b);
       }
       return;
    }
    public final boolean g(){
       Bundle extras = this.H.getExtras();
       boolean b = true;
       if (extras != null) {
          b = extras.getBoolean("use_network", b);
       }
       return b;
    }
    public final void h(){
       if (this.H.getInterval() > 0) {
          this.a(0x2edf, this.H.getInterval());
       }
       return;
    }
    public final c i(){
       cf uocf = this.w.h();
       String str = uocf.j();
       return new c(str, "7.3.7.0.official_1", uocf.p());
    }
    public final void j(){
       if (!q.a().d("start_daemon")) {
          if (ed.a) {
             ed.b("TxLocationManagerImpl", "cloud daemon is false");
          }
          this.O = cv$b.d;
          return;
       }else if(this.O == cv$b.a && (em.c(this.w)).equalsIgnoreCase("{}")){
          new Handler(this.w.j().getLooper()).postDelayed(new cv$2(this), 5000);
          this.N = System.currentTimeMillis();
       }else if(ed.a){
          ed.b("TxLocationManagerImpl", "daemon not start! is wifi or running status="+this.O);
       }
       this.O = cv$b.d;
       return;
    }
    public final void k(){
       dy.a = false;
       if (ef.b(this.o)) {
          this.o.a();
       }
       if (ef.b(this.p)) {
          this.p.a();
       }
       if (ef.b(this.r)) {
          this.r.a();
       }
       if (ef.b(this.l)) {
          this.l.a();
       }
       if (this.j != null) {
          if (ef.b(this.i)) {
             this.i.a();
          }
       }else if(ef.b(this.h)){
          this.h.a();
       }
       if (ef.b(this.k)) {
          this.k.b();
       }
       if (ef.b(this.m) && this.H.isAllowDirection()) {
          this.m.a();
       }
       if (ef.b(this.n)) {
          this.n.a();
       }
       cv tQ = this.Q;
       if (tQ != null) {
          tQ.a();
          this.Q = null;
       }
       tQ = this.R;
       if (tQ != null) {
          tQ.g();
          this.R = null;
       }
       try{
          p.c().g();
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final void l(){
       this.D = 0;
       this.t = null;
       this.s = null;
       this.v = null;
       this.L = null;
       this.F = 0;
       dh.a = 0;
       this.S = false;
       this.O = cv$b.d;
       this.A = 0;
       this.T = false;
       cg uocg = this.w.a("cell");
       if (uocg != null) {
          uocg.a();
       }
       cv tx = this.x;
       if (tx != null) {
          tx.i("");
          this.x.c(0);
          this.x.b(0);
          this.x.a(0);
       }
       return;
    }
    public final boolean m(){
       boolean b = (this.M == 404)? true: false;
       return b;
    }
    public final boolean n(){
       cv tk = this.k;
       boolean b = false;
       if (tk != null && (tk.d() && this.k.c())) {
          b = true;
       }
    label_0015 :
       if (!b && ed.a) {
          ed.b("TxLocationManagerImpl", "isGpsValid: provider="+b);
       }
       return b;
    }
    public final int o(){
       cv tl = this.l;
       int i = (tl != null)? tl.b(): 1;
       if (i) {
          this.t = null;
       }
       return i;
    }
    public void onCellInfoEvent(df p0){
       if (ed.a) {
          ed.a("TxLocationManagerImpl", "onCellInfoEvent");
       }
       this.a(p0);
       if (this.Q != null) {
          d uod = new d(p0.b, p0.c, p0.d, p0.f, p0.e, p0.a.ordinal());
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(v0);
          this.Q.a(v0, uArrayList);
       }
       return;
    }
    public void onGpsInfoEvent(dg p0){
       if (ed.a) {
          ed.a("TxLocationManagerImpl", "onGpsInfoEvent");
       }
       this.a(p0);
       cv tQ = this.Q;
       if (tQ != null) {
          tQ.a(p0.a);
       }
       return;
    }
    public void onNetworkEvent(Integer p0){
       String str = ee.c(this.w.a);
       int i = p0.intValue();
       if (i != -1) {
          if (i) {
             if (i == 1) {
                if (ed.a) {
                   ed.a("TxLocationManagerImpl", "onNetworkEvent: "+str+" connected");
                }
                this.a(7999, 1000);
             }
          }else if(ed.a){
             ed.a("TxLocationManagerImpl", "onNetworkEvent: "+str+" disconnected");
          }
       }else if(ed.a){
          ed.a("TxLocationManagerImpl", "onNetworkEvent: networks not found");
       }
       return;
    }
    public void onStatusEvent(Message p0){
       this.a(p0.what, p0.arg1, p0.arg2);
    }
    public void onWifiInfoEvent(dj p0){
       if (ed.a) {
          ed.a("TxLocationManagerImpl", "onWifiInfoEvent");
       }
       if (ed.a) {
          StringBuilder str = "onWifiInfoEvent mHandler is null? ";
          boolean b = (this.d == null)? true: false;
          ed.b("TxLocationManagerImpl", str+b);
       }
       this.a(p0);
       cv tQ = this.Q;
       if (tQ != null) {
          tQ.a(p0.c());
       }
       return;
    }
    public final dh p(){
       cv tt = this.t;
       cv ts = this.s;
       cv tv = this.v;
       List list = null;
       if (tv != null && !this.n()) {
          tv = list;
       }
       if (ts == null) {
          ts = df.a(this.w);
       }
       if (tt != null && !tt.a(System.currentTimeMillis(), 0xea60)) {
          tt = list;
       }
       if (ts != null && tv != null) {
          df d = ts.d;
          df f = ts.f;
          Bundle uBundle = new Bundle();
          uBundle.putString("cellkey", d+""+f);
          uBundle.putParcelable("location", tv.a);
          cg uocg = this.w.a("cell");
          if (uocg != null && !uocg.a(uBundle)) {
             if (ed.a) {
                ed.a("TxLocationManagerImpl", "getFromLastKnownInfo: discard bad cell\("+d+","+f+"\)");
             }
             ts = list;
          }
       }
       cv tn = this.n;
       if (tn != null) {
          list = tn.b();
       }
       return new dh(tt, ts, tv, list);
    }
    public final cu q(){
       if (this.w.g()) {
          return new cu(this.w);
       }
       if (ed.a) {
          ed.b("TxLocationManagerImpl", "createGpsProvider: failed");
       }
       return null;
    }
    public final cr r(){
       if (this.w.e()) {
          return new cr(this.w);
       }
       if (ed.a) {
          ed.b("TxLocationManagerImpl", "createCellProvider: failed");
       }
       return null;
    }
    public final cx s(){
       if (this.w.e()) {
          return new cx(this.w);
       }
       if (ed.a) {
          ed.b("TxLocationManagerImpl", "createNewCellProvider: failed");
       }
       return null;
    }
    public final dc t(){
       if (this.w.f()) {
          return new dc(this.w);
       }
       if (ed.a) {
          ed.b("TxLocationManagerImpl", "createWifiProvider: failed");
       }
       return null;
    }
}
