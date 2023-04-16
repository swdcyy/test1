package c.t.m.g.cl;
import android.app.PendingIntent$OnFinished;
import com.tencent.map.geolocation.TencentLocationListener;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Looper;
import c.t.m.g.cl$b;
import com.tencent.map.geolocation.TencentLocationRequest;
import c.t.m.g.ce;
import c.t.m.g.ed;
import java.lang.String;
import c.t.m.g.cv;
import java.lang.Object;
import android.os.PowerManager;
import android.os.PowerManager$WakeLock;
import c.t.m.g.cl$a;
import c.t.m.g.cl$c;
import c.t.m.g.cl$1;
import android.content.Intent;
import java.util.List;
import java.util.Collections;
import java.lang.Float;
import android.app.PendingIntent;
import android.app.AlarmManager;
import android.os.Build;
import java.util.Locale;
import java.lang.CharSequence;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.StringBuilder;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.util.Arrays;
import com.tencent.map.geolocation.TencentGeofence;
import java.util.Iterator;
import c.t.m.g.ci;
import android.text.TextUtils;
import java.util.LinkedList;
import android.location.Location;
import java.util.ArrayList;
import c.t.m.g.cj;
import java.lang.Double;
import java.lang.Math;
import java.lang.Boolean;
import java.lang.Long;
import java.util.HashMap;
import android.content.IntentFilter;
import c.t.m.g.ee;
import java.lang.IllegalStateException;
import com.tencent.map.geolocation.TencentLocation;
import java.lang.System;
import c.t.m.g.ck;
import c.t.m.g.em;
import c.t.m.g.cm;
import android.os.Bundle;

public class cl extends BroadcastReceiver implements PendingIntent$OnFinished, TencentLocationListener	// class@000c16
{
    public final cl$b a;
    public double b;
    public final Context c;
    public final cv d;
    public final PowerManager$WakeLock e;
    public final PowerManager$WakeLock f;
    public final cl$a g;
    public final cl$c h;
    public boolean i;
    public boolean j;
    public PendingIntent k;
    public final TencentLocationRequest l;
    public boolean m;

