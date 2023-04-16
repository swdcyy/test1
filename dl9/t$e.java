package dl9.t$e;
import android.animation.AnimatorListenerAdapter;
import dl9.t;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import android.view.View;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;

public final class t$e extends AnimatorListenerAdapter	// class@001fa3
{
    public final t a;
    public final boolean b;

    public void t$e(t p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       t a;
       if (PatchProxy.applyVoidOneRefs(p0, this, t$e.class, "3")) {
          return;
       }
       if (t.P8(this.a).mDisliked != null) {
          a = this.a.A;
          if (a != null) {
             a.setVisibility(8);
          }
          a = this.a.y;
          if (a != null) {
             a.setAlpha(0);
          }
          this.a.a9(true);
       }else {
          a = this.a.y;
          if (a != null) {
             a.setAlpha(0x3f800000);
          }
          a = this.a.A;
          ViewGroup$LayoutParams layoutParams = (a != null)? a.getLayoutParams(): null;
          if (layoutParams != null) {
             layoutParams.height = -2;
          }
          t a1 = this.a.A;
          if (a1 != null) {
             a1.setLayoutParams(layoutParams);
          }
          this.a.a9(false);
       }
       this.a.Y8();
       return;
    }
    public void onAnimationEnd(Animator p0){
       t a;
       if (PatchProxy.applyVoidOneRefs(p0, this, t$e.class, "2")) {
          return;
       }
       if (this.b != null) {
          a = this.a.A;
          if (a != null) {
             a.setVisibility(8);
          }
       }else {
          a = this.a.A;
          ViewGroup$LayoutParams layoutParams = (a != null)? a.getLayoutParams(): null;
          if (layoutParams != null) {
             layoutParams.height = -2;
          }
          t a1 = this.a.A;
          if (a1 != null) {
             a1.setLayoutParams(layoutParams);
          }
       }
       this.a.a9(this.b);
       this.a.Y8();
       return;
    }
    public void onAnimationStart(Animator p0){
       t a;
       if (PatchProxy.applyVoidOneRefs(p0, this, t$e.class, "1")) {
          return;
       }
       int i = 0;
       if (this.b != null) {
          a = this.a.A;
          if (a != null) {
             a.setVisibility(i);
          }
          a = this.a.A;
          if (a != null) {
             a.setAlpha(0x3f800000);
          }
       }else {
          a = this.a.A;
          if (a != null) {
             a.setVisibility(i);
          }
          a = this.a.A;
          if (a != null) {
             a.setAlpha(0);
          }
       }
       return;
    }
}
