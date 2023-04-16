package c.t.m.g.dc;
import android.content.BroadcastReceiver;
import c.t.m.g.ce;
import android.net.wifi.WifiManager;
import java.util.HashSet;
import c.t.m.g.dc$1;
import c.t.m.g.dc$2;
import java.lang.String;
import java.util.List;
import android.content.Intent;
import android.os.Handler;
import android.content.Context;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import c.t.m.g.ed;
import java.lang.Object;
import c.t.m.g.bp;
import java.lang.StringBuilder;
import c.t.m.g.em;
import java.lang.Throwable;
import android.os.Looper;
import c.t.m.g.dc$a;
import java.lang.Runnable;
import java.util.Collection;
import c.t.m.g.by;
import java.util.Iterator;
import android.net.wifi.ScanResult;
import android.os.SystemClock;
import c.t.m.g.cd;
import java.lang.Thread;
import c.t.m.g.dj;
import java.lang.System;
import android.os.Build$VERSION;
import android.content.ContentResolver;
import android.provider.Settings$Secure;
import android.os.Message;

public final class dc extends BroadcastReceiver	// class@000c3d
{
    public boolean a;
    public final ce b;
    public final WifiManager c;
    public long d;
    public HashSet e;
    public Handler g;
    public Handler h;
    public dc$a i;
    public List j;
    public List k;
    public Runnable l;
    public Runnable m;
    public String n;
    public long o;
    public double p;
    public int q;
    public final byte[] r;
    public static boolean f;

