package com.yxcorp.gifshow.widget.ExpandableFloatButton$a;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.widget.ExpandableFloatButton;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tyc.g1;
import lnc.c3$a;
import lnc.c3;
import tyc.f1;
import tyc.h1;
import tyc.e1;

public class ExpandableFloatButton$a implements Animator$AnimatorListener	// class@00183d
{
    public final ExpandableFloatButton a;

    public void ExpandableFloatButton$a(ExpandableFloatButton p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExpandableFloatButton$a.class, "3")) {
          return;
       }
       c3.c(this.a.l, new g1(p0));
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExpandableFloatButton$a.class, "2")) {
          return;
       }
       ExpandableFloatButton$a ta = this.a;
       ta.f = 1;
       c3.c(ta.l, new f1(p0));
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExpandableFloatButton$a.class, "4")) {
          return;
       }
       c3.c(this.a.l, new h1(p0));
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExpandableFloatButton$a.class, "1")) {
          return;
       }
       c3.c(this.a.l, new e1(p0));
       return;
    }
}
