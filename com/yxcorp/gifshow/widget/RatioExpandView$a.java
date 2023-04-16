package com.yxcorp.gifshow.widget.RatioExpandView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.widget.RatioExpandView;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import android.view.ViewTreeObserver;

public class RatioExpandView$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0018a7
{
    public final PostBubbleManager b;
    public final int c;
    public final RatioExpandView d;

    public void RatioExpandView$a(RatioExpandView p0,PostBubbleManager p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, RatioExpandView$a.class, "1")) {
          return;
       }
       if (this.d.j.getWidth() > 0 && this.d.j.getHeight() > 0) {
          this.d.j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.d.c(this.b, this.c);
       }
       return;
    }
}
