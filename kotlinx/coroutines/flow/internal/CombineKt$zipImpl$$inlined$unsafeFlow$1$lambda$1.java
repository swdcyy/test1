package kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1;
import java.lang.Object;
import ftd.k0;
import qrd.l1;
import csd.b;
import kotlinx.coroutines.channels.ChannelIterator;
import htd.y;
import java.lang.Throwable;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import jtd.d;
import kotlinx.coroutines.flow.internal.CombineKt;
import htd.c0;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$1;
import msd.l;
import java.lang.Boolean;
import ktd.j;
import msd.q;
import htd.o;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import java.util.concurrent.CancellationException;
import ktd.e;
import kotlin.TypeCastException;

public final class CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 extends SuspendLambda implements p	// class@001b24
{
    public final e $this_unsafeFlow;
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$12;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public k0 p$;
    public final CombineKt$zipImpl$$inlined$unsafeFlow$1 this$0;

    public void CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1(e p0,c p1,CombineKt$zipImpl$$inlined$unsafeFlow$1 p2){
       this.$this_unsafeFlow = p0;
       this.this$0 = p2;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 ozipImpl$$in = new CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1(this.$this_unsafeFlow, p1, this.this$0);
       ozipImpl$$in.p$ = p0;
       return ozipImpl$$in;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 l$8;
       CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 l$2;
       CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 ozipImpl$$in4;
       CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 ozipImpl$$in5;
       CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 ozipImpl$$in6;
       CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 ozipImpl$$in7;
       CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 ozipImpl$$in8;
       CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 ozipImpl$$in9;
       Boolean uBoolean;
       CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 ozipImpl$$in10;
       Boolean uBoolean1;
       CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 $this_unsafe;
       Object ozipImpl$$in13;
       l1 obj2;
       AbortFlowException uAbortFlowEx;
       CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 ozipImpl$$in = this;
       e0 obj = b.h();
       CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 label = ozipImpl$$in.label;
       CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 ozipImpl$$in1 = 4;
       CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 ozipImpl$$in2 = 3;
       CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 ozipImpl$$in3 = 2;
       int i = 1;
       if (label != null) {
          if (label != i) {
             if (label != ozipImpl$$in3) {
                if (label != ozipImpl$$in2) {
                   if (label == ozipImpl$$in1) {
                      l$8 = ozipImpl$$in.L$8;
                      l$2 = ozipImpl$$in.L$2;
                      j0.n(p0);
                      ozipImpl$$in2 = ozipImpl$$in.L$9;
                      label = ozipImpl$$in.L$0;
                      ozipImpl$$in4 = ozipImpl$$in.L$6;
                      ozipImpl$$in3 = ozipImpl$$in.L$4;
                      ozipImpl$$in5 = ozipImpl$$in.L$1;
                      ozipImpl$$in6 = ozipImpl$$in.L$7;
                      ozipImpl$$in7 = ozipImpl$$in.L$5;
                      ozipImpl$$in8 = ozipImpl$$in.L$3;
                      ozipImpl$$in9 = ozipImpl$$in;
                   label_024b :
                      ozipImpl$$in1 = ozipImpl$$in8;
                   label_024e :
                      i = 1;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   label = ozipImpl$$in.L$12;
                   ozipImpl$$in8 = ozipImpl$$in.L$3;
                   j0.n(p0);
                   $this_unsafe = ozipImpl$$in.L$1;
                   ozipImpl$$in2 = ozipImpl$$in.L$9;
                   ozipImpl$$in7 = ozipImpl$$in.L$7;
                   ozipImpl$$in9 = ozipImpl$$in;
                   ozipImpl$$in13 = obj;
                   obj2 = p0;
                   l$2 = ozipImpl$$in.L$2;
                   ozipImpl$$in1 = ozipImpl$$in.L$11;
                   ozipImpl$$in4 = ozipImpl$$in.L$0;
                   ozipImpl$$in3 = ozipImpl$$in.L$5;
                   ozipImpl$$in10 = ozipImpl$$in.L$10;
                   l$8 = ozipImpl$$in.L$8;
                   ozipImpl$$in5 = ozipImpl$$in.L$6;
                   ozipImpl$$in6 = ozipImpl$$in.L$4;
                label_021f :
                   ozipImpl$$in9.L$0 = ozipImpl$$in4;
                   ozipImpl$$in9.L$1 = $this_unsafe;
                   ozipImpl$$in9.L$2 = l$2;
                   ozipImpl$$in9.L$3 = ozipImpl$$in8;
                   ozipImpl$$in9.L$4 = ozipImpl$$in6;
                   ozipImpl$$in9.L$5 = ozipImpl$$in3;
                   ozipImpl$$in9.L$6 = ozipImpl$$in5;
                   ozipImpl$$in9.L$7 = ozipImpl$$in7;
                   ozipImpl$$in9.L$8 = l$8;
                   ozipImpl$$in9.L$9 = ozipImpl$$in2;
                   ozipImpl$$in9.L$10 = ozipImpl$$in10;
                   ozipImpl$$in9.L$11 = ozipImpl$$in1;
                   ozipImpl$$in9.label = 4;
                   if (label.emit(obj2, ozipImpl$$in9) == ozipImpl$$in13) {
                      return ozipImpl$$in13;
                   }else {
                      obj2 = ozipImpl$$in13;
                      label = ozipImpl$$in4;
                      ozipImpl$$in4 = ozipImpl$$in5;
                      ozipImpl$$in5 = $this_unsafe;
                      ozipImpl$$in7 = ozipImpl$$in3;
                      ozipImpl$$in3 = ozipImpl$$in6;
                      ozipImpl$$in6 = ozipImpl$$in7;
                      goto label_024b ;
                   }
                }
             }else {
                ozipImpl$$in2 = ozipImpl$$in.L$9;
                ozipImpl$$in5 = ozipImpl$$in.L$6;
                ozipImpl$$in6 = ozipImpl$$in.L$1;
                j0.n(p0);
                uBoolean1 = p0;
                ozipImpl$$in8 = ozipImpl$$in.L$2;
                l$2 = ozipImpl$$in.L$7;
                ozipImpl$$in4 = ozipImpl$$in.L$11;
                label = ozipImpl$$in.L$0;
                ozipImpl$$in10 = ozipImpl$$in.L$10;
                ozipImpl$$in1 = ozipImpl$$in.L$3;
                ozipImpl$$in9 = ozipImpl$$in;
                l$8 = ozipImpl$$in.L$8;
                ozipImpl$$in3 = ozipImpl$$in.L$4;
                ozipImpl$$in7 = ozipImpl$$in.L$5;
             label_01c1 :
                if (!uBoolean1.booleanValue()) {
                   ozipImpl$$in4 = ozipImpl$$in5;
                   ozipImpl$$in5 = ozipImpl$$in6;
                   ozipImpl$$in6 = l$2;
                   l$2 = ozipImpl$$in8;
                   goto label_024e ;
                }else {
                   $this_unsafe = ozipImpl$$in9.$this_unsafeFlow;
                   Object obj1 = obj;
                   obj = j.a;
                   CombineKt$zipImpl$$inlined$unsafeFlow$1 ozipImpl$$in11 = ozipImpl$$in9.this$0.c;
                   ozipImpl$$in = (ozipImpl$$in4 == obj)? null: ozipImpl$$in4;
                   CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 ozipImpl$$in12 = ozipImpl$$in;
                   ozipImpl$$in13 = ozipImpl$$in1.next();
                   if (ozipImpl$$in13 == obj) {
                      ozipImpl$$in13 = null;
                   }
                   ozipImpl$$in9.L$0 = label;
                   ozipImpl$$in9.L$1 = ozipImpl$$in6;
                   ozipImpl$$in9.L$2 = ozipImpl$$in8;
                   ozipImpl$$in9.L$3 = ozipImpl$$in1;
                   ozipImpl$$in9.L$4 = ozipImpl$$in3;
                   ozipImpl$$in9.L$5 = ozipImpl$$in7;
                   ozipImpl$$in9.L$6 = ozipImpl$$in5;
                   ozipImpl$$in9.L$7 = l$2;
                   ozipImpl$$in9.L$8 = l$8;
                   ozipImpl$$in9.L$9 = ozipImpl$$in2;
                   ozipImpl$$in9.L$10 = ozipImpl$$in10;
                   ozipImpl$$in9.L$11 = ozipImpl$$in4;
                   ozipImpl$$in9.L$12 = $this_unsafe;
                   ozipImpl$$in9.label = 3;
                   CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 ozipImpl$$in14 = label;
                   obj2 = ozipImpl$$in11.invoke(ozipImpl$$in12, ozipImpl$$in13, ozipImpl$$in9);
                   ozipImpl$$in13 = obj1;
                   if (obj2 == ozipImpl$$in13) {
                      return ozipImpl$$in13;
                   }else {
                      label = $this_unsafe;
                      $this_unsafe = ozipImpl$$in6;
                      ozipImpl$$in6 = ozipImpl$$in3;
                      ozipImpl$$in3 = ozipImpl$$in7;
                      ozipImpl$$in7 = l$2;
                      l$2 = ozipImpl$$in8;
                      ozipImpl$$in8 = ozipImpl$$in1;
                      ozipImpl$$in1 = ozipImpl$$in4;
                      ozipImpl$$in4 = ozipImpl$$in14;
                      goto label_021f ;
                   }
                }
             }
          }else {
             ozipImpl$$in5 = ozipImpl$$in.L$6;
             l$2 = ozipImpl$$in.L$2;
             j0.n(p0);
             uBoolean = p0;
             ozipImpl$$in6 = ozipImpl$$in.L$1;
             ozipImpl$$in7 = ozipImpl$$in.L$4;
             ozipImpl$$in4 = ozipImpl$$in.L$7;
             ozipImpl$$in2 = ozipImpl$$in.L$9;
             label = ozipImpl$$in;
             ozipImpl$$in3 = ozipImpl$$in.L$8;
             ozipImpl$$in1 = ozipImpl$$in.L$0;
             ozipImpl$$in9 = ozipImpl$$in.L$3;
             l$8 = ozipImpl$$in.L$5;
          label_0184 :
             if (uBoolean.booleanValue()) {
                ozipImpl$$in10 = ozipImpl$$in2.next();
                label.L$0 = ozipImpl$$in1;
                label.L$1 = ozipImpl$$in6;
                label.L$2 = l$2;
                label.L$3 = ozipImpl$$in9;
                label.L$4 = ozipImpl$$in7;
                label.L$5 = l$8;
                label.L$6 = ozipImpl$$in5;
                label.L$7 = ozipImpl$$in4;
                label.L$8 = ozipImpl$$in3;
                label.L$9 = ozipImpl$$in2;
                label.L$10 = ozipImpl$$in10;
                label.L$11 = ozipImpl$$in10;
                label.label = 2;
                uBoolean1 = ozipImpl$$in9.a(label);
                if (uBoolean1 == obj) {
                   return obj;
                }else {
                   ozipImpl$$in8 = l$2;
                   l$2 = ozipImpl$$in4;
                   ozipImpl$$in4 = ozipImpl$$in10;
                   ozipImpl$$in9 = label;
                   label = ozipImpl$$in1;
                   ozipImpl$$in1 = ozipImpl$$in9;
                   l$8 = ozipImpl$$in3;
                   ozipImpl$$in3 = ozipImpl$$in7;
                   ozipImpl$$in7 = l$8;
                   goto label_01c1 ;
                }
             }else {
                obj2 = l1.a;
                try{
                   o.r(ozipImpl$$in5, ozipImpl$$in4);
                   if (!l$2.n()) {
                      uAbortFlowEx = new AbortFlowException(label.$this_unsafeFlow);
                   }
                   return l1.a;
                }catch(kotlinx.coroutines.flow.internal.AbortFlowException e0){
                   e.b(e0, label.$this_unsafeFlow);
                   if (!l$2.n()) {
                      uAbortFlowEx = new AbortFlowException(label.$this_unsafeFlow);
                   }else {
                      goto label_029c ;
                   }
                }
                l$2.b(uAbortFlowEx);
                goto label_029c ;
             }
          }
       }else {
          j0.n(p0);
          label = ozipImpl$$in.p$;
          ozipImpl$$in5 = CombineKt.a(label, ozipImpl$$in.this$0.a);
          l$2 = CombineKt.a(label, ozipImpl$$in.this$0.b);
          if (l$2 != null) {
             l$2.t(new CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$1(ozipImpl$$in, ozipImpl$$in5));
             ChannelIterator uChannelIter = l$2.iterator();
             ChannelIterator uChannelIter1 = ozipImpl$$in5.iterator();
             ozipImpl$$in7 = ozipImpl$$in;
             ozipImpl$$in9 = ozipImpl$$in7;
             y oy = ozipImpl$$in5;
             ozipImpl$$in4 = oy;
             l$8 = ozipImpl$$in4;
             ozipImpl$$in6 = null;
          }else {
             throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
          }
       }
       ozipImpl$$in9.L$0 = label;
       ozipImpl$$in9.L$1 = ozipImpl$$in5;
       ozipImpl$$in9.L$2 = l$2;
       ozipImpl$$in9.L$3 = ozipImpl$$in1;
       ozipImpl$$in9.L$4 = ozipImpl$$in3;
       ozipImpl$$in9.L$5 = ozipImpl$$in7;
       ozipImpl$$in9.L$6 = ozipImpl$$in4;
       ozipImpl$$in9.L$7 = ozipImpl$$in6;
       ozipImpl$$in9.L$8 = l$8;
       ozipImpl$$in9.L$9 = ozipImpl$$in2;
       ozipImpl$$in9.label = i;
       uBoolean = ozipImpl$$in2.a(ozipImpl$$in7);
       if (uBoolean == obj) {
          return obj;
       }else {
          ozipImpl$$in1 = label;
          label = ozipImpl$$in9;
          ozipImpl$$in9 = ozipImpl$$in1;
          ozipImpl$$in7 = ozipImpl$$in3;
          ozipImpl$$in3 = l$8;
          l$8 = ozipImpl$$in7;
          ozipImpl$$in5 = ozipImpl$$in4;
          ozipImpl$$in4 = ozipImpl$$in6;
          ozipImpl$$in6 = ozipImpl$$in5;
          goto label_0184 ;
       }
    }
}
