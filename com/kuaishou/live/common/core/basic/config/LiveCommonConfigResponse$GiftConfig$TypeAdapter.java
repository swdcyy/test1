package com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$GiftConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$GiftConfig;
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

public final class LiveCommonConfigResponse$GiftConfig$TypeAdapter extends TypeAdapter	// class@000e84
{
    public final Gson a;
    public static final a b;

    static {
       LiveCommonConfigResponse$GiftConfig$TypeAdapter.b = a.get(LiveCommonConfigResponse$GiftConfig.class);
    }
    public void LiveCommonConfigResponse$GiftConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveCommonConfigResponse$GiftConfig$TypeAdapter.class, "2");
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
             obj = new LiveCommonConfigResponse$GiftConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("showSendFailTipsIntervalMillis")) {
                   p0.Q();
                }else {
                   obj.mShowSendFailTipsIntervalMillis = KnownTypeAdapters$k.a(p0, obj.mShowSendFailTipsIntervalMillis);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCommonConfigResponse$GiftConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("showSendFailTipsIntervalMillis");
          p0.K((long)p1.mShowSendFailTipsIntervalMillis);
          p0.j();
       }
       return;
    }
}
