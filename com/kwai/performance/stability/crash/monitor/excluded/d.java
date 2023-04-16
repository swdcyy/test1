package com.kwai.performance.stability.crash.monitor.excluded.d;
import sg7.d;
import android.os.Handler;
import android.os.Looper;
import sg7.b;
import sg7.a;
import com.kwai.performance.stability.crash.monitor.excluded.d$a;
import java.lang.Exception;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.CharSequence;
import sg7.e;
import java.lang.Runnable;

public class d extends d	// class@0011db
{
    public static final Handler f;

    static {
       d.f = new Handler(Looper.getMainLooper());
    }
    public void d(b p0){
       super(p0);
    }
    public static a e(){
       return new d$a();
    }
    public boolean b(Exception p0){
       boolean b = (p0 instanceof NullPointerException && (p0.getMessage() != null && (p0.getMessage()).contains("dispatchPointerEvent")))? true: false;
       return b;
    }
    public void d(){
       if (this.a()) {
          return;
       }
       d.f.postAtFrontOfQueue(new e(this));
       return;
    }
}
