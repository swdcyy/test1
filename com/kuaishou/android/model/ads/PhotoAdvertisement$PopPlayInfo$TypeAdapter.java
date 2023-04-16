package com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$PopPlayInfo$TypeAdapter extends TypeAdapter	// class@0009d9
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoAdvertisement$PopPlayInfo$TypeAdapter.c = a.get(PhotoAdvertisement$PopPlayInfo.class);
    }
    public void PhotoAdvertisement$PopPlayInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$PopShowVideoInfo$TypeAdapter.c);
    }
    public PhotoAdvertisement$PopPlayInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$PopPlayInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$PopPlayInfo popPlayInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return popPlayInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return popPlayInfo;
       }else {
          p0.c();
          PhotoAdvertisement$PopPlayInfo popPlayInfo1 = new PhotoAdvertisement$PopPlayInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xe0e87d1f:
                   if (str.equals("showWebDelayTimeMs")) {
                      i = 0;
                   }
                   break;
                 case 0xf413e443:
                   if (str.equals("actionBarColorDelayMs")) {
                      i = 1;
                   }
                   break;
                 case 0x26633caa:
                   if (str.equals("popVideo")) {
                      i = 2;
                   }
                   break;
                 case 0x4db99f35:
                   if (str.equals("templateId")) {
                      i = 3;
                   }
                   break;
                 case 0x5ecb33e5:
                   if (str.equals("displayDurMs")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   popPlayInfo1.mShowWebDelayTimeMs = KnownTypeAdapters$k.a(p0, popPlayInfo1.mShowWebDelayTimeMs);
                   break;
                 case 1:
                   popPlayInfo1.mActionBarColorDelayMs = KnownTypeAdapters$k.a(p0, popPlayInfo1.mActionBarColorDelayMs);
                   break;
                 case 2:
                   popPlayInfo1.mPopShowVideoInfo = this.b.read(p0);
                   break;
                 case 3:
                   popPlayInfo1.mTemplateId = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   popPlayInfo1.mDisplayDurMs = KnownTypeAdapters$k.a(p0, popPlayInfo1.mDisplayDurMs);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return popPlayInfo1;
       }
    }
    public void b(b p0,PhotoAdvertisement$PopPlayInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$PopPlayInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("showWebDelayTimeMs");
          p0.K((long)p1.mShowWebDelayTimeMs);
          p0.r("displayDurMs");
          p0.K((long)p1.mDisplayDurMs);
          if (p1.mTemplateId != null) {
             p0.r("templateId");
             TypeAdapters.A.write(p0, p1.mTemplateId);
          }
          p0.r("actionBarColorDelayMs");
          p0.K((long)p1.mActionBarColorDelayMs);
          if (p1.mPopShowVideoInfo != null) {
             p0.r("popVideo");
             this.b.write(p0, p1.mPopShowVideoInfo);
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
