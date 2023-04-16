package kotlinx.coroutines.flow.FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3;
import jtd.d;
import msd.l;
import msd.p;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import ktd.j;
import kotlinx.coroutines.flow.FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$lambda$1;
import csd.b;
import qrd.l1;
import nsd.c0;
import kotlinx.coroutines.flow.FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$1;

public final class FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3 implements d	// class@0019fd
{
    public final d a;
    public final l b;
    public final p c;

    public void FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3(d p0,l p1,p p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public Object b(e p0,c p1){
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       objectRef.element = j.a;
       p0 = this.a.b(new FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$lambda$1(p0, objectRef, this), p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public Object c(e p0,c p1){
       c0.e(4);
       FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$1 uodistinctUn = new FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$1(this, p1);
       c0.e(5);
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       objectRef.element = j.a;
       c0.e(0);
       this.a.b(new FlowKt__DistinctKt$distinctUntilChangedBy$$inlined$unsafeFlow$3$lambda$1(p0, objectRef, this), p1);
       c0.e(2);
       c0.e(1);
       return l1.a;
    }
}
