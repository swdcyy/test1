package com.kuaishou.android.model.mix.HighLightStartEndTime$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.HighLightStartEndTime;
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
import java.lang.Long;
import com.google.gson.stream.b;

public final class HighLightStartEndTime$TypeAdapter extends TypeAdapter	// class@000c99
{
    public final Gson a;
    public static final a b;

    static {
       HighLightStartEndTime$TypeAdapter.b = a.get(HighLightStartEndTime.class);
    }
    public void HighLightStartEndTime$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public HighLightStartEndTime a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, HighLightStartEndTime$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       HighLightStartEndTime highLightSta = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return highLightSta;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return highLightSta;
       }else {
          p0.c();
          HighLightStartEndTime highLightSta1 = new HighLightStartEndTime();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("end")) {
                if (!str.equals("start")) {
                   p0.Q();
                }else {
                   highLightSta1.mStart = KnownTypeAdapters.d.read(p0);
                }
             }else {
                highLightSta1.mEnd = KnownTypeAdapters.d.read(p0);
             }
          }
          p0.j();
          return highLightSta1;
       }
    }
    public void b(b p0,HighLightStartEndTime p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HighLightStartEndTime$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mStart != null) {
             p0.r("start");
             KnownTypeAdapters.d.write(p0, p1.mStart);
          }
          if (p1.mEnd != null) {
             p0.r("end");
             KnownTypeAdapters.d.write(p0, p1.mEnd);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
