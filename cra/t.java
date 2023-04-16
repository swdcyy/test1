package cra.t;
import java.lang.Runnable;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import cra.u;

public final class t implements Runnable	// class@00238d
{
    public final WeakReference b;

    public void t(WeakReference p0){
       this.b = p0;
    }
    public final void run(){
       t tb = this.b;
       String str = u.c(tb.get());
       u.c = str;
       u.a(tb, "app_launch_referrer_event", str, true);
    }
}
