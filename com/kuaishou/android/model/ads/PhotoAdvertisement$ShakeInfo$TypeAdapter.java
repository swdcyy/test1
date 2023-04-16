package com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$ShakeInfo$TypeAdapter extends TypeAdapter	// class@000a19
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$ShakeInfo$TypeAdapter.b = a.get(PhotoAdvertisement$ShakeInfo.class);
    }
    public void PhotoAdvertisement$ShakeInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$ShakeInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$ShakeInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$ShakeInfo shakeInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return shakeInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return shakeInfo;
       }else {
          p0.c();
          PhotoAdvertisement$ShakeInfo shakeInfo1 = new PhotoAdvertisement$ShakeInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x852f4c18:
                   if (str.equals("subtitle")) {
                      i = 0;
                   }
                   break;
                 case 0x967b33f4:
                   if (str.equals("triggerCountThreshold")) {
                      i = 1;
                   }
                   break;
                 case 0xec39bfcb:
                   if (str.equals("accelerationThreshold")) {
                      i = 2;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 3;
                   }
                   break;
                 case 0x126c5c24:
                   if (str.equals("clickDisabled")) {
                      i = 4;
                   }
                   break;
                 case 0x173934cd:
                   if (str.equals("shakeEnableDelayTimeMs")) {
                      i = 5;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   shakeInfo1.mSubtitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   shakeInfo1.mTriggerCount = KnownTypeAdapters$k.a(p0, shakeInfo1.mTriggerCount);
                   break;
                 case 2:
                   shakeInfo1.mAccelerationThreshold = KnownTypeAdapters$k.a(p0, shakeInfo1.mAccelerationThreshold);
                   break;
                 case 3:
                   shakeInfo1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   shakeInfo1.mClickDisabled = KnownTypeAdapters$g.a(p0, shakeInfo1.mClickDisabled);
                   break;
                 case 5:
                   shakeInfo1.mShakeEnableDelayTimeMs = KnownTypeAdapters$k.a(p0, shakeInfo1.mShakeEnableDelayTimeMs);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return shakeInfo1;
       }
    }
    public void b(b p0,PhotoAdvertisement$ShakeInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$ShakeInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mSubtitle != null) {
             p0.r("subtitle");
             TypeAdapters.A.write(p0, p1.mSubtitle);
          }
          p0.r("clickDisabled");
          p0.P(p1.mClickDisabled);
          p0.r("accelerationThreshold");
          p0.K((long)p1.mAccelerationThreshold);
          p0.r("shakeEnableDelayTimeMs");
          p0.K((long)p1.mShakeEnableDelayTimeMs);
          p0.r("triggerCountThreshold");
          p0.K((long)p1.mTriggerCount);
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
