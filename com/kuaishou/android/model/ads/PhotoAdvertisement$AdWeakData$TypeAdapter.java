package com.kuaishou.android.model.ads.PhotoAdvertisement$AdWeakData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWeakData;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DownloadInfo$TypeAdapter;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$AdWeakData$TypeAdapter extends TypeAdapter	// class@0008b8
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$AdWeakData$TypeAdapter.d = a.get(PhotoAdvertisement$AdWeakData.class);
    }
    public void PhotoAdvertisement$AdWeakData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PhotoAdvertisement$DownloadInfo$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$AdWeakData a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AdWeakData$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$AdWeakData uAdWeakData = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAdWeakData;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAdWeakData;
       }else {
          p0.c();
          PhotoAdvertisement$AdWeakData uAdWeakData1 = new PhotoAdvertisement$AdWeakData();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xb46c6320:
                   if (str.equals("actionIconUrl")) {
                      i = 0;
                   }
                   break;
                 case 0x42161d56:
                   if (str.equals("downloadInfo")) {
                      i = 1;
                   }
                   break;
                 case 0x506547f3:
                   if (str.equals("weakStyleType")) {
                      i = 2;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uAdWeakData1.mActionIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uAdWeakData1.mDownloadInfo = this.c.read(p0);
                   break;
                 case 2:
                   uAdWeakData1.mWeakStyleType = KnownTypeAdapters$k.a(p0, uAdWeakData1.mWeakStyleType);
                   break;
                 case 3:
                   uAdWeakData1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uAdWeakData1;
       }
    }
    public void b(b p0,PhotoAdvertisement$AdWeakData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AdWeakData$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mActionIconUrl != null) {
             p0.r("actionIconUrl");
             TypeAdapters.A.write(p0, p1.mActionIconUrl);
          }
          p0.r("weakStyleType");
          p0.K((long)p1.mWeakStyleType);
          if (p1.mDownloadInfo != null) {
             p0.r("downloadInfo");
             this.c.write(p0, p1.mDownloadInfo);
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
