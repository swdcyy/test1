package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveProfileConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveProfileConfig;
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
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveProfileConfig$TypeAdapter extends TypeAdapter	// class@001063
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveProfileConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveProfileConfig.class);
    }
    public void LiveConfigStartupResponse$LiveProfileConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveProfileConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiveProfileConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa986a3e6:
                      if (str.equals("enableLiveProfileCardV2")) {
                         i = 0;
                      }
                      break;
                    case 0x5d693267:
                      if (str.equals("enableAuthorProfileCardV2")) {
                         i = 1;
                      }
                      break;
                    case 0x6f8945a6:
                      if (str.equals("liveProfileMaxCacheUserProductCount")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mEnableNewLiveProfileCard = KnownTypeAdapters$g.a(p0, obj.mEnableNewLiveProfileCard);
                      break;
                    case 1:
                      obj.mEnableWatchAnchorNewProfileCard = KnownTypeAdapters$g.a(p0, obj.mEnableWatchAnchorNewProfileCard);
                      break;
                    case 2:
                      obj.mLiveProfileMaxCacheUserProductCount = KnownTypeAdapters$k.a(p0, obj.mLiveProfileMaxCacheUserProductCount);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveProfileConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("liveProfileMaxCacheUserProductCount");
          p0.K((long)p1.mLiveProfileMaxCacheUserProductCount);
          p0.r("enableLiveProfileCardV2");
          p0.P(p1.mEnableNewLiveProfileCard);
          p0.r("enableAuthorProfileCardV2");
          p0.P(p1.mEnableWatchAnchorNewProfileCard);
          p0.j();
       }
       return;
    }
}
