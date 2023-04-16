package com.kuaishou.android.model.ads.PhotoAdvertisement$InterceptInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InterceptInfo;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$InterceptInfo$TypeAdapter extends TypeAdapter	// class@000970
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$InterceptInfo$TypeAdapter.b = a.get(PhotoAdvertisement$InterceptInfo.class);
    }
    public void PhotoAdvertisement$InterceptInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$InterceptInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$InterceptInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$InterceptInfo interceptInf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return interceptInf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return interceptInf;
       }else {
          p0.c();
          PhotoAdvertisement$InterceptInfo interceptInf1 = new PhotoAdvertisement$InterceptInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xc4536535:
                   if (str.equals("speedUpTimeMs")) {
                      i = 0;
                   }
                   break;
                 case 0x6969627:
                   if (str.equals("toast")) {
                      i = 1;
                   }
                   break;
                 case 0x7e250e6:
                   if (str.equals("delayShowMs")) {
                      i = 2;
                   }
                   break;
                 case 0xbd151fd:
                   if (str.equals("actionBar")) {
                      i = 3;
                   }
                   break;
                 case 0x38b73479:
                   if (str.equals("content")) {
                      i = 4;
                   }
                   break;
                 case 0x5bbd2550:
                   if (str.equals("lottieUrl")) {
                      i = 5;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   interceptInf1.mSpeedUpTimeMs = KnownTypeAdapters$n.a(p0, interceptInf1.mSpeedUpTimeMs);
                   break;
                 case 1:
                   interceptInf1.mToast = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   interceptInf1.mDelayShowMs = KnownTypeAdapters$n.a(p0, interceptInf1.mDelayShowMs);
                   break;
                 case 3:
                   interceptInf1.mActionBar = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   interceptInf1.mContent = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   interceptInf1.mLottieUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return interceptInf1;
       }
    }
    public void b(b p0,PhotoAdvertisement$InterceptInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$InterceptInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("delayShowMs");
          p0.K(p1.mDelayShowMs);
          p0.r("speedUpTimeMs");
          p0.K(p1.mSpeedUpTimeMs);
          if (p1.mActionBar != null) {
             p0.r("actionBar");
             TypeAdapters.A.write(p0, p1.mActionBar);
          }
          if (p1.mContent != null) {
             p0.r("content");
             TypeAdapters.A.write(p0, p1.mContent);
          }
          if (p1.mLottieUrl != null) {
             p0.r("lottieUrl");
             TypeAdapters.A.write(p0, p1.mLottieUrl);
          }
          if (p1.mToast != null) {
             p0.r("toast");
             TypeAdapters.A.write(p0, p1.mToast);
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
