package kshark.lite.HprofHeapGraph$instances$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kshark.lite.HprofHeapGraph;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import utd.e;
import kshark.lite.HeapObject$b;
import java.lang.String;
import kotlin.jvm.internal.a;
import std.i$b;

public final class HprofHeapGraph$instances$1 extends Lambda implements l	// class@001b96
{
    public final Ref$IntRef $objectIndex;
    public final HprofHeapGraph this$0;

    public void HprofHeapGraph$instances$1(HprofHeapGraph p0,Ref$IntRef p1){
       this.this$0 = p0;
       this.$objectIndex = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final HeapObject$b invoke(e p0){
       a.p(p0, "it");
       HprofHeapGraph$instances$1 t$objectInde = this.$objectIndex;
       Ref$IntRef element = t$objectInde.element;
       t$objectInde.element = element + 1;
       HeapObject$b uob = new HeapObject$b(this.this$0, p0.b(), p0.a(), element);
       return p0.b();
    }
}
