package b01.g;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.LivePropChangeStateResponse;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.LivePropChangePrivilegeResponse;

public final class g implements g	// class@0002ea
{
    public final LivePropChangeStateResponse b;

    public void g(LivePropChangeStateResponse p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       LivePropChangeStateResponse mLivePropCha = this.b.mLivePropChangePrivilegeResponse;
       p0.mBulletCommentBackgroundKey = mLivePropCha.mBulletCommentBackgroundKey;
       p0.mCurrentUserHeadWidget = mLivePropCha.mCurrentUserHeadWidget;
       p0.mBulletCommentColor = mLivePropCha.mBulletCommentColor;
    }
}
