package kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$zip$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import htd.y;
import asd.c;
import java.lang.Object;
import htd.w;
import qrd.l1;
import csd.b;
import kotlinx.coroutines.channels.ChannelIterator;
import java.lang.Throwable;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Boolean;
import htd.c0;
import htd.o;

public final class ChannelsKt__Channels_commonKt$zip$2 extends SuspendLambda implements p	// class@001997
{
    public final y $other;
    public final y $this_zip;
    public final p $transform;
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public w p$;

    public void ChannelsKt__Channels_commonKt$zip$2(y p0,y p1,p p2,c p3){
       this.$this_zip = p0;
       this.$other = p1;
       this.$transform = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       ChannelsKt__Channels_commonKt$zip$2 ozip$2 = new ChannelsKt__Channels_commonKt$zip$2(this.$this_zip, this.$other, this.$transform, p1);
       ozip$2.p$ = p0;
       return ozip$2;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       ChannelsKt__Channels_commonKt$zip$2 l$6;
       ChannelsKt__Channels_commonKt$zip$2 l$5;
       ChannelsKt__Channels_commonKt$zip$2 l$4;
       ChannelsKt__Channels_commonKt$zip$2 l$3;
       ChannelsKt__Channels_commonKt$zip$2 l$2;
       ChannelsKt__Channels_commonKt$zip$2 l$1;
       ChannelsKt__Channels_commonKt$zip$2 l$0;
       ChannelsKt__Channels_commonKt$zip$2 ozip$22;
       Boolean uBoolean;
       ChannelsKt__Channels_commonKt$zip$2 ozip$23;
       Boolean uBoolean1;
       ChannelsKt__Channels_commonKt$zip$2 ozip$2 = this;
       Object obj = b.h();
       ChannelsKt__Channels_commonKt$zip$2 label = ozip$2.label;
       ChannelsKt__Channels_commonKt$zip$2 ozip$21 = 2;
       int i = 1;
       if (label != null) {
          if (label != i) {
             if (label != ozip$21) {
                if (label == 3) {
                   label = ozip$2.L$7;
                   l$6 = ozip$2.L$6;
                   l$5 = ozip$2.L$5;
                   l$4 = ozip$2.L$4;
                   l$3 = ozip$2.L$3;
                   l$2 = ozip$2.L$2;
                   l$1 = ozip$2.L$1;
                   l$0 = ozip$2.L$0;
                   j0.n(p0);
                   ozip$22 = ozip$2;
                label_013e :
                   ozip$21 = 2;
                   i = 1;
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                l$3 = ozip$2.L$5;
                l$1 = ozip$2.L$3;
                ozip$22 = ozip$2.L$1;
                j0.n(p0);
                uBoolean1 = p0;
                ozip$21 = ozip$2;
                ozip$23 = ozip$2.L$9;
                label = ozip$2.L$7;
                l$5 = ozip$2.L$8;
                l$6 = ozip$2.L$6;
                l$4 = ozip$2.L$4;
                l$2 = ozip$2.L$2;
                l$0 = ozip$2.L$0;
             label_0103 :
                if (!uBoolean1.booleanValue()) {
                   l$5 = l$3;
                   l$3 = l$1;
                   l$1 = ozip$22;
                   ozip$22 = ozip$21;
                   ozip$21 = 2;
                }else {
                   Object obj1 = ozip$22.next();
                   ozip$21.L$0 = l$0;
                   ozip$21.L$1 = ozip$22;
                   ozip$21.L$2 = l$2;
                   ozip$21.L$3 = l$1;
                   ozip$21.L$4 = l$4;
                   ozip$21.L$5 = l$3;
                   ozip$21.L$6 = l$6;
                   ozip$21.L$7 = label;
                   ozip$21.L$8 = l$5;
                   ozip$21.L$9 = ozip$23;
                   ozip$21.L$10 = obj1;
                   ozip$21.label = 3;
                   if (l$0.l(ozip$21.$transform.invoke(ozip$23, obj1), ozip$21) == obj) {
                      return obj;
                   }else {
                      l$5 = l$3;
                      l$3 = l$1;
                      l$1 = ozip$22;
                      ozip$22 = ozip$21;
                      goto label_013e ;
                   }
                }
             }
          }else {
             label = ozip$2.L$7;
             l$6 = ozip$2.L$6;
             l$5 = ozip$2.L$5;
             l$4 = ozip$2.L$4;
             l$3 = ozip$2.L$3;
             l$2 = ozip$2.L$2;
             l$1 = ozip$2.L$1;
             l$0 = ozip$2.L$0;
             j0.n(p0);
             uBoolean = p0;
             ozip$22 = ozip$2;
          label_00d5 :
             if (uBoolean.booleanValue()) {
                ozip$23 = label.next();
                ozip$22.L$0 = l$0;
                ozip$22.L$1 = l$1;
                ozip$22.L$2 = l$2;
                ozip$22.L$3 = l$3;
                ozip$22.L$4 = l$4;
                ozip$22.L$5 = l$5;
                ozip$22.L$6 = l$6;
                ozip$22.L$7 = label;
                ozip$22.L$8 = ozip$23;
                ozip$22.L$9 = ozip$23;
                ozip$22.label = ozip$21;
                uBoolean1 = l$1.a(ozip$22);
                if (uBoolean1 == obj) {
                   return obj;
                }else {
                   ozip$21 = ozip$22;
                   ozip$22 = l$1;
                   l$1 = l$3;
                   l$3 = l$5;
                   l$5 = ozip$23;
                   goto label_0103 ;
                }
             }else {
                o.r(l$4, l$5);
                return l1.a;
             }
          }
       }else {
          j0.n(p0);
          l$4 = ozip$2.$this_zip;
          l$5 = null;
          ozip$22 = ozip$2;
          l$0 = ozip$2.p$;
          l$1 = ozip$2.$other.iterator();
          l$6 = l$4;
          l$2 = l$6;
          ChannelIterator uChannelIter = l$4.iterator();
          l$3 = ozip$22;
       }
       ozip$22.L$0 = l$0;
       ozip$22.L$1 = l$1;
       ozip$22.L$2 = l$2;
       ozip$22.L$3 = l$3;
       ozip$22.L$4 = l$4;
       ozip$22.L$5 = l$5;
       ozip$22.L$6 = l$6;
       ozip$22.L$7 = label;
       ozip$22.label = i;
       uBoolean = label.a(l$3);
       if (uBoolean == obj) {
          return obj;
       }else {
          goto label_00d5 ;
       }
    }
}
