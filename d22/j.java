package d22.j;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.widget.LiveOverVerticalScrollViewGroup;
import android.view.View;
import java.lang.Object;

public final class j implements Runnable	// class@00242d
{
    public final LiveOverVerticalScrollViewGroup b;
    public final View c;

    public void j(LiveOverVerticalScrollViewGroup p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.e(this.c);
    }
}
