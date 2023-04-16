package kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import jtd.d;
import msd.q;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1;
import csd.b;
import java.lang.Throwable;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import jtd.f;
import qrd.l1;

public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 implements d	// class@001a11
{
    public final d a;
    public final q b;

    public void FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(d p0,q p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object b(e p0,c p1){
       FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 uocatch$$inl;
       FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 l$0;
       if (p1 instanceof FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1) {
          uocatch$$inl = p1;
          FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 label = uocatch$$inl.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uocatch$$inl.label = label - i;
          label_0018 :
             FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 result = uocatch$$inl.result;
             Object obj = b.h();
             FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 label1 = uocatch$$inl.label;
             FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 uocatch$$inl1 = 1;
             if (label1 != null) {
                if (label1 != uocatch$$inl1) {
                   if (label1 == 2) {
                      j0.n(result);
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 l$3 = uocatch$$inl.L$3;
                   label1 = uocatch$$inl.L$2;
                   uocatch$$inl1 = uocatch$$inl.L$1;
                   l$0 = uocatch$$inl.L$0;
                   j0.n(result);
                label_0075 :
                   if (result != null) {
                      uocatch$$inl.L$0 = l$0;
                      uocatch$$inl.L$1 = uocatch$$inl1;
                      uocatch$$inl.L$2 = label1;
                      uocatch$$inl.L$3 = l$3;
                      uocatch$$inl.L$4 = result;
                      uocatch$$inl.label = 2;
                      if (l$0.b.invoke(l$3, result, uocatch$$inl) == obj) {
                         return obj;
                      }
                   }
                }
             }else {
                j0.n(result);
                uocatch$$inl.L$0 = this;
                uocatch$$inl.L$1 = p0;
                uocatch$$inl.L$2 = uocatch$$inl;
                uocatch$$inl.L$3 = p0;
                uocatch$$inl.label = uocatch$$inl1;
                result = f.t(this.a, p0, uocatch$$inl);
                if (result == obj) {
                   return obj;
                }else {
                   l$0 = this;
                   uocatch$$inl1 = p0;
                   label1 = uocatch$$inl;
                   goto label_0075 ;
                }
             }
             return l1.a;
          }
       }
       uocatch$$inl = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1(this, p1);
       goto label_0018 ;
    }
}
