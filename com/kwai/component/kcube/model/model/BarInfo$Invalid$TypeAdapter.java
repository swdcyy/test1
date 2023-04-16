package com.kwai.component.kcube.model.model.BarInfo$Invalid$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.component.kcube.model.model.BarInfo$Invalid;
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
import com.vimeo.stag.KnownTypeAdapters;
import java.lang.Integer;
import com.google.gson.stream.b;

public final class BarInfo$Invalid$TypeAdapter extends TypeAdapter	// class@00098d
{
    public final Gson a;
    public static final a b;

    static {
       BarInfo$Invalid$TypeAdapter.b = a.get(BarInfo$Invalid.class);
    }
    public void BarInfo$Invalid$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, BarInfo$Invalid$TypeAdapter.class, "2");
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
             obj = new BarInfo$Invalid();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("invalidEndTime")) {
                   if (!str1.equals("invalidStartTime")) {
                      p0.Q();
                   }else {
                      obj.invalidStartTime = KnownTypeAdapters.c.read(p0);
                   }
                }else {
                   obj.invalidEndTime = KnownTypeAdapters.c.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BarInfo$Invalid$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.invalidStartTime != null) {
             p0.r("invalidStartTime");
             KnownTypeAdapters.c.write(p0, p1.invalidStartTime);
          }
          if (p1.invalidEndTime != null) {
             p0.r("invalidEndTime");
             KnownTypeAdapters.c.write(p0, p1.invalidEndTime);
          }
          p0.j();
       }
       return;
    }
}
