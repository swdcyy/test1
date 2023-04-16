package kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1$lambda$1;
import jtd.e;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1;
import java.lang.Object;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1$lambda$1$1;
import csd.b;
import java.lang.IllegalStateException;
import java.lang.String;
import qrd.j0;
import msd.p;
import java.lang.Boolean;
import qrd.l1;

public final class FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1$lambda$1 implements e	// class@001a21
{
    public final e b;
    public final Ref$BooleanRef c;
    public final FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1 d;

    public void FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1$lambda$1(e p0,Ref$BooleanRef p1,FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1 p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1$lambda$1$1 uodropWhile$;
       FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1$lambda$1$1 l$0;
       if (p1 instanceof FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1$lambda$1$1) {
          uodropWhile$ = p1;
          FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1$lambda$1$1 label = uodropWhile$.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uodropWhile$.label = label - i;
          label_0018 :
             FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1$lambda$1$1 result = uodropWhile$.result;
             Object obj = b.h();
             FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1$lambda$1$1 label1 = uodropWhile$.label;
             FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1$lambda$1$1 uodropWhile$1 = 2;
             if (label1 != null) {
                if (label1 != true) {
                   if (label1 != uodropWhile$1) {
                      if (label1 != 3) {
                         throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                      }
                   }else {
                      p0 = uodropWhile$.L$3;
                      label1 = uodropWhile$.L$2;
                      uodropWhile$1 = uodropWhile$.L$1;
                      l$0 = uodropWhile$.L$0;
                      j0.n(result);
                   label_0084 :
                      if (!result.booleanValue()) {
                         result.element = true;
                         uodropWhile$.L$0 = l$0;
                         uodropWhile$.L$1 = uodropWhile$1;
                         uodropWhile$.L$2 = label1;
                         uodropWhile$.L$3 = p0;
                         uodropWhile$.label = 3;
                         if (l$0.b.emit(p0, uodropWhile$) == obj) {
                            return obj;
                         }
                      }
                   }
                }
                j0.n(result);
             }else {
                j0.n(result);
                if (this.c.element != null) {
                   uodropWhile$.L$0 = this;
                   uodropWhile$.L$1 = p0;
                   uodropWhile$.L$2 = uodropWhile$;
                   uodropWhile$.L$3 = p0;
                   uodropWhile$.label = 1;
                   if (this.b.emit(p0, uodropWhile$) == obj) {
                      return obj;
                   }
                }else {
                   uodropWhile$.L$0 = this;
                   uodropWhile$.L$1 = p0;
                   uodropWhile$.L$2 = uodropWhile$;
                   uodropWhile$.L$3 = p0;
                   uodropWhile$.label = uodropWhile$1;
                   result = this.d.b.invoke(p0, uodropWhile$);
                   if (result == obj) {
                      return obj;
                   }else {
                      l$0 = this;
                      uodropWhile$1 = p0;
                      label1 = uodropWhile$;
                      goto label_0084 ;
                   }
                }
             }
             return l1.a;
          }
       }
       uodropWhile$ = new FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1$lambda$1$1(this, p1);
       goto label_0018 ;
    }
}
