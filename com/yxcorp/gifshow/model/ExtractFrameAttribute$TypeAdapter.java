package com.yxcorp.gifshow.model.ExtractFrameAttribute$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.ExtractFrameAttribute;
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
import com.vimeo.stag.KnownTypeAdapters$j;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class ExtractFrameAttribute$TypeAdapter extends TypeAdapter	// class@001e08
{
    public final Gson a;
    public static final a b;

    static {
       ExtractFrameAttribute$TypeAdapter.b = a.get(ExtractFrameAttribute.class);
    }
    public void ExtractFrameAttribute$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ExtractFrameAttribute$TypeAdapter.class, "2");
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
             obj = new ExtractFrameAttribute();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x839f370b:
                      if (str.equals("needExtract")) {
                         i = 0;
                      }
                      break;
                    case 0x26d0c0ff:
                      if (str.equals("quality")) {
                         i = 1;
                      }
                      break;
                    case 0x4d4a9121:
                      if (str.equals("maxFileSize")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mNeedExtract = KnownTypeAdapters$k.a(p0, obj.mNeedExtract);
                      break;
                    case 1:
                      obj.mQuality = KnownTypeAdapters$j.a(p0, obj.mQuality);
                      break;
                    case 2:
                      obj.maxFileSize = KnownTypeAdapters$j.a(p0, obj.maxFileSize);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExtractFrameAttribute$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("needExtract");
          p0.K((long)p1.mNeedExtract);
          p0.r("maxFileSize");
          p0.J((double)p1.maxFileSize);
          p0.r("quality");
          p0.J((double)p1.mQuality);
          p0.j();
       }
       return;
    }
}
