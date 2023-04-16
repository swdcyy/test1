package com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class PrettifyConfigView$b extends AnimatorListenerAdapter	// class@0011aa
{
    public final View a;
    public final PrettifyConfigView b;

    public void PrettifyConfigView$b(PrettifyConfigView p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyConfigView$b.class, "1")) {
          return;
       }
       this.a.setVisibility(8);
       return;
    }
}
