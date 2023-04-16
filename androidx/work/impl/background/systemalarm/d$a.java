package androidx.work.impl.background.systemalarm.d$a;
import java.lang.Runnable;
import androidx.work.impl.background.systemalarm.d;
import java.lang.Object;
import java.util.List;
import android.content.Intent;
import java.lang.String;
import k3.h;
import java.lang.Integer;
import java.lang.Throwable;
import android.content.Context;
import android.os.PowerManager$WakeLock;
import v3.m;
import androidx.work.impl.background.systemalarm.a;
import androidx.work.impl.background.systemalarm.d$d;

public class d$a implements Runnable	// class@000a7e
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void run(){
       d i = this.b.i;
       _monitor_enter(i);
       d$a tb = this.b;
       int i1 = 0;
       tb.j = tb.i.get(i1);
       _monitor_exit(i);
       i = this.b.j;
       if (i != null) {
          String action = i.getAction();
          int intExtra = this.b.j.getIntExtra("KEY_START_ID", i1);
          String l = d.l;
          Object[] objArray = new Object[]{this.b.j,Integer.valueOf(intExtra)};
          Throwable[] throwableArr = new Throwable[i1];
          h.c().a(l, String.format("Processing command %s, %s", objArray), throwableArr);
          objArray = new Object[]{action,Integer.valueOf(intExtra)};
          PowerManager$WakeLock wakeLock = m.b(this.b.b, String.format("%s \(%s\)", objArray));
          Object[] objArray1 = new Object[]{action,wakeLock};
          Throwable[] throwableArr1 = new Throwable[i1];
          h.c().a(l, String.format("Acquiring operation wake lock \(%s\) %s", objArray1), throwableArr1);
          wakeLock.acquire();
          d$a tb1 = this.b;
          tb1.g.p(tb1.j, intExtra, tb1);
          Object[] objArray2 = new Object[]{action,wakeLock};
          Throwable[] throwableArr2 = new Throwable[i1];
          h.c().a(l, String.format("Releasing operation wake lock \(%s\) %s", objArray2), throwableArr2);
          wakeLock.release();
          d$a tb2 = this.b;
          d$d uod = new d$d(tb2);
          tb2.k(uod);
       }
       return;
    }
}
