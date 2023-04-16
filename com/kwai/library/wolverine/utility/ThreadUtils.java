package com.kwai.library.wolverine.utility.ThreadUtils;
import android.os.Handler;
import android.os.Looper;
import com.kwai.library.wolverine.utility.ThreadUtils$ACTION_HANDLER$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.String;
import kotlin.jvm.internal.a;
import v27.a;
import v27.c;

public final class ThreadUtils	// class@000ace
{
    public static final Handler a;
    public static final p b;
    public static final ThreadUtils c;

    static {
       ThreadUtils.c = new ThreadUtils();
       ThreadUtils.a = new Handler(Looper.getMainLooper());
       ThreadUtils.b = s.c(ThreadUtils$ACTION_HANDLER$2.INSTANCE);
    }
    public void ThreadUtils(){
       super();
    }
    public final Handler a(){
       return ThreadUtils.b.getValue();
    }
    public final void b(Runnable p0){
       String str = "action";
       a.p(p0, str);
       if (c.b().c()) {
          a.p(p0, str);
          this.a().removeCallbacks(p0);
       }else {
          a.p(p0, str);
          ThreadUtils.a.removeCallbacks(p0);
       }
       return;
    }
    public final void c(Runnable p0,long p1){
       String str = "action";
       a.p(p0, str);
       if (c.b().c()) {
          a.p(p0, str);
          this.a().postDelayed(p0, p1);
       }else {
          a.p(p0, str);
          ThreadUtils.a.postDelayed(p0, p1);
       }
       return;
    }
    public final void d(Runnable p0){
       a.p(p0, "action");
       if (a.g(Looper.getMainLooper(), Looper.myLooper())) {
          p0.run();
       }else {
          ThreadUtils.a.post(p0);
       }
       return;
    }
}
