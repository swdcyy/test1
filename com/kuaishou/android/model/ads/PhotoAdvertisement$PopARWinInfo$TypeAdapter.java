package com.kuaishou.android.model.ads.PhotoAdvertisement$PopARWinInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARWinInfo;
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

public final class PhotoAdvertisement$PopARWinInfo$TypeAdapter extends TypeAdapter	// class@0009d5
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$PopARWinInfo$TypeAdapter.b = a.get(PhotoAdvertisement$PopARWinInfo.class);
    }
    public void PhotoAdvertisement$PopARWinInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$PopARWinInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$PopARWinInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$PopARWinInfo popARWinInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return popARWinInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return popARWinInfo;
       }else {
          p0.c();
          PhotoAdvertisement$PopARWinInfo popARWinInfo1 = new PhotoAdvertisement$PopARWinInfo();
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
                 case 0xccc36214:
                   if (str.equals("imageUrl")) {
                      i = 1;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 2;
                   }
                   break;
                 case 0x155ef77f:
                   if (str.equals("buttonText")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   popARWinInfo1.mSubTitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   popARWinInfo1.mWinImageUrl = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   popARWinInfo1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   popARWinInfo1.mButtonTitle = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return popARWinInfo1;
       }
    }
    public void b(b p0,PhotoAdvertisement$PopARWinInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$PopARWinInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mWinImageUrl != null) {
             p0.r("imageUrl");
             TypeAdapters.A.write(p0, p1.mWinImageUrl);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mSubTitle != null) {
             p0.r("subTitle");
             TypeAdapters.A.write(p0, p1.mSubTitle);
          }
          if (p1.mButtonTitle != null) {
             p0.r("buttonText");
             TypeAdapters.A.write(p0, p1.mButtonTitle);
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
