package kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$distinctBy$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import htd.y;
import asd.c;
import java.lang.Object;
import htd.w;
import qrd.l1;
import csd.b;
import kotlinx.coroutines.channels.ChannelIterator;
import java.util.HashSet;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Boolean;
import htd.c0;
import java.util.Collection;

public final class ChannelsKt__Channels_commonKt$distinctBy$1 extends SuspendLambda implements p	// class@00194f
{
    public final p $selector;
    public final y $this_distinctBy;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public w p$;

    public void ChannelsKt__Channels_commonKt$distinctBy$1(y p0,p p1,c p2){
       this.$this_distinctBy = p0;
       this.$selector = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       ChannelsKt__Channels_commonKt$distinctBy$1 uodistinctBy = new ChannelsKt__Channels_commonKt$distinctBy$1(this.$this_distinctBy, this.$selector, p1);
       uodistinctBy.p$ = p0;
       return uodistinctBy;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       ChannelsKt__Channels_commonKt$distinctBy$1 tL$3;
       ChannelsKt__Channels_commonKt$distinctBy$1 tL$1;
       ChannelsKt__Channels_commonKt$distinctBy$1 tL$0;
       ChannelIterator obj1;
       int i;
       HashSet hashSet;
       ChannelsKt__Channels_commonKt$distinctBy$1 obj3;
       Object obj = b.h();
       ChannelsKt__Channels_commonKt$distinctBy$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel != 1) {
             if (tlabel != 2) {
                if (tlabel == 3) {
                   tL$3 = this.L$3;
                   tL$1 = this.L$1;
                   tL$0 = this.L$0;
                   j0.n(p0);
                   p0 = this.L$4;
                   obj1 = obj;
                   i = this;
                label_00c7 :
                   tL$1.add(p0);
                   p0 = i;
                   obj = obj1;
                   tlabel = tL$3;
                   tL$3 = tL$1;
                   tL$1 = tL$0;
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(p0);
                obj3 = this.L$0;
                tL$0 = this.L$1;
                tL$1 = this.L$2;
                tL$3 = this.L$3;
                obj1 = obj;
                i = this;
             label_00ac :
                if (!tL$0.contains(p0)) {
                   i.L$0 = obj3;
                   i.L$1 = tL$0;
                   i.L$2 = tL$1;
                   i.L$3 = tL$3;
                   i.L$4 = p0;
                   i.label = 3;
                   if (obj3.l(tL$1, i) == obj1) {
                      return obj1;
                   }else {
                      tL$1 = tL$0;
                      tL$0 = obj3;
                      goto label_00c7 ;
                   }
                }else {
                   p0 = i;
                   obj = obj1;
                   tlabel = tL$3;
                   tL$3 = tL$0;
                   tL$1 = obj3;
                }
             }
          }else {
             j0.n(p0);
             tL$0 = this.L$0;
             hashSet = this.L$1;
             tL$3 = this.L$2;
             obj1 = obj;
             i = this;
          label_0088 :
             if (p0.booleanValue()) {
                p0 = tL$3.next();
                i.L$0 = tL$0;
                i.L$1 = hashSet;
                i.L$2 = p0;
                i.L$3 = tL$3;
                i.label = 2;
                obj3 = i.$selector.invoke(p0, i);
                if (obj3 == obj1) {
                   return obj1;
                }else {
                   tL$1 = p0;
                   p0 = obj3;
                   obj3 = tL$0;
                   tL$0 = hashSet;
                   goto label_00ac ;
                }
             }else {
                return l1.a;
             }
          }
       }else {
          j0.n(p0);
          tL$1 = this.p$;
          p0 = this;
          HashSet hashSet1 = new HashSet();
          obj1 = this.$this_distinctBy.iterator();
       }
       p0.L$0 = tL$1;
       p0.L$1 = tL$3;
       p0.L$2 = tlabel;
       p0.label = 1;
       Object obj2 = tlabel.a(p0);
       if (obj2 == obj) {
          return obj;
       }else {
          i = p0;
          p0 = obj2;
          tL$0 = tL$1;
          hashSet = tL$3;
          tL$3 = tlabel;
          obj1 = obj;
          goto label_0088 ;
       }
    }
}