    public void dc(ce p0){
       super();
       this.o = 0x7530;
       this.p = -9999.00f;
       this.q = 0;
       byte[] uobyteArray = new byte[0];
       this.r = uobyteArray;
       this.b = p0;
       this.c = p0.c();
       this.e = new HashSet();
       this.l = new dc$1(this);
       this.m = new dc$2(this);
    }
    public static String a(dc p0,String p1){
       p0.n = p1;
       return p1;
    }
    public static List a(dc p0,List p1){
       p0.k = p1;
       return p1;
    }
    public static void a(dc p0,Intent p1){
       p0.a(p1);
    }
    public static boolean a(dc p0){
       return p0.c();
    }
    public static long b(dc p0){
       return p0.o;
    }
    public static Handler c(dc p0){
       return p0.h;
    }
    public static ce d(dc p0){
       return p0.b;
    }
    public static byte[] e(dc p0){
       return p0.r;
    }
    public static void f(dc p0){
       p0.e();
    }
    public static List g(dc p0){
       return p0.j;
    }
    public static List h(dc p0){
       return p0.k;
    }
    public static String i(dc p0){
       return p0.n;
    }
    public static void j(dc p0){
       p0.d();
    }
    public void a(){
       dc tr = this.r;
       _monitor_enter(tr);
       if (this.a == null) {
          _monitor_exit(tr);
          return;
       }else {
          this.a = false;
          try{
             UniversalReceiver.f(this.b.a, this);
             if (ed.a) {
                ed.b("TxWifiProvider", "unregisterReceiver success");
             }
          }catch(java.lang.Exception e0){
             if (ed.a) {
                ed.b("TxWifiProvider", "unregisterReceiver failed");
             }
          }
          HashSet hashSet = null;
          this.e = hashSet;
          if (this.k != null) {
             this.k.clear();
          }
          dc te = this.e;
          if (te != null) {
             te.clear();
          }
          if (this.i != null) {
             this.i.removeCallbacksAndMessages(hashSet);
             this.i = hashSet;
          }
          if (ed.a) {
             ed.a("TxWifiProvider", "shutdown: state=[shutdown]");
          }
          _monitor_exit(e0);
          return;
       }
    }
    public final void a(int p0){
       if (this.i != null) {
          bp.a(this.i, p0);
       }
       return;
    }
    public void a(long p0){
       this.o = p0;
    }
    public final void a(Intent p0){
       if (p0 == null) {
          return;
       }
       if (ed.a) {
          ed.a("TxWifiProvider", "onWifiBroadcastReceive");
       }
       String action = p0.getAction();
       if (ed.a) {
          ed.a("TxWifiProvider", "onReceive "+action);
       }
       boolean b = ("android.net.wifi.WIFI_STATE_CHANGED").equals(action);
       if (b) {
          this.a(1201);
       }
       if (b || ("android.net.wifi.SCAN_RESULTS").equals(action)) {
          this.j = em.c(this.c);
          this.a(1202);
       }
    label_0067 :
       return;
    }
    public void a(Handler p0,Handler p1,Handler p2,boolean p3){
       dc tr = this.r;
       _monitor_enter(tr);
       if (this.a != null) {
          _monitor_exit(tr);
          return;
       }else {
          this.a = true;
          dc.f = p3;
          this.g = p0;
          this.h = p2;
          if (this.i == null || this.i.getLooper() != p0.getLooper()) {
             if (this.i != null) {
                this.i.removeCallbacksAndMessages(null);
             }
             if (p0 != null) {
                this.i = new dc$a(this, p0.getLooper());
             }
          }
          p1.post(this.m);
          if (!dc.f) {
             this.b(0);
          }
          if (ed.a) {
             ed.a("TxWifiProvider", "startup: state=[start]");
          }
          _monitor_exit(tr);
          return;
       }
    }
    public final boolean a(List p0){
       boolean b = true;
       if (this.c != null && (!by.a(p0) && (!this.c.isWifiEnabled() && !this.c.isScanAlwaysAvailable()))) {
          long l = 0;
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             ScanResult timestamp = iterator.next().timestamp;
             if (timestamp - l > 0) {
                l = timestamp;
             }
          }
          long l1 = SystemClock.elapsedRealtime() - (l / 1000);
          if (l1 - 0xea60 > 0) {
             b = false;
          }
          cd.c().a("WIFI", "wifi closed,list v="+b+",d_t="+l1+"ms");
       }
    label_006d :
       return b;
    }
    public int b(){
       return (this.c() ^ 0x01);
    }
    public void b(long p0){
       dc tg = this.g;
       dc tl = this.l;
       Looper looper = (tg == null)? null: tg.getLooper();
       if (looper != null && looper.getThread().isAlive()) {
          tg.removeCallbacks(tl);
          tg.postDelayed(tl, p0);
       }
       return;
    }
    public final void b(List p0){
       if (ed.a) {
          ed.a("TxWifiProvider", "notifyListeners");
       }
       if (p0 == null || !p0.size()) {
          this.e();
       }else if(em.a){
          em.a = false;
          this.e();
       }
       if (this.a(p0)) {
          dj uodj = new dj(p0, this.d, em.a(this.c));
          if (ed.a) {
             ed.a("TxWifiProvider", "notifyListeners postEvent");
          }
          this.b.b(uodj);
       }
       return;
    }
    public final boolean c(){
       if (!em.b(this.b) || dc.f) {
          return false;
       }
       boolean b = em.b(this.c);
       cd.c().a("WIFI", "fs:"+by.a(b));
       return b;
    }
    public final void d(){
       Iterator iterator;
       ScanResult scanResult;
       dc tk = this.k;
       if (this.e == null) {
          this.e = new HashSet();
       }
       if (tk == null) {
          return;
       }else if(!this.e.size()){
          iterator = tk.iterator();
          while (iterator.hasNext()) {
             scanResult = iterator.next();
             this.e.add(scanResult.BSSID+scanResult.level);
          }
          this.d = System.currentTimeMillis();
          if (ed.a) {
             ed.b("TxWifiProvider", "first receiver");
          }
          this.b(tk);
       }else {
          int i = this.e.size();
          if (i != tk.size()) {
             this.e.clear();
             iterator = tk.iterator();
             while (iterator.hasNext()) {
                scanResult = iterator.next();
                this.e.add(scanResult.BSSID+scanResult.level);
             }
             this.d = System.currentTimeMillis();
             if (ed.a) {
                ed.b("TxWifiProvider", "size not same");
             }
             this.b(tk);
          }else {
             Iterator iterator1 = tk.iterator();
             while (iterator1.hasNext()) {
                ScanResult scanResult1 = iterator1.next();
                this.e.add(scanResult1.BSSID+scanResult1.level);
             }
             if (i != this.e.size()) {
                this.e.clear();
                iterator = tk.iterator();
                while (iterator.hasNext()) {
                   scanResult = iterator.next();
                   this.e.add(scanResult.BSSID+scanResult.level);
                }
                this.d = System.currentTimeMillis();
                if (ed.a) {
                   ed.b("TxWifiProvider", "size same,but mac is not same");
                }
                this.b(tk);
             }else if(ed.a){
                ed.b("TxWifiProvider", "size same,mac and rssi same");
             }
          }
       }
       return;
    }
    public final void e(){
       if (ed.a) {
          ed.a("TxWifiProvider", "notifyStatus");
       }
       int i = 0x32c7;
       int i1 = em.a(this.c);
       int i2 = 1;
       if (i1 == 3) {
          this.b(0);
       }else if(i1 == i2){
          i2 = 0;
          if (!em.b(this.b)) {
             if (this.k != null) {
                this.k.clear();
             }
             if (this.g != null) {
                bp.a(this.g, 555);
             }
          }
       }else {
          i2 = -1;
       }
       if (Build$VERSION.SDK_INT >= 23 && !Settings$Secure.getInt(this.b.a.getContentResolver(), "location_mode")) {
          i2 = 5;
       }
       Message message = new Message();
       message.what = i;
       message.arg1 = 0x2ee1;
       message.arg2 = i2;
       if (ed.a) {
          ed.a("TxWifiProvider", "notifyStatus postEvent");
       }
       this.b.b(message);
       return;
    }
    public void onReceive(Context p0,Intent p1){
       if (ed.a) {
          ed.a("TxWifiProvider", "broadcast onReceive");
       }
       dc ti = this.i;
       if (ti != null) {
          Message message = ti.obtainMessage();
          message.obj = p1;
          message.what = 1203;
          bp.a(ti, message);
       }
       return;
    }
}
