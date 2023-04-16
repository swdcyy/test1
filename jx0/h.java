package jx0.h;
import erd.g;
import jx0.i;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant;
import java.lang.Object;
import com.kuaishou.live.common.core.component.blinddate.pendant.response.LiveAudienceBlindDateRightPendantResponse;
import java.util.Objects;
import com.kuaishou.live.common.core.component.blinddate.pendant.response.LiveAudienceBlindDateRightPendantResponse$RefreshPendantData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yb1.g;
import yb1.h;
import com.kuaishou.live.common.core.component.blinddate.pendant.response.LiveAudienceBlindDateRightPendantResponse$ImageInfo;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant;
import com.kuaishou.live.common.core.component.blinddate.pendant.right.LiveBaseBlindDateRightPendantView;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.widget.TextView;

public final class h implements g	// class@002c28
{
    public final i b;
    public final LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant c;

    public void h(i p0,LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       int i;
       h tb = this.b;
       h tc = this.c;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          p0 = p0.mRefreshPendant;
          if (p0 != null && tb.V != null) {
             tb.T = p0.mContentKey;
             tb.W0 = tc.version;
             i q = tb.Q;
             LiveBlindDateSignalMessages$SCLiveBlindDateTryUpdateAudiencePendant bizId = tc.bizId;
             g og = PatchProxy.applyTwoRefs(p0, bizId, tb, i.class, "9");
             if (og != PatchProxyResult.class) {
             }else {
                LiveAudienceBlindDateRightPendantResponse$RefreshPendantData mLargeImgInf = p0.mLargeImgInfo;
                h oh = new h(mLargeImgInf.mBackgroundImgUrl, mLargeImgInf.mTopImgUrl, mLargeImgInf.mButtonImgUrl);
                mLargeImgInf = p0.mSmallImgInfo;
                h oh1 = new h(mLargeImgInf.mBackgroundImgUrl, mLargeImgInf.mTopImgUrl, mLargeImgInf.mButtonImgUrl);
                String str = (TextUtils.x(p0.mHighlightDescription))? "": p0.mHighlightDescription;
                i v = tb.V;
                g og1 = new g(oh, oh1, v.pendantLinkUrl, v.topImgLinkUrl, p0.mButtonLinkUrl, p0.mGuideDescription, str, bizId);
             }
             i = tb.Z ^ 0x01;
             Objects.requireNonNull(q);
             if (!PatchProxy.isSupport(LiveBaseBlindDateRightPendantView.class) || !PatchProxy.applyVoidTwoRefs(og, Boolean.valueOf(i), q, LiveBaseBlindDateRightPendantView.class, "15")) {
                a.p(og, "pendantData");
                q.k = og;
                LiveBaseBlindDateRightPendantView g = q.g;
                if (g == null) {
                   a.S("highLightTextView");
                }
                g.setText(og.b());
                g = q.h;
                if (g == null) {
                   a.S("guideDescriptionTextView");
                }
                g.setText(og.a());
                tc = (i)? og.c(): og.d();
                q.setPendantImgInfo(tc);
                q.c(i);
             }
             tb.h9();
          }
       }
       return;
    }
}
