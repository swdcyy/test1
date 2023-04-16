package com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$SCRedPackRainResource;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainPicture;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$a;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainText;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainText;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainButton;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainButton;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainPrizePic;
import java.util.List;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainPrizePic;
import java.lang.CloneNotSupportedException;

public class LiveRedPackRainResource implements Serializable, Cloneable	// class@000f0a
{
    public CDNUrl[] mEnterPopupImage;
    public LiveRedPackRainResource$RedPackRainButton mEnterPopupReserveButton;
    public LiveRedPackRainResource$RedPackRainButton mEnterPopupRuleButton;
    public long mGameMagicFaceId;
    public CDNUrl[] mGameSponsorRedPackImage;
    public CDNUrl[] mGameSponsorTitleImage;
    public CDNUrl[] mGrabPopAnimateRedPackImage;
    public CDNUrl[] mGrabPopAnimateStarImage;
    public CDNUrl[] mGrabPopCoverBottomImage;
    public CDNUrl[] mGrabPopCoverTopImage;
    public LiveRedPackRainResource$RedPackRainButton mGrabPrepareCountDownButton;
    public CDNUrl[] mGrabPrepareGrabImage;
    public LiveRedPackRainResource$RedPackRainButton mGrabPrepareReserveButton;
    public LiveRedPackRainResource$RedPackRainButton mGrabPrepareRuleButton;
    public LiveRedPackRainResource$RedPackRainText mGrabPrepareSubtitle;
    public CDNUrl[] mGrabPrepareTitleImage;
    public CDNUrl[] mGrabResultBackgroundImage;
    public CDNUrl[] mGrabResultCardImage;
    public CDNUrl[] mGrabResultCoverBottomImage;
    public CDNUrl[] mGrabResultKoiBackgroundImage;
    public CDNUrl[] mGrabResultKoiCardImage;
    public CDNUrl[] mGrabResultKoiCoverBottomImage;
    public CDNUrl[] mGrabResultKoiImage;
    public LiveRedPackRainResource$RedPackRainButton mGrabResultKoiReceiveButton;
    public String mGrabResultKoiSummaryTextColor;
    public List mGrabResultPrizePic;
    public LiveRedPackRainResource$RedPackRainButton mGrabResultReceiveButton;
    public String mGrabResultSummaryTextColor;
    public String mGrabResultTextColor;
    public CDNUrl[] mGrabUnluckyTipsImage;
    public String mGrabUnluckyTipsTextColor;
    public CDNUrl[] mPendantBackgroundImage;
    public String mPendantTextColor;
    public String mResourceId;
    public static final long serialVersionUID = 0xef631244359e7d04;

    public void LiveRedPackRainResource(){
       super();
    }
    public static LiveRedPackRainResource fromSCMessage(LiveRedPackRainMessage$SCRedPackRainResource p0){
       Object obj = null;
       LiveRedPackRainResource obj1 = PatchProxy.applyOneRefs(p0, obj, LiveRedPackRainResource.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null || TextUtils.x(p0.redPackRainId)) {
          return obj;
       }
       obj1 = new LiveRedPackRainResource();
       obj1.mResourceId = p0.redPackRainResourceId;
       obj1.mPendantBackgroundImage = LiveRedPackRainResource$a.a(p0.widgetBackgroundPicV2);
       obj1.mPendantTextColor = p0.widgetTextColor;
       obj1.mGrabPopCoverTopImage = LiveRedPackRainResource$a.a(p0.grabPopCoverTopPic);
       obj1.mGrabPopCoverBottomImage = LiveRedPackRainResource$a.a(p0.grabPopCoverBottomPic);
       obj1.mGrabPopAnimateStarImage = LiveRedPackRainResource$a.a(p0.grabPopAnimateStarPic);
       obj1.mGrabPopAnimateRedPackImage = LiveRedPackRainResource$a.a(p0.grabPopAnimateRedPackPic);
       obj1.mGrabPrepareTitleImage = LiveRedPackRainResource$a.a(p0.grabPopUnopenedTitlePic);
       obj1.mGrabPrepareSubtitle = LiveRedPackRainResource$RedPackRainText.fromSCMessage(p0.grabPopUnopenedSubtitleText);
       obj1.mGrabPrepareReserveButton = LiveRedPackRainResource$RedPackRainButton.fromSCMessage(p0.grabPopReserveButton);
       obj1.mGrabPrepareCountDownButton = LiveRedPackRainResource$RedPackRainButton.fromSCMessage(p0.grabPopCountDownButton);
       obj1.mGrabPrepareGrabImage = LiveRedPackRainResource$a.a(p0.grabPopGrabPic);
       obj1.mGrabPrepareRuleButton = LiveRedPackRainResource$RedPackRainButton.fromSCMessage(p0.grabPopRuleButton);
       obj1.mGrabResultBackgroundImage = LiveRedPackRainResource$a.a(p0.grabResultBackGroundPic);
       obj1.mGrabResultCoverBottomImage = LiveRedPackRainResource$a.a(p0.grabResultCoverBottomPic);
       obj1.mGrabResultCardImage = LiveRedPackRainResource$a.a(p0.grabResultCardPic);
       obj1.mGrabResultTextColor = p0.grabResultTextColor;
       obj1.mGrabResultReceiveButton = LiveRedPackRainResource$RedPackRainButton.fromSCMessage(p0.grabResultReceiveButton);
       obj1.mGrabResultSummaryTextColor = p0.grabResultSummaryTextColor;
       obj1.mGrabResultKoiImage = LiveRedPackRainResource$a.a(p0.grabResultKoiPic);
       obj1.mGrabResultKoiBackgroundImage = LiveRedPackRainResource$a.a(p0.grabResultKoiBackgroundPic);
       obj1.mGrabResultKoiCoverBottomImage = LiveRedPackRainResource$a.a(p0.grabResultKoiCoverBottomPic);
       obj1.mGrabResultKoiCardImage = LiveRedPackRainResource$a.a(p0.grabResultKoiCardPic);
       obj1.mGrabResultKoiReceiveButton = LiveRedPackRainResource$RedPackRainButton.fromSCMessage(p0.grabResultKoiReceiveButton);
       obj1.mGrabResultKoiSummaryTextColor = p0.grabResultKoiSummaryTextColor;
       obj1.mGrabUnluckyTipsImage = LiveRedPackRainResource$a.a(p0.grabResultMissPic);
       obj1.mGrabUnluckyTipsTextColor = p0.grabResultMissTextColor;
       obj1.mGameMagicFaceId = p0.animateMagicFaceId;
       obj1.mGameSponsorTitleImage = LiveRedPackRainResource$a.a(p0.animateSponsorTitlePic);
       obj1.mGameSponsorRedPackImage = LiveRedPackRainResource$a.a(p0.animateSponsorRedPackPic);
       obj1.mGrabResultPrizePic = LiveRedPackRainResource$RedPackRainPrizePic.fromSCMessage(p0.prizePic);
       return obj1;
    }
    public LiveRedPackRainResource clone(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackRainResource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          e0.printStackTrace();
          return this;
       }
    }
    public Object clone(){
       return this.clone();
    }
}
