package com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$FollowAuthorFeedConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$PushOriginConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$WishListConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$AssistantConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$LivePkCommonConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$BottomItemConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$FansTopConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$ShopConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$LiveArrowRedPacketConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$GiftConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$MagicFaceConfig$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$PushOriginConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$AssistantConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$BottomItemConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$MagicFaceConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$LivePkCommonConfig;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$ShopConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$GiftConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$FollowAuthorFeedConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$WishListConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$FansTopConfig;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$LiveArrowRedPacketConfig;
import com.google.gson.stream.b;

public final class LiveCommonConfigResponse$TypeAdapter extends TypeAdapter	// class@000e90
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
    public static final a m;

    static {
       LiveCommonConfigResponse$TypeAdapter.m = a.get(LiveCommonConfigResponse.class);
    }
    public void LiveCommonConfigResponse$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(LiveCommonConfigResponse$FollowAuthorFeedConfig$TypeAdapter.b);
       this.c = p0.j(LiveCommonConfigResponse$PushOriginConfig$TypeAdapter.b);
       this.d = p0.j(LiveCommonConfigResponse$WishListConfig$TypeAdapter.b);
       this.e = p0.j(LiveCommonConfigResponse$AssistantConfig$TypeAdapter.b);
       this.f = p0.j(LiveCommonConfigResponse$LivePkCommonConfig$TypeAdapter.b);
       this.g = p0.j(LiveCommonConfigResponse$BottomItemConfig$TypeAdapter.c);
       this.h = p0.j(LiveCommonConfigResponse$FansTopConfig$TypeAdapter.b);
       this.i = p0.j(LiveCommonConfigResponse$ShopConfig$TypeAdapter.b);
       this.j = p0.j(LiveCommonConfigResponse$LiveArrowRedPacketConfig$TypeAdapter.b);
       this.k = p0.j(LiveCommonConfigResponse$GiftConfig$TypeAdapter.b);
       this.l = p0.j(LiveCommonConfigResponse$MagicFaceConfig$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveCommonConfigResponse$TypeAdapter.class, "2");
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
             obj = new LiveCommonConfigResponse();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x8d97d4d9:
                      if (str.equals("disableAuthorGiftDisplayExtend")) {
                         i = 0;
                      }
                      break;
                    case 0xac5540a3:
                      if (str.equals("arrowRedPackConfig")) {
                         i = 1;
                      }
                      break;
                    case 0xbd7e8564:
                      if (str.equals("liveAdaptiveConfig")) {
                         i = 2;
                      }
                      break;
                    case 0xbf855975:
                      if (str.equals("fansTop")) {
                         i = 3;
                      }
                      break;
                    case 0xc63529e5:
                      if (str.equals("wishList")) {
                         i = 4;
                      }
                      break;
                    case 0xe861f03c:
                      if (str.equals("followAuthorFeedConfig")) {
                         i = 5;
                      }
                      break;
                    case 0xee4d3492:
                      if (str.equals("giftConfig")) {
                         i = 6;
                      }
                      break;
                    case 0x35daf6:
                      if (str.equals("shop")) {
                         i = 7;
                      }
                      break;
                    case 0x59ecf80:
                      if (str.equals("disableAudienceGiftDisplayExtend")) {
                         i = 8;
                      }
                      break;
                    case 0x762d51d:
                      if (str.equals("pkConfig")) {
                         i = 9;
                      }
                      break;
                    case 0x80c5d8c:
                      if (str.equals("magicFaceConfig")) {
                         i = 10;
                      }
                      break;
                    case 0x255cbba0:
                      if (str.equals("screenButtonConfig")) {
                         i = 11;
                      }
                      break;
                    case 0x553972de:
                      if (str.equals("assistant")) {
                         i = 12;
                      }
                      break;
                    case 0x7333d642:
                      if (str.equals("pushOriginConfig")) {
                         i = 13;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mDisableAuthorGiftDisplayExtend = KnownTypeAdapters$g.a(p0, obj.mDisableAuthorGiftDisplayExtend);
                      break;
                    case 1:
                      obj.mLiveArrowRedPacketConfig = this.j.read(p0);
                      break;
                    case 2:
                      obj.mLiveAdaptiveConfig = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mFansTop = this.h.read(p0);
                      break;
                    case 4:
                      obj.mWishListConfig = this.d.read(p0);
                      break;
                    case 5:
                      obj.mFollowAutorFeedConfig = this.b.read(p0);
                      break;
                    case 6:
                      obj.mGiftConfig = this.k.read(p0);
                      break;
                    case 7:
                      obj.mShopConfig = this.i.read(p0);
                      break;
                    case 8:
                      obj.mDisableAudienceGiftDisplayExtend = KnownTypeAdapters$g.a(p0, obj.mDisableAudienceGiftDisplayExtend);
                      break;
                    case 9:
                      obj.mPkCommonConfig = this.f.read(p0);
                      break;
                    case 10:
                      obj.mMagicFaceConfig = this.l.read(p0);
                      break;
                    case 11:
                      obj.mBottomItemConfig = this.g.read(p0);
                      break;
                    case 12:
                      obj.mAssistantConfig = this.e.read(p0);
                      break;
                    case 13:
                      obj.mPushOriginConfig = this.c.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCommonConfigResponse$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mLiveAdaptiveConfig != null) {
             p0.r("liveAdaptiveConfig");
             TypeAdapters.A.write(p0, p1.mLiveAdaptiveConfig);
          }
          if (p1.mFollowAutorFeedConfig != null) {
             p0.r("followAuthorFeedConfig");
             this.b.write(p0, p1.mFollowAutorFeedConfig);
          }
          if (p1.mPushOriginConfig != null) {
             p0.r("pushOriginConfig");
             this.c.write(p0, p1.mPushOriginConfig);
          }
          if (p1.mWishListConfig != null) {
             p0.r("wishList");
             this.d.write(p0, p1.mWishListConfig);
          }
          if (p1.mAssistantConfig != null) {
             p0.r("assistant");
             this.e.write(p0, p1.mAssistantConfig);
          }
          if (p1.mPkCommonConfig != null) {
             p0.r("pkConfig");
             this.f.write(p0, p1.mPkCommonConfig);
          }
          if (p1.mBottomItemConfig != null) {
             p0.r("screenButtonConfig");
             this.g.write(p0, p1.mBottomItemConfig);
          }
          p0.r("disableAuthorGiftDisplayExtend");
          p0.P(p1.mDisableAuthorGiftDisplayExtend);
          p0.r("disableAudienceGiftDisplayExtend");
          p0.P(p1.mDisableAudienceGiftDisplayExtend);
          if (p1.mFansTop != null) {
             p0.r("fansTop");
             this.h.write(p0, p1.mFansTop);
          }
          if (p1.mShopConfig != null) {
             p0.r("shop");
             this.i.write(p0, p1.mShopConfig);
          }
          if (p1.mLiveArrowRedPacketConfig != null) {
             p0.r("arrowRedPackConfig");
             this.j.write(p0, p1.mLiveArrowRedPacketConfig);
          }
          if (p1.mGiftConfig != null) {
             p0.r("giftConfig");
             this.k.write(p0, p1.mGiftConfig);
          }
          if (p1.mMagicFaceConfig != null) {
             p0.r("magicFaceConfig");
             this.l.write(p0, p1.mMagicFaceConfig);
          }
          p0.j();
       }
       return;
    }
}
