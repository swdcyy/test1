package nt1.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpTopScoreUserItemView;
import java.lang.Object;
import android.view.View;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpTopScoreUserItemView$a;

public final class b implements View$OnClickListener	// class@0033c7
{
    public final LiveMultiPkMvpTopScoreUserItemView b;

    public void b(LiveMultiPkMvpTopScoreUserItemView p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       LiveMultiPkMvpTopScoreUserItemView d = tb.d;
       if (d != null) {
          LiveMultiPkMvpTopScoreUserItemView h = tb.h;
          if (h != null) {
             h.a(p0, d);
          }
       }
       return;
    }
}