    public void cl(Context p0){
       super(p0, Looper.myLooper());
    }
    public void cl(Context p0,Looper p1){
       super();
       this.a = new cl$b();
       this.i = false;
       this.j = false;
       this.l = TencentLocationRequest.create().setRequestLevel(false).setInterval(0);
       this.b = 0x3ff0000000000000;
       this.c = p0;
       ce uoce = ce.a(p0);
       if (ed.a) {
          ed.a("NewTxLocationManagerImpl", "TxtGeofenceManagerImpl new TxLocationManagerImpl");
       }
       this.d = new cv(uoce);
       PowerManager systemServic = p0.getSystemService("power");
       this.e = systemServic.newWakeLock(1, "GeofenceManager");
       PowerManager$WakeLock wakeLock = systemServic.newWakeLock(1, "tencent_location");
       this.f = wakeLock;
       wakeLock.setReferenceCounted(false);
       this.g = new cl$a(this, p1);
       this.h = new cl$c(this, null);
       this.c();
       return;
    }
    public static Intent a(cl p0){
       return p0.k();
    }
    public static void a(cl p0,boolean p1){
       p0.a(p1);
    }
    public static Context b(cl p0){
       return p0.c;
    }
    public static void b(String p0){
       cl.e(p0);
    }
    public static double c(cl p0){
       return p0.i();
    }
    public static void e(String p0){
       if (ed.a) {
          ed.a("log_to_file", p0);
       }
       return;
    }
    public float a(List p0){
       float f;
       if (p0.size() >= 1) {
          Collections.sort(p0);
          Collections.reverse(p0);
          f = p0.get(0).floatValue();
       }else {
          f = 25.00f;
       }
       cl$b f1 = this.a.f;
       if (f1[0] > 0) {
          f1[0] = f1[0] + f;
          f1[0] = (float)((double)f1[0] * 0x3fe0000000000000);
       }else {
          f1[0] = f;
       }
       return f1[0];
    }
    public final PendingIntent a(long p0){
       Object obj = this.c.getSystemService("alarm");
       PendingIntent pendingInten = null;
       if (obj == null) {
          return pendingInten;
       }
       String mANUFACTURER = Build.MANUFACTURER;
       boolean b = (mANUFACTURER != null)? (mANUFACTURER.toLowerCase(Locale.US)).contains("xiaomi"): false;
       cl tk = this.k;
       if (tk != null) {
          obj.cancel(tk);
          this.k = pendingInten;
          if (b) {
             this.g.removeMessages(2);
          }
       }
       if (p0 > 0) {
          pendingInten = this.j();
          this.k = pendingInten;
          obj.setRepeating(2, (SystemClock.elapsedRealtime() + p0), p0, pendingInten);
          if (b) {
             this.g.sendEmptyMessageDelayed(2, (0x2710 + p0));
          }
          cl.e("setLocationAlarm: will triggered after "+p0+" ms, isXiaomi="+b);
       }
       return pendingInten;
    }
    public void a(){
       if (this.i == null) {
          this.e();
          UniversalReceiver.f(this.c, this);
          cl ta = this.a;
          _monitor_enter(ta);
          Arrays.fill(this.a.f, 0xbf800000);
          this.f();
          _monitor_exit(ta);
          this.j = false;
          this.i = true;
       }
       return;
    }
    public final void a(PendingIntent p0){
       if (ed.a) {
          ed.a("GeofenceManager", "sendIntentEnter: pendingIntent="+p0);
       }
       Intent intent = new Intent();
       intent.putExtra("entering", true);
       this.a(p0, intent);
       return;
    }
    public final void a(PendingIntent p0,Intent p1){
       cl te = this.e;
       try{
          te.acquire();
          p0.send(this.c, 0, p1, this, null);
       }catch(android.app.PendingIntent$CanceledException e0){
          this.b(null, p0);
          this.e.release();
       }
       return;
    }
    public void a(TencentGeofence p0){
       this.d();
       if (p0 == null) {
          return;
       }
       if (ed.a) {
          ed.a("GeofenceManager", "removeFence: fence="+p0);
       }
       cl ta = this.a;
       _monitor_enter(ta);
       Iterator iterator = this.a.a.iterator();
       while (iterator.hasNext()) {
          if (p0.equals(iterator.next().a)) {
             iterator.remove();
          }
       }
       this.d("removeFence: --> schedule update fence");
       _monitor_exit(ta);
       return;
    }
    public void a(TencentGeofence p0,PendingIntent p1){
       this.d();
       if (p0 == null || p1 == null) {
          throw null;
       }
       if (ed.a) {
          ed.a("GeofenceManager", "addFence: , geofence="+p0+", intent="+p1);
       }
       ci uoci = new ci(p0, p0.getExpireAt(), "packageName", p1);
       cl ta = this.a;
       cl$b a = ta.a;
       _monitor_enter(ta);
       int i = a.size() - 1;
       while (i >= 0) {
          ci uoci1 = a.get(i);
          if (p0.equals(uoci1.a) && p1.equals(uoci1.d)) {
             a.remove(i);
             break ;
          }
          i = i - 1;
       }
       a.add(v0);
       this.d("addFence: --> schedule update fence");
       _monitor_exit(ta);
       return;
    }
    public void a(String p0){
       this.d();
       if (ed.a) {
          ed.a("GeofenceManager", "removeFence: tag="+p0);
       }
       cl ta = this.a;
       _monitor_enter(ta);
       Iterator iterator = this.a.a.iterator();
       while (iterator.hasNext()) {
          ci a = iterator.next().a;
          if (a == null || TextUtils.equals(a.getTag(), p0)) {
             iterator.remove();
          }
       }
       this.d("removeFence: "+p0+" removed --> schedule update fence");
       _monitor_exit(ta);
       return;
    }
    public final void a(boolean p0){
       double d1;
       boolean i3;
       double d2;
       long l;
       cl a2;
       cl uocl = this;
       LinkedList linkedList = new LinkedList();
       LinkedList linkedList1 = new LinkedList();
       cl a = uocl.a;
       _monitor_enter(a);
       uocl.a.e = false;
       this.g();
       Location location = this.h();
       cl.e("updateFences: fresh_location="+location);
       ArrayList uArrayList = new ArrayList();
       cl$b a1 = uocl.a.a;
       int i = a1.isEmpty() ^ 1;
       double d = Double.MAX_VALUE;
       if (location != null) {
          cj.a(location);
          Iterator iterator = a1.iterator();
          d1 = d;
          while (iterator.hasNext()) {
             ci uoci = iterator.next();
             int i1 = uoci.a(location);
             int i2 = i1 & 0x01;
             if (i2) {
                linkedList.add(uoci.d);
             }
             i3 = i1 & 0x02;
             if (i3) {
                linkedList1.add(uoci.d);
             }
             d2 = uoci.a();
             if (d2 - d1 < 0) {
                d1 = d2;
             }
             if (uoci.c()) {
                uArrayList.add(Float.valueOf(uoci.b()));
             }
             ci uoci1 = 1;
          }
          uocl.a(uArrayList);
       }else {
          d1 = d;
       }
       if (i) {
          double d3 = this.i();
          double d4 = 60000.00f;
          d2 = 0x4a768;
          if (location != null && Double.compare(d1, d)) {
             l = (long)Math.min(900000.00f, Math.max(d4, ((d1 * 0x408f400000000000) / d3)));
             if (d1 - 0x408f400000000000 < 0 && l - d2 > 0) {
                l = d2;
             }
          }else {
             l = 0xea60;
          }
          if (d3 - 0x4014000000000000 < 0 && d1 - 0x4089000000000000 > 0) {
             d4 = uocl.b * 0x3ff051eb851eb852;
             uocl.b = d4;
             l = (long)((d4 * 2.00f) * 60000.00f);
             if (l - d2 <= 0) {
                long l1 = l;
             }
             l = d2;
          }else {
             uocl.b = 0x3ff0000000000000;
          }
          uocl.a.c = l;
          i3 = (p0 && location == null)? true: false;
          Object[] objArray = new Object[]{Boolean.valueOf(i),Long.valueOf(l),Double.valueOf(d1),Double.valueOf(d3),Boolean.valueOf(i3),Double.valueOf(uocl.b)};
          cl.e(String.format(Locale.getDefault(), "updateFences: needUpdates=%s, interval=%d, minDist=%5g, speed=%.2f, reschedule=%s, rate=%.2f", objArray));
          a2 = uocl.a;
          if (a2.b == null) {
             a2.b = true;
             uocl.f.acquire(0x2ee0);
             uocl.d.a(uocl.l, uocl, uocl.g.getLooper());
          }else if(i3){
             uocl.a(-1);
             uocl.a.b = true;
             uocl.f.acquire(0x2ee0);
             uocl.d.a(uocl.l, uocl, uocl.g.getLooper());
          }
       }else {
          a2 = uocl.a;
          if (a2.b != null) {
             a2.b = false;
             this.f();
             this.e();
          }
       }
       HashMap hashMap = new HashMap();
       Iterator iterator1 = a1.iterator();
       while (iterator1.hasNext()) {
          ci uoci2 = iterator1.next();
          hashMap.put(uoci2.a.getTag(), uoci2.toString());
       }
       uocl.h.b.add(hashMap);
       _monitor_exit(a);
       Iterator iterator2 = linkedList1.iterator();
       while (iterator2.hasNext()) {
          uocl.b(iterator2.next());
       }
       Iterator iterator3 = linkedList.iterator();
       while (iterator3.hasNext()) {
          uocl.a(iterator3.next());
       }
       return;
    }
    public void b(){
       this.d();
       cl ta = this.a;
       _monitor_enter(ta);
       this.d.a(this);
       this.f();
       _monitor_exit(ta);
    }
    public final void b(PendingIntent p0){
       if (ed.a) {
          ed.a("GeofenceManager", "sendIntentExit: pendingIntent="+p0);
       }
       Intent intent = new Intent();
       intent.putExtra("entering", false);
       this.a(p0, intent);
       return;
    }
    public final void b(TencentGeofence p0,PendingIntent p1){
       if (ed.a) {
          ed.a("GeofenceManager", "removeFence: fence="+p0+", intent="+p1);
       }
       cl ta = this.a;
       _monitor_enter(ta);
       Iterator iterator = this.a.a.iterator();
       while (iterator.hasNext()) {
          ci uoci = iterator.next();
          if (uoci.d.equals(p1)) {
             if (p0 == null) {
                iterator.remove();
             }else if(p0.equals(uoci.a)){
                iterator.remove();
             }
          }
       }
       this.d("_removeFence: --> schedule update fence");
       _monitor_exit(ta);
       return;
    }
    public final void c(){
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.intent.action.SCREEN_ON");
       intentFilter.addAction("com.tencent.map.geolocation.wakeup");
       intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
       intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
       this.c.registerReceiver(this, intentFilter, null, this.g);
    }
    public final void c(String p0){
       if (!ee.d(this.c)) {
          cl.e("no data conn. skip ["+p0+"]");
          return;
       }else if(this.a.e == null){
          cl.e(p0);
          p0.e = true;
          this.g.sendEmptyMessage(true);
       }
       return;
    }
    public final void d(){
       if (this.i == null) {
          return;
       }
       throw new IllegalStateException("this object has been destroyed!");
    }
    public final void d(String p0){
       if (this.a.e == null) {
          cl.e(p0);
          p0.e = true;
          this.g.sendEmptyMessage(true);
       }
       return;
    }
    public final void e(){
       this.a(-1);
       this.g.removeMessages(2);
       this.d.a(this);
    }
    public final void f(){
       this.a.a();
       this.h.reset();
    }
    public final void g(){
       long l = SystemClock.elapsedRealtime();
       Iterator iterator = this.a.a.iterator();
       while (iterator.hasNext()) {
          if (iterator.next().b - l < 0) {
             iterator.remove();
          }
       }
       return;
    }
    public final Location h(){
       cl ta = this.a;
       cl$b d = ta.d;
       cl$b a = ta.a;
       if (d == null && !a.isEmpty()) {
          d = cj.a(this.d.a(), this.j);
       }
       if (d == null) {
          return null;
       }else if((System.currentTimeMillis() - d.getTime()) - 0xea60 >= 0){
          return null;
       }else {
          return d;
       }
    }
    public final double i(){
       double d1;
       if (ck.a(this.c)) {
          return 0x3ff0000000000000;
       }
       float f = 0x3f800000;
       float f1 = 25.00f;
       if (em.a(ce.a(this.c))) {
          f1 = (float)((double)f1 * 0x3fe3333333333333);
       }else {
          f = 3.00f;
       }
       int i = this.a.f[0];
       if (i - f >= 0) {
          double d = ((double)Math.min(Math.max(f, i), (10.00f + f1)) * 0x3fe999999999999a) + ((double)(f1 + f) * 0x3fb999999999999a);
          d1 = (double)f;
          if (d - d1 < 0) {
             d = d1;
          }
          return d;
       }else if(ee.a(this.c)){
          d1 = (double)f1 * 0x3fd3333333333333;
       }else {
          d1 = (double)f1;
       }
       return d1;
    }
    public final PendingIntent j(){
       return PendingIntent.getBroadcast(this.c, 0, this.k(), 0x8000000);
    }
    public final Intent k(){
       Intent intent = new Intent("com.tencent.map.geolocation.wakeup");
       intent.putExtra("com.tencent.map.geolocation.from_alarm", true);
       return intent;
    }
    public void onLocationChanged(TencentLocation p0,int p1,String p2){
       Location location = cj.a(p0, this.j);
       cl.e(cj.a(p0, p1));
       if (this.j != null && (p1 && !("gps").equals(p0.getProvider()))) {
          return;
       }
       if (this.m == null) {
          this.d.a(this);
       }
       cl ta = this.a;
       _monitor_enter(ta);
       if (!p1) {
          this.h.add(p1, p0);
          cl ta1 = this.a;
          if (ta1.b != null) {
             ta1.d = location;
          }
          if (ta1.e != null) {
             this.g.removeMessages(1);
          }else {
             ta1.e = true;
          }
          cl.e("onLocationChanged: fresh location got --> update fences");
          this.a(false);
       }else {
          location.c = 0xea60;
          this.h.add(p1, p0);
       }
       if (this.a.b != null) {
          cl.e("onLocationChanged: set a new repeat alarm, interval="+this.a.c);
          this.a(this.a.c);
       }
       _monitor_exit(ta);
       if (this.f.isHeld()) {
          this.f.release();
       }
       return;
    }
    public void onReceive(Context p0,Intent p1){
       String action = p1.getAction();
       cl ta = this.a;
       _monitor_enter(ta);
       String str = (this.h() == null)? 1: null;
       if (("android.intent.action.SCREEN_ON").equals(action)) {
          if (str) {
             this.c("onReceive: screen_on and no_fresh_location --> schedule update fence");
          }
       }else if(("com.tencent.map.geolocation.wakeup").equals(action)){
          cm.a(this.c);
          this.g.removeMessages(2);
          this.d("onReceive: alarm --> schedule update fence");
          cm.a();
       }else if(("android.intent.action.ACTION_POWER_DISCONNECTED").equals(action)){
          if (str) {
             this.c("onReceive: power_disconnected --> schedule update fence");
          }
       }else if(("android.net.conn.CONNECTIVITY_CHANGE").equals(action)){
          if (!ee.d(this.c)) {
             cl.e("onReceive: disconnected and stop location updates temporaryly");
             cl ta1 = this.a;
             ta1.b = false;
             ta1.c = 0xea60;
             this.e();
          }
          this.c("onReceive: connected and no_fresh_location --> schedule update fence");
       }
    }
    public void onSendFinished(PendingIntent p0,Intent p1,int p2,String p3,Bundle p4){
       this.e.release();
    }
    public void onStatusUpdate(String p0,int p1,String p2){
    }
}
