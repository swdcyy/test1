package com.kwai.framework.model.user.UserExtraInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import com.kwai.framework.model.user.RichTextMeta$TypeAdapter;
import com.kwai.framework.model.user.QUserContactName$TypeAdapter;
import com.kwai.framework.model.user.UserExtraInfo$UserInfoExposed$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import bl.p;
import com.kwai.framework.model.user.UserExtraInfo$TextColor$TypeAdapter;
import com.kwai.framework.model.user.UserExtraInfo$Truncate$TypeAdapter;
import com.kwai.framework.model.user.UserExtraInfo$RoleInfo$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import com.kwai.framework.model.user.UserExtraInfo$LiveUserInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.kwai.framework.model.user.UserExtraInfo$Truncate;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kwai.framework.model.user.UserExtraInfo$LiveUserInfo;
import java.util.List;
import com.kwai.framework.model.user.RichTextMeta;
import com.kwai.framework.model.user.QUserContactName;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.kwai.framework.model.user.UserExtraInfo$TextColor;
import com.kwai.framework.model.user.UserExtraInfo$UserInfoExposed;
import java.util.Map;
import com.google.gson.stream.b;

public final class UserExtraInfo$TypeAdapter extends TypeAdapter	// class@001750
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
    public final TypeAdapter l;
    public final TypeAdapter m;
    public static final a n;

    static {
       UserExtraInfo$TypeAdapter.n = a.get(UserExtraInfo.class);
    }
    public void UserExtraInfo$TypeAdapter(Gson p0){
       TypeAdapter a;
       super();
       this.a = p0;
       this.b = p0.j(RichTextMeta$TypeAdapter.h);
       this.c = p0.j(a.get(LiveAdminPrivilege.class));
       this.d = p0.j(QUserContactName$TypeAdapter.b);
       this.e = p0.j(UserExtraInfo$UserInfoExposed$TypeAdapter.b);
       this.f = p0.j(a.get(LiveFansGroupIntimacyInfo.class));
       a = TypeAdapters.A;
       this.g = new KnownTypeAdapters$MapTypeAdapter(a, a, new KnownTypeAdapters$e());
       this.h = p0.j(UserExtraInfo$TextColor$TypeAdapter.b);
       this.i = p0.j(UserExtraInfo$Truncate$TypeAdapter.b);
       TypeAdapter typeAdapter = p0.j(UserExtraInfo$RoleInfo$TypeAdapter.c);
       this.j = typeAdapter;
       this.k = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.l = new KnownTypeAdapters$ListTypeAdapter(a, new KnownTypeAdapters$d());
       this.m = p0.j(UserExtraInfo$LiveUserInfo$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UserExtraInfo$TypeAdapter.class, "2");
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
             obj = new UserExtraInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x846b9d60:
                      if (str.equals("openUserName")) {
                         i = 0;
                      }
                      break;
                    case 0x865c277b:
                      if (str.equals("displayKsCoin")) {
                         i = 1;
                      }
                      break;
                    case 0x902d76fe:
                      if (str.equals("privateMsg")) {
                         i = 2;
                      }
                      break;
                    case 0x910e8c97:
                      if (str.equals("aggrCardTitle")) {
                         i = 3;
                      }
                      break;
                    case 0x9ea4adee:
                      if (str.equals("exposedInfo")) {
                         i = 4;
                      }
                      break;
                    case 0xa1faf6b1:
                      if (str.equals("privilege")) {
                         i = 5;
                      }
                      break;
                    case 0xa3b20de3:
                      if (str.equals("offline")) {
                         i = 6;
                      }
                      break;
                    case 0xab42da96:
                      if (str.equals("cityName")) {
                         i = 7;
                      }
                      break;
                    case 0xabba5058:
                      if (str.equals("amount")) {
                         i = 8;
                      }
                      break;
                    case 0xae9497c7:
                      if (str.equals("userInfoExposed")) {
                         i = 9;
                      }
                      break;
                    case 0xaed713b0:
                      if (str.equals("change")) {
                         i = 10;
                      }
                      break;
                    case 0xb45d3bb1:
                      if (str.equals("follow")) {
                         i = 11;
                      }
                      break;
                    case 0xb56c2e7a:
                      if (str.equals("recoTextInfo")) {
                         i = 12;
                      }
                      break;
                    case 0xbccb5163:
                      if (str.equals("isFansTopBoostUser")) {
                         i = 13;
                      }
                      break;
                    case 0xc09b2e36:
                      if (str.equals("textColor")) {
                         i = 14;
                      }
                      break;
                    case 0xc440c3b6:
                      if (str.equals("reason_value")) {
                         i = 15;
                      }
                      break;
                    case 0xc8459244:
                      if (str.equals("reason")) {
                         i = 16;
                      }
                      break;
                    case 0xc8d18dca:
                      if (str.equals("fansGroupName")) {
                         i = 17;
                      }
                      break;
                    case 0xcd1d9ead:
                      if (str.equals("lastVisitDisplay")) {
                         i = 18;
                      }
                      break;
                    case 0xd23cbe29:
                      if (str.equals("receivedZuan")) {
                         i = 19;
                      }
                      break;
                    case 0xd832e1c7:
                      if (str.equals("liveStreamId")) {
                         i = 20;
                      }
                      break;
                    case 0xe6773473:
                      if (str.equals("isLiving")) {
                         i = 21;
                      }
                      break;
                    case 0xedecce53:
                      if (str.equals("lastLiveDesc")) {
                         i = 22;
                      }
                      break;
                    case 0xf022f9f2:
                      if (str.equals("user_sex")) {
                         i = 23;
                      }
                      break;
                    case 0xf13613fd:
                      if (str.equals("isWatching")) {
                         i = 24;
                      }
                      break;
                    case 0xf8a18840:
                      if (str.equals("recoTextScene")) {
                         i = 25;
                      }
                      break;
                    case 0xfa43701f:
                      if (str.equals("schoolName")) {
                         i = 26;
                      }
                      break;
                    case 0x178ff:
                      if (str.equals("age")) {
                         i = 27;
                      }
                      break;
                    case 0x18b13:
                      if (str.equals("fan")) {
                         i = 28;
                      }
                      break;
                    case 0x2f0c05:
                      if (str.equals("diff")) {
                         i = 29;
                      }
                      break;
                    case 0x354c2c:
                      if (str.equals("rank")) {
                         i = 30;
                      }
                      break;
                    case 0x3752ea:
                      if (str.equals("vote")) {
                         i = 31;
                      }
                      break;
                    case 0x4aa08c:
                      if (str.equals("photoOrLivingInfo")) {
                         i = 32;
                      }
                      break;
                    case 0x26d02cb:
                      if (str.equals("contactName")) {
                         i = 33;
                      }
                      break;
                    case 0x5951eea:
                      if (str.equals("bgUrl")) {
                         i = 34;
                      }
                      break;
                    case 0x65b3e32:
                      if (str.equals("photo")) {
                         i = 35;
                      }
                      break;
                    case 0x6996875:
                      if (str.equals("tuhao")) {
                         i = 36;
                      }
                      break;
                    case 0x12ce9aaf:
                      if (str.equals("roleInfos")) {
                         i = 37;
                      }
                      break;
                    case 0x173f19e1:
                      if (str.equals("displayWatchDuration")) {
                         i = 38;
                      }
                      break;
                    case 0x2d94b4f9:
                      if (str.equals("aggrSubCardTitle")) {
                         i = 39;
                      }
                      break;
                    case 0x38eb0007:
                      if (str.equals("message")) {
                         i = 40;
                      }
                      break;
                    case 0x3d9c4e1c:
                      if (str.equals("userStateDisplaySegments")) {
                         i = 41;
                      }
                      break;
                    case 0x503534f8:
                      if (str.equals("listType")) {
                         i = 42;
                      }
                      break;
                    case 0x5145f025:
                      if (str.equals("fansGroupLevel")) {
                         i = 43;
                      }
                      break;
                    case 0x5690be48:
                      if (str.equals("disableJumpUserProfile")) {
                         i = 44;
                      }
                      break;
                    case 0x5bcfcc01:
                      if (str.equals("highlightText")) {
                         i = 45;
                      }
                      break;
                    case 0x5d8c5025:
                      if (str.equals("liveUserInfo")) {
                         i = 46;
                      }
                      break;
                    case 0x5f965ef0:
                      if (str.equals("displayScore")) {
                         i = 47;
                      }
                      break;
                    case 0x6390d738:
                      if (str.equals("assistantType")) {
                         i = 48;
                      }
                      break;
                    case 0x6529d40f:
                      if (str.equals("isFansTopAudience")) {
                         i = 49;
                      }
                      break;
                    case 0x69214152:
                      if (str.equals("overrideTruncate")) {
                         i = 50;
                      }
                      break;
                    case 0x6997e350:
                      if (str.equals("sendGiftAmount")) {
                         i = 51;
                      }
                      break;
                    case 0x73e43487:
                      if (str.equals("isFollowing")) {
                         i = 52;
                      }
                      break;
                    case 0x75126213:
                      if (str.equals("sameArea")) {
                         i = 53;
                      }
                      break;
                    case 0x77dcea1e:
                      if (str.equals("remarksName")) {
                         i = 54;
                      }
                      break;
                    case 0x7ab77fa6:
                      if (str.equals("isFirst")) {
                         i = 55;
                      }
                      break;
                    case 0x7b0a0a23:
                      if (str.equals("fansGroupIntimacy")) {
                         i = 56;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mOpenUserName = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mDisplayKsCoin = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mPrivateMsg = KnownTypeAdapters$g.a(p0, obj.mPrivateMsg);
                      break;
                    case 3:
                      obj.mAggrCardTitle = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mExposedInfo = this.g.read(p0);
                      break;
                    case 5:
                      obj.mPrivilege = this.c.read(p0);
                      break;
                    case 6:
                      obj.mOffline = KnownTypeAdapters$g.a(p0, obj.mOffline);
                      break;
                    case 7:
                      obj.mCityName = TypeAdapters.A.read(p0);
                      break;
                    case 8:
                      obj.mAmount = KnownTypeAdapters$k.a(p0, obj.mAmount);
                      break;
                    case 9:
                      obj.mUserInfoExposed = this.e.read(p0);
                      break;
                    case 10:
                      obj.mKwaiVoiceRankChange = KnownTypeAdapters$k.a(p0, obj.mKwaiVoiceRankChange);
                      break;
                    case 11:
                      obj.mFollow = KnownTypeAdapters$n.a(p0, obj.mFollow);
                      break;
                    case 12:
                      obj.mRecoTextInfo = this.b.read(p0);
                      break;
                    case 13:
                      obj.mIsLivePurchaseFansPromotionUser = KnownTypeAdapters$g.a(p0, obj.mIsLivePurchaseFansPromotionUser);
                      break;
                    case 14:
                      obj.mTextColor = this.h.read(p0);
                      break;
                    case 15:
                      obj.mRecommendReasonValue = KnownTypeAdapters$k.a(p0, obj.mRecommendReasonValue);
                      break;
                    case 16:
                      obj.mRecommendReason = TypeAdapters.A.read(p0);
                      break;
                    case 17:
                      obj.mFansGroupName = TypeAdapters.A.read(p0);
                      break;
                    case 18:
                      obj.mAdminLastVisitDisplay = TypeAdapters.A.read(p0);
                      break;
                    case 19:
                      obj.mReceivedZuan = KnownTypeAdapters$n.a(p0, obj.mReceivedZuan);
                      break;
                    case 20:
                      obj.mLiveStreamId = TypeAdapters.A.read(p0);
                      break;
                    case 21:
                      obj.mIsLiving = KnownTypeAdapters$g.a(p0, obj.mIsLiving);
                      break;
                    case 22:
                      obj.mLastLiveDesc = TypeAdapters.A.read(p0);
                      break;
                    case 23:
                      obj.mSex = TypeAdapters.A.read(p0);
                      break;
                    case 24:
                      obj.mIsWatching = KnownTypeAdapters$g.a(p0, obj.mIsWatching);
                      break;
                    case 25:
                      obj.mRecoTextScene = KnownTypeAdapters$k.a(p0, obj.mRecoTextScene);
                      break;
                    case 26:
                      obj.mSchoolName = TypeAdapters.A.read(p0);
                      break;
                    case 27:
                      obj.mAge = TypeAdapters.A.read(p0);
                      break;
                    case 28:
                      obj.mFan = KnownTypeAdapters$n.a(p0, obj.mFan);
                      break;
                    case 29:
                      obj.mKwaiVoiceDiffVotes = TypeAdapters.A.read(p0);
                      break;
                    case 30:
                      obj.mKwaiVoiceRank = KnownTypeAdapters$k.a(p0, obj.mKwaiVoiceRank);
                      break;
                    case 31:
                      obj.mKwaiVoiceVotes = TypeAdapters.A.read(p0);
                      break;
                    case 32:
                      obj.mPhotoOrLivingInfo = this.b.read(p0);
                      break;
                    case '!':
                      obj.mContactName = this.d.read(p0);
                      break;
                    case '"':
                      obj.mBgUrl = TypeAdapters.A.read(p0);
                      break;
                    case '#':
                      obj.mPhoto = KnownTypeAdapters$k.a(p0, obj.mPhoto);
                      break;
                    case '$':
                      obj.mIsTopPayingUser = KnownTypeAdapters$g.a(p0, obj.mIsTopPayingUser);
                      break;
                    case '%':
                      obj.mRoleInfos = this.k.read(p0);
                      break;
                    case '&':
                      obj.mDisplayWatchDuration = TypeAdapters.A.read(p0);
                      break;
                    case 39:
                      obj.mAggrSubCardTitle = this.b.read(p0);
                      break;
                    case '(':
                      obj.mMessage = TypeAdapters.A.read(p0);
                      break;
                    case ')':
                      obj.mBase64Segments = TypeAdapters.A.read(p0);
                      break;
                    case '*':
                      obj.mKwaiVoiceRankType = KnownTypeAdapters$k.a(p0, obj.mKwaiVoiceRankType);
                      break;
                    case '+':
                      obj.mFanGroupLevel = KnownTypeAdapters$k.a(p0, obj.mFanGroupLevel);
                      break;
                    case ',':
                      obj.mDisableJumpUserProfile = KnownTypeAdapters$g.a(p0, obj.mDisableJumpUserProfile);
                      break;
                    case '-':
                      obj.mHighLightTexts = this.l.read(p0);
                      break;
                    case '.':
                      obj.mLiveUserInfo = this.m.read(p0);
                      break;
                    case '/':
                      obj.mDisplayScore = TypeAdapters.A.read(p0);
                      break;
                    case '0':
                      obj.mAssistantType = KnownTypeAdapters$k.a(p0, obj.mAssistantType);
                      break;
                    case '1':
                      obj.mIsFansTopAudience = KnownTypeAdapters$g.a(p0, obj.mIsFansTopAudience);
                      break;
                    case '2':
                      obj.mTruncate = this.i.read(p0);
                      break;
                    case '3':
                      obj.mSendGiftAmount = TypeAdapters.A.read(p0);
                      break;
                    case '4':
                      obj.mIsFollowing = KnownTypeAdapters$g.a(p0, obj.mIsFollowing);
                      break;
                    case '5':
                      obj.mSameArea = TypeAdapters.A.read(p0);
                      break;
                    case '6':
                      obj.mRemarksName = TypeAdapters.A.read(p0);
                      break;
                    case '7':
                      obj.mIsFirstSendGift = KnownTypeAdapters$g.a(p0, obj.mIsFirstSendGift);
                      break;
                    case '8':
                      obj.mFansGroupIntimacy = this.f.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserExtraInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("amount");
          p0.K((long)p1.mAmount);
          if (p1.mMessage != null) {
             p0.r("message");
             TypeAdapters.A.write(p0, p1.mMessage);
          }
          p0.r("privateMsg");
          p0.P(p1.mPrivateMsg);
          if (p1.mRecoTextInfo != null) {
             p0.r("recoTextInfo");
             this.b.write(p0, p1.mRecoTextInfo);
          }
          p0.r("recoTextScene");
          p0.K((long)p1.mRecoTextScene);
          if (p1.mPhotoOrLivingInfo != null) {
             p0.r("photoOrLivingInfo");
             this.b.write(p0, p1.mPhotoOrLivingInfo);
          }
          p0.r("isWatching");
          p0.P(p1.mIsWatching);
          p0.r("reason_value");
          p0.K((long)p1.mRecommendReasonValue);
          if (p1.mAggrCardTitle != null) {
             p0.r("aggrCardTitle");
             TypeAdapters.A.write(p0, p1.mAggrCardTitle);
          }
          if (p1.mAggrSubCardTitle != null) {
             p0.r("aggrSubCardTitle");
             this.b.write(p0, p1.mAggrSubCardTitle);
          }
          if (p1.mSex != null) {
             p0.r("user_sex");
             TypeAdapters.A.write(p0, p1.mSex);
          }
          if (p1.mAge != null) {
             p0.r("age");
             TypeAdapters.A.write(p0, p1.mAge);
          }
          if (p1.mCityName != null) {
             p0.r("cityName");
             TypeAdapters.A.write(p0, p1.mCityName);
          }
          if (p1.mSchoolName != null) {
             p0.r("schoolName");
             TypeAdapters.A.write(p0, p1.mSchoolName);
          }
          if (p1.mSameArea != null) {
             p0.r("sameArea");
             TypeAdapters.A.write(p0, p1.mSameArea);
          }
          if (p1.mBgUrl != null) {
             p0.r("bgUrl");
             TypeAdapters.A.write(p0, p1.mBgUrl);
          }
          if (p1.mDisplayKsCoin != null) {
             p0.r("displayKsCoin");
             TypeAdapters.A.write(p0, p1.mDisplayKsCoin);
          }
          if (p1.mDisplayScore != null) {
             p0.r("displayScore");
             TypeAdapters.A.write(p0, p1.mDisplayScore);
          }
          p0.r("tuhao");
          p0.P(p1.mIsTopPayingUser);
          p0.r("receivedZuan");
          p0.K(p1.mReceivedZuan);
          if (p1.mRecommendReason != null) {
             p0.r("reason");
             TypeAdapters.A.write(p0, p1.mRecommendReason);
          }
          if (p1.mRemarksName != null) {
             p0.r("remarksName");
             TypeAdapters.A.write(p0, p1.mRemarksName);
          }
          if (p1.mOpenUserName != null) {
             p0.r("openUserName");
             TypeAdapters.A.write(p0, p1.mOpenUserName);
          }
          p0.r("offline");
          p0.P(p1.mOffline);
          p0.r("assistantType");
          p0.K((long)p1.mAssistantType);
          if (p1.mAdminLastVisitDisplay != null) {
             p0.r("lastVisitDisplay");
             TypeAdapters.A.write(p0, p1.mAdminLastVisitDisplay);
          }
          if (p1.mSendGiftAmount != null) {
             p0.r("sendGiftAmount");
             TypeAdapters.A.write(p0, p1.mSendGiftAmount);
          }
          if (p1.mPrivilege != null) {
             p0.r("privilege");
             this.c.write(p0, p1.mPrivilege);
          }
          p0.r("isFollowing");
          p0.P(p1.mIsFollowing);
          if (p1.mLiveStreamId != null) {
             p0.r("liveStreamId");
             TypeAdapters.A.write(p0, p1.mLiveStreamId);
          }
          p0.r("isFansTopAudience");
          p0.P(p1.mIsFansTopAudience);
          if (p1.mContactName != null) {
             p0.r("contactName");
             this.d.write(p0, p1.mContactName);
          }
          p0.r("isFirst");
          p0.P(p1.mIsFirstSendGift);
          p0.r("rank");
          p0.K((long)p1.mKwaiVoiceRank);
          if (p1.mKwaiVoiceVotes != null) {
             p0.r("vote");
             TypeAdapters.A.write(p0, p1.mKwaiVoiceVotes);
          }
          p0.r("change");
          p0.K((long)p1.mKwaiVoiceRankChange);
          if (p1.mKwaiVoiceDiffVotes != null) {
             p0.r("diff");
             TypeAdapters.A.write(p0, p1.mKwaiVoiceDiffVotes);
          }
          p0.r("listType");
          p0.K((long)p1.mKwaiVoiceRankType);
          p0.r("isFansTopBoostUser");
          p0.P(p1.mIsLivePurchaseFansPromotionUser);
          if (p1.mUserInfoExposed != null) {
             p0.r("userInfoExposed");
             this.e.write(p0, p1.mUserInfoExposed);
          }
          if (p1.mFansGroupName != null) {
             p0.r("fansGroupName");
             TypeAdapters.A.write(p0, p1.mFansGroupName);
          }
          if (p1.mFansGroupIntimacy != null) {
             p0.r("fansGroupIntimacy");
             this.f.write(p0, p1.mFansGroupIntimacy);
          }
          if (p1.mExposedInfo != null) {
             p0.r("exposedInfo");
             this.g.write(p0, p1.mExposedInfo);
          }
          p0.r("fan");
          p0.K(p1.mFan);
          p0.r("follow");
          p0.K(p1.mFollow);
          p0.r("photo");
          p0.K((long)p1.mPhoto);
          if (p1.mTextColor != null) {
             p0.r("textColor");
             this.h.write(p0, p1.mTextColor);
          }
          if (p1.mTruncate != null) {
             p0.r("overrideTruncate");
             this.i.write(p0, p1.mTruncate);
          }
          p0.r("fansGroupLevel");
          p0.K((long)p1.mFanGroupLevel);
          p0.r("disableJumpUserProfile");
          p0.P(p1.mDisableJumpUserProfile);
          if (p1.mRoleInfos != null) {
             p0.r("roleInfos");
             this.k.write(p0, p1.mRoleInfos);
          }
          p0.r("isLiving");
          p0.P(p1.mIsLiving);
          if (p1.mHighLightTexts != null) {
             p0.r("highlightText");
             this.l.write(p0, p1.mHighLightTexts);
          }
          if (p1.mBase64Segments != null) {
             p0.r("userStateDisplaySegments");
             TypeAdapters.A.write(p0, p1.mBase64Segments);
          }
          if (p1.mLastLiveDesc != null) {
             p0.r("lastLiveDesc");
             TypeAdapters.A.write(p0, p1.mLastLiveDesc);
          }
          if (p1.mLiveUserInfo != null) {
             p0.r("liveUserInfo");
             this.m.write(p0, p1.mLiveUserInfo);
          }
          if (p1.mDisplayWatchDuration != null) {
             p0.r("displayWatchDuration");
             TypeAdapters.A.write(p0, p1.mDisplayWatchDuration);
          }
          p0.j();
       }
       return;
    }
}
