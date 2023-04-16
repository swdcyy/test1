package h82.n;
import android.view.View$OnClickListener;
import h82.z;
import java.lang.Object;
import android.view.View;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.user.UserProfile;
import lu7.f;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.r0;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public final class n implements View$OnClickListener	// class@002ce0
{
    public final z b;

    public void n(z p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       n tb = this.b;
       if (tb.N != null && tb.P.getUser() != null) {
          tb.N.w0(f.o(tb.P.getUser()), LiveStreamClickType.TOP_AUTHOR_HEAD_PERSONAL_CARD, 1, false, 2);
       }
       z o = tb.O;
       if (o != null) {
          o.onClickAuthorHead(tb.P);
       }
       return;
    }
}
