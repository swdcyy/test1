package kotlinx.coroutines.flow.internal.CombineKt;
import ftd.k0;
import jtd.d;
import htd.y;
import kotlinx.coroutines.flow.internal.CombineKt$asChannel$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import java.lang.Object;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.flow.internal.CombineKt$asFairChannel$1;
import jtd.e;
import msd.a;
import msd.q;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;
import ftd.l0;
import csd.b;
import qrd.l1;
import msd.r;
import kotlinx.coroutines.flow.internal.CombineKt$combineTransformInternal$2;
import ltd.e0;
import ktd.j;
import otd.a;
import otd.d;
import kotlinx.coroutines.flow.internal.CombineKt$onReceive$1;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1;

public final class CombineKt	// class@001b26
{

    public static final y a(k0 p0,d p1){
       return ProduceKt.f(p0, null, 0, new CombineKt$asChannel$1(p1, null), 3, null);
    }
    public static final y b(k0 p0,d p1){
       return ProduceKt.f(p0, null, 0, new CombineKt$asFairChannel$1(p1, null), 3, null);
    }
    public static final Object c(e p0,d[] p1,a p2,q p3,c p4){
       CombineKt$combineInternal$2 uocombineInt = new CombineKt$combineInternal$2(p0, p1, p2, p3, null);
       p0 = l0.g(v6, p4);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public static final Object d(e p0,d p1,d p2,r p3,c p4){
       CombineKt$combineTransformInternal$2 uocombineTra = new CombineKt$combineTransformInternal$2(p0, p1, p2, p3, null);
       p0 = l0.g(v6, p4);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public static final e0 e(){
       return j.a;
    }
    public static final void f(a p0,boolean p1,y p2,a p3,p p4){
       if (p1) {
          return;
       }
       p0.f(p2.B(), new CombineKt$onReceive$1(p3, p4, null));
       return;
    }
    public static final d g(d p0,d p1,q p2){
       return new CombineKt$zipImpl$$inlined$unsafeFlow$1(p0, p1, p2);
    }
}
