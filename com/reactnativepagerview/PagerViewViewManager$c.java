package com.reactnativepagerview.PagerViewViewManager$c;
import java.lang.Runnable;
import android.view.View;
import java.lang.Object;
import android.view.View$MeasureSpec;

public final class PagerViewViewManager$c implements Runnable	// class@000b70
{
    public final View b;

    public void PagerViewViewManager$c(View p0){
       this.b = p0;
       super();
    }
    public final void run(){
       PagerViewViewManager$c tb = this.b;
       tb.measure(View$MeasureSpec.makeMeasureSpec(tb.getWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(this.b.getHeight(), 0x40000000));
       tb = this.b;
       tb.layout(tb.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
    }
}
