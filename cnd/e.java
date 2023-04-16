package cnd.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import cnd.b;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import q87.c;
import java.lang.CharSequence;
import android.widget.TextView;

public final class e implements ValueAnimator$AnimatorUpdateListener	// class@00034b
{
    public final b a;

    public void e(b p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.o(p0, "it");
       Object[] objArray = new Object[0];
       a.D().s("SubtitlePanelStatusVB", "mLoadingAnimator : "+p0.getAnimatedValue(), objArray);
       this.a.o.setText(this.a.p+p0.getAnimatedValue().toString()+"%");
       return;
    }
}
