package c.t.m.g.b;
import android.content.Context;
import java.lang.Object;
import c.t.m.g.be;
import android.util.LruCache;
import c.t.m.g.j;
import java.lang.String;
import java.io.File;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import c.t.m.g.e;
import java.lang.IllegalArgumentException;
import android.location.Location;
import c.t.m.g.ax;
import c.t.m.g.bn;
import c.t.m.g.bt;
import c.t.m.g.bw;
import java.lang.System;
import android.os.Looper;
import android.os.HandlerThread;
import c.t.m.g.aw;
import c.t.m.g.c;
import c.t.m.g.d;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import c.t.m.g.i;
import c.t.m.g.by;
import c.t.m.g.k;
import java.lang.Boolean;
import c.t.m.g.m;
import java.lang.Throwable;
import c.t.m.g.n;
import java.util.Collection;
import android.net.wifi.ScanResult;
import android.util.Pair;
import java.lang.Double;
import c.t.m.g.bs;
import java.util.HashMap;
import java.util.Set;
import java.util.Map$Entry;

public class b	// class@000bdd
{
    public byte[] a;
    public Context b;
    public e c;
    public HandlerThread d;
    public Location e;
    public Location f;
    public List g;
    public d h;
    public List i;
    public LruCache j;
    public long k;
    public long l;
    public long m;
    public long n;
    public static b o;

