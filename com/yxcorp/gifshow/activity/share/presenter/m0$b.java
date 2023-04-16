package com.yxcorp.gifshow.activity.share.presenter.m0$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.activity.share.presenter.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class m0$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@001400
{
    public final int b;
    public final m0 c;

    public void m0$b(m0 p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, m0$b.class, "1")) {
          return;
       }
       if (this.c.u.getVisibility() != 8) {
          int height = this.c.u.getHeight();
          if (height) {
             ConstraintLayout$LayoutParams layoutParams = this.c.s.getLayoutParams();
             m0$b tc = this.c;
             if (tc.v != null) {
                layoutParams.leftMargin = this.b;
             }
             layoutParams.topMargin = height + tc.w;
             tc.s.setLayoutParams(layoutParams);
          }
       }else {
          ConstraintLayout$LayoutParams layoutParams1 = this.c.s.getLayoutParams();
          m0$b tc1 = this.c;
          if (tc1.v != null) {
             layoutParams1.leftMargin = this.b;
          }
          layoutParams1.topMargin = 0;
          tc1.s.setLayoutParams(layoutParams1);
       }
       return;
    }
}
