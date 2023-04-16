package nt1.d;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpTopScoreUserItemView$a;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpViewModel;
import java.lang.Object;
import android.view.View;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import nt1.a$a;
import nt1.a;

public final class d implements LiveMultiPkMvpTopScoreUserItemView$a	// class@0033c9
{
    public final LiveMultiPkMvpViewModel a;

    public void d(LiveMultiPkMvpViewModel p0){
       this.a = p0;
       super();
    }
    public final void a(View p0,UserInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "userInfo");
       this.a.w0(new a$a(p1, false));
       return;
    }
}
