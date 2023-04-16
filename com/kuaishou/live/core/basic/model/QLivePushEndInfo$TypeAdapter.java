package com.kuaishou.live.core.basic.model.QLivePushEndInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.live.ad.fanstop.LiveFansTopStopInfo;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo$LiveGzonePushEndEntryInfo;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo$LiveDistrictRankInfo;
import com.kuaishou.live.core.show.closepage.anchor.model.endSummary.LiveClosedSurveyInfo;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo$AuthorLabel;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo$PlaybackData;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo$LiveReservation;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo$HighlightData;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class QLivePushEndInfo$TypeAdapter extends TypeAdapter	// class@0008b8
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public final TypeAdapter h;
    public final TypeAdapter i;
    public final TypeAdapter j;
    public final TypeAdapter k;
    public static final a l;

    static {
       QLivePushEndInfo$TypeAdapter.l = a.get(QLivePushEndInfo.class);
    }
    public void QLivePushEndInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(LiveFansTopStopInfo.class));
       this.c = p0.j(a.get(QLivePushEndInfo$LiveGzonePushEndEntryInfo.class));
       this.d = p0.j(a.get(QLivePushEndInfo$LiveDistrictRankInfo.class));
       this.e = p0.j(a.get(LiveClosedSurveyInfo.class));
       TypeAdapter typeAdapter = p0.j(a.get(QLivePushEndInfo$AuthorLabel.class));
       this.f = typeAdapter;
       this.g = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.h = p0.j(a.get(QLivePushEndInfo$PlaybackData.class));
       this.i = p0.j(a.get(QLivePushEndInfo$LiveReservation.class));
       TypeAdapter typeAdapter1 = p0.j(a.get(QLivePushEndInfo$HighlightData.class));
       this.j = typeAdapter1;
       this.k = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, QLivePushEndInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new QLivePushEndInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x80aed2cb:
                      if (str.equals("totalWatchingDuration")) {
                         i = 0;
                      }
                      break;
                    case 0x82ea088b:
                      if (str.equals("displayLikeUserCount")) {
                         i = 1;
                      }
                      break;
                    case 0x872db47e:
                      if (str.equals("followText")) {
                         i = 2;
                      }
                      break;
                    case 0x8d5b88d3:
                      if (str.equals("liveStreamEndReason")) {
                         i = 3;
                      }
                      break;
                    case 0x92b5fd4c:
                      if (str.equals("displayCommodityOrderCount")) {
                         i = 4;
                      }
                      break;
                    case 0x9a5581b7:
                      if (str.equals("highlightViewList")) {
                         i = 5;
                      }
                      break;
                    case 0xa35f7cda:
                      if (str.equals("districtRank")) {
                         i = 6;
                      }
                      break;
                    case 0xcae3a75a:
                      if (str.equals("survey")) {
                         i = 7;
                      }
                      break;
                    case 0xd73141d3:
                      if (str.equals("displayMusicStationUserCount")) {
                         i = 8;
                      }
                      break;
                    case 0xe2776891:
                      if (str.equals("watchingUserCount")) {
                         i = 9;
                      }
                      break;
                    case 0xe8fef8de:
                      if (str.equals("receivedGiftCount")) {
                         i = 10;
                      }
                      break;
                    case 0xeb95be42:
                      if (str.equals("shareEnable")) {
                         i = 11;
                      }
                      break;
                    case 0xedd6262d:
                      if (str.equals("likeUserCount")) {
                         i = 12;
                      }
                      break;
                    case 0xf6b7b6a0:
                      if (str.equals("liveDuration")) {
                         i = 13;
                      }
                      break;
                    case 0xfd2caa2e:
                      if (str.equals("hasRemainingRedPack")) {
                         i = 14;
                      }
                      break;
                    case 0x447d96a:
                      if (str.equals("authorLabels")) {
                         i = 15;
                      }
                      break;
                    case 0x231a6f29:
                      if (str.equals("authorLEEENoticeText")) {
                         i = 16;
                      }
                      break;
                    case 0x2bf6ebef:
                      if (str.equals("displayWatchingUserCount")) {
                         i = 17;
                      }
                      break;
                    case 0x37519352:
                      if (str.equals("displayCommodityClickCount")) {
                         i = 18;
                      }
                      break;
                    case 0x40fbe80e:
                      if (str.equals("liveReservationInfo")) {
                         i = 19;
                      }
                      break;
                    case 0x50cbff60:
                      if (str.equals("playbackView")) {
                         i = 20;
                      }
                      break;
                    case 0x58db8e83:
                      if (str.equals("authorCategoryType")) {
                         i = 21;
                      }
                      break;
                    case 0x61fce8e8:
                      if (str.equals("redPackSentDou")) {
                         i = 22;
                      }
                      break;
                    case 0x66139428:
                      if (str.equals("enableShowUserOperationModule")) {
                         i = 23;
                      }
                      break;
                    case 0x7532dbdf:
                      if (str.equals("receivedXZuan")) {
                         i = 24;
                      }
                      break;
                    case 0x7540f360:
                      if (str.equals("receivedYZuan")) {
                         i = 25;
                      }
                      break;
                    case 0x78ba9ee9:
                      if (str.equals("liveFansTop")) {
                         i = 26;
                      }
                      break;
                    case 0x7a0b510a:
                      if (str.equals("gzoneSectionEntranceConfig")) {
                         i = 27;
                      }
                      break;
                    case 0x7fa2a43b:
                      if (str.equals("displayTotalStartPlayCount")) {
                         i = 28;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mTotalWatchingDuration = KnownTypeAdapters$n.a(p0, obj.mTotalWatchingDuration);
                      break;
                    case 1:
                      obj.mDisplayLikeUserCount = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mFollowText = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mLiveStreamEndReason = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mCommodityOrderCount = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mHighlightData = this.k.read(p0);
                      break;
                    case 6:
                      obj.mLiveDistrictRankInfo = this.d.read(p0);
                      break;
                    case 7:
                      obj.mSurvey = this.e.read(p0);
                      break;
                    case 8:
                      obj.mDisplayMusicStationUserCount = TypeAdapters.A.read(p0);
                      break;
                    case 9:
                      obj.mWatchingUserCount = KnownTypeAdapters$k.a(p0, obj.mWatchingUserCount);
                      break;
                    case 10:
                      obj.mReceivedGiftCount = KnownTypeAdapters$n.a(p0, obj.mReceivedGiftCount);
                      break;
                    case 11:
                      obj.mShareEnable = KnownTypeAdapters$g.a(p0, obj.mShareEnable);
                      break;
                    case 12:
                      obj.mLikeUserCount = KnownTypeAdapters$k.a(p0, obj.mLikeUserCount);
                      break;
                    case 13:
                      obj.mLiveDuration = KnownTypeAdapters$n.a(p0, obj.mLiveDuration);
                      break;
                    case 14:
                      obj.mHasRemainingRedPack = TypeAdapters.A.read(p0);
                      break;
                    case 15:
                      obj.mAuthorLabels = this.g.read(p0);
                      break;
                    case 16:
                      obj.mAuthorRedPackNoticeText = TypeAdapters.A.read(p0);
                      break;
                    case 17:
                      obj.mDisplayWatchingUserCount = TypeAdapters.A.read(p0);
                      break;
                    case 18:
                      obj.mCommodityClickCount = TypeAdapters.A.read(p0);
                      break;
                    case 19:
                      obj.mLiveReservationInfo = this.i.read(p0);
                      break;
                    case 20:
                      obj.mPlaybackData = this.h.read(p0);
                      break;
                    case 21:
                      obj.mCategoryType = TypeAdapters.A.read(p0);
                      break;
                    case 22:
                      obj.mRedPackSentDou = KnownTypeAdapters$n.a(p0, obj.mRedPackSentDou);
                      break;
                    case 23:
                      obj.mEnableShowUserOperationModule = KnownTypeAdapters$g.a(p0, obj.mEnableShowUserOperationModule);
                      break;
                    case 24:
                      obj.mReceivedYellowDiamond = KnownTypeAdapters$n.a(p0, obj.mReceivedYellowDiamond);
                      break;
                    case 25:
                      obj.mReceivedGreenDiamond = KnownTypeAdapters$n.a(p0, obj.mReceivedGreenDiamond);
                      break;
                    case 26:
                      obj.mLiveFansTopStopInfo = this.b.read(p0);
                      break;
                    case 27:
                      obj.mGzoneEndEntryInfo = this.c.read(p0);
                      break;
                    case 28:
                      obj.mLiveAccumulatedWatchCount = TypeAdapters.A.read(p0);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, QLivePushEndInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("totalWatchingDuration");
          p0.K(p1.mTotalWatchingDuration);
          p0.r("watchingUserCount");
          p0.K((long)p1.mWatchingUserCount);
          if (p1.mDisplayWatchingUserCount != null) {
             p0.r("displayWatchingUserCount");
             TypeAdapters.A.write(p0, p1.mDisplayWatchingUserCount);
          }
          if (p1.mLiveAccumulatedWatchCount != null) {
             p0.r("displayTotalStartPlayCount");
             TypeAdapters.A.write(p0, p1.mLiveAccumulatedWatchCount);
          }
          p0.r("liveDuration");
          p0.K(p1.mLiveDuration);
          p0.r("likeUserCount");
          p0.K((long)p1.mLikeUserCount);
          if (p1.mDisplayLikeUserCount != null) {
             p0.r("displayLikeUserCount");
             TypeAdapters.A.write(p0, p1.mDisplayLikeUserCount);
          }
          p0.r("receivedXZuan");
          p0.K(p1.mReceivedYellowDiamond);
          p0.r("receivedYZuan");
          p0.K(p1.mReceivedGreenDiamond);
          p0.r("receivedGiftCount");
          p0.K(p1.mReceivedGiftCount);
          p0.r("redPackSentDou");
          p0.K(p1.mRedPackSentDou);
          if (p1.mHasRemainingRedPack != null) {
             p0.r("hasRemainingRedPack");
             TypeAdapters.A.write(p0, p1.mHasRemainingRedPack);
          }
          if (p1.mLiveStreamEndReason != null) {
             p0.r("liveStreamEndReason");
             TypeAdapters.A.write(p0, p1.mLiveStreamEndReason);
          }
          p0.r("shareEnable");
          p0.P(p1.mShareEnable);
          if (p1.mLiveFansTopStopInfo != null) {
             p0.r("liveFansTop");
             this.b.write(p0, p1.mLiveFansTopStopInfo);
          }
          if (p1.mCommodityClickCount != null) {
             p0.r("displayCommodityClickCount");
             TypeAdapters.A.write(p0, p1.mCommodityClickCount);
          }
          if (p1.mCommodityOrderCount != null) {
             p0.r("displayCommodityOrderCount");
             TypeAdapters.A.write(p0, p1.mCommodityOrderCount);
          }
          if (p1.mDisplayMusicStationUserCount != null) {
             p0.r("displayMusicStationUserCount");
             TypeAdapters.A.write(p0, p1.mDisplayMusicStationUserCount);
          }
          if (p1.mAuthorRedPackNoticeText != null) {
             p0.r("authorLEEENoticeText");
             TypeAdapters.A.write(p0, p1.mAuthorRedPackNoticeText);
          }
          if (p1.mGzoneEndEntryInfo != null) {
             p0.r("gzoneSectionEntranceConfig");
             this.c.write(p0, p1.mGzoneEndEntryInfo);
          }
          if (p1.mLiveDistrictRankInfo != null) {
             p0.r("districtRank");
             this.d.write(p0, p1.mLiveDistrictRankInfo);
          }
          if (p1.mSurvey != null) {
             p0.r("survey");
             this.e.write(p0, p1.mSurvey);
          }
          p0.r("enableShowUserOperationModule");
          p0.P(p1.mEnableShowUserOperationModule);
          if (p1.mCategoryType != null) {
             p0.r("authorCategoryType");
             TypeAdapters.A.write(p0, p1.mCategoryType);
          }
          if (p1.mFollowText != null) {
             p0.r("followText");
             TypeAdapters.A.write(p0, p1.mFollowText);
          }
          if (p1.mAuthorLabels != null) {
             p0.r("authorLabels");
             this.g.write(p0, p1.mAuthorLabels);
          }
          if (p1.mPlaybackData != null) {
             p0.r("playbackView");
             this.h.write(p0, p1.mPlaybackData);
          }
          if (p1.mLiveReservationInfo != null) {
             p0.r("liveReservationInfo");
             this.i.write(p0, p1.mLiveReservationInfo);
          }
          if (p1.mHighlightData != null) {
             p0.r("highlightViewList");
             this.k.write(p0, p1.mHighlightData);
          }
          p0.j();
       }
       return;
    }
}
