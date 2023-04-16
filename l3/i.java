package l3.i;
import k3.m;
import java.lang.Object;
import android.content.Context;
import k3.a;
import x3.a;
import android.content.res.Resources;
import androidx.work.impl.WorkDatabase;
import k3.h$a;
import k3.h;
import java.util.List;
import l3.d;
import v3.i;
import java.util.concurrent.Executor;
import k3.a$b;
import ig6.c;
import java.lang.IllegalStateException;
import java.lang.String;
import x3.b;
import v3.f;
import androidx.lifecycle.LiveData;
import u3.s;
import u3.r;
import z0.a;
import v3.d;
import android.os.Build$VERSION;
import androidx.work.impl.utils.ForceStopRunnable;
import java.lang.Runnable;
import android.content.BroadcastReceiver$PendingResult;
import p3.b;
import l3.f;
import androidx.work.WorkerParameters$a;
import v3.j;
import v3.l;
import androidx.work.ExistingWorkPolicy;
import k3.l;
import l3.g;
import java.lang.IllegalArgumentException;
import k3.i;
import v3.a;
import java.util.UUID;
import android.app.PendingIntent;
import android.content.Intent;
import androidx.work.impl.foreground.a;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.c;
import xk.d;
import w3.a;
import l3.i$a;
import v3.k;
import java.util.Collections;
import l3.i$b;
import androidx.work.d;
import u3.g;
import a3.e;
import v3.h;
import v3.g;
import l3.e;
import n3.b;
import java.util.Arrays;

public class i extends m	// class@002508
{
    public Context a;
    public a b;
    public WorkDatabase c;
    public a d;
    public List e;
    public d f;
    public f g;
    public boolean h;
    public BroadcastReceiver$PendingResult i;
    public static i j;
    public static i k;
    public static final Object l;

