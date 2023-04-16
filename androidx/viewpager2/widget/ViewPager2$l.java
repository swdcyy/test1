package androidx.viewpager2.widget.ViewPager2$l;
import java.lang.Runnable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;

public class ViewPager2$l implements Runnable	// class@000a3c
{
    public final int b;
    public final RecyclerView c;

    public void ViewPager2$l(int p0,RecyclerView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void run(){
       this.c.smoothScrollToPosition(this.b);
    }
}
