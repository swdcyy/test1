package g93.b;
import g93.a;
import androidx.lifecycle.LifecycleOwner;
import java.lang.String;
import vq5.d;
import f93.c;
import ip3.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import g93.b$a;
import f93.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardCommentNoticeInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardCommentNoticeInfo$LiveLiteBenefitCardCommentNoticeExtraInfo;
import com.kuaishou.live.core.show.benefitcard.model.LiveBenefitCardInfo;
import f93.e;
import com.kuaishou.live.lite.benefitcard.LiveLiteBenefitCardType;
import f93.f;
import x51.b;
import com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardCommonHandler$onReceiveCommentNotice$1;
import msd.l;
import lc1.f;
import com.kwai.robust.PatchProxyResult;
import lc1.e;
import lc1.d;

public final class b extends a	// class@002ad4
{
    public final String c;
    public final d d;
    public final c e;
    public final a f;

    public void b(LifecycleOwner p0,String p1,d p2,c p3,a p4){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "livestreamId");
       a.p(p2, "routerManager");
       a.p(p3, "commercialBenefitCardService");
       a.p(p4, "liveReceiveCommentNoticeService");
       super(p0, p4);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       p3.b(new b$a(this));
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
       }else {
          a.p(p0, "channelType");
          a.p(p1, "notice");
          LiveGenericCommentNoticeInfo mExtraInfo = p1.mExtraInfo;
          if (mExtraInfo != null) {
             LiveLiteBenefitCardCommentNoticeInfo$LiveLiteBenefitCardCommentNoticeExtraInfo mBenefitCard = mExtraInfo.mBenefitCardInfo;
             if (mBenefitCard != null && mBenefitCard.mNeedDoubleCheck == null) {
                LiveCommentNoticeBaseInfo mBizId = p1.mBizId;
                a.o(mBizId, "notice.mBizId");
                LiveCommentNoticeBaseInfo mCommonGuide = p1.mCommonGuideSubBizType;
                a.o(mCommonGuide, "notice.mCommonGuideSubBizType");
                this.e.a(new e(LiveLiteBenefitCardType.COMMON, mBenefitCard, new f(mBenefitCard.mExtraInfo)), mBizId, mCommonGuide, p1.mDisplayDurationMs, (p1.mDelayDisplayTimeMs + b.b().a()), 0, new LiveLiteBenefitCardCommonHandler$onReceiveCommentNotice$1(this), mBenefitCard.mExtraInfo);
             }
          }
       }
       return;
    }
    public f c(){
       f obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.API_USER_STATUS,LiveCommentNoticeChannelType.API_DELAY_INFO,LiveCommentNoticeChannelType.API_USER_IO_STATUS,LiveCommentNoticeChannelType.LONG_CONNECTION};
       obj = f.b(55, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(LiveLiteBenefitCardCommentNoticeInfo.class));
       a.o(obj, "LiveCommentNoticeType.ge¡­ceInfo::class.java\)\n    \)");
       return obj;
    }
}
