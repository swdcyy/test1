package com.facebook.common.statfs.StatFsHelper;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.io.File;
import android.os.Environment;
import android.os.SystemClock;
import android.os.StatFs;
import java.lang.String;
import java.lang.Throwable;
import java.lang.RuntimeException;
import com.facebook.common.internal.e;

public class StatFsHelper	// class@000453
{
    public StatFs a;
    public File b;
    public StatFs c;
    public File d;
    public long e;
    public final Lock f;
    public boolean g;
    public static StatFsHelper h;
    public static final long i;

    static {
       StatFsHelper.i = TimeUnit.MINUTES.toMillis(2);
    }
    public void StatFsHelper(){
       super();
       this.a = null;
       this.c = null;
       this.g = false;
       this.f = new ReentrantLock();
    }
    public final void a(){
       if (this.g == null) {
          this.f.lock();
          if (this.g == null) {
             this.b = Environment.getDataDirectory();
             this.d = Environment.getExternalStorageDirectory();
             this.c();
             this.g = true;
          }
          this.f.unlock();
       }
       return;
    }
    public final void b(){
       if (this.f.tryLock()) {
          if ((SystemClock.uptimeMillis() - this.e) - StatFsHelper.i > 0) {
             this.c();
          }
          this.f.unlock();
       }
       return;
    }
    public final void c(){
       this.a = this.d(this.a, this.b);
       this.c = this.d(this.c, this.d);
       this.e = SystemClock.uptimeMillis();
    }
    public final StatFs d(StatFs p0,File p1){
       StatFs statFs = null;
       if (p1 != null && p1.exists()) {
          try{
             if (p0 == null) {
                p0 = new StatFs(p1.getAbsolutePath());
             }else {
                p0.restat(p1.getAbsolutePath());
             }
             statFs = p0;
          }catch(java.lang.IllegalArgumentException e0){
          }
       }
       return statFs;
    }
}
