package asa.e;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter;
import java.lang.Object;
import android.view.View;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class e implements PopupInterface$b	// class@0002e8
{
    public final KCubeBlockTabGuidePresenter a;

    public void e(KCubeBlockTabGuidePresenter p0){
       this.a = p0;
       super();
    }
    public final Animator a(View p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "view");
       PatchProxy.onMethodExit(e.class, "1");
       return this.a.V8(p0, 0x3f800000, 0, 400);
    }
}
