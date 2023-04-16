package com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedInferResult$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedInferResult;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$j;
import java.util.Map;
import java.io.IOException;
import com.google.gson.stream.b;

public final class PrtpSpeedInferResult$TypeAdapter extends TypeAdapter	// class@0006c3
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PrtpSpeedInferResult$TypeAdapter.c = a.get(PrtpSpeedInferResult.class);
    }
    public void PrtpSpeedInferResult$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, TypeAdapters.A, new KnownTypeAdapters$e());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PrtpSpeedInferResult$TypeAdapter.class, "2");
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
             obj = new PrtpSpeedInferResult();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xc0d355b8:
                      if (str.equals("trigger")) {
                         i = 0;
                      }
                      break;
                    case 0xc2f8fb51:
                      if (str.equals("inferResultMap")) {
                         i = 1;
                      }
                      break;
                    case 0xe8edfcc0:
                      if (str.equals("inferResultRatio")) {
                         i = 2;
                      }
                      break;
                    case 0x1c450:
                      if (str.equals("uid")) {
                         i = 3;
                      }
                      break;
                    case 0xa1b7250:
                      if (str.equals("inferMd5")) {
                         i = 4;
                      }
                      break;
                    case 0x2a849507:
                      if (str.equals("abParams")) {
                         i = 5;
                      }
                      break;
                    case 0x32b69068:
                      if (str.equals("inferTimestamp")) {
                         i = 6;
                      }
                      break;
                    case 0x4921de24:
                      if (str.equals("modelId")) {
                         i = 7;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.trigger = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.inferResultMap = this.b.read(p0);
                      break;
                    case 2:
                      obj.inferResultRatio = KnownTypeAdapters$j.a(p0, obj.inferResultRatio);
                      break;
                    case 3:
                      obj.uid = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.inferMd5 = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.abParams = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.inferTimestamp = KnownTypeAdapters$n.a(p0, obj.inferTimestamp);
                      break;
                    case 7:
                      obj.modelId = TypeAdapters.A.read(p0);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
             if (obj.trigger != null) {
                if (obj.uid != null) {
                   if (obj.modelId != null) {
                      if (obj.abParams != null) {
                         if (obj.inferMd5 == null) {
                            throw new IOException("inferMd5 cannot be null");
                         }
                      }else {
                         throw new IOException("abParams cannot be null");
                      }
                   }else {
                      throw new IOException("modelId cannot be null");
                   }
                }else {
                   throw new IOException("uid cannot be null");
                }
             }else {
                throw new IOException("trigger cannot be null");
             }
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrtpSpeedInferResult$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          PrtpSpeedInferResult trigger = p1.trigger;
          if (trigger != null) {
             p0.r("trigger");
             TypeAdapters.A.write(p0, p1.trigger);
          }else if(trigger != null){
             throw new IOException("trigger cannot be null");
          }
          trigger = p1.uid;
          if (trigger != null) {
             p0.r("uid");
             TypeAdapters.A.write(p0, p1.uid);
          }else if(trigger != null){
             throw new IOException("uid cannot be null");
          }
          trigger = p1.modelId;
          if (trigger != null) {
             p0.r("modelId");
             TypeAdapters.A.write(p0, p1.modelId);
          }else if(trigger != null){
             throw new IOException("modelId cannot be null");
          }
          trigger = p1.abParams;
          if (trigger != null) {
             p0.r("abParams");
             TypeAdapters.A.write(p0, p1.abParams);
          }else if(trigger != null){
             throw new IOException("abParams cannot be null");
          }
          trigger = p1.inferMd5;
          if (trigger != null) {
             p0.r("inferMd5");
             TypeAdapters.A.write(p0, p1.inferMd5);
          }else if(trigger != null){
             throw new IOException("inferMd5 cannot be null");
          }
          p0.r("inferTimestamp");
          p0.K(p1.inferTimestamp);
          p0.r("inferResultRatio");
          p0.J((double)p1.inferResultRatio);
          if (p1.inferResultMap != null) {
             p0.r("inferResultMap");
             this.b.write(p0, p1.inferResultMap);
          }
          p0.j();
       }
       return;
    }
}
