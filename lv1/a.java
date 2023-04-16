package lv1.a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.pendant.a;
import java.lang.Object;
import zv1.e$d;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import lv1.c;

public final class a implements Runnable	// class@00305d
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       if (tb.b.b()) {
          tb.b.a();
       }
       tb.f = true;
       b.Z(LiveLogTag.LIVE_RIGHT_BOTTOM_ACTIVITY_WIDGET_ANIMATION, "start loop : on restart loop task");
       tb.c.c();
       return;
    }
}
