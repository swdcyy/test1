package com.kuaishou.android.model.mix.HotAreaInfo$Location$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.HotAreaInfo$Location;
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
import com.google.gson.stream.b;

public final class HotAreaInfo$Location$TypeAdapter extends TypeAdapter	// class@000ca2
{
    public final Gson a;
    public static final a b;

    static {
       HotAreaInfo$Location$TypeAdapter.b = a.get(HotAreaInfo$Location.class);
    }
    public void HotAreaInfo$Location$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public HotAreaInfo$Location a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, HotAreaInfo$Location$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       HotAreaInfo$Location location = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return location;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return location;
       }else {
          p0.c();
          HotAreaInfo$Location location1 = new HotAreaInfo$Location();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("x")) {
                if (!str.equals("y")) {
                   p0.Q();
                }else {
                   location1.mY = KnownTypeAdapters$j.a(p0, location1.mY);
                }
             }else {
                location1.mX = KnownTypeAdapters$j.a(p0, location1.mX);
             }
          }
          p0.j();
          return location1;
       }
    }
    public void b(b p0,HotAreaInfo$Location p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HotAreaInfo$Location$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("x");
          p0.J((double)p1.mX);
          p0.r("y");
          p0.J((double)p1.mY);
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
