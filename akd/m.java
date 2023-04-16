package akd.m;
import java.lang.Runnable;
import com.yxcorp.upgrade.impl.c;
import java.lang.Object;
import android.view.TextureView;
import android.widget.FrameLayout;
import android.widget.ImageView;

public final class m implements Runnable	// class@000058
{
    public final c b;

    public void m(c p0){
       this.b = p0;
    }
    public final void run(){
       m tb = this.b;
       tb.c.setVisibility(8);
       tb.l.setVisibility(8);
       tb.d.setVisibility(0);
    }
}
