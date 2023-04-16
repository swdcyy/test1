package com.kwai.framework.network.keyconfig.KeyConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import ob6.h;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.network.keyconfig.BaseConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.FeatureConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.ActivityConfig;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class KeyConfig$TypeAdapter extends TypeAdapter	// class@0017d3
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       KeyConfig$TypeAdapter.e = a.get(h.class);
    }
    public void KeyConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(BaseConfig.class));
       this.c = p0.j(a.get(FeatureConfig.class));
       this.d = p0.j(a.get(ActivityConfig.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, KeyConfig$TypeAdapter.class, "2");
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
             obj = new h();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x9d4bf30f:
                      if (str.equals("activity")) {
                         i = 0;
                      }
                      break;
                    case 0xc5a27af6:
                      if (str.equals("feature")) {
                         i = 1;
                      }
                      break;
                    case 0x2e06d1:
                      if (str.equals("base")) {
                         i = 2;
                      }
                      break;
                    case 0x14f51cd8:
                      if (str.equals("version")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mActivityConfig = this.d.read(p0);
                      break;
                    case 1:
                      obj.mFeatureConfig = this.c.read(p0);
                      break;
                    case 2:
                      obj.mBaseConfig = this.b.read(p0);
                      break;
                    case 3:
                      obj.mVersion = KnownTypeAdapters$k.a(p0, obj.mVersion);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KeyConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("version");
          p0.K((long)p1.mVersion);
          if (p1.mBaseConfig != null) {
             p0.r("base");
             this.b.write(p0, p1.mBaseConfig);
          }
          if (p1.mFeatureConfig != null) {
             p0.r("feature");
             this.c.write(p0, p1.mFeatureConfig);
          }
          if (p1.mActivityConfig != null) {
             p0.r("activity");
             this.d.write(p0, p1.mActivityConfig);
          }
          p0.j();
       }
       return;
    }
}
