package com.yxcorp.gifshow.growth.home.pymk.widget.c;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.growth.home.pymk.widget.a;
import com.yxcorp.gifshow.growth.home.pymk.widget.a$d;
import android.view.ViewPropertyAnimator;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator$AnimatorListener;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.y;
import java.util.ArrayList;
import java.util.Objects;

public class c extends AnimatorListenerAdapter	// class@0013b2
{
    public final a$d a;
    public final ViewPropertyAnimator b;
    public final View c;
    public final a d;

    public void c(a p0,a$d p1,ViewPropertyAnimator p2,View p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.b.setListener(null);
       this.c.setAlpha(0x3f800000);
       this.c.setTranslationX(0);
       this.c.setTranslationY(0);
       this.d.G(this.a.b, false);
       this.d.r.remove(this.a.b);
       this.d.M();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.d);
       return;
    }
}
