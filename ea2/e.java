package ea2.e;
import erd.g;
import com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveAnchorStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.basic.model.LiveHourlyRankConfig;
import com.kuaishou.live.core.show.hourlytrank.ranklist.a;
import com.kuaishou.live.core.show.hourlytrank.ranklist.b;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Boolean;

public final class e implements g	// class@0026cc
{
    public final LiveHourlyRankListDialogPresenter b;

    public void e(LiveHourlyRankListDialogPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          LiveAnchorStatusResponse mLivePopular = p0.mLivePopularityRankConfig;
          if (mLivePopular != null) {
             tb.D = mLivePopular.mEnablePopularityRank;
          }
       }
       tb.E = k0.b(p0, a.a, b.a).or(Boolean.FALSE).booleanValue();
       return;
    }
}
