package com.kwai.component.photo.detail.core.log.PhotoDetailLoggerFieldProvider;
import vsd.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import nsd.m0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import java.lang.Object;
import wd5.c;
import com.kwai.component.photo.detail.core.log.NonnullFieldDelegate;
import java.lang.Long;
import wd5.b;
import msd.q;
import nsd.u;
import com.kwai.component.photo.detail.core.log.PhotoDetailLoggerFieldProvider$leaveTime$2;
import java.lang.Integer;
import java.lang.Boolean;
import k2b.i3;
import wd5.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.android.model.feed.SearchParams;

public final class PhotoDetailLoggerFieldProvider	// class@000a2a
{
    public final NonnullFieldDelegate afkTSS$delegate;
    public final NonnullFieldDelegate aiTextPanelStayTTS$delegate;
    public final NonnullFieldDelegate atlasCoverTTS$delegate;
    public final NonnullFieldDelegate atlasInnerDetailTTS$delegate;
    public final NonnullFieldDelegate atlasTotalCnt$delegate;
    public final NonnullFieldDelegate atlasViewAllCnt$delegate;
    public final NonnullFieldDelegate atlasViewDistinctCnt$delegate;
    public final h atlasViewIndexDistinctList$delegate;
    public final NonnullFieldDelegate autoRetryCnt$delegate;
    public final NonnullFieldDelegate backgroundPlayTTS$delegate;
    public final NonnullFieldDelegate bizParams$delegate;
    public final NonnullFieldDelegate blackMatrix$delegate;
    public final h boardPlatform$delegate;
    public final h bottombarType$delegate;
    public final NonnullFieldDelegate cleanScreenPlayCount$delegate;
    public final NonnullFieldDelegate cleanScreenPlayDuration$delegate;
    public final NonnullFieldDelegate cleanScreenPlayTss$delegate;
    public final NonnullFieldDelegate clickPauseCnt$delegate;
    public final NonnullFieldDelegate collectBeforeStatus$delegate;
    public final NonnullFieldDelegate commentEditorStayTTS$delegate;
    public final NonnullFieldDelegate commentMaximizeTTS$delegate;
    public final NonnullFieldDelegate commentStayTTS$delegate;
    public final h consumeIndex$delegate;
    public final NonnullFieldDelegate coronaBiFeedPlayTTS$delegate;
    public final NonnullFieldDelegate coronaDetailPlayedDuration$delegate;
    public final NonnullFieldDelegate coverAtlasViewCount$delegate;
    public final NonnullFieldDelegate coverAtlasViewDistinctCount$delegate;
    public final h coverViewIndexDistinctList$delegate;
    public final NonnullFieldDelegate cutShape$delegate;
    public final c dataSaver;
    public final NonnullFieldDelegate detailBrowseType$delegate;
    public final NonnullFieldDelegate enterAction$delegate;
    public final NonnullFieldDelegate enterElapsedRealtime$delegate;
    public final NonnullFieldDelegate enterLandScapeCount$delegate;
    public final NonnullFieldDelegate enterPlayerAction$delegate;
    public final NonnullFieldDelegate enterProfileFragmentTTS$delegate;
    public final NonnullFieldDelegate enterTime$delegate;
    public final NonnullFieldDelegate entryAuthorProfileCnt$delegate;
    public final NonnullFieldDelegate fingerLeaveDuration$delegate;
    public final NonnullFieldDelegate fingerLeaveToStartDuration$delegate;
    public final NonnullFieldDelegate followPlayedDuration$delegate;
    public final NonnullFieldDelegate followStatusBeforePlay$delegate;
    public final h fromH5Page$delegate;
    public final h fromUtmSource$delegate;
    public final NonnullFieldDelegate fullDuration$delegate;
    public final NonnullFieldDelegate fullScreenPhone$delegate;
    public final NonnullFieldDelegate fullscreenStayCount$delegate;
    public final h gzoneSourceUrl$delegate;
    public final NonnullFieldDelegate hasPlayCompleted$delegate;
    public final NonnullFieldDelegate hasReleasePlayerBackground$delegate;
    public final NonnullFieldDelegate hasUsedEarphone$delegate;
    public final NonnullFieldDelegate hiddenCommentCnt$delegate;
    public final NonnullFieldDelegate hiddenCommentStayTTS$delegate;
    public final h hitLadder$delegate;
    public final NonnullFieldDelegate immerseStyle$delegate;
    public final NonnullFieldDelegate isAtFriendInComment$delegate;
    public final NonnullFieldDelegate isAutoPlay$delegate;
    public final NonnullFieldDelegate isBackwardPlay$delegate;
    public final NonnullFieldDelegate isCleanScreen$delegate;
    public final NonnullFieldDelegate isClickAddBlacklist$delegate;
    public final NonnullFieldDelegate isClickDownloadPhoto$delegate;
    public final NonnullFieldDelegate isClickNegativePhoto$delegate;
    public final NonnullFieldDelegate isClickTakeSameFrame$delegate;
    public final NonnullFieldDelegate isClickTakeSameStyle$delegate;
    public final NonnullFieldDelegate isCommented$delegate;
    public final NonnullFieldDelegate isCopyComment$delegate;
    public final NonnullFieldDelegate isEnlargePlay$delegate;
    public final NonnullFieldDelegate isFastForwardPlay$delegate;
    public final NonnullFieldDelegate isFirstPlayVideo$delegate;
    public final NonnullFieldDelegate isHorizontalScreenPlay$delegate;
    public final NonnullFieldDelegate isProfileFeedOn$delegate;
    public final NonnullFieldDelegate isSlidePlay$delegate;
    public final NonnullFieldDelegate isStayCommentAreaEndPlay$delegate;
    public final NonnullFieldDelegate landScapeTss$delegate;
    public final NonnullFieldDelegate lastDuration$delegate;
    public final NonnullFieldDelegate leaveAction$delegate;
    public final NonnullFieldDelegate leaveElapsedRealtime$delegate;
    public final NonnullFieldDelegate leavePlayStatus$delegate;
    public final NonnullFieldDelegate leaveTime$delegate;
    public final NonnullFieldDelegate likeStatusBeforePlay$delegate;
    public final NonnullFieldDelegate liveSourceType$delegate;
    public final NonnullFieldDelegate manualPauseDuration$delegate;
    public final NonnullFieldDelegate mediaType$delegate;
    public final NonnullFieldDelegate netScore$delegate;
    public final NonnullFieldDelegate pageBackgroundTTS$delegate;
    public final h pageSessionId$delegate;
    public final NonnullFieldDelegate photoAbnormalReason$delegate;
    public final h photoConsumePage$delegate;
    public final h photoSearchParams$delegate;
    public final NonnullFieldDelegate playSoundVolume$delegate;
    public final NonnullFieldDelegate playVideoType$delegate;
    public final NonnullFieldDelegate playerActualPlayingTSS$delegate;
    public final NonnullFieldDelegate playerMiddlewareDuration$delegate;
    public final NonnullFieldDelegate playerOutOfSightByScrollTTS$delegate;
    public final NonnullFieldDelegate playerPauseTSS$delegate;
    public final NonnullFieldDelegate playerPrepareDuration$delegate;
    public final NonnullFieldDelegate playerSdkDuration$delegate;
    public final h playingStyle$delegate;
    public final h plcEntryStyleInfo$delegate;
    public final NonnullFieldDelegate poorNetSessionId$delegate;
    public final h qosInfo$delegate;
    public final NonnullFieldDelegate recommendCommentPanelStayTTS$delegate;
    public final h referUrlPackage$delegate;
    public final NonnullFieldDelegate refreshFirstPhoto$delegate;
    public final h screenScale$delegate;
    public final h searchParams$delegate;
    public final h searchSessionId$delegate;
    public final NonnullFieldDelegate simplifyScreenAtlasViewAllCnt$delegate;
    public final NonnullFieldDelegate simplifyScreenAtlasViewDistinctCnt$delegate;
    public final NonnullFieldDelegate slideAutoPlayForFeedbackSwitch$delegate;
    public final NonnullFieldDelegate specialLikeStatusBeforePlay$delegate;
    public final NonnullFieldDelegate stayLengthAtlas$delegate;
    public final NonnullFieldDelegate stayLengthCover$delegate;
    public final NonnullFieldDelegate subtitles$delegate;
    public final NonnullFieldDelegate tailoringResult$delegate;
    public final NonnullFieldDelegate takeUpTotally$delegate;
    public final NonnullFieldDelegate trailDuration$delegate;
    public final NonnullFieldDelegate videoStatUrlParamMap$delegate;
    public final NonnullFieldDelegate videoType$delegate;
    public final h wolverinePerformanceLevel$delegate;
    public static final n[] $$delegatedProperties;

