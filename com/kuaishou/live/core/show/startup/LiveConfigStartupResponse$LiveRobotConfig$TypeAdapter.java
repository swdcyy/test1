package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRobotConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRobotConfig;
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
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveRobotConfig$TypeAdapter extends TypeAdapter	// class@001079
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveRobotConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveRobotConfig.class);
    }
    public void LiveConfigStartupResponse$LiveRobotConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveRobotConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiveRobotConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa82c5d5d:
                      if (str.equals("numberOf100msForDataProcessCallbackInterval")) {
                         i = 0;
                      }
                      break;
                    case 0xcb44e32d:
                      if (str.equals("localAwakeTimeoutMs")) {
                         i = 1;
                      }
                      break;
                    case 0x250c9905:
                      if (str.equals("serverAwakeTimeoutMs")) {
                         i = 2;
                      }
                      break;
                    case 0x6bcaa57d:
                      if (str.equals("sessionOverTimeoutMs")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mNumberOf100msForDataProcessCallbackInterval = KnownTypeAdapters$k.a(p0, obj.mNumberOf100msForDataProcessCallbackInterval);
                      break;
                    case 1:
                      obj.mLocalAwakeTimeoutMs = KnownTypeAdapters$n.a(p0, obj.mLocalAwakeTimeoutMs);
                      break;
                    case 2:
                      obj.mServerAwakeTimeoutMs = KnownTypeAdapters$n.a(p0, obj.mServerAwakeTimeoutMs);
                      break;
                    case 3:
                      obj.mSessionOverTimeoutMs = KnownTypeAdapters$n.a(p0, obj.mSessionOverTimeoutMs);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveRobotConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("localAwakeTimeoutMs");
          p0.K(p1.mLocalAwakeTimeoutMs);
          p0.r("serverAwakeTimeoutMs");
          p0.K(p1.mServerAwakeTimeoutMs);
          p0.r("sessionOverTimeoutMs");
          p0.K(p1.mSessionOverTimeoutMs);
          p0.r("numberOf100msForDataProcessCallbackInterval");
          p0.K((long)p1.mNumberOf100msForDataProcessCallbackInterval);
          p0.j();
       }
       return;
    }
}
