package com.kwai.framework.network.keyconfig.degrade.ApiDegradePolicy$TypeAdapter;
import com.google.gson.TypeAdapter;
import pb6.c;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kwai.framework.network.keyconfig.TimeRange$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.kwai.framework.network.keyconfig.TimeRange;
import com.google.gson.stream.b;

public final class ApiDegradePolicy$TypeAdapter extends TypeAdapter	// class@000c36
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       ApiDegradePolicy$TypeAdapter.d = a.get(c.class);
    }
    public void ApiDegradePolicy$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
       this.c = p0.j(TimeRange$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ApiDegradePolicy$TypeAdapter.class, "2");
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
             obj = new c();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa958f169:
                      if (str.equals("apiDegradeTime")) {
                         i = 0;
                      }
                      break;
                    case 0xcbecf04a:
                      if (str.equals("timing")) {
                         i = 1;
                      }
                      break;
                    case 0xf01860f2:
                      if (str.equals("userHint")) {
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
                      obj.mApiDegradeTime = this.c.read(p0);
                      break;
                    case 1:
                      obj.mTiming = this.b.read(p0);
                      break;
                    case 2:
                      obj.mUserHint = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ApiDegradePolicy$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mPathList != null) {
             p0.r("pathList");
             this.b.write(p0, p1.mPathList);
          }
          if (p1.mTiming != null) {
             p0.r("timing");
             this.b.write(p0, p1.mTiming);
          }
          if (p1.mApiDegradeTime != null) {
             p0.r("apiDegradeTime");
             this.c.write(p0, p1.mApiDegradeTime);
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
