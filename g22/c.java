package g22.c;
import msd.l;
import com.kuaishou.live.core.show.activitydialog.LiveActivityBottomDialog;
import com.kuaishou.live.basic.tk.LiveTkBridge;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import java.lang.Object;
import z51.c;
import g22.a;
import androidx.viewpager.widget.ViewPager;
import sx4.e;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c implements l	// class@002a45
{
    public final LiveActivityBottomDialog b;
    public final LiveTkBridge c;
    public final Activity d;
    public final View e;
    public final FrameLayout$LayoutParams f;

    public void c(LiveActivityBottomDialog p0,LiveTkBridge p1,Activity p2,View p3,FrameLayout$LayoutParams p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object invoke(Object p0){
       c tb = this.b;
       c te = this.e;
       c tf = this.f;
       tb.M = p0;
       p0.e = new a(tb.A);
       p0 = p0.a(this.c, this.d);
       tb.L = p0;
       if (te instanceof ViewGroup && p0 != null) {
          if (tb.N != null) {
             p0.getView().setVisibility(8);
          }
          te.addView(tb.L.getView(), tf);
          tb.Eh(tb.J);
       }else {
          b.B(LiveLogTag.LIVE_ACTIVITY_DIALOG, "KdsView createTkView load error, tabData is "+tb.G);
       }
       return null;
    }
}
