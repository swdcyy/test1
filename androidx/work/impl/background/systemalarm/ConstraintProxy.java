package androidx.work.impl.background.systemalarm.ConstraintProxy;
import android.content.BroadcastReceiver;
import java.lang.String;
import k3.h;
import android.content.Context;
import java.util.List;
import java.util.Iterator;
import java.lang.Object;
import u3.r;
import k3.b;
import androidx.work.NetworkType;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.lang.Throwable;
import androidx.work.impl.background.systemalarm.a;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;

public abstract class ConstraintProxy extends BroadcastReceiver	// class@000a75
{
    public static final String a;

    static {
       ConstraintProxy.a = h.f("ConstraintProxy");
    }
    public void ConstraintProxy(){
       super();
    }
    public static void a(Context p0,List p1){
       Iterator iterator = p1.iterator();
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (iterator.hasNext()) {
          r j = iterator.next().j;
          i = i | j.f();
          i1 = i1 | j.g();
          i2 = i2 | j.i();
          int i4 = (j.b() != NetworkType.NOT_REQUIRED)? 1: 0;
          i3 = i3 | i4;
          if (i && (i1 && (i2 && i3))) {
             break ;
          }
       }
       p0.sendBroadcast(ConstraintProxyUpdateReceiver.a(p0, i, i1, i2, i3));
       return;
    }
    public void onReceive(Context p0,Intent p1){
       Object[] objArray = new Object[]{p1};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(ConstraintProxy.a, String.format("onReceive : %s", objArray), throwableArr);
       a.e(p0, a.a(p0));
    }
}
