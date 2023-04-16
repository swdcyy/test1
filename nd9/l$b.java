package nd9.l$b;
import android.animation.AnimatorListenerAdapter;
import nd9.l;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.yxcorp.gifshow.camera.record.base.d;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.utility.n;
import java.util.Objects;
import v36.a;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import m5b.b;
import androidx.lifecycle.ViewModel;
import w36.a;
import w36.b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import w36.b$a;
import nd9.p;
import com.yxcorp.gifshow.image.KwaiImageView;
import v36.a$a;
import android.graphics.Bitmap;

public class l$b extends AnimatorListenerAdapter	// class@003148
{
    public final boolean a;
    public final l b;

    public void l$b(l p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$b.class, "2")) {
          return;
       }
       this.b.t.setScaleX(0x3f800000);
       this.b.t.setScaleY(0x3f800000);
       this.b.t.setAlpha(0x3f800000);
       l$b tb = this.b;
       if (tb.O == null) {
          d f = tb.f;
          if (f != null && (!f.isDetached() && !this.b.s.getVisibility())) {
             int i = 4;
             if (this.a != null) {
                this.b.t.setVisibility(i);
             }else {
                int i1 = 0;
                this.b.t.setVisibility(i1);
                n.Y(this.b.s, i, i1);
             }
          }
       }
       tb = this.b;
       l r = tb.r;
       l z = tb.z;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidTwoRefs(r, z, tb, l.class, "29") || (r == null || (z == null || (tb.A != null && tb.D == null)))) {
          if (tb.B == null) {
             tb.B = new a(ViewModelProviders.of(tb.e).get(b.class));
          }
          tb.B.a(r, b.g.a(z), 0, new p(tb, r), tb.A);
       }
    label_00aa :
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$b.class, "1")) {
          return;
       }
       l$b tb = this.b;
       if (tb.K != null && tb.k2()) {
          n.Y(this.b.s, 0, 0);
       }
       if (this.a == null) {
          this.b.t.setVisibility(0);
       }
       return;
    }
}
