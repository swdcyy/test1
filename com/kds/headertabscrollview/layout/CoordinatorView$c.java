package com.kds.headertabscrollview.layout.CoordinatorView$c;
import android.view.View$OnLayoutChangeListener;
import com.kds.headertabscrollview.layout.CoordinatorView;
import java.lang.Object;
import android.view.View;
import java.lang.Runnable;
import android.widget.LinearLayout;

public final class CoordinatorView$c implements View$OnLayoutChangeListener	// class@00071a
{
    public final CoordinatorView b;

    public void CoordinatorView$c(CoordinatorView p0){
       this.b = p0;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       CoordinatorView$c tb = this.b;
       CoordinatorView c = tb.C;
       if (c != null) {
          c.post(tb.H);
       }
       return;
    }
}
