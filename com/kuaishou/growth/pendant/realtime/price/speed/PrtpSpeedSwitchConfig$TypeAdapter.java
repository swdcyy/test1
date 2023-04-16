package com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedSwitchConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedSwitchConfig;
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
import com.vimeo.stag.KnownTypeAdapters$j;
import java.util.ArrayList;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.io.IOException;
import com.google.gson.stream.b;

public final class PrtpSpeedSwitchConfig$TypeAdapter extends TypeAdapter	// class@0006cc
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PrtpSpeedSwitchConfig$TypeAdapter.c = a.get(PrtpSpeedSwitchConfig.class);
    }
    public void PrtpSpeedSwitchConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.d, new KnownTypeAdapters$b());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PrtpSpeedSwitchConfig$TypeAdapter.class, "2");
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
             obj = new PrtpSpeedSwitchConfig();
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
                    case 0xdf0f8888:
                      if (str.equals("maxSpeedRatio")) {
                         i = 1;
                      }
                      break;
                    case 0xee7ca3ed:
                      if (str.equals("reportIntervalSecond")) {
                         i = 2;
                      }
                      break;
                    case 0xf3663275:
                      if (str.equals("minEnable")) {
                         i = 3;
                      }
                      break;
                    case 0xf5dba9de:
                      if (str.equals("inferMultiTimesEnable")) {
                         i = 4;
                      }
                      break;
                    case 0x79f4567:
                      if (str.equals("samplingRate")) {
                         i = 5;
                      }
                      break;
                    case 0x29dac609:
                      if (str.equals("afkEnable")) {
                         i = 6;
                      }
                      break;
                    case 0x2a849507:
                      if (str.equals("abParams")) {
                         i = 7;
                      }
                      break;
                    case 0x2b5586c5:
                      if (str.equals("afkRatio")) {
                         i = 8;
                      }
                      break;
                    case 0x4a3d94f8:
                      if (str.equals("reportMergeSecond")) {
                         i = 9;
                      }
                      break;
                    case 0x4ab55eb9:
                      if (str.equals("featuresTimeLevels")) {
                         i = 10;
                      }
                      break;
                    case 0x4badb7f6:
                      if (str.equals("minSpeedRatio")) {
                         i = 11;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.enable = KnownTypeAdapters$g.a(p0, obj.enable);
                      break;
                    case 1:
                      obj.maxSpeedRatio = KnownTypeAdapters$j.a(p0, obj.maxSpeedRatio);
                      break;
                    case 2:
                      obj.reportIntervalSecond = KnownTypeAdapters$n.a(p0, obj.reportIntervalSecond);
                      break;
                    case 3:
                      obj.minEnable = KnownTypeAdapters$g.a(p0, obj.minEnable);
                      break;
                    case 4:
                      obj.inferMultiTimesEnable = KnownTypeAdapters$g.a(p0, obj.inferMultiTimesEnable);
                      break;
                    case 5:
                      obj.samplingRate = KnownTypeAdapters$j.a(p0, obj.samplingRate);
                      break;
                    case 6:
                      obj.afkEnable = KnownTypeAdapters$g.a(p0, obj.afkEnable);
                      break;
                    case 7:
                      obj.abParams = TypeAdapters.A.read(p0);
                      break;
                    case 8:
                      obj.afkRatio = KnownTypeAdapters$j.a(p0, obj.afkRatio);
                      break;
                    case 9:
                      obj.reportMergeSecond = KnownTypeAdapters$n.a(p0, obj.reportMergeSecond);
                      break;
                    case 10:
                      obj.featuresTimeLevels = this.b.read(p0);
                      break;
                    case 11:
                      obj.minSpeedRatio = KnownTypeAdapters$j.a(p0, obj.minSpeedRatio);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrtpSpeedSwitchConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("enable");
          p0.P(p1.enable);
          p0.r("afkEnable");
          p0.P(p1.afkEnable);
          p0.r("minEnable");
          p0.P(p1.minEnable);
          p0.r("inferMultiTimesEnable");
          p0.P(p1.inferMultiTimesEnable);
          p0.r("afkRatio");
          p0.J((double)p1.afkRatio);
          if (p1.abParams != null) {
             p0.r("abParams");
             TypeAdapters.A.write(p0, p1.abParams);
          }
          p0.r("samplingRate");
          p0.J((double)p1.samplingRate);
          p0.r("reportIntervalSecond");
          p0.K(p1.reportIntervalSecond);
          p0.r("minSpeedRatio");
          p0.J((double)p1.minSpeedRatio);
          p0.r("maxSpeedRatio");
          p0.J((double)p1.maxSpeedRatio);
          p0.r("reportMergeSecond");
          p0.K(p1.reportMergeSecond);
          PrtpSpeedSwitchConfig prtpSpeedSwi = p1.featuresTimeLevels;
          if (prtpSpeedSwi != null) {
             p0.r("featuresTimeLevels");
             this.b.write(p0, p1.featuresTimeLevels);
          }else if(prtpSpeedSwi != null){
             throw new IOException("featuresTimeLevels cannot be null");
          }
          p0.j();
       }
       return;
    }
}