    static {
       i.l = new Object();
    }
    public void i(Context p0,a p1,a p2){
       super(p0, p1, p2, p0.getResources().getBoolean(0x7f050008));
    }
    public void i(Context p0,a p1,a p2,WorkDatabase p3){
       super();
       h.e(new h$a(p1.g()));
       Context uContext = p0;
       a uoa = p1;
       a uoa1 = p2;
       WorkDatabase workDatabase = p3;
       List list = this.y(p0.getApplicationContext(), p1, p2);
       d uod = new d(uContext, uoa, uoa1, workDatabase, list);
       this.K(uContext, uoa, uoa1, workDatabase, list, v9);
    }
    public void i(Context p0,a p1,a p2,boolean p3){
       super(p0, p1, p2, WorkDatabase.E(p0.getApplicationContext(), p2.b(), p3));
    }
    public static i C(){
       Object l = i.l;
       _monitor_enter(l);
       i j = i.j;
       if (j != null) {
          _monitor_exit(l);
          return j;
       }else {
          _monitor_exit(l);
          return i.k;
       }
    }
    public static i D(Context p0){
       Object l = i.l;
       _monitor_enter(l);
       i oi = i.C();
       if (oi == null) {
          p0 = p0.getApplicationContext();
          if (p0 instanceof a$b) {
             i.w(p0, p0.a());
             oi = c.b(p0);
          }else {
             throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
          }
       }
       _monitor_exit(l);
       return oi;
    }
    public static void w(Context p0,a p1){
       Object l = i.l;
       _monitor_enter(l);
       i j = i.j;
       if (j != null && i.k != null) {
          throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize\(Context, Configuration\) or the class level Javadoc for more information.");
       }
       if (j == null) {
          p0 = p0.getApplicationContext();
          if (i.k == null) {
             i.k = new i(p0, p1, new b(p1.i()));
          }
          i.j = i.k;
       }
       _monitor_exit(l);
       return;
    }
    public Context A(){
       return this.a;
    }
    public a B(){
       return this.b;
    }
    public f E(){
       return this.g;
    }
    public d F(){
       return this.f;
    }
    public List G(){
       return this.e;
    }
    public WorkDatabase H(){
       return this.c;
    }
    public LiveData I(List p0){
       return d.a(this.c.O().w(p0), r.s, this.d);
    }
    public a J(){
       return this.d;
    }
    public final void K(Context p0,a p1,a p2,WorkDatabase p3,List p4,d p5){
       p0 = p0.getApplicationContext();
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.c = p3;
       this.e = p4;
       this.f = p5;
       this.g = new f(p3);
       this.h = false;
       if (Build$VERSION.SDK_INT >= 24 && p0.isDeviceProtectedStorage()) {
          throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
       }
       this.d.d(new ForceStopRunnable(p0, this));
       return;
    }
    public void L(){
       Object l = i.l;
       _monitor_enter(l);
       this.h = true;
       i ti = this.i;
       if (ti != null) {
          ti.finish();
          this.i = null;
       }
       _monitor_exit(l);
       return;
    }
    public void M(){
       if (Build$VERSION.SDK_INT >= 23) {
          b.c(this.A());
       }
       this.H().O().k();
       f.b(this.B(), this.H(), this.G());
       return;
    }
    public void N(BroadcastReceiver$PendingResult p0){
       Object l = i.l;
       _monitor_enter(l);
       this.i = p0;
       if (this.h != null) {
          p0.finish();
          this.i = null;
       }
       _monitor_exit(l);
       return;
    }
    public void O(String p0){
       this.P(p0, null);
    }
    public void P(String p0,WorkerParameters$a p1){
       this.d.d(new j(this, p0, p1));
    }
    public void Q(String p0){
       this.d.d(new l(this, p0, true));
    }
    public void R(String p0){
       this.d.d(new l(this, p0, false));
    }
    public l a(String p0,ExistingWorkPolicy p1,List p2){
       if (!p2.isEmpty()) {
          return new g(this, p0, p1, p2);
       }
       throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }
    public l b(List p0){
       if (!p0.isEmpty()) {
          return new g(this, p0);
       }
       throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
    }
    public i c(){
       a uoa = a.b(this);
       this.d.d(uoa);
       return uoa.f();
    }
    public i d(String p0){
       a uoa = a.e(p0, this);
       this.d.d(uoa);
       return uoa.f();
    }
    public i e(String p0){
       a uoa = a.d(p0, this, true);
       this.d.d(uoa);
       return uoa.f();
    }
    public i f(UUID p0){
       a uoa = a.c(p0, this);
       this.d.d(uoa);
       return uoa.f();
    }
    public PendingIntent g(UUID p0){
       return PendingIntent.getService(this.a, 0, a.a(this.a, p0.toString()), 0x8000000);
    }
    public i i(List p0){
       if (!p0.isEmpty()) {
          return new g(this, p0).b();
       }
       throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }
    public i j(String p0,ExistingPeriodicWorkPolicy p1,c p2){
       return this.z(p0, p1, p2).b();
    }
    public i k(String p0,ExistingWorkPolicy p1,List p2){
       return new g(this, p0, p1, p2).b();
    }
    public d m(){
       a uoa = a.N();
       this.d.d(new i$a(this, uoa, this.g));
       return uoa;
    }
    public LiveData n(){
       return this.g.b();
    }
    public d o(UUID p0){
       k ok = k.c(this, p0);
       this.d.b().execute(ok);
       return ok.f();
    }
    public LiveData p(UUID p0){
       return d.a(this.c.O().w(Collections.singletonList(p0.toString())), new i$b(this), this.d);
    }
    public d q(d p0){
       k ok = k.e(this, p0);
       this.d.b().execute(ok);
       return ok.f();
    }
    public d r(String p0){
       k ok = k.b(this, p0);
       this.d.b().execute(ok);
       return ok.f();
    }
    public LiveData s(String p0){
       return d.a(this.c.O().f(p0), r.s, this.d);
    }
    public d t(String p0){
       k ok = k.d(this, p0);
       this.d.b().execute(ok);
       return ok.f();
    }
    public LiveData u(String p0){
       return d.a(this.c.O().e(p0), r.s, this.d);
    }
    public LiveData v(d p0){
       return d.a(this.c.K().a(h.b(p0)), r.s, this.d);
    }
    public i x(){
       g og = new g(this);
       this.d.d(og);
       return og.a();
    }
    public List y(Context p0,a p1,a p2){
       e[] uoeArray = new e[]{f.a(p0, this),new b(p0, p1, p2, this)};
       return Arrays.asList(uoeArray);
    }
    public final g z(String p0,ExistingPeriodicWorkPolicy p1,c p2){
       ExistingWorkPolicy kEEP = (p1 == ExistingPeriodicWorkPolicy.KEEP)? ExistingWorkPolicy.KEEP: ExistingWorkPolicy.REPLACE;
       return new g(this, p0, kEEP, Collections.singletonList(p2));
    }
}