    public void b(Context p0){
       String str = "/data/";
       super();
       byte[] uobyteArray = new byte[0];
       this.a = uobyteArray;
       this.k = 0x2bf20;
       this.l = 0;
       this.m = 0;
       this.n = 0;
       Context uContext = (p0 == null)? null: p0.getApplicationContext();
       this.b = uContext;
       if (uContext != null) {
          be.a(p0);
          this.j = new LruCache(100);
          StringBuilder str1 = "";
          if (!j.a && !j.b) {
             str1 = this.b.getExternalFilesDir("data").getAbsolutePath();
          }
          if (TextUtils.isEmpty(str1)) {
             str1 = this.b.getFilesDir().getAbsolutePath();
             str1 = str1+str;
          }
          if (!TextUtils.isEmpty(str1)) {
             this.c = new e(this.b, str1);
             this.e();
          }
          b.o = this;
          return;
       }else {
          throw new IllegalArgumentException("context cannot be null!");
       }
    }
    public static String c(){
       return "1.7.1_210628";
    }
    public final Location a(Location p0,Location p1){
       if (p0 == null) {
          p0 = new Location("gps");
       }
       if (p1 != null) {
          p0.set(p1);
       }
       return p0;
    }
    public void a(){
       b ta = this.a;
       _monitor_enter(ta);
       b tc = this.c;
       if (tc != null && tc.f()) {
          this.c.g();
       }
       if (this.d != null) {
          bn.a("th_loc_extra", 300);
          this.d = null;
       }
       this.f();
       bt.a("TxCoreDC", "shutdown");
       _monitor_exit(ta);
       return;
    }
    public void a(int p0,Location p1){
       b ta = this.a;
       _monitor_enter(ta);
       if (!this.b()) {
          _monitor_exit(ta);
          return;
       }else if(p1 == null || !("gps").equals(p1.getProvider())){
          _monitor_exit(ta);
          return;
       }else if(!j.h && p1.isFromMockProvider()){
          _monitor_exit(ta);
          return;
       }else {
          bt.a("TxCoreDC", "setGpsLocation");
          b tc = this.c;
          if (tc != null) {
             tc.a(p0, p1);
          }
          double d = 0;
          if (!bw.a(p1.getAltitude(), d) || !bw.a((double)p1.getSpeed(), d)) {
             this.e = this.a(this.e, p1);
             if (this.f == null || (this.e != null && (this.e.distanceTo(this.f) - 0x42480000 >= 0 && (System.currentTimeMillis() - this.n) - 5000 >= 0))) {
                this.d();
             }
          }
          _monitor_exit(ta);
          return;
       }
    }
    public void a(long p0,int p1,double p2,double p3,double p4){
       b uob = this;
       b a = uob.a;
       _monitor_enter(a);
       if (!this.b()) {
          _monitor_exit(a);
          return;
       }else if(bt.a()){
          bt.a("TxCoreDC", "setNetLoc");
       }
       b c = uob.c;
       if (c != null) {
          c.a(p0, p1, p2, p3, p4);
       }
       _monitor_exit(a);
       return;
    }
    public void a(Location p0){
       this.a(0, p0);
    }
    public void a(Looper p0){
       HandlerThread handlerThrea;
       b ta = this.a;
       _monitor_enter(ta);
       bt.a("TxCoreDC", "startup");
       this.f();
       if (this.c != null) {
          if (p0 == null) {
             handlerThrea = bn.a("th_loc_extra");
             this.d = handlerThrea;
             handlerThrea = handlerThrea.getLooper();
          }
          this.c.b(handlerThrea);
       }
       _monitor_exit(ta);
       return;
    }
    public void a(c p0){
       b ta = this.a;
       _monitor_enter(ta);
       j.i = p0;
       if (bt.a()) {
          bt.a("TxCoreDC", "appInfo:"+p0.a()+","+p0.c()+"_"+p0.b()+","+p0.e()+","+p0.f());
       }
       _monitor_exit(ta);
       return;
    }
    public void a(d p0,List p1){
       b ta = this.a;
       _monitor_enter(ta);
       if (!this.b()) {
          _monitor_exit(ta);
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             d uod = iterator.next();
             if (i.a(uod.f, uod.a, uod.b, uod.c, uod.e) && this.a(uod.c+"_"+uod.e, this.e)) {
                uArrayList.add(uod);
             }
          }
          this.g = uArrayList;
          this.l = System.currentTimeMillis();
          if (p0 != null && !p0.equals(this.h)) {
             this.h = p0;
             this.d();
          }
          _monitor_exit(ta);
          return;
       }
    }
    public void a(String p0,String p1){
       b ta = this.a;
       _monitor_enter(ta);
       if (this.c == null || by.a(p1)) {
          _monitor_exit(ta);
          return;
       }else if(bt.a()){
          bt.a("TxCoreDC", "setSetting\("+p0+","+p1+"\)");
       }
       if (("D_CH_ID").equals(p0)) {
          k.a(p1);
       }else if(("D_FC_SRC").equals(p0)){
          k.b(p1);
       }else if(("D_POS_COLL").equals(p0)){
          j.c = Boolean.parseBoolean(p1.toLowerCase());
       }else if(("D_WRITE_MAC").equals(p0)){
          j.d = Boolean.parseBoolean(p1.toLowerCase());
       }else if(("D_UP_NET").equals(p0)){
          if (("m").equals(p1.toLowerCase())) {
             j.f = true;
          }else if(("w").equals(p1.toLowerCase())){
             j.f = false;
             j.g = false;
          }else if(("w_m1").equals(p1.toLowerCase())){
             j.f = false;
             j.g = true;
          }
       }else if(("D_EXTRA_SET_SN").equals(p0)){
          String str = (by.a(p1))? "": p1;
          m.a = str;
       }else {
          this.c.a(p0, p1);
       }
       _monitor_exit(ta);
       return;
    }
    public void a(List p0){
       b ta = this.a;
       _monitor_enter(ta);
       if (!this.b()) {
          _monitor_exit(ta);
          return;
       }else {
          long l = System.currentTimeMillis();
          boolean b = n.a(this.i, p0);
          if (bt.a()) {
             bt.a("TxCoreDC", "setWifiResults, same pre:"+b);
          }
          if (b && (l - this.m) - 0x7530 > 0) {
             _monitor_exit(ta);
             return;
          }else {
             b tc = this.c;
             if (tc != null) {
                tc.a(p0);
             }
             if (this.c != null && (this.e != null && !by.a(p0))) {
                int i = 1;
                if (p0.size() == i) {
                   if (("123456789abc").equals((p0.get(0).BSSID).toLowerCase())) {
                      _monitor_exit(ta);
                      return;
                   }
                }else if(p0.size() > i && n.a(p0)){
                   _monitor_exit(ta);
                   return;
                }
                if (j.f && (l - this.m) - 5000 < 0) {
                   _monitor_exit(ta);
                   return;
                }else if(!b){
                   this.m = l;
                   this.i = p0;
                }
                b tg = ((l - this.l) - this.k < 0)? this.g: null;
                this.c.a(this.e, p0, tg);
             }
          label_00b3 :
             _monitor_exit(ta);
             return;
          }
       }
    }
    public final boolean a(String p0,Location p1){
       boolean b = false;
       if (by.a(p0) || (p1 == null || (p1.getLatitude() && p1.getLongitude()))) {
          Pair pair = this.j.get(p0);
          if (pair == null) {
             this.j.put(p0, Pair.create(Double.valueOf(p1.getLatitude()), Double.valueOf(p1.getLongitude())));
             return true;
          }else if(bs.a(p1.getLatitude(), p1.getLongitude(), pair.first.doubleValue(), pair.second.doubleValue()) - 0x40b7700000000000 < 0){
             b = true;
          }
       }
       return b;
    }
    public boolean b(){
       b tc = this.c;
       boolean b = (tc == null)? false: tc.f();
       return b;
    }
    public final void d(){
       Object[] objArray = new Object[]{this.c,this.e};
       if (by.a(objArray) && !by.a(this.g)) {
          if (j.f && n.a(this.b) == 3) {
             return;
          }else {
             long l = System.currentTimeMillis();
             if ((l - this.l) - this.k < 0) {
                this.n = l;
                this.f = this.a(this.f, this.e);
                this.c.a(this.e, null, this.g);
             }
          }
       }
       return;
    }
    public final void e(){
       Iterator iterator = j.b().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          this.a(key, uEntry.getValue());
       }
       return;
    }
    public final void f(){
       this.e = null;
       this.f = null;
       this.g = null;
       this.h = null;
       this.i = null;
       this.l = 0;
       this.m = 0;
       this.n = 0;
       this.j.evictAll();
    }
}
