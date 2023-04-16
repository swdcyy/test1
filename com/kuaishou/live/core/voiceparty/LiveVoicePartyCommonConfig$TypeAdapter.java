package com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig$CountDownAboardConfig;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig$LiveSquareEntrance;
import com.kuaishou.live.core.voiceparty.VoicePartyHatConfig;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig$FollowGuestGuide;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig$WishListCommonNotice;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import bl.p;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.Map;
import com.google.gson.stream.b;

public final class LiveVoicePartyCommonConfig$TypeAdapter extends TypeAdapter	// class@001308
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public final TypeAdapter h;
    public static final a i;

    static {
       LiveVoicePartyCommonConfig$TypeAdapter.i = a.get(LiveVoicePartyCommonConfig.class);
    }
    public void LiveVoicePartyCommonConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(LiveVoicePartyCommonConfig$CountDownAboardConfig.class));
       this.c = new KnownTypeAdapters$MapTypeAdapter(KnownTypeAdapters.c, TypeAdapters.A, new KnownTypeAdapters$e());
       TypeAdapter typeAdapter = p0.j(a.get(LiveVoicePartyCommonConfig$LiveSquareEntrance.class));
       this.d = typeAdapter;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.f = p0.j(a.get(VoicePartyHatConfig.class));
       this.g = p0.j(a.get(LiveVoicePartyCommonConfig$FollowGuestGuide.class));
       this.h = p0.j(a.get(LiveVoicePartyCommonConfig$WishListCommonNotice.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyCommonConfig$TypeAdapter.class, "2");
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
             obj = new LiveVoicePartyCommonConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x848dab4f:
                      if (str.equals("isFixedPrivateScopeVoiceParty")) {
                         i = 0;
                      }
                      break;
                    case 0x861a3df7:
                      if (str.equals("disableShowChannelFeeds")) {
                         i = 1;
                      }
                      break;
                    case 0x88fa1766:
                      if (str.equals("enableGuestVideo")) {
                         i = 2;
                      }
                      break;
                    case 0x989ad400:
                      if (str.equals("enableMicSeatsFreeLayout")) {
                         i = 3;
                      }
                      break;
                    case 0x9a5d4127:
                      if (str.equals("voicePartyHat")) {
                         i = 4;
                      }
                      break;
                    case 0x9d14e8ec:
                      if (str.equals("applyCountQueryInterval")) {
                         i = 5;
                      }
                      break;
                    case 0xa4a3e5d4:
                      if (str.equals("aboardTypeSwitchToast")) {
                         i = 6;
                      }
                      break;
                    case 0xc1235809:
                      if (str.equals("micSeatsLevelContributionRule")) {
                         i = 7;
                      }
                      break;
                    case 0xcd57e690:
                      if (str.equals("enableMicSeatUserLevel")) {
                         i = 8;
                      }
                      break;
                    case 0xd6325585:
                      if (str.equals("enableAboardOptimize")) {
                         i = 9;
                      }
                      break;
                    case 0xf1436008:
                      if (str.equals("enableMicSeatsInteraction")) {
                         i = 10;
                      }
                      break;
                    case 0xf5ab9eb5:
                      if (str.equals("roomType")) {
                         i = 11;
                      }
                      break;
                    case 0x374e7bd:
                      if (str.equals("delaySwitchMillis")) {
                         i = 12;
                      }
                      break;
                    case 0x1d27f8d6:
                      if (str.equals("countDownAboard")) {
                         i = 13;
                      }
                      break;
                    case 0x243244fc:
                      if (str.equals("canOpenVoicePartyOnlyPhoneVerified")) {
                         i = 14;
                      }
                      break;
                    case 0x2f8a45f6:
                      if (str.equals("squareTabList")) {
                         i = 15;
                      }
                      break;
                    case 0x485dc8dd:
                      if (str.equals("enablePortraitVideo")) {
                         i = 16;
                      }
                      break;
                    case 0x5868f295:
                      if (str.equals("followGuestGuide")) {
                         i = 17;
                      }
                      break;
                    case 0x60cf6db5:
                      if (str.equals("enableAboardControl")) {
                         i = 18;
                      }
                      break;
                    case 0x63545005:
                      if (str.equals("enableToAudienceGiftShowUserName")) {
                         i = 19;
                      }
                      break;
                    case 0x741a5255:
                      if (str.equals("useVoicePartyFeedV2")) {
                         i = 20;
                      }
                      break;
                    case 0x750cc2ee:
                      if (str.equals("aboardMicGuideDuration")) {
                         i = 21;
                      }
                      break;
                    case 0x76732bd3:
                      if (str.equals("disableShowEmojiButton")) {
                         i = 22;
                      }
                      break;
                    case 0x7e011f28:
                      if (str.equals("wishListCommonNotice")) {
                         i = 23;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mIsFixedPrivateScopeVoiceParty = KnownTypeAdapters$g.a(p0, obj.mIsFixedPrivateScopeVoiceParty);
                      break;
                    case 1:
                      obj.mDisableShowChannelFeeds = KnownTypeAdapters$g.a(p0, obj.mDisableShowChannelFeeds);
                      break;
                    case 2:
                      obj.mEnableGuestVideo = KnownTypeAdapters$g.a(p0, obj.mEnableGuestVideo);
                      break;
                    case 3:
                      obj.mEnableMicSeatsFreeLayout = KnownTypeAdapters$g.a(p0, obj.mEnableMicSeatsFreeLayout);
                      break;
                    case 4:
                      obj.mVoicePartyHatConfig = this.f.read(p0);
                      break;
                    case 5:
                      obj.mApplyCountQueryIntervalMs = KnownTypeAdapters$n.a(p0, obj.mApplyCountQueryIntervalMs);
                      break;
                    case 6:
                      obj.mAboardMicTypeSwitchToastMap = this.c.read(p0);
                      break;
                    case 7:
                      obj.mMicSeatsLevelContributionRule = TypeAdapters.A.read(p0);
                      break;
                    case 8:
                      obj.mEnableMicSeatUserLevel = KnownTypeAdapters$g.a(p0, obj.mEnableMicSeatUserLevel);
                      break;
                    case 9:
                      obj.mEnableAboardOptimize = KnownTypeAdapters$g.a(p0, obj.mEnableAboardOptimize);
                      break;
                    case 10:
                      obj.mEnableMicSeatsInteraction = KnownTypeAdapters$g.a(p0, obj.mEnableMicSeatsInteraction);
                      break;
                    case 11:
                      obj.mRoomType = KnownTypeAdapters$k.a(p0, obj.mRoomType);
                      break;
                    case 12:
                      obj.mVoicePartyDelaySwitchMillis = KnownTypeAdapters$n.a(p0, obj.mVoicePartyDelaySwitchMillis);
                      break;
                    case 13:
                      obj.mCountDownAboardConfig = this.b.read(p0);
                      break;
                    case 14:
                      obj.mCanOpenVoicePartyOnlyPhoneVerified = KnownTypeAdapters$g.a(p0, obj.mCanOpenVoicePartyOnlyPhoneVerified);
                      break;
                    case 15:
                      obj.mSquareEntranceList = this.e.read(p0);
                      break;
                    case 16:
                      obj.mEnablePortraitVideo = KnownTypeAdapters$g.a(p0, obj.mEnablePortraitVideo);
                      break;
                    case 17:
                      obj.mFollowGuestGuide = this.g.read(p0);
                      break;
                    case 18:
                      obj.mEnableAboardControl = KnownTypeAdapters$g.a(p0, obj.mEnableAboardControl);
                      break;
                    case 19:
                      obj.mEnableToAudienceGiftShowUserName = KnownTypeAdapters$g.a(p0, obj.mEnableToAudienceGiftShowUserName);
                      break;
                    case 20:
                      obj.mUseVoicePartyFeedV2 = KnownTypeAdapters$g.a(p0, obj.mUseVoicePartyFeedV2);
                      break;
                    case 21:
                      obj.mAboardMicGuideDuration = KnownTypeAdapters$n.a(p0, obj.mAboardMicGuideDuration);
                      break;
                    case 22:
                      obj.mDisableShowEmojiButton = KnownTypeAdapters$g.a(p0, obj.mDisableShowEmojiButton);
                      break;
                    case 23:
                      obj.mWishListCommonNotice = this.h.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyCommonConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("disableShowChannelFeeds");
          p0.P(p1.mDisableShowChannelFeeds);
          p0.r("disableShowEmojiButton");
          p0.P(p1.mDisableShowEmojiButton);
          p0.r("enableToAudienceGiftShowUserName");
          p0.P(p1.mEnableToAudienceGiftShowUserName);
          p0.r("canOpenVoicePartyOnlyPhoneVerified");
          p0.P(p1.mCanOpenVoicePartyOnlyPhoneVerified);
          if (p1.mMicSeatsLevelContributionRule != null) {
             p0.r("micSeatsLevelContributionRule");
             TypeAdapters.A.write(p0, p1.mMicSeatsLevelContributionRule);
          }
          p0.r("useVoicePartyFeedV2");
          p0.P(p1.mUseVoicePartyFeedV2);
          p0.r("enableAboardOptimize");
          p0.P(p1.mEnableAboardOptimize);
          p0.r("isFixedPrivateScopeVoiceParty");
          p0.P(p1.mIsFixedPrivateScopeVoiceParty);
          if (p1.mCountDownAboardConfig != null) {
             p0.r("countDownAboard");
             this.b.write(p0, p1.mCountDownAboardConfig);
          }
          p0.r("applyCountQueryInterval");
          p0.K(p1.mApplyCountQueryIntervalMs);
          p0.r("enableAboardControl");
          p0.P(p1.mEnableAboardControl);
          p0.r("enableMicSeatsFreeLayout");
          p0.P(p1.mEnableMicSeatsFreeLayout);
          if (p1.mAboardMicTypeSwitchToastMap != null) {
             p0.r("aboardTypeSwitchToast");
             this.c.write(p0, p1.mAboardMicTypeSwitchToastMap);
          }
          p0.r("enablePortraitVideo");
          p0.P(p1.mEnablePortraitVideo);
          p0.r("delaySwitchMillis");
          p0.K(p1.mVoicePartyDelaySwitchMillis);
          if (p1.mSquareEntranceList != null) {
             p0.r("squareTabList");
             this.e.write(p0, p1.mSquareEntranceList);
          }
          p0.r("enableGuestVideo");
          p0.P(p1.mEnableGuestVideo);
          p0.r("enableMicSeatsInteraction");
          p0.P(p1.mEnableMicSeatsInteraction);
          if (p1.mVoicePartyHatConfig != null) {
             p0.r("voicePartyHat");
             this.f.write(p0, p1.mVoicePartyHatConfig);
          }
          if (p1.mFollowGuestGuide != null) {
             p0.r("followGuestGuide");
             this.g.write(p0, p1.mFollowGuestGuide);
          }
          if (p1.mWishListCommonNotice != null) {
             p0.r("wishListCommonNotice");
             this.h.write(p0, p1.mWishListCommonNotice);
          }
          p0.r("aboardMicGuideDuration");
          p0.K(p1.mAboardMicGuideDuration);
          p0.r("roomType");
          p0.K((long)p1.mRoomType);
          p0.r("enableMicSeatUserLevel");
          p0.P(p1.mEnableMicSeatUserLevel);
          p0.j();
       }
       return;
    }
}
