package kshark.lite.HprofHeapGraph$classes$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kshark.lite.HprofHeapGraph;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import utd.e;
import kshark.lite.HeapObject$HeapClass;
import java.lang.String;
import kotlin.jvm.internal.a;
import std.i$a;

public final class HprofHeapGraph$classes$1 extends Lambda implements l	// class@001b95
{
    public final Ref$IntRef $objectIndex;
    public final HprofHeapGraph this$0;

    public void HprofHeapGraph$classes$1(HprofHeapGraph p0,Ref$IntRef p1){
       this.this$0 = p0;
       this.$objectIndex = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final HeapObject$HeapClass invoke(e p0){
       a.p(p0, "it");
       HprofHeapGraph$classes$1 t$objectInde = this.$objectIndex;
       Ref$IntRef element = t$objectInde.element;
       t$objectInde.element = element + 1;
       HeapObject$HeapClass heapClass = new HeapObject$HeapClass(this.this$0, p0.b(), p0.a(), element);
       return p0.b();
    }
}
