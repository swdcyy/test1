package com.kwai.components.feedmodel.OperationBarInfo$GeneralInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.feedmodel.OperationBarInfo$GeneralInfo;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class OperationBarInfo$GeneralInfo$TypeAdapter extends TypeAdapter	// class@000c20
{
    public final Gson a;
    public static final a b;

    static {
       OperationBarInfo$GeneralInfo$TypeAdapter.b = a.get(OperationBarInfo$GeneralInfo.class);
    }
    public void OperationBarInfo$GeneralInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, OperationBarInfo$GeneralInfo$TypeAdapter.class, "2");
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
             obj = new OperationBarInfo$GeneralInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x37c70a:
                      if (str.equals("word")) {
                         i = 0;
                      }
                      break;
                    case 0x5fb28d2:
                      if (str.equals("index")) {
                         i = 1;
                      }
                      break;
                    case 0x2aef7aea:
                      if (str.equals("trendingCount")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mWord = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mIndex = KnownTypeAdapters$k.a(p0, obj.mIndex);
                      break;
                    case 2:
                      obj.mTrendingCount = KnownTypeAdapters$k.a(p0, obj.mTrendingCount);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OperationBarInfo$GeneralInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mWord != null) {
             p0.r("word");
             TypeAdapters.A.write(p0, p1.mWord);
          }
          p0.r("index");
          p0.K((long)p1.mIndex);
          p0.r("trendingCount");
          p0.K((long)p1.mTrendingCount);
          p0.j();
       }
       return;
    }
}
