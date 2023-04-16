package bd7.b;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import bd7.e;
import java.lang.Object;
import android.view.View;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.animation.ObjectAnimator;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView;

public final class b implements PopupInterface$b	// class@000406
{
    public final e a;

    public void b(e p0){
       this.a = p0;
       super();
    }
    public final Animator a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       e c = this.a.c;
       ObjectAnimator hideAnimator = (c != null)? c.getHideAnimator(): null;
       a.m(hideAnimator);
       return hideAnimator;
    }
}
