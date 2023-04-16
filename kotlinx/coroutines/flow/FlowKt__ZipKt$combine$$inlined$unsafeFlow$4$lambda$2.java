package kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$4$lambda$2;
import msd.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$4;
import jtd.e;
import java.lang.Object;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import msd.p;
import nsd.c0;

public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$4$lambda$2 extends SuspendLambda implements q	// class@001ae3
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public e p$;
    public Object[] p$0;
    public final FlowKt__ZipKt$combine$$inlined$unsafeFlow$4 this$0;

    public void FlowKt__ZipKt$combine$$inlined$unsafeFlow$4$lambda$2(c p0,FlowKt__ZipKt$combine$$inlined$unsafeFlow$4 p1){
       this.this$0 = p1;
       super(3, p0);
    }
    public final c create(e p0,Object[] p1,c p2){
       FlowKt__ZipKt$combine$$inlined$unsafeFlow$4$lambda$2 uocombine$$i = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$4$lambda$2(p2, this.this$0);
       uocombine$$i.p$ = p0;
       uocombine$$i.p$0 = p1;
       return uocombine$$i;
    }
    public final Object invoke(Object p0,Object p1,Object p2){
       return this.create(p0, p1, p2).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__ZipKt$combine$$inlined$unsafeFlow$4$lambda$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          tlabel = this.p$0;
          this.L$0 = p0;
          this.L$1 = tlabel;
          this.label = 1;
          if (p0.emit(this.this$0.b.invoke(tlabel, this), this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
    public final Object invokeSuspend$$forInline(Object p0){
       c0.e(0);
       this.p$.emit(this.this$0.b.invoke(this.p$0, this), this);
       c0.e(2);
       c0.e(1);
       return l1.a;
    }
}
