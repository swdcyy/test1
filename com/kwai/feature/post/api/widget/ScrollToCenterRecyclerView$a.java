package com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;

public class ScrollToCenterRecyclerView$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@00147d
{
    public final int b;
    public final ScrollToCenterRecyclerView c;

    public void ScrollToCenterRecyclerView$a(ScrollToCenterRecyclerView p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, ScrollToCenterRecyclerView$a.class, "1")) {
          return;
       }
       this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.c.x(this.b);
       return;
    }
}
