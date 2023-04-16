package kshark.lite.internal.hppc.LongObjectScatterMap$entrySequence$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import utd.f;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import utd.e;
import kotlin.jvm.internal.a;
import utd.h;

public final class LongObjectScatterMap$entrySequence$1 extends Lambda implements a	// class@001bd4
{
    public final int $max;
    public final Ref$IntRef $slot;
    public final f this$0;

    public void LongObjectScatterMap$entrySequence$1(f p0,Ref$IntRef p1,int p2){
       this.this$0 = p0;
       this.$slot = p1;
       this.$max = p2;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final e invoke(){
       LongObjectScatterMap$entrySequence$1 tthis$0;
       object oobject;
       LongObjectScatterMap$entrySequence$1 t$slot = this.$slot;
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
                   oobject = tthis$0.b[element];
                   a.m(oobject);
                   return h.c(l, oobject);
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
          LongObjectScatterMap$entrySequence$1 tthis$01 = this.this$0;
          if (tthis$01.f != null) {
             t$slot.element = element + 1;
             oobject = tthis$01.b[tthis$0];
             a.m(oobject);
             return h.c(0, oobject);
          }
       }
       return null;
    }
}
