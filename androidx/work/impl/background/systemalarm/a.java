package androidx.work.impl.background.systemalarm.a;
import l3.b;
import java.lang.String;
import k3.h;
import android.content.Context;
import java.lang.Object;
import java.util.HashMap;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.lang.Class;
import android.os.Bundle;
import java.util.Map;
import androidx.work.impl.background.systemalarm.d;
import java.lang.Throwable;
import androidx.work.impl.background.systemalarm.b;
import androidx.work.impl.background.systemalarm.c;
import java.lang.Integer;
import l3.i;
import androidx.work.impl.WorkDatabase;
import androidx.room.RoomDatabase;
import u3.s;
import u3.r;
import java.lang.StringBuilder;
import androidx.work.WorkInfo$State;
import java.lang.Long;
import o3.a;
import androidx.work.impl.background.systemalarm.d$b;
import java.lang.Runnable;

public class a implements b	// class@000a7b
{
    public final Context b;
    public final Map c;
    public final Object d;
    public static final String e;

    static {
       a.e = h.f("CommandHandler");
    }
    public void a(Context p0){
       super();
       this.b = p0;
       this.c = new HashMap();
       this.d = new Object();
    }
    public static Intent a(Context p0){
       Intent intent = new Intent(p0, SystemAlarmService.class);
       intent.setAction("ACTION_CONSTRAINTS_CHANGED");
       return intent;
    }
    public static Intent b(Context p0,String p1){
       Intent intent = new Intent(p0, SystemAlarmService.class);
       intent.setAction("ACTION_DELAY_MET");
       intent.putExtra("KEY_WORKSPEC_ID", p1);
       return intent;
    }
    public static Intent c(Context p0,String p1,boolean p2){
       Intent intent = new Intent(p0, SystemAlarmService.class);
       intent.setAction("ACTION_EXECUTION_COMPLETED");
       intent.putExtra("KEY_WORKSPEC_ID", p1);
       intent.putExtra("KEY_NEEDS_RESCHEDULE", p2);
       return intent;
    }
    public static Intent e(Context p0){
       Intent intent = new Intent(p0, SystemAlarmService.class);
       intent.setAction("ACTION_RESCHEDULE");
       return intent;
    }
    public static Intent f(Context p0,String p1){
       Intent intent = new Intent(p0, SystemAlarmService.class);
       intent.setAction("ACTION_SCHEDULE_WORK");
       intent.putExtra("KEY_WORKSPEC_ID", p1);
       return intent;
    }
    public static Intent g(Context p0,String p1){
       Intent intent = new Intent(p0, SystemAlarmService.class);
       intent.setAction("ACTION_STOP_WORK");
       intent.putExtra("KEY_WORKSPEC_ID", p1);
       return intent;
    }
    public static boolean n(Bundle p0,String[] p1){
       if (p0 == null || p0.isEmpty()) {
          return false;
       }
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          if (p0.get(p1[i]) == null) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public void d(String p0,boolean p1){
       a td = this.d;
       _monitor_enter(td);
       b uob = this.c.remove(p0);
       if (uob != null) {
          uob.d(p0, p1);
       }
       _monitor_exit(td);
       return;
    }
    public final void h(Intent p0,int p1,d p2){
       Object[] objArray = new Object[]{p0};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(a.e, String.format("Handling constraints changed %s", objArray), throwableArr);
       new b(this.b, p1, p2).a();
    }
    public final void i(Intent p0,int p1,d p2){
       a td = this.d;
       _monitor_enter(td);
       String str = p0.getExtras().getString("KEY_WORKSPEC_ID");
       String e = a.e;
       Object[] objArray = new Object[]{str};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(e, String.format("Handing delay met for %s", objArray), throwableArr);
       if (!this.c.containsKey(str)) {
          c uoc = new c(this.b, p1, str, p2);
          this.c.put(str, uoc);
          uoc.f();
       }else {
          Object[] objArray1 = new Object[]{str};
          Throwable[] throwableArr1 = new Throwable[0];
          h.c().a(e, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", objArray1), throwableArr1);
       }
       _monitor_exit(td);
       return;
    }
    public final void j(Intent p0,int p1){
       Bundle extras = p0.getExtras();
       String str = extras.getString("KEY_WORKSPEC_ID");
       Object[] objArray = new Object[]{p0,Integer.valueOf(p1)};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(a.e, String.format("Handling onExecutionCompleted %s, %s", objArray), throwableArr);
       this.d(str, extras.getBoolean("KEY_NEEDS_RESCHEDULE"));
    }
    public final void k(Intent p0,int p1,d p2){
       Object[] objArray = new Object[]{p0,Integer.valueOf(p1)};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(a.e, String.format("Handling reschedule %s, %s", objArray), throwableArr);
       p2.g().M();
    }
    public final void l(Intent p0,int p1,d p2){
       Throwable[] throwableArr1;
       Object[] objArray1;
       String str = p0.getExtras().getString("KEY_WORKSPEC_ID");
       String e = a.e;
       int i = 1;
       Object[] objArray = new Object[i];
       int i1 = 0;
       objArray[i1] = str;
       Throwable[] throwableArr = new Throwable[i1];
       h.c().a(e, String.format("Handling schedule work for %s", objArray), throwableArr);
       WorkDatabase workDatabase = p2.g().H();
       workDatabase.e();
       r or = workDatabase.O().j(str);
       String str1 = "Skipping scheduling ";
       if (or == null) {
          throwableArr1 = new Throwable[i1];
          h.c().h(e, str1+str+" because it\'s no longer in the DB", throwableArr1);
          workDatabase.k();
          return;
       }else if(or.b.isFinished()){
          throwableArr1 = new Throwable[i1];
          h.c().h(e, str1+str+"because it is finished.", throwableArr1);
          workDatabase.k();
          return;
       }else {
          long l = or.a();
          int i2 = 2;
          if (!or.b()) {
             objArray1 = new Object[i2];
             objArray1[i1] = str;
             objArray1[i] = Long.valueOf(l);
             Throwable[] throwableArr2 = new Throwable[i1];
             h.c().a(e, String.format("Setting up Alarms for %s at %s", objArray1), throwableArr2);
             a.c(this.b, p2.g(), str, l);
          }else {
             objArray1 = new Object[i2];
             objArray1[i1] = str;
             objArray1[i] = Long.valueOf(l);
             Throwable[] throwableArr3 = new Throwable[i1];
             h.c().a(e, String.format("Opportunistically setting an alarm for %s at %s", objArray1), throwableArr3);
             a.c(this.b, p2.g(), str, l);
             p2.k(new d$b(p2, a.a(this.b), p1));
          }
          workDatabase.C();
          workDatabase.k();
          return;
       }
    }
    public final void m(Intent p0,d p1){
       String str = p0.getExtras().getString("KEY_WORKSPEC_ID");
       Object[] objArray = new Object[]{str};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(a.e, String.format("Handing stopWork work for %s", objArray), throwableArr);
       p1.g().R(str);
       a.a(this.b, p1.g(), str);
       p1.d(str, 0);
    }
    public boolean o(){
       a td = this.d;
       _monitor_enter(td);
       boolean b = (!this.c.isEmpty())? true: false;
       _monitor_exit(td);
       return b;
    }
    public void p(Intent p0,int p1,d p2){
       Throwable[] throwableArr;
       String action = p0.getAction();
       if (("ACTION_CONSTRAINTS_CHANGED").equals(action)) {
          this.h(p0, p1, p2);
       }else if(("ACTION_RESCHEDULE").equals(action)){
          this.k(p0, p1, p2);
       }else {
          String[] stringArray = new String[]{"KEY_WORKSPEC_ID"};
          if (!a.n(p0.getExtras(), stringArray)) {
             Object[] objArray = new Object[]{action,"KEY_WORKSPEC_ID"};
             throwableArr = new Throwable[0];
             h.c().b(a.e, String.format("Invalid request for %s, requires %s.", objArray), throwableArr);
          }else if(("ACTION_SCHEDULE_WORK").equals(action)){
             this.l(p0, p1, p2);
          }else if(("ACTION_DELAY_MET").equals(action)){
             this.i(p0, p1, p2);
          }else if(("ACTION_STOP_WORK").equals(action)){
             this.m(p0, p2);
          }else if(("ACTION_EXECUTION_COMPLETED").equals(action)){
             this.j(p0, p1);
          }else {
             Object[] objArray1 = new Object[]{p0};
             throwableArr = new Throwable[0];
             h.c().h(a.e, String.format("Ignoring intent %s", objArray1), throwableArr);
          }
       }
       return;
    }
}
