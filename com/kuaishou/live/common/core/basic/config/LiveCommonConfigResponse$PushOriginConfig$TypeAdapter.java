package com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$PushOriginConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$PushOriginConfig;
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

public final class LiveCommonConfigResponse$PushOriginConfig$TypeAdapter extends TypeAdapter	// class@000e8c
{
    public final Gson a;
    public static final a b;

    static {
       LiveCommonConfigResponse$PushOriginConfig$TypeAdapter.b = a.get(LiveCommonConfigResponse$PushOriginConfig.class);
    }
    public void LiveCommonConfigResponse$PushOriginConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveCommonConfigResponse$PushOriginConfig$TypeAdapter.class, "2");
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
             obj = new LiveCommonConfigResponse$PushOriginConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("ktpMode")) {
                   p0.Q();
                }else {
                   obj.mKtpMode = KnownTypeAdapters$k.a(p0, obj.mKtpMode);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCommonConfigResponse$PushOriginConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("ktpMode");
          p0.K((long)p1.mKtpMode);
          p0.j();
       }
       return;
    }
}
