package com.kuaishou.commercial.config.StartUpAdConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.commercial.config.StartUpAdConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.commercial.config.StartUpAdConfig$IdMapping$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.commercial.config.StartUpAdConfig$IdMapping;
import com.google.gson.stream.b;

public final class StartUpAdConfig$TypeAdapter extends TypeAdapter	// class@0014a3
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       StartUpAdConfig$TypeAdapter.c = a.get(StartUpAdConfig.class);
    }
    public void StartUpAdConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(StartUpAdConfig$IdMapping$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, StartUpAdConfig$TypeAdapter.class, "2");
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
             obj = new StartUpAdConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x84300475:
                      if (str.equals("envH5Url")) {
                         i = 0;
                      }
                      break;
                    case 0xc0572770:
                      if (str.equals("mmaConfigFileUrl")) {
                         i = 1;
                      }
                      break;
                    case 0xf92bbf33:
                      if (str.equals("idMapping")) {
                         i = 2;
                      }
                      break;
                    case 0x1828a64c:
                      if (str.equals("awardVideoEmptyTip")) {
                         i = 3;
                      }
                      break;
                    case 0x32e41ab4:
                      if (str.equals("awardVideoNationDayActivityEmptyTip")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mEnvH5Url = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mMmaConfigFileUrl = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mIdMapping = this.b.read(p0);
                      break;
                    case 3:
                      obj.mAwardVideoEmptyTip = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mAwardVideoNationalDayActivityEmptyTip = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StartUpAdConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mMmaConfigFileUrl != null) {
             p0.r("mmaConfigFileUrl");
             TypeAdapters.A.write(p0, p1.mMmaConfigFileUrl);
          }
          if (p1.mEnvH5Url != null) {
             p0.r("envH5Url");
             TypeAdapters.A.write(p0, p1.mEnvH5Url);
          }
          if (p1.mAwardVideoEmptyTip != null) {
             p0.r("awardVideoEmptyTip");
             TypeAdapters.A.write(p0, p1.mAwardVideoEmptyTip);
          }
          if (p1.mAwardVideoNationalDayActivityEmptyTip != null) {
             p0.r("awardVideoNationDayActivityEmptyTip");
             TypeAdapters.A.write(p0, p1.mAwardVideoNationalDayActivityEmptyTip);
          }
          if (p1.mIdMapping != null) {
             p0.r("idMapping");
             this.b.write(p0, p1.mIdMapping);
          }
          p0.j();
       }
       return;
    }
}
