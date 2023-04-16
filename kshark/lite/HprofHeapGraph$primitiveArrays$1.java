package kshark.lite.HprofHeapGraph$primitiveArrays$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kshark.lite.HprofHeapGraph;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import utd.e;
import kshark.lite.HeapObject$d;
import java.lang.String;
import kotlin.jvm.internal.a;
import std.i$d;

public final class HprofHeapGraph$primitiveArrays$1 extends Lambda implements l	// class@001b99
{
    public final Ref$IntRef $objectIndex;
    public final HprofHeapGraph this$0;

    public void HprofHeapGraph$primitiveArrays$1(HprofHeapGraph p0,Ref$IntRef p1){
       this.this$0 = p0;
       this.$objectIndex = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final HeapObject$d invoke(e p0){
       a.p(p0, "it");
       HprofHeapGraph$primitiveArrays$1 t$objectInde = this.$objectIndex;
       Ref$IntRef element = t$objectInde.element;
       t$objectInde.element = element + 1;
       HeapObject$d uod = new HeapObject$d(this.this$0, p0.b(), p0.a(), element);
       return p0.b();
    }
}
