package yf7.p;
import java.util.concurrent.CopyOnWriteArrayList;
import android.app.Application;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import androidx.lifecycle.LifecycleEventObserver;

public final class p	// class@0028a7
{
    public static WeakReference a;
    public static boolean b;
    public static final CopyOnWriteArrayList c;

    static {
       p.c = new CopyOnWriteArrayList();
    }
    public static final Activity a(Application p0){
       WeakReference a;
       a.q(p0, "$this$currentActivity");
       a = p.a;
       Activity uActivity = (a != null)? a.get(): null;
       return uActivity;
    }
    public static final boolean b(Application p0){
       a.q(p0, "$this$isForeground");
       return p.b;
    }
    public static final boolean c(Application p0,LifecycleEventObserver p1){
       a.q(p0, "$this$registerProcessLifecycleObserver");
       a.q(p1, "observer");
       return p.c.add(p1);
    }
}
