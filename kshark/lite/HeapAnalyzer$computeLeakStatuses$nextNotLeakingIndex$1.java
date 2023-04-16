package kshark.lite.HeapAnalyzer$computeLeakStatuses$nextNotLeakingIndex$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Number;

public final class HeapAnalyzer$computeLeakStatuses$nextNotLeakingIndex$1 extends Lambda implements l	// class@001b81
{
    public final Ref$IntRef $lastNotLeakingElementIndex;

    public void HeapAnalyzer$computeLeakStatuses$nextNotLeakingIndex$1(Ref$IntRef p0){
       this.$lastNotLeakingElementIndex = p0;
       super(1);
    }
    public final Integer invoke(int p0){
       Integer integer;
       if (p0 < this.$lastNotLeakingElementIndex.element) {
          p0++;
          integer = Integer.valueOf(p0);
       }else {
          integer = null;
       }
       return integer;
    }
    public Object invoke(Object p0){
       return this.invoke(p0.intValue());
    }
}
