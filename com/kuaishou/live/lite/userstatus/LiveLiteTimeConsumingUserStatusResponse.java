package com.kuaishou.live.lite.userstatus.LiveLiteTimeConsumingUserStatusResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class LiveLiteTimeConsumingUserStatusResponse implements Serializable	// class@000b8d
{
    public long mAutoEnterRoomWatchTimeMs;
    public boolean mEnableAutoEnterRoom;
    public boolean mEnableLiteProfitAreaGuideEnhance;
    public boolean mIsCityRankEnable;
    public LiteAuthorReplyAfterSendGiftConfig mLiteAuthorReplyAfterSendGiftConfig;
    public LiteCommentAreaShowEmojiConfig mLiteCommentAreaShowEmojiConfig;
    public LiveLiteQuestionnaireInfo mLiteQuestionnaireInfo;
    public LiveLiteRecommendSideBarEntryInfo mLiteRecommendSideBarInfo;
    public LiteSideBarReplacePlan mLiteSideBarReplacePlan;
    public List mLiveCommentNoticeInfoList;
    public LiveGiftGuideConfig mLiveGiftGuideConfig;
    public LiveGiftPanelAndSendWarningConfig mLiveGiftPanelAndSendWarningConfig;
    public LiveGiftPanelComboSendConfig mLiveGiftPanelComboSendConfig;
    public LiveGiftPanelRefreshConfig mLiveGiftPanelRefresh;
    public LiveGiftSlotConfig mLiveGiftSlotConfig;
    public List mLiveGiftSlotGrades;
    public List mLiveGiftSlotSpecialComboList;
    public LiveLikeNewStyleConfig mLiveLikeNewStyleConfig;
    public LiveHourlyRankConfig mLiveLiteHourlyRankConfig;
    public LiveLiteQuickGiftConfig mLiveLiteQuickGiftConfig;
    public LiveGiftGuideConfig mLivePopularityTicketConfig;
    public LiveLiteSideBarEntryInfo mLiveSideBarModel;
    public List mLiveStreamTypeList;
    public LiveGiftGuideConfig mLiveViceGiftGuideConfig;
    public String mPrivilegeInfoH5Url;
    public List mRoleInfos;
    public List mSCLiveQuickInteractiveAreas;
    public List mSignalBlockConfig;
    public String mSpringCeremonyNamingData;
    public static final long serialVersionUID = 0x85cc140a15759712;

    public void LiveLiteTimeConsumingUserStatusResponse(){
       super();
       this.mLiveStreamTypeList = new ArrayList();
       this.mEnableLiteProfitAreaGuideEnhance = false;
    }
}
