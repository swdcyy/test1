package com.kwai.framework.network.keyconfig.degrade.ApiCdnFallbackPolicy$TypeAdapter;
import com.google.gson.TypeAdapter;
import pb6.a;
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
import com.kwai.framework.network.keyconfig.TimeRange;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class ApiCdnFallbackPolicy$TypeAdapter extends TypeAdapter	// class@000c35
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       ApiCdnFallbackPolicy$TypeAdapter.d = a.get(a.class);
    }
    public void ApiCdnFallbackPolicy$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
       this.c = p0.j(TimeRange$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ApiCdnFallbackPolicy$TypeAdapter.class, "2");
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
             obj = new a();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x90cce391:
                      if (str.equals("tryApiFirst")) {
                         i = 0;
                      }
                      break;
                    case 0x346425:
                      if (str.equals("path")) {
                         i = 1;
                      }
                      break;
                    case 0x25dfc66b:
                      if (str.equals("cdnList")) {
                         i = 2;
                      }
                      break;
                    case 0x25e179f2:
                      if (str.equals("cdnPath")) {
                         i = 3;
                      }
                      break;
                    case 0x44dc0230:
                      if (str.equals("apiCdnDegradeTime")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.tryApiFirst = KnownTypeAdapters$g.a(p0, obj.tryApiFirst);
                      break;
                    case 1:
                      obj.mPath = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mCdnList = this.b.read(p0);
                      break;
                    case 3:
                      obj.mCdnPath = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mApiCdnDegradeTime = this.c.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ApiCdnFallbackPolicy$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mPath != null) {
             p0.r("path");
             TypeAdapters.A.write(p0, p1.mPath);
          }
          if (p1.mCdnList != null) {
             p0.r("cdnList");
             this.b.write(p0, p1.mCdnList);
          }
          if (p1.mCdnPath != null) {
             p0.r("cdnPath");
             TypeAdapters.A.write(p0, p1.mCdnPath);
          }
          p0.r("tryApiFirst");
          p0.P(p1.tryApiFirst);
          if (p1.mApiCdnDegradeTime != null) {
             p0.r("apiCdnDegradeTime");
             this.c.write(p0, p1.mApiCdnDegradeTime);
          }
          p0.j();
       }
       return;
    }
}
