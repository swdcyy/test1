package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.n$b;
import d6a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import java.util.LinkedList;

public class n$b extends a	// class@001826
{
    public final n b;

    public void n$b(n p0){
       this.b = p0;
       super();
    }
    public void i2(){
       if (PatchProxy.applyVoidWithListener(null, this, n$b.class, "1")) {
          return;
       }
       if (this.b.r != null) {
          int i = 0;
          while (i < this.b.r.getChildCount()) {
             if (this.b.r.getChildAt(i) instanceof LottieAnimationView && this.b.r.getChildAt(i).p()) {
                this.b.r.getChildAt(i).f();
             }
             i = i + 1;
          }
          this.b.r.removeAllViews();
       }
       this.b.K.clear();
       PatchProxy.onMethodExit(n$b.class, "1");
       return;
    }
}
