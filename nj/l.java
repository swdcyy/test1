package nj.l;
import com.kwai.feed.player.ui.GestureView$f;
import com.gifshow.tuna.player.component.a;
import java.lang.Object;
import android.view.MotionEvent;
import com.kwai.framework.player.core.b;

public final class l implements GestureView$f	// class@002718
{
    public final a a;

    public void l(a p0){
       this.a = p0;
    }
    public final void a(MotionEvent p0,boolean p1){
       l ta = this.a;
       a c = ta.c;
       if (c != null) {
          if (c.isPaused()) {
             ta.c.start();
          }else if(ta.c.isPlaying()){
             ta.c.pause();
          }
       }
       return;
    }
}
