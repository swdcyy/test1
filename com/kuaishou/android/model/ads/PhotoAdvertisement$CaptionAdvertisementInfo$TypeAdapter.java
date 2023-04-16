package com.kuaishou.android.model.ads.PhotoAdvertisement$CaptionAdvertisementInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CaptionAdvertisementInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$CaptionAdvertisementInfo$TypeAdapter extends TypeAdapter	// class@0008d2
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$CaptionAdvertisementInfo$TypeAdapter.b = a.get(PhotoAdvertisement$CaptionAdvertisementInfo.class);
    }
    public void PhotoAdvertisement$CaptionAdvertisementInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$CaptionAdvertisementInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$CaptionAdvertisementInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$CaptionAdvertisementInfo uCaptionAdve = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCaptionAdve;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCaptionAdve;
       }else {
          p0.c();
          PhotoAdvertisement$CaptionAdvertisementInfo uCaptionAdve1 = new PhotoAdvertisement$CaptionAdvertisementInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa714ac1a:
                   if (str.equals("productName")) {
                      i = 0;
                   }
                   break;
                 case 0xbefd32a7:
                   if (str.equals("riskTips")) {
                      i = 1;
                   }
                   break;
                 case 0x1bb7ef4d:
                   if (str.equals("enableClickCaptionToProfile")) {
                      i = 2;
                   }
                   break;
                 case 0x2e0f1e32:
                   if (str.equals("avatarIconAnimation")) {
                      i = 3;
                   }
                   break;
                 case 0x38391204:
                   if (str.equals("avatarIconAnimationUrlA")) {
                      i = 4;
                   }
                   break;
                 case 0x38391205:
                   if (str.equals("avatarIconAnimationUrlB")) {
                      i = 5;
                   }
                   break;
                 case 0x3c18518a:
                   if (str.equals("textLinkNewColor")) {
                      i = 6;
                   }
                   break;
                 case 0x59b3c247:
                   if (str.equals("productIconUrl")) {
                      i = 7;
                   }
                   break;
                 case 0x6c269445:
                   if (str.equals("descriptionInLandingPage")) {
                      i = 8;
                   }
                   break;
                 case 0x7bdc10bd:
                   if (str.equals("showAvatarInfoInLandingPage")) {
                      i = 9;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCaptionAdve1.mProductName = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uCaptionAdve1.mRiskTips = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uCaptionAdve1.mEnableClickCaptionToProfile = KnownTypeAdapters$g.a(p0, uCaptionAdve1.mEnableClickCaptionToProfile);
                   break;
                 case 3:
                   uCaptionAdve1.mAvatarIconAnimation = KnownTypeAdapters$g.a(p0, uCaptionAdve1.mAvatarIconAnimation);
                   break;
                 case 4:
                   uCaptionAdve1.mAvatarIconAnimationUrlA = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uCaptionAdve1.mAvatarIconAnimationUrlB = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uCaptionAdve1.mTextLinkNewColor = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   uCaptionAdve1.mProductIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   uCaptionAdve1.mDescriptionInLandingPage = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   uCaptionAdve1.mShowAvatarInfoInLandingPage = KnownTypeAdapters$g.a(p0, uCaptionAdve1.mShowAvatarInfoInLandingPage);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCaptionAdve1;
       }
    }
    public void b(b p0,PhotoAdvertisement$CaptionAdvertisementInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$CaptionAdvertisementInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mRiskTips != null) {
             p0.r("riskTips");
             TypeAdapters.A.write(p0, p1.mRiskTips);
          }
          if (p1.mProductName != null) {
             p0.r("productName");
             TypeAdapters.A.write(p0, p1.mProductName);
          }
          if (p1.mProductIconUrl != null) {
             p0.r("productIconUrl");
             TypeAdapters.A.write(p0, p1.mProductIconUrl);
          }
          if (p1.mTextLinkNewColor != null) {
             p0.r("textLinkNewColor");
             TypeAdapters.A.write(p0, p1.mTextLinkNewColor);
          }
          p0.r("avatarIconAnimation");
          p0.P(p1.mAvatarIconAnimation);
          p0.r("showAvatarInfoInLandingPage");
          p0.P(p1.mShowAvatarInfoInLandingPage);
          if (p1.mDescriptionInLandingPage != null) {
             p0.r("descriptionInLandingPage");
             TypeAdapters.A.write(p0, p1.mDescriptionInLandingPage);
          }
          if (p1.mAvatarIconAnimationUrlA != null) {
             p0.r("avatarIconAnimationUrlA");
             TypeAdapters.A.write(p0, p1.mAvatarIconAnimationUrlA);
          }
          if (p1.mAvatarIconAnimationUrlB != null) {
             p0.r("avatarIconAnimationUrlB");
             TypeAdapters.A.write(p0, p1.mAvatarIconAnimationUrlB);
          }
          p0.r("enableClickCaptionToProfile");
          p0.P(p1.mEnableClickCaptionToProfile);
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
