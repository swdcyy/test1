package e63.a1;
import android.content.DialogInterface$OnClickListener;
import com.kuaishou.live.gzone.v2.profile.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.component.misc.report.ReportInfo;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import wj2.n0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public class a1 implements DialogInterface$OnClickListener	// class@00263d
{
    public final GifshowActivity b;
    public final e c;

    public void a1(e p0,GifshowActivity p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(DialogInterface p0,int p1){
       if (PatchProxy.isSupport(a1.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, a1.class, "1")) {
          return;
       }
       if (p1 == 0x7f10169b) {
          if (this.c.v != null) {
             ReportInfo reportInfo = new ReportInfo();
             reportInfo.mRefer = this.b.getUrl();
             reportInfo.mPreRefer = this.b.U2();
             reportInfo.mLiveId = this.c.r.getLiveStreamId();
             String str = "live_audience_profile";
             if (this.c.r.isLiveChatGuest() || this.c.r.getClickType() == LiveStreamClickType.VOICE_PARTY.getValue()) {
                reportInfo.mSourceType = "live_guest";
                reportInfo.mVoicePartyId = this.c.r.getVoicePartyId();
                reportInfo.mEntrySource = str;
             }else if(this.c.r.getClickType() == LiveStreamClickType.LIVE_PK_PEER.getValue() || (this.c.r.getClickType() == LiveStreamClickType.LIVE_CHAT_BETWEEN_ANCHORS.getValue() && !TextUtils.x(this.c.r.getOpponentLiveStreamId()))){
                reportInfo.mSourceType = "live";
                reportInfo.mLiveId = this.c.r.getOpponentLiveStreamId();
                reportInfo.mVoicePartyId = this.c.r.getVoicePartyId();
                reportInfo.mEntrySource = "live_anchor_profile";
             }else {
                reportInfo.mSourceType = "audience";
                reportInfo.mEntrySource = str;
             }
             reportInfo.mReportedUserId = this.c.r.getUserProfile().mProfile.mId;
             this.c.v.a(reportInfo);
             a1 tc = this.c;
             e y = tc.y;
             if (y != null) {
                y.onInformAtMoreDialog(tc.r.getBaseFeed(), this.c.r.getUserProfile().mProfile.mId);
             }
          }
       }else if(p1 == 0x7f10406b){
          this.c.o9();
       }else if(p1 == 0x7f100103){
          this.c.W8();
       }else if(p1 == 0x7f101d16 || p1 == 0x7f10406c){
          this.c.y9();
       }else if(p1 == 0x7f102225){
          this.c.e9();
       }else if(p1 == 0x7f1028af){
          this.c.C9();
       }
       return;
    }
}
