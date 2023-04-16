package com.kwai.library.widget.refresh.RefreshLayout$a;
import android.view.animation.Animation;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.animation.Transformation;
import com.kwai.library.widget.refresh.RefreshLayout$e;
import java.lang.Enum;
import android.view.View;

public class RefreshLayout$a extends Animation	// class@0009c5
{
    public final RefreshLayout b;

    public void RefreshLayout$a(RefreshLayout p0){
       this.b = p0;
       super();
    }
    public void applyTransformation(float p0,Transformation p1){
       RefreshLayout$a tb = this.b;
       if (tb.K == null) {
          return;
       }
       if (RefreshLayout$e.a[tb.J.ordinal()] != 1) {
          tb = this.b;
          tb.f(tb.C, (float)tb.K.getTop(), p0);
       }else {
          tb = this.b;
          tb.f((tb.C + tb.B), (float)tb.N.getTop(), p0);
       }
       return;
    }
}
