package com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingHeaderLabel$TypeAdapter;
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
import java.util.List;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$HeaderData$TypeAdapter extends TypeAdapter	// class@000958
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$HeaderData$TypeAdapter.d = a.get(PhotoAdvertisement$HeaderData.class);
    }
    public void PhotoAdvertisement$HeaderData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PhotoAdvertisement$HalfLandingHeaderLabel$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$HeaderData a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$HeaderData$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$HeaderData headerData = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return headerData;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return headerData;
       }else {
          p0.c();
          PhotoAdvertisement$HeaderData headerData1 = new PhotoAdvertisement$HeaderData();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x2efe91:
                   if (str.equals("desc")) {
                      i = 0;
                   }
                   break;
                 case 0x363419:
                   if (str.equals("tags")) {
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
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   headerData1.mDesc = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   headerData1.mLabels = this.c.read(p0);
                   break;
                 case 2:
                   headerData1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   headerData1.mButtonText = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   headerData1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return headerData1;
       }
    }
    public void b(b p0,PhotoAdvertisement$HeaderData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$HeaderData$TypeAdapter.class, "1")) {
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
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mDesc != null) {
             p0.r("desc");
             TypeAdapters.A.write(p0, p1.mDesc);
          }
          if (p1.mButtonText != null) {
             p0.r("buttonText");
             TypeAdapters.A.write(p0, p1.mButtonText);
          }
          if (p1.mLabels != null) {
             p0.r("tags");
             this.c.write(p0, p1.mLabels);
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
