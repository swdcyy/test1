package c.t.m.g.cr;
import android.telephony.PhoneStateListener;
import c.t.m.g.ce;
import android.telephony.CellLocation;
import c.t.m.g.cr$a;
import java.lang.Object;
import android.os.Handler;
import android.os.HandlerThread;
import c.t.m.g.ed;
import java.lang.String;
import android.telephony.TelephonyManager;
import java.lang.StringBuilder;
import java.lang.Throwable;
import c.t.m.g.dy;
import android.telephony.SignalStrength;
import c.t.m.g.df;
import android.telephony.gsm.GsmCellLocation;
import android.os.Looper;
import c.t.m.g.cr$1;
import java.lang.System;
import c.t.m.g.cr$b;
import java.lang.Runnable;
import android.telephony.ServiceState;
import android.content.Context;
import android.os.Message;
import c.t.m.g.cf;
import java.lang.Exception;

public final class cr extends PhoneStateListener	// class@000c20
{
    public boolean a;
    public final ce b;
    public byte[] c;
    public CellLocation d;
    public SignalStrength e;
    public ServiceState f;
    public long g;
    public HandlerThread h;
    public cr$a i;

    public void cr(ce p0){
       super();
       byte[] uobyteArray = new byte[0];
       this.c = uobyteArray;
       this.d = null;
       this.e = null;
       this.f = null;
       this.b = p0;
    }
    public static void a(cr p0,CellLocation p1){
       p0.b(p1);
    }
    public static byte[] a(cr p0){
       return p0.c;
    }
    public static cr$a b(cr p0){
       return p0.i;
    }
    public static ce c(cr p0){
       return p0.b;
    }
    public void a(){
       if (this.a == null) {
          return;
       }
       this.a = false;
       this.a(false);
       cr tc = this.c;
       _monitor_enter(tc);
       cr ti = this.i;
       if (ti != null) {
          ti.a();
          this.i.removeCallbacksAndMessages(null);
          this.i = null;
       }
       ti = this.h;
       if (ti != null) {
          ti.quit();
          this.h = null;
       }
       this.c();
       this.g = 0;
       _monitor_exit(tc);
       if (ed.a) {
          ed.a("TxCellProvider", "shutdown: state=[shutdown]");
       }
       return;
    }
    public final void a(int p0){
       TelephonyManager telephonyMan = this.b.b();
       try{
          telephonyMan.listen(this, p0);
       }catch(java.lang.Exception e0){
          if (ed.a) {
             ed.a("TxCellProvider", "listenCellState: failed! flags="+p0, e0);
          }
       }
       return;
    }
    public void a(Handler p0){
       if (this.a != null) {
          return;
       }
       this.a = true;
       this.b();
       CellLocation uCellLocatio = dy.a(this.b);
       if (this.a(uCellLocatio)) {
          df uodf = df.a(this.b, uCellLocatio, null);
          if (uodf != null) {
             this.d = uCellLocatio;
             this.b.b(uodf);
          }
       }
       this.a(273);
       if (ed.a) {
          ed.a("TxCellProvider", "startup: state=[start]");
       }
       return;
    }
    public final boolean a(CellLocation p0){
       if (p0 == null) {
          return false;
       }
       try{
          GsmCellLocation gsmCellLocat = p0;
          if (!gsmCellLocat.getCid() && !gsmCellLocat.getLac()) {
             return false;
          }
       }catch(java.lang.ClassCastException e0){
       }
       if (dy.a(p0) < 0) {
          return e0;
       }else if(dy.a(this.d, p0)){
          return e0;
       }else if(this.c(p0)){
          return true;
       }else {
          return e0;
       }
    }
    public final void b(){
       cr tc = this.c;
       _monitor_enter(tc);
       HandlerThread handlerThrea = new HandlerThread("CellProvider");
       this.h = handlerThrea;
       handlerThrea.start();
       cr$a uoa = new cr$a(this, this.h.getLooper(), null);
       this.i = uoa;
       uoa.sendEmptyMessageDelayed(0, 3000);
       _monitor_exit(tc);
    }
    public final void b(CellLocation p0){
       this.onCellLocationChanged(p0);
    }
    public final void c(){
       this.d = null;
       this.e = null;
       this.f = null;
    }
    public final boolean c(CellLocation p0){
       df uodf = df.a(this.b, p0, null);
       boolean b = (uodf == null)? true: dy.a(uodf);
       return b;
    }
    public final void d(){
       if (this.a == null) {
          return;
       }
       if (this.d == null) {
          return;
       }
       long l = System.currentTimeMillis();
       int i = ((l - this.g) - 2000 > 0)? 1: 0;
       if (i) {
          this.g = l;
          this.e();
       }
       return;
    }
    public final void e(){
       df uodf = df.a(this.b, this.d, this.e);
       cr tc = this.c;
       _monitor_enter(tc);
       if (this.i != null && uodf != null) {
          cr$b uob = new cr$b(this.b);
          uob.a(uodf);
          this.i.post(uob);
       }
       _monitor_exit(tc);
       return;
    }
    public final void f(){
       if (this.a == null) {
          return;
       }
       int i = 0x32c7;
       cr tf = this.f;
       int i1 = -1;
       int i2 = 1;
       int i3 = 0;
       if (tf != null) {
          if (!tf.getState()) {
             i1 = 1;
          }else if(this.f.getState() == i2){
             i1 = 0;
          }
       }
       TelephonyManager telephonyMan = this.b.b();
       boolean b = dy.a(this.b.a);
       if (telephonyMan == null || telephonyMan.getSimState() != 5) {
          i2 = 0;
       }
       if (!b && i2) {
          i3 = i1;
       }
       Message message = new Message();
       message.what = i;
       message.arg1 = 0x2ee3;
       message.arg2 = i3;
       this.b.b(message);
       return;
    }
    public void onCellLocationChanged(CellLocation p0){
       super.onCellLocationChanged(p0);
       if (this.a(p0)) {
          this.d = p0;
          this.d();
       }else if(ed.a){
          ed.b("TxCellProvider", "onCellLocationChanged: illegal cell or same cell "+p0);
       }
       return;
    }
    public void onServiceStateChanged(ServiceState p0){
       super.onServiceStateChanged(p0);
       if (p0 == null) {
          return;
       }
       cr tf = this.f;
       if (tf == null || tf.getState() != p0.getState()) {
          this.f = p0;
          this.f();
       }
       return;
    }
    public void onSignalStrengthsChanged(SignalStrength p0){
       super.onSignalStrengthsChanged(p0);
       if (p0 == null) {
          return;
       }
       try{
          cr te = this.e;
          int i = this.b.h().a();
          if (te == null || dy.a(i, te, p0)) {
             this.e = p0;
             this.d();
          }
       }catch(java.lang.Exception e3){
          if (ed.a) {
             ed.b("TxCellProvider", e3.toString());
          }
       }
       return;
    }
}
