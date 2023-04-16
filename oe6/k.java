package oe6.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.preference.b;
import java.lang.Runnable;
import com.kwai.framework.init.c;
import oe6.k$a;
import vid.d;
import oe6.i;
import vid.c;
import oe6.j;
import km8.b;
import oe6.o;
import java.lang.System;
import java.lang.Thread;

public class k	// class@00201a
{
    public static boolean a;

    public void k(){
       super();
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, k.class, "3")) {
          return;
       }
       c.d(b.b);
       return;
    }
    public void a(){
       k ok = k.class;
       if (PatchProxy.applyVoid(null, this, ok, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, ok, "2") && !k.a) {
          k.a = true;
          d.a = new k$a();
          c.a = new i(this);
          b.a = new j(this);
          if (!PatchProxy.applyVoid(null, null, o.class, "1")) {
             o.a = System.currentTimeMillis();
             o.b = Thread.currentThread().getId();
          }
       }
       return;
    }
}
