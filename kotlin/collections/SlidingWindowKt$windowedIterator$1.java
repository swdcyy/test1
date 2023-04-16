package kotlin.collections.SlidingWindowKt$windowedIterator$1;
import msd.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import java.util.Iterator;
import asd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wsd.o;
import qrd.l1;
import csd.b;
import trd.a1;
import java.lang.IllegalStateException;
import qrd.j0;
import java.util.ArrayList;
import usd.q;
import java.util.Collection;
import kotlin.collections.AbstractCollection;

public final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements p	// class@001855
{
    public final Iterator $iterator;
    public final boolean $partialWindows;
    public final boolean $reuseBuffer;
    public final int $size;
    public final int $step;
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public o p$;

    public void SlidingWindowKt$windowedIterator$1(int p0,int p1,Iterator p2,boolean p3,boolean p4,c p5){
       this.$size = p0;
       this.$step = p1;
       this.$iterator = p2;
       this.$reuseBuffer = p3;
       this.$partialWindows = p4;
       super(2, p5);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       SlidingWindowKt$windowedIterator$1 owindowedIte = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, p1);
       v0.p$ = p0;
       return v0;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       SlidingWindowKt$windowedIterator$1 tL$0;
       SlidingWindowKt$windowedIterator$1 owindowedIte2;
       SlidingWindowKt$windowedIterator$1 tL$01;
       a1 uoa1;
       SlidingWindowKt$windowedIterator$1 owindowedIte3;
       SlidingWindowKt$windowedIterator$1 tL$1;
       SlidingWindowKt$windowedIterator$1 tI$1;
       Object obj = b.h();
       SlidingWindowKt$windowedIterator$1 tlabel = this.label;
       int i = 5;
       int i1 = 4;
       SlidingWindowKt$windowedIterator$1 owindowedIte = 3;
       SlidingWindowKt$windowedIterator$1 owindowedIte1 = 2;
       int i2 = 1;
       if (tlabel != null) {
          if (tlabel != i2) {
             if (tlabel != owindowedIte1) {
                if (tlabel != owindowedIte) {
                   if (tlabel != i1) {
                      if (tlabel == i) {
                      }else {
                         throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                      }
                   }else {
                      tlabel = this.L$1;
                      owindowedIte = this.I$1;
                      owindowedIte1 = this.I$0;
                      tL$0 = this.L$0;
                      j0.n(p0);
                      p0 = this;
                   label_0178 :
                      tlabel.p(p0.$step);
                   label_0154 :
                      if (tlabel.size() > p0.$step) {
                         owindowedIte2 = (p0.$reuseBuffer != null)? tlabel: new ArrayList(tlabel);
                         p0.L$0 = tL$0;
                         p0.I$0 = owindowedIte1;
                         p0.I$1 = owindowedIte;
                         p0.L$1 = tlabel;
                         p0.label = i1;
                         if (tL$0.b(owindowedIte2, p0) == obj) {
                            return obj;
                         }else {
                            goto label_0178 ;
                         }
                      }else if(tlabel.isEmpty() ^ i2){
                         p0.L$0 = tL$0;
                         p0.I$0 = owindowedIte1;
                         p0.I$1 = owindowedIte;
                         p0.L$1 = tlabel;
                         p0.label = i;
                         if (tL$0.b(tlabel, p0) == obj) {
                            return obj;
                         }
                      }
                   }
                }else {
                   tlabel = this.L$3;
                   owindowedIte1 = this.L$1;
                   tL$0 = this.I$1;
                   owindowedIte2 = this.I$0;
                   tL$01 = this.L$0;
                   j0.n(p0);
                   p0 = this;
                label_0146 :
                   owindowedIte1.p(p0.$step);
                   while (true) {
                      if (tlabel.hasNext()) {
                         Object obj1 = tlabel.next();
                         owindowedIte1.d(obj1);
                         if (owindowedIte1.n()) {
                            SlidingWindowKt$windowedIterator$1 $size = p0.$size;
                            if (owindowedIte1.size() < $size) {
                               uoa1 = owindowedIte1.l($size);
                            }else if(p0.$reuseBuffer != null){
                               owindowedIte3 = owindowedIte1;
                            }else {
                               owindowedIte3 = new ArrayList(owindowedIte1);
                            }
                            p0.L$0 = tL$01;
                            p0.I$0 = owindowedIte2;
                            p0.I$1 = tL$0;
                            p0.L$1 = owindowedIte1;
                            p0.L$2 = obj1;
                            p0.L$3 = tlabel;
                            p0.label = owindowedIte;
                            if (tL$01.b(owindowedIte3, p0) == obj) {
                               return obj;
                            }else {
                               goto label_0146 ;
                            }
                         }
                      }else if(p0.$partialWindows != null){
                         tlabel = owindowedIte1;
                         owindowedIte = tL$0;
                         owindowedIte1 = owindowedIte2;
                         tL$0 = tL$01;
                         goto label_0154 ;
                      }
                   }
                }
             }else {
             }
             j0.n(p0);
          }else {
             tlabel = this.L$3;
             tL$1 = this.L$1;
             tI$1 = this.I$1;
             owindowedIte = this.I$0;
             tL$0 = this.L$0;
             j0.n(p0);
             owindowedIte2 = this;
          label_00c1 :
             if (owindowedIte2.$reuseBuffer != null) {
                tL$1.clear();
             }else {
                tL$1 = new ArrayList(owindowedIte2.$size);
             }
             p0 = tL$0;
             tL$0 = tI$1;
             while (true) {
                if (tlabel.hasNext()) {
                   Object obj2 = tlabel.next();
                   if (tI$1 > 0) {
                      tI$1 = tI$1 - 1;
                   }else {
                      tL$1.add(obj2);
                      if (tL$1.size() == owindowedIte2.$size) {
                         owindowedIte2.L$0 = p0;
                         owindowedIte2.I$0 = owindowedIte;
                         owindowedIte2.I$1 = tL$0;
                         owindowedIte2.L$1 = tL$1;
                         owindowedIte2.I$2 = tI$1;
                         owindowedIte2.L$2 = obj2;
                         owindowedIte2.L$3 = tlabel;
                         owindowedIte2.label = i2;
                         if (p0.b(tL$1, owindowedIte2) == obj) {
                            return obj;
                         }else {
                            tI$1 = tL$0;
                            tL$0 = p0;
                            goto label_00c1 ;
                         }
                      }
                   }
                }else if((tL$1.isEmpty() ^ i2) && (owindowedIte2.$partialWindows != null || tL$1.size() == owindowedIte2.$size)){
                   owindowedIte2.L$0 = p0;
                   owindowedIte2.I$0 = owindowedIte;
                   owindowedIte2.I$1 = tL$0;
                   owindowedIte2.L$1 = tL$1;
                   owindowedIte2.I$2 = tI$1;
                   owindowedIte2.label = owindowedIte1;
                   if (p0.b(tL$1, owindowedIte2) == obj) {
                      return obj;
                   }
                }
             }
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          int i3 = q.u(this.$size, 1024);
          int i4 = this.$step - this.$size;
          if (i4 >= 0) {
             tL$1 = new ArrayList(i3);
             tI$1 = null;
             owindowedIte2 = this;
             int i5 = i3;
             tlabel = this.$iterator;
             goto label_008e ;
          }else {
             uoa1 = new a1(i3);
             tL$01 = p0;
             p0 = this;
             int i6 = i3;
             tlabel = this.$iterator;
             goto label_0106 ;
          }
       }
       return l1.a;
    }
}
