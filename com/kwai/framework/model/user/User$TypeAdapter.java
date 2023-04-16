package com.kwai.framework.model.user.User$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.ProfilePageInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.DynamicPendant;
import com.kwai.framework.model.user.UserHintColor;
import com.kwai.framework.model.user.UserRankData;
import com.kwai.framework.model.user.UserFollowerRelation;
import com.kwai.framework.model.user.FriendClap;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kwai.framework.model.user.MemorialInfo;
import com.kwai.framework.model.user.OpenFriendName;
import com.kwai.framework.model.user.FansGroupV2Info;
import com.kwai.framework.model.user.MerchantCardEntity$GoodsDetail;
import com.kwai.framework.model.user.MerchantCardEntity$CouponDetail;
import com.kwai.framework.model.user.UserRelationShipLabel;
import com.kwai.framework.model.user.IntimateTag;
import com.kwai.framework.model.user.FollowBottomTags;
import com.kwai.framework.model.user.FollowBottomTags$ShopInfo;
import com.kwai.framework.model.user.FansListExtraInfo;
import com.kwai.framework.model.user.UserStatus$TypeAdapter;
import com.kwai.framework.model.user.UserHeadIcon$TypeAdapter;
import com.kwai.framework.model.user.UserOwnerCount$TypeAdapter;
import com.kwai.framework.model.user.UserExtraInfo$TypeAdapter;
import com.kwai.framework.model.user.UserVerifiedDetail$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kwai.framework.model.user.UserProfileMissUInfo$TypeAdapter;
import com.kwai.framework.model.user.UserCommonPoint$TypeAdapter;
import com.kwai.framework.model.live.LiveTipInfo$TypeAdapter;
import com.kwai.framework.model.user.RichTextMeta$TypeAdapter;
import com.kwai.framework.model.user.NewRecommendStyleInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kwai.framework.model.user.RichTextMeta;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.util.List;
import com.kwai.framework.model.user.NewRecommendStyleInfo;
import com.vimeo.stag.KnownTypeAdapters$i;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.UserOwnerCount;
import com.kwai.framework.model.user.UserVerifiedDetail;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import pa6.o;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.kwai.framework.model.user.UserStatus;
import java.lang.Boolean;
import com.kwai.framework.model.live.LiveTipInfo;
import pa6.m;
import com.kwai.framework.model.user.UserHeadIcon;
import com.kwai.framework.model.user.UserProfileMissUInfo;
import pa6.n;
import com.kwai.framework.model.user.UserCommonPoint;
import com.google.gson.stream.b;
import pa6.j;
import pa6.k;
import pa6.l;

public final class User$TypeAdapter extends TypeAdapter	// class@001732
{
    public final TypeAdapter A;
    public final TypeAdapter B;
    public final TypeAdapter C;
    public final TypeAdapter D;
    public final TypeAdapter E;
    public final TypeAdapter F;
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
    public final TypeAdapter n;
    public final TypeAdapter o;
    public final TypeAdapter p;
    public final TypeAdapter q;
    public final TypeAdapter r;
    public final TypeAdapter s;
    public final TypeAdapter t;
    public final TypeAdapter u;
    public final TypeAdapter v;
    public final TypeAdapter w;
    public final TypeAdapter x;
    public final TypeAdapter y;
    public final TypeAdapter z;
    public static final a G;

