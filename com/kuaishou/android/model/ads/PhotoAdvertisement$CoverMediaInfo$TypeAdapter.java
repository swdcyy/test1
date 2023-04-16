package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverUrl$TypeAdapter;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$CoverMediaInfo$TypeAdapter extends TypeAdapter	// class@000908
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$CoverMediaInfo$TypeAdapter.d = a.get(PhotoAdvertisement$CoverMediaInfo.class);
    }
    public void PhotoAdvertisement$CoverMediaInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PhotoAdvertisement$CoverUrl$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$CoverMediaInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$CoverMediaInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$CoverMediaInfo uCoverMediaI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoverMediaI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoverMediaI;
       }else {
          p0.c();
          PhotoAdvertisement$CoverMediaInfo uCoverMediaI1 = new PhotoAdvertisement$CoverMediaInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x81e67d01:
                   if (str.equals("materialType")) {
                      i = 0;
                   }
                   break;
                 case 0x28ae5e6b:
                   if (str.equals("coverDuration")) {
                      i = 1;
                   }
                   break;
                 case 0x4a033aeb:
                   if (str.equals("coverStart")) {
                      i = 2;
                   }
                   break;
                 case 0x7600fd3b:
                   if (str.equals("coverUrls")) {
                      i = 3;
                   }
                   break;
                 case 0x7f94e13e:
                   if (str.equals("mediaType")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCoverMediaI1.materialType = KnownTypeAdapters$k.a(p0, uCoverMediaI1.materialType);
                   break;
                 case 1:
                   uCoverMediaI1.mCoverDuration = KnownTypeAdapters$n.a(p0, uCoverMediaI1.mCoverDuration);
                   break;
                 case 2:
                   uCoverMediaI1.coverStart = KnownTypeAdapters$n.a(p0, uCoverMediaI1.coverStart);
                   break;
                 case 3:
                   uCoverMediaI1.mCoverUrls = this.c.read(p0);
                   break;
                 case 4:
                   uCoverMediaI1.mediaType = KnownTypeAdapters$k.a(p0, uCoverMediaI1.mediaType);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCoverMediaI1;
       }
    }
    public void b(b p0,PhotoAdvertisement$CoverMediaInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$CoverMediaInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("materialType");
          p0.K((long)p1.materialType);
          p0.r("coverStart");
          p0.K(p1.coverStart);
          p0.r("mediaType");
          p0.K((long)p1.mediaType);
          p0.r("coverDuration");
          p0.K(p1.mCoverDuration);
          if (p1.mCoverUrls != null) {
             p0.r("coverUrls");
             this.c.write(p0, p1.mCoverUrls);
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
