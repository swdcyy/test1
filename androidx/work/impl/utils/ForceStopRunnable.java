package androidx.work.impl.utils.ForceStopRunnable;
import java.lang.Runnable;
import java.lang.String;
import k3.h;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import l3.i;
import java.lang.Object;
import android.content.Intent;
import android.content.ComponentName;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.lang.Class;
import android.app.PendingIntent;
import android.app.AlarmManager;
import java.lang.System;
import android.os.Build$VERSION;
import p3.b;
import androidx.work.impl.WorkDatabase;
import u3.s;
import u3.p;
import androidx.room.RoomDatabase;
import java.util.List;
import java.util.Iterator;
import u3.r;
import androidx.work.WorkInfo$State;
import v3.f;
import l3.h;
import java.lang.Throwable;
import k3.a;
import l3.f;
import ig6.c;

public class ForceStopRunnable implements Runnable	// class@000a93
{
    public final Context b;
    public final i c;
    public static final String d;
    public static final long e;

    static {
       ForceStopRunnable.d = h.f("ForceStopRunnable");
       ForceStopRunnable.e = TimeUnit.DAYS.toMillis(3650);
    }
    public void ForceStopRunnable(Context p0,i p1){
       super();
       this.b = p0.getApplicationContext();
       this.c = p1;
    }
    public static Intent b(Context p0){
       Intent intent = new Intent();
       intent.setComponent(new ComponentName(p0, ForceStopRunnable$BroadcastReceiver.class));
       intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
       return intent;
    }
    public static PendingIntent c(Context p0,int p1){
       return PendingIntent.getBroadcast(p0, -1, ForceStopRunnable.b(p0), p1);
    }
    public static void e(Context p0){
       AlarmManager systemServic = p0.getSystemService("alarm");
       PendingIntent pendingInten = ForceStopRunnable.c(p0, 0x8000000);
       long l = System.currentTimeMillis() + ForceStopRunnable.e;
       if (systemServic != null) {
          systemServic.setExact(0, l, pendingInten);
       }
       return;
    }
    public boolean a(){
       boolean b;
       if (Build$VERSION.SDK_INT >= 23) {
          b.d(this.b);
       }
       WorkDatabase workDatabase = this.c.H();
       s os = workDatabase.O();
       p op = workDatabase.N();
       workDatabase.e();
       List list = os.n();
       b = (list != null && !list.isEmpty())? true: false;
       if (b) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             r or = iterator.next();
             String[] stringArray = new String[]{or.a};
             os.a(WorkInfo$State.ENQUEUED, stringArray);
             os.l(or.a, -1);
          }
       }
       op.a();
       workDatabase.C();
       workDatabase.k();
       return b;
    }
    public boolean d(){
       if (ForceStopRunnable.c(this.b, 0x20000000) != null) {
          return false;
       }
       ForceStopRunnable.e(this.b);
       return true;
    }
    public boolean f(){
       return this.c.E().c();
    }
    public void run(){
       Throwable[] throwableArr1;
       h.d(this.b);
       String d = ForceStopRunnable.d;
       int i = 0;
       Throwable[] throwableArr = new Throwable[i];
       h.c().a(d, "Performing cleanup operations.", throwableArr);
       boolean b = this.a();
       if (this.f()) {
          throwableArr = new Throwable[i];
          h.c().a(d, "Rescheduling Workers.", throwableArr);
          this.c.M();
          this.c.E().f(i);
       }else if(this.d()){
          throwableArr1 = new Throwable[i];
          h.c().a(d, "Application was force-stopped, rescheduling.", throwableArr1);
          this.c.M();
       }else if(b){
          throwableArr1 = new Throwable[i];
          h.c().a(d, "Found unfinished work, scheduling it.", throwableArr1);
          f.b(this.c.B(), this.c.H(), this.c.G());
       }
       this.c.L();
       return;
    }
}
