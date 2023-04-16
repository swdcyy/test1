package com.kuaishou.android.model.mix.StagFactorykscomponentsfeedmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.VisibleLevelInfo;
import com.kuaishou.android.model.mix.VisibleLevelInfo$TypeAdapter;
import com.kuaishou.android.model.mix.VideoMeta;
import com.kuaishou.android.model.mix.VideoMeta$TypeAdapter;
import com.kuaishou.android.model.mix.TubeMeta;
import com.kuaishou.android.model.mix.TubeMeta$TypeAdapter;
import com.kuaishou.android.model.mix.TagItem$InitiatorPhoto;
import com.kuaishou.android.model.mix.TagItem$InitiatorPhoto$TypeAdapter;
import com.kuaishou.android.model.mix.TagItem;
import com.kuaishou.android.model.mix.TagItem$TypeAdapter;
import com.kuaishou.android.model.mix.SurveyReason;
import com.kuaishou.android.model.mix.SurveyReason$TypeAdapter;
import com.kuaishou.android.model.mix.SurveyMeta;
import com.kuaishou.android.model.mix.SurveyMeta$TypeAdapter;
import com.kuaishou.android.model.mix.SummaryViewModel;
import com.kuaishou.android.model.mix.SummaryViewModel$TypeAdapter;
import com.kuaishou.android.model.mix.SortFeature;
import com.kuaishou.android.model.mix.SortFeature$TypeAdapter;
import com.kuaishou.android.model.mix.ShareToFollowModel;
import com.kuaishou.android.model.mix.ShareToFollowModel$TypeAdapter;
import com.kuaishou.android.model.mix.SearchSortFeature;
import com.kuaishou.android.model.mix.SearchSortFeature$TypeAdapter;
import com.kuaishou.android.model.mix.SameFrameModel;
import com.kuaishou.android.model.mix.SameFrameModel$TypeAdapter;
import com.kuaishou.android.model.mix.SameFrameInfo;
import com.kuaishou.android.model.mix.SameFrameInfo$TypeAdapter;
import com.kuaishou.android.model.mix.RecreationSettingInfo;
import com.kuaishou.android.model.mix.RecreationSettingInfo$TypeAdapter;
import com.kuaishou.android.model.mix.RankMeta;
import com.kuaishou.android.model.mix.RankMeta$TypeAdapter;
import com.kuaishou.android.model.mix.QuestionnaireInfo;
import com.kuaishou.android.model.mix.QuestionnaireInfo$TypeAdapter;
import com.kuaishou.android.model.mix.QRecoTag;
import com.kuaishou.android.model.mix.QRecoTag$TypeAdapter;
import com.kuaishou.android.model.mix.QComment$CommentMarqueeTag;
import com.kuaishou.android.model.mix.QComment$CommentMarqueeTag$TypeAdapter;
import com.kuaishou.android.model.mix.QComment$CommentBottomTag;
import com.kuaishou.android.model.mix.QComment$CommentBottomTag$TypeAdapter;
import com.kuaishou.android.model.mix.QComment$LabelExtraFansGroup;
import com.kuaishou.android.model.mix.QComment$LabelExtraFansGroup$TypeAdapter;
import com.kuaishou.android.model.mix.QComment$LabelExtra;
import com.kuaishou.android.model.mix.QComment$LabelExtra$TypeAdapter;
import com.kuaishou.android.model.mix.QComment$Label;
import com.kuaishou.android.model.mix.QComment$Label$TypeAdapter;
import com.kuaishou.android.model.mix.PostShowStartUpInfo;
import com.kuaishou.android.model.mix.PostShowStartUpInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PostOperationEntranceInfo;
import com.kuaishou.android.model.mix.PostOperationEntranceInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleItem;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleItem$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdData$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$DownloadInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$DownloadInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TrackInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TrackInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$Track;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$Track$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$BizData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$BizData$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoTextLocationInfo;
import com.kuaishou.android.model.mix.PhotoTextLocationInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoRelationEntrance$PhotoRelationEntranceExtParams;
import com.kuaishou.android.model.mix.PhotoRelationEntrance$PhotoRelationEntranceExtParams$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoRelationEntrance;
import com.kuaishou.android.model.mix.PhotoRelationEntrance$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoMetaExtra;
import com.kuaishou.android.model.mix.PhotoMetaExtra$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.PhotoMeta$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoLiveRemindInfo;
import com.kuaishou.android.model.mix.PhotoLiveRemindInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoKgTag;
import com.kuaishou.android.model.mix.PhotoKgTag$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoDisplayLocationInfo;
import com.kuaishou.android.model.mix.PhotoDisplayLocationInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCoverStyle;
import com.kuaishou.android.model.mix.PhotoCoverStyle$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCommonTagsStyleInfo;
import com.kuaishou.android.model.mix.PhotoCommonTagsStyleInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCommonTags;
import com.kuaishou.android.model.mix.PhotoCommonTags$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCommonTagInfo;
import com.kuaishou.android.model.mix.PhotoCommonTagInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCommonTagIconInfo;
import com.kuaishou.android.model.mix.PhotoCommonTagIconInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCommentVoteInfo;
import com.kuaishou.android.model.mix.PhotoCommentVoteInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCoinRewardModel;
import com.kuaishou.android.model.mix.PhotoCoinRewardModel$TypeAdapter;
import com.kuaishou.android.model.mix.OptionItem;
import com.kuaishou.android.model.mix.OptionItem$TypeAdapter;
import com.kuaishou.android.model.mix.OperationExpTagDisplayInfo;
import com.kuaishou.android.model.mix.OperationExpTagDisplayInfo$TypeAdapter;
import com.kuaishou.android.model.mix.MerchantComment$Card;
import com.kuaishou.android.model.mix.MerchantComment$Card$TypeAdapter;
import com.kuaishou.android.model.mix.MerchantComment;
import com.kuaishou.android.model.mix.MerchantComment$TypeAdapter;
import com.kuaishou.android.model.mix.MMUSimilarSearchInfo;
import com.kuaishou.android.model.mix.MMUSimilarSearchInfo$TypeAdapter;
import com.kuaishou.android.model.mix.LyricItemEntity;
import com.kuaishou.android.model.mix.LyricItemEntity$TypeAdapter;
import com.kuaishou.android.model.mix.LocationPermissionMeta;
import com.kuaishou.android.model.mix.LocationPermissionMeta$TypeAdapter;
import com.kuaishou.android.model.mix.LivePlaybackQualityPlayUrls;
import com.kuaishou.android.model.mix.LivePlaybackQualityPlayUrls$TypeAdapter;
import com.kuaishou.android.model.mix.LivePlaybackMeta;
import com.kuaishou.android.model.mix.LivePlaybackMeta$TypeAdapter;
import com.kuaishou.android.model.mix.LiveMerchantFeedData;
import com.kuaishou.android.model.mix.LiveMerchantFeedData$TypeAdapter;
import com.kuaishou.android.model.mix.LipsSyncModel;
import com.kuaishou.android.model.mix.LipsSyncModel$TypeAdapter;
import com.kuaishou.android.model.mix.KYInfo;
import com.kuaishou.android.model.mix.KYInfo$TypeAdapter;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo$ActionInfo;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo$ActionInfo$TypeAdapter;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo$TypeAdapter;
import com.kuaishou.android.model.mix.InterestAdjustSnackBarInfo;
import com.kuaishou.android.model.mix.InterestAdjustSnackBarInfo$TypeAdapter;
import com.kuaishou.android.model.mix.InteractStickerInfo;
import com.kuaishou.android.model.mix.InteractStickerInfo$TypeAdapter;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo$TypeAdapter;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize$TypeAdapter;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;
import com.kuaishou.android.model.mix.ImageMeta$Atlas$TypeAdapter;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture$TypeAdapter;
import com.kuaishou.android.model.mix.ImageMeta;
import com.kuaishou.android.model.mix.ImageMeta$TypeAdapter;
import com.kuaishou.android.model.mix.IMPhotoReplyConfigInfo;
import com.kuaishou.android.model.mix.IMPhotoReplyConfigInfo$TypeAdapter;
import com.kuaishou.android.model.mix.HyperTag$Icon;
import com.kuaishou.android.model.mix.HyperTag$Icon$TypeAdapter;
import com.kuaishou.android.model.mix.HyperTag;
import com.kuaishou.android.model.mix.HyperTag$TypeAdapter;
import com.kuaishou.android.model.mix.HotAreaInfo$Location;
import com.kuaishou.android.model.mix.HotAreaInfo$Location$TypeAdapter;
import com.kuaishou.android.model.mix.HotAreaInfo;
import com.kuaishou.android.model.mix.HotAreaInfo$TypeAdapter;
import com.kuaishou.android.model.mix.HorizontalHolidayEggsResource;
import com.kuaishou.android.model.mix.HorizontalHolidayEggsResource$TypeAdapter;
import com.kuaishou.android.model.mix.HighLightStartEndTime;
import com.kuaishou.android.model.mix.HighLightStartEndTime$TypeAdapter;
import com.kuaishou.android.model.mix.FusionPlayInfo;
import com.kuaishou.android.model.mix.FusionPlayInfo$TypeAdapter;
import com.kuaishou.android.model.mix.FusionInfo;
import com.kuaishou.android.model.mix.FusionInfo$TypeAdapter;
import com.kuaishou.android.model.mix.FollowShootModel;
import com.kuaishou.android.model.mix.FollowShootModel$TypeAdapter;
import com.kuaishou.android.model.mix.FlashPhotoTemplate;
import com.kuaishou.android.model.mix.FlashPhotoTemplate$TypeAdapter;
import com.kuaishou.android.model.mix.FeedSwitchesInfo;
import com.kuaishou.android.model.mix.FeedSwitchesInfo$TypeAdapter;
import com.kuaishou.android.model.mix.FeedFriendInfo;
import com.kuaishou.android.model.mix.FeedFriendInfo$TypeAdapter;
import com.kuaishou.android.model.mix.FeedFriendEntranceInfo;
import com.kuaishou.android.model.mix.FeedFriendEntranceInfo$TypeAdapter;
import com.kuaishou.android.model.mix.FeedBackInterestManagementEntrance;
import com.kuaishou.android.model.mix.FeedBackInterestManagementEntrance$TypeAdapter;
import com.kuaishou.android.model.mix.FashionShowInfo;
import com.kuaishou.android.model.mix.FashionShowInfo$TypeAdapter;
import com.kuaishou.android.model.mix.FansTopDisplayStyle$FansTopRecommendUsers;
import com.kuaishou.android.model.mix.FansTopDisplayStyle$FansTopRecommendUsers$TypeAdapter;
import com.kuaishou.android.model.mix.FansTopDisplayStyle$FansTopExtData;
import com.kuaishou.android.model.mix.FansTopDisplayStyle$FansTopExtData$TypeAdapter;
import com.kuaishou.android.model.mix.FansTopDisplayStyle;
import com.kuaishou.android.model.mix.FansTopDisplayStyle$TypeAdapter;
import com.kuaishou.android.model.mix.ExtMeta;
import com.kuaishou.android.model.mix.ExtMeta$TypeAdapter;
import com.kuaishou.android.model.mix.ExtEntryModel;
import com.kuaishou.android.model.mix.ExtEntryModel$TypeAdapter;
import com.kuaishou.android.model.mix.DetailStrongButtonConfig;
import com.kuaishou.android.model.mix.DetailStrongButtonConfig$TypeAdapter;
import com.kuaishou.android.model.mix.CoverSize;
import com.kuaishou.android.model.mix.CoverSize$TypeAdapter;
import com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow;
import com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow$TypeAdapter;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverMeta$TypeAdapter;
import com.kuaishou.android.model.mix.CoverImageType;
import com.kuaishou.android.model.mix.CoverImageType$TypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import com.kuaishou.android.model.mix.CoverCommonTagsModel$TypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LeftIconWh;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LeftIconWh$TypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$FootExtraText;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$FootExtraText$TypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$HeadUrlModel;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$HeadUrlModel$TypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LabelModeStyle;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$RightSideExtraText;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$RightSideExtraText$TypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$TypeAdapter;
import com.kuaishou.android.model.mix.CoronaLiveMeta;
import com.kuaishou.android.model.mix.CoronaLiveMeta$TypeAdapter;
import com.kuaishou.android.model.mix.CoronaInfo;
import com.kuaishou.android.model.mix.CoronaInfo$TypeAdapter;
import com.kuaishou.android.model.mix.CoronaFilmAdInfo;
import com.kuaishou.android.model.mix.CoronaFilmAdInfo$TypeAdapter;
import com.kuaishou.android.model.mix.CoronaFeedVipInfo;
import com.kuaishou.android.model.mix.CoronaFeedVipInfo$TypeAdapter;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$TypeAdapter;
import com.kuaishou.android.model.mix.CommentAuthorPendantInfo;
import com.kuaishou.android.model.mix.CommentAuthorPendantInfo$TypeAdapter;
import com.kuaishou.android.model.mix.ColumnMeta;
import com.kuaishou.android.model.mix.ColumnMeta$TypeAdapter;
import com.kuaishou.android.model.mix.CollectRevisitGuidance;
import com.kuaishou.android.model.mix.CollectRevisitGuidance$TypeAdapter;
import com.kuaishou.android.model.mix.CollectPopup;
import com.kuaishou.android.model.mix.CollectPopup$TypeAdapter;
import com.kuaishou.android.model.mix.CollectGuideInfo;
import com.kuaishou.android.model.mix.CollectGuideInfo$TypeAdapter;
import com.kuaishou.android.model.mix.CollectFeedInfo;
import com.kuaishou.android.model.mix.CollectFeedInfo$TypeAdapter;
import com.kuaishou.android.model.mix.CashTag$Icon;
import com.kuaishou.android.model.mix.CashTag$Icon$TypeAdapter;
import com.kuaishou.android.model.mix.CashTag;
import com.kuaishou.android.model.mix.CashTag$TypeAdapter;
import com.kuaishou.android.model.mix.AtUserItem;
import com.kuaishou.android.model.mix.AtUserItem$TypeAdapter;
import com.kuaishou.android.model.mix.AnalysisEntranceModel;
import com.kuaishou.android.model.mix.AnalysisEntranceModel$TypeAdapter;
import com.kuaishou.android.model.mix.AggregateV6Model$TagContent;
import com.kuaishou.android.model.mix.AggregateV6Model$TagContent$TypeAdapter;
import com.kuaishou.android.model.mix.AggregateV6Model$Tag;
import com.kuaishou.android.model.mix.AggregateV6Model$Tag$TypeAdapter;
import com.kuaishou.android.model.mix.AggregateV6Model;
import com.kuaishou.android.model.mix.AggregateV6Model$TypeAdapter;
import com.kuaishou.android.model.mix.ActivityUserIconModel;
import com.kuaishou.android.model.mix.ActivityUserIconModel$TypeAdapter;
import com.kuaishou.android.model.mix.CoronaExpParams;
import com.kuaishou.android.model.mix.CoronaExpParams$TypeAdapter;
import com.kuaishou.android.model.mix.UrlInfo;
import com.kuaishou.android.model.mix.UrlInfo$TypeAdapter;
import com.kuaishou.android.model.mix.ImageContent;
import com.kuaishou.android.model.mix.ImageContent$TypeAdapter;
import com.kuaishou.android.model.mix.ImageLayoutInfo;
import com.kuaishou.android.model.mix.ImageLayoutInfo$TypeAdapter;
import com.kuaishou.android.model.mix.AttachmentInfo;
import com.kuaishou.android.model.mix.AttachmentInfo$TypeAdapter;

