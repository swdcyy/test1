package com.kwai.library.widget.refresh.RefreshLayout$b;
import android.view.animation.Animation;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.animation.Transformation;
import com.kwai.library.widget.refresh.RefreshLayout$e;
import java.lang.Enum;
import android.view.View;

public class RefreshLayout$b extends Animation	// class@0009c6
{
    public final RefreshLayout b;

    public void RefreshLayout$b(RefreshLayout p0){
       this.b = p0;
       super();
    }
    public void applyTransformation(float p0,Transformation p1){
       RefreshLayout$b tb = this.b;
       if (tb.K == null) {
          return;
       }
       if (RefreshLayout$e.a[tb.J.ordinal()] != 1) {
          tb = this.b;
          tb.f(0, (float)tb.K.getTop(), p0);
       }else {
          tb = this.b;
          tb.f(tb.B, (float)tb.N.getTop(), p0);
       }
       return;
    }
}
