package kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$drop$1;
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

public final class ChannelsKt__Channels_commonKt$drop$1 extends SuspendLambda implements p	// class@001950
{
    public final int $n;
    public final y $this_drop;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public w p$;

    public void ChannelsKt__Channels_commonKt$drop$1(y p0,int p1,c p2){
       this.$this_drop = p0;
       this.$n = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       ChannelsKt__Channels_commonKt$drop$1 uodrop$1 = new ChannelsKt__Channels_commonKt$drop$1(this.$this_drop, this.$n, p1);
       uodrop$1.p$ = p0;
       return uodrop$1;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       ChannelsKt__Channels_commonKt$drop$1 uodrop$11;
       ChannelIterator obj1;
       ChannelsKt__Channels_commonKt$drop$1 obj2;
       ChannelsKt__Channels_commonKt$drop$1 uodrop$13;
       int i;
       ChannelsKt__Channels_commonKt$drop$1 uodrop$14;
       int i1;
       c obj = b.h();
       ChannelsKt__Channels_commonKt$drop$1 tlabel = this.label;
       ChannelsKt__Channels_commonKt$drop$1 uodrop$1 = 1;
       if (tlabel != null) {
          if (tlabel != uodrop$1) {
             if (tlabel != 2) {
                if (tlabel == 3) {
                   j0.n(p0);
                   uodrop$11 = this.I$0;
                   p0 = this.L$0;
                   uodrop$1 = this.L$2;
                   obj1 = obj;
                   obj = this;
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                obj2 = this.L$0;
                j0.n(p0);
                uodrop$11 = this.I$0;
                uodrop$1 = this.L$1;
                obj1 = obj;
                obj = this;
             label_00b9 :
                if (p0.booleanValue()) {
                   p0 = uodrop$1.next();
                   obj.L$0 = obj2;
                   obj.I$0 = uodrop$11;
                   obj.L$1 = p0;
                   obj.L$2 = uodrop$1;
                   obj.label = 3;
                   if (obj2.l(p0, obj) == obj1) {
                      return obj1;
                   }else {
                      p0 = obj2;
                   }
                }else {
                   return l1.a;
                }
             }
          }else {
             j0.n(p0);
             ChannelsKt__Channels_commonKt$drop$1 uodrop$12 = this.L$0;
             uodrop$11 = this.I$0;
             obj2 = this.L$1;
             obj1 = obj;
             uodrop$13 = this;
          label_0084 :
             if (p0.booleanValue()) {
                obj2.next();
                i = uodrop$11 - 1;
                if (!i) {
                   uodrop$11 = i;
                }else {
                   uodrop$11 = uodrop$12;
                   uodrop$14 = obj2;
                   i1 = i;
                   i = uodrop$13;
                   obj = obj1;
                label_009a :
                   obj1 = uodrop$14;
                   i.L$0 = uodrop$11;
                   i.I$0 = i1;
                   i.L$1 = obj1;
                   i.label = uodrop$1;
                   Object obj3 = obj1.a(i);
                   if (obj3 == obj) {
                      return obj;
                   }else {
                      uodrop$13 = i;
                      i = obj3;
                      uodrop$12 = uodrop$11;
                      uodrop$11 = i1;
                      ChannelIterator uChannelIter1 = obj1;
                      obj1 = obj;
                      goto label_0084 ;
                   }
                }
             }
             i = uodrop$12;
          label_00a1 :
             ChannelIterator uChannelIter = uodrop$13.$this_drop.iterator();
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          tlabel = this.$n;
          obj2 = (tlabel >= null)? 1: null;
          if (obj2) {
             if (tlabel > null) {
                uodrop$11 = p0;
                p0 = this;
                uodrop$14 = this.$this_drop.iterator();
                i1 = tlabel;
                goto label_009a ;
             }else {
                uodrop$11 = tlabel;
                obj1 = obj;
                uodrop$13 = this;
                goto label_00a1 ;
             }
          }else {
             throw new IllegalArgumentException("Requested element count "+this.$n+" is less than zero.".toString());
          }
       }
       obj.L$0 = p0;
       obj.I$0 = uodrop$11;
       obj.L$1 = uodrop$1;
       obj.label = 2;
       obj2 = uodrop$1.a(obj);
       if (obj2 == obj1) {
          return obj1;
       }else {
          obj2 = p0;
          p0 = obj2;
          goto label_00b9 ;
       }
    }
}
