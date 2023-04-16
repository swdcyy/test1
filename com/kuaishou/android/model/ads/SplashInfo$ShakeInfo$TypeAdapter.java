package com.kuaishou.android.model.ads.SplashInfo$ShakeInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$ShakeInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class SplashInfo$ShakeInfo$TypeAdapter extends TypeAdapter	// class@000a9d
{
    public final Gson a;
    public static final a b;

    static {
       SplashInfo$ShakeInfo$TypeAdapter.b = a.get(SplashInfo$ShakeInfo.class);
    }
    public void SplashInfo$ShakeInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SplashInfo$ShakeInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$ShakeInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$ShakeInfo shakeInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return shakeInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return shakeInfo;
       }else {
          p0.c();
          SplashInfo$ShakeInfo shakeInfo1 = new SplashInfo$ShakeInfo();
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
                 case 0x3b8434cc:
                   if (str.equals("liveTitle")) {
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
                   shakeInfo1.mLiveTitle = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return shakeInfo1;
       }
    }
    public void b(b p0,SplashInfo$ShakeInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$ShakeInfo$TypeAdapter.class, "1")) {
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
          p0.r("triggerCountThreshold");
          p0.K((long)p1.mTriggerCount);
          if (p1.mLiveTitle != null) {
             p0.r("liveTitle");
             TypeAdapters.A.write(p0, p1.mLiveTitle);
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
