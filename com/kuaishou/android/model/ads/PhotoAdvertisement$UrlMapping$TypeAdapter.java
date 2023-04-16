package com.kuaishou.android.model.ads.PhotoAdvertisement$UrlMapping$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$UrlMapping;
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

public final class PhotoAdvertisement$UrlMapping$TypeAdapter extends TypeAdapter	// class@000a56
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$UrlMapping$TypeAdapter.b = a.get(PhotoAdvertisement$UrlMapping.class);
    }
    public void PhotoAdvertisement$UrlMapping$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$UrlMapping a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$UrlMapping$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$UrlMapping urlMapping = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return urlMapping;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return urlMapping;
       }else {
          p0.c();
          PhotoAdvertisement$UrlMapping urlMapping1 = new PhotoAdvertisement$UrlMapping();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x1c56f:
                   if (str.equals("url")) {
                      i = 0;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 1;
                   }
                   break;
                 case 0x23a88573:
                   if (str.equals("placeholder")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   urlMapping1.mUrl = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   urlMapping1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   urlMapping1.mPlaceholder = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return urlMapping1;
       }
    }
    public void b(b p0,PhotoAdvertisement$UrlMapping p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$UrlMapping$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mPlaceholder != null) {
             p0.r("placeholder");
             TypeAdapters.A.write(p0, p1.mPlaceholder);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mUrl);
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
