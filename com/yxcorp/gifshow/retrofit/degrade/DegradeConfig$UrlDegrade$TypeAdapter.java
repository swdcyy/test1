package com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegrade$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegrade;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$h;
import com.google.gson.stream.b;

public final class DegradeConfig$UrlDegrade$TypeAdapter extends TypeAdapter	// class@001319
{
    public final Gson a;
    public static final a b;

    static {
       DegradeConfig$UrlDegrade$TypeAdapter.b = a.get(DegradeConfig$UrlDegrade.class);
    }
    public void DegradeConfig$UrlDegrade$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, DegradeConfig$UrlDegrade$TypeAdapter.class, "2");
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
             obj = new DegradeConfig$UrlDegrade();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x834801c9:
                      if (str.equals("lonScope")) {
                         i = 0;
                      }
                      break;
                    case 0x8c43fd8a:
                      if (str.equals("numberOfCharacters")) {
                         i = 1;
                      }
                      break;
                    case 0xa8edd7f5:
                      if (str.equals("latScope")) {
                         i = 2;
                      }
                      break;
                    case 0x324e2a13:
                      if (str.equals("maxPage")) {
                         i = 3;
                      }
                      break;
                    case 0x7570f7f3:
                      if (str.equals("redirectUrl")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mLonScope = KnownTypeAdapters$h.a(p0);
                      break;
                    case 1:
                      obj.mPrecision = KnownTypeAdapters$k.a(p0, obj.mPrecision);
                      break;
                    case 2:
                      obj.mLatScope = KnownTypeAdapters$h.a(p0);
                      break;
                    case 3:
                      obj.mMaxPage = KnownTypeAdapters$k.a(p0, obj.mMaxPage);
                      break;
                    case 4:
                      obj.mUrlTemplate = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DegradeConfig$UrlDegrade$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mUrlTemplate != null) {
             p0.r("redirectUrl");
             TypeAdapters.A.write(p0, p1.mUrlTemplate);
          }
          p0.r("maxPage");
          p0.K((long)p1.mMaxPage);
          p0.r("numberOfCharacters");
          p0.K((long)p1.mPrecision);
          if (p1.mLatScope != null) {
             p0.r("latScope");
             KnownTypeAdapters$h.b(p0, p1.mLatScope);
          }
          if (p1.mLonScope != null) {
             p0.r("lonScope");
             KnownTypeAdapters$h.b(p0, p1.mLonScope);
          }
          p0.j();
       }
       return;
    }
}
