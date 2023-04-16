package com.kwai.library.widget.refresh.RefreshLayout$d;
import android.view.animation.Animation$AnimationListener;
import com.kwai.library.widget.refresh.RefreshLayout;
import java.lang.Object;
import android.view.animation.Animation;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import java.util.List;

public class RefreshLayout$d implements Animation$AnimationListener	// class@0009c8
{
    public final RefreshLayout b;

    public void RefreshLayout$d(RefreshLayout p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       this.b.F();
       RefreshLayout v = this.b.V;
       if (v != null) {
          v.refreshComplete();
       }
       if (this.b.W != null) {
          for (int i = 0; i < this.b.W.size(); i++) {
             this.b.W.get(i).refreshComplete();
          }
       }
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
       p0.i = true;
    }
}
