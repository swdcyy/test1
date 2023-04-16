package ea2.d;
import erd.g;
import com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.basic.model.LiveHourlyRankConfig;
import com.kuaishou.live.core.show.hourlytrank.ranklist.c;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Boolean;

public final class d implements g	// class@0026cb
{
    public final LiveHourlyRankListDialogPresenter b;

    public void d(LiveHourlyRankListDialogPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          LiveTimeConsumingUserStatusResponse mLivePopular = p0.mLivePopularityRankConfig;
          if (mLivePopular != null) {
             tb.D = mLivePopular.mEnablePopularityRank;
          }
       }
       tb.E = k0.a(p0, c.a).or(Boolean.FALSE).booleanValue();
       return;
    }
}
