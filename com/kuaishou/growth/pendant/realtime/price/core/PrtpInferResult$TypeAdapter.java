package com.kuaishou.growth.pendant.realtime.price.core.PrtpInferResult$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpInferResult;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$j;
import java.util.Map;
import java.io.IOException;
import com.google.gson.stream.b;

public final class PrtpInferResult$TypeAdapter extends TypeAdapter	// class@00069d
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PrtpInferResult$TypeAdapter.c = a.get(PrtpInferResult.class);
    }
    public void PrtpInferResult$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, TypeAdapters.A, new KnownTypeAdapters$e());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PrtpInferResult$TypeAdapter.class, "2");
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
             obj = new PrtpInferResult();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x9c29f7e5:
                      if (str.equals("inferResultType")) {
                         i = 0;
                      }
                      break;
                    case 0xc0d355b8:
                      if (str.equals("trigger")) {
                         i = 1;
                      }
                      break;
                    case 0xc2f8fb51:
                      if (str.equals("inferResultMap")) {
                         i = 2;
                      }
                      break;
                    case 0xe89b4839:
                      if (str.equals("inferResultLevel")) {
                         i = 3;
                      }
                      break;
                    case 0xe8edfcc0:
                      if (str.equals("inferResultRatio")) {
                         i = 4;
                      }
                      break;
                    case 0x1c450:
                      if (str.equals("uid")) {
                         i = 5;
                      }
                      break;
                    case 0xa1b7250:
                      if (str.equals("inferMd5")) {
                         i = 6;
                      }
                      break;
                    case 0x18763a43:
                      if (str.equals("inferResultAmount")) {
                         i = 7;
                      }
                      break;
                    case 0x1f4ee6be:
                      if (str.equals("inferCircle")) {
                         i = 8;
                      }
                      break;
                    case 0x2a849507:
                      if (str.equals("abParams")) {
                         i = 9;
                      }
                      break;
                    case 0x32b69068:
                      if (str.equals("inferTimestamp")) {
                         i = 10;
                      }
                      break;
                    case 0x4921de24:
                      if (str.equals("modelId")) {
                         i = 11;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.inferResultType = KnownTypeAdapters$k.a(p0, obj.inferResultType);
                      break;
                    case 1:
                      obj.trigger = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.inferResultMap = this.b.read(p0);
                      break;
                    case 3:
                      obj.inferResultLevel = KnownTypeAdapters$k.a(p0, obj.inferResultLevel);
                      break;
                    case 4:
                      obj.inferResultRatio = KnownTypeAdapters$j.a(p0, obj.inferResultRatio);
                      break;
                    case 5:
                      obj.uid = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.inferMd5 = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.inferResultAmount = KnownTypeAdapters$k.a(p0, obj.inferResultAmount);
                      break;
                    case 8:
                      obj.inferCircle = KnownTypeAdapters$k.a(p0, obj.inferCircle);
                      break;
                    case 9:
                      obj.abParams = TypeAdapters.A.read(p0);
                      break;
                    case 10:
                      obj.inferTimestamp = KnownTypeAdapters$n.a(p0, obj.inferTimestamp);
                      break;
                    case 11:
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrtpInferResult$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          PrtpInferResult trigger = p1.trigger;
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
          p0.r("inferResultType");
          p0.K((long)p1.inferResultType);
          p0.r("inferResultRatio");
          p0.J((double)p1.inferResultRatio);
          p0.r("inferResultLevel");
          p0.K((long)p1.inferResultLevel);
          p0.r("inferResultAmount");
          p0.K((long)p1.inferResultAmount);
          p0.r("inferCircle");
          p0.K((long)p1.inferCircle);
          if (p1.inferResultMap != null) {
             p0.r("inferResultMap");
             this.b.write(p0, p1.inferResultMap);
          }
          p0.j();
       }
       return;
    }
}
