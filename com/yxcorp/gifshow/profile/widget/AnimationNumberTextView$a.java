package com.yxcorp.gifshow.profile.widget.AnimationNumberTextView$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.widget.AnimationNumberTextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public class AnimationNumberTextView$a implements Runnable	// class@0015ea
{
    public final AnimationNumberTextView b;

    public void AnimationNumberTextView$a(AnimationNumberTextView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AnimationNumberTextView$a.class, "1")) {
          return;
       }
       AnimationNumberTextView$a tb = this.b;
       if (tb.i != null) {
          tb.postDelayed(this, 20);
          int i = 0;
          AnimationNumberTextView$a tb1 = this.b;
          while (i < tb1.b) {
             AnimationNumberTextView d = tb1.d;
             int i1 = d[i] - tb1.c[i];
             d[i] = i1;
             i = i + 1;
          }
          tb1.invalidate();
       }
       return;
    }
}
