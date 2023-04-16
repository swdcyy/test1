package com.kuaishou.android.model.ads.StagFactorykscomponentscommercialmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.ads.SplashInfo$CardInfo;
import com.kuaishou.android.model.ads.SplashInfo$CardInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$FloatingCardInfo;
import com.kuaishou.android.model.ads.SplashInfo$FloatingCardInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$AnimationInfo;
import com.kuaishou.android.model.ads.SplashInfo$AnimationInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$ShadowInfo;
import com.kuaishou.android.model.ads.SplashInfo$ShadowInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashPreloadInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashPreloadInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashActionBarInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashActionBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashSkipInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashSkipInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashLableInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashLableInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashLogoInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashLogoInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashButtonClickUrls;
import com.kuaishou.android.model.ads.SplashInfo$SplashButtonClickUrls$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$PlayablePopupInfo;
import com.kuaishou.android.model.ads.SplashInfo$PlayablePopupInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$PlayableLineInfo;
import com.kuaishou.android.model.ads.SplashInfo$PlayableLineInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$AxisDirection;
import com.kuaishou.android.model.ads.SplashInfo$AxisDirection$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SlideInfo;
import com.kuaishou.android.model.ads.SplashInfo$SlideInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$RotationInfo;
import com.kuaishou.android.model.ads.SplashInfo$RotationInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$ShakeInfo;
import com.kuaishou.android.model.ads.SplashInfo$ShakeInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$InteractionInfo;
import com.kuaishou.android.model.ads.SplashInfo$InteractionInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$ClickButtonInfo;
import com.kuaishou.android.model.ads.SplashInfo$ClickButtonInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$BubbleInfo;
import com.kuaishou.android.model.ads.SplashInfo$BubbleInfo$TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo;
import com.kuaishou.android.model.ads.SplashInfo$TypeAdapter;
import com.kuaishou.android.model.ads.RealtimeSplashResponse;
import com.kuaishou.android.model.ads.RealtimeSplashResponse$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CouponInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CouponInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WebViewNavigationBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WebViewNavigationBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopTag;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopTag$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopTagInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopTagInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayPauseInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayPauseInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TVCActionBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TVCActionBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TransitionInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TransitionInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TvcInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TvcInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo$CardStyleInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo$CardStyleInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DanmakuInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DanmakuInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$VideoClipInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$VideoClipInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WidgetInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WidgetInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPrivacyLink;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPrivacyLink$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyData$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CollapsedTextData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CollapsedTextData$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverItem;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverItem$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverData$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingHeaderLabel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingHeaderLabel$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingPageInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingPageInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBottomBanner;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBottomBanner$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShareInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShareInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AutoConversionInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AutoConversionInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentEmojiInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentEmojiInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RewardEndInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RewardEndInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FakeCommentInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FakeCommentInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JumpLiveInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickItem;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickItem$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrlGroup;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrlGroup$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Styles;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Styles$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCardTemplateInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCardTemplateInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InterceptInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InterceptInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBridgeInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBridgeInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdApkMd5Info;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdApkMd5Info$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppInfoLink;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppInfoLink$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyAppInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyAppInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyOption;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyOption$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DownloadInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DownloadInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWeakData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWeakData$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TryGameInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TryGameInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Layout;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Layout$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PendantInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PendantInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeReason;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeReason$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenu;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenu$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverStickerInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverStickerInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentActionBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentActionBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoronaBrandInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoronaBrandInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ConvertInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ConvertInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverPlayEndInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverPlayEndInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ClickAfterWords;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ClickAfterWords$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverActionBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverActionBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPageBannerInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPageBannerInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopActionbarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopActionbarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NovelCardInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NovelCardInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JointInstreamAdBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JointInstreamAdBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ProfileBottomBannerInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ProfileBottomBannerInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InstreamAdBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InstreamAdBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AxisDirection;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AxisDirection$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InteractionInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InteractionInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARWinInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARWinInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRules;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRules$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRuleInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRuleInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MixBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MixBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdSurveyInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdSurveyInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverUrl;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverUrl$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppDetailInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppDetailInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CaptionAdvertisementInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CaptionAdvertisementInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLink;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLink$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLinkConfig;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLinkConfig$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Product;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Product$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SmallShopConfig;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SmallShopConfig$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBrandInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBrandInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SecondNeoInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SecondNeoInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExitDialogInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExitDialogInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBigvLive;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBigvLive$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LiveGoodsInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LiveGoodsInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchExtraInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchExtraInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentTopBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentTopBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WeakStyle;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WeakStyle$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$StrongStyle;
import com.kuaishou.android.model.ads.PhotoAdvertisement$StrongStyle$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchSuspendedBallInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchSuspendedBallInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCacheStrategyInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCacheStrategyInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdRerankInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdRerankInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverSticker;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverSticker$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdLabelType;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdLabelType$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopDetailPageFlameType;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopDetailPageFlameType$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopFeedFlameType;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopFeedFlameType$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TrackStringAction;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TrackStringAction$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HintMapping;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HintMapping$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$UrlMapping;
import com.kuaishou.android.model.ads.PhotoAdvertisement$UrlMapping$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCover;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCover$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TypeAdapter;

