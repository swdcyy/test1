package com.kwai.components.nearbymodel.model.NearbyLocalLifePoiV2$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.NearbyLocalLifePoiV2;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.components.nearbymodel.model.NearbyLocalLifePoiV2$PoiLeftIcon;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.google.gson.stream.b;

public final class NearbyLocalLifePoiV2$TypeAdapter extends TypeAdapter	// class@000c9d
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       NearbyLocalLifePoiV2$TypeAdapter.d = a.get(NearbyLocalLifePoiV2.class);
    }
    public void NearbyLocalLifePoiV2$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(NearbyLocalLifePoiV2$PoiLeftIcon.class));
       this.c = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, NearbyLocalLifePoiV2$TypeAdapter.class, "2");
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
             obj = new NearbyLocalLifePoiV2();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa714ac1a:
                      if (str.equals("productName")) {
                         i = 0;
                      }
                      break;
                    case 0xc56bf8f0:
                      if (str.equals("poiTag")) {
                         i = 1;
                      }
                      break;
                    case 0xe0063f9a:
                      if (str.equals("discountTip")) {
                         i = 2;
                      }
                      break;
                    case 0xe8106bf5:
                      if (str.equals("poiName")) {
                         i = 3;
                      }
                      break;
                    case 0x12c8bd9:
                      if (str.equals("productDiscountPrice")) {
                         i = 4;
                      }
                      break;
                    case 0x65e5105:
                      if (str.equals("poiId")) {
                         i = 5;
                      }
                      break;
                    case 0x68b1db1:
                      if (str.equals("style")) {
                         i = 6;
                      }
                      break;
                    case 0xa8de315:
                      if (str.equals("linkUrl")) {
                         i = 7;
                      }
                      break;
                    case 0x3aec5408:
                      if (str.equals("productCover")) {
                         i = 8;
                      }
                      break;
                    case 0x4a3a218a:
                      if (str.equals("poiLeftIcon")) {
                         i = 9;
                      }
                      break;
                    case 0x7828d149:
                      if (str.equals("productOriginalPrice")) {
                         i = 10;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mProductName = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mPoiTag = this.c.read(p0);
                      break;
                    case 2:
                      obj.mDiscountTip = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mPoiName = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mProductDiscountPrice = KnownTypeAdapters$k.a(p0, obj.mProductDiscountPrice);
                      break;
                    case 5:
                      obj.mPoiId = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.mStyle = KnownTypeAdapters$k.a(p0, obj.mStyle);
                      break;
                    case 7:
                      obj.mLinkUrl = TypeAdapters.A.read(p0);
                      break;
                    case 8:
                      obj.mProductCover = TypeAdapters.A.read(p0);
                      break;
                    case 9:
                      obj.mPoiLeftIcon = this.b.read(p0);
                      break;
                    case 10:
                      obj.mProductOriginalPrice = KnownTypeAdapters$k.a(p0, obj.mProductOriginalPrice);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NearbyLocalLifePoiV2$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mPoiLeftIcon != null) {
             p0.r("poiLeftIcon");
             this.b.write(p0, p1.mPoiLeftIcon);
          }
          if (p1.mPoiId != null) {
             p0.r("poiId");
             TypeAdapters.A.write(p0, p1.mPoiId);
          }
          if (p1.mPoiName != null) {
             p0.r("poiName");
             TypeAdapters.A.write(p0, p1.mPoiName);
          }
          if (p1.mProductCover != null) {
             p0.r("productCover");
             TypeAdapters.A.write(p0, p1.mProductCover);
          }
          if (p1.mProductName != null) {
             p0.r("productName");
             TypeAdapters.A.write(p0, p1.mProductName);
          }
          p0.r("productOriginalPrice");
          p0.K((long)p1.mProductOriginalPrice);
          p0.r("productDiscountPrice");
          p0.K((long)p1.mProductDiscountPrice);
          if (p1.mPoiTag != null) {
             p0.r("poiTag");
             this.c.write(p0, p1.mPoiTag);
          }
          p0.r("style");
          p0.K((long)p1.mStyle);
          if (p1.mDiscountTip != null) {
             p0.r("discountTip");
             TypeAdapters.A.write(p0, p1.mDiscountTip);
          }
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
          }
          p0.j();
       }
       return;
    }
}
