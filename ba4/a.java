package ba4.a;
import v94.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class a extends a	// class@00034c
{
    public final Ref$ObjectRef a;

    public void a(Ref$ObjectRef p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       Ref$ObjectRef element = this.a.element;
       if (element != null) {
          element.setVisibility(0);
       }
       return;
    }
}
