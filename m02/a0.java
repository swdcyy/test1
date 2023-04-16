package m02.a0;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;

public final class a0 implements Runnable	// class@0030a8
{
    public final LivePlayFragment b;

    public void a0(LivePlayFragment p0){
       this.b = p0;
    }
    public final void run(){
       this.b.Oh(true);
    }
}
