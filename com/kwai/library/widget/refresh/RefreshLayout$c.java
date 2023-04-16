package com.kwai.library.widget.refresh.RefreshLayout$c;
import android.view.animation.Animation$AnimationListener;
import com.kwai.library.widget.refresh.RefreshLayout;
import java.lang.Object;
import android.view.animation.Animation;
import android.view.View;
import a2.i0;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import o17.j;
import java.lang.String;
import com.yxcorp.utility.Log;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import java.util.List;

public class RefreshLayout$c implements Animation$AnimationListener	// class@0009c7
{
    public final RefreshLayout b;

    public void RefreshLayout$c(RefreshLayout p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       RefreshLayout t;
       RefreshLayout$c tb = this.b;
       if (tb.m != null && i0.X(tb)) {
          t = this.b.T;
          if (t != null) {
             t.onRefresh();
          }
       }
       t.i = false;
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
       RefreshLayout$c tb = this.b;
       tb.i = true;
       tb.S.refreshing();
       Log.g("RefreshLayout", "refreshing");
       RefreshLayout v = this.b.V;
       if (v != null) {
          v.b();
       }
       if (this.b.W != null) {
          for (int i = 0; i < this.b.W.size(); i++) {
             this.b.W.get(i).b();
          }
       }
       return;
    }
}
