package dl9.r;
import android.animation.AnimatorListenerAdapter;
import dl9.t;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import android.view.View;

public final class r extends AnimatorListenerAdapter	// class@001f9b
{
    public final t a;
    public final boolean b;

    public void r(t p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       t b;
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "3")) {
          return;
       }
       if (t.P8(this.a).mDisliked != null) {
          b = this.a.B;
          if (b != null) {
             b.setVisibility(8);
          }
       }else {
          b = this.a.B;
          if (b != null) {
             b.setVisibility(0);
          }
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       t b;
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       if (this.b != null) {
          b = this.a.B;
          if (b != null) {
             b.setVisibility(8);
          }
       }else {
          b = this.a.B;
          if (b != null) {
             b.setVisibility(0);
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       t b;
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       int i = 0;
       if (this.b != null) {
          b = this.a.B;
          if (b != null) {
             b.setVisibility(i);
          }
          b = this.a.B;
          if (b != null) {
             b.setAlpha(0x3f800000);
          }
       }else {
          b = this.a.B;
          if (b != null) {
             b.setVisibility(i);
          }
          b = this.a.B;
          if (b != null) {
             b.setAlpha(0);
          }
       }
       return;
    }
}
