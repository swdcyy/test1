package com.yxcorp.gifshow.v3.x;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.v3.y;
import android.view.View;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.EditorManager;
import java.util.Map;
import com.yxcorp.gifshow.v3.EditorManager$b;
import t36.f;
import com.yxcorp.gifshow.v3.w;
import t36.f$a;

public class x implements Animator$AnimatorListener	// class@00167c
{
    public final View a;
    public final y b;

    public void x(y p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "2")) {
          return;
       }
       this.a.setAlpha(0x3f800000);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
          return;
       }
       this.a.setAlpha(0x3f800000);
       y a = this.b.a;
       if (a != null && a.m() != null) {
          f.p0(this.b.a.m().u(), EditorManager$b.class).s0(w.a);
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
