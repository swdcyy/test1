package com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabConfig;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import com.kwai.live.gzone.competition.bean.LiveGzoneCompetitionConfig;

public class LiveGzoneConfigResponse implements Serializable, a	// class@000ca9
{
    public ArrayList mCommentHotWords;
    public int mCommentRollDuration;
    public int mCommentRollFrequency;
    public LiveGzoneCompetitionConfig mCompetitionConfig;
    public LiveGzoneCompetitionDiversionConfig mCompetitionDiversionConfig;
    public String mCompetitionTitle;
    public boolean mDisableDisplayLandscapeHotWordBar;
    public boolean mDisableGameLiveUserRank;
    public boolean mDisableGzoneLiveEmotion;
    public boolean mDisableGzoneNewLiveKwaiEmoji;
    public boolean mDisableHorizontalScreenShowComments;
    public boolean mDisableInteractWatchHalfWebView;
    public boolean mDisableTreasureTask;
    public boolean mEnableGameLiveFansGroupRank;
    public boolean mEnableGameLiveFansGroupTips;
    public boolean mEnableGameLiveWeekRank;
    public boolean mEnableGzoneLiveBet;
    public boolean mEnableKshellBetRecommend;
    public boolean mEnablePhotoRewardShowLegalAffairs;
    public boolean mEnableShowKshellBalance;
    public boolean mEnableShowLiveTurntable;
    public int mEnableVoiceTransWordOptimize;
    public List mFeatureEntranceBubbleList;
    public String mGameId;
    public String mGameName;
    public String mGiftPanelEntranceButtonPictureUrl;
    public String mKuaishouGameAuthenticationFeed;
    public List mLandscapeCommentNoticeBizTypes;
    public LiveGzoneActivityBanner mLiveGzoneActivityBanner;
    public LiveGzoneAudiencePopupConfig mLiveGzoneAudiencePopupConfig;
    public LiveGzoneDistributeCardConfig mLiveGzoneDistributeCardConfig;
    public LiveGzoneFollowTipConfig mLiveGzoneFollowTipConfig;
    public LiveGzoneGuessTipConfig mLiveGzoneGuessTipConfig;
    public LiveGzonePendantConfig mLiveGzonePendantConfig;
    public LiveGzoneTabConfig mLiveGzoneTabConfig;
    public String mLiveGzoneTurntableRedDotImg;
    public String[] mPreloadResources;
    public boolean mShowAccompanyPlayEntrance;
    public boolean mShowAccompanyPlayTab;
    public boolean mShowKShell;
    public List mTabs;
    public long mVoiceChatInteractNoticeRequestDelayMs;
    public static final long serialVersionUID = 0xec838eedae4d5fa0;

    public void LiveGzoneConfigResponse(){
       super();
       this.mDisableDisplayLandscapeHotWordBar = false;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneConfigResponse.class, "1")) {
          return;
       }
       LiveGzoneConfigResponse tmLiveGzoneT = this.mLiveGzoneTabConfig;
       if (tmLiveGzoneT != null && !q.f(tmLiveGzoneT.mTabs)) {
          this.mTabs = this.mLiveGzoneTabConfig.mTabs;
       }
       if (this.mTabs == null) {
          this.mTabs = new ArrayList();
       }
       return;
    }
    public String getCompetitionId(){
       LiveGzoneConfigResponse tmCompetitio = this.mCompetitionConfig;
       if (tmCompetitio != null) {
          return tmCompetitio.mCompetitionId;
       }
       return null;
    }
}
