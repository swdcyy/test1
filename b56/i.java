package b56.i;
import com.kwai.feed.player.ui.GestureView$f;
import com.kwai.feed.player.ui.KwaiXfControlPanel;
import java.lang.Object;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.Set;
import com.kwai.feed.player.ui.KwaiXfControlPanel$c;
import com.kwai.framework.player.core.b;
import android.widget.FrameLayout;
import android.view.View;

public final class i implements GestureView$f	// class@000407
{
    public final KwaiXfControlPanel a;

    public void i(KwaiXfControlPanel p0){
       this.a = p0;
    }
    public final void a(MotionEvent p0,boolean p1){
       i ta = this.a;
       KwaiXfControlPanel s = ta.s;
       if (s != null) {
          Iterator iterator = s.iterator();
          do {
             if (iterator.hasNext()) {
             }else if(!KwaiXfControlPanel.h(ta.c)){
                boolean b = false;
                if (ta.y != null) {
                   iterator = ta.c.isPlaying();
                   int i = (!ta.u.getVisibility())? 1: 0;
                   if (iterator != i) {
                      b = true;
                   }
                   ta.w(iterator, b);
                   ta.i((ta.c.isPlaying() ^ 1), ta.F);
                   break ;
                }else if(ta.u.getVisibility()){
                   b = true;
                }
                ta.v(b);
                break ;
             }
          } while (iterator.next().a());
       }else {
          goto label_001d ;
       }
       return;
    }
}