    static {
       n[] onArray = new n[119];
       onArray[0] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "enterTime", "getEnterTime\(\)J", 0));
       onArray[1] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "leaveTime", "getLeaveTime\(\)J", 0));
       onArray[2] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "hiddenCommentCnt", "getHiddenCommentCnt\(\)I", 0));
       onArray[3] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "leaveAction", "getLeaveAction\(\)I", 0));
       onArray[4] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "enterAction", "getEnterAction\(\)I", 0));
       onArray[5] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "hasUsedEarphone", "getHasUsedEarphone\(\)Z", 0));
       onArray[6] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "leavePlayStatus", "getLeavePlayStatus\(\)I", 0));
       onArray[7] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "playSoundVolume", "getPlaySoundVolume\(\)I", 0));
       onArray[8] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "entryAuthorProfileCnt", "getEntryAuthorProfileCnt\(\)I", 0));
       onArray[9] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isHorizontalScreenPlay", "isHorizontalScreenPlay\(\)Z", 0));
       onArray[10] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isEnlargePlay", "isEnlargePlay\(\)Z", 0));
       onArray[11] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "clickPauseCnt", "getClickPauseCnt\(\)I", 0));
       onArray[12] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "autoRetryCnt", "getAutoRetryCnt\(\)I", 0));
       onArray[13] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "followStatusBeforePlay", "getFollowStatusBeforePlay\(\)Z", 0));
       onArray[14] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "specialLikeStatusBeforePlay", "getSpecialLikeStatusBeforePlay\(\)Z", 0));
       onArray[15] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "likeStatusBeforePlay", "getLikeStatusBeforePlay\(\)Z", 0));
       onArray[16] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isAtFriendInComment", "isAtFriendInComment\(\)Z", 0));
       onArray[17] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isCopyComment", "isCopyComment\(\)Z", 0));
       onArray[18] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isClickAddBlacklist", "isClickAddBlacklist\(\)Z", 0));
       onArray[19] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isClickNegativePhoto", "isClickNegativePhoto\(\)Z", 0));
       onArray[20] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isClickTakeSameFrame", "isClickTakeSameFrame\(\)Z", 0));
       onArray[21] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isClickTakeSameStyle", "isClickTakeSameStyle\(\)Z", 0));
       onArray[22] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isClickDownloadPhoto", "isClickDownloadPhoto\(\)Z", 0));
       onArray[23] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isStayCommentAreaEndPlay", "isStayCommentAreaEndPlay\(\)Z", 0));
       onArray[24] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isFastForwardPlay", "isFastForwardPlay\(\)Z", 0));
       onArray[25] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isBackwardPlay", "isBackwardPlay\(\)Z", 0));
       onArray[26] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "collectBeforeStatus", "getCollectBeforeStatus\(\)I", 0));
       onArray[27] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isCommented", "isCommented\(\)Z", 0));
       onArray[28] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "enterElapsedRealtime", "getEnterElapsedRealtime\(\)J", 0));
       onArray[29] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "leaveElapsedRealtime", "getLeaveElapsedRealtime\(\)J", 0));
       onArray[30] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "liveSourceType", "getLiveSourceType\(\)I", 0));
       onArray[31] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "playerOutOfSightByScrollTTS", "getPlayerOutOfSightByScrollTTS\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[32] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "commentStayTTS", "getCommentStayTTS\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[33] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "aiTextPanelStayTTS", "getAiTextPanelStayTTS\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[34] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "commentEditorStayTTS", "getCommentEditorStayTTS\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[35] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "recommendCommentPanelStayTTS", "getRecommendCommentPanelStayTTS\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[36] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "commentMaximizeTTS", "getCommentMaximizeTTS\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[37] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "hiddenCommentStayTTS", "getHiddenCommentStayTTS\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[38] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "pageBackgroundTTS", "getPageBackgroundTTS\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[39] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "enterProfileFragmentTTS", "getEnterProfileFragmentTTS\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[40] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "backgroundPlayTTS", "getBackgroundPlayTTS\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[41] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "atlasCoverTTS", "getAtlasCoverTTS\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[42] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "atlasInnerDetailTTS", "getAtlasInnerDetailTTS\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[43] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "landScapeTss", "getLandScapeTss\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[44] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "enterLandScapeCount", "getEnterLandScapeCount\(\)I", 0));
       onArray[45] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "cleanScreenPlayTss", "getCleanScreenPlayTss\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[46] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "searchParams", "getSearchParams\(\)Lcom/kuaishou/android/model/feed/SearchParams;", 0));
       onArray[47] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "playerActualPlayingTSS", "getPlayerActualPlayingTSS\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[48] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "playerPauseTSS", "getPlayerPauseTSS\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[49] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "wolverinePerformanceLevel", "getWolverinePerformanceLevel\(\)Ljava/lang/String;", 0));
       onArray[50] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "netScore", "getNetScore\(\)Ljava/util/List;", 0));
       onArray[51] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "poorNetSessionId", "getPoorNetSessionId\(\)Ljava/lang/String;", 0));
       onArray[52] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "slideAutoPlayForFeedbackSwitch", "getSlideAutoPlayForFeedbackSwitch\(\)Z", 0));
       onArray[53] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "photoAbnormalReason", "getPhotoAbnormalReason\(\)I", 0));
       onArray[54] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "pageSessionId", "getPageSessionId\(\)Ljava/lang/String;", 0));
       onArray[55] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "consumeIndex", "getConsumeIndex\(\)Ljava/lang/Integer;", 0));
       onArray[56] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "plcEntryStyleInfo", "getPlcEntryStyleInfo\(\)Lcom/kuaishou/android/model/mix/PlcEntryStyleInfo;", 0));
       onArray[57] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isCleanScreen", "isCleanScreen\(\)Z", 0));
       onArray[58] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "cleanScreenPlayCount", "getCleanScreenPlayCount\(\)I", 0));
       onArray[59] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "cleanScreenPlayDuration", "getCleanScreenPlayDuration\(\)J", 0));
       onArray[60] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isAutoPlay", "isAutoPlay\(\)Z", 0));
       onArray[61] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "photoConsumePage", "getPhotoConsumePage\(\)Ljava/lang/String;", 0));
       onArray[62] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isFirstPlayVideo", "isFirstPlayVideo\(\)Z", 0));
       onArray[63] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "hasPlayCompleted", "getHasPlayCompleted\(\)Z", 0));
       onArray[64] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "trailDuration", "getTrailDuration\(\)J", 0));
       onArray[65] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "lastDuration", "getLastDuration\(\)J", 0));
       onArray[66] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isSlidePlay", "isSlidePlay\(\)Z", 0));
       onArray[67] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "detailBrowseType", "getDetailBrowseType\(\)I", 0));
       onArray[68] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "isProfileFeedOn", "isProfileFeedOn\(\)Z", 0));
       onArray[69] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "fromH5Page", "getFromH5Page\(\)Ljava/lang/String;", 0));
       onArray[70] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "fromUtmSource", "getFromUtmSource\(\)Ljava/lang/String;", 0));
       onArray[71] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "gzoneSourceUrl", "getGzoneSourceUrl\(\)Ljava/lang/String;", 0));
       onArray[72] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "hasReleasePlayerBackground", "getHasReleasePlayerBackground\(\)Z", 0));
       onArray[73] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "tailoringResult", "getTailoringResult\(\)Z", 0));
       onArray[74] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "fullScreenPhone", "getFullScreenPhone\(\)Z", 0));
       onArray[75] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "blackMatrix", "getBlackMatrix\(\)I", 0));
       onArray[76] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "subtitles", "getSubtitles\(\)Z", 0));
       onArray[77] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "cutShape", "getCutShape\(\)Z", 0));
       onArray[78] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "takeUpTotally", "getTakeUpTotally\(\)Z", 0));
       onArray[79] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "immerseStyle", "getImmerseStyle\(\)Z", 0));
       onArray[80] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "screenScale", "getScreenScale\(\)Ljava/lang/String;", 0));
       onArray[81] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "bottombarType", "getBottombarType\(\)Ljava/lang/String;", 0));
       onArray[82] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "hitLadder", "getHitLadder\(\)Ljava/lang/String;", 0));
       onArray[83] = m0.r(new PropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "videoStatUrlParamMap", "getVideoStatUrlParamMap\(\)Ljava/util/Map;", 0));
       onArray[84] = m0.r(new PropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "bizParams", "getBizParams\(\)Ljava/util/Map;", 0));
       onArray[85] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "atlasTotalCnt", "getAtlasTotalCnt\(\)I", 0));
       onArray[86] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "atlasViewAllCnt", "getAtlasViewAllCnt\(\)I", 0));
       onArray[87] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "atlasViewDistinctCnt", "getAtlasViewDistinctCnt\(\)I", 0));
       onArray[88] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "simplifyScreenAtlasViewAllCnt", "getSimplifyScreenAtlasViewAllCnt\(\)I", 0));
       onArray[89] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "simplifyScreenAtlasViewDistinctCnt", "getSimplifyScreenAtlasViewDistinctCnt\(\)I", 0));
       onArray[90] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "stayLengthCover", "getStayLengthCover\(\)J", 0));
       onArray[91] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "coverAtlasViewDistinctCount", "getCoverAtlasViewDistinctCount\(\)I", 0));
       onArray[92] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "coverAtlasViewCount", "getCoverAtlasViewCount\(\)I", 0));
       onArray[93] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "stayLengthAtlas", "getStayLengthAtlas\(\)J", 0));
       onArray[94] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "coverViewIndexDistinctList", "getCoverViewIndexDistinctList\(\)Ljava/lang/String;", 0));
       onArray[95] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "atlasViewIndexDistinctList", "getAtlasViewIndexDistinctList\(\)Ljava/lang/String;", 0));
       onArray[96] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "coronaDetailPlayedDuration", "getCoronaDetailPlayedDuration\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[97] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "coronaBiFeedPlayTTS", "getCoronaBiFeedPlayTTS\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[98] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "followPlayedDuration", "getFollowPlayedDuration\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[99] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "manualPauseDuration", "getManualPauseDuration\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[100] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "fullDuration", "getFullDuration\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       onArray[101] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "referUrlPackage", "getReferUrlPackage\(\)Lcom/kuaishou/client/log/event/packages/nano/ClientEvent$UrlPackage;", 0));
       onArray[102] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "searchSessionId", "getSearchSessionId\(\)Ljava/lang/String;", 0));
       onArray[103] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "photoSearchParams", "getPhotoSearchParams\(\)Ljava/lang/String;", 0));
       onArray[104] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "boardPlatform", "getBoardPlatform\(\)Ljava/lang/String;", 0));
       onArray[105] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "playingStyle", "getPlayingStyle\(\)Ljava/lang/String;", 0));
       onArray[106] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "qosInfo", "getQosInfo\(\)Ljava/lang/String;", 0));
       onArray[107] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "videoType", "getVideoType\(\)I", 0));
       onArray[108] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "playVideoType", "getPlayVideoType\(\)I", 0));
       onArray[109] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "mediaType", "getMediaType\(\)I", 0));
       onArray[110] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "fullscreenStayCount", "getFullscreenStayCount\(\)I", 0));
       onArray[111] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "enterPlayerAction", "getEnterPlayerAction\(\)I", 0));
       onArray[112] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "fingerLeaveDuration", "getFingerLeaveDuration\(\)J", 0));
       onArray[113] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "playerPrepareDuration", "getPlayerPrepareDuration\(\)J", 0));
       onArray[114] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "playerMiddlewareDuration", "getPlayerMiddlewareDuration\(\)J", 0));
       onArray[115] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "playerSdkDuration", "getPlayerSdkDuration\(\)J", 0));
       onArray[116] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "fingerLeaveToStartDuration", "getFingerLeaveToStartDuration\(\)J", 0));
       onArray[117] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "refreshFirstPhoto", "getRefreshFirstPhoto\(\)Z", 0));
       onArray[118] = m0.j(new MutablePropertyReference1Impl(PhotoDetailLoggerFieldProvider.class, "afkTSS", "getAfkTSS\(\)Lcom/yxcorp/gifshow/log/TimeSliceSet;", 0));
       PhotoDetailLoggerFieldProvider.$$delegatedProperties = onArray;
    }
    public void PhotoDetailLoggerFieldProvider(){
       super();
       c uoc = new c();
       this.dataSaver = uoc;
       Long longx = Long.valueOf(0);
       c uoc1 = uoc;
       Long longx1 = longx;
       NonnullFieldDelegate nonnullField = new NonnullFieldDelegate(uoc1, longx1, false, null, 12, null);
       this.enterTime$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, longx1, false, PhotoDetailLoggerFieldProvider$leaveTime$2.INSTANCE, 4, null);
       this.leaveTime$delegate = v8;
       Integer integer = Integer.valueOf(0);
       nonnullField = new NonnullFieldDelegate(uoc1, integer, false, null, 12, null);
       this.hiddenCommentCnt$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, Integer.valueOf(4), false, null, 12, null);
       this.leaveAction$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, Integer.valueOf(1), false, null, 12, null);
       this.enterAction$delegate = v8;
       Boolean fALSE = Boolean.FALSE;
       nonnullField = new NonnullFieldDelegate(uoc1, fALSE, false, null, 12, null);
       this.hasUsedEarphone$delegate = v8;
       Integer integer1 = integer;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, false, null, 12, null);
       this.leavePlayStatus$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, true, null, 8, null);
       this.playSoundVolume$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, false, null, 12, null);
       this.entryAuthorProfileCnt$delegate = v8;
       Boolean uBoolean = fALSE;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.isHorizontalScreenPlay$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.isEnlargePlay$delegate = v8;
       integer1 = integer;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, false, null, 12, null);
       this.clickPauseCnt$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, false, null, 12, null);
       this.autoRetryCnt$delegate = v8;
       uBoolean = fALSE;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.followStatusBeforePlay$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.specialLikeStatusBeforePlay$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.likeStatusBeforePlay$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.isAtFriendInComment$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.isCopyComment$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.isClickAddBlacklist$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.isClickNegativePhoto$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.isClickTakeSameFrame$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.isClickTakeSameStyle$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.isClickDownloadPhoto$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.isStayCommentAreaEndPlay$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.isFastForwardPlay$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.isBackwardPlay$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, integer, false, null, 12, null);
       this.collectBeforeStatus$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, fALSE, false, null, 12, null);
       this.isCommented$delegate = v8;
       longx1 = longx;
       nonnullField = new NonnullFieldDelegate(uoc1, longx1, false, null, 12, null);
       this.enterElapsedRealtime$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, longx1, false, null, 12, null);
       this.leaveElapsedRealtime$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, integer, false, null, 12, null);
       this.liveSourceType$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.playerOutOfSightByScrollTTS$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.commentStayTTS$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.aiTextPanelStayTTS$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.commentEditorStayTTS$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.recommendCommentPanelStayTTS$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.commentMaximizeTTS$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.hiddenCommentStayTTS$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.pageBackgroundTTS$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.enterProfileFragmentTTS$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.backgroundPlayTTS$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.atlasCoverTTS$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.atlasInnerDetailTTS$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.landScapeTss$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, integer, false, null, 12, null);
       this.enterLandScapeCount$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.cleanScreenPlayTss$delegate = v8;
       this.searchParams$delegate = new h(uoc, null, 2, null);
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.playerActualPlayingTSS$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.playerPauseTSS$delegate = v13;
       this.wolverinePerformanceLevel$delegate = new h(uoc, null, 2, null);
       List list = Collections.synchronizedList(new ArrayList());
       a.o(list, "Collections.synchronizedList\(ArrayList\(\)\)");
       nonnullField = new NonnullFieldDelegate(uoc1, list, false, null, 12, null);
       this.netScore$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, "null", false, null, 12, null);
       this.poorNetSessionId$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, fALSE, false, null, 12, null);
       this.slideAutoPlayForFeedbackSwitch$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, integer, false, null, 12, null);
       this.photoAbnormalReason$delegate = v13;
       this.pageSessionId$delegate = new h(uoc, null, 2, null);
       this.consumeIndex$delegate = new h(uoc, null, 2, null);
       this.plcEntryStyleInfo$delegate = new h(uoc, null);
       nonnullField = new NonnullFieldDelegate(uoc1, fALSE, false, null, 12, null);
       this.isCleanScreen$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, integer, false, null, 12, null);
       this.cleanScreenPlayCount$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, longx, false, null, 12, null);
       this.cleanScreenPlayDuration$delegate = v13;
       uBoolean = fALSE;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.isAutoPlay$delegate = v13;
       this.photoConsumePage$delegate = new h(uoc, null, 2, null);
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.isFirstPlayVideo$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.hasPlayCompleted$delegate = v13;
       longx1 = longx;
       nonnullField = new NonnullFieldDelegate(uoc1, longx1, false, null, 12, null);
       this.trailDuration$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, longx1, false, null, 12, null);
       this.lastDuration$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, fALSE, false, null, 12, null);
       this.isSlidePlay$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, integer, false, null, 12, null);
       this.detailBrowseType$delegate = v13;
       uBoolean = fALSE;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.isProfileFeedOn$delegate = v13;
       this.fromH5Page$delegate = new h(uoc, null, 2, null);
       this.fromUtmSource$delegate = new h(uoc, null, 2, null);
       this.gzoneSourceUrl$delegate = new h(uoc, null, 2, null);
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.hasReleasePlayerBackground$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.tailoringResult$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.fullScreenPhone$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, integer, false, null, 12, null);
       this.blackMatrix$delegate = v13;
       uBoolean = fALSE;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.subtitles$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.cutShape$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.takeUpTotally$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, uBoolean, false, null, 12, null);
       this.immerseStyle$delegate = v13;
       this.screenScale$delegate = new h(uoc, null, 2, null);
       this.bottombarType$delegate = new h(uoc, null, 2, null);
       this.hitLadder$delegate = new h(uoc, null, 2, null);
       nonnullField = new NonnullFieldDelegate(uoc1, new HashMap(), false, null, 12, null);
       this.videoStatUrlParamMap$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, new ConcurrentHashMap(), false, null, 12, null);
       this.bizParams$delegate = v13;
       integer1 = integer;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, false, null, 12, null);
       this.atlasTotalCnt$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, false, null, 12, null);
       this.atlasViewAllCnt$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, false, null, 12, null);
       this.atlasViewDistinctCnt$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, false, null, 12, null);
       this.simplifyScreenAtlasViewAllCnt$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, false, null, 12, null);
       this.simplifyScreenAtlasViewDistinctCnt$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, longx, false, null, 12, null);
       this.stayLengthCover$delegate = v13;
       integer1 = integer;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, false, null, 12, null);
       this.coverAtlasViewDistinctCount$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, false, null, 12, null);
       this.coverAtlasViewCount$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, longx, false, null, 12, null);
       this.stayLengthAtlas$delegate = v13;
       this.coverViewIndexDistinctList$delegate = new h(uoc, null, 2, null);
       this.atlasViewIndexDistinctList$delegate = new h(uoc, null, 2, null);
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.coronaDetailPlayedDuration$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.coronaBiFeedPlayTTS$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.followPlayedDuration$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.manualPauseDuration$delegate = v13;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.fullDuration$delegate = v13;
       this.referUrlPackage$delegate = new h(uoc, null, 2, null);
       this.searchSessionId$delegate = new h(uoc, null, 2, null);
       this.photoSearchParams$delegate = new h(uoc, null, 2, null);
       this.boardPlatform$delegate = new h(uoc, null, 2, null);
       this.playingStyle$delegate = new h(uoc, null, 2, null);
       this.qosInfo$delegate = new h(uoc, null, 2, null);
       integer1 = integer;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, false, null, 12, null);
       this.videoType$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, false, null, 12, null);
       this.playVideoType$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, false, null, 12, null);
       this.mediaType$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, false, null, 12, null);
       this.fullscreenStayCount$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, integer1, false, null, 12, null);
       this.enterPlayerAction$delegate = v8;
       longx1 = longx;
       nonnullField = new NonnullFieldDelegate(uoc1, longx1, false, null, 12, null);
       this.fingerLeaveDuration$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, longx1, false, null, 12, null);
       this.playerPrepareDuration$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, longx1, false, null, 12, null);
       this.playerMiddlewareDuration$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, longx1, false, null, 12, null);
       this.playerSdkDuration$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, longx1, false, null, 12, null);
       this.fingerLeaveToStartDuration$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, fALSE, false, null, 12, null);
       this.refreshFirstPhoto$delegate = v8;
       nonnullField = new NonnullFieldDelegate(uoc1, new i3(), false, null, 12, null);
       this.afkTSS$delegate = v8;
    }
    public final void bindDataSaver(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "1")) {
          return;
       }
       String str = "dataSaver";
       a.p(p0, str);
       PhotoDetailLoggerFieldProvider tdataSaver = this.dataSaver;
       Objects.requireNonNull(tdataSaver);
       if (!PatchProxy.applyVoidOneRefs(p0, tdataSaver, c.class, "4")) {
          a.p(p0, str);
          tdataSaver.b = p0;
          Iterator iterator = tdataSaver.a.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             c b = tdataSaver.b;
             if (b != null) {
                b.d(uEntry.getKey(), uEntry.getValue());
             }
          }
          tdataSaver.a.clear();
       }
       return;
    }
    public final i3 getAfkTSS(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "237");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.afkTSS$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[118]);
    }
    public final i3 getAiTextPanelStayTTS(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.aiTextPanelStayTTS$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[33]);
    }
    public final i3 getAtlasCoverTTS(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.atlasCoverTTS$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[41]);
    }
    public final i3 getAtlasInnerDetailTTS(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "87");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.atlasInnerDetailTTS$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[42]);
    }
    public final int getAtlasTotalCnt(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "171");
       if (obj == PatchProxyResult.class) {
          obj = this.atlasTotalCnt$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[85]);
       }
       return obj.intValue();
    }
    public final int getAtlasViewAllCnt(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "173");
       if (obj == PatchProxyResult.class) {
          obj = this.atlasViewAllCnt$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[86]);
       }
       return obj.intValue();
    }
    public final int getAtlasViewDistinctCnt(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "175");
       if (obj == PatchProxyResult.class) {
          obj = this.atlasViewDistinctCnt$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[87]);
       }
       return obj.intValue();
    }
    public final String getAtlasViewIndexDistinctList(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "191");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.atlasViewIndexDistinctList$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[95]);
    }
    public final int getAutoRetryCnt(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "27");
       if (obj == PatchProxyResult.class) {
          obj = this.autoRetryCnt$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[12]);
       }
       return obj.intValue();
    }
    public final i3 getBackgroundPlayTTS(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "83");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.backgroundPlayTTS$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[40]);
    }
    public final Map getBizParams(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "170");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.bizParams$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[84]);
    }
    public final int getBlackMatrix(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "153");
       if (obj == PatchProxyResult.class) {
          obj = this.blackMatrix$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[75]);
       }
       return obj.intValue();
    }
    public final String getBoardPlatform(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "209");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.boardPlatform$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[104]);
    }
    public final String getBottombarType(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "165");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.bottombarType$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[81]);
    }
    public final int getCleanScreenPlayCount(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "119");
       if (obj == PatchProxyResult.class) {
          obj = this.cleanScreenPlayCount$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[58]);
       }
       return obj.intValue();
    }
    public final long getCleanScreenPlayDuration(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "121");
       if (obj == PatchProxyResult.class) {
          obj = this.cleanScreenPlayDuration$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[59]);
       }
       return obj.longValue();
    }
    public final i3 getCleanScreenPlayTss(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "93");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.cleanScreenPlayTss$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[45]);
    }
    public final int getClickPauseCnt(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "25");
       if (obj == PatchProxyResult.class) {
          obj = this.clickPauseCnt$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[11]);
       }
       return obj.intValue();
    }
    public final int getCollectBeforeStatus(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "55");
       if (obj == PatchProxyResult.class) {
          obj = this.collectBeforeStatus$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[26]);
       }
       return obj.intValue();
    }
    public final i3 getCommentEditorStayTTS(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.commentEditorStayTTS$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[34]);
    }
    public final i3 getCommentMaximizeTTS(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.commentMaximizeTTS$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[36]);
    }
    public final i3 getCommentStayTTS(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.commentStayTTS$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[32]);
    }
    public final Integer getConsumeIndex(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "113");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.consumeIndex$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[55]);
    }
    public final i3 getCoronaBiFeedPlayTTS(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "195");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.coronaBiFeedPlayTTS$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[97]);
    }
    public final i3 getCoronaDetailPlayedDuration(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "193");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.coronaDetailPlayedDuration$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[96]);
    }
    public final int getCoverAtlasViewCount(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "185");
       if (obj == PatchProxyResult.class) {
          obj = this.coverAtlasViewCount$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[92]);
       }
       return obj.intValue();
    }
    public final int getCoverAtlasViewDistinctCount(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "183");
       if (obj == PatchProxyResult.class) {
          obj = this.coverAtlasViewDistinctCount$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[91]);
       }
       return obj.intValue();
    }
    public final String getCoverViewIndexDistinctList(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "189");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.coverViewIndexDistinctList$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[94]);
    }
    public final boolean getCutShape(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "157");
       if (obj == PatchProxyResult.class) {
          obj = this.cutShape$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[77]);
       }
       return obj.booleanValue();
    }
    public final int getDetailBrowseType(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "137");
       if (obj == PatchProxyResult.class) {
          obj = this.detailBrowseType$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[67]);
       }
       return obj.intValue();
    }
    public final int getEnterAction(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "11");
       if (obj == PatchProxyResult.class) {
          obj = this.enterAction$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[4]);
       }
       return obj.intValue();
    }
    public final long getEnterElapsedRealtime(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "59");
       if (obj == PatchProxyResult.class) {
          obj = this.enterElapsedRealtime$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[28]);
       }
       return obj.longValue();
    }
    public final int getEnterLandScapeCount(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "91");
       if (obj == PatchProxyResult.class) {
          obj = this.enterLandScapeCount$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[44]);
       }
       return obj.intValue();
    }
    public final int getEnterPlayerAction(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "223");
       if (obj == PatchProxyResult.class) {
          obj = this.enterPlayerAction$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[111]);
       }
       return obj.intValue();
    }
    public final i3 getEnterProfileFragmentTTS(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.enterProfileFragmentTTS$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[39]);
    }
    public final long getEnterTime(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = this.enterTime$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[0]);
       }
       return obj.longValue();
    }
    public final int getEntryAuthorProfileCnt(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "19");
       if (obj == PatchProxyResult.class) {
          obj = this.entryAuthorProfileCnt$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[8]);
       }
       return obj.intValue();
    }
    public final long getFingerLeaveDuration(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "225");
       if (obj == PatchProxyResult.class) {
          obj = this.fingerLeaveDuration$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[112]);
       }
       return obj.longValue();
    }
    public final long getFingerLeaveToStartDuration(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "233");
       if (obj == PatchProxyResult.class) {
          obj = this.fingerLeaveToStartDuration$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[116]);
       }
       return obj.longValue();
    }
    public final i3 getFollowPlayedDuration(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "197");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.followPlayedDuration$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[98]);
    }
    public final boolean getFollowStatusBeforePlay(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "29");
       if (obj == PatchProxyResult.class) {
          obj = this.followStatusBeforePlay$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[13]);
       }
       return obj.booleanValue();
    }
    public final String getFromH5Page(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "141");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.fromH5Page$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[69]);
    }
    public final String getFromUtmSource(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "143");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.fromUtmSource$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[70]);
    }
    public final i3 getFullDuration(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "201");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.fullDuration$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[100]);
    }
    public final boolean getFullScreenPhone(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "151");
       if (obj == PatchProxyResult.class) {
          obj = this.fullScreenPhone$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[74]);
       }
       return obj.booleanValue();
    }
    public final int getFullscreenStayCount(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "221");
       if (obj == PatchProxyResult.class) {
          obj = this.fullscreenStayCount$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[110]);
       }
       return obj.intValue();
    }
    public final String getGzoneSourceUrl(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "145");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.gzoneSourceUrl$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[71]);
    }
    public final boolean getHasPlayCompleted(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "129");
       if (obj == PatchProxyResult.class) {
          obj = this.hasPlayCompleted$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[63]);
       }
       return obj.booleanValue();
    }
    public final boolean getHasReleasePlayerBackground(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "147");
       if (obj == PatchProxyResult.class) {
          obj = this.hasReleasePlayerBackground$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[72]);
       }
       return obj.booleanValue();
    }
    public final boolean getHasUsedEarphone(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "13");
       if (obj == PatchProxyResult.class) {
          obj = this.hasUsedEarphone$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[5]);
       }
       return obj.booleanValue();
    }
    public final int getHiddenCommentCnt(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "7");
       if (obj == PatchProxyResult.class) {
          obj = this.hiddenCommentCnt$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[2]);
       }
       return obj.intValue();
    }
    public final i3 getHiddenCommentStayTTS(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.hiddenCommentStayTTS$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[37]);
    }
    public final String getHitLadder(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "167");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.hitLadder$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[82]);
    }
    public final boolean getImmerseStyle(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "161");
       if (obj == PatchProxyResult.class) {
          obj = this.immerseStyle$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[79]);
       }
       return obj.booleanValue();
    }
    public final i3 getLandScapeTss(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "89");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.landScapeTss$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[43]);
    }
    public final long getLastDuration(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "133");
       if (obj == PatchProxyResult.class) {
          obj = this.lastDuration$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[65]);
       }
       return obj.longValue();
    }
    public final int getLeaveAction(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "9");
       if (obj == PatchProxyResult.class) {
          obj = this.leaveAction$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[3]);
       }
       return obj.intValue();
    }
    public final long getLeaveElapsedRealtime(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "61");
       if (obj == PatchProxyResult.class) {
          obj = this.leaveElapsedRealtime$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[29]);
       }
       return obj.longValue();
    }
    public final int getLeavePlayStatus(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "15");
       if (obj == PatchProxyResult.class) {
          obj = this.leavePlayStatus$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[6]);
       }
       return obj.intValue();
    }
    public final long getLeaveTime(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = this.leaveTime$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[1]);
       }
       return obj.longValue();
    }
    public final boolean getLikeStatusBeforePlay(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "33");
       if (obj == PatchProxyResult.class) {
          obj = this.likeStatusBeforePlay$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[15]);
       }
       return obj.booleanValue();
    }
    public final int getLiveSourceType(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "63");
       if (obj == PatchProxyResult.class) {
          obj = this.liveSourceType$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[30]);
       }
       return obj.intValue();
    }
    public final i3 getManualPauseDuration(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "199");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.manualPauseDuration$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[99]);
    }
    public final int getMediaType(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "219");
       if (obj == PatchProxyResult.class) {
          obj = this.mediaType$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[109]);
       }
       return obj.intValue();
    }
    public final List getNetScore(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "103");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.netScore$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[50]);
    }
    public final i3 getPageBackgroundTTS(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "79");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.pageBackgroundTTS$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[38]);
    }
    public final String getPageSessionId(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "111");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.pageSessionId$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[54]);
    }
    public final int getPhotoAbnormalReason(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "109");
       if (obj == PatchProxyResult.class) {
          obj = this.photoAbnormalReason$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[53]);
       }
       return obj.intValue();
    }
    public final String getPhotoConsumePage(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "125");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.photoConsumePage$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[61]);
    }
    public final String getPhotoSearchParams(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "207");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.photoSearchParams$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[103]);
    }
    public final int getPlaySoundVolume(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "17");
       if (obj == PatchProxyResult.class) {
          obj = this.playSoundVolume$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[7]);
       }
       return obj.intValue();
    }
    public final int getPlayVideoType(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "217");
       if (obj == PatchProxyResult.class) {
          obj = this.playVideoType$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[108]);
       }
       return obj.intValue();
    }
    public final i3 getPlayerActualPlayingTSS(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "97");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.playerActualPlayingTSS$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[47]);
    }
    public final long getPlayerMiddlewareDuration(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "229");
       if (obj == PatchProxyResult.class) {
          obj = this.playerMiddlewareDuration$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[114]);
       }
       return obj.longValue();
    }
    public final i3 getPlayerOutOfSightByScrollTTS(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.playerOutOfSightByScrollTTS$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[31]);
    }
    public final i3 getPlayerPauseTSS(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "99");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.playerPauseTSS$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[48]);
    }
    public final long getPlayerPrepareDuration(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "227");
       if (obj == PatchProxyResult.class) {
          obj = this.playerPrepareDuration$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[113]);
       }
       return obj.longValue();
    }
    public final long getPlayerSdkDuration(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "231");
       if (obj == PatchProxyResult.class) {
          obj = this.playerSdkDuration$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[115]);
       }
       return obj.longValue();
    }
    public final String getPlayingStyle(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "211");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.playingStyle$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[105]);
    }
    public final PlcEntryStyleInfo getPlcEntryStyleInfo(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "115");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.plcEntryStyleInfo$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[56]);
    }
    public final String getPoorNetSessionId(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "105");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.poorNetSessionId$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[51]);
    }
    public final String getQosInfo(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "213");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.qosInfo$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[106]);
    }
    public final i3 getRecommendCommentPanelStayTTS(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.recommendCommentPanelStayTTS$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[35]);
    }
    public final ClientEvent$UrlPackage getReferUrlPackage(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "203");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.referUrlPackage$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[101]);
    }
    public final boolean getRefreshFirstPhoto(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "235");
       if (obj == PatchProxyResult.class) {
          obj = this.refreshFirstPhoto$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[117]);
       }
       return obj.booleanValue();
    }
    public final String getScreenScale(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "163");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.screenScale$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[80]);
    }
    public final SearchParams getSearchParams(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "95");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.searchParams$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[46]);
    }
    public final String getSearchSessionId(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "205");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.searchSessionId$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[102]);
    }
    public final int getSimplifyScreenAtlasViewAllCnt(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "177");
       if (obj == PatchProxyResult.class) {
          obj = this.simplifyScreenAtlasViewAllCnt$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[88]);
       }
       return obj.intValue();
    }
    public final int getSimplifyScreenAtlasViewDistinctCnt(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "179");
       if (obj == PatchProxyResult.class) {
          obj = this.simplifyScreenAtlasViewDistinctCnt$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[89]);
       }
       return obj.intValue();
    }
    public final boolean getSlideAutoPlayForFeedbackSwitch(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "107");
       if (obj == PatchProxyResult.class) {
          obj = this.slideAutoPlayForFeedbackSwitch$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[52]);
       }
       return obj.booleanValue();
    }
    public final boolean getSpecialLikeStatusBeforePlay(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "31");
       if (obj == PatchProxyResult.class) {
          obj = this.specialLikeStatusBeforePlay$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[14]);
       }
       return obj.booleanValue();
    }
    public final long getStayLengthAtlas(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "187");
       if (obj == PatchProxyResult.class) {
          obj = this.stayLengthAtlas$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[93]);
       }
       return obj.longValue();
    }
    public final long getStayLengthCover(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "181");
       if (obj == PatchProxyResult.class) {
          obj = this.stayLengthCover$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[90]);
       }
       return obj.longValue();
    }
    public final boolean getSubtitles(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "155");
       if (obj == PatchProxyResult.class) {
          obj = this.subtitles$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[76]);
       }
       return obj.booleanValue();
    }
    public final boolean getTailoringResult(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "149");
       if (obj == PatchProxyResult.class) {
          obj = this.tailoringResult$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[73]);
       }
       return obj.booleanValue();
    }
    public final boolean getTakeUpTotally(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "159");
       if (obj == PatchProxyResult.class) {
          obj = this.takeUpTotally$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[78]);
       }
       return obj.booleanValue();
    }
    public final long getTrailDuration(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "131");
       if (obj == PatchProxyResult.class) {
          obj = this.trailDuration$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[64]);
       }
       return obj.longValue();
    }
    public final Map getVideoStatUrlParamMap(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "169");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.videoStatUrlParamMap$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[83]);
    }
    public final int getVideoType(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "215");
       if (obj == PatchProxyResult.class) {
          obj = this.videoType$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[107]);
       }
       return obj.intValue();
    }
    public final String getWolverinePerformanceLevel(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "101");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.wolverinePerformanceLevel$delegate.a(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[49]);
    }
    public final boolean isAtFriendInComment(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "35");
       if (obj == PatchProxyResult.class) {
          obj = this.isAtFriendInComment$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[16]);
       }
       return obj.booleanValue();
    }
    public final boolean isAutoPlay(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "123");
       if (obj == PatchProxyResult.class) {
          obj = this.isAutoPlay$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[60]);
       }
       return obj.booleanValue();
    }
    public final boolean isBackwardPlay(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "53");
       if (obj == PatchProxyResult.class) {
          obj = this.isBackwardPlay$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[25]);
       }
       return obj.booleanValue();
    }
    public final boolean isCleanScreen(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "117");
       if (obj == PatchProxyResult.class) {
          obj = this.isCleanScreen$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[57]);
       }
       return obj.booleanValue();
    }
    public final boolean isClickAddBlacklist(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "39");
       if (obj == PatchProxyResult.class) {
          obj = this.isClickAddBlacklist$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[18]);
       }
       return obj.booleanValue();
    }
    public final boolean isClickDownloadPhoto(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "47");
       if (obj == PatchProxyResult.class) {
          obj = this.isClickDownloadPhoto$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[22]);
       }
       return obj.booleanValue();
    }
    public final boolean isClickNegativePhoto(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "41");
       if (obj == PatchProxyResult.class) {
          obj = this.isClickNegativePhoto$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[19]);
       }
       return obj.booleanValue();
    }
    public final boolean isClickTakeSameFrame(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "43");
       if (obj == PatchProxyResult.class) {
          obj = this.isClickTakeSameFrame$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[20]);
       }
       return obj.booleanValue();
    }
    public final boolean isClickTakeSameStyle(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "45");
       if (obj == PatchProxyResult.class) {
          obj = this.isClickTakeSameStyle$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[21]);
       }
       return obj.booleanValue();
    }
    public final boolean isCommented(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "57");
       if (obj == PatchProxyResult.class) {
          obj = this.isCommented$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[27]);
       }
       return obj.booleanValue();
    }
    public final boolean isCopyComment(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "37");
       if (obj == PatchProxyResult.class) {
          obj = this.isCopyComment$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[17]);
       }
       return obj.booleanValue();
    }
    public final boolean isDataSaverBound(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.dataSaver.b != null)? true: false;
       return b;
    }
    public final boolean isEnlargePlay(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "23");
       if (obj == PatchProxyResult.class) {
          obj = this.isEnlargePlay$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[10]);
       }
       return obj.booleanValue();
    }
    public final boolean isFastForwardPlay(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "51");
       if (obj == PatchProxyResult.class) {
          obj = this.isFastForwardPlay$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[24]);
       }
       return obj.booleanValue();
    }
    public final boolean isFirstPlayVideo(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "127");
       if (obj == PatchProxyResult.class) {
          obj = this.isFirstPlayVideo$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[62]);
       }
       return obj.booleanValue();
    }
    public final boolean isHorizontalScreenPlay(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "21");
       if (obj == PatchProxyResult.class) {
          obj = this.isHorizontalScreenPlay$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[9]);
       }
       return obj.booleanValue();
    }
    public final boolean isProfileFeedOn(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "139");
       if (obj == PatchProxyResult.class) {
          obj = this.isProfileFeedOn$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[68]);
       }
       return obj.booleanValue();
    }
    public final boolean isSlidePlay(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "135");
       if (obj == PatchProxyResult.class) {
          obj = this.isSlidePlay$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[66]);
       }
       return obj.booleanValue();
    }
    public final boolean isStayCommentAreaEndPlay(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailLoggerFieldProvider.class, "49");
       if (obj == PatchProxyResult.class) {
          obj = this.isStayCommentAreaEndPlay$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[23]);
       }
       return obj.booleanValue();
    }
    public final void setAfkTSS(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "238")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.afkTSS$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[118], p0);
       return;
    }
    public final void setAiTextPanelStayTTS(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "70")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.aiTextPanelStayTTS$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[33], p0);
       return;
    }
    public final void setAtFriendInComment(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "36")) {
          return;
       }
       this.isAtFriendInComment$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[16], Boolean.valueOf(p0));
       return;
    }
    public final void setAtlasCoverTTS(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "86")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.atlasCoverTTS$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[41], p0);
       return;
    }
    public final void setAtlasInnerDetailTTS(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "88")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.atlasInnerDetailTTS$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[42], p0);
       return;
    }
    public final void setAtlasTotalCnt(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "172")) {
          return;
       }
       this.atlasTotalCnt$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[85], Integer.valueOf(p0));
       return;
    }
    public final void setAtlasViewAllCnt(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "174")) {
          return;
       }
       this.atlasViewAllCnt$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[86], Integer.valueOf(p0));
       return;
    }
    public final void setAtlasViewDistinctCnt(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "176")) {
          return;
       }
       this.atlasViewDistinctCnt$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[87], Integer.valueOf(p0));
       return;
    }
    public final void setAtlasViewIndexDistinctList(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "192")) {
          return;
       }
       this.atlasViewIndexDistinctList$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[95], p0);
       return;
    }
    public final void setAutoPlay(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "124")) {
          return;
       }
       this.isAutoPlay$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[60], Boolean.valueOf(p0));
       return;
    }
    public final void setAutoRetryCnt(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "28")) {
          return;
       }
       this.autoRetryCnt$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[12], Integer.valueOf(p0));
       return;
    }
    public final void setBackgroundPlayTTS(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "84")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.backgroundPlayTTS$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[40], p0);
       return;
    }
    public final void setBackwardPlay(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "54")) {
          return;
       }
       this.isBackwardPlay$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[25], Boolean.valueOf(p0));
       return;
    }
    public final void setBlackMatrix(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "154")) {
          return;
       }
       this.blackMatrix$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[75], Integer.valueOf(p0));
       return;
    }
    public final void setBoardPlatform(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "210")) {
          return;
       }
       this.boardPlatform$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[104], p0);
       return;
    }
    public final void setBottombarType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "166")) {
          return;
       }
       this.bottombarType$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[81], p0);
       return;
    }
    public final void setCleanScreen(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "118")) {
          return;
       }
       this.isCleanScreen$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[57], Boolean.valueOf(p0));
       return;
    }
    public final void setCleanScreenPlayCount(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "120")) {
          return;
       }
       this.cleanScreenPlayCount$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[58], Integer.valueOf(p0));
       return;
    }
    public final void setCleanScreenPlayDuration(long p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, photoDetailL, "122")) {
          return;
       }
       this.cleanScreenPlayDuration$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[59], Long.valueOf(p0));
       return;
    }
    public final void setCleanScreenPlayTss(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "94")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.cleanScreenPlayTss$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[45], p0);
       return;
    }
    public final void setClickAddBlacklist(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "40")) {
          return;
       }
       this.isClickAddBlacklist$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[18], Boolean.valueOf(p0));
       return;
    }
    public final void setClickDownloadPhoto(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "48")) {
          return;
       }
       this.isClickDownloadPhoto$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[22], Boolean.valueOf(p0));
       return;
    }
    public final void setClickNegativePhoto(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "42")) {
          return;
       }
       this.isClickNegativePhoto$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[19], Boolean.valueOf(p0));
       return;
    }
    public final void setClickPauseCnt(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "26")) {
          return;
       }
       this.clickPauseCnt$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[11], Integer.valueOf(p0));
       return;
    }
    public final void setClickTakeSameFrame(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "44")) {
          return;
       }
       this.isClickTakeSameFrame$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[20], Boolean.valueOf(p0));
       return;
    }
    public final void setClickTakeSameStyle(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "46")) {
          return;
       }
       this.isClickTakeSameStyle$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[21], Boolean.valueOf(p0));
       return;
    }
    public final void setCollectBeforeStatus(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "56")) {
          return;
       }
       this.collectBeforeStatus$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[26], Integer.valueOf(p0));
       return;
    }
    public final void setCommentEditorStayTTS(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "72")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.commentEditorStayTTS$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[34], p0);
       return;
    }
    public final void setCommentMaximizeTTS(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "76")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.commentMaximizeTTS$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[36], p0);
       return;
    }
    public final void setCommentStayTTS(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "68")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.commentStayTTS$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[32], p0);
       return;
    }
    public final void setCommented(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "58")) {
          return;
       }
       this.isCommented$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[27], Boolean.valueOf(p0));
       return;
    }
    public final void setConsumeIndex(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "114")) {
          return;
       }
       this.consumeIndex$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[55], p0);
       return;
    }
    public final void setCopyComment(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "38")) {
          return;
       }
       this.isCopyComment$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[17], Boolean.valueOf(p0));
       return;
    }
    public final void setCoronaBiFeedPlayTTS(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "196")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.coronaBiFeedPlayTTS$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[97], p0);
       return;
    }
    public final void setCoronaDetailPlayedDuration(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "194")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.coronaDetailPlayedDuration$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[96], p0);
       return;
    }
    public final void setCoverAtlasViewCount(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "186")) {
          return;
       }
       this.coverAtlasViewCount$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[92], Integer.valueOf(p0));
       return;
    }
    public final void setCoverAtlasViewDistinctCount(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "184")) {
          return;
       }
       this.coverAtlasViewDistinctCount$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[91], Integer.valueOf(p0));
       return;
    }
    public final void setCoverViewIndexDistinctList(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "190")) {
          return;
       }
       this.coverViewIndexDistinctList$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[94], p0);
       return;
    }
    public final void setCutShape(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "158")) {
          return;
       }
       this.cutShape$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[77], Boolean.valueOf(p0));
       return;
    }
    public final void setDetailBrowseType(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "138")) {
          return;
       }
       this.detailBrowseType$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[67], Integer.valueOf(p0));
       return;
    }
    public final void setEnlargePlay(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "24")) {
          return;
       }
       this.isEnlargePlay$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[10], Boolean.valueOf(p0));
       return;
    }
    public final void setEnterAction(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "12")) {
          return;
       }
       this.enterAction$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[4], Integer.valueOf(p0));
       return;
    }
    public final void setEnterElapsedRealtime(long p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, photoDetailL, "60")) {
          return;
       }
       this.enterElapsedRealtime$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[28], Long.valueOf(p0));
       return;
    }
    public final void setEnterLandScapeCount(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "92")) {
          return;
       }
       this.enterLandScapeCount$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[44], Integer.valueOf(p0));
       return;
    }
    public final void setEnterPlayerAction(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "224")) {
          return;
       }
       this.enterPlayerAction$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[111], Integer.valueOf(p0));
       return;
    }
    public final void setEnterProfileFragmentTTS(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "82")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.enterProfileFragmentTTS$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[39], p0);
       return;
    }
    public final void setEnterTime(long p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, photoDetailL, "4")) {
          return;
       }
       this.enterTime$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[0], Long.valueOf(p0));
       return;
    }
    public final void setEntryAuthorProfileCnt(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "20")) {
          return;
       }
       this.entryAuthorProfileCnt$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[8], Integer.valueOf(p0));
       return;
    }
    public final void setFastForwardPlay(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "52")) {
          return;
       }
       this.isFastForwardPlay$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[24], Boolean.valueOf(p0));
       return;
    }
    public final void setFingerLeaveDuration(long p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, photoDetailL, "226")) {
          return;
       }
       this.fingerLeaveDuration$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[112], Long.valueOf(p0));
       return;
    }
    public final void setFingerLeaveToStartDuration(long p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, photoDetailL, "234")) {
          return;
       }
       this.fingerLeaveToStartDuration$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[116], Long.valueOf(p0));
       return;
    }
    public final void setFirstPlayVideo(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "128")) {
          return;
       }
       this.isFirstPlayVideo$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[62], Boolean.valueOf(p0));
       return;
    }
    public final void setFollowPlayedDuration(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "198")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.followPlayedDuration$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[98], p0);
       return;
    }
    public final void setFollowStatusBeforePlay(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "30")) {
          return;
       }
       this.followStatusBeforePlay$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[13], Boolean.valueOf(p0));
       return;
    }
    public final void setFromH5Page(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "142")) {
          return;
       }
       this.fromH5Page$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[69], p0);
       return;
    }
    public final void setFromUtmSource(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "144")) {
          return;
       }
       this.fromUtmSource$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[70], p0);
       return;
    }
    public final void setFullDuration(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "202")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.fullDuration$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[100], p0);
       return;
    }
    public final void setFullScreenPhone(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "152")) {
          return;
       }
       this.fullScreenPhone$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[74], Boolean.valueOf(p0));
       return;
    }
    public final void setFullscreenStayCount(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "222")) {
          return;
       }
       this.fullscreenStayCount$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[110], Integer.valueOf(p0));
       return;
    }
    public final void setGzoneSourceUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "146")) {
          return;
       }
       this.gzoneSourceUrl$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[71], p0);
       return;
    }
    public final void setHasPlayCompleted(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "130")) {
          return;
       }
       this.hasPlayCompleted$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[63], Boolean.valueOf(p0));
       return;
    }
    public final void setHasReleasePlayerBackground(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "148")) {
          return;
       }
       this.hasReleasePlayerBackground$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[72], Boolean.valueOf(p0));
       return;
    }
    public final void setHasUsedEarphone(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "14")) {
          return;
       }
       this.hasUsedEarphone$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[5], Boolean.valueOf(p0));
       return;
    }
    public final void setHiddenCommentCnt(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "8")) {
          return;
       }
       this.hiddenCommentCnt$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[2], Integer.valueOf(p0));
       return;
    }
    public final void setHiddenCommentStayTTS(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "78")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.hiddenCommentStayTTS$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[37], p0);
       return;
    }
    public final void setHitLadder(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "168")) {
          return;
       }
       this.hitLadder$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[82], p0);
       return;
    }
    public final void setHorizontalScreenPlay(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "22")) {
          return;
       }
       this.isHorizontalScreenPlay$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[9], Boolean.valueOf(p0));
       return;
    }
    public final void setImmerseStyle(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "162")) {
          return;
       }
       this.immerseStyle$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[79], Boolean.valueOf(p0));
       return;
    }
    public final void setLandScapeTss(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "90")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.landScapeTss$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[43], p0);
       return;
    }
    public final void setLastDuration(long p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, photoDetailL, "134")) {
          return;
       }
       this.lastDuration$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[65], Long.valueOf(p0));
       return;
    }
    public final void setLeaveAction(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "10")) {
          return;
       }
       this.leaveAction$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[3], Integer.valueOf(p0));
       return;
    }
    public final void setLeaveElapsedRealtime(long p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, photoDetailL, "62")) {
          return;
       }
       this.leaveElapsedRealtime$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[29], Long.valueOf(p0));
       return;
    }
    public final void setLeavePlayStatus(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "16")) {
          return;
       }
       this.leavePlayStatus$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[6], Integer.valueOf(p0));
       return;
    }
    public final void setLeaveTime(long p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, photoDetailL, "6")) {
          return;
       }
       this.leaveTime$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[1], Long.valueOf(p0));
       return;
    }
    public final void setLikeStatusBeforePlay(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "34")) {
          return;
       }
       this.likeStatusBeforePlay$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[15], Boolean.valueOf(p0));
       return;
    }
    public final void setLiveSourceType(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "64")) {
          return;
       }
       this.liveSourceType$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[30], Integer.valueOf(p0));
       return;
    }
    public final void setManualPauseDuration(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "200")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.manualPauseDuration$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[99], p0);
       return;
    }
    public final void setMediaType(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "220")) {
          return;
       }
       this.mediaType$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[109], Integer.valueOf(p0));
       return;
    }
    public final void setNetScore(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "104")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.netScore$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[50], p0);
       return;
    }
    public final void setPageBackgroundTTS(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "80")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.pageBackgroundTTS$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[38], p0);
       return;
    }
    public final void setPageSessionId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "112")) {
          return;
       }
       this.pageSessionId$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[54], p0);
       return;
    }
    public final void setPhotoAbnormalReason(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "110")) {
          return;
       }
       this.photoAbnormalReason$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[53], Integer.valueOf(p0));
       return;
    }
    public final void setPhotoConsumePage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "126")) {
          return;
       }
       this.photoConsumePage$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[61], p0);
       return;
    }
    public final void setPhotoSearchParams(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "208")) {
          return;
       }
       this.photoSearchParams$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[103], p0);
       return;
    }
    public final void setPlaySoundVolume(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "18")) {
          return;
       }
       this.playSoundVolume$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[7], Integer.valueOf(p0));
       return;
    }
    public final void setPlayVideoType(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "218")) {
          return;
       }
       this.playVideoType$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[108], Integer.valueOf(p0));
       return;
    }
    public final void setPlayerActualPlayingTSS(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "98")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.playerActualPlayingTSS$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[47], p0);
       return;
    }
    public final void setPlayerMiddlewareDuration(long p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, photoDetailL, "230")) {
          return;
       }
       this.playerMiddlewareDuration$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[114], Long.valueOf(p0));
       return;
    }
    public final void setPlayerOutOfSightByScrollTTS(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "66")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.playerOutOfSightByScrollTTS$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[31], p0);
       return;
    }
    public final void setPlayerPauseTSS(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "100")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.playerPauseTSS$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[48], p0);
       return;
    }
    public final void setPlayerPrepareDuration(long p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, photoDetailL, "228")) {
          return;
       }
       this.playerPrepareDuration$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[113], Long.valueOf(p0));
       return;
    }
    public final void setPlayerSdkDuration(long p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, photoDetailL, "232")) {
          return;
       }
       this.playerSdkDuration$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[115], Long.valueOf(p0));
       return;
    }
    public final void setPlayingStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "212")) {
          return;
       }
       this.playingStyle$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[105], p0);
       return;
    }
    public final void setPlcEntryStyleInfo(PlcEntryStyleInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "116")) {
          return;
       }
       this.plcEntryStyleInfo$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[56], p0);
       return;
    }
    public final void setPoorNetSessionId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "106")) {
          return;
       }
       this.poorNetSessionId$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[51], p0);
       return;
    }
    public final void setProfileFeedOn(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "140")) {
          return;
       }
       this.isProfileFeedOn$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[68], Boolean.valueOf(p0));
       return;
    }
    public final void setQosInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "214")) {
          return;
       }
       this.qosInfo$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[106], p0);
       return;
    }
    public final void setRecommendCommentPanelStayTTS(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "74")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.recommendCommentPanelStayTTS$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[35], p0);
       return;
    }
    public final void setReferUrlPackage(ClientEvent$UrlPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "204")) {
          return;
       }
       this.referUrlPackage$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[101], p0);
       return;
    }
    public final void setRefreshFirstPhoto(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "236")) {
          return;
       }
       this.refreshFirstPhoto$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[117], Boolean.valueOf(p0));
       return;
    }
    public final void setScreenScale(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "164")) {
          return;
       }
       this.screenScale$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[80], p0);
       return;
    }
    public final void setSearchParams(SearchParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "96")) {
          return;
       }
       this.searchParams$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[46], p0);
       return;
    }
    public final void setSearchSessionId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "206")) {
          return;
       }
       this.searchSessionId$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[102], p0);
       return;
    }
    public final void setSimplifyScreenAtlasViewAllCnt(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "178")) {
          return;
       }
       this.simplifyScreenAtlasViewAllCnt$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[88], Integer.valueOf(p0));
       return;
    }
    public final void setSimplifyScreenAtlasViewDistinctCnt(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "180")) {
          return;
       }
       this.simplifyScreenAtlasViewDistinctCnt$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[89], Integer.valueOf(p0));
       return;
    }
    public final void setSlideAutoPlayForFeedbackSwitch(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "108")) {
          return;
       }
       this.slideAutoPlayForFeedbackSwitch$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[52], Boolean.valueOf(p0));
       return;
    }
    public final void setSlidePlay(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "136")) {
          return;
       }
       this.isSlidePlay$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[66], Boolean.valueOf(p0));
       return;
    }
    public final void setSpecialLikeStatusBeforePlay(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "32")) {
          return;
       }
       this.specialLikeStatusBeforePlay$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[14], Boolean.valueOf(p0));
       return;
    }
    public final void setStayCommentAreaEndPlay(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "50")) {
          return;
       }
       this.isStayCommentAreaEndPlay$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[23], Boolean.valueOf(p0));
       return;
    }
    public final void setStayLengthAtlas(long p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, photoDetailL, "188")) {
          return;
       }
       this.stayLengthAtlas$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[93], Long.valueOf(p0));
       return;
    }
    public final void setStayLengthCover(long p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, photoDetailL, "182")) {
          return;
       }
       this.stayLengthCover$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[90], Long.valueOf(p0));
       return;
    }
    public final void setSubtitles(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "156")) {
          return;
       }
       this.subtitles$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[76], Boolean.valueOf(p0));
       return;
    }
    public final void setTailoringResult(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "150")) {
          return;
       }
       this.tailoringResult$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[73], Boolean.valueOf(p0));
       return;
    }
    public final void setTakeUpTotally(boolean p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoDetailL, "160")) {
          return;
       }
       this.takeUpTotally$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[78], Boolean.valueOf(p0));
       return;
    }
    public final void setTrailDuration(long p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, photoDetailL, "132")) {
          return;
       }
       this.trailDuration$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[64], Long.valueOf(p0));
       return;
    }
    public final void setVideoType(int p0){
       PhotoDetailLoggerFieldProvider photoDetailL = PhotoDetailLoggerFieldProvider.class;
       if (PatchProxy.isSupport(photoDetailL) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, photoDetailL, "216")) {
          return;
       }
       this.videoType$delegate.c(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[107], Integer.valueOf(p0));
       return;
    }
    public final void setWolverinePerformanceLevel(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoDetailLoggerFieldProvider.class, "102")) {
          return;
       }
       this.wolverinePerformanceLevel$delegate.b(this, PhotoDetailLoggerFieldProvider.$$delegatedProperties[49], p0);
       return;
    }
}
