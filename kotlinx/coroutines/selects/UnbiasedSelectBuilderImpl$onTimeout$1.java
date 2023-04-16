package kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$onTimeout$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl;
import msd.l;
import java.lang.Object;
import qrd.l1;
import otd.b;

public final class UnbiasedSelectBuilderImpl$onTimeout$1 extends Lambda implements a	// class@001b46
{
    public final l $block;
    public final long $timeMillis;
    public final UnbiasedSelectBuilderImpl this$0;

    public void UnbiasedSelectBuilderImpl$onTimeout$1(UnbiasedSelectBuilderImpl p0,long p1,l p2){
       this.this$0 = p0;
       this.$timeMillis = p1;
       this.$block = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       this.this$0.b().i(this.$timeMillis, this.$block);
    }
}
