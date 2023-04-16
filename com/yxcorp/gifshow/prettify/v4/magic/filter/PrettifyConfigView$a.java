package com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.util.Property;
import android.animation.ObjectAnimator;

public class PrettifyConfigView$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0011a9
{
    public final View b;
    public final boolean c;
    public final PrettifyConfigView d;

    public void PrettifyConfigView$a(PrettifyConfigView p0,View p1,boolean p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, PrettifyConfigView$a.class, "1")) {
          return;
       }
       if (!this.b.getHeight()) {
          return;
       }
       this.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
       PrettifyConfigView$a tb = this.b;
       tb.setPivotY((float)tb.getHeight());
       PrettifyConfigView.n = this.b.getHeight();
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.b, View.ALPHA, new float[2]{0,0x3f800000});
       long l = (this.c != null)? 0: 250;
       objectAnimat.setDuration(l);
       objectAnimat.start();
       return;
    }
}