public final class StagFactorykscomponentsfeedmodel implements j	// class@000e00
{

    public void StagFactorykscomponentsfeedmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsfeedmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == VisibleLevelInfo.class) {
          return new VisibleLevelInfo$TypeAdapter(p0);
       }
       if (rawType == VideoMeta.class) {
          return new VideoMeta$TypeAdapter(p0);
       }
       if (rawType == TubeMeta.class) {
          return new TubeMeta$TypeAdapter(p0);
       }
       if (rawType == TagItem$InitiatorPhoto.class) {
          return new TagItem$InitiatorPhoto$TypeAdapter(p0);
       }
       if (rawType == TagItem.class) {
          return new TagItem$TypeAdapter(p0);
       }
       if (rawType == SurveyReason.class) {
          return new SurveyReason$TypeAdapter(p0);
       }
       if (rawType == SurveyMeta.class) {
          return new SurveyMeta$TypeAdapter(p0);
       }
       if (rawType == SummaryViewModel.class) {
          return new SummaryViewModel$TypeAdapter(p0);
       }
       if (rawType == SortFeature.class) {
          return new SortFeature$TypeAdapter(p0);
       }
       if (rawType == ShareToFollowModel.class) {
          return new ShareToFollowModel$TypeAdapter(p0);
       }
       if (rawType == SearchSortFeature.class) {
          return new SearchSortFeature$TypeAdapter(p0);
       }
       if (rawType == SameFrameModel.class) {
          return new SameFrameModel$TypeAdapter(p0);
       }
       if (rawType == SameFrameInfo.class) {
          return new SameFrameInfo$TypeAdapter(p0);
       }
       if (rawType == RecreationSettingInfo.class) {
          return new RecreationSettingInfo$TypeAdapter(p0);
       }
       if (rawType == RankMeta.class) {
          return new RankMeta$TypeAdapter(p0);
       }
       if (rawType == QuestionnaireInfo.class) {
          return new QuestionnaireInfo$TypeAdapter(p0);
       }
       if (rawType == QRecoTag.class) {
          return new QRecoTag$TypeAdapter(p0);
       }
       if (rawType == QComment$CommentMarqueeTag.class) {
          return new QComment$CommentMarqueeTag$TypeAdapter(p0);
       }
       if (rawType == QComment$CommentBottomTag.class) {
          return new QComment$CommentBottomTag$TypeAdapter(p0);
       }
       if (rawType == QComment$LabelExtraFansGroup.class) {
          return new QComment$LabelExtraFansGroup$TypeAdapter(p0);
       }
       if (rawType == QComment$LabelExtra.class) {
          return new QComment$LabelExtra$TypeAdapter(p0);
       }
       if (rawType == QComment$Label.class) {
          return new QComment$Label$TypeAdapter(p0);
       }
       if (rawType == PostShowStartUpInfo.class) {
          return new PostShowStartUpInfo$TypeAdapter(p0);
       }
       if (rawType == PostOperationEntranceInfo.class) {
          return new PostOperationEntranceInfo$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$StrongStyleItem.class) {
          return new PlcEntryStyleInfo$StrongStyleItem$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$AdData.class) {
          return new PlcEntryStyleInfo$AdData$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$DownloadInfo.class) {
          return new PlcEntryStyleInfo$DownloadInfo$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$TagPackage.class) {
          return new PlcEntryStyleInfo$TagPackage$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$TrackInfo.class) {
          return new PlcEntryStyleInfo$TrackInfo$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$Track.class) {
          return new PlcEntryStyleInfo$Track$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$AdEventTrackData.class) {
          return new PlcEntryStyleInfo$AdEventTrackData$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$EventTrackData.class) {
          return new PlcEntryStyleInfo$EventTrackData$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$ActionInfo.class) {
          return new PlcEntryStyleInfo$ActionInfo$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$TKBundleInfo.class) {
          return new PlcEntryStyleInfo$TKBundleInfo$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$WeakStyleInfo.class) {
          return new PlcEntryStyleInfo$WeakStyleInfo$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$CommentStyleInfo.class) {
          return new PlcEntryStyleInfo$CommentStyleInfo$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$CoverStyleInfo.class) {
          return new PlcEntryStyleInfo$CoverStyleInfo$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$LongVideoStyleInfo.class) {
          return new PlcEntryStyleInfo$LongVideoStyleInfo$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$StrongStyleInfo.class) {
          return new PlcEntryStyleInfo$StrongStyleInfo$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$StyleInfo.class) {
          return new PlcEntryStyleInfo$StyleInfo$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo$BizData.class) {
          return new PlcEntryStyleInfo$BizData$TypeAdapter(p0);
       }
       if (rawType == PlcEntryStyleInfo.class) {
          return new PlcEntryStyleInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoTextLocationInfo.class) {
          return new PhotoTextLocationInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoRelationEntrance$PhotoRelationEntranceExtParams.class) {
          return new PhotoRelationEntrance$PhotoRelationEntranceExtParams$TypeAdapter(p0);
       }
       if (rawType == PhotoRelationEntrance.class) {
          return new PhotoRelationEntrance$TypeAdapter(p0);
       }
       if (rawType == PhotoMetaExtra.class) {
          return new PhotoMetaExtra$TypeAdapter(p0);
       }
       if (rawType == PhotoMeta.class) {
          return new PhotoMeta$TypeAdapter(p0);
       }
       if (rawType == PhotoLiveRemindInfo.class) {
          return new PhotoLiveRemindInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoKgTag.class) {
          return new PhotoKgTag$TypeAdapter(p0);
       }
       if (rawType == PhotoDisplayLocationInfo.class) {
          return new PhotoDisplayLocationInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoCoverStyle.class) {
          return new PhotoCoverStyle$TypeAdapter(p0);
       }
       if (rawType == PhotoCommonTagsStyleInfo.class) {
          return new PhotoCommonTagsStyleInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoCommonTags.class) {
          return new PhotoCommonTags$TypeAdapter(p0);
       }
       if (rawType == PhotoCommonTagInfo.class) {
          return new PhotoCommonTagInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoCommonTagIconInfo.class) {
          return new PhotoCommonTagIconInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoCommentVoteInfo.class) {
          return new PhotoCommentVoteInfo$TypeAdapter(p0);
       }
       if (rawType == PhotoCoinRewardModel.class) {
          return new PhotoCoinRewardModel$TypeAdapter(p0);
       }
       if (rawType == OptionItem.class) {
          return new OptionItem$TypeAdapter(p0);
       }
       if (rawType == OperationExpTagDisplayInfo.class) {
          return new OperationExpTagDisplayInfo$TypeAdapter(p0);
       }
       if (rawType == MerchantComment$Card.class) {
          return new MerchantComment$Card$TypeAdapter(p0);
       }
       if (rawType == MerchantComment.class) {
          return new MerchantComment$TypeAdapter(p0);
       }
       if (rawType == MMUSimilarSearchInfo.class) {
          return new MMUSimilarSearchInfo$TypeAdapter(p0);
       }
       if (rawType == LyricItemEntity.class) {
          return new LyricItemEntity$TypeAdapter(p0);
       }
       if (rawType == LocationPermissionMeta.class) {
          return new LocationPermissionMeta$TypeAdapter(p0);
       }
       if (rawType == LivePlaybackQualityPlayUrls.class) {
          return new LivePlaybackQualityPlayUrls$TypeAdapter(p0);
       }
       if (rawType == LivePlaybackMeta.class) {
          return new LivePlaybackMeta$TypeAdapter(p0);
       }
       if (rawType == LiveMerchantFeedData.class) {
          return new LiveMerchantFeedData$TypeAdapter(p0);
       }
       if (rawType == LipsSyncModel.class) {
          return new LipsSyncModel$TypeAdapter(p0);
       }
       if (rawType == KYInfo.class) {
          return new KYInfo$TypeAdapter(p0);
       }
       if (rawType == InterestManageSnackBarInfo$ActionInfo.class) {
          return new InterestManageSnackBarInfo$ActionInfo$TypeAdapter(p0);
       }
       if (rawType == InterestManageSnackBarInfo.class) {
          return new InterestManageSnackBarInfo$TypeAdapter(p0);
       }
       if (rawType == InterestAdjustSnackBarInfo.class) {
          return new InterestAdjustSnackBarInfo$TypeAdapter(p0);
       }
       if (rawType == InteractStickerInfo.class) {
          return new InteractStickerInfo$TypeAdapter(p0);
       }
       if (rawType == ImageMeta$CDNInfo.class) {
          return new ImageMeta$CDNInfo$TypeAdapter(p0);
       }
       if (rawType == ImageMeta$AtlasCoverSize.class) {
          return new ImageMeta$AtlasCoverSize$TypeAdapter(p0);
       }
       if (rawType == ImageMeta$Atlas.class) {
          return new ImageMeta$Atlas$TypeAdapter(p0);
       }
       if (rawType == ImageMeta$SinglePicture.class) {
          return new ImageMeta$SinglePicture$TypeAdapter(p0);
       }
       if (rawType == ImageMeta.class) {
          return new ImageMeta$TypeAdapter(p0);
       }
       if (rawType == IMPhotoReplyConfigInfo.class) {
          return new IMPhotoReplyConfigInfo$TypeAdapter(p0);
       }
       if (rawType == HyperTag$Icon.class) {
          return new HyperTag$Icon$TypeAdapter(p0);
       }
       if (rawType == HyperTag.class) {
          return new HyperTag$TypeAdapter(p0);
       }
       if (rawType == HotAreaInfo$Location.class) {
          return new HotAreaInfo$Location$TypeAdapter(p0);
       }
       if (rawType == HotAreaInfo.class) {
          return new HotAreaInfo$TypeAdapter(p0);
       }
       if (rawType == HorizontalHolidayEggsResource.class) {
          return new HorizontalHolidayEggsResource$TypeAdapter(p0);
       }
       if (rawType == HighLightStartEndTime.class) {
          return new HighLightStartEndTime$TypeAdapter(p0);
       }
       if (rawType == FusionPlayInfo.class) {
          return new FusionPlayInfo$TypeAdapter(p0);
       }
       if (rawType == FusionInfo.class) {
          return new FusionInfo$TypeAdapter(p0);
       }
       if (rawType == FollowShootModel.class) {
          return new FollowShootModel$TypeAdapter(p0);
       }
       if (rawType == FlashPhotoTemplate.class) {
          return new FlashPhotoTemplate$TypeAdapter(p0);
       }
       if (rawType == FeedSwitchesInfo.class) {
          return new FeedSwitchesInfo$TypeAdapter(p0);
       }
       if (rawType == FeedFriendInfo.class) {
          return new FeedFriendInfo$TypeAdapter(p0);
       }
       if (rawType == FeedFriendEntranceInfo.class) {
          return new FeedFriendEntranceInfo$TypeAdapter(p0);
       }
       if (rawType == FeedBackInterestManagementEntrance.class) {
          return new FeedBackInterestManagementEntrance$TypeAdapter(p0);
       }
       if (rawType == FashionShowInfo.class) {
          return new FashionShowInfo$TypeAdapter(p0);
       }
       if (rawType == FansTopDisplayStyle$FansTopRecommendUsers.class) {
          return new FansTopDisplayStyle$FansTopRecommendUsers$TypeAdapter(p0);
       }
       if (rawType == FansTopDisplayStyle$FansTopExtData.class) {
          return new FansTopDisplayStyle$FansTopExtData$TypeAdapter(p0);
       }
       if (rawType == FansTopDisplayStyle.class) {
          return new FansTopDisplayStyle$TypeAdapter(p0);
       }
       if (rawType == ExtMeta.class) {
          return new ExtMeta$TypeAdapter(p0);
       }
       if (rawType == ExtEntryModel.class) {
          return new ExtEntryModel$TypeAdapter(p0);
       }
       if (rawType == DetailStrongButtonConfig.class) {
          return new DetailStrongButtonConfig$TypeAdapter(p0);
       }
       if (rawType == CoverSize.class) {
          return new CoverSize$TypeAdapter(p0);
       }
       if (rawType == CoverPicRecommendedCropWindow.class) {
          return new CoverPicRecommendedCropWindow$TypeAdapter(p0);
       }
       if (rawType == CoverMeta.class) {
          return new CoverMeta$TypeAdapter(p0);
       }
       if (rawType == CoverImageType.class) {
          return new CoverImageType$TypeAdapter(p0);
       }
       if (rawType == CoverCommonTagsModel.class) {
          return new CoverCommonTagsModel$TypeAdapter(p0);
       }
       if (rawType == CoverCommonTagLabelModel$LeftIconWh.class) {
          return new CoverCommonTagLabelModel$LeftIconWh$TypeAdapter(p0);
       }
       if (rawType == CoverCommonTagLabelModel$FootExtraText.class) {
          return new CoverCommonTagLabelModel$FootExtraText$TypeAdapter(p0);
       }
       if (rawType == CoverCommonTagLabelModel$HeadUrlModel.class) {
          return new CoverCommonTagLabelModel$HeadUrlModel$TypeAdapter(p0);
       }
       if (rawType == CoverCommonTagLabelModel$LabelModeStyle.class) {
          return new CoverCommonTagLabelModel$LabelModeStyle$TypeAdapter(p0);
       }
       if (rawType == CoverCommonTagLabelModel$RightSideExtraText.class) {
          return new CoverCommonTagLabelModel$RightSideExtraText$TypeAdapter(p0);
       }
       if (rawType == CoverCommonTagLabelModel.class) {
          return new CoverCommonTagLabelModel$TypeAdapter(p0);
       }
       if (rawType == CoronaLiveMeta.class) {
          return new CoronaLiveMeta$TypeAdapter(p0);
       }
       if (rawType == CoronaInfo.class) {
          return new CoronaInfo$TypeAdapter(p0);
       }
       if (rawType == CoronaFilmAdInfo.class) {
          return new CoronaFilmAdInfo$TypeAdapter(p0);
       }
       if (rawType == CoronaFeedVipInfo.class) {
          return new CoronaFeedVipInfo$TypeAdapter(p0);
       }
       if (rawType == CommonMeta.class) {
          return new CommonMeta$TypeAdapter(p0);
       }
       if (rawType == CommentAuthorPendantInfo.class) {
          return new CommentAuthorPendantInfo$TypeAdapter(p0);
       }
       if (rawType == ColumnMeta.class) {
          return new ColumnMeta$TypeAdapter(p0);
       }
       if (rawType == CollectRevisitGuidance.class) {
          return new CollectRevisitGuidance$TypeAdapter(p0);
       }
       if (rawType == CollectPopup.class) {
          return new CollectPopup$TypeAdapter(p0);
       }
       if (rawType == CollectGuideInfo.class) {
          return new CollectGuideInfo$TypeAdapter(p0);
       }
       if (rawType == CollectFeedInfo.class) {
          return new CollectFeedInfo$TypeAdapter(p0);
       }
       if (rawType == CashTag$Icon.class) {
          return new CashTag$Icon$TypeAdapter(p0);
       }
       if (rawType == CashTag.class) {
          return new CashTag$TypeAdapter(p0);
       }
       if (rawType == AtUserItem.class) {
          return new AtUserItem$TypeAdapter(p0);
       }
       if (rawType == AnalysisEntranceModel.class) {
          return new AnalysisEntranceModel$TypeAdapter(p0);
       }
       if (rawType == AggregateV6Model$TagContent.class) {
          return new AggregateV6Model$TagContent$TypeAdapter(p0);
       }
       if (rawType == AggregateV6Model$Tag.class) {
          return new AggregateV6Model$Tag$TypeAdapter(p0);
       }
       if (rawType == AggregateV6Model.class) {
          return new AggregateV6Model$TypeAdapter(p0);
       }
       if (rawType == ActivityUserIconModel.class) {
          return new ActivityUserIconModel$TypeAdapter(p0);
       }
       if (rawType == CoronaExpParams.class) {
          return new CoronaExpParams$TypeAdapter(p0);
       }
       if (rawType == UrlInfo.class) {
          return new UrlInfo$TypeAdapter(p0);
       }
       if (rawType == ImageContent.class) {
          return new ImageContent$TypeAdapter(p0);
       }
       if (rawType == ImageLayoutInfo.class) {
          return new ImageLayoutInfo$TypeAdapter(p0);
       }
       if (rawType == AttachmentInfo.class) {
          return new AttachmentInfo$TypeAdapter(p0);
       }
       return null;
    }
}
