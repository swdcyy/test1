package com.yxcorp.gifshow.commercial.model.SplashBaseInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class SplashBaseInfo$TypeAdapter extends TypeAdapter	// class@00114e
{
    public final Gson a;
    public static final a b;

    static {
       SplashBaseInfo$TypeAdapter.b = a.get(SplashBaseInfo.class);
    }
    public void SplashBaseInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashBaseInfo$TypeAdapter.class, "2");
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
             obj = new SplashBaseInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x81158a4f:
                      if (str.equals("startTime")) {
                         i = 0;
                      }
                      break;
                    case 0x8cb935e2:
                      if (str.equals("splashId")) {
                         i = 1;
                      }
                      break;
                    case 0xa0336a48:
                      if (str.equals("endTime")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mStartTime = KnownTypeAdapters$n.a(p0, obj.mStartTime);
                      break;
                    case 1:
                      obj.mSplashId = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mEndTime = KnownTypeAdapters$n.a(p0, obj.mEndTime);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashBaseInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("startTime");
          p0.K(p1.mStartTime);
          p0.r("endTime");
          p0.K(p1.mEndTime);
          if (p1.mSplashId != null) {
             p0.r("splashId");
             TypeAdapters.A.write(p0, p1.mSplashId);
          }
          p0.j();
       }
       return;
    }
}
