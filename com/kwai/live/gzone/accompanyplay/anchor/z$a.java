package com.kwai.live.gzone.accompanyplay.anchor.z$a;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.kwai.live.gzone.accompanyplay.anchor.z;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewPropertyAnimator;

public class z$a implements PopupInterface$c	// class@000b46
{
    public final boolean a;
    public final z b;

    public void z$a(z p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(View p0,Animator$AnimatorListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, z$a.class, "1")) {
          return;
       }
       if (this.a != null) {
          p0.setTranslationX((float)p0.getWidth());
          p0.animate().translationX(0).setDuration(200).setListener(p1);
       }else {
          p0.setTranslationY((float)p0.getHeight());
          p0.animate().translationY(0).setDuration(200).setListener(p1);
       }
       return;
    }
}
