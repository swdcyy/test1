package kotlinx.coroutines.flow.FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1;
import jtd.d;
import msd.q;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import ktd.j;
import kotlinx.coroutines.flow.FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1$lambda$1;
import csd.b;
import qrd.l1;

public final class FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1 implements d	// class@001aad
{
    public final d a;
    public final q b;

    public void FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1(d p0,q p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object b(e p0,c p1){
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       objectRef.element = j.a;
       p0 = this.a.b(new FlowKt__TransformKt$scanReduce$$inlined$unsafeFlow$1$lambda$1(p0, objectRef, this), p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
}
