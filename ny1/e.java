package ny1.e;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.LiveTempEnhanceView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Runnable;

public class e extends AnimatorListenerAdapter	// class@00342d
{
    public final LiveTempEnhanceView a;

    public void e(LiveTempEnhanceView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       e ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, LiveTempEnhanceView.class, "13")) {
          LiveTempEnhanceView h = ta.h;
          if (h != null) {
             h.run();
          }
          ta.b();
       }
       return;
    }
}
