package b4d.r;
import com.yxcorp.plugin.emotion.widget.EmojiQuickSendRecycleView$a;
import b4d.w;
import java.lang.Object;
import android.view.View;

public final class r implements EmojiQuickSendRecycleView$a	// class@00038d
{
    public final w a;

    public void r(w p0){
       this.a = p0;
    }
    public final void q(int p0){
       w u = this.a.u;
       if (u != null) {
          p0 = (!p0)? 0: 4;
          u.setVisibility(p0);
       }
       return;
    }
}
