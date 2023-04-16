package kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filter$1;
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

public final class ChannelsKt__Channels_commonKt$filter$1 extends SuspendLambda implements p	// class@001955
{
    public final p $predicate;
    public final y $this_filter;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public w p$;

    public void ChannelsKt__Channels_commonKt$filter$1(y p0,p p1,c p2){
       this.$this_filter = p0;
       this.$predicate = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       ChannelsKt__Channels_commonKt$filter$1 uofilter$1 = new ChannelsKt__Channels_commonKt$filter$1(this.$this_filter, this.$predicate, p1);
       uofilter$1.p$ = p0;
       return uofilter$1;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       ChannelsKt__Channels_commonKt$filter$1 tL$0;
       ChannelsKt__Channels_commonKt$filter$1 obj1;
       ChannelIterator obj2;
       c obj = b.h();
       ChannelsKt__Channels_commonKt$filter$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel != 1) {
             if (tlabel != 2) {
                if (tlabel == 3) {
                   tlabel = this.L$2;
                   tL$0 = this.L$0;
                   j0.n(p0);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                obj1 = this.L$0;
                j0.n(p0);
                ChannelsKt__Channels_commonKt$filter$1 obj3 = this.L$1;
                tL$0 = this.L$2;
                obj2 = obj;
                obj = this;
             label_0087 :
                if (p0.booleanValue()) {
                   obj.L$0 = obj1;
                   obj.L$1 = obj3;
                   obj.L$2 = tL$0;
                   obj.label = 3;
                   if (obj1.l(obj3, obj) == obj2) {
                      return obj2;
                   }
                }
                p0 = obj;
                obj = obj2;
                tlabel = tL$0;
                tL$0 = obj1;
             label_0054 :
                p0.L$0 = tL$0;
                p0.L$1 = tlabel;
                p0.label = 1;
                obj1 = tlabel.a(p0);
                if (obj1 == obj) {
                   return obj;
                }else {
                   obj = p0;
                   p0 = obj1;
                   obj1 = tL$0;
                   tL$0 = tlabel;
                   obj2 = obj;
                label_0067 :
                   if (p0.booleanValue()) {
                      p0 = tL$0.next();
                      obj.L$0 = obj1;
                      obj.L$1 = p0;
                      obj.L$2 = tL$0;
                      obj.label = 2;
                      obj3 = obj.$predicate.invoke(p0, obj);
                      if (obj3 == obj2) {
                         return obj2;
                      }else {
                         obj3 = p0;
                         p0 = obj3;
                         goto label_0087 ;
                      }
                   }else {
                      return l1.a;
                   }
                }
             }
          }else {
             j0.n(p0);
             obj1 = this.L$0;
             tL$0 = this.L$1;
             obj2 = obj;
             ChannelsKt__Channels_commonKt$filter$1 uofilter$1 = this;
             goto label_0067 ;
          }
       }else {
          j0.n(p0);
          obj2 = this.$this_filter.iterator();
          tL$0 = this.p$;
       }
       p0 = this;
       goto label_0054 ;
    }
}
