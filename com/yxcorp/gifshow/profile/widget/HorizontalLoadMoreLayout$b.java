package com.yxcorp.gifshow.profile.widget.HorizontalLoadMoreLayout$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.widget.HorizontalLoadMoreLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.FrameLayout;
import android.widget.Scroller;

public final class HorizontalLoadMoreLayout$b implements Runnable	// class@0015f3
{
    public final HorizontalLoadMoreLayout b;

    public void HorizontalLoadMoreLayout$b(HorizontalLoadMoreLayout p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HorizontalLoadMoreLayout$b.class, "1")) {
          return;
       }
       HorizontalLoadMoreLayout$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, HorizontalLoadMoreLayout.class, "14")) {
          tb.j.startScroll(tb.getScrollX(), tb.getScrollY(), (- tb.getScrollX()), (- tb.getScrollY()));
          tb.invalidate();
          tb.b();
       }
       return;
    }
}
