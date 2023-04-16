package ftd.c;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ftd.r0;
import java.lang.Object;
import asd.c;
import ftd.l;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import ftd.c$a;
import java.lang.Integer;
import dsd.a;
import java.lang.Number;
import ftd.z1;
import ftd.k;
import msd.l;
import ftd.c1;
import ftd.c$b;
import csd.b;
import dsd.e;

public final class c	// class@000e7a
{
    public final r0[] a;
    public int notCompletedCount;
    public static final AtomicIntegerFieldUpdater b;

    static {
       c.b = AtomicIntegerFieldUpdater.newUpdater(c.class, "notCompletedCount");
    }
    public void c(r0[] p0){
       super();
       this.a = p0;
       this.notCompletedCount = p0.length;
    }
    public final Object a(c p0){
       l ol = new l(IntrinsicsKt__IntrinsicsJvmKt.d(p0), 1);
       ol.u();
       int len = this.a.length;
       c$a[] uoaArray = new c$a[len];
       int i = 0;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          object oobject = this.a[a.f(i1).intValue()];
          oobject.start();
          c$a uoa = new c$a(this, ol, oobject);
          uoa.f0(oobject.S(uoa));
          uoaArray[i1] = uoa;
       }
       c$b uob = new c$b(this, uoaArray);
       for (; i < len; i = i + 1) {
          uoaArray[i].e0(uob);
       }
       if (ol.c()) {
          uob.b();
       }else {
          ol.w(uob);
       }
       Object obj = ol.r();
       if (obj == b.h()) {
          e.c(p0);
       }
       return obj;
    }
}
