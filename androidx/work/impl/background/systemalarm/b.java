package androidx.work.impl.background.systemalarm.b;
import java.lang.String;
import k3.h;
import android.content.Context;
import androidx.work.impl.background.systemalarm.d;
import java.lang.Object;
import x3.a;
import q3.d;
import q3.c;
import l3.i;
import androidx.work.impl.WorkDatabase;
import u3.s;
import java.util.List;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import java.lang.Iterable;
import java.util.ArrayList;
import java.lang.System;
import java.util.Iterator;
import u3.r;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.a;
import java.lang.Throwable;
import androidx.work.impl.background.systemalarm.d$b;
import java.lang.Runnable;

public class b	// class@000a7c
{
    public final Context a;
    public final int b;
    public final d c;
    public final d d;
    public static final String e;

    static {
       b.e = h.f("ConstraintsCmdHandler");
    }
    public void b(Context p0,int p1,d p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = new d(p0, p2.f(), null);
    }
    public void a(){
       r a;
       List list = this.c.g().H().O().A();
       ConstraintProxy.a(this.a, list);
       this.d.d(list);
       ArrayList uArrayList = new ArrayList(list.size());
       long l = System.currentTimeMillis();
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          r or = iterator.next();
          a = or.a;
          if (l - or.a() >= 0 && (!or.b() || this.d.c(a))) {
             uArrayList.add(or);
          }
       }
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          r a1 = iterator.next().a;
          Intent intent = a.b(this.a, a1);
          Object[] objArray = new Object[]{a1};
          String str = String.format("Creating a delay_met command for workSpec with id \(%s\)", objArray);
          Throwable[] throwableArr = new Throwable[0];
          h.c().a(b.e, str, throwableArr);
          b tc = this.c;
          tc.k(new d$b(tc, intent, this.b));
       }
       this.d.e();
       return;
    }
}
