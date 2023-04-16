package com.kuaishou.growth.pendant.core.response.PendantCommonParams$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.growth.pendant.core.response.PendantCommonParams;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PendantCommonParams$TypeAdapter extends TypeAdapter	// class@000650
{
    public final Gson a;
    public static final a b;

    static {
       PendantCommonParams$TypeAdapter.b = a.get(PendantCommonParams.class);
    }
    public void PendantCommonParams$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PendantCommonParams$TypeAdapter.class, "2");
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
             obj = new PendantCommonParams();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x83927df7:
                      if (str.equals("closeCount")) {
                         i = 0;
                      }
                      break;
                    case 0x12bd083c:
                      if (str.equals("pendantX")) {
                         i = 1;
                      }
                      break;
                    case 0x12bd083d:
                      if (str.equals("pendantY")) {
                         i = 2;
                      }
                      break;
                    case 0x2fb9b66a:
                      if (str.equals("isAdsorbedStatus")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mCloseCount = KnownTypeAdapters$k.a(p0, obj.mCloseCount);
                      break;
                    case 1:
                      obj.mPendantX = KnownTypeAdapters$k.a(p0, obj.mPendantX);
                      break;
                    case 2:
                      obj.mPendantY = KnownTypeAdapters$k.a(p0, obj.mPendantY);
                      break;
                    case 3:
                      obj.mIsAdsorbedStatus = KnownTypeAdapters$g.a(p0, obj.mIsAdsorbedStatus);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PendantCommonParams$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("isAdsorbedStatus");
          p0.P(p1.mIsAdsorbedStatus);
          p0.r("pendantX");
          p0.K((long)p1.mPendantX);
          p0.r("pendantY");
          p0.K((long)p1.mPendantY);
          p0.r("closeCount");
          p0.K((long)p1.mCloseCount);
          p0.j();
       }
       return;
    }
}
