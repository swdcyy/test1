package kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1;
import msd.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import jtd.e;
import java.lang.Object;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import msd.q;

public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1 extends SuspendLambda implements r	// class@001ad7
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public e p$;
    public Object p$0;
    public Object p$1;
    public final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 this$0;

    public void FlowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1(c p0,FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 p1){
       this.this$0 = p1;
       super(4, p0);
    }
    public final c create(e p0,Object p1,Object p2,c p3){
       FlowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1 uocombine$$i = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1(p3, this.this$0);
       uocombine$$i.p$ = p0;
       uocombine$$i.p$0 = p1;
       uocombine$$i.p$1 = p2;
       return uocombine$$i;
    }
    public final Object invoke(Object p0,Object p1,Object p2,Object p3){
       return this.create(p0, p1, p2, p3).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       FlowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1 tL$1;
       FlowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1 tL$0;
       Object obj = b.h();
       FlowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1 tlabel = this.label;
       FlowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1 uocombine$$i = 1;
       if (tlabel != null) {
          if (tlabel != uocombine$$i) {
             if (tlabel == 2) {
                j0.n(p0);
             label_005f :
                return l1.a;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tlabel = this.L$3;
             uocombine$$i = this.L$2;
             tL$1 = this.L$1;
             tL$0 = this.L$0;
             j0.n(p0);
          }
       }else {
          j0.n(p0);
          tlabel = this.p$;
          tL$1 = this.p$0;
          p0 = this.p$1;
          this.L$0 = tlabel;
          this.L$1 = tL$1;
          this.L$2 = p0;
          this.L$3 = tlabel;
          this.label = uocombine$$i;
          Object obj1 = this.this$0.c.invoke(tL$1, p0, this);
          if (obj1 == obj) {
             return obj;
          }else {
             tL$0 = tlabel;
             uocombine$$i = p0;
             p0 = obj1;
          }
       }
       this.L$0 = tL$0;
       this.L$1 = tL$1;
       this.L$2 = uocombine$$i;
       this.label = 2;
       if (tlabel.emit(p0, this) == obj) {
          return obj;
       }else {
          goto label_005f ;
       }
    }
}
