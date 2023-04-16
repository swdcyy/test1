package dl9.u$i;
import android.animation.AnimatorListenerAdapter;
import dl9.u;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.QComment;
import android.widget.ImageView;

public final class u$i extends AnimatorListenerAdapter	// class@001fb3
{
    public final u a;
    public final boolean b;

    public void u$i(u p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$i.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       if (this.b != null && u.P8(this.a).mLiked == null) {
          u b = this.a.B;
          if (b != null) {
             b.setSelected(true);
          }
          u.P8(this.a).updateDislike(true);
       }
       this.a.Y8();
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$i.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       if (this.b != null && u.P8(this.a).mLiked == null) {
          u b = this.a.B;
          if (b != null) {
             b.setSelected(true);
          }
          u.P8(this.a).updateDislike(true);
       }
       this.a.Y8();
       return;
    }
}
