package com.yxcorp.gifshow.model.ProfileTemplateCard$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ProfileCardRedDot$TypeAdapter;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonInfo;
import com.google.gson.internal.bind.TypeAdapters;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ProfileCardRedDot;
import com.vimeo.stag.KnownTypeAdapters;
import com.google.gson.JsonObject;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class ProfileTemplateCard$TypeAdapter extends TypeAdapter	// class@001e80
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       ProfileTemplateCard$TypeAdapter.f = a.get(ProfileTemplateCard.class);
    }
    public void ProfileTemplateCard$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(ProfileTemplateCard$ProfileCardRedDot$TypeAdapter.b);
       this.e = p0.j(ProfileTemplateCard$ButtonInfo$TypeAdapter.d);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ProfileTemplateCard$TypeAdapter.class, "2");
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
             obj = new ProfileTemplateCard();
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
                    case 0xa3ac1be7:
                      if (str.equals("tagText")) {
                         i = 1;
                      }
                      break;
                    case 0xbe071a81:
                      if (str.equals("ksOrderId")) {
                         i = 2;
                      }
                      break;
                    case 0xd404b4fd:
                      if (str.equals("iconUrls")) {
                         i = 3;
                      }
                      break;
                    case 0xefa709e0:
                      if (str.equals("darkIconUrl")) {
                         i = 4;
                      }
                      break;
                    case 0xf069d81f:
                      if (str.equals("mainTitle")) {
                         i = 5;
                      }
                      break;
                    case 0xf3522015:
                      if (str.equals("cardTypeName")) {
                         i = 6;
                      }
                      break;
                    case 0xfa2ebeed:
                      if (str.equals("bizType")) {
                         i = 7;
                      }
                      break;
                    case 0xfa89e8dc:
                      if (str.equals("cardViewStyle")) {
                         i = 8;
                      }
                      break;
                    case 0xff82766a:
                      if (str.equals("cardType")) {
                         i = 9;
                      }
                      break;
                    case 0x53a3293:
                      if (str.equals("darkIconUrls")) {
                         i = 10;
                      }
                      break;
                    case 0x5c79410:
                      if (str.equals("extra")) {
                         i = 11;
                      }
                      break;
                    case 0xa8de315:
                      if (str.equals("linkUrl")) {
                         i = 12;
                      }
                      break;
                    case 0x1db840b1:
                      if (str.equals("profileCardRedDot")) {
                         i = 13;
                      }
                      break;
                    case 0x61ad9236:
                      if (str.equals("iconUrl")) {
                         i = 14;
                      }
                      break;
                    case 0x6513fe91:
                      if (str.equals("profileCardBtnInfo")) {
                         i = 15;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSubTitle = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mTagText = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mKsOrderId = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mIconUrls = this.c.read(p0);
                      break;
                    case 4:
                      obj.mDarkIconUrl = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mMainTitle = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.mCardTypeName = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mBizType = KnownTypeAdapters$k.a(p0, obj.mBizType);
                      break;
                    case 8:
                      obj.mCardViewStyle = KnownTypeAdapters$k.a(p0, obj.mCardViewStyle);
                      break;
                    case 9:
                      obj.mCardType = KnownTypeAdapters$k.a(p0, obj.mCardType);
                      break;
                    case 10:
                      obj.mDarkIconUrls = this.c.read(p0);
                      break;
                    case 11:
                      obj.mExtra = KnownTypeAdapters.p.read(p0);
                      break;
                    case 12:
                      obj.mLinkUrl = TypeAdapters.A.read(p0);
                      break;
                    case 13:
                      obj.mProfileCardRedDot = this.d.read(p0);
                      break;
                    case 14:
                      obj.mIconUrl = TypeAdapters.A.read(p0);
                      break;
                    case 15:
                      obj.mButtonInfo = this.e.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileTemplateCard$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mMainTitle != null) {
             p0.r("mainTitle");
             TypeAdapters.A.write(p0, p1.mMainTitle);
          }
          if (p1.mSubTitle != null) {
             p0.r("subTitle");
             TypeAdapters.A.write(p0, p1.mSubTitle);
          }
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
          }
          if (p1.mTagText != null) {
             p0.r("tagText");
             TypeAdapters.A.write(p0, p1.mTagText);
          }
          if (p1.mCardTypeName != null) {
             p0.r("cardTypeName");
             TypeAdapters.A.write(p0, p1.mCardTypeName);
          }
          p0.r("bizType");
          p0.K((long)p1.mBizType);
          p0.r("cardType");
          p0.K((long)p1.mCardType);
          p0.r("cardViewStyle");
          p0.K((long)p1.mCardViewStyle);
          if (p1.mKsOrderId != null) {
             p0.r("ksOrderId");
             TypeAdapters.A.write(p0, p1.mKsOrderId);
          }
          if (p1.mIconUrls != null) {
             p0.r("iconUrls");
             this.c.write(p0, p1.mIconUrls);
          }
          if (p1.mDarkIconUrl != null) {
             p0.r("darkIconUrl");
             TypeAdapters.A.write(p0, p1.mDarkIconUrl);
          }
          if (p1.mDarkIconUrls != null) {
             p0.r("darkIconUrls");
             this.c.write(p0, p1.mDarkIconUrls);
          }
          if (p1.mProfileCardRedDot != null) {
             p0.r("profileCardRedDot");
             this.d.write(p0, p1.mProfileCardRedDot);
          }
          if (p1.mButtonInfo != null) {
             p0.r("profileCardBtnInfo");
             this.e.write(p0, p1.mButtonInfo);
          }
          if (p1.mExtra != null) {
             p0.r("extra");
             KnownTypeAdapters.p.write(p0, p1.mExtra);
          }
          p0.j();
       }
       return;
    }
}
