package cl3.e;
import java.lang.Runnable;
import cl3.f;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.kuaishou.live.preview.log.LivePreviewLogTag;
import pp.c;
import java.lang.String;
import pp.d;
import cl3.n;
import com.kuaishou.live.common.core.basic.player.AdaptPlayViewReason;

public final class e implements Runnable	// class@00058e
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       tb.p = n.k(tb.i);
       tb.q = n.j(tb.i);
       if (tb.o != null) {
          tb.k.h(LivePreviewLogTag.LIVE_PREVIEW_PLAYER, "resize player view, triggered by content view attach");
          f o = tb.o;
          tb.h(o.a, o.b, tb.f());
       }
       return;
    }
}
