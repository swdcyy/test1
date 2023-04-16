package com.kwai.sharelib.f;
import java.lang.Runnable;
import com.kwai.sharelib.a$o;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import uo7.a0;
import kotlin.jvm.internal.Ref$ObjectRef;
import crd.b;
import com.kwai.sharelib.a;
import au6.e;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import uo7.j0;
import java.util.Collection;
import brd.t;
import uo7.h;

public final class f implements Runnable	// class@0016c2
{
    public final a$o b;
    public final List c;

    public void f(a$o p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       e a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "1")) {
          return;
       }
       a$o c = this.b.c;
       if (c != null) {
          f tc = this.c;
          a.o(tc, "it");
          c.dd(tc);
          tc = this.b;
          tc.b.b(tc.d.element);
          c.show();
          a = e.a;
          StringBuilder str = "showSharePanel show is called, controller is "+c.getClass().getCanonicalName()+" with operations are: ";
          f tc1 = this.c;
          a.o(tc1, "it");
          ArrayList uArrayList = new ArrayList(u.Y(tc1, 10));
          Iterator iterator = tc1.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().c());
          }
          e.d(a, objArray, str+uArrayList, 1, objArray);
          a c1 = this.b.b.c;
          if (c1 != null) {
             t ot = c1.a();
             if (ot != null) {
                c.L6(ot);
             }
          }
       }
       return;
    }
}
