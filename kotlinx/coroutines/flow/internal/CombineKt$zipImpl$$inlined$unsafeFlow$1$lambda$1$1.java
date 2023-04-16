package kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1;
import htd.y;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import jtd.e;
import java.util.concurrent.CancellationException;

public final class CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$1 extends Lambda implements l	// class@001b23
{
    public final y $first;
    public final CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 this$0;

    public void CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1$1(CombineKt$zipImpl$$inlined$unsafeFlow$1$lambda$1 p0,y p1){
       this.this$0 = p0;
       this.$first = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (!this.$first.n()) {
          this.$first.b(new AbortFlowException(this.this$0.$this_unsafeFlow));
       }
       return;
    }
}
