package com.kuaishou.android.model.ads.PhotoAdvertisement$AppDetailInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppDetailInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
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
import com.vimeo.stag.KnownTypeAdapters$i;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$AppDetailInfo$TypeAdapter extends TypeAdapter	// class@0008c0
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoAdvertisement$AppDetailInfo$TypeAdapter.c = a.get(PhotoAdvertisement$AppDetailInfo.class);
    }
    public void PhotoAdvertisement$AppDetailInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$AppDetailInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AppDetailInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$AppDetailInfo uAppDetailIn = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAppDetailIn;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAppDetailIn;
       }else {
          p0.c();
          PhotoAdvertisement$AppDetailInfo uAppDetailIn1 = new PhotoAdvertisement$AppDetailInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa52e38d5:
                   if (str.equals("appIconUrl")) {
                      i = 0;
                   }
                   break;
                 case 0xa5a8e175:
                   if (str.equals("developerName")) {
                      i = 1;
                   }
                   break;
                 case 0xb7cf3dde:
                   if (str.equals("downloadNum")) {
                      i = 2;
                   }
                   break;
                 case 0xc0cb40af:
                   if (str.equals("officialTag")) {
                      i = 3;
                   }
                   break;
                 case 0xd0aa704c:
                   if (str.equals("appName")) {
                      i = 4;
                   }
                   break;
                 case 0xd0acd5c2:
                   if (str.equals("appSize")) {
                      i = 5;
                   }
                   break;
                 case 0xe2249487:
                   if (str.equals("cdnScreenShortUrls")) {
                      i = 6;
                   }
                   break;
                 case 0xee5c7336:
                   if (str.equals("updateTime")) {
                      i = 7;
                   }
                   break;
                 case 'h':
                   if (str.equals("h")) {
                      i = 8;
                   }
                   break;
                 case 'w':
                   if (str.equals("w")) {
                      i = 9;
                   }
                   break;
                 case 0x2f96ea3f:
                   if (str.equals("appCategory")) {
                      i = 10;
                   }
                   break;
                 case 0x44eb00f1:
                   if (str.equals("appScore")) {
                      i = 11;
                   }
                   break;
                 case 0x48b3c31b:
                   if (str.equals("appDescription")) {
                      i = 12;
                   }
                   break;
                 case 0x5875c377:
                   if (str.equals("appVersion")) {
                      i = 13;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uAppDetailIn1.mAppIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uAppDetailIn1.mDeveloperName = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uAppDetailIn1.mDownloadNum = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uAppDetailIn1.mOfficialTag = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   uAppDetailIn1.mAppName = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uAppDetailIn1.mAppSize = KnownTypeAdapters$i.a(p0, uAppDetailIn1.mAppSize);
                   break;
                 case 6:
                   uAppDetailIn1.mCdnScreenShortUrls = this.b.read(p0);
                   break;
                 case 7:
                   uAppDetailIn1.mUpdateTime = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   uAppDetailIn1.mScreenHeight = KnownTypeAdapters$k.a(p0, uAppDetailIn1.mScreenHeight);
                   break;
                 case 9:
                   uAppDetailIn1.mScreenWidth = KnownTypeAdapters$k.a(p0, uAppDetailIn1.mScreenWidth);
                   break;
                 case 10:
                   uAppDetailIn1.mAppCategory = TypeAdapters.A.read(p0);
                   break;
                 case 11:
                   uAppDetailIn1.mAppScore = KnownTypeAdapters$i.a(p0, uAppDetailIn1.mAppScore);
                   break;
                 case 12:
                   uAppDetailIn1.mAppDescription = TypeAdapters.A.read(p0);
                   break;
                 case 13:
                   uAppDetailIn1.mAppVersion = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uAppDetailIn1;
       }
    }
    public void b(b p0,PhotoAdvertisement$AppDetailInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AppDetailInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mAppIconUrl != null) {
             p0.r("appIconUrl");
             TypeAdapters.A.write(p0, p1.mAppIconUrl);
          }
          p0.r("appScore");
          p0.J(p1.mAppScore);
          if (p1.mUpdateTime != null) {
             p0.r("updateTime");
             TypeAdapters.A.write(p0, p1.mUpdateTime);
          }
          if (p1.mCdnScreenShortUrls != null) {
             p0.r("cdnScreenShortUrls");
             this.b.write(p0, p1.mCdnScreenShortUrls);
          }
          p0.r("w");
          p0.K((long)p1.mScreenWidth);
          p0.r("h");
          p0.K((long)p1.mScreenHeight);
          p0.r("appSize");
          p0.J(p1.mAppSize);
          if (p1.mAppName != null) {
             p0.r("appName");
             TypeAdapters.A.write(p0, p1.mAppName);
          }
          if (p1.mDeveloperName != null) {
             p0.r("developerName");
             TypeAdapters.A.write(p0, p1.mDeveloperName);
          }
          if (p1.mAppVersion != null) {
             p0.r("appVersion");
             TypeAdapters.A.write(p0, p1.mAppVersion);
          }
          if (p1.mAppDescription != null) {
             p0.r("appDescription");
             TypeAdapters.A.write(p0, p1.mAppDescription);
          }
          if (p1.mAppCategory != null) {
             p0.r("appCategory");
             TypeAdapters.A.write(p0, p1.mAppCategory);
          }
          if (p1.mDownloadNum != null) {
             p0.r("downloadNum");
             TypeAdapters.A.write(p0, p1.mDownloadNum);
          }
          if (p1.mOfficialTag != null) {
             p0.r("officialTag");
             TypeAdapters.A.write(p0, p1.mOfficialTag);
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
