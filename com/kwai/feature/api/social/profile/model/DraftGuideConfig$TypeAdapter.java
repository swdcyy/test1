package com.kwai.feature.api.social.profile.model.DraftGuideConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.api.social.profile.model.DraftGuideConfig;
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
import com.google.gson.stream.b;

public final class DraftGuideConfig$TypeAdapter extends TypeAdapter	// class@0011a7
{
    public final Gson a;
    public static final a b;

    static {
       DraftGuideConfig$TypeAdapter.b = a.get(DraftGuideConfig.class);
    }
    public void DraftGuideConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, DraftGuideConfig$TypeAdapter.class, "2");
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
             obj = new DraftGuideConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x313c79:
                      if (str.equals("icon")) {
                         i = 0;
                      }
                      break;
                    case 0x19909f0a:
                      if (str.equals("titlePrefix")) {
                         i = 1;
                      }
                      break;
                    case 0x1ed9e3c9:
                      if (str.equals("titleSuffix")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mIcon = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mTitlePrefix = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mTitleSuffix = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DraftGuideConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mIcon != null) {
             p0.r("icon");
             TypeAdapters.A.write(p0, p1.mIcon);
          }
          if (p1.mTitlePrefix != null) {
             p0.r("titlePrefix");
             TypeAdapters.A.write(p0, p1.mTitlePrefix);
          }
          if (p1.mTitleSuffix != null) {
             p0.r("titleSuffix");
             TypeAdapters.A.write(p0, p1.mTitleSuffix);
          }
          p0.j();
       }
       return;
    }
}
