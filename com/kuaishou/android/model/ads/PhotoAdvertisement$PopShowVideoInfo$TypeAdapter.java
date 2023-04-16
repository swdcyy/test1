package com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo;
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
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo$TypeAdapter$a;

public final class PhotoAdvertisement$PopShowVideoInfo$TypeAdapter extends TypeAdapter	// class@0009df
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoAdvertisement$PopShowVideoInfo$TypeAdapter.c = a.get(PhotoAdvertisement$PopShowVideoInfo.class);
    }
    public void PhotoAdvertisement$PopShowVideoInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public PhotoAdvertisement$PopShowVideoInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$PopShowVideoInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$PopShowVideoInfo popShowVideo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return popShowVideo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return popShowVideo;
       }else {
          p0.c();
          PhotoAdvertisement$PopShowVideoInfo popShowVideo1 = new PhotoAdvertisement$PopShowVideoInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9f1bbe0b:
                   if (str.equals("videoWidth")) {
                      i = 0;
                   }
                   break;
                 case 0x2a8d0982:
                   if (str.equals("videoHeight")) {
                      i = 1;
                   }
                   break;
                 case 0x4f73bbff:
                   if (str.equals("videoUrls")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   popShowVideo1.mVideoWidth = KnownTypeAdapters$k.a(p0, popShowVideo1.mVideoWidth);
                   break;
                 case 1:
                   popShowVideo1.mVideoHeight = KnownTypeAdapters$k.a(p0, popShowVideo1.mVideoHeight);
                   break;
                 case 2:
                   popShowVideo1.mVideoUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new PhotoAdvertisement$PopShowVideoInfo$TypeAdapter$b(this)).a(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return popShowVideo1;
       }
    }
    public void b(b p0,PhotoAdvertisement$PopShowVideoInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$PopShowVideoInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mVideoUrls != null) {
             p0.r("videoUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new PhotoAdvertisement$PopShowVideoInfo$TypeAdapter$a(this)).b(p0, p1.mVideoUrls);
          }
          p0.r("videoWidth");
          p0.K((long)p1.mVideoWidth);
          p0.r("videoHeight");
          p0.K((long)p1.mVideoHeight);
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