    static {
       User$TypeAdapter.G = a.get(User.class);
    }
    public void User$TypeAdapter(Gson p0){
       int i = this;
       Gson gson = p0;
       super();
       i.a = gson;
       i.b = gson.j(a.get(ProfilePageInfo.class));
       i.c = gson.j(a.get(CDNUrl.class));
       i.d = gson.j(UserStatus$TypeAdapter.h);
       i.e = gson.j(UserHeadIcon$TypeAdapter.c);
       i.f = gson.j(a.get(DynamicPendant.class));
       i.g = gson.j(UserOwnerCount$TypeAdapter.b);
       i.h = gson.j(UserExtraInfo$TypeAdapter.n);
       i.i = gson.j(UserVerifiedDetail$TypeAdapter.b);
       i.j = gson.j(a.get(UserHintColor.class));
       i.k = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
       i.l = gson.j(a.get(UserRankData.class));
       i.m = gson.j(UserProfileMissUInfo$TypeAdapter.b);
       i.n = gson.j(a.get(UserFollowerRelation.class));
       i.o = gson.j(a.get(FriendClap.class));
       i.p = gson.j(UserCommonPoint$TypeAdapter.b);
       i.q = gson.j(LiveTipInfo$TypeAdapter.b);
       i.r = gson.j(a.get(FeedLogCtx.class));
       i.s = gson.j(a.get(MemorialInfo.class));
       i.t = gson.j(a.get(OpenFriendName.class));
       i.u = gson.j(RichTextMeta$TypeAdapter.h);
       i.v = gson.j(NewRecommendStyleInfo$TypeAdapter.b);
       i.w = gson.j(a.get(FansGroupV2Info.class));
       i.x = gson.j(a.get(MerchantCardEntity$GoodsDetail.class));
       i.y = gson.j(a.get(MerchantCardEntity$CouponDetail.class));
       TypeAdapter typeAdapter = gson.j(a.get(UserRelationShipLabel.class));
       i.z = typeAdapter;
       i.A = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       i.B = gson.j(a.get(IntimateTag.class));
       typeAdapter = gson.j(a.get(FollowBottomTags.class));
       i.C = typeAdapter;
       i.D = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       i.E = gson.j(a.get(FollowBottomTags$ShopInfo.class));
       i.F = gson.j(a.get(FansListExtraInfo.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, User$TypeAdapter.class, "2");
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
             obj = new User();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x836c5bf8:
                      if (str.equals("subTitle")) {
                         i = 0;
                      }
                      break;
                    case 0x83c775d3:
                      if (str.equals("constellation")) {
                         i = 1;
                      }
                      break;
                    case 0x89201ec8:
                      if (str.equals("verified")) {
                         i = 2;
                      }
                      break;
                    case 0x89b53b3d:
                      if (str.equals("profilePagePrefetchInfo")) {
                         i = 3;
                      }
                      break;
                    case 0x8a0d016e:
                      if (str.equals("hasGreeted")) {
                         i = 4;
                      }
                      break;
                    case 0x8c70b665:
                      if (str.equals("commonPoint")) {
                         i = 5;
                      }
                      break;
                    case 0x8e49b4d7:
                      if (str.equals("haveIntimatePropose")) {
                         i = 6;
                      }
                      break;
                    case 0x917871c6:
                      if (str.equals("userCancelled")) {
                         i = 7;
                      }
                      break;
                    case 0x91e3ac37:
                      if (str.equals("isDefaultHead")) {
                         i = 8;
                      }
                      break;
                    case 0x93b9c298:
                      if (str.equals("showMissYouButton")) {
                         i = 9;
                      }
                      break;
                    case 0x9538237c:
                      if (str.equals("titleLabel")) {
                         i = 10;
                      }
                      break;
                    case 0x9743a216:
                      if (str.equals("friendClap")) {
                         i = 11;
                      }
                      break;
                    case 0x9bb634e4:
                      if (str.equals("bottomTags")) {
                         i = 12;
                      }
                      break;
                    case 0x9be140f6:
                      if (str.equals("pendantType")) {
                         i = 13;
                      }
                      break;
                    case 0x9be19aa0:
                      if (str.equals("pendantUrls")) {
                         i = 14;
                      }
                      break;
                    case 0x9dd0584b:
                      if (str.equals("missuStatus")) {
                         i = 15;
                      }
                      break;
                    case 0xa1f71600:
                      if (str.equals("fansListExtraInfo")) {
                         i = 16;
                      }
                      break;
                    case 0xa3a4d54b:
                      if (str.equals("tagDesc")) {
                         i = 17;
                      }
                      break;
                    case 0xa4ac5cbf:
                      if (str.equals("user_profile_bg_url")) {
                         i = 18;
                      }
                      break;
                    case 0xa8de97d8:
                      if (str.equals("displayUserName")) {
                         i = 19;
                      }
                      break;
                    case 0xb1abfe8b:
                      if (str.equals("mobile_hash")) {
                         i = 20;
                      }
                      break;
                    case 0xb1f22278:
                      if (str.equals("exp_tag")) {
                         i = 21;
                      }
                      break;
                    case 0xb350a344:
                      if (str.equals("message_deny")) {
                         i = 22;
                      }
                      break;
                    case 0xb5406c39:
                      if (str.equals("intimateType")) {
                         i = 23;
                      }
                      break;
                    case 0xb56c2e7a:
                      if (str.equals("recoTextInfo")) {
                         i = 24;
                      }
                      break;
                    case 0xb9ac910b:
                      if (str.equals("isFriends")) {
                         i = 25;
                      }
                      break;
                    case 0xba37dc66:
                      if (str.equals("hasRemoved")) {
                         i = 26;
                      }
                      break;
                    case 0xba45b12c:
                      if (str.equals("hasUnreadFeeds")) {
                         i = 27;
                      }
                      break;
                    case 0xbd5122cf:
                      if (str.equals("kwaiId")) {
                         i = 28;
                      }
                      break;
                    case 0xbd798e79:
                      if (str.equals("headIcon")) {
                         i = 29;
                      }
                      break;
                    case 0xbd8dc6c4:
                      if (str.equals("headurls")) {
                         i = 30;
                      }
                      break;
                    case 0xbe0dc4df:
                      if (str.equals("city_name")) {
                         i = 31;
                      }
                      break;
                    case 0xbe4a42a9:
                      if (str.equals("living")) {
                         i = 32;
                      }
                      break;
                    case 0xc3aab653:
                      if (str.equals("online")) {
                         i = 33;
                      }
                      break;
                    case 0xc49368ae:
                      if (str.equals("onLineTimeInfo")) {
                         i = 34;
                      }
                      break;
                    case 0xc5136243:
                      if (str.equals("distanceInfo")) {
                         i = 35;
                      }
                      break;
                    case 0xc8459244:
                      if (str.equals("reason")) {
                         i = 36;
                      }
                      break;
                    case 0xca2afeb1:
                      if (str.equals("shopId")) {
                         i = 37;
                      }
                      break;
                    case 0xcab26afe:
                      if (str.equals("isPrivacy")) {
                         i = 38;
                      }
                      break;
                    case 0xcae438c6:
                      if (str.equals("hiddenUserDesc")) {
                         i = 39;
                      }
                      break;
                    case 0xcae8b4c0:
                      if (str.equals("hiddenUserName")) {
                         i = 40;
                      }
                      break;
                    case 0xcbf1c8a1:
                      if (str.equals("messageLink")) {
                         i = 41;
                      }
                      break;
                    case 0xcd10f30c:
                      if (str.equals("unreadPhotoCount")) {
                         i = 42;
                      }
                      break;
                    case 0xcd6fae00:
                      if (str.equals("photoInfo")) {
                         i = 43;
                      }
                      break;
                    case 0xd4f270e8:
                      if (str.equals("isBanned")) {
                         i = 44;
                      }
                      break;
                    case 0xd832e1c7:
                      if (str.equals("liveStreamId")) {
                         i = 45;
                      }
                      break;
                    case 0xd8fec612:
                      if (str.equals("user_banned")) {
                         i = 46;
                      }
                      break;
                    case 0xda817622:
                      if (str.equals("privacy_user")) {
                         i = 47;
                      }
                      break;
                    case 0xdb64e054:
                      if (str.equals("isBlacked")) {
                         i = 48;
                      }
                      break;
                    case 0xdbd4ac3e:
                      if (str.equals("isFavorited")) {
                         i = 49;
                      }
                      break;
                    case 0xdc27b220:
                      if (str.equals("relationRecommend")) {
                         i = 50;
                      }
                      break;
                    case 0xdc949cb5:
                      if (str.equals("exactMatchTip")) {
                         i = 51;
                      }
                      break;
                    case 0xdcb2fc68:
                      if (str.equals("isFriend")) {
                         i = 52;
                      }
                      break;
                    case 0xe6773473:
                      if (str.equals("isLiving")) {
                         i = 53;
                      }
                      break;
                    case 0xe981ae5d:
                      if (str.equals("dynamicPendant")) {
                         i = 54;
                      }
                      break;
                    case 0xe9a8edb0:
                      if (str.equals("isNewest")) {
                         i = 55;
                      }
                      break;
                    case 0xeb6648c4:
                      if (str.equals("shopInfo")) {
                         i = 56;
                      }
                      break;
                    case 0xeb679410:
                      if (str.equals("shopLink")) {
                         i = 57;
                      }
                      break;
                    case 0xed412388:
                      if (str.equals("privacy")) {
                         i = 58;
                      }
                      break;
                    case 0xeeb94347:
                      if (str.equals("goodsDetail")) {
                         i = 59;
                      }
                      break;
                    case 0xf01abd62:
                      if (str.equals("userMood")) {
                         i = 60;
                      }
                      break;
                    case 0xf022f9f2:
                      if (str.equals("user_sex")) {
                         i = 61;
                      }
                      break;
                    case 0xf0df3b94:
                      if (str.equals("user_profile_bg_urls")) {
                         i = 62;
                      }
                      break;
                    case 0xf21e5baa:
                      if (str.equals("memorialInfo")) {
                         i = 63;
                      }
                      break;
                    case 0xf2a5612f:
                      if (str.equals("fansCount")) {
                         i = 64;
                      }
                      break;
                    case 0xf2df069f:
                      if (str.equals("fansGroup")) {
                         i = 65;
                      }
                      break;
                    case 0xf6183571:
                      if (str.equals("authorDescription")) {
                         i = 66;
                      }
                      break;
                    case 0xf73a7d34:
                      if (str.equals("userAge")) {
                         i = 67;
                      }
                      break;
                    case 0xf73aee0f:
                      if (str.equals("user_id")) {
                         i = 68;
                      }
                      break;
                    case 0xf73c9674:
                      if (str.equals("likerTags")) {
                         i = 69;
                      }
                      break;
                    case 0xf9beed39:
                      if (str.equals("verifiedDetail")) {
                         i = 70;
                      }
                      break;
                    case 0xfbac7c81:
                      if (str.equals("visitorBeFollowed")) {
                         i = 71;
                      }
                      break;
                    case 0xfe5c1895:
                      if (str.equals("hiddenUser")) {
                         i = 72;
                      }
                      break;
                    case 0x1d7173:
                      if (str.equals("followActionReasonTextId")) {
                         i = 73;
                      }
                      break;
                    case 0x2fd7c0:
                      if (str.equals("fans")) {
                         i = 74;
                      }
                      break;
                    case 0x30de87:
                      if (str.equals("hint")) {
                         i = 75;
                      }
                      break;
                    case 0x3652cd:
                      if (str.equals("time")) {
                         i = 76;
                      }
                      break;
                    case 0x36eb0c:
                      if (str.equals("us_m")) {
                         i = 77;
                      }
                      break;
                    case 0x1df0363:
                      if (str.equals("download_deny")) {
                         i = 78;
                      }
                      break;
                    case 0x2051381:
                      if (str.equals("feedLogCtx")) {
                         i = 79;
                      }
                      break;
                    case 0x4d59483:
                      if (str.equals("owner_count")) {
                         i = 80;
                      }
                      break;
                    case 0x5c79410:
                      if (str.equals("extra")) {
                         i = 81;
                      }
                      break;
                    case 0x5d8c6bb:
                      if (str.equals("intimateTag")) {
                         i = 82;
                      }
                      break;
                    case 0x9eb682a:
                      if (str.equals("followFromPage")) {
                         i = 83;
                      }
                      break;
                    case 0xbebf8a6:
                      if (str.equals("intimateRelationName")) {
                         i = 84;
                      }
                      break;
                    case 0xdfb2f92:
                      if (str.equals("missu_deny")) {
                         i = 85;
                      }
                      break;
                    case 0xf3bb9f6:
                      if (str.equals("rankData")) {
                         i = 86;
                      }
                      break;
                    case 0xf3e2efa:
                      if (str.equals("rankInfo")) {
                         i = 87;
                      }
                      break;
                    case 0x11318bf5:
                      if (str.equals("distance")) {
                         i = 88;
                      }
                      break;
                    case 0x1158522a:
                      if (str.equals("newStyleUserInfo")) {
                         i = 89;
                      }
                      break;
                    case 0x11fd2010:
                      if (str.equals("followed")) {
                         i = 90;
                      }
                      break;
                    case 0x1439ee7f:
                      if (str.equals("user_name")) {
                         i = 91;
                      }
                      break;
                    case 0x143cb921:
                      if (str.equals("user_text")) {
                         i = 92;
                      }
                      break;
                    case 0x20e382e4:
                      if (str.equals("userVipStatus")) {
                         i = 93;
                      }
                      break;
                    case 0x23febbfa:
                      if (str.equals("contactRelationFriend")) {
                         i = 94;
                      }
                      break;
                    case 0x243cfd23:
                      if (str.equals("enableGoToProfile")) {
                         i = 95;
                      }
                      break;
                    case 0x256b0f79:
                      if (str.equals("photoAuthorRelation")) {
                         i = 96;
                      }
                      break;
                    case 0x2c072a31:
                      if (str.equals("userVipStatusText")) {
                         i = 97;
                      }
                      break;
                    case 0x2d2cca44:
                      if (str.equals("unshowFeedIds")) {
                         i = 98;
                      }
                      break;
                    case 0x2f64ebec:
                      if (str.equals("comment_deny")) {
                         i = 99;
                      }
                      break;
                    case 0x2f67ab8f:
                      if (str.equals("headurl")) {
                         i = 100;
                      }
                      break;
                    case 0x457a3de2:
                      if (str.equals("shopSoldAmount")) {
                         i = 101;
                      }
                      break;
                    case 0x45d65478:
                      if (str.equals("headImages")) {
                         i = 102;
                      }
                      break;
                    case 0x489fea31:
                      if (str.equals("guestIntimateType")) {
                         i = 103;
                      }
                      break;
                    case 0x4bbca817:
                      if (str.equals("couponDetail")) {
                         i = 104;
                      }
                      break;
                    case 0x4c28a34a:
                      if (str.equals("contact_name")) {
                         i = 105;
                      }
                      break;
                    case 0x53346269:
                      if (str.equals("enableShowProfile")) {
                         i = 106;
                      }
                      break;
                    case 0x547b33ba:
                      if (str.equals("liveInfo")) {
                         i = 107;
                      }
                      break;
                    case 0x592aafe8:
                      if (str.equals("liveStreamJumperUrl")) {
                         i = 108;
                      }
                      break;
                    case 0x59f2a833:
                      if (str.equals("openFriendName")) {
                         i = 109;
                      }
                      break;
                    case 0x5b468458:
                      if (str.equals("hasReverseRemoved")) {
                         i = 110;
                      }
                      break;
                    case 0x5bc4581a:
                      if (str.equals("introduction")) {
                         i = 111;
                      }
                      break;
                    case 0x5bec5d1c:
                      if (str.equals("hintColor")) {
                         i = 112;
                      }
                      break;
                    case 0x5fb95abd:
                      if (str.equals("liveStreamIdEncode")) {
                         i = 113;
                      }
                      break;
                    case 0x60e4c197:
                      if (str.equals("secondaryRecoReason")) {
                         i = 114;
                      }
                      break;
                    case 0x6cfe3db6:
                      if (str.equals("intimateShowTimeText")) {
                         i = 115;
                      }
                      break;
                    case 0x6f1e7155:
                      if (str.equals("followReason")) {
                         i = 116;
                      }
                      break;
                    case 0x6fbd6873:
                      if (str.equals("platform")) {
                         i = 117;
                      }
                      break;
                    case 0x72f574af:
                      if (str.equals("followBackMessage")) {
                         i = 118;
                      }
                      break;
                    case 0x73e0072b:
                      if (str.equals("open_username")) {
                         i = 119;
                      }
                      break;
                    case 0x7b41c7c8:
                      if (str.equals("rightExpireTime")) {
                         i = 120;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSubtitle = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mConstellation = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mVerified = KnownTypeAdapters$g.a(p0, obj.mVerified);
                      break;
                    case 3:
                      obj.mProfilePageInfo = this.b.read(p0);
                      break;
                    case 4:
                      obj.mHasGreeted = KnownTypeAdapters$g.a(p0, obj.mHasGreeted);
                      break;
                    case 5:
                      obj.mCommonPoint = this.p.read(p0);
                      break;
                    case 6:
                      obj.mHaveIntimatePropose = KnownTypeAdapters$g.a(p0, obj.mHaveIntimatePropose);
                      break;
                    case 7:
                      obj.mAccountCanceled = KnownTypeAdapters$g.a(p0, obj.mAccountCanceled);
                      break;
                    case 8:
                      obj.mIsDefaultHead = KnownTypeAdapters$g.a(p0, obj.mIsDefaultHead);
                      break;
                    case 9:
                      obj.mShowMissYouButton = TypeAdapters.e.read(p0);
                      break;
                    case 10:
                      obj.mTitleLabel = TypeAdapters.A.read(p0);
                      break;
                    case 11:
                      obj.mFriendClap = this.o.read(p0);
                      break;
                    case 12:
                      obj.mBottomTags = this.D.read(p0);
                      break;
                    case 13:
                      obj.mPendantType = KnownTypeAdapters$k.a(p0, obj.mPendantType);
                      break;
                    case 14:
                      obj.mPendants = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new n(this)).a(p0);
                      break;
                    case 15:
                      obj.mMissUInfo = this.m.read(p0);
                      break;
                    case 16:
                      obj.mFansListExtraInfo = this.F.read(p0);
                      break;
                    case 17:
                      obj.mTagDesc = TypeAdapters.A.read(p0);
                      break;
                    case 18:
                      obj.mBackgroundUrl = TypeAdapters.A.read(p0);
                      break;
                    case 19:
                      obj.mDisplayUserName = TypeAdapters.A.read(p0);
                      break;
                    case 20:
                      obj.mMobileHash = TypeAdapters.A.read(p0);
                      break;
                    case 21:
                      obj.mExpTag = TypeAdapters.A.read(p0);
                      break;
                    case 22:
                      obj.mMessageDeny = KnownTypeAdapters$g.a(p0, obj.mMessageDeny);
                      break;
                    case 23:
                      obj.mIntimateRelationType = KnownTypeAdapters$k.a(p0, obj.mIntimateRelationType);
                      break;
                    case 24:
                      obj.mMainRecoReason = this.u.read(p0);
                      break;
                    case 25:
                    case '4':
                      obj.mFriend = KnownTypeAdapters$g.a(p0, obj.mFriend);
                      break;
                    case 26:
                      obj.mHasRemoved = KnownTypeAdapters$g.a(p0, obj.mHasRemoved);
                      break;
                    case 27:
                      obj.mHasUnreadFeeds = KnownTypeAdapters$g.a(p0, obj.mHasUnreadFeeds);
                      break;
                    case 28:
                      obj.mKwaiId = TypeAdapters.A.read(p0);
                      break;
                    case 29:
                      obj.mHeadIcon = this.e.read(p0);
                      break;
                    case 30:
                      obj.mAvatars = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new m(this)).a(p0);
                      break;
                    case 31:
                      obj.mCityStr = TypeAdapters.A.read(p0);
                      break;
                    case 32:
                      obj.mLiveTipInfo = this.q.read(p0);
                      break;
                    case '!':
                      obj.mIsOnline = TypeAdapters.e.read(p0);
                      break;
                    case '"':
                      obj.mOnlineTimeInfo = TypeAdapters.A.read(p0);
                      break;
                    case '#':
                      obj.mDistanceInfo = TypeAdapters.A.read(p0);
                      break;
                    case '$':
                      obj.mSuggestReason = KnownTypeAdapters$k.a(p0, obj.mSuggestReason);
                      break;
                    case '%':
                      obj.mShopId = TypeAdapters.A.read(p0);
                      break;
                    case '&':
                    case '/':
                    case ':':
                      obj.mPrivate = KnownTypeAdapters$g.a(p0, obj.mPrivate);
                      break;
                    case 39:
                      obj.mHiddenUserDesc = TypeAdapters.A.read(p0);
                      break;
                    case '(':
                      obj.mHiddenUserName = TypeAdapters.A.read(p0);
                      break;
                    case ')':
                      obj.mMessageLink = TypeAdapters.A.read(p0);
                      break;
                    case '*':
                      obj.mUnreadPhotoCount = KnownTypeAdapters$k.a(p0, obj.mUnreadPhotoCount);
                      break;
                    case '+':
                      obj.mPhotoInfo = TypeAdapters.A.read(p0);
                      break;
                    case ',':
                      obj.mIsBanned = KnownTypeAdapters$g.a(p0, obj.mIsBanned);
                      break;
                    case '-':
                      obj.mLiveStreamId = TypeAdapters.A.read(p0);
                      break;
                    case '.':
                      obj.mBanned = KnownTypeAdapters$g.a(p0, obj.mBanned);
                      break;
                    case '0':
                      obj.mBlacked = KnownTypeAdapters$g.a(p0, obj.mBlacked);
                      break;
                    case '1':
                      obj.mFavorited = KnownTypeAdapters$g.a(p0, obj.mFavorited);
                      break;
                    case '2':
                      obj.mFollowerRelation = this.n.read(p0);
                      break;
                    case '3':
                      obj.mExactMatchTip = TypeAdapters.A.read(p0);
                      break;
                    case '5':
                      obj.mIsLiving = KnownTypeAdapters$g.a(p0, obj.mIsLiving);
                      break;
                    case '6':
                      obj.mDynamicPendant = this.f.read(p0);
                      break;
                    case '7':
                      obj.mNewest = KnownTypeAdapters$g.a(p0, obj.mNewest);
                      break;
                    case '8':
                      obj.mShopInfo = this.E.read(p0);
                      break;
                    case '9':
                      obj.mshopLink = TypeAdapters.A.read(p0);
                      break;
                    case ';':
                      obj.mGoodsDetail = this.x.read(p0);
                      break;
                    case '<':
                      obj.mUserMood = this.d.read(p0);
                      break;
                    case '=':
                      obj.mSex = TypeAdapters.A.read(p0);
                      break;
                    case '>':
                      obj.mBackgroundUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.c, new o(this)).a(p0);
                      break;
                    case '?':
                      obj.mMemorialInfo = this.s.read(p0);
                      break;
                    case '@':
                      obj.mFansCount = KnownTypeAdapters$k.a(p0, obj.mFansCount);
                      break;
                    case 'A':
                      obj.mFansGroupV2Info = this.w.read(p0);
                      break;
                    case 'B':
                      obj.mAuthorDes = TypeAdapters.A.read(p0);
                      break;
                    case 'C':
                      obj.mUserAge = KnownTypeAdapters$k.a(p0, obj.mUserAge);
                      break;
                    case 'D':
                      obj.mId = TypeAdapters.A.read(p0);
                      break;
                    case 'E':
                      obj.mRelationShipLabels = this.A.read(p0);
                      break;
                    case 'F':
                      obj.mVerifiedDetail = this.i.read(p0);
                      break;
                    case 'G':
                      obj.mVisitorBeFollowed = KnownTypeAdapters$g.a(p0, obj.mVisitorBeFollowed);
                      break;
                    case 'H':
                      obj.mIsHiddenUser = KnownTypeAdapters$g.a(p0, obj.mIsHiddenUser);
                      break;
                    case 'I':
                      obj.mFollowActionReasonTextId = TypeAdapters.A.read(p0);
                      break;
                    case 'J':
                      obj.mIsFans = KnownTypeAdapters$g.a(p0, obj.mIsFans);
                      break;
                    case 'K':
                      obj.hint = TypeAdapters.A.read(p0);
                      break;
                    case 'L':
                      obj.mTime = TypeAdapters.A.read(p0);
                      break;
                    case 'M':
                      obj.mUserMessageDeny = KnownTypeAdapters$g.a(p0, obj.mUserMessageDeny);
                      break;
                    case 'N':
                      obj.mDownloadDeny = KnownTypeAdapters$g.a(p0, obj.mDownloadDeny);
                      break;
                    case 'O':
                      obj.mFeedLogCtx = this.r.read(p0);
                      break;
                    case 'P':
                      obj.mOwnerCount = this.g.read(p0);
                      break;
                    case 'Q':
                      obj.mExtraInfo = this.h.read(p0);
                      break;
                    case 'R':
                      obj.mIntimateTag = this.B.read(p0);
                      break;
                    case 'S':
                      obj.mFollowFromPage = KnownTypeAdapters$k.a(p0, obj.mFollowFromPage);
                      break;
                    case 'T':
                      obj.mIntimateRelationName = TypeAdapters.A.read(p0);
                      break;
                    case 'U':
                      obj.mMissUDeny = KnownTypeAdapters$g.a(p0, obj.mMissUDeny);
                      break;
                    case 'V':
                      obj.mUserRankData = this.l.read(p0);
                      break;
                    case 'W':
                      obj.mRankInfo = TypeAdapters.A.read(p0);
                      break;
                    case 'X':
                      obj.mDistance = KnownTypeAdapters$i.a(p0, obj.mDistance);
                      break;
                    case 'Y':
                      obj.mNewRecommendStyleInfo = this.v.read(p0);
                      break;
                    case 'Z':
                      obj.mFollowed = KnownTypeAdapters$g.a(p0, obj.mFollowed);
                      break;
                    case '[':
                      obj.mName = TypeAdapters.A.read(p0);
                      break;
                    case 92:
                      obj.mText = TypeAdapters.A.read(p0);
                      break;
                    case ']':
                      obj.mVip = KnownTypeAdapters$k.a(p0, obj.mVip);
                      break;
                    case '^':
                      obj.mContactRelationFriend = KnownTypeAdapters$g.a(p0, obj.mContactRelationFriend);
                      break;
                    case '_':
                      obj.mEnableGoToProfile = KnownTypeAdapters$g.a(p0, obj.mEnableGoToProfile);
                      break;
                    case '`':
                      obj.mAuthorRelation = TypeAdapters.A.read(p0);
                      break;
                    case 'a':
                      obj.mUserVipStatusText = TypeAdapters.A.read(p0);
                      break;
                    case 'b':
                      obj.mUnshowFeedIds = this.k.read(p0);
                      break;
                    case 'c':
                      obj.mCommentDeny = KnownTypeAdapters$g.a(p0, obj.mCommentDeny);
                      break;
                    case 'd':
                      obj.mAvatar = TypeAdapters.A.read(p0);
                      break;
                    case 'e':
                      obj.mShopSoldAmount = TypeAdapters.A.read(p0);
                      break;
                    case 'f':
                      obj.mFansImages = this.k.read(p0);
                      break;
                    case 'g':
                      obj.mGuestIntimateRelationType = KnownTypeAdapters$k.a(p0, obj.mGuestIntimateRelationType);
                      break;
                    case 'h':
                      obj.mCouponDetail = this.y.read(p0);
                      break;
                    case 'i':
                    case 'w':
                      obj.mPlatformUserName = TypeAdapters.A.read(p0);
                      break;
                    case 'j':
                      obj.mIsIntimateRelationProfileShow = KnownTypeAdapters$g.a(p0, obj.mIsIntimateRelationProfileShow);
                      break;
                    case 'k':
                      obj.mLiveInfo = TypeAdapters.A.read(p0);
                      break;
                    case 'l':
                      obj.mLiveStreamJumperUrl = TypeAdapters.A.read(p0);
                      break;
                    case 'm':
                      obj.mOpenFriendName = this.t.read(p0);
                      break;
                    case 'n':
                      obj.mHasReverseRemoved = KnownTypeAdapters$g.a(p0, obj.mHasReverseRemoved);
                      break;
                    case 'o':
                      obj.mIntroduction = TypeAdapters.A.read(p0);
                      break;
                    case 'p':
                      obj.mUserHintColor = this.j.read(p0);
                      break;
                    case 'q':
                      obj.mLiveStreamIdEncode = TypeAdapters.A.read(p0);
                      break;
                    case 'r':
                      obj.mSecondaryRecoReason = this.u.read(p0);
                      break;
                    case 's':
                      obj.mIntimateTimeText = TypeAdapters.A.read(p0);
                      break;
                    case 't':
                      obj.mFollowReason = TypeAdapters.A.read(p0);
                      break;
                    case 'u':
                      obj.mPlatform = KnownTypeAdapters$k.a(p0, obj.mPlatform);
                      break;
                    case 'v':
                      obj.mFollowBackMessage = TypeAdapters.A.read(p0);
                      break;
                    case 'x':
                      obj.mRightExpireTime = KnownTypeAdapters$n.a(p0, obj.mRightExpireTime);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, User$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mId != null) {
             p0.r("user_id");
             TypeAdapters.A.write(p0, p1.mId);
          }
          if (p1.mName != null) {
             p0.r("user_name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mDisplayUserName != null) {
             p0.r("displayUserName");
             TypeAdapters.A.write(p0, p1.mDisplayUserName);
          }
          if (p1.mPlatformUserName != null) {
             p0.r("contact_name");
             TypeAdapters.A.write(p0, p1.mPlatformUserName);
          }
          if (p1.mSex != null) {
             p0.r("user_sex");
             TypeAdapters.A.write(p0, p1.mSex);
          }
          if (p1.mProfilePageInfo != null) {
             p0.r("profilePagePrefetchInfo");
             this.b.write(p0, p1.mProfilePageInfo);
          }
          if (p1.mAvatar != null) {
             p0.r("headurl");
             TypeAdapters.A.write(p0, p1.mAvatar);
          }
          if (p1.mAvatars != null) {
             p0.r("headurls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new j(this)).b(p0, p1.mAvatars);
          }
          if (p1.mUserMood != null) {
             p0.r("userMood");
             this.d.write(p0, p1.mUserMood);
          }
          if (p1.mHeadIcon != null) {
             p0.r("headIcon");
             this.e.write(p0, p1.mHeadIcon);
          }
          if (p1.mDynamicPendant != null) {
             p0.r("dynamicPendant");
             this.f.write(p0, p1.mDynamicPendant);
          }
          if (p1.mPendants != null) {
             p0.r("pendantUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new k(this)).b(p0, p1.mPendants);
          }
          p0.r("pendantType");
          p0.K((long)p1.mPendantType);
          if (p1.mText != null) {
             p0.r("user_text");
             TypeAdapters.A.write(p0, p1.mText);
          }
          if (p1.mTime != null) {
             p0.r("time");
             TypeAdapters.A.write(p0, p1.mTime);
          }
          if (p1.mBackgroundUrl != null) {
             p0.r("user_profile_bg_url");
             TypeAdapters.A.write(p0, p1.mBackgroundUrl);
          }
          if (p1.mBackgroundUrls != null) {
             p0.r("user_profile_bg_urls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.c, new l(this)).b(p0, p1.mBackgroundUrls);
          }
          p0.r("privacy");
          p0.P(p1.mPrivate);
          p0.r("isFriend");
          p0.P(p1.mFriend);
          p0.r("isFavorited");
          p0.P(p1.mFavorited);
          if (p1.mMobileHash != null) {
             p0.r("mobile_hash");
             TypeAdapters.A.write(p0, p1.mMobileHash);
          }
          p0.r("isBlacked");
          p0.P(p1.mBlacked);
          p0.r("user_banned");
          p0.P(p1.mBanned);
          p0.r("userCancelled");
          p0.P(p1.mAccountCanceled);
          p0.r("distance");
          p0.J(p1.mDistance);
          p0.r("platform");
          p0.K((long)p1.mPlatform);
          if (p1.mOwnerCount != null) {
             p0.r("owner_count");
             this.g.write(p0, p1.mOwnerCount);
          }
          if (p1.mKwaiId != null) {
             p0.r("kwaiId");
             TypeAdapters.A.write(p0, p1.mKwaiId);
          }
          p0.r("comment_deny");
          p0.P(p1.mCommentDeny);
          p0.r("download_deny");
          p0.P(p1.mDownloadDeny);
          p0.r("message_deny");
          p0.P(p1.mMessageDeny);
          p0.r("us_m");
          p0.P(p1.mUserMessageDeny);
          p0.r("missu_deny");
          p0.P(p1.mMissUDeny);
          if (p1.mExtraInfo != null) {
             p0.r("extra");
             this.h.write(p0, p1.mExtraInfo);
          }
          if (p1.mExactMatchTip != null) {
             p0.r("exactMatchTip");
             TypeAdapters.A.write(p0, p1.mExactMatchTip);
          }
          if (p1.mVerifiedDetail != null) {
             p0.r("verifiedDetail");
             this.i.write(p0, p1.mVerifiedDetail);
          }
          if (p1.mIsOnline != null) {
             p0.r("online");
             TypeAdapters.e.write(p0, p1.mIsOnline);
          }
          p0.r("fansCount");
          p0.K((long)p1.mFansCount);
          if (p1.hint != null) {
             p0.r("hint");
             TypeAdapters.A.write(p0, p1.hint);
          }
          if (p1.mUserHintColor != null) {
             p0.r("hintColor");
             this.j.write(p0, p1.mUserHintColor);
          }
          if (p1.mPhotoInfo != null) {
             p0.r("photoInfo");
             TypeAdapters.A.write(p0, p1.mPhotoInfo);
          }
          p0.r("fans");
          p0.P(p1.mIsFans);
          if (p1.mMessageLink != null) {
             p0.r("messageLink");
             TypeAdapters.A.write(p0, p1.mMessageLink);
          }
          p0.r("hiddenUser");
          p0.P(p1.mIsHiddenUser);
          if (p1.mHiddenUserName != null) {
             p0.r("hiddenUserName");
             TypeAdapters.A.write(p0, p1.mHiddenUserName);
          }
          if (p1.mHiddenUserDesc != null) {
             p0.r("hiddenUserDesc");
             TypeAdapters.A.write(p0, p1.mHiddenUserDesc);
          }
          p0.r("enableGoToProfile");
          p0.P(p1.mEnableGoToProfile);
          p0.r("contactRelationFriend");
          p0.P(p1.mContactRelationFriend);
          p0.r("reason");
          p0.K((long)p1.mSuggestReason);
          if (p1.mAuthorRelation != null) {
             p0.r("photoAuthorRelation");
             TypeAdapters.A.write(p0, p1.mAuthorRelation);
          }
          if (p1.mAuthorDes != null) {
             p0.r("authorDescription");
             TypeAdapters.A.write(p0, p1.mAuthorDes);
          }
          if (p1.mExpTag != null) {
             p0.r("exp_tag");
             TypeAdapters.A.write(p0, p1.mExpTag);
          }
          if (p1.mFollowActionReasonTextId != null) {
             p0.r("followActionReasonTextId");
             TypeAdapters.A.write(p0, p1.mFollowActionReasonTextId);
          }
          if (p1.mUnshowFeedIds != null) {
             p0.r("unshowFeedIds");
             this.k.write(p0, p1.mUnshowFeedIds);
          }
          p0.r("hasUnreadFeeds");
          p0.P(p1.mHasUnreadFeeds);
          p0.r("unreadPhotoCount");
          p0.K((long)p1.mUnreadPhotoCount);
          if (p1.mCityStr != null) {
             p0.r("city_name");
             TypeAdapters.A.write(p0, p1.mCityStr);
          }
          if (p1.mRankInfo != null) {
             p0.r("rankInfo");
             TypeAdapters.A.write(p0, p1.mRankInfo);
          }
          if (p1.mUserRankData != null) {
             p0.r("rankData");
             this.l.write(p0, p1.mUserRankData);
          }
          p0.r("userVipStatus");
          p0.K((long)p1.mVip);
          p0.r("rightExpireTime");
          p0.K(p1.mRightExpireTime);
          if (p1.mUserVipStatusText != null) {
             p0.r("userVipStatusText");
             TypeAdapters.A.write(p0, p1.mUserVipStatusText);
          }
          if (p1.mShopSoldAmount != null) {
             p0.r("shopSoldAmount");
             TypeAdapters.A.write(p0, p1.mShopSoldAmount);
          }
          p0.r("verified");
          p0.P(p1.mVerified);
          if (p1.mFollowReason != null) {
             p0.r("followReason");
             TypeAdapters.A.write(p0, p1.mFollowReason);
          }
          if (p1.mFollowBackMessage != null) {
             p0.r("followBackMessage");
             TypeAdapters.A.write(p0, p1.mFollowBackMessage);
          }
          p0.r("isNewest");
          p0.P(p1.mNewest);
          p0.r("followed");
          p0.P(p1.mFollowed);
          p0.r("visitorBeFollowed");
          p0.P(p1.mVisitorBeFollowed);
          if (p1.mSubtitle != null) {
             p0.r("subTitle");
             TypeAdapters.A.write(p0, p1.mSubtitle);
          }
          if (p1.mMissUInfo != null) {
             p0.r("missuStatus");
             this.m.write(p0, p1.mMissUInfo);
          }
          if (p1.mFollowerRelation != null) {
             p0.r("relationRecommend");
             this.n.write(p0, p1.mFollowerRelation);
          }
          p0.r("followFromPage");
          p0.K((long)p1.mFollowFromPage);
          if (p1.mFriendClap != null) {
             p0.r("friendClap");
             this.o.write(p0, p1.mFriendClap);
          }
          p0.r("isLiving");
          p0.P(p1.mIsLiving);
          p0.r("userAge");
          p0.K((long)p1.mUserAge);
          if (p1.mDistanceInfo != null) {
             p0.r("distanceInfo");
             TypeAdapters.A.write(p0, p1.mDistanceInfo);
          }
          if (p1.mOnlineTimeInfo != null) {
             p0.r("onLineTimeInfo");
             TypeAdapters.A.write(p0, p1.mOnlineTimeInfo);
          }
          if (p1.mLiveInfo != null) {
             p0.r("liveInfo");
             TypeAdapters.A.write(p0, p1.mLiveInfo);
          }
          if (p1.mCommonPoint != null) {
             p0.r("commonPoint");
             this.p.write(p0, p1.mCommonPoint);
          }
          p0.r("hasGreeted");
          p0.P(p1.mHasGreeted);
          if (p1.mConstellation != null) {
             p0.r("constellation");
             TypeAdapters.A.write(p0, p1.mConstellation);
          }
          p0.r("isDefaultHead");
          p0.P(p1.mIsDefaultHead);
          if (p1.mLiveTipInfo != null) {
             p0.r("living");
             this.q.write(p0, p1.mLiveTipInfo);
          }
          if (p1.mFeedLogCtx != null) {
             p0.r("feedLogCtx");
             this.r.write(p0, p1.mFeedLogCtx);
          }
          if (p1.mMemorialInfo != null) {
             p0.r("memorialInfo");
             this.s.write(p0, p1.mMemorialInfo);
          }
          if (p1.mOpenFriendName != null) {
             p0.r("openFriendName");
             this.t.write(p0, p1.mOpenFriendName);
          }
          if (p1.mShowMissYouButton != null) {
             p0.r("showMissYouButton");
             TypeAdapters.e.write(p0, p1.mShowMissYouButton);
          }
          p0.r("isBanned");
          p0.P(p1.mIsBanned);
          if (p1.mMainRecoReason != null) {
             p0.r("recoTextInfo");
             this.u.write(p0, p1.mMainRecoReason);
          }
          if (p1.mNewRecommendStyleInfo != null) {
             p0.r("newStyleUserInfo");
             this.v.write(p0, p1.mNewRecommendStyleInfo);
          }
          if (p1.mSecondaryRecoReason != null) {
             p0.r("secondaryRecoReason");
             this.u.write(p0, p1.mSecondaryRecoReason);
          }
          if (p1.mFansGroupV2Info != null) {
             p0.r("fansGroup");
             this.w.write(p0, p1.mFansGroupV2Info);
          }
          if (p1.mTitleLabel != null) {
             p0.r("titleLabel");
             TypeAdapters.A.write(p0, p1.mTitleLabel);
          }
          if (p1.mIntroduction != null) {
             p0.r("introduction");
             TypeAdapters.A.write(p0, p1.mIntroduction);
          }
          if (p1.mLiveStreamId != null) {
             p0.r("liveStreamId");
             TypeAdapters.A.write(p0, p1.mLiveStreamId);
          }
          if (p1.mLiveStreamIdEncode != null) {
             p0.r("liveStreamIdEncode");
             TypeAdapters.A.write(p0, p1.mLiveStreamIdEncode);
          }
          if (p1.mShopId != null) {
             p0.r("shopId");
             TypeAdapters.A.write(p0, p1.mShopId);
          }
          if (p1.mFansImages != null) {
             p0.r("headImages");
             this.k.write(p0, p1.mFansImages);
          }
          if (p1.mLiveStreamJumperUrl != null) {
             p0.r("liveStreamJumperUrl");
             TypeAdapters.A.write(p0, p1.mLiveStreamJumperUrl);
          }
          if (p1.mshopLink != null) {
             p0.r("shopLink");
             TypeAdapters.A.write(p0, p1.mshopLink);
          }
          if (p1.mTagDesc != null) {
             p0.r("tagDesc");
             TypeAdapters.A.write(p0, p1.mTagDesc);
          }
          if (p1.mGoodsDetail != null) {
             p0.r("goodsDetail");
             this.x.write(p0, p1.mGoodsDetail);
          }
          if (p1.mCouponDetail != null) {
             p0.r("couponDetail");
             this.y.write(p0, p1.mCouponDetail);
          }
          p0.r("intimateType");
          p0.K((long)p1.mIntimateRelationType);
          p0.r("guestIntimateType");
          p0.K((long)p1.mGuestIntimateRelationType);
          p0.r("haveIntimatePropose");
          p0.P(p1.mHaveIntimatePropose);
          p0.r("enableShowProfile");
          p0.P(p1.mIsIntimateRelationProfileShow);
          if (p1.mIntimateTimeText != null) {
             p0.r("intimateShowTimeText");
             TypeAdapters.A.write(p0, p1.mIntimateTimeText);
          }
          if (p1.mRelationShipLabels != null) {
             p0.r("likerTags");
             this.A.write(p0, p1.mRelationShipLabels);
          }
          if (p1.mIntimateTag != null) {
             p0.r("intimateTag");
             this.B.write(p0, p1.mIntimateTag);
          }
          if (p1.mIntimateRelationName != null) {
             p0.r("intimateRelationName");
             TypeAdapters.A.write(p0, p1.mIntimateRelationName);
          }
          if (p1.mBottomTags != null) {
             p0.r("bottomTags");
             this.D.write(p0, p1.mBottomTags);
          }
          if (p1.mShopInfo != null) {
             p0.r("shopInfo");
             this.E.write(p0, p1.mShopInfo);
          }
          if (p1.mFansListExtraInfo != null) {
             p0.r("fansListExtraInfo");
             this.F.write(p0, p1.mFansListExtraInfo);
          }
          p0.r("hasRemoved");
          p0.P(p1.mHasRemoved);
          p0.r("hasReverseRemoved");
          p0.P(p1.mHasReverseRemoved);
          p0.j();
       }
       return;
    }
}
