package com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedTableModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import ze0.m;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.io.IOException;
import com.google.gson.stream.b;

public final class PrtpSpeedTableModel$TypeAdapter extends TypeAdapter	// class@0006cf
{
    public final Gson a;
    public static final a b;

    static {
       PrtpSpeedTableModel$TypeAdapter.b = a.get(m.class);
    }
    public void PrtpSpeedTableModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PrtpSpeedTableModel$TypeAdapter.class, "2");
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
             obj = new m();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa4fc5579:
                      if (str.equals("start_timestamp")) {
                         i = 0;
                      }
                      break;
                    case 0xfec0d35:
                      if (str.equals("server_duration_ms")) {
                         i = 1;
                      }
                      break;
                    case 0x3be696b2:
                      if (str.equals("end_timestamp")) {
                         i = 2;
                      }
                      break;
                    case 0x4c5236cf:
                      if (str.equals("duration_realtime_ms")) {
                         i = 3;
                      }
                      break;
                    case 0x630ddf64:
                      if (str.equals("session_id")) {
                         i = 4;
                      }
                      break;
                    case 0x66d27092:
                      if (str.equals("end_date")) {
                         i = 5;
                      }
                      break;
                    case 0x66d476c8:
                      if (str.equals("end_hour")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.startTimestamp = KnownTypeAdapters$n.a(p0, obj.startTimestamp);
                      break;
                    case 1:
                      obj.serverDurationMs = KnownTypeAdapters$n.a(p0, obj.serverDurationMs);
                      break;
                    case 2:
                      obj.endTimestamp = KnownTypeAdapters$n.a(p0, obj.endTimestamp);
                      break;
                    case 3:
                      obj.durationRealtimeMs = KnownTypeAdapters$n.a(p0, obj.durationRealtimeMs);
                      break;
                    case 4:
                      obj.sessionId = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.endDate = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.endHour = KnownTypeAdapters$k.a(p0, obj.endHour);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
             if (obj.sessionId != null) {
                if (obj.endDate == null) {
                   throw new IOException("endDate cannot be null");
                }
             }else {
                throw new IOException("sessionId cannot be null");
             }
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrtpSpeedTableModel$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          m sessionId = p1.sessionId;
          if (sessionId != null) {
             p0.r("session_id");
             TypeAdapters.A.write(p0, p1.sessionId);
          }else if(sessionId != null){
             throw new IOException("sessionId cannot be null");
          }
          p0.r("server_duration_ms");
          p0.K(p1.serverDurationMs);
          p0.r("duration_realtime_ms");
          p0.K(p1.durationRealtimeMs);
          p0.r("start_timestamp");
          p0.K(p1.startTimestamp);
          p0.r("end_timestamp");
          p0.K(p1.endTimestamp);
          sessionId = p1.endDate;
          if (sessionId != null) {
             p0.r("end_date");
             TypeAdapters.A.write(p0, p1.endDate);
          }else if(sessionId != null){
             throw new IOException("endDate cannot be null");
          }
          p0.r("end_hour");
          p0.K((long)p1.endHour);
          p0.j();
       }
       return;
    }
}
