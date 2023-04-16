package com.kwai.framework.network.keyconfig.degrade.ApiRequestIntervalPolicy$TypeAdapter;
import com.google.gson.TypeAdapter;
import pb6.f;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class ApiRequestIntervalPolicy$TypeAdapter extends TypeAdapter	// class@000c3a
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       ApiRequestIntervalPolicy$TypeAdapter.e = a.get(f.class);
    }
    public void ApiRequestIntervalPolicy$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
       TypeAdapter typeAdapter = p0.j(a.get(RequestTiming.class));
       this.c = typeAdapter;
       this.d = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ApiRequestIntervalPolicy$TypeAdapter.class, "2");
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
             obj = new f();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xf01860f2:
                      if (str.equals("userHint")) {
                         i = 0;
                      }
                      break;
                    case 0x3652cd:
                      if (str.equals("time")) {
                         i = 1;
                      }
                      break;
                    case 0x788b4bc:
                      if (str.equals("ignoreTiming")) {
                         i = 2;
                      }
                      break;
                    case 0x498fee63:
                      if (str.equals("pathList")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mUserHint = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.time = KnownTypeAdapters$n.a(p0, obj.time);
                      break;
                    case 2:
                      obj.mIgnoreTiming = this.d.read(p0);
                      break;
                    case 3:
                      obj.mPathList = this.b.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ApiRequestIntervalPolicy$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mPathList != null) {
             p0.r("pathList");
             this.b.write(p0, p1.mPathList);
          }
          p0.r("time");
          p0.K(p1.time);
          if (p1.mIgnoreTiming != null) {
             p0.r("ignoreTiming");
             this.d.write(p0, p1.mIgnoreTiming);
          }
          if (p1.mUserHint != null) {
             p0.r("userHint");
             TypeAdapters.A.write(p0, p1.mUserHint);
          }
          p0.j();
       }
       return;
    }
}
