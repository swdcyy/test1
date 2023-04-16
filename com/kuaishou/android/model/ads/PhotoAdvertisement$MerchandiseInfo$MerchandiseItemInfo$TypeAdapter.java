package com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo;
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

public final class PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$TypeAdapter extends TypeAdapter	// class@00099f
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$TypeAdapter.b = a.get(PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo.class);
    }
    public void PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo merchandiseI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return merchandiseI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return merchandiseI;
       }else {
          p0.c();
          PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo merchandiseI1 = new PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo();
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
                 case 0xd0a9a5bb:
                   if (str.equals("appLink")) {
                      i = 2;
                   }
                   break;
                 case 3355:
                   if (str.equals("id")) {
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
                 case 0x65fb149:
                   if (str.equals("price")) {
                      i = 6;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 7;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 8;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   merchandiseI1.mSubtitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   merchandiseI1.mAction = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   merchandiseI1.mScheme = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   merchandiseI1.mId = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   merchandiseI1.mUrl = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   merchandiseI1.mUnit = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   merchandiseI1.mPrice = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   merchandiseI1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   merchandiseI1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return merchandiseI1;
       }
    }
    public void b(b p0,PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mSubtitle != null) {
             p0.r("subTitle");
             TypeAdapters.A.write(p0, p1.mSubtitle);
          }
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mPrice != null) {
             p0.r("price");
             TypeAdapters.A.write(p0, p1.mPrice);
          }
          if (p1.mId != null) {
             p0.r("id");
             TypeAdapters.A.write(p0, p1.mId);
          }
          if (p1.mUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mUrl);
          }
          if (p1.mUnit != null) {
             p0.r("unit");
             TypeAdapters.A.write(p0, p1.mUnit);
          }
          if (p1.mAction != null) {
             p0.r("action");
             TypeAdapters.A.write(p0, p1.mAction);
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
