package l69.h;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import lnc.a1;

public final class h implements Animator$AnimatorListener	// class@002c9a
{
    public final boolean a;
    public final View b;
    public final boolean c;

    public void h(boolean p0,View p1,boolean p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       if (this.a != null) {
          this.b.setVisibility(0);
          this.b.setAlpha(0x3f800000);
       }else {
          this.b.setVisibility(8);
          this.b.setAlpha(0);
       }
       h tb = this.b;
       Drawable uDrawable = (this.c != null)? a1.f(R.drawable.arg_RES_7f0800d9): a1.f(R.drawable.arg_RES_7f0800d8);
       tb.setBackground(uDrawable);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       if (this.a == null) {
          this.b.setVisibility(8);
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "3")) {
          return;
       }
       if (this.a != null) {
          this.b.setVisibility(0);
       }
       return;
    }
}
