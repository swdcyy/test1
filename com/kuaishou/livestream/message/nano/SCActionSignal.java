package com.kuaishou.livestream.message.nano.SCActionSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.KtvMusicOrderFeed;
import com.kuaishou.livestream.message.nano.FansGroupJoinFeed;
import com.kuaishou.livestream.message.nano.TopBannerNoticeFeed;
import com.kuaishou.livestream.message.nano.LiveVoicePartyToastFeed;
import com.kuaishou.livestream.message.nano.LivePetUpgradeFeed;
import com.kuaishou.livestream.message.nano.TopDistrictRank;
import com.kuaishou.livestream.message.nano.LiveFollowGuide;
import com.kuaishou.livestream.message.nano.VoicePartyEmojiFeed;
import com.kuaishou.livestream.message.nano.LiveShopMessages$LiveShopAction;
import com.kuaishou.livestream.message.nano.LiveUserClipLightGuide;
import com.kuaishou.livestream.message.nano.LiveGamePopupFeed;
import com.kuaishou.livestream.message.nano.RainbowCommentFeed;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonActionSignal;
import com.kuaishou.livestream.message.nano.GzoneCommentLotteryFeed;
import com.kuaishou.livestream.message.nano.GzoneLiveRedDotFeed;
import com.kuaishou.livestream.message.nano.TeamPkFightMotion;
import com.kuaishou.livestream.message.nano.WealthHighGradeEnterRoom;
import com.kuaishou.livestream.message.nano.LiveFansTopOrderHelpBuyFeed;
import com.kuaishou.livestream.message.nano.WealthHighGradeBulletComment;
import com.kuaishou.livestream.message.nano.GzoneLiveBuffCardFeed;
import com.kuaishou.livestream.message.nano.LiveActivityPopup;
import com.kuaishou.livestream.message.nano.ValentineHighScoreEnterRoom;
import com.kuaishou.livestream.message.nano.LivePkFirstBlood;
import com.kuaishou.livestream.message.nano.LiveDragonBoatEnterRoom;
import com.kuaishou.livestream.message.nano.LiveRedPackSendInfo;
import com.kuaishou.livestream.message.nano.LiveRedPackGrabInfo;
import com.kuaishou.livestream.message.nano.LiveActivityEnterRoomTip;
import com.kuaishou.livestream.message.nano.LivePkGuideBubbleTip;
import com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveActivityPopUpInfo;
import com.kuaishou.livestream.message.nano.LiveFansTopBoostFollowFeed;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import com.kuaishou.protobuf.livestream.nano.LiveGuardNotice;
import com.kuaishou.livestream.message.nano.GzoneInteractiveCommentNotice;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextFeed;
import com.kuaishou.livestream.message.nano.GzoneAuthorTaskProgressNotice;
import com.kuaishou.livestream.message.nano.GzoneAuthorCommonNotice;
import com.kuaishou.livestream.message.nano.LiveMagicBoxOpenResultNotice;
import com.kuaishou.livestream.message.nano.LiveCommonRoute;
import com.kuaishou.livestream.message.nano.LiveWatchingListChangeNoticeFeed;
import com.kuaishou.livestream.message.nano.GzoneCommonFeed;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiveCommonPopup;
import com.kuaishou.merchant.message.nano.CommodityCardMessage$CommodityCardComponentChange;
import com.kuaishou.merchant.message.nano.CommodityCardMessage$CommodityCardChange;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiteTextNotice;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopLivePendant;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$MarketingPushLiveAction;
import com.kuaishou.livestream.message.nano.LiveRefreshAuthorStatusNotice;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopLiveActivityPendant;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCLiveBuyingNoticeSignal;
import com.kuaishou.livestream.message.nano.PkBountyActivityResultInfo;
import com.kuaishou.livestream.message.nano.SendGiftNotifyAnimation;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide;
import com.kuaishou.livestream.message.nano.LiveCommonEffectRouteInfo;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal;
import com.kuaishou.livestream.message.nano.LiveMultiMagicEffectInfo;
import com.kuaishou.protobuf.livestream.nano.LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo;
import com.kuaishou.livestream.message.nano.LiveVoicePartyMicSeatUserLevelUpEffects;
import com.kuaishou.livestream.message.nano.LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo;
import com.kuaishou.livestream.message.nano.TestActionSignalFeed;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class SCActionSignal extends MessageNano	// class@0013eb
{
    public LiveActivitySignalMessage$LiveActivityPopUpInfo[] activityPopUpInfo;
    public LiveActivityPopup[] activityPopup;
    public LiveExtraMessages$LiveCommonActionSignal[] commerceCommonFeed;
    public CommodityCardMessage$CommodityCardChange[] commodityCardChange;
    public CommodityCardMessage$CommodityCardComponentChange[] commodityCardComponentChange;
    public LiveCommonEffectInfo[] effectInfo;
    public FansGroupJoinFeed[] fansGroupJoinFeed;
    public LiveFansTopBoostFollowFeed[] fansTopBoostFollowFeed;
    public LiveFansTopOrderHelpBuyFeed[] fansTopOrderHelpBuy;
    public GzoneAuthorCommonNotice[] gzoneAuthorCommonNotice;
    public GzoneAuthorTaskProgressNotice[] gzoneAuthorTaskProgressNotice;
    public GzoneCommentLotteryFeed[] gzoneCommentLotteryFeed;
    public GzoneCommonFeed[] gzoneCommonFeed;
    public GzoneInteractiveCommentNotice[] gzoneInteractiveCommentNotice;
    public GzoneLiveBuffCardFeed[] gzoneLiveBuffCardFeed;
    public GzoneLiveRedDotFeed[] gzoneLiveRedDotFeed;
    public HighFrequencyActionGuide[] highFrequencyActionGuide;
    public WealthHighGradeBulletComment[] highGradeBulletComment;
    public KtvMusicOrderFeed[] ktvMusicOrderFeed;
    public LiveActivityEnterRoomTip[] liveActivityEnterRoomTip;
    public LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal[] liveAskOnItem;
    public LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo[] liveAuthorReinforceInfo;
    public LiveRoomSignalMessage$SCLiveBuyingNoticeSignal[] liveBuyingNoticeSignal;
    public LiveCommonEffectRouteInfo[] liveCommonEffectRouteInfo;
    public LiveCommonNoticeMessages$LiveCommonPopup[] liveCommonPopup;
    public LiveCommonRoute[] liveCommonRoute;
    public LiveDragonBoatEnterRoom[] liveDragonBoatEnterRoom;
    public LiveFollowGuide[] liveFollowGuide;
    public LiveGamePopupFeed[] liveGamePopupFeed;
    public LiveGuardNotice[] liveGuardNotice;
    public LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo[] liveGuideFollowCardInfo;
    public LiveMagicBoxOpenResultNotice[] liveMagicBoxOpenResultNotice;
    public LiveMultiMagicEffectInfo[] liveMultiMagicEffectInfo;
    public LivePetUpgradeFeed[] livePetUpgradeFeed;
    public LivePkFirstBlood[] livePkFirstBlood;
    public LiveRefreshAuthorStatusNotice[] liveRefreshAuthorStatusNotice;
    public LiveUserClipLightGuide[] liveUserClipLightGuide;
    public LiveVoicePartyMicSeatUserLevelUpEffects[] liveVoicePartyMicSeatUserLevelUpEffect;
    public LiveWatchingListChangeNoticeFeed[] liveWatchingListChangeNoticeFeed;
    public LiveRoomSignalMessage$MarketingPushLiveAction[] marketingPushLiveAction;
    public PkBountyActivityResultInfo[] pkBountyActivityResultInfo;
    public LivePkGuideBubbleTip[] pkGuideBubbleTip;
    public RainbowCommentFeed[] rainbowCommentFeed;
    public LiveRedPackGrabInfo[] redPackGrabInfo;
    public LiveRedPackSendInfo[] redPackSendInfo;
    public LiveStreamRichTextFeed$RichTextFeed[] richTextFeed;
    public SendGiftNotifyAnimation[] sendGiftNotifyAnimation;
    public LiveShopMessages$LiveShopAction[] shopAction;
    public LiveRoomSignalMessage$SCKwaishopLiveActivityPendant[] shopLiveActivityPendant;
    public LiveRoomSignalMessage$SCKwaishopLivePendant[] shopLivePendant;
    public TeamPkFightMotion[] teamPkFightMotion;
    public TestActionSignalFeed[] testFeed;
    public LiveCommonNoticeMessages$LiteTextNotice[] textNotice;
    public TopBannerNoticeFeed[] topBannerNoticeFeed;
    public TopDistrictRank[] topDistrictRank;
    public ValentineHighScoreEnterRoom[] valentineHighScoreEnterRoom;
    public VoicePartyEmojiFeed[] voicePartyEmojiFeed;
    public LiveVoicePartyToastFeed[] voicePartyToastFeed;
    public WealthHighGradeEnterRoom[] wealthHighGradeEnterRoom;
    public static SCActionSignal[] _emptyArray;

    public void SCActionSignal(){
       super();
       this.clear();
    }
    public static SCActionSignal[] emptyArray(){
       if (SCActionSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCActionSignal._emptyArray == null) {
             SCActionSignal[] sCActionSign = new SCActionSignal[0];
             SCActionSignal._emptyArray = sCActionSign;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCActionSignal._emptyArray;
    }
    public static SCActionSignal parseFrom(CodedInputByteBufferNano p0){
       return new SCActionSignal().mergeFrom(p0);
    }
    public static SCActionSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCActionSignal(), p0);
    }
    public SCActionSignal clear(){
       this.ktvMusicOrderFeed = KtvMusicOrderFeed.emptyArray();
       this.fansGroupJoinFeed = FansGroupJoinFeed.emptyArray();
       this.topBannerNoticeFeed = TopBannerNoticeFeed.emptyArray();
       this.voicePartyToastFeed = LiveVoicePartyToastFeed.emptyArray();
       this.livePetUpgradeFeed = LivePetUpgradeFeed.emptyArray();
       this.topDistrictRank = TopDistrictRank.emptyArray();
       this.liveFollowGuide = LiveFollowGuide.emptyArray();
       this.voicePartyEmojiFeed = VoicePartyEmojiFeed.emptyArray();
       this.shopAction = LiveShopMessages$LiveShopAction.emptyArray();
       this.liveUserClipLightGuide = LiveUserClipLightGuide.emptyArray();
       this.liveGamePopupFeed = LiveGamePopupFeed.emptyArray();
       this.rainbowCommentFeed = RainbowCommentFeed.emptyArray();
       this.commerceCommonFeed = LiveExtraMessages$LiveCommonActionSignal.emptyArray();
       this.gzoneCommentLotteryFeed = GzoneCommentLotteryFeed.emptyArray();
       this.gzoneLiveRedDotFeed = GzoneLiveRedDotFeed.emptyArray();
       this.teamPkFightMotion = TeamPkFightMotion.emptyArray();
       this.wealthHighGradeEnterRoom = WealthHighGradeEnterRoom.emptyArray();
       this.fansTopOrderHelpBuy = LiveFansTopOrderHelpBuyFeed.emptyArray();
       this.highGradeBulletComment = WealthHighGradeBulletComment.emptyArray();
       this.gzoneLiveBuffCardFeed = GzoneLiveBuffCardFeed.emptyArray();
       this.activityPopup = LiveActivityPopup.emptyArray();
       this.valentineHighScoreEnterRoom = ValentineHighScoreEnterRoom.emptyArray();
       this.livePkFirstBlood = LivePkFirstBlood.emptyArray();
       this.liveDragonBoatEnterRoom = LiveDragonBoatEnterRoom.emptyArray();
       this.redPackSendInfo = LiveRedPackSendInfo.emptyArray();
       this.redPackGrabInfo = LiveRedPackGrabInfo.emptyArray();
       this.liveActivityEnterRoomTip = LiveActivityEnterRoomTip.emptyArray();
       this.pkGuideBubbleTip = LivePkGuideBubbleTip.emptyArray();
       this.activityPopUpInfo = LiveActivitySignalMessage$LiveActivityPopUpInfo.emptyArray();
       this.fansTopBoostFollowFeed = LiveFansTopBoostFollowFeed.emptyArray();
       this.effectInfo = LiveCommonEffectInfo.emptyArray();
       this.liveGuardNotice = LiveGuardNotice.emptyArray();
       this.gzoneInteractiveCommentNotice = GzoneInteractiveCommentNotice.emptyArray();
       this.richTextFeed = LiveStreamRichTextFeed$RichTextFeed.emptyArray();
       this.gzoneAuthorTaskProgressNotice = GzoneAuthorTaskProgressNotice.emptyArray();
       this.gzoneAuthorCommonNotice = GzoneAuthorCommonNotice.emptyArray();
       this.liveMagicBoxOpenResultNotice = LiveMagicBoxOpenResultNotice.emptyArray();
       this.liveCommonRoute = LiveCommonRoute.emptyArray();
       this.liveWatchingListChangeNoticeFeed = LiveWatchingListChangeNoticeFeed.emptyArray();
       this.gzoneCommonFeed = GzoneCommonFeed.emptyArray();
       this.liveCommonPopup = LiveCommonNoticeMessages$LiveCommonPopup.emptyArray();
       this.commodityCardComponentChange = CommodityCardMessage$CommodityCardComponentChange.emptyArray();
       this.commodityCardChange = CommodityCardMessage$CommodityCardChange.emptyArray();
       this.textNotice = LiveCommonNoticeMessages$LiteTextNotice.emptyArray();
       this.shopLivePendant = LiveRoomSignalMessage$SCKwaishopLivePendant.emptyArray();
       this.marketingPushLiveAction = LiveRoomSignalMessage$MarketingPushLiveAction.emptyArray();
       this.liveRefreshAuthorStatusNotice = LiveRefreshAuthorStatusNotice.emptyArray();
       this.shopLiveActivityPendant = LiveRoomSignalMessage$SCKwaishopLiveActivityPendant.emptyArray();
       this.liveBuyingNoticeSignal = LiveRoomSignalMessage$SCLiveBuyingNoticeSignal.emptyArray();
       this.pkBountyActivityResultInfo = PkBountyActivityResultInfo.emptyArray();
       this.sendGiftNotifyAnimation = SendGiftNotifyAnimation.emptyArray();
       this.highFrequencyActionGuide = HighFrequencyActionGuide.emptyArray();
       this.liveCommonEffectRouteInfo = LiveCommonEffectRouteInfo.emptyArray();
       this.liveAskOnItem = LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal.emptyArray();
       this.liveMultiMagicEffectInfo = LiveMultiMagicEffectInfo.emptyArray();
       this.liveGuideFollowCardInfo = LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo.emptyArray();
       this.liveVoicePartyMicSeatUserLevelUpEffect = LiveVoicePartyMicSeatUserLevelUpEffects.emptyArray();
       this.liveAuthorReinforceInfo = LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo.emptyArray();
       this.testFeed = TestActionSignalFeed.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       SCActionSignal tktvMusicOrd1;
       object oobject;
       int i = super.computeSerializedSize();
       SCActionSignal tktvMusicOrd = this.ktvMusicOrderFeed;
       int i1 = 0;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.ktvMusicOrderFeed;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.fansGroupJoinFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.fansGroupJoinFeed;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.topBannerNoticeFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.topBannerNoticeFeed;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.voicePartyToastFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.voicePartyToastFeed;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.livePetUpgradeFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.livePetUpgradeFeed;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.topDistrictRank;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.topDistrictRank;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveFollowGuide;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveFollowGuide;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.voicePartyEmojiFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.voicePartyEmojiFeed;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.shopAction;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.shopAction;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveUserClipLightGuide;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveUserClipLightGuide;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(11, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveGamePopupFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveGamePopupFeed;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(12, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.rainbowCommentFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.rainbowCommentFeed;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(13, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.commerceCommonFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.commerceCommonFeed;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(14, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.gzoneCommentLotteryFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.gzoneCommentLotteryFeed;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(15, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.gzoneLiveRedDotFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.gzoneLiveRedDotFeed;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(16, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.teamPkFightMotion;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.teamPkFightMotion;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(17, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.wealthHighGradeEnterRoom;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.wealthHighGradeEnterRoom;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(18, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.fansTopOrderHelpBuy;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.fansTopOrderHelpBuy;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(19, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.highGradeBulletComment;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.highGradeBulletComment;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(20, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.gzoneLiveBuffCardFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.gzoneLiveBuffCardFeed;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(21, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.activityPopup;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.activityPopup;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(22, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.valentineHighScoreEnterRoom;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.valentineHighScoreEnterRoom;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(23, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.livePkFirstBlood;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.livePkFirstBlood;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(24, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveDragonBoatEnterRoom;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveDragonBoatEnterRoom;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(25, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.redPackSendInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.redPackSendInfo;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(26, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.redPackGrabInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.redPackGrabInfo;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(27, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveActivityEnterRoomTip;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveActivityEnterRoomTip;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(28, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.pkGuideBubbleTip;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.pkGuideBubbleTip;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(29, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.activityPopUpInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.activityPopUpInfo;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(30, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.fansTopBoostFollowFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.fansTopBoostFollowFeed;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(31, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.effectInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.effectInfo;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(32, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveGuardNotice;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveGuardNotice;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(33, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.gzoneInteractiveCommentNotice;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.gzoneInteractiveCommentNotice;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(34, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.richTextFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.richTextFeed;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(35, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.gzoneAuthorTaskProgressNotice;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.gzoneAuthorTaskProgressNotice;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(36, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.gzoneAuthorCommonNotice;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.gzoneAuthorCommonNotice;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(37, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveMagicBoxOpenResultNotice;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveMagicBoxOpenResultNotice;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(38, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveCommonRoute;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveCommonRoute;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(39, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveWatchingListChangeNoticeFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveWatchingListChangeNoticeFeed;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(40, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.gzoneCommonFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.gzoneCommonFeed;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(41, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveCommonPopup;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveCommonPopup;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(42, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.commodityCardComponentChange;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.commodityCardComponentChange;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(43, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.commodityCardChange;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.commodityCardChange;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(44, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.textNotice;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.textNotice;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(45, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.shopLivePendant;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.shopLivePendant;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(46, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.marketingPushLiveAction;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.marketingPushLiveAction;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(47, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveRefreshAuthorStatusNotice;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveRefreshAuthorStatusNotice;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(48, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.shopLiveActivityPendant;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.shopLiveActivityPendant;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(49, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveBuyingNoticeSignal;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveBuyingNoticeSignal;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(50, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.pkBountyActivityResultInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.pkBountyActivityResultInfo;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(51, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.sendGiftNotifyAnimation;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.sendGiftNotifyAnimation;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(52, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.highFrequencyActionGuide;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.highFrequencyActionGuide;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(53, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveCommonEffectRouteInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveCommonEffectRouteInfo;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(54, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveAskOnItem;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveAskOnItem;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(55, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveMultiMagicEffectInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveMultiMagicEffectInfo;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(56, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveGuideFollowCardInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveGuideFollowCardInfo;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(57, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveVoicePartyMicSeatUserLevelUpEffect;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveVoicePartyMicSeatUserLevelUpEffect;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(58, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.liveAuthorReinforceInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i2 = 0;
          tktvMusicOrd1 = this.liveAuthorReinforceInfo;
          while (i2 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(59, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tktvMusicOrd = this.testFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          tktvMusicOrd = this.testFeed;
          while (i1 < tktvMusicOrd.length) {
             object oobject1 = tktvMusicOrd[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(100, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCActionSignal mergeFrom(CodedInputByteBufferNano p0){
       SCActionSignal tktvMusicOrd;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 10);
                tktvMusicOrd = this.ktvMusicOrderFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                KtvMusicOrderFeed[] ktvMusicOrde = new KtvMusicOrderFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, ktvMusicOrde, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   ktvMusicOrde[i2] = new KtvMusicOrderFeed();
                   p0.readMessage(ktvMusicOrde[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                ktvMusicOrde[i2] = new KtvMusicOrderFeed();
                p0.readMessage(ktvMusicOrde[i2]);
                this.ktvMusicOrderFeed = ktvMusicOrde;
                break;
              case 18:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 18);
                tktvMusicOrd = this.fansGroupJoinFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                FansGroupJoinFeed[] uFansGroupJo = new FansGroupJoinFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, uFansGroupJo, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uFansGroupJo[i2] = new FansGroupJoinFeed();
                   p0.readMessage(uFansGroupJo[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uFansGroupJo[i2] = new FansGroupJoinFeed();
                p0.readMessage(uFansGroupJo[i2]);
                this.fansGroupJoinFeed = uFansGroupJo;
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                tktvMusicOrd = this.topBannerNoticeFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                TopBannerNoticeFeed[] topBannerNot = new TopBannerNoticeFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, topBannerNot, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   topBannerNot[i2] = new TopBannerNoticeFeed();
                   p0.readMessage(topBannerNot[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                topBannerNot[i2] = new TopBannerNoticeFeed();
                p0.readMessage(topBannerNot[i2]);
                this.topBannerNoticeFeed = topBannerNot;
                break;
              case '"':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 34);
                tktvMusicOrd = this.voicePartyToastFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveVoicePartyToastFeed[] liveVoicePar = new LiveVoicePartyToastFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveVoicePar, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveVoicePar[i2] = new LiveVoicePartyToastFeed();
                   p0.readMessage(liveVoicePar[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveVoicePar[i2] = new LiveVoicePartyToastFeed();
                p0.readMessage(liveVoicePar[i2]);
                this.voicePartyToastFeed = liveVoicePar;
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                tktvMusicOrd = this.livePetUpgradeFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LivePetUpgradeFeed[] livePetUpgra = new LivePetUpgradeFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, livePetUpgra, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   livePetUpgra[i2] = new LivePetUpgradeFeed();
                   p0.readMessage(livePetUpgra[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                livePetUpgra[i2] = new LivePetUpgradeFeed();
                p0.readMessage(livePetUpgra[i2]);
                this.livePetUpgradeFeed = livePetUpgra;
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                tktvMusicOrd = this.topDistrictRank;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                TopDistrictRank[] topDistrictR = new TopDistrictRank[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, topDistrictR, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   topDistrictR[i2] = new TopDistrictRank();
                   p0.readMessage(topDistrictR[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                topDistrictR[i2] = new TopDistrictRank();
                p0.readMessage(topDistrictR[i2]);
                this.topDistrictRank = topDistrictR;
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                tktvMusicOrd = this.liveFollowGuide;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveFollowGuide[] liveFollowGu = new LiveFollowGuide[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveFollowGu, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveFollowGu[i2] = new LiveFollowGuide();
                   p0.readMessage(liveFollowGu[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveFollowGu[i2] = new LiveFollowGuide();
                p0.readMessage(liveFollowGu[i2]);
                this.liveFollowGuide = liveFollowGu;
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                tktvMusicOrd = this.voicePartyEmojiFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                VoicePartyEmojiFeed[] voicePartyEm = new VoicePartyEmojiFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, voicePartyEm, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   voicePartyEm[i2] = new VoicePartyEmojiFeed();
                   p0.readMessage(voicePartyEm[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                voicePartyEm[i2] = new VoicePartyEmojiFeed();
                p0.readMessage(voicePartyEm[i2]);
                this.voicePartyEmojiFeed = voicePartyEm;
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                tktvMusicOrd = this.shopAction;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveShopMessages$LiveShopAction[] liveShopActi = new LiveShopMessages$LiveShopAction[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveShopActi, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveShopActi[i2] = new LiveShopMessages$LiveShopAction();
                   p0.readMessage(liveShopActi[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveShopActi[i2] = new LiveShopMessages$LiveShopAction();
                p0.readMessage(liveShopActi[i2]);
                this.shopAction = liveShopActi;
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                tktvMusicOrd = this.liveUserClipLightGuide;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveUserClipLightGuide[] liveUserClip = new LiveUserClipLightGuide[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveUserClip, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveUserClip[i2] = new LiveUserClipLightGuide();
                   p0.readMessage(liveUserClip[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveUserClip[i2] = new LiveUserClipLightGuide();
                p0.readMessage(liveUserClip[i2]);
                this.liveUserClipLightGuide = liveUserClip;
                break;
              case 'b':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 98);
                tktvMusicOrd = this.liveGamePopupFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveGamePopupFeed[] liveGamePopu = new LiveGamePopupFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveGamePopu, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveGamePopu[i2] = new LiveGamePopupFeed();
                   p0.readMessage(liveGamePopu[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveGamePopu[i2] = new LiveGamePopupFeed();
                p0.readMessage(liveGamePopu[i2]);
                this.liveGamePopupFeed = liveGamePopu;
                break;
              case 'j':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 106);
                tktvMusicOrd = this.rainbowCommentFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                RainbowCommentFeed[] rainbowComme = new RainbowCommentFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, rainbowComme, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   rainbowComme[i2] = new RainbowCommentFeed();
                   p0.readMessage(rainbowComme[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                rainbowComme[i2] = new RainbowCommentFeed();
                p0.readMessage(rainbowComme[i2]);
                this.rainbowCommentFeed = rainbowComme;
                break;
              case 'r':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 114);
                tktvMusicOrd = this.commerceCommonFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveExtraMessages$LiveCommonActionSignal[] liveCommonAc = new LiveExtraMessages$LiveCommonActionSignal[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveCommonAc, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveCommonAc[i2] = new LiveExtraMessages$LiveCommonActionSignal();
                   p0.readMessage(liveCommonAc[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveCommonAc[i2] = new LiveExtraMessages$LiveCommonActionSignal();
                p0.readMessage(liveCommonAc[i2]);
                this.commerceCommonFeed = liveCommonAc;
                break;
              case 'z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 122);
                tktvMusicOrd = this.gzoneCommentLotteryFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                GzoneCommentLotteryFeed[] gzoneComment = new GzoneCommentLotteryFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, gzoneComment, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   gzoneComment[i2] = new GzoneCommentLotteryFeed();
                   p0.readMessage(gzoneComment[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                gzoneComment[i2] = new GzoneCommentLotteryFeed();
                p0.readMessage(gzoneComment[i2]);
                this.gzoneCommentLotteryFeed = gzoneComment;
                break;
              case 130:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 130);
                tktvMusicOrd = this.gzoneLiveRedDotFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                GzoneLiveRedDotFeed[] gzoneLiveRed = new GzoneLiveRedDotFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, gzoneLiveRed, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   gzoneLiveRed[i2] = new GzoneLiveRedDotFeed();
                   p0.readMessage(gzoneLiveRed[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                gzoneLiveRed[i2] = new GzoneLiveRedDotFeed();
                p0.readMessage(gzoneLiveRed[i2]);
                this.gzoneLiveRedDotFeed = gzoneLiveRed;
                break;
              case 138:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 138);
                tktvMusicOrd = this.teamPkFightMotion;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                TeamPkFightMotion[] teamPkFightM = new TeamPkFightMotion[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, teamPkFightM, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   teamPkFightM[i2] = new TeamPkFightMotion();
                   p0.readMessage(teamPkFightM[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                teamPkFightM[i2] = new TeamPkFightMotion();
                p0.readMessage(teamPkFightM[i2]);
                this.teamPkFightMotion = teamPkFightM;
                break;
              case 146:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 146);
                tktvMusicOrd = this.wealthHighGradeEnterRoom;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                WealthHighGradeEnterRoom[] wealthHighGr = new WealthHighGradeEnterRoom[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, wealthHighGr, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   wealthHighGr[i2] = new WealthHighGradeEnterRoom();
                   p0.readMessage(wealthHighGr[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                wealthHighGr[i2] = new WealthHighGradeEnterRoom();
                p0.readMessage(wealthHighGr[i2]);
                this.wealthHighGradeEnterRoom = wealthHighGr;
                break;
              case 154:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 154);
                tktvMusicOrd = this.fansTopOrderHelpBuy;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveFansTopOrderHelpBuyFeed[] liveFansTopO = new LiveFansTopOrderHelpBuyFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveFansTopO, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveFansTopO[i2] = new LiveFansTopOrderHelpBuyFeed();
                   p0.readMessage(liveFansTopO[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveFansTopO[i2] = new LiveFansTopOrderHelpBuyFeed();
                p0.readMessage(liveFansTopO[i2]);
                this.fansTopOrderHelpBuy = liveFansTopO;
                break;
              case 162:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 162);
                tktvMusicOrd = this.highGradeBulletComment;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                WealthHighGradeBulletComment[] wealthHighGr1 = new WealthHighGradeBulletComment[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, wealthHighGr1, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   wealthHighGr1[i2] = new WealthHighGradeBulletComment();
                   p0.readMessage(wealthHighGr1[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                wealthHighGr1[i2] = new WealthHighGradeBulletComment();
                p0.readMessage(wealthHighGr1[i2]);
                this.highGradeBulletComment = wealthHighGr1;
                break;
              case 170:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 170);
                tktvMusicOrd = this.gzoneLiveBuffCardFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                GzoneLiveBuffCardFeed[] gzoneLiveBuf = new GzoneLiveBuffCardFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, gzoneLiveBuf, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   gzoneLiveBuf[i2] = new GzoneLiveBuffCardFeed();
                   p0.readMessage(gzoneLiveBuf[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                gzoneLiveBuf[i2] = new GzoneLiveBuffCardFeed();
                p0.readMessage(gzoneLiveBuf[i2]);
                this.gzoneLiveBuffCardFeed = gzoneLiveBuf;
                break;
              case 178:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 178);
                tktvMusicOrd = this.activityPopup;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveActivityPopup[] liveActivity = new LiveActivityPopup[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveActivity, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveActivity[i2] = new LiveActivityPopup();
                   p0.readMessage(liveActivity[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveActivity[i2] = new LiveActivityPopup();
                p0.readMessage(liveActivity[i2]);
                this.activityPopup = liveActivity;
                break;
              case 186:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 186);
                tktvMusicOrd = this.valentineHighScoreEnterRoom;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                ValentineHighScoreEnterRoom[] valentineHig = new ValentineHighScoreEnterRoom[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, valentineHig, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   valentineHig[i2] = new ValentineHighScoreEnterRoom();
                   p0.readMessage(valentineHig[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                valentineHig[i2] = new ValentineHighScoreEnterRoom();
                p0.readMessage(valentineHig[i2]);
                this.valentineHighScoreEnterRoom = valentineHig;
                break;
              case 194:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 194);
                tktvMusicOrd = this.livePkFirstBlood;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LivePkFirstBlood[] livePkFirstB = new LivePkFirstBlood[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, livePkFirstB, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   livePkFirstB[i2] = new LivePkFirstBlood();
                   p0.readMessage(livePkFirstB[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                livePkFirstB[i2] = new LivePkFirstBlood();
                p0.readMessage(livePkFirstB[i2]);
                this.livePkFirstBlood = livePkFirstB;
                break;
              case 202:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 202);
                tktvMusicOrd = this.liveDragonBoatEnterRoom;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveDragonBoatEnterRoom[] liveDragonBo = new LiveDragonBoatEnterRoom[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveDragonBo, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveDragonBo[i2] = new LiveDragonBoatEnterRoom();
                   p0.readMessage(liveDragonBo[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveDragonBo[i2] = new LiveDragonBoatEnterRoom();
                p0.readMessage(liveDragonBo[i2]);
                this.liveDragonBoatEnterRoom = liveDragonBo;
                break;
              case 210:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 210);
                tktvMusicOrd = this.redPackSendInfo;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveRedPackSendInfo[] liveRedPackS = new LiveRedPackSendInfo[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveRedPackS, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveRedPackS[i2] = new LiveRedPackSendInfo();
                   p0.readMessage(liveRedPackS[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveRedPackS[i2] = new LiveRedPackSendInfo();
                p0.readMessage(liveRedPackS[i2]);
                this.redPackSendInfo = liveRedPackS;
                break;
              case 218:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 218);
                tktvMusicOrd = this.redPackGrabInfo;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveRedPackGrabInfo[] liveRedPackG = new LiveRedPackGrabInfo[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveRedPackG, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveRedPackG[i2] = new LiveRedPackGrabInfo();
                   p0.readMessage(liveRedPackG[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveRedPackG[i2] = new LiveRedPackGrabInfo();
                p0.readMessage(liveRedPackG[i2]);
                this.redPackGrabInfo = liveRedPackG;
                break;
              case 226:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 226);
                tktvMusicOrd = this.liveActivityEnterRoomTip;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveActivityEnterRoomTip[] liveActivity1 = new LiveActivityEnterRoomTip[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveActivity1, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveActivity1[i2] = new LiveActivityEnterRoomTip();
                   p0.readMessage(liveActivity1[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveActivity1[i2] = new LiveActivityEnterRoomTip();
                p0.readMessage(liveActivity1[i2]);
                this.liveActivityEnterRoomTip = liveActivity1;
                break;
              case 234:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 234);
                tktvMusicOrd = this.pkGuideBubbleTip;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LivePkGuideBubbleTip[] livePkGuideB = new LivePkGuideBubbleTip[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, livePkGuideB, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   livePkGuideB[i2] = new LivePkGuideBubbleTip();
                   p0.readMessage(livePkGuideB[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                livePkGuideB[i2] = new LivePkGuideBubbleTip();
                p0.readMessage(livePkGuideB[i2]);
                this.pkGuideBubbleTip = livePkGuideB;
                break;
              case 242:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 242);
                tktvMusicOrd = this.activityPopUpInfo;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveActivitySignalMessage$LiveActivityPopUpInfo[] liveActivity2 = new LiveActivitySignalMessage$LiveActivityPopUpInfo[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveActivity2, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveActivity2[i2] = new LiveActivitySignalMessage$LiveActivityPopUpInfo();
                   p0.readMessage(liveActivity2[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveActivity2[i2] = new LiveActivitySignalMessage$LiveActivityPopUpInfo();
                p0.readMessage(liveActivity2[i2]);
                this.activityPopUpInfo = liveActivity2;
                break;
              case 250:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 250);
                tktvMusicOrd = this.fansTopBoostFollowFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveFansTopBoostFollowFeed[] liveFansTopB = new LiveFansTopBoostFollowFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveFansTopB, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveFansTopB[i2] = new LiveFansTopBoostFollowFeed();
                   p0.readMessage(liveFansTopB[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveFansTopB[i2] = new LiveFansTopBoostFollowFeed();
                p0.readMessage(liveFansTopB[i2]);
                this.fansTopBoostFollowFeed = liveFansTopB;
                break;
              case 258:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 258);
                tktvMusicOrd = this.effectInfo;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveCommonEffectInfo[] liveCommonEf = new LiveCommonEffectInfo[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveCommonEf, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveCommonEf[i2] = new LiveCommonEffectInfo();
                   p0.readMessage(liveCommonEf[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveCommonEf[i2] = new LiveCommonEffectInfo();
                p0.readMessage(liveCommonEf[i2]);
                this.effectInfo = liveCommonEf;
                break;
              case 266:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 266);
                tktvMusicOrd = this.liveGuardNotice;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveGuardNotice[] liveGuardNot = new LiveGuardNotice[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveGuardNot, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveGuardNot[i2] = new LiveGuardNotice();
                   p0.readMessage(liveGuardNot[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveGuardNot[i2] = new LiveGuardNotice();
                p0.readMessage(liveGuardNot[i2]);
                this.liveGuardNotice = liveGuardNot;
                break;
              case 274:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 274);
                tktvMusicOrd = this.gzoneInteractiveCommentNotice;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                GzoneInteractiveCommentNotice[] gzoneInterac = new GzoneInteractiveCommentNotice[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, gzoneInterac, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   gzoneInterac[i2] = new GzoneInteractiveCommentNotice();
                   p0.readMessage(gzoneInterac[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                gzoneInterac[i2] = new GzoneInteractiveCommentNotice();
                p0.readMessage(gzoneInterac[i2]);
                this.gzoneInteractiveCommentNotice = gzoneInterac;
                break;
              case 282:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 282);
                tktvMusicOrd = this.richTextFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveStreamRichTextFeed$RichTextFeed[] richTextFeed = new LiveStreamRichTextFeed$RichTextFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, richTextFeed, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   richTextFeed[i2] = new LiveStreamRichTextFeed$RichTextFeed();
                   p0.readMessage(richTextFeed[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                richTextFeed[i2] = new LiveStreamRichTextFeed$RichTextFeed();
                p0.readMessage(richTextFeed[i2]);
                this.richTextFeed = richTextFeed;
                break;
              case 290:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 290);
                tktvMusicOrd = this.gzoneAuthorTaskProgressNotice;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                GzoneAuthorTaskProgressNotice[] gzoneAuthorT = new GzoneAuthorTaskProgressNotice[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, gzoneAuthorT, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   gzoneAuthorT[i2] = new GzoneAuthorTaskProgressNotice();
                   p0.readMessage(gzoneAuthorT[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                gzoneAuthorT[i2] = new GzoneAuthorTaskProgressNotice();
                p0.readMessage(gzoneAuthorT[i2]);
                this.gzoneAuthorTaskProgressNotice = gzoneAuthorT;
                break;
              case 298:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 298);
                tktvMusicOrd = this.gzoneAuthorCommonNotice;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                GzoneAuthorCommonNotice[] gzoneAuthorC = new GzoneAuthorCommonNotice[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, gzoneAuthorC, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   gzoneAuthorC[i2] = new GzoneAuthorCommonNotice();
                   p0.readMessage(gzoneAuthorC[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                gzoneAuthorC[i2] = new GzoneAuthorCommonNotice();
                p0.readMessage(gzoneAuthorC[i2]);
                this.gzoneAuthorCommonNotice = gzoneAuthorC;
                break;
              case 306:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 306);
                tktvMusicOrd = this.liveMagicBoxOpenResultNotice;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveMagicBoxOpenResultNotice[] liveMagicBox = new LiveMagicBoxOpenResultNotice[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveMagicBox, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveMagicBox[i2] = new LiveMagicBoxOpenResultNotice();
                   p0.readMessage(liveMagicBox[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveMagicBox[i2] = new LiveMagicBoxOpenResultNotice();
                p0.readMessage(liveMagicBox[i2]);
                this.liveMagicBoxOpenResultNotice = liveMagicBox;
                break;
              case 314:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 314);
                tktvMusicOrd = this.liveCommonRoute;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveCommonRoute[] liveCommonRo = new LiveCommonRoute[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveCommonRo, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveCommonRo[i2] = new LiveCommonRoute();
                   p0.readMessage(liveCommonRo[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveCommonRo[i2] = new LiveCommonRoute();
                p0.readMessage(liveCommonRo[i2]);
                this.liveCommonRoute = liveCommonRo;
                break;
              case 322:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 322);
                tktvMusicOrd = this.liveWatchingListChangeNoticeFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveWatchingListChangeNoticeFeed[] liveWatching = new LiveWatchingListChangeNoticeFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveWatching, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveWatching[i2] = new LiveWatchingListChangeNoticeFeed();
                   p0.readMessage(liveWatching[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveWatching[i2] = new LiveWatchingListChangeNoticeFeed();
                p0.readMessage(liveWatching[i2]);
                this.liveWatchingListChangeNoticeFeed = liveWatching;
                break;
              case 330:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 330);
                tktvMusicOrd = this.gzoneCommonFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                GzoneCommonFeed[] gzoneCommonF = new GzoneCommonFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, gzoneCommonF, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   gzoneCommonF[i2] = new GzoneCommonFeed();
                   p0.readMessage(gzoneCommonF[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                gzoneCommonF[i2] = new GzoneCommonFeed();
                p0.readMessage(gzoneCommonF[i2]);
                this.gzoneCommonFeed = gzoneCommonF;
                break;
              case 338:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 338);
                tktvMusicOrd = this.liveCommonPopup;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveCommonNoticeMessages$LiveCommonPopup[] liveCommonPo = new LiveCommonNoticeMessages$LiveCommonPopup[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveCommonPo, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveCommonPo[i2] = new LiveCommonNoticeMessages$LiveCommonPopup();
                   p0.readMessage(liveCommonPo[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveCommonPo[i2] = new LiveCommonNoticeMessages$LiveCommonPopup();
                p0.readMessage(liveCommonPo[i2]);
                this.liveCommonPopup = liveCommonPo;
                break;
              case 346:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 346);
                tktvMusicOrd = this.commodityCardComponentChange;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                CommodityCardMessage$CommodityCardComponentChange[] uCommodityCa = new CommodityCardMessage$CommodityCardComponentChange[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, uCommodityCa, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uCommodityCa[i2] = new CommodityCardMessage$CommodityCardComponentChange();
                   p0.readMessage(uCommodityCa[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uCommodityCa[i2] = new CommodityCardMessage$CommodityCardComponentChange();
                p0.readMessage(uCommodityCa[i2]);
                this.commodityCardComponentChange = uCommodityCa;
                break;
              case 354:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 354);
                tktvMusicOrd = this.commodityCardChange;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                CommodityCardMessage$CommodityCardChange[] uCommodityCa1 = new CommodityCardMessage$CommodityCardChange[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, uCommodityCa1, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uCommodityCa1[i2] = new CommodityCardMessage$CommodityCardChange();
                   p0.readMessage(uCommodityCa1[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uCommodityCa1[i2] = new CommodityCardMessage$CommodityCardChange();
                p0.readMessage(uCommodityCa1[i2]);
                this.commodityCardChange = uCommodityCa1;
                break;
              case 362:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 362);
                tktvMusicOrd = this.textNotice;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveCommonNoticeMessages$LiteTextNotice[] liteTextNoti = new LiveCommonNoticeMessages$LiteTextNotice[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liteTextNoti, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liteTextNoti[i2] = new LiveCommonNoticeMessages$LiteTextNotice();
                   p0.readMessage(liteTextNoti[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liteTextNoti[i2] = new LiveCommonNoticeMessages$LiteTextNotice();
                p0.readMessage(liteTextNoti[i2]);
                this.textNotice = liteTextNoti;
                break;
              case 370:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 370);
                tktvMusicOrd = this.shopLivePendant;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveRoomSignalMessage$SCKwaishopLivePendant[] sCKwaishopLi = new LiveRoomSignalMessage$SCKwaishopLivePendant[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, sCKwaishopLi, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   sCKwaishopLi[i2] = new LiveRoomSignalMessage$SCKwaishopLivePendant();
                   p0.readMessage(sCKwaishopLi[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                sCKwaishopLi[i2] = new LiveRoomSignalMessage$SCKwaishopLivePendant();
                p0.readMessage(sCKwaishopLi[i2]);
                this.shopLivePendant = sCKwaishopLi;
                break;
              case 378:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 378);
                tktvMusicOrd = this.marketingPushLiveAction;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveRoomSignalMessage$MarketingPushLiveAction[] marketingPus = new LiveRoomSignalMessage$MarketingPushLiveAction[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, marketingPus, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   marketingPus[i2] = new LiveRoomSignalMessage$MarketingPushLiveAction();
                   p0.readMessage(marketingPus[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                marketingPus[i2] = new LiveRoomSignalMessage$MarketingPushLiveAction();
                p0.readMessage(marketingPus[i2]);
                this.marketingPushLiveAction = marketingPus;
                break;
              case 386:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 386);
                tktvMusicOrd = this.liveRefreshAuthorStatusNotice;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveRefreshAuthorStatusNotice[] liveRefreshA = new LiveRefreshAuthorStatusNotice[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveRefreshA, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveRefreshA[i2] = new LiveRefreshAuthorStatusNotice();
                   p0.readMessage(liveRefreshA[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveRefreshA[i2] = new LiveRefreshAuthorStatusNotice();
                p0.readMessage(liveRefreshA[i2]);
                this.liveRefreshAuthorStatusNotice = liveRefreshA;
                break;
              case 394:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 394);
                tktvMusicOrd = this.shopLiveActivityPendant;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveRoomSignalMessage$SCKwaishopLiveActivityPendant[] sCKwaishopLi1 = new LiveRoomSignalMessage$SCKwaishopLiveActivityPendant[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, sCKwaishopLi1, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   sCKwaishopLi1[i2] = new LiveRoomSignalMessage$SCKwaishopLiveActivityPendant();
                   p0.readMessage(sCKwaishopLi1[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                sCKwaishopLi1[i2] = new LiveRoomSignalMessage$SCKwaishopLiveActivityPendant();
                p0.readMessage(sCKwaishopLi1[i2]);
                this.shopLiveActivityPendant = sCKwaishopLi1;
                break;
              case 402:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 402);
                tktvMusicOrd = this.liveBuyingNoticeSignal;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveRoomSignalMessage$SCLiveBuyingNoticeSignal[] sCLiveBuying = new LiveRoomSignalMessage$SCLiveBuyingNoticeSignal[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, sCLiveBuying, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   sCLiveBuying[i2] = new LiveRoomSignalMessage$SCLiveBuyingNoticeSignal();
                   p0.readMessage(sCLiveBuying[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                sCLiveBuying[i2] = new LiveRoomSignalMessage$SCLiveBuyingNoticeSignal();
                p0.readMessage(sCLiveBuying[i2]);
                this.liveBuyingNoticeSignal = sCLiveBuying;
                break;
              case 410:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 410);
                tktvMusicOrd = this.pkBountyActivityResultInfo;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                PkBountyActivityResultInfo[] pkBountyActi = new PkBountyActivityResultInfo[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, pkBountyActi, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   pkBountyActi[i2] = new PkBountyActivityResultInfo();
                   p0.readMessage(pkBountyActi[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                pkBountyActi[i2] = new PkBountyActivityResultInfo();
                p0.readMessage(pkBountyActi[i2]);
                this.pkBountyActivityResultInfo = pkBountyActi;
                break;
              case 418:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 418);
                tktvMusicOrd = this.sendGiftNotifyAnimation;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                SendGiftNotifyAnimation[] sendGiftNoti = new SendGiftNotifyAnimation[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, sendGiftNoti, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   sendGiftNoti[i2] = new SendGiftNotifyAnimation();
                   p0.readMessage(sendGiftNoti[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                sendGiftNoti[i2] = new SendGiftNotifyAnimation();
                p0.readMessage(sendGiftNoti[i2]);
                this.sendGiftNotifyAnimation = sendGiftNoti;
                break;
              case 426:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 426);
                tktvMusicOrd = this.highFrequencyActionGuide;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                HighFrequencyActionGuide[] highFrequenc = new HighFrequencyActionGuide[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, highFrequenc, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   highFrequenc[i2] = new HighFrequencyActionGuide();
                   p0.readMessage(highFrequenc[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                highFrequenc[i2] = new HighFrequencyActionGuide();
                p0.readMessage(highFrequenc[i2]);
                this.highFrequencyActionGuide = highFrequenc;
                break;
              case 434:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 434);
                tktvMusicOrd = this.liveCommonEffectRouteInfo;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveCommonEffectRouteInfo[] liveCommonEf1 = new LiveCommonEffectRouteInfo[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveCommonEf1, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveCommonEf1[i2] = new LiveCommonEffectRouteInfo();
                   p0.readMessage(liveCommonEf1[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveCommonEf1[i2] = new LiveCommonEffectRouteInfo();
                p0.readMessage(liveCommonEf1[i2]);
                this.liveCommonEffectRouteInfo = liveCommonEf1;
                break;
              case 442:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 442);
                tktvMusicOrd = this.liveAskOnItem;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal[] kwaishopLive = new LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, kwaishopLive, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   kwaishopLive[i2] = new LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal();
                   p0.readMessage(kwaishopLive[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                kwaishopLive[i2] = new LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal();
                p0.readMessage(kwaishopLive[i2]);
                this.liveAskOnItem = kwaishopLive;
                break;
              case 450:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 450);
                tktvMusicOrd = this.liveMultiMagicEffectInfo;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveMultiMagicEffectInfo[] liveMultiMag = new LiveMultiMagicEffectInfo[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveMultiMag, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveMultiMag[i2] = new LiveMultiMagicEffectInfo();
                   p0.readMessage(liveMultiMag[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveMultiMag[i2] = new LiveMultiMagicEffectInfo();
                p0.readMessage(liveMultiMag[i2]);
                this.liveMultiMagicEffectInfo = liveMultiMag;
                break;
              case 458:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 458);
                tktvMusicOrd = this.liveGuideFollowCardInfo;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo[] sCLiveGuideF = new LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, sCLiveGuideF, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   sCLiveGuideF[i2] = new LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo();
                   p0.readMessage(sCLiveGuideF[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                sCLiveGuideF[i2] = new LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo();
                p0.readMessage(sCLiveGuideF[i2]);
                this.liveGuideFollowCardInfo = sCLiveGuideF;
                break;
              case 466:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 466);
                tktvMusicOrd = this.liveVoicePartyMicSeatUserLevelUpEffect;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveVoicePartyMicSeatUserLevelUpEffects[] liveVoicePar1 = new LiveVoicePartyMicSeatUserLevelUpEffects[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, liveVoicePar1, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveVoicePar1[i2] = new LiveVoicePartyMicSeatUserLevelUpEffects();
                   p0.readMessage(liveVoicePar1[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveVoicePar1[i2] = new LiveVoicePartyMicSeatUserLevelUpEffects();
                p0.readMessage(liveVoicePar1[i2]);
                this.liveVoicePartyMicSeatUserLevelUpEffect = liveVoicePar1;
                break;
              case 474:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 474);
                tktvMusicOrd = this.liveAuthorReinforceInfo;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo[] sCLiveAuthor = new LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, sCLiveAuthor, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   sCLiveAuthor[i2] = new LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo();
                   p0.readMessage(sCLiveAuthor[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                sCLiveAuthor[i2] = new LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo();
                p0.readMessage(sCLiveAuthor[i2]);
                this.liveAuthorReinforceInfo = sCLiveAuthor;
                break;
              case 802:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 802);
                tktvMusicOrd = this.testFeed;
                i2 = (tktvMusicOrd == null)? 0: tktvMusicOrd.length;
                i = i + i2;
                TestActionSignalFeed[] testActionSi = new TestActionSignalFeed[i];
                if (i2) {
                   System.arraycopy(tktvMusicOrd, i1, testActionSi, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   testActionSi[i2] = new TestActionSignalFeed();
                   p0.readMessage(testActionSi[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                testActionSi[i2] = new TestActionSignalFeed();
                p0.readMessage(testActionSi[i2]);
                this.testFeed = testActionSi;
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       SCActionSignal tktvMusicOrd1;
       object oobject;
       SCActionSignal tktvMusicOrd = this.ktvMusicOrderFeed;
       int i = 0;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.ktvMusicOrderFeed;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.fansGroupJoinFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.fansGroupJoinFeed;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.topBannerNoticeFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.topBannerNoticeFeed;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.voicePartyToastFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.voicePartyToastFeed;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.livePetUpgradeFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.livePetUpgradeFeed;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.topDistrictRank;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.topDistrictRank;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveFollowGuide;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveFollowGuide;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.voicePartyEmojiFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.voicePartyEmojiFeed;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.shopAction;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.shopAction;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(9, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveUserClipLightGuide;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveUserClipLightGuide;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(11, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveGamePopupFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveGamePopupFeed;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(12, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.rainbowCommentFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.rainbowCommentFeed;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(13, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.commerceCommonFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.commerceCommonFeed;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(14, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.gzoneCommentLotteryFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.gzoneCommentLotteryFeed;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(15, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.gzoneLiveRedDotFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.gzoneLiveRedDotFeed;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(16, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.teamPkFightMotion;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.teamPkFightMotion;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(17, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.wealthHighGradeEnterRoom;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.wealthHighGradeEnterRoom;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(18, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.fansTopOrderHelpBuy;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.fansTopOrderHelpBuy;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(19, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.highGradeBulletComment;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.highGradeBulletComment;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(20, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.gzoneLiveBuffCardFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.gzoneLiveBuffCardFeed;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(21, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.activityPopup;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.activityPopup;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(22, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.valentineHighScoreEnterRoom;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.valentineHighScoreEnterRoom;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(23, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.livePkFirstBlood;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.livePkFirstBlood;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(24, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveDragonBoatEnterRoom;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveDragonBoatEnterRoom;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(25, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.redPackSendInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.redPackSendInfo;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(26, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.redPackGrabInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.redPackGrabInfo;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(27, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveActivityEnterRoomTip;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveActivityEnterRoomTip;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(28, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.pkGuideBubbleTip;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.pkGuideBubbleTip;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(29, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.activityPopUpInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.activityPopUpInfo;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(30, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.fansTopBoostFollowFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.fansTopBoostFollowFeed;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(31, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.effectInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.effectInfo;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(32, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveGuardNotice;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveGuardNotice;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(33, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.gzoneInteractiveCommentNotice;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.gzoneInteractiveCommentNotice;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(34, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.richTextFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.richTextFeed;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(35, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.gzoneAuthorTaskProgressNotice;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.gzoneAuthorTaskProgressNotice;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(36, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.gzoneAuthorCommonNotice;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.gzoneAuthorCommonNotice;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(37, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveMagicBoxOpenResultNotice;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveMagicBoxOpenResultNotice;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(38, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveCommonRoute;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveCommonRoute;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(39, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveWatchingListChangeNoticeFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveWatchingListChangeNoticeFeed;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(40, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.gzoneCommonFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.gzoneCommonFeed;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(41, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveCommonPopup;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveCommonPopup;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(42, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.commodityCardComponentChange;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.commodityCardComponentChange;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(43, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.commodityCardChange;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.commodityCardChange;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(44, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.textNotice;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.textNotice;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(45, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.shopLivePendant;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.shopLivePendant;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(46, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.marketingPushLiveAction;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.marketingPushLiveAction;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(47, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveRefreshAuthorStatusNotice;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveRefreshAuthorStatusNotice;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(48, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.shopLiveActivityPendant;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.shopLiveActivityPendant;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(49, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveBuyingNoticeSignal;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveBuyingNoticeSignal;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(50, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.pkBountyActivityResultInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.pkBountyActivityResultInfo;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(51, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.sendGiftNotifyAnimation;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.sendGiftNotifyAnimation;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(52, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.highFrequencyActionGuide;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.highFrequencyActionGuide;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(53, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveCommonEffectRouteInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveCommonEffectRouteInfo;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(54, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveAskOnItem;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveAskOnItem;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(55, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveMultiMagicEffectInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveMultiMagicEffectInfo;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(56, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveGuideFollowCardInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveGuideFollowCardInfo;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(57, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveVoicePartyMicSeatUserLevelUpEffect;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveVoicePartyMicSeatUserLevelUpEffect;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(58, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.liveAuthorReinforceInfo;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          i1 = 0;
          tktvMusicOrd1 = this.liveAuthorReinforceInfo;
          while (i1 < tktvMusicOrd1.length) {
             oobject = tktvMusicOrd1[i1];
             if (oobject != null) {
                p0.writeMessage(59, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tktvMusicOrd = this.testFeed;
       if (tktvMusicOrd != null && tktvMusicOrd.length > 0) {
          tktvMusicOrd = this.testFeed;
          while (i < tktvMusicOrd.length) {
             object oobject1 = tktvMusicOrd[i];
             if (oobject1 != null) {
                p0.writeMessage(100, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
