package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverStickerInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverStickerInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverSticker$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverSticker;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$CoverStickerInfo$TypeAdapter extends TypeAdapter	// class@000914
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoAdvertisement$CoverStickerInfo$TypeAdapter.c = a.get(PhotoAdvertisement$CoverStickerInfo.class);
    }
    public void PhotoAdvertisement$CoverStickerInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$CoverSticker$TypeAdapter.b);
    }
    public PhotoAdvertisement$CoverStickerInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$CoverStickerInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$CoverStickerInfo uCoverSticke = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoverSticke;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoverSticke;
       }else {
          p0.c();
          PhotoAdvertisement$CoverStickerInfo uCoverSticke1 = new PhotoAdvertisement$CoverStickerInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8651671b:
                   if (str.equals("stickerTitle")) {
                      i = 0;
                   }
                   break;
                 case 0xd68a0186:
                   if (str.equals("coverSticker")) {
                      i = 1;
                   }
                   break;
                 case 0x5951eea:
                   if (str.equals("bgUrl")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCoverSticke1.mStickerTitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uCoverSticke1.mCoverSticker = this.b.read(p0);
                   break;
                 case 2:
                   uCoverSticke1.mImageUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCoverSticke1;
       }
    }
    public void b(b p0,PhotoAdvertisement$CoverStickerInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$CoverStickerInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mStickerTitle != null) {
             p0.r("stickerTitle");
             TypeAdapters.A.write(p0, p1.mStickerTitle);
          }
          if (p1.mImageUrl != null) {
             p0.r("bgUrl");
             TypeAdapters.A.write(p0, p1.mImageUrl);
          }
          if (p1.mCoverSticker != null) {
             p0.r("coverSticker");
             this.b.write(p0, p1.mCoverSticker);
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
