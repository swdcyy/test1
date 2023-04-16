package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverActionBarInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverActionBarInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ClickAfterWords$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ClickAfterWords;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$CoverActionBarInfo$TypeAdapter extends TypeAdapter	// class@0008fc
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoAdvertisement$CoverActionBarInfo$TypeAdapter.c = a.get(PhotoAdvertisement$CoverActionBarInfo.class);
    }
    public void PhotoAdvertisement$CoverActionBarInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$ClickAfterWords$TypeAdapter.c);
    }
    public PhotoAdvertisement$CoverActionBarInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$CoverActionBarInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$CoverActionBarInfo uCoverAction = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoverAction;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoverAction;
       }else {
          p0.c();
          PhotoAdvertisement$CoverActionBarInfo uCoverAction1 = new PhotoAdvertisement$CoverActionBarInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x999f772f:
                   if (str.equals("productDetailUrl")) {
                      i = 0;
                   }
                   break;
                 case 0x9af7a366:
                   if (str.equals("actionBarColor")) {
                      i = 1;
                   }
                   break;
                 case 0xbaa93f4e:
                   if (str.equals("adStyle")) {
                      i = 2;
                   }
                   break;
                 case 0xcd77b05f:
                   if (str.equals("searchFormButtonExp")) {
                      i = 3;
                   }
                   break;
                 case 0xe4c0c5d5:
                   if (str.equals("clickAfterWords")) {
                      i = 4;
                   }
                   break;
                 case 0x4db99f35:
                   if (str.equals("templateId")) {
                      i = 5;
                   }
                   break;
                 case 0x4ebc08d2:
                   if (str.equals("actionBarLocation")) {
                      i = 6;
                   }
                   break;
                 case 0x6629c090:
                   if (str.equals("displayInfo")) {
                      i = 7;
                   }
                   break;
                 case 0x662eeb1c:
                   if (str.equals("displayType")) {
                      i = 8;
                   }
                   break;
                 case 0x68e84c32:
                   if (str.equals("shouldJumpDetail")) {
                      i = 9;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCoverAction1.mProductDetailUrl = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uCoverAction1.mActionBarColor = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uCoverAction1.mAdStyle = KnownTypeAdapters$k.a(p0, uCoverAction1.mAdStyle);
                   break;
                 case 3:
                   uCoverAction1.mSearchFormButtonExp = KnownTypeAdapters$k.a(p0, uCoverAction1.mSearchFormButtonExp);
                   break;
                 case 4:
                   uCoverAction1.mClickAfterWords = this.b.read(p0);
                   break;
                 case 5:
                   uCoverAction1.mTemplateId = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uCoverAction1.mActionBarLocation = KnownTypeAdapters$k.a(p0, uCoverAction1.mActionBarLocation);
                   break;
                 case 7:
                   uCoverAction1.mDisplayInfo = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   uCoverAction1.mDisplayType = KnownTypeAdapters$k.a(p0, uCoverAction1.mDisplayType);
                   break;
                 case 9:
                   uCoverAction1.mShouldJumpDetail = KnownTypeAdapters$g.a(p0, uCoverAction1.mShouldJumpDetail);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCoverAction1;
       }
    }
    public void b(b p0,PhotoAdvertisement$CoverActionBarInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$CoverActionBarInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTemplateId != null) {
             p0.r("templateId");
             TypeAdapters.A.write(p0, p1.mTemplateId);
          }
          p0.r("actionBarLocation");
          p0.K((long)p1.mActionBarLocation);
          p0.r("displayType");
          p0.K((long)p1.mDisplayType);
          if (p1.mProductDetailUrl != null) {
             p0.r("productDetailUrl");
             TypeAdapters.A.write(p0, p1.mProductDetailUrl);
          }
          if (p1.mDisplayInfo != null) {
             p0.r("displayInfo");
             TypeAdapters.A.write(p0, p1.mDisplayInfo);
          }
          if (p1.mActionBarColor != null) {
             p0.r("actionBarColor");
             TypeAdapters.A.write(p0, p1.mActionBarColor);
          }
          p0.r("searchFormButtonExp");
          p0.K((long)p1.mSearchFormButtonExp);
          if (p1.mClickAfterWords != null) {
             p0.r("clickAfterWords");
             this.b.write(p0, p1.mClickAfterWords);
          }
          p0.r("adStyle");
          p0.K((long)p1.mAdStyle);
          p0.r("shouldJumpDetail");
          p0.P(p1.mShouldJumpDetail);
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
