package com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLink$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLink;
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

public final class PhotoAdvertisement$ChildLink$TypeAdapter extends TypeAdapter	// class@0008d6
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$ChildLink$TypeAdapter.b = a.get(PhotoAdvertisement$ChildLink.class);
    }
    public void PhotoAdvertisement$ChildLink$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$ChildLink a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$ChildLink$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$ChildLink uChildLink = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uChildLink;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uChildLink;
       }else {
          p0.c();
          PhotoAdvertisement$ChildLink uChildLink1 = new PhotoAdvertisement$ChildLink();
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
                 case 0xb95cfaac:
                   if (str.equals("imgUrl")) {
                      i = 1;
                   }
                   break;
                 case 0xe9995c89:
                   if (str.equals("deepLinkUrl")) {
                      i = 2;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 3;
                   }
                   break;
                 case 0xa8de315:
                   if (str.equals("linkUrl")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uChildLink1.mSubtitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uChildLink1.mImgUrl = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uChildLink1.mDeepLinkUrl = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uChildLink1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   uChildLink1.mLinkUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uChildLink1;
       }
    }
    public void b(b p0,PhotoAdvertisement$ChildLink p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$ChildLink$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mImgUrl != null) {
             p0.r("imgUrl");
             TypeAdapters.A.write(p0, p1.mImgUrl);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mSubtitle != null) {
             p0.r("subTitle");
             TypeAdapters.A.write(p0, p1.mSubtitle);
          }
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
          }
          if (p1.mDeepLinkUrl != null) {
             p0.r("deepLinkUrl");
             TypeAdapters.A.write(p0, p1.mDeepLinkUrl);
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
