package androidx.slidingpanelayout.widget.SlidingPaneLayout$b;
import java.lang.Runnable;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import android.view.View;
import java.lang.Object;
import android.view.ViewParent;
import android.graphics.Paint;
import java.util.ArrayList;

public class SlidingPaneLayout$b implements Runnable	// class@000990
{
    public final View b;
    public final SlidingPaneLayout c;

    public void SlidingPaneLayout$b(SlidingPaneLayout p0,View p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void run(){
       if (this.b.getParent() == this.c) {
          this.b.setLayerType(0, null);
          this.c.invalidateChildRegion(this.b);
       }
       this.c.mPostedRunnables.remove(this);
       return;
    }
}
