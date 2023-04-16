package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverSticker$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverSticker;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$CoverSticker$TypeAdapter extends TypeAdapter	// class@000910
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$CoverSticker$TypeAdapter.b = a.get(PhotoAdvertisement$CoverSticker.class);
    }
    public void PhotoAdvertisement$CoverSticker$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$CoverSticker a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$CoverSticker$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$CoverSticker uCoverSticke = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoverSticke;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoverSticke;
       }else {
          p0.c();
          PhotoAdvertisement$CoverSticker uCoverSticke1 = new PhotoAdvertisement$CoverSticker();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("stickerStyle")) {
                if (!str.equals("stickerLocation")) {
                   p0.Q();
                }else {
                   uCoverSticke1.mStickerLocation = KnownTypeAdapters$k.a(p0, uCoverSticke1.mStickerLocation);
                }
             }else {
                uCoverSticke1.mStickerStyle = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return uCoverSticke1;
       }
    }
    public void b(b p0,PhotoAdvertisement$CoverSticker p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$CoverSticker$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mStickerStyle != null) {
             p0.r("stickerStyle");
             TypeAdapters.A.write(p0, p1.mStickerStyle);
          }
          p0.r("stickerLocation");
          p0.K((long)p1.mStickerLocation);
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
