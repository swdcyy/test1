package kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$mapIndexed$1;
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

public final class ChannelsKt__Channels_commonKt$mapIndexed$1 extends SuspendLambda implements p	// class@001977
{
    public final y $this_mapIndexed;
    public final q $transform;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public w p$;

    public void ChannelsKt__Channels_commonKt$mapIndexed$1(y p0,q p1,c p2){
       this.$this_mapIndexed = p0;
       this.$transform = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       ChannelsKt__Channels_commonKt$mapIndexed$1 omapIndexed$ = new ChannelsKt__Channels_commonKt$mapIndexed$1(this.$this_mapIndexed, this.$transform, p1);
       omapIndexed$.p$ = p0;
       return omapIndexed$;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       ChannelsKt__Channels_commonKt$mapIndexed$1 tI$0;
       c uoc;
       c obj1;
       ChannelsKt__Channels_commonKt$mapIndexed$1 omapIndexed$;
       int i;
       ChannelsKt__Channels_commonKt$mapIndexed$1 obj2;
       ChannelsKt__Channels_commonKt$mapIndexed$1 omapIndexed$1;
       int i1;
       Object obj = b.h();
       ChannelsKt__Channels_commonKt$mapIndexed$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel != 1) {
             if (tlabel != 2) {
                if (tlabel == 3) {
                   tlabel = this.L$2;
                   tI$0 = this.I$0;
                   j0.n(p0);
                   p0 = this.L$0;
                   uoc = this;
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                tlabel = this.L$3;
                tI$0 = this.L$2;
                i1 = this.I$0;
                j0.n(p0);
                omapIndexed$1 = this;
                obj2 = this.L$1;
                omapIndexed$ = this.L$0;
             label_00a0 :
                omapIndexed$1.L$0 = omapIndexed$;
                omapIndexed$1.I$0 = i1;
                omapIndexed$1.L$1 = obj2;
                omapIndexed$1.L$2 = tI$0;
                omapIndexed$1.label = 3;
                if (tlabel.l(p0, omapIndexed$1) == obj) {
                   return obj;
                }else {
                   tlabel = tI$0;
                   p0 = omapIndexed$;
                   tI$0 = i1;
                   uoc = omapIndexed$1;
                }
             }
          }else {
             tlabel = this.L$1;
             tI$0 = this.I$0;
             omapIndexed$ = this.L$0;
             j0.n(p0);
             ChannelsKt__Channels_commonKt$mapIndexed$1 omapIndexed$2 = this;
          label_0073 :
             if (p0.booleanValue()) {
                p0 = tlabel.next();
                i = tI$0 + 1;
                obj1.L$0 = omapIndexed$;
                obj1.I$0 = i;
                obj1.L$1 = p0;
                obj1.L$2 = tlabel;
                obj1.L$3 = omapIndexed$;
                obj1.label = 2;
                obj2 = obj1.$transform.invoke(a.f(tI$0), p0, obj1);
                if (obj2 == obj) {
                   return obj;
                }else {
                   omapIndexed$1 = obj1;
                   i1 = i;
                   tI$0 = tlabel;
                   tlabel = omapIndexed$;
                   obj2 = p0;
                   p0 = obj2;
                   goto label_00a0 ;
                }
             }else {
                return l1.a;
             }
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          uoc = this;
          ChannelIterator uChannelIter = this.$this_mapIndexed.iterator();
          i = 0;
       }
       uoc.L$0 = p0;
       uoc.I$0 = tI$0;
       uoc.L$1 = tlabel;
       uoc.label = 1;
       obj1 = tlabel.a(uoc);
       if (obj1 == obj) {
          return obj;
       }else {
          omapIndexed$ = p0;
          p0 = obj1;
          obj1 = uoc;
          goto label_0073 ;
       }
    }
}
