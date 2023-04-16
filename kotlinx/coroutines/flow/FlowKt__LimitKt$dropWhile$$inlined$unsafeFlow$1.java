package kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1;
import jtd.d;
import msd.p;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1$lambda$1;
import csd.b;
import qrd.l1;

public final class FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1 implements d	// class@001a22
{
    public final d a;
    public final p b;

    public void FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1(d p0,p p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object b(e p0,c p1){
       Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
       uBooleanRef.element = false;
       p0 = this.a.b(new FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1$lambda$1(p0, uBooleanRef, this), p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
}
