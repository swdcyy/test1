package o61.g;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.bottombar.component.widget.f;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.bottombar.component.widget.c;
import java.util.List;
import com.kuaishou.live.bottombar.component.widget.LiveBottomBarLinearLayout;

public final class g implements View$OnLayoutChangeListener	// class@003484
{
    public final f b;

    public void g(f p0){
       this.b = p0;
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       g tb = this.b;
       c j = tb.j;
       if (j == null || (!j.isEmpty() && tb.q != tb.i.getItemWidth())) {
          tb.q = tb.i.getItemWidth();
          tb.H(true, tb.j, null);
       }
    label_002a :
       return;
    }
}
