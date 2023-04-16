package com.kuaishou.android.model.ads.PhotoAdvertisement$TransitionInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TransitionInfo;
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

public final class PhotoAdvertisement$TransitionInfo$TypeAdapter extends TypeAdapter	// class@000a49
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$TransitionInfo$TypeAdapter.b = a.get(PhotoAdvertisement$TransitionInfo.class);
    }
    public void PhotoAdvertisement$TransitionInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$TransitionInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$TransitionInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$TransitionInfo transitionIn = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return transitionIn;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return transitionIn;
       }else {
          p0.c();
          PhotoAdvertisement$TransitionInfo transitionIn1 = new PhotoAdvertisement$TransitionInfo();
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
                 case 0x44a0a2f4:
                   if (str.equals("videoUrl")) {
                      i = 2;
                   }
                   break;
                 case 0x4967425a:
                   if (str.equals("durationMs")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   transitionIn1.mHeight = KnownTypeAdapters$k.a(p0, transitionIn1.mHeight);
                   break;
                 case 1:
                   transitionIn1.mWidth = KnownTypeAdapters$k.a(p0, transitionIn1.mWidth);
                   break;
                 case 2:
                   transitionIn1.mVideoUrl = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   transitionIn1.mDurationMs = KnownTypeAdapters$k.a(p0, transitionIn1.mDurationMs);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return transitionIn1;
       }
    }
    public void b(b p0,PhotoAdvertisement$TransitionInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$TransitionInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mVideoUrl != null) {
             p0.r("videoUrl");
             TypeAdapters.A.write(p0, p1.mVideoUrl);
          }
          p0.r("durationMs");
          p0.K((long)p1.mDurationMs);
          p0.r("height");
          p0.K((long)p1.mHeight);
          p0.r("width");
          p0.K((long)p1.mWidth);
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
