package com.kwai.framework.preference.b;
import java.lang.Runnable;
import java.lang.Object;
import vid.d;
import oe6.k$a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import z1.e;
import k2b.u1;
import com.kwai.framework.preference.a;

public final class b implements Runnable	// class@000cd4
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void run(){
       d$a a = d.a;
       if (a instanceof k$a) {
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(null, a, k$a.class, "2")) {
             Iterator iterator = a.a.iterator();
             while (iterator.hasNext()) {
                e uoe = iterator.next();
                u1.X(uoe.a, uoe.b);
             }
             a.a.clear();
          }
          d.a = a.a;
       }
       return;
    }
}
