package kotlinx.coroutines.flow.FlowKt__ZipKt;
import java.lang.Iterable;
import msd.p;
import jtd.d;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Object;
import java.util.Collection;
import kotlin.jvm.internal.a;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$6;
import kotlin.TypeCastException;
import java.lang.String;
import msd.t;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combine$3;
import msd.s;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combine$2;
import msd.r;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combine$1;
import msd.q;
import jtd.f;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$5;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7;
import asd.c;
import msd.u;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$4;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$3;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$2;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$1;
import kotlinx.coroutines.flow.internal.CombineKt;

public final class FlowKt__ZipKt	// class@001b01
{

    public static final d a(Iterable p0,p p1){
       d[] uodArray = new d[0];
       Object[] objArray = CollectionsKt___CollectionsKt.G5(p0).toArray(uodArray);
       if (objArray == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
       }
       a.w();
       return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$6(objArray, p1);
    }
    public static final d b(d p0,d p1,d p2,d p3,d p4,t p5){
       d[] uodArray = new d[]{p0,p1,p2,p3,p4};
       return new FlowKt__ZipKt$combine$$inlined$combine$3(uodArray, p5);
    }
    public static final d c(d p0,d p1,d p2,d p3,s p4){
       d[] uodArray = new d[]{p0,p1,p2,p3};
       return new FlowKt__ZipKt$combine$$inlined$combine$2(uodArray, p4);
    }
    public static final d d(d p0,d p1,d p2,r p3){
       d[] uodArray = new d[]{p0,p1,p2};
       return new FlowKt__ZipKt$combine$$inlined$combine$1(uodArray, p3);
    }
    public static final d e(d p0,d p1,q p2){
       return f.G0(p0, p1, p2);
    }
    public static final d f(d[] p0,p p1){
       a.w();
       return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$5(p0, p1);
    }
    public static final d g(Iterable p0,q p1){
       d[] uodArray = new d[0];
       Object[] objArray = CollectionsKt___CollectionsKt.G5(p0).toArray(uodArray);
       if (objArray == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
       }
       a.w();
       return f.F0(new FlowKt__ZipKt$combineTransform$7(objArray, p1, null));
    }
    public static final d h(d p0,d p1,d p2,d p3,d p4,u p5){
       d[] uodArray = new d[]{p0,p1,p2,p3,p4};
       return f.F0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransform$4(uodArray, null, p5));
    }
    public static final d i(d p0,d p1,d p2,d p3,t p4){
       d[] uodArray = new d[]{p0,p1,p2,p3};
       return f.F0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransform$3(uodArray, null, p4));
    }
    public static final d j(d p0,d p1,d p2,s p3){
       d[] uodArray = new d[]{p0,p1,p2};
       return f.F0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransform$2(uodArray, null, p3));
    }
    public static final d k(d p0,d p1,r p2){
       d[] uodArray = new d[]{p0,p1};
       return f.F0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransform$1(uodArray, null, p2));
    }
    public static final d l(d[] p0,q p1){
       a.w();
       return f.F0(new FlowKt__ZipKt$combineTransform$6(p0, p1, null));
    }
    public static final d m(d p0,d p1,q p2){
       return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(p0, p1, p2);
    }
    public static final d n(d p0,d p1,r p2){
       return f.F0(new FlowKt__ZipKt$combineTransform$1(p0, p1, p2, null));
    }
    public static final d o(d p0,d p1,q p2){
       return CombineKt.g(p0, p1, p2);
    }
}
