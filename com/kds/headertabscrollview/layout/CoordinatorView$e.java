package com.kds.headertabscrollview.layout.CoordinatorView$e;
import java.lang.Runnable;
import com.kds.headertabscrollview.layout.CoordinatorView;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;

public final class CoordinatorView$e implements Runnable	// class@00071c
{
    public final CoordinatorView b;

    public void CoordinatorView$e(CoordinatorView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       CoordinatorView$e tb = this.b;
       if (this.b.E != null) {
          return;
       }
       tb = this.b;
       tb.measure(View$MeasureSpec.makeMeasureSpec(tb.getWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(this.b.getHeight(), 0x40000000));
       tb = this.b;
       tb.layout(tb.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
       return;
    }
}
