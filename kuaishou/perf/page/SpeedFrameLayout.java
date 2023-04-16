package kuaishou.perf.page.SpeedFrameLayout;
import android.widget.FrameLayout;
import android.graphics.Canvas;
import android.view.ViewGroup;
import kuaishou.perf.page.PageManagerMonitor;
import vtd.a;
import java.lang.String;

public class SpeedFrameLayout extends FrameLayout	// class@001be4
{
    public String b;

    public void dispatchDraw(Canvas p0){
       super.dispatchDraw(p0);
       if (a.a() != null) {
          a.a().onPageDrawEnd(this.b);
       }
       return;
    }
}
