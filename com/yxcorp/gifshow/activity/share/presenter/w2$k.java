package com.yxcorp.gifshow.activity.share.presenter.w2$k;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.activity.share.presenter.w2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.RelativeLayout$LayoutParams;

public class w2$k implements ViewTreeObserver$OnGlobalLayoutListener	// class@00144c
{
    public final w2 b;

    public void w2$k(w2 p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, w2$k.class, "1")) {
          return;
       }
       if (this.b.x.getHeight()) {
          w2$k tb = this.b;
          if (tb.c1 != null) {
             tb.e1 = tb.x.getHeight();
             RelativeLayout$LayoutParams layoutParams = this.b.y.getLayoutParams();
             w2$k tb1 = this.b;
             layoutParams.height = this.b.y.getHeight() + tb1.e1;
             tb1.y.setLayoutParams(layoutParams);
             this.b.c1 = false;
          }
       }
       return;
    }
}
