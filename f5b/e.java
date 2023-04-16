package f5b.e;
import java.lang.Runnable;
import android.widget.FrameLayout;
import f5b.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip;
import f5b.c;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip;

public final class e implements Runnable	// class@0028a8
{
    public final FrameLayout b;
    public final f c;

    public void e(FrameLayout p0,f p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, e.class, "1")) {
          return;
       }
       SmoothPagerSlidingTabStrip smoothPagerS = this.c.b.o(this.b);
       if (smoothPagerS != null) {
          smoothPagerS.n(smoothPagerS.getCurrentPosition(), 0);
       }
       PatchProxy.onMethodExit(e.class, "1");
       return;
    }
}
