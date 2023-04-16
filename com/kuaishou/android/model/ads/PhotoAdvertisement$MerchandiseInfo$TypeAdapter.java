package com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo;
import com.google.gson.internal.bind.TypeAdapters;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$MerchandiseInfo$TypeAdapter extends TypeAdapter	// class@0009a1
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       PhotoAdvertisement$MerchandiseInfo$TypeAdapter.f = a.get(PhotoAdvertisement$MerchandiseInfo.class);
    }
    public void PhotoAdvertisement$MerchandiseInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PhotoAdvertisement$MerchandiseInfo$DiscountInfo$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       TypeAdapter typeAdapter1 = p0.j(PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$TypeAdapter.b);
       this.d = typeAdapter1;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$MerchandiseInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$MerchandiseInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$MerchandiseInfo merchandiseI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return merchandiseI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return merchandiseI;
       }else {
          p0.c();
          PhotoAdvertisement$MerchandiseInfo merchandiseI1 = new PhotoAdvertisement$MerchandiseInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9649f44b:
                   if (str.equals("merchandiseDataList")) {
                      i = 0;
                   }
                   break;
                 case 0xaa25e4a8:
                   if (str.equals("hideCloseButton")) {
                      i = 1;
                   }
                   break;
                 case 0xf60e221a:
                   if (str.equals("cardDelayReplay")) {
                      i = 2;
                   }
                   break;
                 case 0xff7ad6da:
                   if (str.equals("cardData")) {
                      i = 3;
                   }
                   break;
                 case 0xff82766a:
                   if (str.equals("cardType")) {
                      i = 4;
                   }
                   break;
                 case 0x772aa9a:
                   if (str.equals("cardShowTime")) {
                      i = 5;
                   }
                   break;
                 case 0x20bcc58f:
                   if (str.equals("discountInfo")) {
                      i = 6;
                   }
                   break;
                 case 0x2104383f:
                   if (str.equals("cardUrl")) {
                      i = 7;
                   }
                   break;
                 case 0x3cff1dc0:
                   if (str.equals("cardDelayTime")) {
                      i = 8;
                   }
                   break;
                 case 0x6684784d:
                   if (str.equals("carouselTime")) {
                      i = 9;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   merchandiseI1.mMerchandiseItemInfoList = this.e.read(p0);
                   break;
                 case 1:
                   merchandiseI1.mHideCloseButton = KnownTypeAdapters$g.a(p0, merchandiseI1.mHideCloseButton);
                   break;
                 case 2:
                   merchandiseI1.mCardDelayReplay = KnownTypeAdapters$g.a(p0, merchandiseI1.mCardDelayReplay);
                   break;
                 case 3:
                   merchandiseI1.mCardData = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   merchandiseI1.mCardType = KnownTypeAdapters$k.a(p0, merchandiseI1.mCardType);
                   break;
                 case 5:
                   merchandiseI1.mCardShowTime = KnownTypeAdapters$n.a(p0, merchandiseI1.mCardShowTime);
                   break;
                 case 6:
                   merchandiseI1.mDiscountInfoList = this.c.read(p0);
                   break;
                 case 7:
                   merchandiseI1.mCardUrl = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   merchandiseI1.mCardDelayTime = KnownTypeAdapters$n.a(p0, merchandiseI1.mCardDelayTime);
                   break;
                 case 9:
                   merchandiseI1.mCarouselTime = KnownTypeAdapters$n.a(p0, merchandiseI1.mCarouselTime);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return merchandiseI1;
       }
    }
    public void b(b p0,PhotoAdvertisement$MerchandiseInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$MerchandiseInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mCardUrl != null) {
             p0.r("cardUrl");
             TypeAdapters.A.write(p0, p1.mCardUrl);
          }
          if (p1.mCardData != null) {
             p0.r("cardData");
             TypeAdapters.A.write(p0, p1.mCardData);
          }
          p0.r("cardDelayTime");
          p0.K(p1.mCardDelayTime);
          p0.r("cardShowTime");
          p0.K(p1.mCardShowTime);
          p0.r("cardType");
          p0.K((long)p1.mCardType);
          p0.r("cardDelayReplay");
          p0.P(p1.mCardDelayReplay);
          p0.r("hideCloseButton");
          p0.P(p1.mHideCloseButton);
          p0.r("carouselTime");
          p0.K(p1.mCarouselTime);
          if (p1.mDiscountInfoList != null) {
             p0.r("discountInfo");
             this.c.write(p0, p1.mDiscountInfoList);
          }
          if (p1.mMerchandiseItemInfoList != null) {
             p0.r("merchandiseDataList");
             this.e.write(p0, p1.mMerchandiseItemInfoList);
          }
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
