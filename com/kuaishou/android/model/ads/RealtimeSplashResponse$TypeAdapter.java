package com.kuaishou.android.model.ads.RealtimeSplashResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.RealtimeSplashResponse;
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
import com.google.gson.stream.b;

public final class RealtimeSplashResponse$TypeAdapter extends TypeAdapter	// class@000a6f
{
    public final Gson a;
    public static final a b;

    static {
       RealtimeSplashResponse$TypeAdapter.b = a.get(RealtimeSplashResponse.class);
    }
    public void RealtimeSplashResponse$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public RealtimeSplashResponse a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, RealtimeSplashResponse$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       RealtimeSplashResponse realtimeSpla = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return realtimeSpla;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return realtimeSpla;
       }else {
          p0.c();
          RealtimeSplashResponse realtimeSpla1 = new RealtimeSplashResponse();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa8017780:
                   if (str.equals("realtimeSplashInfo")) {
                      i = 0;
                   }
                   break;
                 case 0xba698ca2:
                   if (str.equals("realtimePicAd")) {
                      i = 1;
                   }
                   break;
                 case 0xfbb89533:
                   if (str.equals("realtimeEyemaxSplashInfo")) {
                      i = 2;
                   }
                   break;
                 case 0x25550d27:
                   if (str.equals("splashLlsid")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   realtimeSpla1.mRealtimeSplashInfoStr = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   realtimeSpla1.mRealtimePicAdStr = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   realtimeSpla1.mRealtimeEyemaxSplashInfoStr = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   realtimeSpla1.mSplashLlsid = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return realtimeSpla1;
       }
    }
    public void b(b p0,RealtimeSplashResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RealtimeSplashResponse$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mSplashLlsid != null) {
             p0.r("splashLlsid");
             TypeAdapters.A.write(p0, p1.mSplashLlsid);
          }
          if (p1.mRealtimeSplashInfoStr != null) {
             p0.r("realtimeSplashInfo");
             TypeAdapters.A.write(p0, p1.mRealtimeSplashInfoStr);
          }
          if (p1.mRealtimeEyemaxSplashInfoStr != null) {
             p0.r("realtimeEyemaxSplashInfo");
             TypeAdapters.A.write(p0, p1.mRealtimeEyemaxSplashInfoStr);
          }
          if (p1.mRealtimePicAdStr != null) {
             p0.r("realtimePicAd");
             TypeAdapters.A.write(p0, p1.mRealtimePicAdStr);
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
