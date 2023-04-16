package bm.j;
import java.lang.Runnable;
import com.hhh.liveeventbus.LiveEventData;
import java.lang.Object;

public final class j implements Runnable	// class@00028e
{
    public final LiveEventData b;

    public void j(LiveEventData p0){
       this.b = p0;
    }
    public final void run(){
       j tb = this.b;
       LiveEventData a = tb.a;
       _monitor_enter(a);
       LiveEventData f = tb.f;
       tb.f = LiveEventData.j;
       _monitor_exit(a);
       tb.h(f);
    }
}
