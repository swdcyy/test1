package hd9.x;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.utility.n;
import android.widget.RelativeLayout;

public final class x implements Runnable	// class@00262f
{
    public final d b;
    public final View c;

    public void x(d p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       x tb = this.b;
       x tc = this.c;
       Objects.requireNonNull(tb);
       tb.q.setY((float)(n.o(tc)[1] + tc.getHeight()));
    }
}
