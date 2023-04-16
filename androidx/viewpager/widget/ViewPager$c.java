package androidx.viewpager.widget.ViewPager$c;
import java.lang.Runnable;
import androidx.viewpager.widget.ViewPager;
import java.lang.Object;

public class ViewPager$c implements Runnable	// class@000a13
{
    public final ViewPager b;

    public void ViewPager$c(ViewPager p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.setScrollState(0);
       this.b.populate();
    }
}
