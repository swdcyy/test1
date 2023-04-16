package com.kwai.framework.model.user.NewRecommendStyleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.NewRecommendStyleInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class NewRecommendStyleInfo$TypeAdapter extends TypeAdapter	// class@001706
{
    public final Gson a;
    public static final a b;

    static {
       NewRecommendStyleInfo$TypeAdapter.b = a.get(NewRecommendStyleInfo.class);
    }
    public void NewRecommendStyleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, NewRecommendStyleInfo$TypeAdapter.class, "2");
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
             obj = new NewRecommendStyleInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x83c775d3:
                      if (str.equals("constellation")) {
                         i = 0;
                      }
                      break;
                    case 0xab42da96:
                      if (str.equals("cityName")) {
                         i = 1;
                      }
                      break;
                    case 0xe6773473:
                      if (str.equals("isLiving")) {
                         i = 2;
                      }
                      break;
                    case 0x178ff:
                      if (str.equals("age")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mConstellation = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mCityName = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mIsLiving = KnownTypeAdapters$g.a(p0, obj.mIsLiving);
                      break;
                    case 3:
                      obj.mAge = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NewRecommendStyleInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("isLiving");
          p0.P(p1.mIsLiving);
          if (p1.mCityName != null) {
             p0.r("cityName");
             TypeAdapters.A.write(p0, p1.mCityName);
          }
          if (p1.mConstellation != null) {
             p0.r("constellation");
             TypeAdapters.A.write(p0, p1.mConstellation);
          }
          if (p1.mAge != null) {
             p0.r("age");
             TypeAdapters.A.write(p0, p1.mAge);
          }
          p0.j();
       }
       return;
    }
}
