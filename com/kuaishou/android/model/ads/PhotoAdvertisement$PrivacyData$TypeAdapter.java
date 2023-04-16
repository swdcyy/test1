package com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyData;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPrivacyLink$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$i;
import java.util.List;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$PrivacyData$TypeAdapter extends TypeAdapter	// class@0009e7
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$PrivacyData$TypeAdapter.d = a.get(PhotoAdvertisement$PrivacyData.class);
    }
    public void PhotoAdvertisement$PrivacyData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PhotoAdvertisement$HalfPrivacyLink$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$PrivacyData a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$PrivacyData$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$PrivacyData privacyData = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return privacyData;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return privacyData;
       }else {
          p0.c();
          PhotoAdvertisement$PrivacyData privacyData1 = new PhotoAdvertisement$PrivacyData();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xd0aa704c:
                   if (str.equals("appName")) {
                      i = 0;
                   }
                   break;
                 case 0xfb30e7ca:
                   if (str.equals("developer")) {
                      i = 1;
                   }
                   break;
                 case 0x6234fb9:
                   if (str.equals("links")) {
                      i = 2;
                   }
                   break;
                 case 0x362cf567:
                   if (str.equals("packageSize")) {
                      i = 3;
                   }
                   break;
                 case 0x5875c377:
                   if (str.equals("appVersion")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   privacyData1.mAppName = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   privacyData1.mDeveloper = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   privacyData1.mLinks = this.c.read(p0);
                   break;
                 case 3:
                   privacyData1.mPackageSize = KnownTypeAdapters$i.a(p0, privacyData1.mPackageSize);
                   break;
                 case 4:
                   privacyData1.mAppVersion = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return privacyData1;
       }
    }
    public void b(b p0,PhotoAdvertisement$PrivacyData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$PrivacyData$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mAppName != null) {
             p0.r("appName");
             TypeAdapters.A.write(p0, p1.mAppName);
          }
          if (p1.mDeveloper != null) {
             p0.r("developer");
             TypeAdapters.A.write(p0, p1.mDeveloper);
          }
          if (p1.mAppVersion != null) {
             p0.r("appVersion");
             TypeAdapters.A.write(p0, p1.mAppVersion);
          }
          p0.r("packageSize");
          p0.J(p1.mPackageSize);
          if (p1.mLinks != null) {
             p0.r("links");
             this.c.write(p0, p1.mLinks);
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
