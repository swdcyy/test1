package com.yxcorp.gifshow.models.Gift$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.models.GiftActionType;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.yxcorp.gifshow.models.Gift$TypeAdapter$a;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$n;
import androidx.collection.ArrayMap;
import com.google.gson.stream.b;

public final class Gift$TypeAdapter extends TypeAdapter	// class@001fba
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       Gift$TypeAdapter.f = a.get(Gift.class);
    }
    public void Gift$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(a.get(GiftActionType.class));
       this.e = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, TypeAdapters.A, new Gift$TypeAdapter$a(this));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, Gift$TypeAdapter.class, "2");
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
             obj = new Gift();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x8a13ee35:
                      if (str.equals("giftTypeName")) {
                         i = 0;
                      }
                      break;
                    case 0xba3b1ad0:
                      if (str.equals("promptMessages")) {
                         i = 1;
                      }
                      break;
                    case 0xc514b785:
                      if (str.equals("picUrl")) {
                         i = 2;
                      }
                      break;
                    case 0xcbef6a3f:
                      if (str.equals("subscriptImageUrl")) {
                         i = 3;
                      }
                      break;
                    case 0xccbb8cc3:
                      if (str.equals("disableMockEffect")) {
                         i = 4;
                      }
                      break;
                    case 0xcebc809e:
                      if (str.equals("drawable")) {
                         i = 5;
                      }
                      break;
                    case 0xd77450fe:
                      if (str.equals("virtualPrice")) {
                         i = 6;
                      }
                      break;
                    case 0xe3053a25:
                      if (str.equals("unitPrice")) {
                         i = 7;
                      }
                      break;
                    case 0xe4973c1f:
                      if (str.equals("liveGiftDescriptionKey")) {
                         i = 8;
                      }
                      break;
                    case 0xe86468f7:
                      if (str.equals("liveGiftRuleUrl")) {
                         i = 9;
                      }
                      break;
                    case 0xf6ea239e:
                      if (str.equals("canCombo")) {
                         i = 10;
                      }
                      break;
                    case 3355:
                      if (str.equals("id")) {
                         i = 11;
                      }
                      break;
                    case 0x337a8b:
                      if (str.equals("name")) {
                         i = 12;
                      }
                      break;
                    case 0x368f3a:
                      if (str.equals("type")) {
                         i = 13;
                      }
                      break;
                    case 0x2a199c65:
                      if (str.equals("magicFaceId")) {
                         i = 14;
                      }
                      break;
                    case 0x2b158697:
                      if (str.equals("borderColor")) {
                         i = 15;
                      }
                      break;
                    case 0x37e3dd50:
                      if (str.equals("disableMockFeed")) {
                         i = 16;
                      }
                      break;
                    case 0x6e617690:
                      if (str.equals("actionType")) {
                         i = 17;
                      }
                      break;
                    case 0x70d24957:
                      if (str.equals("maxBatchSize")) {
                         i = 18;
                      }
                      break;
                    case 0x73db0c29:
                      if (str.equals("animationPicUrl")) {
                         i = 19;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mGiftTypeName = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mPromptMessages = this.e.read(p0);
                      break;
                    case 2:
                      obj.mImageUrl = this.c.read(p0);
                      break;
                    case 3:
                      obj.mSubscriptImageUrl = this.c.read(p0);
                      break;
                    case 4:
                      obj.mDisableMockEffect = KnownTypeAdapters$g.a(p0, obj.mDisableMockEffect);
                      break;
                    case 5:
                      obj.mDrawable = KnownTypeAdapters$g.a(p0, obj.mDrawable);
                      break;
                    case 6:
                      obj.mVirtualPrice = KnownTypeAdapters$k.a(p0, obj.mVirtualPrice);
                      break;
                    case 7:
                      obj.mPrice = KnownTypeAdapters$k.a(p0, obj.mPrice);
                      break;
                    case 8:
                      obj.mGiftDetailHintDescriptionKey = TypeAdapters.A.read(p0);
                      break;
                    case 9:
                      obj.mGiftDetailHintRuleUrl = TypeAdapters.A.read(p0);
                      break;
                    case 10:
                      obj.mCanCombo = KnownTypeAdapters$g.a(p0, obj.mCanCombo);
                      break;
                    case 11:
                      obj.mId = KnownTypeAdapters$k.a(p0, obj.mId);
                      break;
                    case 12:
                      obj.mName = TypeAdapters.A.read(p0);
                      break;
                    case 13:
                      obj.mGiftType = KnownTypeAdapters$n.a(p0, obj.mGiftType);
                      break;
                    case 14:
                      obj.mMagicFaceId = KnownTypeAdapters$n.a(p0, obj.mMagicFaceId);
                      break;
                    case 15:
                      obj.mBorderColor = TypeAdapters.A.read(p0);
                      break;
                    case 16:
                      obj.mDisableMockFeed = KnownTypeAdapters$g.a(p0, obj.mDisableMockFeed);
                      break;
                    case 17:
                      obj.mActionType = this.d.read(p0);
                      break;
                    case 18:
                      obj.mMaxBatchCount = KnownTypeAdapters$k.a(p0, obj.mMaxBatchCount);
                      break;
                    case 19:
                      obj.mAnimationPicUrl = this.c.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Gift$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("id");
          p0.K((long)p1.mId);
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mImageUrl != null) {
             p0.r("picUrl");
             this.c.write(p0, p1.mImageUrl);
          }
          p0.r("unitPrice");
          p0.K((long)p1.mPrice);
          p0.r("virtualPrice");
          p0.K((long)p1.mVirtualPrice);
          p0.r("canCombo");
          p0.P(p1.mCanCombo);
          if (p1.mActionType != null) {
             p0.r("actionType");
             this.d.write(p0, p1.mActionType);
          }
          if (p1.mBorderColor != null) {
             p0.r("borderColor");
             TypeAdapters.A.write(p0, p1.mBorderColor);
          }
          p0.r("drawable");
          p0.P(p1.mDrawable);
          p0.r("magicFaceId");
          p0.K(p1.mMagicFaceId);
          if (p1.mAnimationPicUrl != null) {
             p0.r("animationPicUrl");
             this.c.write(p0, p1.mAnimationPicUrl);
          }
          if (p1.mPromptMessages != null) {
             p0.r("promptMessages");
             this.e.write(p0, p1.mPromptMessages);
          }
          if (p1.mGiftTypeName != null) {
             p0.r("giftTypeName");
             TypeAdapters.A.write(p0, p1.mGiftTypeName);
          }
          p0.r("type");
          p0.K(p1.mGiftType);
          p0.r("maxBatchSize");
          p0.K((long)p1.mMaxBatchCount);
          if (p1.mSubscriptImageUrl != null) {
             p0.r("subscriptImageUrl");
             this.c.write(p0, p1.mSubscriptImageUrl);
          }
          if (p1.mGiftDetailHintDescriptionKey != null) {
             p0.r("liveGiftDescriptionKey");
             TypeAdapters.A.write(p0, p1.mGiftDetailHintDescriptionKey);
          }
          if (p1.mGiftDetailHintRuleUrl != null) {
             p0.r("liveGiftRuleUrl");
             TypeAdapters.A.write(p0, p1.mGiftDetailHintRuleUrl);
          }
          p0.r("disableMockFeed");
          p0.P(p1.mDisableMockFeed);
          p0.r("disableMockEffect");
          p0.P(p1.mDisableMockEffect);
          p0.j();
       }
       return;
    }
}
