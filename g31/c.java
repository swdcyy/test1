package g31.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.topbar.LiveAudienceTopBarPresenter;
import java.lang.Object;
import android.view.View;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.user.UserProfile;
import lu7.f;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.r0;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public final class c implements View$OnClickListener	// class@00240a
{
    public final LiveAudienceTopBarPresenter b;

    public void c(LiveAudienceTopBarPresenter p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       if (tb.T != null && tb.V.getUser() != null) {
          tb.T.w0(f.o(tb.V.getUser()), LiveStreamClickType.TOP_AUTHOR_HEAD_PERSONAL_CARD, 1, false, 2);
       }
       LiveAudienceTopBarPresenter w = tb.W;
       if (w != null) {
          w.onClickAuthorHead(tb.V);
       }
       return;
    }
}
