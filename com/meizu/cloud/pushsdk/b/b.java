package com.meizu.cloud.pushsdk.b.b;
import com.meizu.cloud.pushsdk.b.f;
import java.lang.Object;
import java.text.SimpleDateFormat;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import android.os.Handler;
import android.os.Looper;
import java.lang.StringBuilder;
import java.io.File;
import android.os.Environment;
import com.meizu.cloud.pushsdk.b.e;
import android.os.Process;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import com.meizu.cloud.pushsdk.b.j;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import com.meizu.cloud.pushsdk.b.b$a;
import java.lang.Exception;
import java.lang.Throwable;
import android.util.Log;
import com.meizu.cloud.pushsdk.b.b$2;
import java.lang.Runnable;
import com.meizu.cloud.pushsdk.b.b$1;

public class b implements f	// class@0014a3
{
    public final SimpleDateFormat a;
    public final List b;
    public final Handler c;
    public long d;
    public int e;
    public final e f;
    public String g;
    public final String h;
    public boolean i;
    public ThreadPoolExecutor j;

    public void b(){
       super();
       this.d = 60;
       this.e = 10;
       this.i = false;
       this.a = new SimpleDateFormat("MM-dd HH:mm:ss");
       this.b = Collections.synchronizedList(new ArrayList());
       this.c = new Handler(Looper.getMainLooper());
       this.g = Environment.getExternalStorageDirectory().getAbsolutePath()+"/Android/data/pushSdk/defaultLog";
       this.f = new e();
       this.h = String.valueOf(Process.myPid());
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new j().a("log-pool-%d").a());
       this.j = v0;
       v0.allowCoreThreadTimeOut(true);
    }
    public static List a(b p0){
       return p0.b;
    }
    public static Handler b(b p0){
       return p0.c;
    }
    public static String c(b p0){
       return p0.g;
    }
    public static e d(b p0){
       return p0.f;
    }
    public static SimpleDateFormat e(b p0){
       return p0.a;
    }
    public static String f(b p0){
       return p0.h;
    }
    public final void a(b$a p0){
       try{
          this.b.add(p0);
       }catch(java.lang.Exception e2){
          e2.getMessage();
       }
       return;
    }
    public void a(String p0){
       this.g = p0;
    }
    public void a(String p0,String p1){
       b tb = this.b;
       _monitor_enter(tb);
       this.b();
       this.a(new b$a(this, "D", p0, p1));
       this.c();
       _monitor_exit(tb);
    }
    public void a(String p0,String p1,Throwable p2){
       b tb = this.b;
       _monitor_enter(tb);
       this.b();
       this.a(new b$a(this, "E", p0, p1+"\n"+Log.getStackTraceString(p2)));
       this.c();
       _monitor_exit(tb);
    }
    public void a(boolean p0){
       b$2 u2 = new b$2(this);
       if (p0) {
          b tj = this.j;
          if (tj != null) {
             tj.execute(u2);
          label_0012 :
             return;
          }
       }
       u2.run();
       goto label_0012 ;
    }
    public boolean a(){
       return this.i;
    }
    public final void b(){
       if (!this.b.size()) {
          this.c.postDelayed(new b$1(this), (this.d * 1000));
       }
       return;
    }
    public void b(String p0,String p1){
       b tb = this.b;
       _monitor_enter(tb);
       this.b();
       this.a(new b$a(this, "I", p0, p1));
       this.c();
       _monitor_exit(tb);
    }
    public void b(boolean p0){
       this.i = p0;
    }
    public final void c(){
       if (this.b.size() == this.e) {
          this.a(true);
       }
       return;
    }
    public void c(String p0,String p1){
       b tb = this.b;
       _monitor_enter(tb);
       this.b();
       this.a(new b$a(this, "W", p0, p1));
       this.c();
       _monitor_exit(tb);
    }
    public void d(String p0,String p1){
       b tb = this.b;
       _monitor_enter(tb);
       this.b();
       this.a(new b$a(this, "E", p0, p1));
       this.c();
       _monitor_exit(tb);
    }
}
