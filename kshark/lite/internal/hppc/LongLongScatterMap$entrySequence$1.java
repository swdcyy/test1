package kshark.lite.internal.hppc.LongLongScatterMap$entrySequence$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import utd.d;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import utd.c;
import utd.h;

public final class LongLongScatterMap$entrySequence$1 extends Lambda implements a	// class@001bd3
{
    public final int $max;
    public final Ref$IntRef $slot;
    public final d this$0;

    public void LongLongScatterMap$entrySequence$1(d p0,Ref$IntRef p1,int p2){
       this.this$0 = p0;
       this.$slot = p1;
       this.$max = p2;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final c invoke(){
       LongLongScatterMap$entrySequence$1 tthis$0;
       LongLongScatterMap$entrySequence$1 t$slot = this.$slot;
       Ref$IntRef element = t$slot.element;
       if (element < this.$max) {
          t$slot.element = element + 1;
          while (true) {
             t$slot = this.$slot;
             element = t$slot.element;
             if (element < this.$max) {
                tthis$0 = this.this$0;
                long l = tthis$0.a[element];
                if (l) {
                   return h.b(l, tthis$0.b[element]);
                }else {
                   int i = element + 1;
                   t$slot.element = i;
                }
             }
          }
       }
       t$slot = this.$slot;
       element = t$slot.element;
       tthis$0 = this.$max;
       if (element == tthis$0) {
          LongLongScatterMap$entrySequence$1 tthis$01 = this.this$0;
          if (tthis$01.f != null) {
             t$slot.element = element + 1;
             return h.b(0, tthis$01.b[tthis$0]);
          }
       }
       return null;
    }
}
