package com.kwai.library.wolverine.elements.battery.BatteryDataAdapter;
import l27.a;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$a;
import nsd.u;
import com.kwai.library.wolverine.elements.battery.helper.BatteryStatusMonitor;
import v27.a;
import v27.c;
import android.content.Context;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import kotlin.jvm.internal.a;
import qrd.p;
import com.kwai.library.wolverine.elements.battery.helper.BatteryStatusMonitor$mBatteryChangedReceiver$2$1;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.kwai.library.wolverine.elements.battery.helper.BatteryStatusMonitor$mBatteryLowStateReceiver$2$1;
import o27.a;
import w27.a;
import java.lang.Boolean;
import qrd.l1;
import com.kwai.library.wolverine.elements.battery.helper.BatteryStatus;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$d;
import com.kwai.library.wolverine.schedule.WolverineActionScheduleHandler;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import java.util.HashMap;
import java.util.Map;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$e;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$mReceiver$1;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$f;
import android.os.Handler;
import android.os.Looper;
import o27.b;
import android.content.ContentResolver;
import android.provider.Settings$System;
import android.net.Uri;
import android.database.ContentObserver;
import java.lang.Runnable;
import java.util.concurrent.ConcurrentLinkedQueue;
import crd.b;
import brd.a;
import brd.z;
import lrd.b;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$b;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$c;
import erd.a;
import erd.g;

public final class BatteryDataAdapter extends a	// class@000aaa
{
    public boolean e;
    public BatteryStatus f;
    public int g;
    public b h;
    public final long i;
    public final Runnable j;
    public final WolverineActionScheduleHandler k;
    public final BatteryDataAdapter$e l;
    public final BatteryDataAdapter$mReceiver$1 m;
    public final BatteryDataAdapter$f n;
    public static final BatteryDataAdapter$a o;

    static {
       BatteryDataAdapter.o = new BatteryDataAdapter$a(null);
    }
    public void BatteryDataAdapter(long p0,boolean p1){
       super();
       BatteryStatusMonitor f = BatteryStatusMonitor.f;
       Context uContext = c.b().a();
       Objects.requireNonNull(f);
       a.p(uContext, "context");
       if (BatteryStatusMonitor.a) {
       }else {
          BatteryStatusMonitor.a = true;
          UniversalReceiver.e(uContext, BatteryStatusMonitor.d.getValue(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
          IntentFilter intentFilter = new IntentFilter();
          intentFilter.addAction("android.intent.action.BATTERY_LOW");
          intentFilter.addAction("android.intent.action.BATTERY_OKAY");
          UniversalReceiver.e(uContext, BatteryStatusMonitor.e.getValue(), intentFilter);
       }
       boolean b = a.d();
       a.a.b("wpl_power_save_mode_init", Boolean.valueOf(b));
       this.e = b;
       this.f = f.c();
       this.g = -1;
       if (p0 - null <= 0) {
          p0 = 0x1d4c0;
       }
       this.i = p0;
       this.j = new BatteryDataAdapter$d(this);
       u ou = null;
       if (p1) {
          HashMap d = WolverineActionScheduleHandler.d;
          WolverineActionScheduleHandler wolverineAct = d.get(m0.d(BatteryDataAdapter.class));
          if (wolverineAct == null) {
             wolverineAct = new WolverineActionScheduleHandler(p0, ou);
             d.put(m0.d(BatteryDataAdapter.class), wolverineAct);
          }
          ou = wolverineAct;
          a.o(ou, "mScheduleHandlerMap[T::c¡­[T::class] = it\n        }");
       }
       this.k = ou;
       this.l = new BatteryDataAdapter$e(this);
       this.m = new BatteryDataAdapter$mReceiver$1(this);
       this.n = new BatteryDataAdapter$f(this, new Handler(Looper.getMainLooper()));
       return;
    }
    public void c(){
       BatteryStatusMonitor.f.b(this.l);
       UniversalReceiver.e(c.b().a(), this.m, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
       c.b().a().getContentResolver().registerContentObserver(Settings$System.CONTENT_URI, true, this.n);
       BatteryDataAdapter tk = this.k;
       if (tk != null) {
          tk.a(this.i, this.j);
       }
       tk = this.k;
       if (tk != null) {
          tk.c();
       }
       return;
    }
    public void e(){
       BatteryDataAdapter tl = this.l;
       Objects.requireNonNull(BatteryStatusMonitor.f);
       a.p(tl, "listener");
       ConcurrentLinkedQueue c = BatteryStatusMonitor.c;
       if (c.contains(tl)) {
          c.remove(tl);
       }
       UniversalReceiver.f(c.b().a(), this.m);
       c.b().a().getContentResolver().unregisterContentObserver(this.n);
       BatteryDataAdapter tk = this.k;
       if (tk != null) {
          tk.b(this.j);
       }
       tk = this.k;
       if (tk != null) {
          tk.d();
       }
       tk = this.h;
       if (tk != null) {
          tk.dispose();
       }
       return;
    }
    public final void f(Runnable p0){
       BatteryDataAdapter th = this.h;
       if (th != null) {
          th.dispose();
       }
       a uoa = a.r(p0);
       z oz = c.b().b();
       if (oz == null) {
          oz = b.a();
          a.o(oz, "Schedulers.computation\(\)");
       }
       this.h = uoa.w(oz).u(BatteryDataAdapter$b.b, BatteryDataAdapter$c.b);
       return;
    }
    public final int g(){
       return this.g;
    }
    public final BatteryStatus j(){
       return this.f;
    }
    public final void k(int p0){
       this.g = p0;
    }
    public final void l(boolean p0){
       this.e = p0;
    }
}
