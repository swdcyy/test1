package akd.n;
import java.lang.Runnable;
import com.yxcorp.upgrade.impl.c$b;
import java.lang.Object;
import com.yxcorp.upgrade.impl.c;
import android.view.TextureView;
import android.widget.FrameLayout;
import android.widget.ImageView;

public final class n implements Runnable	// class@000059
{
    public final c$b b;

    public void n(c$b p0){
       this.b = p0;
    }
    public final void run(){
       n tb = this.b;
       tb.b.c.setVisibility(8);
       tb.b.l.setVisibility(8);
       tb.b.d.setVisibility(0);
    }
}
