package com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBigvLive$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBigvLive;
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

public final class PhotoAdvertisement$SearchBigvLive$TypeAdapter extends TypeAdapter	// class@000a05
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$SearchBigvLive$TypeAdapter.b = a.get(PhotoAdvertisement$SearchBigvLive.class);
    }
    public void PhotoAdvertisement$SearchBigvLive$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$SearchBigvLive a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$SearchBigvLive$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$SearchBigvLive searchBigvLi = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return searchBigvLi;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return searchBigvLi;
       }else {
          p0.c();
          PhotoAdvertisement$SearchBigvLive searchBigvLi1 = new PhotoAdvertisement$SearchBigvLive();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8d2f34be:
                   if (str.equals("titleIconUrl")) {
                      i = 0;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 1;
                   }
                   break;
                 case 0x18b6bfbe:
                   if (str.equals("titleIconText")) {
                      i = 2;
                   }
                   break;
                 case 0x59c512e4:
                   if (str.equals("titleIconLinkUrl")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   searchBigvLi1.mTitleIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   searchBigvLi1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   searchBigvLi1.mTitleIconText = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   searchBigvLi1.mTitleIconLinkUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return searchBigvLi1;
       }
    }
    public void b(b p0,PhotoAdvertisement$SearchBigvLive p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$SearchBigvLive$TypeAdapter.class, "1")) {
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
          if (p1.mTitleIconLinkUrl != null) {
             p0.r("titleIconLinkUrl");
             TypeAdapters.A.write(p0, p1.mTitleIconLinkUrl);
          }
          if (p1.mTitleIconText != null) {
             p0.r("titleIconText");
             TypeAdapters.A.write(p0, p1.mTitleIconText);
          }
          if (p1.mTitleIconUrl != null) {
             p0.r("titleIconUrl");
             TypeAdapters.A.write(p0, p1.mTitleIconUrl);
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
