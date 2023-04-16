package p3.b;
import l3.e;
import java.lang.String;
import k3.h;
import android.content.Context;
import l3.i;
import java.lang.Object;
import android.app.job.JobScheduler;
import p3.a;
import java.util.List;
import java.util.Iterator;
import android.app.job.JobInfo;
import java.util.Locale;
import java.lang.Integer;
import java.lang.Throwable;
import java.util.ArrayList;
import android.content.ComponentName;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.lang.Class;
import android.os.PersistableBundle;
import u3.r;
import androidx.work.impl.WorkDatabase;
import v3.c;
import androidx.room.RoomDatabase;
import u3.s;
import java.lang.StringBuilder;
import androidx.work.WorkInfo$State;
import u3.j;
import u3.i;
import k3.a;
import android.os.Build$VERSION;
import ig6.c;

public class b implements e	// class@0028ae
{
    public final Context b;
    public final JobScheduler c;
    public final i d;
    public final a e;
    public static final String f;

    static {
       b.f = h.f("SystemJobScheduler");
    }
    public void b(Context p0,i p1){
       super(p0, p1, p0.getSystemService("jobscheduler"), new a(p0));
    }
    public void b(Context p0,i p1,JobScheduler p2,a p3){
       super();
       this.b = p0;
       this.d = p1;
       this.c = p2;
       this.e = p3;
    }
    public static void c(Context p0){
       JobScheduler systemServic = p0.getSystemService("jobscheduler");
       if (systemServic != null) {
          List list = b.g(p0, systemServic);
          if (list != null && !list.isEmpty()) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                b.e(systemServic, iterator.next().getId());
             }
          }
       }
       return;
    }
    public static void d(Context p0){
       JobScheduler systemServic = p0.getSystemService("jobscheduler");
       if (systemServic != null) {
          List list = b.g(p0, systemServic);
          if (list != null && !list.isEmpty()) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                JobInfo jobInfo = iterator.next();
                if (b.h(jobInfo) == null) {
                   b.e(systemServic, jobInfo.getId());
                }
             }
          }
       }
       return;
    }
    public static void e(JobScheduler p0,int p1){
       p0.cancel(p1);
       return;
    }
    public static List f(Context p0,JobScheduler p1,String p2){
       List list = b.g(p0, p1);
       if (list == null) {
          return null;
       }
       ArrayList uArrayList = new ArrayList(2);
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          JobInfo jobInfo = iterator.next();
          if (p2.equals(b.h(jobInfo))) {
             uArrayList.add(Integer.valueOf(jobInfo.getId()));
          }
       }
       return uArrayList;
    }
    public static List g(Context p0,JobScheduler p1){
       List list = null;
       List allPendingJo = p1.getAllPendingJobs();
       if (allPendingJo == null) {
          return list;
       }
       ArrayList uArrayList = new ArrayList(allPendingJo.size());
       ComponentName uComponentNa = new ComponentName(p0, SystemJobService.class);
       Iterator iterator = allPendingJo.iterator();
       while (iterator.hasNext()) {
          JobInfo jobInfo = iterator.next();
          if (uComponentNa.equals(jobInfo.getService())) {
             uArrayList.add(jobInfo);
          }
       }
       return uArrayList;
    }
    public static String h(JobInfo p0){
       try{
          PersistableBundle extras = p0.getExtras();
          if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
             return extras.getString("EXTRA_WORK_SPEC_ID");
          }
          return null;
       }catch(java.lang.NullPointerException e0){
       }
    }
    public void a(r[] p0){
       Throwable[] throwableArr;
       i b;
       WorkDatabase workDatabase = this.d.H();
       c uoc = new c(workDatabase);
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          workDatabase.e();
          r or = workDatabase.O().j(oobject.a);
          String str = "Skipping scheduling ";
          if (or == null) {
             throwableArr = new Throwable[0];
             h.c().h(b.f, str+oobject.a+" because it\'s no longer in the DB", throwableArr);
             workDatabase.C();
          }else if(or.b != WorkInfo$State.ENQUEUED){
             throwableArr = new Throwable[0];
             h.c().h(b.f, str+oobject.a+" because it is no longer enqueued", throwableArr);
             workDatabase.C();
          }else {
             i oi = workDatabase.L().b(oobject.a);
             b = (oi != null)? oi.b: uoc.d(this.d.B().f(), this.d.B().d());
             if (oi == null) {
                this.d.H().L().a(new i(oobject.a, b));
             }
             this.i(oobject, b);
             if (Build$VERSION.SDK_INT == 23) {
                List list = b.f(this.b, this.c, oobject.a);
                if (list != null) {
                   int i1 = list.indexOf(Integer.valueOf(b));
                   if (i1 >= 0) {
                      list.remove(i1);
                   }
                   int i2 = (!list.isEmpty())? list.get(0).intValue(): uoc.d(this.d.B().f(), this.d.B().d());
                   this.i(oobject, i2);
                }
             }
             workDatabase.C();
          }
          workDatabase.k();
       }
       return;
    }
    public boolean b(){
       return true;
    }
    public void cancel(String p0){
       List list = b.f(this.b, this.c, p0);
       if (list != null && !list.isEmpty()) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             b.e(this.c, iterator.next().intValue());
          }
          this.d.H().L().c(p0);
       }
       return;
    }
    public void i(r p0,int p1){
       Object[] objArray = new Object[]{p0.a,Integer.valueOf(p1)};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(b.f, String.format("Scheduling work ID %s Job ID %s", objArray), throwableArr);
       this.c.schedule(this.e.a(p0, p1));
    }
}
