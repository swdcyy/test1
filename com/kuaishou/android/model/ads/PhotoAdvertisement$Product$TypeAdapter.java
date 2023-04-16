package com.kuaishou.android.model.ads.PhotoAdvertisement$Product$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Product;
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

public final class PhotoAdvertisement$Product$TypeAdapter extends TypeAdapter	// class@0009ef
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$Product$TypeAdapter.b = a.get(PhotoAdvertisement$Product.class);
    }
    public void PhotoAdvertisement$Product$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$Product a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$Product$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$Product product = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return product;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return product;
       }else {
          p0.c();
          PhotoAdvertisement$Product product1 = new PhotoAdvertisement$Product();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xb95cfaac:
                   if (str.equals("imgUrl")) {
                      i = 0;
                   }
                   break;
                 case 0xc14e566a:
                   if (str.equals("productId")) {
                      i = 1;
                   }
                   break;
                 case 0x1bf9a:
                   if (str.equals("tag")) {
                      i = 2;
                   }
                   break;
                 case 0x65fb149:
                   if (str.equals("price")) {
                      i = 3;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 4;
                   }
                   break;
                 case 0xa8de315:
                   if (str.equals("linkUrl")) {
                      i = 5;
                   }
                   break;
                 case 0x56b7753b:
                   if (str.equals("pricePrefix")) {
                      i = 6;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   product1.imgUrl = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   product1.productId = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   product1.tag = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   product1.price = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   product1.title = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   product1.linkUrl = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   product1.pricePrefix = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return product1;
       }
    }
    public void b(b p0,PhotoAdvertisement$Product p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$Product$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.productId != null) {
             p0.r("productId");
             TypeAdapters.A.write(p0, p1.productId);
          }
          if (p1.title != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.title);
          }
          if (p1.pricePrefix != null) {
             p0.r("pricePrefix");
             TypeAdapters.A.write(p0, p1.pricePrefix);
          }
          if (p1.price != null) {
             p0.r("price");
             TypeAdapters.A.write(p0, p1.price);
          }
          if (p1.imgUrl != null) {
             p0.r("imgUrl");
             TypeAdapters.A.write(p0, p1.imgUrl);
          }
          if (p1.linkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.linkUrl);
          }
          if (p1.tag != null) {
             p0.r("tag");
             TypeAdapters.A.write(p0, p1.tag);
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
