package dl9.q;
import android.animation.AnimatorListenerAdapter;
import dl9.t;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import android.view.View;

public final class q extends AnimatorListenerAdapter	// class@001f98
{
    public final t a;
    public final boolean b;

    public void q(t p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       t x;
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "3")) {
          return;
       }
       super.onAnimationCancel(p0);
       if (t.P8(this.a).mDisliked != null) {
          x = this.a.x;
          if (x != null) {
             x.setVisibility(0);
          }
          x = this.a.x;
          if (x != null) {
             x.setAlpha(0x3f800000);
          }
       }else {
          x = this.a.x;
          if (x != null) {
             x.setVisibility(8);
          }
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       t x;
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       if (this.b != null) {
          x = this.a.x;
          if (x != null) {
             x.setVisibility(0);
          }
       }else {
          x = this.a.x;
          if (x != null) {
             x.setVisibility(8);
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       t x;
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       int i = 0;
       if (this.b != null) {
          x = this.a.x;
          if (x != null) {
             x.setAlpha(0);
          }
          x = this.a.x;
          if (x != null) {
             x.setVisibility(i);
          }
       }else {
          x = this.a.x;
          if (x != null) {
             x.setVisibility(i);
          }
          x = this.a.x;
          if (x != null) {
             x.setAlpha(0x3f800000);
          }
       }
       return;
    }
}
