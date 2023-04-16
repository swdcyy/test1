package androidx.core.app.JobIntentService;
import android.app.Service;
import java.lang.Object;
import java.util.HashMap;
import android.os.Build$VERSION;
import java.util.ArrayList;
import android.content.Context;
import android.content.ComponentName;
import androidx.core.app.JobIntentService$h;
import androidx.core.app.JobIntentService$g;
import java.lang.IllegalArgumentException;
import java.lang.String;
import androidx.core.app.JobIntentService$c;
import androidx.core.app.JobIntentService$e;
import androidx.core.app.JobIntentService$b;
import android.os.AsyncTask;
import androidx.core.app.JobIntentService$a;
import java.lang.Void;
import java.util.concurrent.Executor;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.JobIntentService$f;
import java.lang.Class;
import androidx.core.app.JobIntentService$d;

public abstract class JobIntentService extends Service	// class@0006dc
{
    public JobIntentService$b b;
    public JobIntentService$h c;
    public JobIntentService$a d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public static final Object i;
    public static final HashMap j;

    static {
       JobIntentService.i = new Object();
       JobIntentService.j = new HashMap();
    }
    public void JobIntentService(){
       super();
       this.e = false;
       this.f = false;
       this.g = false;
       this.h = (Build$VERSION.SDK_INT >= 26)? null: new ArrayList();
       return;
    }
    public static JobIntentService$h d(Context p0,ComponentName p1,boolean p2,int p3){
       JobIntentService$g og;
       HashMap j = JobIntentService.j;
       JobIntentService$h oh = j.get(p1);
       if (oh == null) {
          if (Build$VERSION.SDK_INT >= 26) {
             if (p2) {
                og = new JobIntentService$g(p0, p1, p3);
             }else {
                throw new IllegalArgumentException("Can\'t be here without a job id");
             }
          }else {
             og = new JobIntentService$c(p0, p1);
          }
          oh = og;
          j.put(p1, oh);
       }
       return oh;
    }
    public JobIntentService$e a(){
       JobIntentService tb = this.b;
       if (tb != null) {
          return tb.b();
       }
       tb = this.h;
       _monitor_enter(tb);
       if (this.h.size() > 0) {
          _monitor_exit(tb);
          return this.h.remove(0);
       }else {
          _monitor_exit(tb);
          return null;
       }
    }
    public boolean b(){
       JobIntentService td = this.d;
       if (td != null) {
          td.cancel(this.e);
       }
       this.f = true;
       return true;
    }
    public void c(boolean p0){
       if (this.d == null) {
          this.d = new JobIntentService$a(this);
          JobIntentService tc = this.c;
          if (tc != null && p0) {
             tc.d();
          }
          Void[] voidArray = new Void[0];
          this.d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
       }
       return;
    }
    public abstract void e(Intent p0);
    public void f(){
       JobIntentService th = this.h;
       if (th != null) {
          _monitor_enter(th);
          this.d = null;
          JobIntentService th1 = this.h;
          if (th1 != null && th1.size() > 0) {
             this.c(false);
          }else if(this.g == null){
             this.c.c();
          }
          _monitor_exit(th);
       }
       return;
    }
    public IBinder onBind(Intent p0){
       JobIntentService tb = this.b;
       if (tb != null) {
          return tb.a();
       }
       return null;
    }
    public void onCreate(){
       super.onCreate();
       JobIntentService$h oh = null;
       if (Build$VERSION.SDK_INT >= 26) {
          this.b = new JobIntentService$f(this);
          this.c = oh;
       }else {
          this.b = oh;
          this.c = JobIntentService.d(this, new ComponentName(this, this.getClass()), false, false);
       }
       return;
    }
    public void onDestroy(){
       super.onDestroy();
       JobIntentService th = this.h;
       if (th != null) {
          _monitor_enter(th);
          this.g = true;
          this.c.c();
          _monitor_exit(th);
       }
       return;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       if (this.h == null) {
          return 2;
       }
       this.c.e();
       JobIntentService th = this.h;
       _monitor_enter(th);
       JobIntentService th1 = this.h;
       if (p0 == null) {
          p0 = new Intent();
       }
       th1.add(new JobIntentService$d(this, p0, p2));
       this.c(true);
       _monitor_exit(th);
       return 3;
    }
}
