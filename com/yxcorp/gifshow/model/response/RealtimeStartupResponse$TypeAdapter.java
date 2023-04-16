package com.yxcorp.gifshow.model.response.RealtimeStartupResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.response.RealtimeStartupResponse;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.RealtimeSplashResponse;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$l;
import com.google.gson.stream.b;

public final class RealtimeStartupResponse$TypeAdapter extends TypeAdapter	// class@001f5b
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       RealtimeStartupResponse$TypeAdapter.c = a.get(RealtimeStartupResponse.class);
    }
    public void RealtimeStartupResponse$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(RealtimeSplashResponse.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, RealtimeStartupResponse$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new RealtimeStartupResponse();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x8cea0792:
                      if (str.equals("channelTab")) {
                         i = 0;
                      }
                      break;
                    case 0xa8017780:
                      if (str.equals("realtimeSplashInfo")) {
                         i = 1;
                      }
                      break;
                    case 0xca9a2a67:
                      if (str.equals("splash")) {
                         i = 2;
                      }
                      break;
                    case 0xdd88cf8f:
                      if (str.equals("priorityTabList")) {
                         i = 3;
                      }
                      break;
                    case 0x25550d27:
                      if (str.equals("splashLlsid")) {
                         i = 4;
                      }
                      break;
                    case 0x27a5dda5:
                      if (str.equals("personalizedTab")) {
                         i = 5;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mChannelTab = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mRealtimeSplashInfoStr = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mRealtimeStartupResponse = this.b.read(p0);
                      break;
                    case 3:
                      obj.mPriorityTabList = KnownTypeAdapters$l.a(p0);
                      break;
                    case 4:
                      obj.mSplashLlsid = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mThanosShowTab = KnownTypeAdapters$k.a(p0, obj.mThanosShowTab);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RealtimeStartupResponse$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
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
          if (p1.mRealtimeStartupResponse != null) {
             p0.r("splash");
             this.b.write(p0, p1.mRealtimeStartupResponse);
          }
          if (p1.mPriorityTabList != null) {
             p0.r("priorityTabList");
             KnownTypeAdapters$l.b(p0, p1.mPriorityTabList);
          }
          if (p1.mChannelTab != null) {
             p0.r("channelTab");
             TypeAdapters.A.write(p0, p1.mChannelTab);
          }
          p0.r("personalizedTab");
          p0.K((long)p1.mThanosShowTab);
          p0.j();
       }
       return;
    }
}
