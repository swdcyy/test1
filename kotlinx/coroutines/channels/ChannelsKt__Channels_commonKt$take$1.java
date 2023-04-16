package kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$take$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import htd.y;
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
import htd.c0;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;

public final class ChannelsKt__Channels_commonKt$take$1 extends SuspendLambda implements p	// class@001990
{
    public final int $n;
    public final y $this_take;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public w p$;

    public void ChannelsKt__Channels_commonKt$take$1(y p0,int p1,c p2){
       this.$this_take = p0;
       this.$n = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       ChannelsKt__Channels_commonKt$take$1 otake$1 = new ChannelsKt__Channels_commonKt$take$1(this.$this_take, this.$n, p1);
       otake$1.p$ = p0;
       return otake$1;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       ChannelsKt__Channels_commonKt$take$1 tI$0;
       c uoc;
       int i1;
       c obj1;
       ChannelsKt__Channels_commonKt$take$1 otake$1;
       ChannelIterator uChannelIter;
       Object obj = b.h();
       ChannelsKt__Channels_commonKt$take$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel != 1) {
             if (tlabel == 2) {
                tlabel = this.L$2;
                tI$0 = this.I$0;
                j0.n(p0);
                p0 = this.L$0;
                uoc = this;
             label_0085 :
                int i = tI$0 - 1;
                if (!i) {
                   return l1.a;
                }else {
                   tI$0 = tlabel;
                   i1 = i;
                }
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             uChannelIter = this.L$1;
             tI$0 = this.I$0;
             otake$1 = this.L$0;
             j0.n(p0);
             obj1 = this;
          label_0066 :
             if (p0.booleanValue()) {
                p0 = uChannelIter.next();
                obj1.L$0 = otake$1;
                obj1.I$0 = tI$0;
                obj1.L$1 = p0;
                obj1.L$2 = uChannelIter;
                obj1.label = 2;
                if (otake$1.l(p0, obj1) == obj) {
                   return obj;
                }else {
                   p0 = otake$1;
                   uoc = obj1;
                   goto label_0085 ;
                }
             }else {
                return l1.a;
             }
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          i1 = this.$n;
          if (i1 == null) {
             return l1.a;
          }else if(i1 >= null){
             tI$0 = 1;
          }else {
             tI$0 = null;
          }
          if (tI$0) {
             ChannelIterator uChannelIter1 = this.$this_take.iterator();
             uoc = this;
          }else {
             throw new IllegalArgumentException("Requested element count "+this.$n+" is less than zero.".toString());
          }
       }
       uoc.L$0 = p0;
       uoc.I$0 = i1;
       uoc.L$1 = tI$0;
       uoc.label = 1;
       obj1 = tI$0.a(uoc);
       if (obj1 == obj) {
          return obj;
       }else {
          otake$1 = p0;
          p0 = obj1;
          obj1 = uoc;
          tI$0 = i1;
          uChannelIter = tI$0;
          goto label_0066 ;
       }
    }
}
