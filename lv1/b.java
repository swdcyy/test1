package lv1.b;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.pendant.a;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import zv1.a;
import lv1.c;

public final class b implements Runnable	// class@00305e
{
    public final a b;

    public void b(a p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       b.Z(LiveLogTag.LIVE_RIGHT_BOTTOM_ACTIVITY_WIDGET_ANIMATION, "animation task start running");
       tb.e(tb.c.f());
    }
}
