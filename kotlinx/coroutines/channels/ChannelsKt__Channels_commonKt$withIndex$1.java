package kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$withIndex$1;
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
import trd.i0;
import htd.c0;

public final class ChannelsKt__Channels_commonKt$withIndex$1 extends SuspendLambda implements p	// class@001995
{
    public final y $this_withIndex;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public w p$;

    public void ChannelsKt__Channels_commonKt$withIndex$1(y p0,c p1){
       this.$this_withIndex = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       ChannelsKt__Channels_commonKt$withIndex$1 owithIndex$1 = new ChannelsKt__Channels_commonKt$withIndex$1(this.$this_withIndex, p1);
       owithIndex$1.p$ = p0;
       return owithIndex$1;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       c uoc;
       ChannelsKt__Channels_commonKt$withIndex$1 owithIndex$1;
       c obj1;
       ChannelsKt__Channels_commonKt$withIndex$1 owithIndex$11;
       int i1;
       Object obj = b.h();
       ChannelsKt__Channels_commonKt$withIndex$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel != 1) {
             if (tlabel == 2) {
                j0.n(p0);
                p0 = this.L$0;
                uoc = this;
                owithIndex$1 = this.L$2;
                tlabel = this.I$0;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tlabel = this.L$1;
             owithIndex$1 = this.I$0;
             owithIndex$11 = this.L$0;
             j0.n(p0);
             obj1 = this;
          label_005b :
             if (p0.booleanValue()) {
                p0 = tlabel.next();
                int i = owithIndex$1 + 1;
                obj1.L$0 = owithIndex$11;
                obj1.I$0 = i;
                obj1.L$1 = p0;
                obj1.L$2 = tlabel;
                obj1.label = 2;
                if (owithIndex$11.l(new i0(owithIndex$1, p0), obj1) == obj) {
                   return obj;
                }else {
                   owithIndex$1 = tlabel;
                   p0 = owithIndex$11;
                   uoc = obj1;
                   i1 = i;
                }
             }else {
                return l1.a;
             }
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          i1 = 0;
          owithIndex$1 = this.$this_withIndex.iterator();
          uoc = this;
       }
       uoc.L$0 = p0;
       uoc.I$0 = tlabel;
       uoc.L$1 = owithIndex$1;
       uoc.label = 1;
       obj1 = owithIndex$1.a(uoc);
       if (obj1 == obj) {
          return obj;
       }else {
          owithIndex$11 = p0;
          p0 = obj1;
          obj1 = uoc;
          owithIndex$1 = tlabel;
          tlabel = owithIndex$1;
          goto label_005b ;
       }
    }
}
