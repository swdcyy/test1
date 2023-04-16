package kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
import jtd.d;
import msd.r;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1;
import csd.b;
import java.lang.Throwable;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import jtd.f;
import java.lang.Long;
import dsd.a;
import java.lang.Boolean;
import qrd.l1;

public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 implements d	// class@001a1c
{
    public final d a;
    public final r b;

    public void FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(d p0,r p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object b(e p0,c p1){
       FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 oretryWhen$$;
       FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 l$4;
       FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 l$2;
       FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 l$1;
       FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 l$0;
       long l;
       FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 oretryWhen$$1;
       FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 obj1;
       Object obj2;
       FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 obj3;
       if (p1 instanceof FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1) {
          oretryWhen$$ = p1;
          FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 label = oretryWhen$$.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             oretryWhen$$.label = i2;
          label_0018 :
             FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 result = oretryWhen$$.result;
             Object obj = b.h();
             FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 label1 = oretryWhen$$.label;
             if (label1 != null) {
                if (label1 != 1) {
                   if (label1 == 2) {
                      l$4 = oretryWhen$$.L$4;
                      FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 j$0 = oretryWhen$$.J$0;
                      label1 = oretryWhen$$.L$3;
                      l$2 = oretryWhen$$.L$2;
                      l$1 = oretryWhen$$.L$1;
                      l$0 = oretryWhen$$.L$0;
                      j0.n(result);
                   label_00ad :
                      if (result.booleanValue()) {
                         l = j$0 + 1;
                         result = l$1;
                         oretryWhen$$1 = 1;
                      label_00bd :
                         obj1 = obj;
                         label = l$2;
                         FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 oretryWhen$$2 = l;
                         if (oretryWhen$$1 == null) {
                            return l1.a;
                         }else {
                            l$4 = label1;
                            obj2 = obj1;
                            obj1 = oretryWhen$$2;
                            l$2 = l$0;
                         }
                      }else {
                         throw l$4;
                      }
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   oretryWhen$$1 = oretryWhen$$.I$0;
                   obj1 = oretryWhen$$.J$0;
                   label1 = oretryWhen$$.L$3;
                   l$2 = oretryWhen$$.L$2;
                   l$1 = oretryWhen$$.L$1;
                   l$0 = oretryWhen$$.L$0;
                   j0.n(result);
                label_008b :
                   if (result != null) {
                      oretryWhen$$.L$0 = obj3;
                      oretryWhen$$.L$1 = l$1;
                      oretryWhen$$.L$2 = l$2;
                      oretryWhen$$.L$3 = label1;
                      oretryWhen$$.J$0 = obj1;
                      oretryWhen$$.L$4 = result;
                      oretryWhen$$.label = 2;
                      oretryWhen$$1 = obj3.b.invoke(label1, result, a.g(obj1), oretryWhen$$);
                      if (oretryWhen$$1 == obj) {
                         return obj;
                      }else {
                         result = oretryWhen$$1;
                         l$4 = result;
                         goto label_00ad ;
                      }
                   }else {
                      result = l$1;
                      goto label_00bd ;
                   }
                }
             }else {
                j0.n(result);
                l = 0;
                FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 oretryWhen$$3 = this;
                result = p0;
                obj2 = obj;
                label = oretryWhen$$;
             }
             oretryWhen$$.L$0 = l$2;
             oretryWhen$$.L$1 = result;
             oretryWhen$$.L$2 = label;
             oretryWhen$$.L$3 = l$4;
             oretryWhen$$.J$0 = obj1;
             oretryWhen$$.I$0 = 0;
             oretryWhen$$.label = 1;
             obj3 = f.t(l$2.a, l$4, oretryWhen$$);
             if (obj3 == obj2) {
                return obj2;
             }else {
                l$1 = result;
                result = obj3;
                obj3 = l$2;
                l$2 = label;
                obj = obj2;
                label1 = l$4;
                oretryWhen$$1 = null;
                goto label_008b ;
             }
          }
       }
       oretryWhen$$ = new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1(this, p1);
       goto label_0018 ;
    }
}
