package com.kwai.framework.model.user.UserInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.ProfilePageInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.UserCertificationTag;
import com.kwai.framework.model.user.OpenFriendName;
import com.kwai.framework.model.user.UserExtraInfo$TypeAdapter;
import com.kwai.framework.model.user.UserVerifiedDetail$TypeAdapter;
import com.kwai.framework.model.user.ProfileDynamicPendant$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.UserVerifiedDetail;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import pa6.y;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.kwai.framework.model.user.ProfileDynamicPendant;
import pa6.x;
import pa6.a0;
import com.vimeo.stag.KnownTypeAdapters$k;
import pa6.z;
import com.google.gson.stream.b;
import pa6.t;
import pa6.u;
import pa6.v;
import pa6.w;

public final class UserInfo$TypeAdapter extends TypeAdapter	// class@00175e
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
       UserInfo$TypeAdapter.i = a.get(UserInfo.class);
    }
    public void UserInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(ProfilePageInfo.class));
       this.c = p0.j(a.get(CDNUrl.class));
       this.d = p0.j(UserExtraInfo$TypeAdapter.n);
       this.e = p0.j(UserVerifiedDetail$TypeAdapter.b);
       this.f = p0.j(a.get(UserCertificationTag.class));
       this.g = p0.j(a.get(OpenFriendName.class));
       this.h = p0.j(ProfileDynamicPendant$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UserInfo$TypeAdapter.class, "2");
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
             obj = new UserInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x89201ec8:
                      if (str.equals("verified")) {
                         i = 0;
                      }
                      break;
                    case 0x89b53b3d:
                      if (str.equals("profilePagePrefetchInfo")) {
                         i = 1;
                      }
                      break;
                    case 0x9095b35d:
                      if (str.equals("ban_text")) {
                         i = 2;
                      }
                      break;
                    case 0x9095fd6a:
                      if (str.equals("ban_type")) {
                         i = 3;
                      }
                      break;
                    case 0x917871c6:
                      if (str.equals("userCancelled")) {
                         i = 4;
                      }
                      break;
                    case 0x9a8e1c04:
                      if (str.equals("bigHeadUrls")) {
                         i = 5;
                      }
                      break;
                    case 0x9be140f6:
                      if (str.equals("pendantType")) {
                         i = 6;
                      }
                      break;
                    case 0x9be19aa0:
                      if (str.equals("pendantUrls")) {
                         i = 7;
                      }
                      break;
                    case 0xa4ac5cbf:
                      if (str.equals("user_profile_bg_url")) {
                         i = 8;
                      }
                      break;
                    case 0xa5d6c3ab:
                      if (str.equals("encryptUid")) {
                         i = 9;
                      }
                      break;
                    case 0xab106f78:
                      if (str.equals("verified_url")) {
                         i = 10;
                      }
                      break;
                    case 0xbd5122cf:
                      if (str.equals("kwaiId")) {
                         i = 11;
                      }
                      break;
                    case 0xbd8dc6c4:
                      if (str.equals("headurls")) {
                         i = 12;
                      }
                      break;
                    case 0xbe823474:
                      if (str.equals("ban_reason")) {
                         i = 13;
                      }
                      break;
                    case 0xd8fec612:
                      if (str.equals("user_banned")) {
                         i = 14;
                      }
                      break;
                    case 0xdcb6046a:
                      if (str.equals("isFrozen")) {
                         i = 15;
                      }
                      break;
                    case 0xe5ef0fc1:
                      if (str.equals("defaultHead")) {
                         i = 16;
                      }
                      break;
                    case 0xe981ae5d:
                      if (str.equals("dynamicPendant")) {
                         i = 17;
                      }
                      break;
                    case 0xf022f9f2:
                      if (str.equals("user_sex")) {
                         i = 18;
                      }
                      break;
                    case 0xf0df3b94:
                      if (str.equals("user_profile_bg_urls")) {
                         i = 19;
                      }
                      break;
                    case 0xf73aee0f:
                      if (str.equals("user_id")) {
                         i = 20;
                      }
                      break;
                    case 0xf9beed39:
                      if (str.equals("verifiedDetail")) {
                         i = 21;
                      }
                      break;
                    case 0xfbac7c81:
                      if (str.equals("visitorBeFollowed")) {
                         i = 22;
                      }
                      break;
                    case 0x5bc3976:
                      if (str.equals("e_uid")) {
                         i = 23;
                      }
                      break;
                    case 0x5c79410:
                      if (str.equals("extra")) {
                         i = 24;
                      }
                      break;
                    case 0x1439ee7f:
                      if (str.equals("user_name")) {
                         i = 25;
                      }
                      break;
                    case 0x143cb921:
                      if (str.equals("user_text")) {
                         i = 26;
                      }
                      break;
                    case 0x219b86a3:
                      if (str.equals("ban_disallow_appeal")) {
                         i = 27;
                      }
                      break;
                    case 0x2f67ab8f:
                      if (str.equals("headurl")) {
                         i = 28;
                      }
                      break;
                    case 0x59f2a833:
                      if (str.equals("openFriendName")) {
                         i = 29;
                      }
                      break;
                    case 0x68d00080:
                      if (str.equals("certificationTag")) {
                         i = 30;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.isVerified = KnownTypeAdapters$g.a(p0, obj.isVerified);
                      break;
                    case 1:
                      obj.mProfilePageInfo = this.b.read(p0);
                      break;
                    case 2:
                      obj.mBanText = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mBanType = KnownTypeAdapters$k.a(p0, obj.mBanType);
                      break;
                    case 4:
                      obj.mUserCanceled = KnownTypeAdapters$g.a(p0, obj.mUserCanceled);
                      break;
                    case 5:
                      obj.mBigHeadUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new z(this)).a(p0);
                      break;
                    case 6:
                      obj.mPendantType = KnownTypeAdapters$k.a(p0, obj.mPendantType);
                      break;
                    case 7:
                      obj.mAvatarPendants = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new a0(this)).a(p0);
                      break;
                    case 8:
                      obj.mProfileBgUrl = TypeAdapters.A.read(p0);
                      break;
                    case 9:
                      obj.mEncryptUid = TypeAdapters.A.read(p0);
                      break;
                    case 10:
                      obj.mVerifiedUrl = TypeAdapters.A.read(p0);
                      break;
                    case 11:
                      obj.mKwaiId = TypeAdapters.A.read(p0);
                      break;
                    case 12:
                      obj.mHeadUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new x(this)).a(p0);
                      break;
                    case 13:
                      obj.mBanReason = TypeAdapters.A.read(p0);
                      break;
                    case 14:
                      obj.mUserBanned = KnownTypeAdapters$g.a(p0, obj.mUserBanned);
                      break;
                    case 15:
                      obj.mFrozen = KnownTypeAdapters$g.a(p0, obj.mFrozen);
                      break;
                    case 16:
                      obj.mDefaultHead = KnownTypeAdapters$g.a(p0, obj.mDefaultHead);
                      break;
                    case 17:
                      obj.mDynamicPendant = this.h.read(p0);
                      break;
                    case 18:
                      obj.mSex = TypeAdapters.A.read(p0);
                      break;
                    case 19:
                      obj.mProfileBgUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new y(this)).a(p0);
                      break;
                    case 20:
                      obj.mId = TypeAdapters.A.read(p0);
                      break;
                    case 21:
                      obj.mVerifiedDetail = this.e.read(p0);
                      break;
                    case 22:
                      obj.mVisitorBeFollowed = KnownTypeAdapters$g.a(p0, obj.mVisitorBeFollowed);
                      break;
                    case 23:
                      obj.mEncryptedUserId = TypeAdapters.A.read(p0);
                      break;
                    case 24:
                      obj.mExtraInfo = this.d.read(p0);
                      break;
                    case 25:
                      obj.mName = TypeAdapters.A.read(p0);
                      break;
                    case 26:
                      obj.mText = TypeAdapters.A.read(p0);
                      break;
                    case 27:
                      obj.mBanDisallowAppeal = KnownTypeAdapters$g.a(p0, obj.mBanDisallowAppeal);
                      break;
                    case 28:
                      obj.mHeadUrl = TypeAdapters.A.read(p0);
                      break;
                    case 29:
                      obj.mOpenFriendName = this.g.read(p0);
                      break;
                    case 30:
                      obj.mCertificationTag = this.f.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mSex != null) {
             p0.r("user_sex");
             TypeAdapters.A.write(p0, p1.mSex);
          }
          if (p1.mProfileBgUrl != null) {
             p0.r("user_profile_bg_url");
             TypeAdapters.A.write(p0, p1.mProfileBgUrl);
          }
          if (p1.mId != null) {
             p0.r("user_id");
             TypeAdapters.A.write(p0, p1.mId);
          }
          if (p1.mEncryptUid != null) {
             p0.r("encryptUid");
             TypeAdapters.A.write(p0, p1.mEncryptUid);
          }
          if (p1.mProfilePageInfo != null) {
             p0.r("profilePagePrefetchInfo");
             this.b.write(p0, p1.mProfilePageInfo);
          }
          if (p1.mName != null) {
             p0.r("user_name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          p0.r("verified");
          p0.P(p1.isVerified);
          if (p1.mHeadUrl != null) {
             p0.r("headurl");
             TypeAdapters.A.write(p0, p1.mHeadUrl);
          }
          if (p1.mHeadUrls != null) {
             p0.r("headurls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new t(this)).b(p0, p1.mHeadUrls);
          }
          p0.r("defaultHead");
          p0.P(p1.mDefaultHead);
          if (p1.mProfileBgUrls != null) {
             p0.r("user_profile_bg_urls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new u(this)).b(p0, p1.mProfileBgUrls);
          }
          if (p1.mText != null) {
             p0.r("user_text");
             TypeAdapters.A.write(p0, p1.mText);
          }
          if (p1.mVerifiedUrl != null) {
             p0.r("verified_url");
             TypeAdapters.A.write(p0, p1.mVerifiedUrl);
          }
          if (p1.mBanText != null) {
             p0.r("ban_text");
             TypeAdapters.A.write(p0, p1.mBanText);
          }
          p0.r("userCancelled");
          p0.P(p1.mUserCanceled);
          p0.r("user_banned");
          p0.P(p1.mUserBanned);
          if (p1.mBanReason != null) {
             p0.r("ban_reason");
             TypeAdapters.A.write(p0, p1.mBanReason);
          }
          p0.r("ban_disallow_appeal");
          p0.P(p1.mBanDisallowAppeal);
          p0.r("ban_type");
          p0.K((long)p1.mBanType);
          if (p1.mExtraInfo != null) {
             p0.r("extra");
             this.d.write(p0, p1.mExtraInfo);
          }
          if (p1.mKwaiId != null) {
             p0.r("kwaiId");
             TypeAdapters.A.write(p0, p1.mKwaiId);
          }
          if (p1.mBigHeadUrls != null) {
             p0.r("bigHeadUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new v(this)).b(p0, p1.mBigHeadUrls);
          }
          if (p1.mVerifiedDetail != null) {
             p0.r("verifiedDetail");
             this.e.write(p0, p1.mVerifiedDetail);
          }
          if (p1.mCertificationTag != null) {
             p0.r("certificationTag");
             this.f.write(p0, p1.mCertificationTag);
          }
          if (p1.mOpenFriendName != null) {
             p0.r("openFriendName");
             this.g.write(p0, p1.mOpenFriendName);
          }
          if (p1.mEncryptedUserId != null) {
             p0.r("e_uid");
             TypeAdapters.A.write(p0, p1.mEncryptedUserId);
          }
          p0.r("isFrozen");
          p0.P(p1.mFrozen);
          p0.r("visitorBeFollowed");
          p0.P(p1.mVisitorBeFollowed);
          if (p1.mAvatarPendants != null) {
             p0.r("pendantUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new w(this)).b(p0, p1.mAvatarPendants);
          }
          p0.r("pendantType");
          p0.K((long)p1.mPendantType);
          if (p1.mDynamicPendant != null) {
             p0.r("dynamicPendant");
             this.h.write(p0, p1.mDynamicPendant);
          }
          p0.j();
       }
       return;
    }
}
