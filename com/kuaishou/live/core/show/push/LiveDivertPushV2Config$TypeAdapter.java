package com.kuaishou.live.core.show.push.LiveDivertPushV2Config$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.push.LiveDivertPushV2Config;
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
import com.google.gson.stream.b;

public final class LiveDivertPushV2Config$TypeAdapter extends TypeAdapter	// class@000dff
{
    public final Gson a;
    public static final a b;

    static {
       LiveDivertPushV2Config$TypeAdapter.b = a.get(LiveDivertPushV2Config.class);
    }
    public void LiveDivertPushV2Config$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveDivertPushV2Config$TypeAdapter.class, "2");
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
             obj = new LiveDivertPushV2Config();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("showIntervalMillis")) {
                   if (!str1.equals("maxShowTimesInDay")) {
                      p0.Q();
                   }else {
                      obj.mMaxShowTimesInOneDay = KnownTypeAdapters$n.a(p0, obj.mMaxShowTimesInOneDay);
                   }
                }else {
                   obj.mPushShowIntervalInMs = KnownTypeAdapters$n.a(p0, obj.mPushShowIntervalInMs);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveDivertPushV2Config$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("showIntervalMillis");
          p0.K(p1.mPushShowIntervalInMs);
          p0.r("maxShowTimesInDay");
          p0.K(p1.mMaxShowTimesInOneDay);
          p0.j();
       }
       return;
    }
}
