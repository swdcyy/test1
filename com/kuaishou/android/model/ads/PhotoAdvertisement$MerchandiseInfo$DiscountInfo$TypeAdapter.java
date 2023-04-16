package com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$MerchandiseInfo$DiscountInfo$TypeAdapter extends TypeAdapter	// class@00099b
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$MerchandiseInfo$DiscountInfo$TypeAdapter.b = a.get(PhotoAdvertisement$MerchandiseInfo$DiscountInfo.class);
    }
    public void PhotoAdvertisement$MerchandiseInfo$DiscountInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$MerchandiseInfo$DiscountInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$MerchandiseInfo$DiscountInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$MerchandiseInfo$DiscountInfo merchandiseI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return merchandiseI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return merchandiseI;
       }else {
          p0.c();
          PhotoAdvertisement$MerchandiseInfo$DiscountInfo merchandiseI1 = new PhotoAdvertisement$MerchandiseInfo$DiscountInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x836c5bf8:
                   if (str.equals("subTitle")) {
                      i = 0;
                   }
                   break;
                 case 0xab2f7e36:
                   if (str.equals("action")) {
                      i = 1;
                   }
                   break;
                 case 0xcd2b4055:
                   if (str.equals("merchandiseTitle")) {
                      i = 2;
                   }
                   break;
                 case 0xd0a9a5bb:
                   if (str.equals("appLink")) {
                      i = 3;
                   }
                   break;
                 case 0x1c56f:
                   if (str.equals("url")) {
                      i = 4;
                   }
                   break;
                 case 0x36d984:
                   if (str.equals("unit")) {
                      i = 5;
                   }
                   break;
                 case 0x5951eea:
                   if (str.equals("bgUrl")) {
                      i = 6;
                   }
                   break;
                 case 0x65fb149:
                   if (str.equals("price")) {
                      i = 7;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 8;
                   }
                   break;
                 case 0x4aa367c6:
                   if (str.equals("leftTopLabel")) {
                      i = 9;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   merchandiseI1.mSubTitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   merchandiseI1.mAction = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   merchandiseI1.mMerchandiseTitle = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   merchandiseI1.mScheme = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   merchandiseI1.mUrl = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   merchandiseI1.mUnit = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   merchandiseI1.mBgUrl = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   merchandiseI1.mPrice = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   merchandiseI1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   merchandiseI1.mLeftTopLabel = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return merchandiseI1;
       }
    }
    public void b(b p0,PhotoAdvertisement$MerchandiseInfo$DiscountInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$MerchandiseInfo$DiscountInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mLeftTopLabel != null) {
             p0.r("leftTopLabel");
             TypeAdapters.A.write(p0, p1.mLeftTopLabel);
          }
          if (p1.mPrice != null) {
             p0.r("price");
             TypeAdapters.A.write(p0, p1.mPrice);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mSubTitle != null) {
             p0.r("subTitle");
             TypeAdapters.A.write(p0, p1.mSubTitle);
          }
          if (p1.mBgUrl != null) {
             p0.r("bgUrl");
             TypeAdapters.A.write(p0, p1.mBgUrl);
          }
          if (p1.mAction != null) {
             p0.r("action");
             TypeAdapters.A.write(p0, p1.mAction);
          }
          if (p1.mMerchandiseTitle != null) {
             p0.r("merchandiseTitle");
             TypeAdapters.A.write(p0, p1.mMerchandiseTitle);
          }
          if (p1.mUnit != null) {
             p0.r("unit");
             TypeAdapters.A.write(p0, p1.mUnit);
          }
          if (p1.mUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mUrl);
          }
          if (p1.mScheme != null) {
             p0.r("appLink");
             TypeAdapters.A.write(p0, p1.mScheme);
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