public final class StagFactorykscomponentscommercialmodel implements j	// class@000ac5
{

    public void StagFactorykscomponentscommercialmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentscommercialmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == SplashInfo$CardInfo.class) {
          return new SplashInfo$CardInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$FloatingCardInfo.class) {
          return new SplashInfo$FloatingCardInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$AnimationInfo.class) {
          return new SplashInfo$AnimationInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$ShadowInfo.class) {
          return new SplashInfo$ShadowInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$SplashPreloadInfo.class) {
          return new SplashInfo$SplashPreloadInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$SplashActionBarInfo.class) {
          return new SplashInfo$SplashActionBarInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$SplashSkipInfo.class) {
          return new SplashInfo$SplashSkipInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$SplashLableInfo.class) {
          return new SplashInfo$SplashLableInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$SplashLogoInfo.class) {
          return new SplashInfo$SplashLogoInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$SplashButtonClickUrls.class) {
          return new SplashInfo$SplashButtonClickUrls$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$PlayablePopupInfo.class) {
          return new SplashInfo$PlayablePopupInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$PlayableLineInfo.class) {
          return new SplashInfo$PlayableLineInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$SplashPlayableInfo.class) {
          return new SplashInfo$SplashPlayableInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$AxisDirection.class) {
          return new SplashInfo$AxisDirection$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$SlideInfo.class) {
          return new SplashInfo$SlideInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$RotationInfo.class) {
          return new SplashInfo$RotationInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$ShakeInfo.class) {
          return new SplashInfo$ShakeInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$InteractionInfo.class) {
          return new SplashInfo$InteractionInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$ClickButtonInfo.class) {
          return new SplashInfo$ClickButtonInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$SplashLocalRecordInfo.class) {
          return new SplashInfo$SplashLocalRecordInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo$BubbleInfo.class) {
          return new SplashInfo$BubbleInfo$TypeAdapter(p0);
       }
       if (rawType == SplashInfo.class) {
          return new SplashInfo$TypeAdapter(p0);
       }
       if (rawType == RealtimeSplashResponse.class) {
          return new RealtimeSplashResponse$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$CouponInfo.class) {
          return new PhotoAdvertisement$CouponInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AppLinkToastInfo.class) {
          return new PhotoAdvertisement$AppLinkToastInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$WebViewNavigationBarInfo.class) {
          return new PhotoAdvertisement$WebViewNavigationBarInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$TopTag.class) {
          return new PhotoAdvertisement$TopTag$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$TopTagInfo.class) {
          return new PhotoAdvertisement$TopTagInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$PlayPauseInfo.class) {
          return new PhotoAdvertisement$PlayPauseInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$TVCActionBarInfo.class) {
          return new PhotoAdvertisement$TVCActionBarInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$TransitionInfo.class) {
          return new PhotoAdvertisement$TransitionInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$TvcInfo.class) {
          return new PhotoAdvertisement$TvcInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$RequestEApiInfo$CardStyleInfo.class) {
          return new PhotoAdvertisement$RequestEApiInfo$CardStyleInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$RequestEApiInfo.class) {
          return new PhotoAdvertisement$RequestEApiInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$DanmakuInfo.class) {
          return new PhotoAdvertisement$DanmakuInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$VideoClipInfo.class) {
          return new PhotoAdvertisement$VideoClipInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$WidgetInfo.class) {
          return new PhotoAdvertisement$WidgetInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$HalfPrivacyLink.class) {
          return new PhotoAdvertisement$HalfPrivacyLink$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$PrivacyData.class) {
          return new PhotoAdvertisement$PrivacyData$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$CollapsedTextData.class) {
          return new PhotoAdvertisement$CollapsedTextData$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$CoverItem.class) {
          return new PhotoAdvertisement$CoverItem$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$CoverData.class) {
          return new PhotoAdvertisement$CoverData$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$HalfLandingHeaderLabel.class) {
          return new PhotoAdvertisement$HalfLandingHeaderLabel$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$HeaderData.class) {
          return new PhotoAdvertisement$HeaderData$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$HalfLandingData.class) {
          return new PhotoAdvertisement$HalfLandingData$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$HalfLandingPageInfo.class) {
          return new PhotoAdvertisement$HalfLandingPageInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AdBottomBanner.class) {
          return new PhotoAdvertisement$AdBottomBanner$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$ShareInfo.class) {
          return new PhotoAdvertisement$ShareInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AutoConversionInfo.class) {
          return new PhotoAdvertisement$AutoConversionInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$CommentEmojiInfo.class) {
          return new PhotoAdvertisement$CommentEmojiInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$RewardEndInfo.class) {
          return new PhotoAdvertisement$RewardEndInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$FakeCommentInfo.class) {
          return new PhotoAdvertisement$FakeCommentInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$JumpLiveInfo.class) {
          return new PhotoAdvertisement$JumpLiveInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$ItemClickActionInfo.class) {
          return new PhotoAdvertisement$ItemClickActionInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$ItemClickUrl.class) {
          return new PhotoAdvertisement$ItemClickUrl$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$ItemClickItem.class) {
          return new PhotoAdvertisement$ItemClickItem$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$ItemClickUrlGroup.class) {
          return new PhotoAdvertisement$ItemClickUrlGroup$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$Styles.class) {
          return new PhotoAdvertisement$Styles$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AdCardTemplateInfo.class) {
          return new PhotoAdvertisement$AdCardTemplateInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$TkTemplateData.class) {
          return new PhotoAdvertisement$TkTemplateData$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$NeoReportInfo.class) {
          return new PhotoAdvertisement$NeoReportInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$InspireAction.class) {
          return new PhotoAdvertisement$InspireAction$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$InspireAdInfo.class) {
          return new PhotoAdvertisement$InspireAdInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$InterceptInfo.class) {
          return new PhotoAdvertisement$InterceptInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AdBridgeInfo.class) {
          return new PhotoAdvertisement$AdBridgeInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AdApkMd5Info.class) {
          return new PhotoAdvertisement$AdApkMd5Info$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$ExtraDisplayTag.class) {
          return new PhotoAdvertisement$ExtraDisplayTag$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$ExtraDisplayInfo.class) {
          return new PhotoAdvertisement$ExtraDisplayInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AppInfoLink.class) {
          return new PhotoAdvertisement$AppInfoLink$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$PrivacyAppInfo.class) {
          return new PhotoAdvertisement$PrivacyAppInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$PrivacyOption.class) {
          return new PhotoAdvertisement$PrivacyOption$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$H5ControlInfo.class) {
          return new PhotoAdvertisement$H5ControlInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$DownloadInfo.class) {
          return new PhotoAdvertisement$DownloadInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AdWeakData.class) {
          return new PhotoAdvertisement$AdWeakData$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$TryGameInfo.class) {
          return new PhotoAdvertisement$TryGameInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$Layout.class) {
          return new PhotoAdvertisement$Layout$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$PendantInfo.class) {
          return new PhotoAdvertisement$PendantInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo.class) {
          return new PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$MerchandiseInfo$DiscountInfo.class) {
          return new PhotoAdvertisement$MerchandiseInfo$DiscountInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$MerchandiseInfo.class) {
          return new PhotoAdvertisement$MerchandiseInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AdWebCardInfo.class) {
          return new PhotoAdvertisement$AdWebCardInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$TkTemplateInfo.class) {
          return new PhotoAdvertisement$TkTemplateInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$NegativeReason.class) {
          return new PhotoAdvertisement$NegativeReason$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$NegativeMenu.class) {
          return new PhotoAdvertisement$NegativeMenu$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$NegativeMenuInfo.class) {
          return new PhotoAdvertisement$NegativeMenuInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$CoverStickerInfo.class) {
          return new PhotoAdvertisement$CoverStickerInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$CommentActionBarInfo.class) {
          return new PhotoAdvertisement$CommentActionBarInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$CoronaBrandInfo.class) {
          return new PhotoAdvertisement$CoronaBrandInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$LandingPageInfo.class) {
          return new PhotoAdvertisement$LandingPageInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$ConvertInfo.class) {
          return new PhotoAdvertisement$ConvertInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$CoverPlayEndInfo.class) {
          return new PhotoAdvertisement$CoverPlayEndInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$ClickAfterWords.class) {
          return new PhotoAdvertisement$ClickAfterWords$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$CoverActionBarInfo.class) {
          return new PhotoAdvertisement$CoverActionBarInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$HalfPageBannerInfo.class) {
          return new PhotoAdvertisement$HalfPageBannerInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$TopActionbarInfo.class) {
          return new PhotoAdvertisement$TopActionbarInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$ActionbarInfo.class) {
          return new PhotoAdvertisement$ActionbarInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$NovelCardInfo.class) {
          return new PhotoAdvertisement$NovelCardInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$JointInstreamAdBarInfo.class) {
          return new PhotoAdvertisement$JointInstreamAdBarInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$ProfileBottomBannerInfo.class) {
          return new PhotoAdvertisement$ProfileBottomBannerInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$InstreamAdBarInfo.class) {
          return new PhotoAdvertisement$InstreamAdBarInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AxisDirection.class) {
          return new PhotoAdvertisement$AxisDirection$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$RotationInfo.class) {
          return new PhotoAdvertisement$RotationInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$ShakeInfo.class) {
          return new PhotoAdvertisement$ShakeInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$InteractionInfo.class) {
          return new PhotoAdvertisement$InteractionInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$PopPlayInfo.class) {
          return new PhotoAdvertisement$PopPlayInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$PopARWinInfo.class) {
          return new PhotoAdvertisement$PopARWinInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$PopARRules.class) {
          return new PhotoAdvertisement$PopARRules$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$PopARRuleInfo.class) {
          return new PhotoAdvertisement$PopARRuleInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$PopARInfo.class) {
          return new PhotoAdvertisement$PopARInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$PopShowVideoInfo.class) {
          return new PhotoAdvertisement$PopShowVideoInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$MixBarInfo.class) {
          return new PhotoAdvertisement$MixBarInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AdSurveyInfo.class) {
          return new PhotoAdvertisement$AdSurveyInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$PlayEndInfo.class) {
          return new PhotoAdvertisement$PlayEndInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$CoverUrl.class) {
          return new PhotoAdvertisement$CoverUrl$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$CoverMediaInfo.class) {
          return new PhotoAdvertisement$CoverMediaInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AppDetailInfo.class) {
          return new PhotoAdvertisement$AppDetailInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$CaptionAdvertisementInfo.class) {
          return new PhotoAdvertisement$CaptionAdvertisementInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$ChildLink.class) {
          return new PhotoAdvertisement$ChildLink$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$ChildLinkConfig.class) {
          return new PhotoAdvertisement$ChildLinkConfig$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$Product.class) {
          return new PhotoAdvertisement$Product$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$SmallShopConfig.class) {
          return new PhotoAdvertisement$SmallShopConfig$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$SearchBrandInfo.class) {
          return new PhotoAdvertisement$SearchBrandInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$SecondNeoInfo.class) {
          return new PhotoAdvertisement$SecondNeoInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$ExitDialogInfo.class) {
          return new PhotoAdvertisement$ExitDialogInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$SearchBigvLive.class) {
          return new PhotoAdvertisement$SearchBigvLive$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$LiveGoodsInfo.class) {
          return new PhotoAdvertisement$LiveGoodsInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$SearchExtraInfo.class) {
          return new PhotoAdvertisement$SearchExtraInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$CommentTopBarInfo.class) {
          return new PhotoAdvertisement$CommentTopBarInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$WeakStyle.class) {
          return new PhotoAdvertisement$WeakStyle$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$StrongStyle.class) {
          return new PhotoAdvertisement$StrongStyle$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$SearchSuspendedBallInfo.class) {
          return new PhotoAdvertisement$SearchSuspendedBallInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AdData.class) {
          return new PhotoAdvertisement$AdData$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AdCacheStrategyInfo.class) {
          return new PhotoAdvertisement$AdCacheStrategyInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AdRerankInfo.class) {
          return new PhotoAdvertisement$AdRerankInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$CoverSticker.class) {
          return new PhotoAdvertisement$CoverSticker$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AdLabelType.class) {
          return new PhotoAdvertisement$AdLabelType$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$FansTopDetailPageFlameType.class) {
          return new PhotoAdvertisement$FansTopDetailPageFlameType$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$FansTopFeedFlameType.class) {
          return new PhotoAdvertisement$FansTopFeedFlameType$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$TrackStringAction.class) {
          return new PhotoAdvertisement$TrackStringAction$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$FanstopLiveInfo.class) {
          return new PhotoAdvertisement$FanstopLiveInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$Track.class) {
          return new PhotoAdvertisement$Track$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$HintMapping.class) {
          return new PhotoAdvertisement$HintMapping$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$UrlMapping.class) {
          return new PhotoAdvertisement$UrlMapping$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AdCover.class) {
          return new PhotoAdvertisement$AdCover$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement$AdGroup.class) {
          return new PhotoAdvertisement$AdGroup$TypeAdapter(p0);
       }
       if (rawType == PhotoAdvertisement.class) {
          return new PhotoAdvertisement$TypeAdapter(p0);
       }
       return null;
    }
}
