package com.kuaishou.live.jsbridge.LiveKrnPageKey;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.live.jsbridge.LiveKrnPageKey$a;
import nsd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveKrnPageKey extends Enum	// class@001d25
{
    public final String defaultUrl;
    public final String key;
    public static final LiveKrnPageKey[] $VALUES;
    public static final LiveKrnPageKey AudienceFlowerCard;
    public static final LiveKrnPageKey AuthorFlowerCard;
    public static final LiveKrnPageKey CoinCard;
    public static final LiveKrnPageKey$a Companion;
    public static final LiveKrnPageKey FollowCard;
    public static final LiveKrnPageKey LineChatPreference;
    public static final LiveKrnPageKey LiveActivityCouponDialog;
    public static final LiveKrnPageKey LiveAnchorBlessingBagDetailPage;
    public static final LiveKrnPageKey LiveAudienceBlessingBagDetailPage;
    public static final LiveKrnPageKey LiveAudienceBlessingBagNotice;
    public static final LiveKrnPageKey LiveBlindChangePanel;
    public static final LiveKrnPageKey LiveBlindDateAudienceAppraiseService;
    public static final LiveKrnPageKey LiveBlindDateAudienceChatService;
    public static final LiveKrnPageKey LiveBlindDateChatLiveVertify;
    public static final LiveKrnPageKey LiveBlindDateEditInfo;
    public static final LiveKrnPageKey LiveBlindDateGiftGuide;
    public static final LiveKrnPageKey LiveBlindDateList;
    public static final LiveKrnPageKey LiveBlindDateMatcher;
    public static final LiveKrnPageKey LiveBlindDateShowInfo;
    public static final LiveKrnPageKey LiveBlindHelperPanel;
    public static final LiveKrnPageKey LiveBlindSquareInfoPanel;
    public static final LiveKrnPageKey LiveBombDesc;
    public static final LiveKrnPageKey LiveBombIndex;
    public static final LiveKrnPageKey LiveCPSPKSelling;
    public static final LiveKrnPageKey LiveFansGroupPopularRankBonusDialog;
    public static final LiveKrnPageKey LiveFeatRevenueBigStage;
    public static final LiveKrnPageKey LiveHourlyRank;
    public static final LiveKrnPageKey LiveIntro;
    public static final LiveKrnPageKey LiveLineSettingPanel;
    public static final LiveKrnPageKey LiveMultiChatInvitePanel;
    public static final LiveKrnPageKey LiveMultiChatInvitePanelSetting;
    public static final LiveKrnPageKey LiveMultiChatSwitchLayoutDialog;
    public static final LiveKrnPageKey LiveMultiInteractSettingPanel;
    public static final LiveKrnPageKey LiveMultiLinePuzzleAnswerPanel;
    public static final LiveKrnPageKey LiveMultiLinePuzzleStatusPanel;
    public static final LiveKrnPageKey LiveMultiPKCohesionInvitePanel;
    public static final LiveKrnPageKey LiveMultiPKCohesionRankListPanel;
    public static final LiveKrnPageKey LiveMultiPKRankPanel;
    public static final LiveKrnPageKey LiveMultiPKTeamPanel;
    public static final LiveKrnPageKey LiveMultiPkLimitExplain;
    public static final LiveKrnPageKey LivePkEndReasonDialog;
    public static final LiveKrnPageKey LivePkPanel;
    public static final LiveKrnPageKey LiveRichCardConfirmDialog;
    public static final LiveKrnPageKey LiveRichCardPrivacyDialog;
    public static final LiveKrnPageKey LiveRichCardSpecialDialog;
    public static final LiveKrnPageKey LiveStayCard;
    public static final LiveKrnPageKey LiveTopUserListDialog;
    public static final LiveKrnPageKey LiveVirtualImagePanel;
    public static final LiveKrnPageKey LiveWishCard;
    public static final LiveKrnPageKey LiveWishModePreference;
    public static final LiveKrnPageKey VoicePartyContributorListDialog;
    public static final Map mapping;

    static {
       LiveKrnPageKey[] liveKrnPageK = new LiveKrnPageKey[50];
       int i = 0;
       LiveKrnPageKey liveKrnPageK1 = new LiveKrnPageKey("VoicePartyContributorListDialog", i, "VoicePartyContributorListDialog", "kwailive://krndialog?bundleid=Live&componentname=VoicePartyContributorListDialog");
       LiveKrnPageKey.VoicePartyContributorListDialog = liveKrnPageK1;
       liveKrnPageK[i] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LineChatPreference", 1, "LineChatPreference", "kwailive://krndialog?bundleid=lineChatPreference&componentname=line-chat-preference");
       LiveKrnPageKey.LineChatPreference = liveKrnPageK1;
       liveKrnPageK[1] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveActivityCouponDialog", 2, "LiveActivityCouponDialog", "kwailive://krndialog?bundleid=LiveActivityCouponDialog&componentname=LiveActivityCouponDialog");
       LiveKrnPageKey.LiveActivityCouponDialog = liveKrnPageK1;
       liveKrnPageK[2] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveStayCard", 3, "LiveStayCard", "kwailive://krndialog?bundleid=LiveStayCard&componentname=LiveStayCard");
       LiveKrnPageKey.LiveStayCard = liveKrnPageK1;
       liveKrnPageK[3] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("FollowCard", 4, "FollowCard", "kwailive://krndialog?bundleid=followCard&componentname=followCard");
       LiveKrnPageKey.FollowCard = liveKrnPageK1;
       liveKrnPageK[4] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveTopUserListDialog", 5, "LiveTopUserListDialog", "kwailive://krndialog?bundleid=LiveRankList&componentname=LiveTopUserListDialog");
       LiveKrnPageKey.LiveTopUserListDialog = liveKrnPageK1;
       liveKrnPageK[5] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveFansGroupPopularRankBonusDialog", 6, "LiveFansGroupPopularRank", "kwailive://krndialog?bundleid=LiveFansGroupPopularRank&componentname=FansGroupPopularRankPanel");
       LiveKrnPageKey.LiveFansGroupPopularRankBonusDialog = liveKrnPageK1;
       liveKrnPageK[6] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveIntro", 7, "LiveIntro", "kwailive://krndialog?bundleid=liveIntro&componentname=liveIntro");
       LiveKrnPageKey.LiveIntro = liveKrnPageK1;
       liveKrnPageK[7] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("AuthorFlowerCard", 8, "AuthorFlowerCard", "kwailive://krndialog?bundleid=LiveActivityCard&componentname=AuthorFlowerCard");
       LiveKrnPageKey.AuthorFlowerCard = liveKrnPageK1;
       liveKrnPageK[8] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("AudienceFlowerCard", 9, "AudienceFlowerCard", "kwailive://krndialog?bundleid=LiveActivityCard&componentname=AudienceFlowerCard");
       LiveKrnPageKey.AudienceFlowerCard = liveKrnPageK1;
       liveKrnPageK[9] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("CoinCard", 10, "CoinCard", "kwailive://krndialog?bundleid=LiveActivityCard&componentname=CoinCard");
       LiveKrnPageKey.CoinCard = liveKrnPageK1;
       liveKrnPageK[10] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveBombDesc", 11, "LiveBombDesc", "kwailive://krndialog?bundleid=livebomb&componentname=desc");
       LiveKrnPageKey.LiveBombDesc = liveKrnPageK1;
       liveKrnPageK[11] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveBombIndex", 12, "LiveBombIndex", "kwailive://krndialog?bundleid=livebomb&componentname=index");
       LiveKrnPageKey.LiveBombIndex = liveKrnPageK1;
       liveKrnPageK[12] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveHourlyRank", 13, "LiveHourlyRank", "kwailive://krndialog?bundleid=LiveHourlyRank&componentname=LiveHourlyRank");
       LiveKrnPageKey.LiveHourlyRank = liveKrnPageK1;
       liveKrnPageK[13] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LivePkPanel", 14, "LivePkPanel", "kwailive://krndialog?bundleid=LivePkPanel&componentname=InitiatePkPanel");
       LiveKrnPageKey.LivePkPanel = liveKrnPageK1;
       liveKrnPageK[14] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveVirtualImagePanel", 15, "LiveVirtualImagePanel", "kwailive://krndialog?bundleid=LiveVirtualImagePanel&componentname=live-virtual-image-panel&heightratio=0.79&place=1&radius=16");
       LiveKrnPageKey.LiveVirtualImagePanel = liveKrnPageK1;
       liveKrnPageK[15] = liveKrnPageK1;
       int i1 = 16;
       liveKrnPageK1 = new LiveKrnPageKey("LiveWishCard", i1, "LiveWishListCard", "kwailive://krndialog?bundleid=LiveWishCard&componentname=wishListCard");
       LiveKrnPageKey.LiveWishCard = liveKrnPageK1;
       liveKrnPageK[i1] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveCPSPKSelling", 17, "LiveCPSPKSelling", "kwailive://krndialog?bundleid=LiveCPSPKSelling&componentname=LiveCPSPKSellingMatchPanel");
       LiveKrnPageKey.LiveCPSPKSelling = liveKrnPageK1;
       liveKrnPageK[17] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveMultiPKTeamPanel", 18, "LiveMultiPKPreparePanel", "kwailive://krndialog?bundleid=LiveMultiPKPreparePanel&componentname=live-multi-pk-prepare-panel");
       LiveKrnPageKey.LiveMultiPKTeamPanel = liveKrnPageK1;
       liveKrnPageK[18] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveLineSettingPanel", 19, "LiveLineSettingPanel", "kwailive://krndialog?bundleid=lineChatPreference&componentname=chat-preference");
       LiveKrnPageKey.LiveLineSettingPanel = liveKrnPageK1;
       liveKrnPageK[19] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveMultiPKRankPanel", 20, "LiveMultiPKRankPanel", "kwailive://krndialog?bundleid=LiveMultiPKRankPanel&componentname=live-multi-pk-rank-panel");
       LiveKrnPageKey.LiveMultiPKRankPanel = liveKrnPageK1;
       liveKrnPageK[20] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveWishModePreference", 21, "WishModePreference", "kwailive://krndialog?bundleid=lineChatPreference&componentname=wish-mode-preference");
       LiveKrnPageKey.LiveWishModePreference = liveKrnPageK1;
       liveKrnPageK[21] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveMultiPKCohesionInvitePanel", 22, "LiveCohesionPkInvitePanel", "kwailive://krndialog?bundleid=LiveCohesionPkInvitePanel&componentname=CohesionPkInvitePanel&transparent=1&rnviewbgcolor=%23FFFFFF&height=398&place=1&radius=16");
       LiveKrnPageKey.LiveMultiPKCohesionInvitePanel = liveKrnPageK1;
       liveKrnPageK[22] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveMultiPKCohesionRankListPanel", 23, "LiveCohesionPkRankList", "kwailive://krndialog?bundleid=LiveCohesionPkRankList&componentname=CohesionPkRankList&transparent=1&rnviewbgcolor=%23FFFFFF&heightratio=0.56&place=1&radius=16");
       LiveKrnPageKey.LiveMultiPKCohesionRankListPanel = liveKrnPageK1;
       liveKrnPageK[23] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveMultiPkLimitExplain", 24, "LivePkLimitExplain", "kwailive://krndialog?bundleid=LivePKLimitExplain&componentname=live-pk-limit-explain");
       LiveKrnPageKey.LiveMultiPkLimitExplain = liveKrnPageK1;
       liveKrnPageK[24] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveBlindChangePanel", 25, "LiveBlindChangePanel", "kwailive://krndialog?bundleid=LiveBlindDateEntrySetting&componentname=live-blinddate-entry-setting");
       LiveKrnPageKey.LiveBlindChangePanel = liveKrnPageK1;
       liveKrnPageK[25] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveBlindHelperPanel", 26, "LiveBlindDateHelper", "kwailive://krndialog?bundleid=LiveBlindDateHelper&componentname=live-blinddate-helper");
       LiveKrnPageKey.LiveBlindHelperPanel = liveKrnPageK1;
       liveKrnPageK[26] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveBlindSquareInfoPanel", 27, "LiveBlindDateSquareInfo", "kwailive://krndialog?bundleid=LiveBlindDateSquareInfo&componentname=live-blinddate-squareinfo");
       LiveKrnPageKey.LiveBlindSquareInfoPanel = liveKrnPageK1;
       liveKrnPageK[27] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveBlindDateList", 28, "LiveBlindDateList", "kwailive://krndialog?bundleid=LiveBlindDateLiveChatList&componentname=live-blinddate-livechat-list");
       LiveKrnPageKey.LiveBlindDateList = liveKrnPageK1;
       liveKrnPageK[28] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveBlindDateEditInfo", 29, "LiveBlindDateEditInfo", "kwailive://krndialog?bundleid=LiveBlindDateEditInfo&componentname=live-blinddate-editinfo");
       LiveKrnPageKey.LiveBlindDateEditInfo = liveKrnPageK1;
       liveKrnPageK[29] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveBlindDateShowInfo", 30, "LiveBlindDateShowInfo", "kwailive://krndialog?bundleid=LiveBlindDateShowInfo&componentname=live-blinddate-showinfo");
       LiveKrnPageKey.LiveBlindDateShowInfo = liveKrnPageK1;
       liveKrnPageK[30] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveBlindDateChatLiveVertify", 31, "LiveBlindDateChatLiveVerify", "kwailive://krndialog?bundleid=LiveBlindDateChatLiveVerify&componentname=live-blinddate-chatlive-verify");
       LiveKrnPageKey.LiveBlindDateChatLiveVertify = liveKrnPageK1;
       liveKrnPageK[31] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveBlindDateAudienceChatService", 32, "LiveBlindDateAudienceChatService", "kwailive://krndialog?bundleid=LiveBlindDateAudienceChatService&componentname=live-blinddate-audienceAcceptService");
       LiveKrnPageKey.LiveBlindDateAudienceChatService = liveKrnPageK1;
       liveKrnPageK[32] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveBlindDateAudienceAppraiseService", 33, "LiveBlindDateAudienceChatService", "kwailive://krndialog?bundleid=LiveBlindDateAudienceChatService&componentname=live-blinddate-audienceAppraiseService");
       LiveKrnPageKey.LiveBlindDateAudienceAppraiseService = liveKrnPageK1;
       liveKrnPageK[33] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveBlindDateMatcher", 34, "LiveBlindDateMatcher", "kwailive://krndialog?bundleid=LiveBlindDateMatcher&componentname=live-blinddate-matcher");
       LiveKrnPageKey.LiveBlindDateMatcher = liveKrnPageK1;
       liveKrnPageK[34] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveBlindDateGiftGuide", 35, "LiveBlindDateGiftGuide", "kwailive://krndialog?bundleid=LiveBlindDateGiftGuide&componentname=live-blinddate-gift-guide");
       LiveKrnPageKey.LiveBlindDateGiftGuide = liveKrnPageK1;
       liveKrnPageK[35] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LivePkEndReasonDialog", 36, "LivePkEndReasonDialog", "kwailive://krndialog?bundleid=LivePkEndReasonDialog&componentname=LivePkEndReasonDialog");
       LiveKrnPageKey.LivePkEndReasonDialog = liveKrnPageK1;
       liveKrnPageK[36] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveAudienceBlessingBagNotice", 37, "LiveAudienceBlessingBagNotice", "kwailive://krndialog?bundleid=LiveLuckyBagAudience&componentname=LiveLuckyBagAudienceNotice");
       LiveKrnPageKey.LiveAudienceBlessingBagNotice = liveKrnPageK1;
       liveKrnPageK[37] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveAudienceBlessingBagDetailPage", 38, "LiveAudienceBlessingBagDetailPage", "kwailive://krndialog?bundleid=LiveLuckyBagAudience&componentname=LiveLuckyBagAudience");
       LiveKrnPageKey.LiveAudienceBlessingBagDetailPage = liveKrnPageK1;
       liveKrnPageK[38] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveAnchorBlessingBagDetailPage", 39, "LiveAnchorBlessingBagDetailPage", "kwailive://krndialog?bundleid=LiveLuckyBagPanelAnchor&componentname=live-lucky-bag-panel-anchor");
       LiveKrnPageKey.LiveAnchorBlessingBagDetailPage = liveKrnPageK1;
       liveKrnPageK[39] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveRichCardPrivacyDialog", 40, "LiveGetRichDialog", "kwailive://krndialog?bundleid=LiveGetRichDialog&componentname=PrivacyDialog&place=0&dimamount=0.3&transparent=1&widthratio=1&heightratio=1");
       LiveKrnPageKey.LiveRichCardPrivacyDialog = liveKrnPageK1;
       liveKrnPageK[40] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveRichCardConfirmDialog", 41, "LiveGetRichDialog", "kwailive://krndialog?bundleid=LiveGetRichDialog&componentname=ConfirmDialog&place=0&dimamount=0.3&transparent=1&widthratio=1&heightratio=1");
       LiveKrnPageKey.LiveRichCardConfirmDialog = liveKrnPageK1;
       liveKrnPageK[41] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveRichCardSpecialDialog", 42, "LiveGetRichDialog", "kwailive://krndialog?bundleid=LiveGetRichDialog&componentname=SpecialDialog&place=0&dimamount=0.3&transparent=1&widthratio=1&heightratio=1");
       LiveKrnPageKey.LiveRichCardSpecialDialog = liveKrnPageK1;
       liveKrnPageK[42] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveMultiChatInvitePanel", 43, "LiveMultiChatInvitePanel", "kwailive://krndialog?bundleid=LiveMultiChatInvitePanel&componentname=live-multi-chat-invite-panel");
       LiveKrnPageKey.LiveMultiChatInvitePanel = liveKrnPageK1;
       liveKrnPageK[43] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveMultiChatInvitePanelSetting", 44, "LiveMultiChatInvitePanel", "kwailive://krndialog?bundleid=LiveMultiChatInvitePanel&componentname=live-multi-chat-setting");
       LiveKrnPageKey.LiveMultiChatInvitePanelSetting = liveKrnPageK1;
       liveKrnPageK[44] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveMultiLinePuzzleAnswerPanel", 45, "LiveFeatConsumeGuessAnimales", "kwailive://krndialog?bundleid=LiveFeatConsumeGuessAnimales&componentname=quiz-panel&themeStyle=1&transparent=1&place=1&radius=16&height=286");
       LiveKrnPageKey.LiveMultiLinePuzzleAnswerPanel = liveKrnPageK1;
       liveKrnPageK[45] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveMultiLinePuzzleStatusPanel", 46, "LiveFeatConsumeGuessAnimales", "kwailive://krndialog?bundleid=LiveFeatConsumeGuessAnimales&componentname=status-panel&themeStyle=1&transparent=1&place=1&radius=16&height=248");
       LiveKrnPageKey.LiveMultiLinePuzzleStatusPanel = liveKrnPageK1;
       liveKrnPageK[46] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveMultiInteractSettingPanel", 47, "LiveMultiInteractSettingPanel", "kwailive://krndialog?bundleId=LiveMultiInteractSettingPanel&componentName=live-multi-interact-setting-panel");
       LiveKrnPageKey.LiveMultiInteractSettingPanel = liveKrnPageK1;
       liveKrnPageK[47] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveMultiChatSwitchLayoutDialog", 48, "LiveMultiChatSwitchLayoutDialog", "kwailive://krndialog?bundleid=LiveMultiChatSwitchLayoutDialog&componentname=live-multi-chat-layout-tip-dialog");
       LiveKrnPageKey.LiveMultiChatSwitchLayoutDialog = liveKrnPageK1;
       liveKrnPageK[48] = liveKrnPageK1;
       liveKrnPageK1 = new LiveKrnPageKey("LiveFeatRevenueBigStage", 49, "LiveFeatRevenueBigStage_Stage", "kwailive://krndialog?bundleid=LiveFeatRevenueBigStage&componentname=stage&transparent=1&heightratio=0.45&place=1&radius=16&minBundleVersion=46");
       LiveKrnPageKey.LiveFeatRevenueBigStage = liveKrnPageK1;
       liveKrnPageK[49] = liveKrnPageK1;
       LiveKrnPageKey.$VALUES = liveKrnPageK;
       LiveKrnPageKey.Companion = new LiveKrnPageKey$a(null);
       liveKrnPageK = LiveKrnPageKey.values();
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(liveKrnPageK.length), i1));
       int len = liveKrnPageK.length;
       for (; i < len; i = i + 1) {
          object oobject = liveKrnPageK[i];
          LiveKrnPageKey key = oobject.key;
          Objects.requireNonNull(key, "null cannot be cast to non-null type java.lang.String");
          String str = key.toLowerCase();
          a.o(str, "\(this as java.lang.String\).toLowerCase\(\)");
          linkedHashMa.put(str, oobject);
       }
       LiveKrnPageKey.mapping = linkedHashMa;
    }
    public void LiveKrnPageKey(String p0,int p1,String p2,String p3){
       super(p0, p1);
       this.key = p2;
       this.defaultUrl = p3;
    }
    public static final LiveKrnPageKey fromName(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveKrnPageKey.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveKrnPageKey.Companion.a(p0);
    }
    public static LiveKrnPageKey valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveKrnPageKey.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveKrnPageKey.class, p0);
    }
    public static LiveKrnPageKey[] values(){
       Object obj = PatchProxy.apply(null, null, LiveKrnPageKey.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveKrnPageKey.$VALUES.clone();
    }
    public final String getDefaultUrl(){
       return this.defaultUrl;
    }
    public final String getKey(){
       return this.key;
    }
}
