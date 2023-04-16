package ac2.m;
import java.lang.Runnable;
import com.kuaishou.live.core.show.luckystar.currentinfo.c$a;
import java.lang.Object;
import com.kuaishou.live.core.show.luckystar.currentinfo.c;
import android.widget.ImageView;

public final class m implements Runnable	// class@0000b7
{
    public final c$a b;

    public void m(c$a p0){
       this.b = p0;
    }
    public final void run(){
       m tb = this.b;
       tb.a.A.setVisibility(8);
       tb.a.A.setAlpha(0x3f800000);
    }
}
