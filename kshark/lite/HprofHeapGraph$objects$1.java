package kshark.lite.HprofHeapGraph$objects$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kshark.lite.HprofHeapGraph;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import utd.e;
import kshark.lite.HeapObject;
import java.lang.String;
import kotlin.jvm.internal.a;
import std.i;

public final class HprofHeapGraph$objects$1 extends Lambda implements l	// class@001b98
{
    public final Ref$IntRef $objectIndex;
    public final HprofHeapGraph this$0;

    public void HprofHeapGraph$objects$1(HprofHeapGraph p0,Ref$IntRef p1){
       this.this$0 = p0;
       this.$objectIndex = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final HeapObject invoke(e p0){
       a.p(p0, "it");
       HprofHeapGraph$objects$1 t$objectInde = this.$objectIndex;
       Ref$IntRef element = t$objectInde.element;
       t$objectInde.element = element + 1;
       return this.this$0.A(element, p0.b(), p0.a());
    }
}
