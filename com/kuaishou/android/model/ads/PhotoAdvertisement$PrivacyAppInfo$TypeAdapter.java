package com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyAppInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyAppInfo;
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
import com.vimeo.stag.KnownTypeAdapters$i;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$PrivacyAppInfo$TypeAdapter extends TypeAdapter	// class@0009e3
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$PrivacyAppInfo$TypeAdapter.b = a.get(PhotoAdvertisement$PrivacyAppInfo.class);
    }
    public void PhotoAdvertisement$PrivacyAppInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$PrivacyAppInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$PrivacyAppInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$PrivacyAppInfo privacyAppIn = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return privacyAppIn;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return privacyAppIn;
       }else {
          p0.c();
          PhotoAdvertisement$PrivacyAppInfo privacyAppIn1 = new PhotoAdvertisement$PrivacyAppInfo();
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
                 case 0xee5c7336:
                   if (str.equals("updateTime")) {
                      i = 1;
                   }
                   break;
                 case 0xfb30e7ca:
                   if (str.equals("developer")) {
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
                   privacyAppIn1.mAppName = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   privacyAppIn1.mUpdateTime = KnownTypeAdapters$n.a(p0, privacyAppIn1.mUpdateTime);
                   break;
                 case 2:
                   privacyAppIn1.mDeveloper = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   privacyAppIn1.mPackageSize = KnownTypeAdapters$i.a(p0, privacyAppIn1.mPackageSize);
                   break;
                 case 4:
                   privacyAppIn1.mAppVersion = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return privacyAppIn1;
       }
    }
    public void b(b p0,PhotoAdvertisement$PrivacyAppInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$PrivacyAppInfo$TypeAdapter.class, "1")) {
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
          if (p1.mAppVersion != null) {
             p0.r("appVersion");
             TypeAdapters.A.write(p0, p1.mAppVersion);
          }
          p0.r("packageSize");
          p0.J(p1.mPackageSize);
          p0.r("updateTime");
          p0.K(p1.mUpdateTime);
          if (p1.mDeveloper != null) {
             p0.r("developer");
             TypeAdapters.A.write(p0, p1.mDeveloper);
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
