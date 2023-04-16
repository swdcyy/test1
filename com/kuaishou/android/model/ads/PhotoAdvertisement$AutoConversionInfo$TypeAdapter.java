package com.kuaishou.android.model.ads.PhotoAdvertisement$AutoConversionInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AutoConversionInfo;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$AutoConversionInfo$TypeAdapter extends TypeAdapter	// class@0008ca
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$AutoConversionInfo$TypeAdapter.b = a.get(PhotoAdvertisement$AutoConversionInfo.class);
    }
    public void PhotoAdvertisement$AutoConversionInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$AutoConversionInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AutoConversionInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$AutoConversionInfo uAutoConvers = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAutoConvers;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAutoConvers;
       }else {
          p0.c();
          PhotoAdvertisement$AutoConversionInfo uAutoConvers1 = new PhotoAdvertisement$AutoConversionInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("delayTime")) {
                if (!str.equals("type")) {
                   p0.Q();
                }else {
                   uAutoConvers1.mAutoConversionType = KnownTypeAdapters$k.a(p0, uAutoConvers1.mAutoConversionType);
                }
             }else {
                uAutoConvers1.mAutoConversionDelayTimeMS = KnownTypeAdapters$n.a(p0, uAutoConvers1.mAutoConversionDelayTimeMS);
             }
          }
          p0.j();
          return uAutoConvers1;
       }
    }
    public void b(b p0,PhotoAdvertisement$AutoConversionInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AutoConversionInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mAutoConversionType);
          p0.r("delayTime");
          p0.K(p1.mAutoConversionDelayTimeMS);
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
