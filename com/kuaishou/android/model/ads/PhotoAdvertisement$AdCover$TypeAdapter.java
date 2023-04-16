package com.kuaishou.android.model.ads.PhotoAdvertisement$AdCover$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCover;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCover$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCover$TypeAdapter$a;

public final class PhotoAdvertisement$AdCover$TypeAdapter extends TypeAdapter	// class@00089f
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoAdvertisement$AdCover$TypeAdapter.c = a.get(PhotoAdvertisement$AdCover.class);
    }
    public void PhotoAdvertisement$AdCover$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public PhotoAdvertisement$AdCover a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AdCover$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$AdCover uAdCover = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAdCover;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAdCover;
       }else {
          p0.c();
          PhotoAdvertisement$AdCover uAdCover1 = new PhotoAdvertisement$AdCover();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xb7389127:
                   if (str.equals("height")) {
                      i = 0;
                   }
                   break;
                 case 0x6be2dc6:
                   if (str.equals("width")) {
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
                   uAdCover1.mHeight = KnownTypeAdapters$k.a(p0, uAdCover1.mHeight);
                   break;
                 case 1:
                   uAdCover1.mWidth = KnownTypeAdapters$k.a(p0, uAdCover1.mWidth);
                   break;
                 case 2:
                   uAdCover1.mCoverUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new PhotoAdvertisement$AdCover$TypeAdapter$b(this)).a(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uAdCover1;
       }
    }
    public void b(b p0,PhotoAdvertisement$AdCover p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AdCover$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mCoverUrls != null) {
             p0.r("coverUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new PhotoAdvertisement$AdCover$TypeAdapter$a(this)).b(p0, p1.mCoverUrls);
          }
          p0.r("width");
          p0.K((long)p1.mWidth);
          p0.r("height");
          p0.K((long)p1.mHeight);
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
