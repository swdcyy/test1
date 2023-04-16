package cl3.c;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import cl3.f;
import java.lang.Object;
import cl3.n;
import com.kuaishou.live.common.core.basic.player.AdaptPlayViewReason;

public final class c implements LivePlayerTypeChangeListener	// class@00058c
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final void onLiveTypeChange(int p0){
       c tb = this.b;
       if (tb.p > null && tb.q > null) {
          f o = tb.o;
          if (o != null) {
             tb.h(o.a, o.b, tb.f());
          }
       }
       return;
    }
}
