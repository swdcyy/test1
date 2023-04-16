package j79.p0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.album.preview.PreviewViewPager;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import java.util.Objects;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$a;
import kotlin.TypeCastException;

public final class p0 implements ValueAnimator$AnimatorUpdateListener	// class@002788
{
    public final PreviewViewPager a;
    public final float b;
    public final float c;

    public void p0(PreviewViewPager p0,float p1,float p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0.class, "1")) {
          return;
       }
       a.h(p0, "animation");
       p0 = p0.getAnimatedValue();
       if (p0 == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
       }
       float f = p0.floatValue();
       p0 ta = this.a;
       PreviewViewPager e = ta.e;
       PreviewViewPager f1 = ta.f;
       ta.n(f, ((((f - e) / (this.b - e)) * (this.c - f1)) + f1));
       ta = this.a;
       if (!f - ta.e) {
          ta.f = 0;
          ta.e = 0;
          Objects.requireNonNull(PreviewViewPager.G);
          ta.c = 0;
          PreviewViewPager$a attachmentDi = this.a.getAttachmentDismissListener();
          if (attachmentDi != null) {
             attachmentDi.a(0x3f800000, 0);
          }
       }
       return;
    }
}
