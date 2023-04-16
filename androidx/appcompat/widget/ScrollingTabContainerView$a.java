package androidx.appcompat.widget.ScrollingTabContainerView$a;
import java.lang.Runnable;
import androidx.appcompat.widget.ScrollingTabContainerView;
import android.view.View;
import java.lang.Object;
import android.widget.HorizontalScrollView;

public class ScrollingTabContainerView$a implements Runnable	// class@000610
{
    public final View b;
    public final ScrollingTabContainerView c;

    public void ScrollingTabContainerView$a(ScrollingTabContainerView p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.c.smoothScrollTo((this.b.getLeft() - ((this.c.getWidth() - this.b.getWidth()) / 2)), 0);
       this.c.b = null;
    }
}
