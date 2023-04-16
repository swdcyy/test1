package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverData;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverItem$TypeAdapter;
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
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$CoverData$TypeAdapter extends TypeAdapter	// class@000900
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$CoverData$TypeAdapter.d = a.get(PhotoAdvertisement$CoverData.class);
    }
    public void PhotoAdvertisement$CoverData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PhotoAdvertisement$CoverItem$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$CoverData a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$CoverData$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$CoverData uCoverData = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoverData;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoverData;
       }else {
          p0.c();
          PhotoAdvertisement$CoverData uCoverData1 = new PhotoAdvertisement$CoverData();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xe2ceebbe:
                   if (str.equals("coverHeight")) {
                      i = 0;
                   }
                   break;
                 case 0x4a36a44f:
                   if (str.equals("coverWidth")) {
                      i = 1;
                   }
                   break;
                 case 0x7600fd3b:
                   if (str.equals("coverUrls")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCoverData1.mCoverHeight = KnownTypeAdapters$k.a(p0, uCoverData1.mCoverHeight);
                   break;
                 case 1:
                   uCoverData1.mCoverWidth = KnownTypeAdapters$k.a(p0, uCoverData1.mCoverWidth);
                   break;
                 case 2:
                   uCoverData1.mCoverItems = this.c.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCoverData1;
       }
    }
    public void b(b p0,PhotoAdvertisement$CoverData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$CoverData$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mCoverItems != null) {
             p0.r("coverUrls");
             this.c.write(p0, p1.mCoverItems);
          }
          p0.r("coverHeight");
          p0.K((long)p1.mCoverHeight);
          p0.r("coverWidth");
          p0.K((long)p1.mCoverWidth);
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
