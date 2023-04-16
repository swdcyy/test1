package com.kuaishou.android.model.ads.PhotoAdvertisement$LiveGoodsInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LiveGoodsInfo;
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

public final class PhotoAdvertisement$LiveGoodsInfo$TypeAdapter extends TypeAdapter	// class@000995
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$LiveGoodsInfo$TypeAdapter.b = a.get(PhotoAdvertisement$LiveGoodsInfo.class);
    }
    public void PhotoAdvertisement$LiveGoodsInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$LiveGoodsInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$LiveGoodsInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$LiveGoodsInfo liveGoodsInf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return liveGoodsInf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return liveGoodsInf;
       }else {
          p0.c();
          PhotoAdvertisement$LiveGoodsInfo liveGoodsInf1 = new PhotoAdvertisement$LiveGoodsInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xb9d9117d:
                   if (str.equals("priceNum")) {
                      i = 0;
                   }
                   break;
                 case 0xdc70c289:
                   if (str.equals("suffixTag")) {
                      i = 1;
                   }
                   break;
                 case 0xeb084a38:
                   if (str.equals("coverUrl")) {
                      i = 2;
                   }
                   break;
                 case 0x6aabc9:
                   if (str.equals("explainStatus")) {
                      i = 3;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 4;
                   }
                   break;
                 case 0x56b7753b:
                   if (str.equals("pricePrefix")) {
                      i = 5;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   liveGoodsInf1.mPriceNum = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   liveGoodsInf1.mSuffixTag = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   liveGoodsInf1.mCoverUrl = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   liveGoodsInf1.mExplainStatus = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   liveGoodsInf1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   liveGoodsInf1.mPricePrefix = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return liveGoodsInf1;
       }
    }
    public void b(b p0,PhotoAdvertisement$LiveGoodsInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$LiveGoodsInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mCoverUrl != null) {
             p0.r("coverUrl");
             TypeAdapters.A.write(p0, p1.mCoverUrl);
          }
          if (p1.mExplainStatus != null) {
             p0.r("explainStatus");
             TypeAdapters.A.write(p0, p1.mExplainStatus);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mPricePrefix != null) {
             p0.r("pricePrefix");
             TypeAdapters.A.write(p0, p1.mPricePrefix);
          }
          if (p1.mPriceNum != null) {
             p0.r("priceNum");
             TypeAdapters.A.write(p0, p1.mPriceNum);
          }
          if (p1.mSuffixTag != null) {
             p0.r("suffixTag");
             TypeAdapters.A.write(p0, p1.mSuffixTag);
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
