package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3$c;
import android.animation.AnimatorListenerAdapter;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cq.a;
import q87.c;
import android.animation.Animator$AnimatorListener;

public final class TextMainBaseViewBinderV3$c extends AnimatorListenerAdapter	// class@000c3a
{
    public final TextMainBaseViewBinderV3 a;

    public void TextMainBaseViewBinderV3$c(TextMainBaseViewBinderV3 p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextMainBaseViewBinderV3$c.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TextMainBaseViewBinderV3", "onContainerAnimationCancel", objArray);
       TextMainBaseViewBinderV3$c ta = this.a;
       ta.N(ta.n);
       if (p0 != null) {
          p0.removeListener(this);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextMainBaseViewBinderV3$c.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TextMainBaseViewBinderV3", "onContainerAnimationEnd", objArray);
       TextMainBaseViewBinderV3$c ta = this.a;
       ta.N(ta.n);
       if (p0 != null) {
          p0.removeListener(this);
       }
       return;
    }
}
