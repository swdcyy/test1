package com.kuaishou.android.model.ads.PhotoAdvertisement$PopARInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRuleInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARWinInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARWinInfo;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRuleInfo;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$PopARInfo$TypeAdapter extends TypeAdapter	// class@0009c9
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$PopARInfo$TypeAdapter.d = a.get(PhotoAdvertisement$PopARInfo.class);
    }
    public void PhotoAdvertisement$PopARInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$PopARRuleInfo$TypeAdapter.d);
       this.c = p0.j(PhotoAdvertisement$PopARWinInfo$TypeAdapter.b);
    }
    public PhotoAdvertisement$PopARInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$PopARInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$PopARInfo popARInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return popARInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return popARInfo;
       }else {
          p0.c();
          PhotoAdvertisement$PopARInfo popARInfo1 = new PhotoAdvertisement$PopARInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x894ffe2c:
                   if (str.equals("popARRuleInfo")) {
                      i = 0;
                   }
                   break;
                 case 0xadbeb08:
                   if (str.equals("loadingImgUrl")) {
                      i = 1;
                   }
                   break;
                 case 0x2a199c65:
                   if (str.equals("magicFaceId")) {
                      i = 2;
                   }
                   break;
                 case 0x6c1fd608:
                   if (str.equals("popARWinInfo")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   popARInfo1.mPopARRuleInfo = this.b.read(p0);
                   break;
                 case 1:
                   popARInfo1.mLoadingImageUrl = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   popARInfo1.magicFaceId = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   popARInfo1.mPopARWinInfo = this.c.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return popARInfo1;
       }
    }
    public void b(b p0,PhotoAdvertisement$PopARInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$PopARInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.magicFaceId != null) {
             p0.r("magicFaceId");
             TypeAdapters.A.write(p0, p1.magicFaceId);
          }
          if (p1.mLoadingImageUrl != null) {
             p0.r("loadingImgUrl");
             TypeAdapters.A.write(p0, p1.mLoadingImageUrl);
          }
          if (p1.mPopARRuleInfo != null) {
             p0.r("popARRuleInfo");
             this.b.write(p0, p1.mPopARRuleInfo);
          }
          if (p1.mPopARWinInfo != null) {
             p0.r("popARWinInfo");
             this.c.write(p0, p1.mPopARWinInfo);
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
