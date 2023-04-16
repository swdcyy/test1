package h83.b;
import java.lang.Runnable;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLineViewController;
import ee3.b0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import android.view.ViewGroup;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import sa3.b;

public final class b implements Runnable	// class@002cf4
{
    public final LiveLiteMultiLineViewController b;
    public final b0 c;

    public void b(LiveLiteMultiLineViewController p0,b0 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       tb.s.an(this.c.a, LiveLiteMultiLineViewController.V2(tb).getWidth(), LiveLiteMultiLineViewController.V2(this.b).getTop());
       return;
    }
}
