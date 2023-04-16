package com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class SplashInfo$SplashLocalRecordInfo$TypeAdapter extends TypeAdapter	// class@000aaf
{
    public final Gson a;
    public static final a b;

    static {
       SplashInfo$SplashLocalRecordInfo$TypeAdapter.b = a.get(SplashInfo$SplashLocalRecordInfo.class);
    }
    public void SplashInfo$SplashLocalRecordInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SplashInfo$SplashLocalRecordInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$SplashLocalRecordInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$SplashLocalRecordInfo splashLocalR = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return splashLocalR;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return splashLocalR;
       }else {
          p0.c();
          SplashInfo$SplashLocalRecordInfo splashLocalR1 = new SplashInfo$SplashLocalRecordInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x81158a4f:
                   if (str.equals("startTime")) {
                      i = 0;
                   }
                   break;
                 case 0xa0336a48:
                   if (str.equals("endTime")) {
                      i = 1;
                   }
                   break;
                 case 0xc4560e61:
                   if (str.equals("validCarriedCount")) {
                      i = 2;
                   }
                   break;
                 case 0xd9c40876:
                   if (str.equals("preloadTime")) {
                      i = 3;
                   }
                   break;
                 case 0xa6d86d1:
                   if (str.equals("splashIds")) {
                      i = 4;
                   }
                   break;
                 case 0x1df07497:
                   if (str.equals("clearMaterialWhenImpression")) {
                      i = 5;
                   }
                   break;
                 case 0x2d9aac86:
                   if (str.equals("impressionCount")) {
                      i = 6;
                   }
                   break;
                 case 0x778ed391:
                   if (str.equals("realtimeRequestTime")) {
                      i = 7;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   splashLocalR1.mStartTime = KnownTypeAdapters$n.a(p0, splashLocalR1.mStartTime);
                   break;
                 case 1:
                   splashLocalR1.mEndTime = KnownTypeAdapters$n.a(p0, splashLocalR1.mEndTime);
                   break;
                 case 2:
                   splashLocalR1.mValidCarriedCount = KnownTypeAdapters$k.a(p0, splashLocalR1.mValidCarriedCount);
                   break;
                 case 3:
                   splashLocalR1.mPreloadTime = KnownTypeAdapters$n.a(p0, splashLocalR1.mPreloadTime);
                   break;
                 case 4:
                   splashLocalR1.mSplashIdList = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   splashLocalR1.mClearMaterialAfterImpression = KnownTypeAdapters$g.a(p0, splashLocalR1.mClearMaterialAfterImpression);
                   break;
                 case 6:
                   splashLocalR1.mImpressionCount = KnownTypeAdapters$k.a(p0, splashLocalR1.mImpressionCount);
                   break;
                 case 7:
                   splashLocalR1.mRealtimeRequestTime = KnownTypeAdapters$n.a(p0, splashLocalR1.mRealtimeRequestTime);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return splashLocalR1;
       }
    }
    public void b(b p0,SplashInfo$SplashLocalRecordInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$SplashLocalRecordInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("realtimeRequestTime");
          p0.K(p1.mRealtimeRequestTime);
          p0.r("validCarriedCount");
          p0.K((long)p1.mValidCarriedCount);
          p0.r("impressionCount");
          p0.K((long)p1.mImpressionCount);
          p0.r("preloadTime");
          p0.K(p1.mPreloadTime);
          if (p1.mSplashIdList != null) {
             p0.r("splashIds");
             TypeAdapters.A.write(p0, p1.mSplashIdList);
          }
          p0.r("startTime");
          p0.K(p1.mStartTime);
          p0.r("endTime");
          p0.K(p1.mEndTime);
          p0.r("clearMaterialWhenImpression");
          p0.P(p1.mClearMaterialAfterImpression);
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
