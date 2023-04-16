package com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$MagicFaceConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$MagicFaceConfig;
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
import com.google.gson.stream.b;

public final class LiveCommonConfigResponse$MagicFaceConfig$TypeAdapter extends TypeAdapter	// class@000e8a
{
    public final Gson a;
    public static final a b;

    static {
       LiveCommonConfigResponse$MagicFaceConfig$TypeAdapter.b = a.get(LiveCommonConfigResponse$MagicFaceConfig.class);
    }
    public void LiveCommonConfigResponse$MagicFaceConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveCommonConfigResponse$MagicFaceConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new LiveCommonConfigResponse$MagicFaceConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("maxLoadingCount")) {
                   if (!str1.equals("downloadExpireTime")) {
                      p0.Q();
                   }else {
                      obj.surviveTimeoutMs = KnownTypeAdapters$k.a(p0, obj.surviveTimeoutMs);
                   }
                }else {
                   obj.maxSurvivePoolSize = KnownTypeAdapters$k.a(p0, obj.maxSurvivePoolSize);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCommonConfigResponse$MagicFaceConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("downloadExpireTime");
          p0.K((long)p1.surviveTimeoutMs);
          p0.r("maxLoadingCount");
          p0.K((long)p1.maxSurvivePoolSize);
          p0.j();
       }
       return;
    }
}
