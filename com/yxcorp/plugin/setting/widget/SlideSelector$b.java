package com.yxcorp.plugin.setting.widget.SlideSelector$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.plugin.setting.widget.SlideSelector;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.setting.widget.SlideSelector$c;

public class SlideSelector$b extends AnimatorListenerAdapter	// class@00093d
{
    public final int a;
    public final SlideSelector b;

    public void SlideSelector$b(SlideSelector p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideSelector$b.class, "1")) {
          return;
       }
       SlideSelector$b tb = this.b;
       tb.b(tb.P[this.a].a, false);
       return;
    }
}
