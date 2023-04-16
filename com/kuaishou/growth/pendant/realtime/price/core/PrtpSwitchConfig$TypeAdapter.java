package com.kuaishou.growth.pendant.realtime.price.core.PrtpSwitchConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpSwitchConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$b;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.ArrayList;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.io.IOException;
import com.google.gson.stream.b;

public final class PrtpSwitchConfig$TypeAdapter extends TypeAdapter	// class@0006af
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PrtpSwitchConfig$TypeAdapter.c = a.get(PrtpSwitchConfig.class);
    }
    public void PrtpSwitchConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.d, new KnownTypeAdapters$b());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PrtpSwitchConfig$TypeAdapter.class, "2");
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
             obj = new PrtpSwitchConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xb2952583:
                      if (str.equals("enable")) {
                         i = 0;
                      }
                      break;
                    case 0xb8e82a19:
                      if (str.equals("reportInterval")) {
                         i = 1;
                      }
                      break;
                    case 0x27f4b33:
                      if (str.equals("inferInterval")) {
                         i = 2;
                      }
                      break;
                    case 0x79f4567:
                      if (str.equals("samplingRate")) {
                         i = 3;
                      }
                      break;
                    case 0x2a849507:
                      if (str.equals("abParams")) {
                         i = 4;
                      }
                      break;
                    case 0x39565ca8:
                      if (str.equals("inferType")) {
                         i = 5;
                      }
                      break;
                    case 0x4ab55eb9:
                      if (str.equals("featuresTimeLevels")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.enable = KnownTypeAdapters$g.a(p0, obj.enable);
                      break;
                    case 1:
                      obj.reportInterval = KnownTypeAdapters$n.a(p0, obj.reportInterval);
                      break;
                    case 2:
                      obj.inferInterval = KnownTypeAdapters$n.a(p0, obj.inferInterval);
                      break;
                    case 3:
                      obj.samplingRate = KnownTypeAdapters$j.a(p0, obj.samplingRate);
                      break;
                    case 4:
                      obj.abParams = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.inferType = KnownTypeAdapters$k.a(p0, obj.inferType);
                      break;
                    case 6:
                      obj.featuresTimeLevels = this.b.read(p0);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
             if (obj.featuresTimeLevels == null) {
                throw new IOException("featuresTimeLevels cannot be null");
             }
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrtpSwitchConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("enable");
          p0.P(p1.enable);
          p0.r("inferInterval");
          p0.K(p1.inferInterval);
          p0.r("inferType");
          p0.K((long)p1.inferType);
          if (p1.abParams != null) {
             p0.r("abParams");
             TypeAdapters.A.write(p0, p1.abParams);
          }
          p0.r("samplingRate");
          p0.J((double)p1.samplingRate);
          p0.r("reportInterval");
          p0.K(p1.reportInterval);
          PrtpSwitchConfig prtpSwitchCo = p1.featuresTimeLevels;
          if (prtpSwitchCo != null) {
             p0.r("featuresTimeLevels");
             this.b.write(p0, p1.featuresTimeLevels);
          }else if(prtpSwitchCo != null){
             throw new IOException("featuresTimeLevels cannot be null");
          }
          p0.j();
       }
       return;
    }
}
