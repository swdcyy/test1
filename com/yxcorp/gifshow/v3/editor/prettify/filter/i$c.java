package com.yxcorp.gifshow.v3.editor.prettify.filter.i$c;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.v3.editor.prettify.filter.i;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class i$c extends AnimatorListenerAdapter	// class@001173
{
    public final View a;
    public final boolean b;
    public final i c;

    public void i$c(i p0,View p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$c.class, "1")) {
          return;
       }
       i$c ta = this.a;
       int i = (this.b != null)? 0: 8;
       ta.setVisibility(i);
       return;
    }
}
