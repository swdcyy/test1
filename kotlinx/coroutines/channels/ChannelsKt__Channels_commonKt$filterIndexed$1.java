package kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterIndexed$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import htd.y;
import msd.q;
import asd.c;
import java.lang.Object;
import htd.w;
import qrd.l1;
import csd.b;
import kotlinx.coroutines.channels.ChannelIterator;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;
import dsd.a;
import htd.c0;

public final class ChannelsKt__Channels_commonKt$filterIndexed$1 extends SuspendLambda implements p	// class@001956
{
    public final q $predicate;
    public final y $this_filterIndexed;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public w p$;

    public void ChannelsKt__Channels_commonKt$filterIndexed$1(y p0,q p1,c p2){
       this.$this_filterIndexed = p0;
       this.$predicate = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       ChannelsKt__Channels_commonKt$filterIndexed$1 uofilterInde = new ChannelsKt__Channels_commonKt$filterIndexed$1(this.$this_filterIndexed, this.$predicate, p1);
       uofilterInde.p$ = p0;
       return uofilterInde;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       ChannelsKt__Channels_commonKt$filterIndexed$1 tI$0;
       ChannelsKt__Channels_commonKt$filterIndexed$1 tL$0;
       ChannelsKt__Channels_commonKt$filterIndexed$1 obj1;
       ChannelIterator obj2;
       c obj = b.h();
       ChannelsKt__Channels_commonKt$filterIndexed$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel != 1) {
             if (tlabel != 2) {
                if (tlabel == 3) {
                   tlabel = this.L$2;
                   tI$0 = this.I$0;
                   tL$0 = this.L$0;
                   j0.n(p0);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                int i = this.I$0;
                j0.n(p0);
                ChannelsKt__Channels_commonKt$filterIndexed$1 obj3 = this.L$0;
                obj1 = this.L$1;
                tI$0 = this.L$2;
                obj2 = obj;
                obj = this;
             label_009e :
                if (p0.booleanValue()) {
                   obj.L$0 = obj3;
                   obj.I$0 = i;
                   obj.L$1 = obj1;
                   obj.L$2 = tI$0;
                   obj.label = 3;
                   if (obj3.l(obj1, obj) == obj2) {
                      return obj2;
                   }
                }
                p0 = obj;
                obj = obj2;
                tlabel = tI$0;
                tI$0 = i;
                tL$0 = obj3;
             label_0060 :
                p0.L$0 = tL$0;
                p0.I$0 = tI$0;
                p0.L$1 = tlabel;
                p0.label = 1;
                obj1 = tlabel.a(p0);
                if (obj1 == obj) {
                   return obj;
                }else {
                   obj = p0;
                   p0 = obj1;
                   obj1 = tL$0;
                   tL$0 = tI$0;
                   tI$0 = tlabel;
                   obj2 = obj;
                label_0076 :
                   if (p0.booleanValue()) {
                      p0 = tI$0.next();
                      i = tL$0 + 1;
                      obj.L$0 = obj1;
                      obj.I$0 = i;
                      obj.L$1 = p0;
                      obj.L$2 = tI$0;
                      obj.label = 2;
                      obj3 = obj.$predicate.invoke(a.f(tL$0), p0, obj);
                      if (obj3 == obj2) {
                         return obj2;
                      }else {
                         obj1 = p0;
                         p0 = obj3;
                         obj3 = obj1;
                         goto label_009e ;
                      }
                   }else {
                      return l1.a;
                   }
                }
             }
          }else {
             j0.n(p0);
             obj1 = this.L$0;
             tL$0 = this.I$0;
             tI$0 = this.L$1;
             obj2 = obj;
             ChannelsKt__Channels_commonKt$filterIndexed$1 uofilterInde = this;
             goto label_0076 ;
          }
       }else {
          j0.n(p0);
          tL$0 = this.p$;
          obj2 = this.$this_filterIndexed.iterator();
          tI$0 = 0;
       }
       p0 = this;
       goto label_0060 ;
    }
}
