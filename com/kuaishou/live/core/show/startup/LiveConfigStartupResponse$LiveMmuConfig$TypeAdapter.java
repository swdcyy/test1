package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMmuConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMmuConfig;
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

public final class LiveConfigStartupResponse$LiveMmuConfig$TypeAdapter extends TypeAdapter	// class@001057
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveMmuConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveMmuConfig.class);
    }
    public void LiveConfigStartupResponse$LiveMmuConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveMmuConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiveMmuConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("disableMmuRedlineDetection")) {
                   if (!str1.equals("mmuRedlineDetectionMinApiLevel")) {
                      p0.Q();
                   }else {
                      obj.mMmuRedlineDetectionMinApiLevel = KnownTypeAdapters$k.a(p0, obj.mMmuRedlineDetectionMinApiLevel);
                   }
                }else {
                   obj.mDisableMmuRedlineDetection = KnownTypeAdapters$g.a(p0, obj.mDisableMmuRedlineDetection);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveMmuConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("disableMmuRedlineDetection");
          p0.P(p1.mDisableMmuRedlineDetection);
          p0.r("mmuRedlineDetectionMinApiLevel");
          p0.K((long)p1.mMmuRedlineDetectionMinApiLevel);
          p0.j();
       }
       return;
    }
}
