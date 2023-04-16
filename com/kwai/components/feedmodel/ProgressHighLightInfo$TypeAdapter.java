package com.kwai.components.feedmodel.ProgressHighLightInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.feedmodel.ProgressHighLightInfo;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class ProgressHighLightInfo$TypeAdapter extends TypeAdapter	// class@000c33
{
    public final Gson a;
    public static final a b;

    static {
       ProgressHighLightInfo$TypeAdapter.b = a.get(ProgressHighLightInfo.class);
    }
    public void ProgressHighLightInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ProgressHighLightInfo$TypeAdapter.class, "2");
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
             obj = new ProgressHighLightInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x368f3a:
                      if (str.equals("type")) {
                         i = 0;
                      }
                      break;
                    case 0x40fe3316:
                      if (str.equals("timePosition")) {
                         i = 1;
                      }
                      break;
                    case 0x662ea10f:
                      if (str.equals("displayText")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mType = KnownTypeAdapters$k.a(p0, obj.mType);
                      break;
                    case 1:
                      obj.mHighLightPos = KnownTypeAdapters$k.a(p0, obj.mHighLightPos);
                      break;
                    case 2:
                      obj.mDisplayText = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProgressHighLightInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
          p0.r("timePosition");
          p0.K((long)p1.mHighLightPos);
          if (p1.mDisplayText != null) {
             p0.r("displayText");
             TypeAdapters.A.write(p0, p1.mDisplayText);
          }
          p0.j();
       }
       return;
    }
}
