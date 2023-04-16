package b82.b;
import java.lang.Runnable;
import b82.d;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import android.view.View;
import ea1.b;

public final class b implements Runnable	// class@000365
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       b.a(tb.a, ViewElement.ENTER_ROOM_EFFECT);
       tb.e();
    }
}
