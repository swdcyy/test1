package com.yxcorp.gifshow.corona.krn.view.CoronaConnerFrameLayout$b;
import android.view.Choreographer$FrameCallback;
import com.yxcorp.gifshow.corona.krn.view.CoronaConnerFrameLayout;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import android.widget.FrameLayout;
import android.view.View;
import android.view.View$MeasureSpec;
import android.view.ViewTreeObserver;
import android.view.Choreographer;

public class CoronaConnerFrameLayout$b implements Choreographer$FrameCallback	// class@001288
{
    public final CoronaConnerFrameLayout b;

    public void CoronaConnerFrameLayout$b(CoronaConnerFrameLayout p0){
       this.b = p0;
       super();
    }
    public void doFrame(long p0){
       if (PatchProxy.isSupport(CoronaConnerFrameLayout$b.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, CoronaConnerFrameLayout$b.class, "1")) {
          return;
       }
       CoronaConnerFrameLayout$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, CoronaConnerFrameLayout.class, "3")) {
          for (int i = 0; i < tb.getChildCount(); i = i + 1) {
             View childAt = tb.getChildAt(i);
             childAt.measure(View$MeasureSpec.makeMeasureSpec(tb.getMeasuredWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(tb.getMeasuredHeight(), 0x40000000));
             childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
          }
       }
       this.b.getViewTreeObserver().dispatchOnGlobalLayout();
       Choreographer.getInstance().postFrameCallback(this);
       return;
    }
}
