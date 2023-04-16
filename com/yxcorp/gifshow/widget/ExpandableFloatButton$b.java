package com.yxcorp.gifshow.widget.ExpandableFloatButton$b;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.widget.ExpandableFloatButton;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tyc.k1;
import lnc.c3$a;
import lnc.c3;
import tyc.j1;
import tyc.l1;
import tyc.i1;

public class ExpandableFloatButton$b implements Animator$AnimatorListener	// class@00183e
{
    public final ExpandableFloatButton a;

    public void ExpandableFloatButton$b(ExpandableFloatButton p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExpandableFloatButton$b.class, "3")) {
          return;
       }
       c3.c(this.a.m, new k1(p0));
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExpandableFloatButton$b.class, "2")) {
          return;
       }
       ExpandableFloatButton$b ta = this.a;
       ta.f = 2;
       c3.c(ta.m, new j1(p0));
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExpandableFloatButton$b.class, "4")) {
          return;
       }
       c3.c(this.a.m, new l1(p0));
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExpandableFloatButton$b.class, "1")) {
          return;
       }
       c3.c(this.a.m, new i1(p0));
       return;
    }
}
