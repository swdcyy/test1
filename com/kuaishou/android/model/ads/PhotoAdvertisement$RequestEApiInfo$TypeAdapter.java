package com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo$CardStyleInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo$CardStyleInfo;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$RequestEApiInfo$TypeAdapter extends TypeAdapter	// class@0009f9
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoAdvertisement$RequestEApiInfo$TypeAdapter.c = a.get(PhotoAdvertisement$RequestEApiInfo.class);
    }
    public void PhotoAdvertisement$RequestEApiInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$RequestEApiInfo$CardStyleInfo$TypeAdapter.b);
    }
    public PhotoAdvertisement$RequestEApiInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$RequestEApiInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$RequestEApiInfo requestEApiI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return requestEApiI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return requestEApiI;
       }else {
          p0.c();
          PhotoAdvertisement$RequestEApiInfo requestEApiI1 = new PhotoAdvertisement$RequestEApiInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xc48acccf:
                   if (str.equals("cardStyleInfo")) {
                      i = 0;
                   }
                   break;
                 case 0xec403ca8:
                   if (str.equals("serverExtData")) {
                      i = 1;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 2;
                   }
                   break;
                 case 0x5c686e89:
                   if (str.equals("delayMs")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   requestEApiI1.mCardStyleInfo = this.b.read(p0);
                   break;
                 case 1:
                   requestEApiI1.mServerExtData = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   requestEApiI1.mType = KnownTypeAdapters$k.a(p0, requestEApiI1.mType);
                   break;
                 case 3:
                   requestEApiI1.mDelayMs = KnownTypeAdapters$n.a(p0, requestEApiI1.mDelayMs);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return requestEApiI1;
       }
    }
    public void b(b p0,PhotoAdvertisement$RequestEApiInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$RequestEApiInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
          if (p1.mServerExtData != null) {
             p0.r("serverExtData");
             TypeAdapters.A.write(p0, p1.mServerExtData);
          }
          p0.r("delayMs");
          p0.K(p1.mDelayMs);
          if (p1.mCardStyleInfo != null) {
             p0.r("cardStyleInfo");
             this.b.write(p0, p1.mCardStyleInfo);
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
