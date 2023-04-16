package abc.d;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import java.lang.Object;
import android.view.View;
import android.animation.Animator;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.popup.common.d;
import abc.g;
import android.animation.Animator$AnimatorListener;

public final class d implements PopupInterface$b	// class@0000cb
{
    public final e a;

    public void d(e p0){
       this.a = p0;
    }
    public final Animator a(View p0){
       d ta = this.a;
       Objects.requireNonNull(ta);
       Animator uAnimator = PatchProxy.applyOneRefs(p0, ta, e.class, "2");
       if (uAnimator != PatchProxyResult.class) {
       }else {
          uAnimator = d.a(p0);
          uAnimator.addListener(new g(ta));
       }
       return uAnimator;
    }
}
