package df2.l0;
import android.content.DialogInterface$OnClickListener;
import df2.m0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import com.kwai.component.misc.report.ReportInfo;
import java.lang.String;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import wj2.n0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public final class l0 implements DialogInterface$OnClickListener	// class@0024fa
{
    public final m0 b;
    public final GifshowActivity c;

    public void l0(m0 p0,GifshowActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(DialogInterface p0,int p1){
       l0 tb = this.b;
       l0 tc = this.c;
       Objects.requireNonNull(tb);
       if (p1 == 0x7f10169b) {
          if (tb.C != null) {
             ReportInfo reportInfo = new ReportInfo();
             reportInfo.mRefer = tc.getUrl();
             reportInfo.mPreRefer = tc.U2();
             reportInfo.mLiveId = tb.x.getLiveStreamId();
             reportInfo.mVoicePartyId = tb.x.getVoicePartyId();
             int clickType = tb.x.getClickType();
             if (tb.x.isLiveChatGuest() || clickType == LiveStreamClickType.VOICE_PARTY.getValue()) {
                reportInfo.mSourceType = "live_guest";
                reportInfo.mEntrySource = tb.n9("live_audience_profile");
             }else if(clickType == LiveStreamClickType.LIVE_PK_PEER.getValue() || (clickType == LiveStreamClickType.LIVE_CHAT_BETWEEN_ANCHORS.getValue() && !TextUtils.x(tb.x.getOpponentLiveStreamId()))){
                reportInfo.mSourceType = "live";
                reportInfo.mLiveId = tb.x.getOpponentLiveStreamId();
                reportInfo.mEntrySource = tb.n9("live_anchor_profile");
             }else if(clickType == LiveStreamClickType.LIVE_LINE.getValue()){
                reportInfo.mSourceType = "live";
                reportInfo.mEntrySource = tb.n9("live_anchor_profile");
             }else {
                reportInfo.mSourceType = "audience";
                reportInfo.mEntrySource = tb.n9("live_audience_profile");
             }
             reportInfo.mReportedUserId = tb.x.getUserProfile().mProfile.mId;
             tb.C.a(reportInfo);
             m0 b = tb.B;
             if (b != null) {
                b.onInformAtMoreDialog(tb.x.getBaseFeed(), tb.x.getUserProfile().mProfile.mId);
             }
          }
       }else if(p1 == 0x7f10406b){
          tb.q9();
       }else if(p1 == 0x7f100103){
          tb.b9();
       }else if(p1 == 0x7f101d16 || p1 == 0x7f10406c){
          tb.C9();
       }else if(p1 == 0x7f102225){
          tb.e9();
       }else if(p1 == 0x7f1028af){
          tb.G9();
       }
       return;
    }
}
