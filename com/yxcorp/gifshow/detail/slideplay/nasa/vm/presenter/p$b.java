package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.p$b;
import d6a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import java.util.LinkedList;

public class p$b extends a	// class@00182d
{
    public final p b;

    public void p$b(p p0){
       this.b = p0;
       super();
    }
    public void i2(){
       if (PatchProxy.applyVoidWithListener(null, this, p$b.class, "1")) {
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
       this.b.O.clear();
       PatchProxy.onMethodExit(p$b.class, "1");
       return;
    }
}
