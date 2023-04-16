package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRedPackConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRedPackConfig;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveRedPackConfig$TypeAdapter extends TypeAdapter	// class@001073
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveRedPackConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveRedPackConfig.class);
    }
    public void LiveConfigStartupResponse$LiveRedPackConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveRedPackConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiveRedPackConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x83d3f173:
                      if (str.equals("tokenRequestDelayMillis")) {
                         i = 0;
                      }
                      break;
                    case 0x8e3a3425:
                      if (str.equals("treasureBoxAudienceMaxShowTimes")) {
                         i = 1;
                      }
                      break;
                    case 0x9df9e1fd:
                      if (str.equals("tokenRequestRetryIntervalMillis")) {
                         i = 2;
                      }
                      break;
                    case 0xfbc6c74c:
                      if (str.equals("tokenRequestMaxRetryTimes")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mTokenRequestDelayMs = KnownTypeAdapters$n.a(p0, obj.mTokenRequestDelayMs);
                      break;
                    case 1:
                      obj.mActivityRedPacketMaxShowTimes = KnownTypeAdapters$k.a(p0, obj.mActivityRedPacketMaxShowTimes);
                      break;
                    case 2:
                      obj.mTokenRequestRetryIntervalMs = KnownTypeAdapters$n.a(p0, obj.mTokenRequestRetryIntervalMs);
                      break;
                    case 3:
                      obj.mTokenRequestMaxRetryTimes = KnownTypeAdapters$k.a(p0, obj.mTokenRequestMaxRetryTimes);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveRedPackConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("tokenRequestDelayMillis");
          p0.K(p1.mTokenRequestDelayMs);
          p0.r("tokenRequestMaxRetryTimes");
          p0.K((long)p1.mTokenRequestMaxRetryTimes);
          p0.r("tokenRequestRetryIntervalMillis");
          p0.K(p1.mTokenRequestRetryIntervalMs);
          p0.r("treasureBoxAudienceMaxShowTimes");
          p0.K((long)p1.mActivityRedPacketMaxShowTimes);
          p0.j();
       }
       return;
    }
}
