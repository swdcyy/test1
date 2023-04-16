package com.yxcorp.gifshow.activity.share.presenter.w2$i;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.activity.share.presenter.w2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.RelativeLayout$LayoutParams;

public class w2$i implements ViewTreeObserver$OnGlobalLayoutListener	// class@00144a
{
    public final w2 b;

    public void w2$i(w2 p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, w2$i.class, "1")) {
          return;
       }
       w2$i tb = this.b;
       if (this.b.u.getHeight() < tb.a1 && tb.b1 != null) {
          tb.e1 = tb.x.getHeight();
          w2$i tb1 = this.b;
          int i = tb1.a1 - tb1.u.getHeight();
          ConstraintLayout$LayoutParams layoutParams = this.b.D.getLayoutParams();
          layoutParams.height = this.b.D.getHeight() + i;
          this.b.D.setLayoutParams(layoutParams);
          RelativeLayout$LayoutParams layoutParams1 = this.b.y.getLayoutParams();
          layoutParams1.height = this.b.y.getHeight() + i;
          this.b.y.setLayoutParams(layoutParams1);
          tb1 = this.b;
          tb1.X0 = tb1.X0 + i;
          tb1.d1 = i;
          tb1.b1 = false;
       }
       return;
    }
}
