package jx0.g;
import erd.g;
import jx0.i;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$BlindDateConfig;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$BlindDateReplacedPendantConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant;

public final class g implements g	// class@002c27
{
    public final i b;

    public void g(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       LiveTimeConsumingUserStatusResponse$BlindDateConfig mReplacedPen;
       g tb = this.b;
       tb.U0 = true;
       b.Z(LiveCommonLogTag.BLIND_DATE, "on audience status result");
       if (p0 != null) {
          LiveTimeConsumingUserStatusResponse mBlindDateCo = p0.mBlindDateConfig;
          if (mBlindDateCo != null) {
             mReplacedPen = mBlindDateCo.mReplacedPendantConfig;
             if (mReplacedPen != null) {
                tb.U = mReplacedPen;
                tb.T = mReplacedPen.mContentKey;
             }
          }
       }
       i v = tb.V;
       if (v != null) {
          if (p0 != null) {
             LiveTimeConsumingUserStatusResponse mBlindDateCo1 = p0.mBlindDateConfig;
             if (mBlindDateCo1 != null) {
                LiveTimeConsumingUserStatusResponse$BlindDateConfig mReplacedPen1 = mBlindDateCo1.mReplacedPendantConfig;
                if (mReplacedPen1 != null) {
                   if (mReplacedPen1.mVersion <= null || TextUtils.x(mReplacedPen1.mBizId)) {
                      tb.j9(tb.V);
                   }
                   mReplacedPen = p0.mBlindDateConfig.mReplacedPendantConfig;
                   if (mReplacedPen.mVersion > tb.W0 && TextUtils.n(tb.S, mReplacedPen.mBizId)) {
                      tb.W0 = p0.mBlindDateConfig.mReplacedPendantConfig.mVersion;
                      tb.j9(tb.V);
                   }
                }
             }
          }
          tb.j9(v);
       }
    label_0062 :
       return;
    }
}
