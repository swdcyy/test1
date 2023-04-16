package kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$map$1;
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

public final class ChannelsKt__Channels_commonKt$map$1 extends SuspendLambda implements p	// class@001976
{
    public final y $this_map;
    public final p $transform;
    public Object L$0;
    public Object L$1;
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

    public void ChannelsKt__Channels_commonKt$map$1(y p0,p p1,c p2){
       this.$this_map = p0;
       this.$transform = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       ChannelsKt__Channels_commonKt$map$1 omap$1 = new ChannelsKt__Channels_commonKt$map$1(this.$this_map, this.$transform, p1);
       omap$1.p$ = p0;
       return omap$1;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       ChannelsKt__Channels_commonKt$map$1 l$4;
       ChannelsKt__Channels_commonKt$map$1 omap$12;
       ChannelsKt__Channels_commonKt$map$1 omap$13;
       ChannelsKt__Channels_commonKt$map$1 omap$14;
       ChannelsKt__Channels_commonKt$map$1 omap$15;
       ChannelsKt__Channels_commonKt$map$1 omap$16;
       ChannelsKt__Channels_commonKt$map$1 omap$17;
       Boolean uBoolean;
       ChannelsKt__Channels_commonKt$map$1 omap$18;
       Object obj1;
       ChannelsKt__Channels_commonKt$map$1 omap$19;
       ChannelsKt__Channels_commonKt$map$1 omap$1 = this;
       Object obj = b.h();
       ChannelsKt__Channels_commonKt$map$1 label = omap$1.label;
       ChannelsKt__Channels_commonKt$map$1 omap$11 = 2;
       if (label != null) {
          if (label != 1) {
             if (label != omap$11) {
                if (label == 3) {
                   label = omap$1.L$6;
                   l$4 = omap$1.L$4;
                   j0.n(p0);
                   omap$12 = omap$1;
                   omap$13 = omap$1.L$5;
                   omap$14 = omap$1.L$0;
                   omap$15 = omap$1.L$1;
                   omap$16 = omap$1.L$2;
                   omap$17 = omap$1.L$3;
                label_012c :
                   omap$11 = 2;
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                label = omap$1.L$9;
                omap$13 = omap$1.L$6;
                omap$15 = omap$1.L$3;
                j0.n(p0);
                omap$11 = omap$1;
                omap$19 = omap$1.L$0;
                obj1 = p0;
                omap$18 = omap$1.L$8;
                omap$14 = omap$1.L$5;
                omap$17 = omap$1.L$7;
                l$4 = omap$1.L$4;
                omap$16 = omap$1.L$2;
                omap$12 = omap$1.L$1;
             label_010b :
                omap$11.L$0 = omap$19;
                omap$11.L$1 = omap$12;
                omap$11.L$2 = omap$16;
                omap$11.L$3 = omap$15;
                omap$11.L$4 = l$4;
                omap$11.L$5 = omap$14;
                omap$11.L$6 = omap$13;
                omap$11.L$7 = omap$17;
                omap$11.L$8 = omap$18;
                omap$11.label = 3;
                if (label.l(obj1, omap$11) == obj) {
                   return obj;
                }else {
                   label = omap$13;
                   omap$17 = omap$15;
                   omap$15 = omap$12;
                   omap$12 = omap$11;
                   omap$13 = omap$14;
                   omap$14 = omap$19;
                   goto label_012c ;
                }
             }
          }else {
             label = omap$1.L$6;
             l$4 = omap$1.L$4;
             j0.n(p0);
             uBoolean = p0;
             omap$12 = omap$1;
             omap$13 = omap$1.L$5;
             omap$14 = omap$1.L$0;
             omap$15 = omap$1.L$1;
             omap$16 = omap$1.L$2;
             omap$17 = omap$1.L$3;
          label_00d8 :
             if (uBoolean.booleanValue()) {
                omap$18 = label.next();
                omap$12.L$0 = omap$14;
                omap$12.L$1 = omap$15;
                omap$12.L$2 = omap$16;
                omap$12.L$3 = omap$17;
                omap$12.L$4 = l$4;
                omap$12.L$5 = omap$13;
                omap$12.L$6 = label;
                omap$12.L$7 = omap$18;
                omap$12.L$8 = omap$18;
                omap$12.L$9 = omap$14;
                omap$12.label = omap$11;
                obj1 = omap$12.$transform.invoke(omap$18, omap$12);
                if (obj1 == obj) {
                   return obj;
                }else {
                   omap$19 = omap$14;
                   omap$11 = omap$12;
                   omap$14 = omap$13;
                   omap$12 = omap$15;
                   omap$13 = label;
                   label = omap$19;
                   omap$15 = omap$17;
                   omap$17 = omap$18;
                   goto label_010b ;
                }
             }else {
                o.r(omap$17, l$4);
                return l1.a;
             }
          }
       }else {
          j0.n(p0);
          omap$13 = omap$1.$this_map;
          omap$16 = omap$1;
          omap$12 = omap$16;
          omap$17 = omap$13;
          omap$15 = omap$17;
          omap$14 = omap$1.p$;
          ChannelIterator uChannelIter = omap$13.iterator();
          l$4 = null;
       }
       omap$12.L$0 = omap$14;
       omap$12.L$1 = omap$15;
       omap$12.L$2 = omap$16;
       omap$12.L$3 = omap$17;
       omap$12.L$4 = l$4;
       omap$12.L$5 = omap$13;
       omap$12.L$6 = label;
       omap$12.label = 1;
       uBoolean = label.a(omap$16);
       if (uBoolean == obj) {
          return obj;
       }else {
          goto label_00d8 ;
       }
    }
}
