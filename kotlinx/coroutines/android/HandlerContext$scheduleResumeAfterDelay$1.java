package kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.android.HandlerContext;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import android.os.Handler;

public final class HandlerContext$scheduleResumeAfterDelay$1 extends Lambda implements l	// class@001933
{
    public final Runnable $block;
    public final HandlerContext this$0;

    public void HandlerContext$scheduleResumeAfterDelay$1(HandlerContext p0,Runnable p1){
       this.this$0 = p0;
       this.$block = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       this.this$0.d.removeCallbacks(this.$block);
    }
}
