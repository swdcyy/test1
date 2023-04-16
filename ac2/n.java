package ac2.n;
import java.lang.Runnable;
import com.kuaishou.live.core.show.luckystar.currentinfo.c$a;
import java.lang.Object;
import com.kuaishou.live.core.show.luckystar.currentinfo.c;
import android.widget.ImageView;

public final class n implements Runnable	// class@0000b8
{
    public final c$a b;

    public void n(c$a p0){
       this.b = p0;
    }
    public final void run(){
       n tb = this.b;
       tb.a.A.setVisibility(8);
       tb.a.A.setAlpha(0x3f800000);
    }
}
