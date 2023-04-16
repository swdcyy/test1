package d5c.w;
import java.lang.Runnable;
import d5c.g0;
import java.lang.Object;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;

public final class w implements Runnable	// class@002118
{
    public final g0 b;
    public final int c;

    public void w(g0 p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.C.t(this.c, 0);
    }
}
