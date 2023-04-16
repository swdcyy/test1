package com.yxcorp.gifshow.tube.TubePurchaseInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.tube.TubePurchaseInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class TubePurchaseInfo$TypeAdapter extends TypeAdapter	// class@001e1e
{
    public final Gson a;
    public static final a b;

    static {
       TubePurchaseInfo$TypeAdapter.b = a.get(TubePurchaseInfo.class);
    }
    public void TubePurchaseInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, TubePurchaseInfo$TypeAdapter.class, "2");
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
             obj = new TubePurchaseInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x86e5f0ef:
                      if (str.equals("lastPurchaseEpisodeName")) {
                         i = 0;
                      }
                      break;
                    case 0xd67086e2:
                      if (str.equals("allPurchased")) {
                         i = 1;
                      }
                      break;
                    case 0x5b8d1924:
                      if (str.equals("lastPurchaseTime")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.lastPurchaseEpisodeName = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.allPurchased = KnownTypeAdapters$g.a(p0, obj.allPurchased);
                      break;
                    case 2:
                      obj.lastPurchaseTime = KnownTypeAdapters$n.a(p0, obj.lastPurchaseTime);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TubePurchaseInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.lastPurchaseEpisodeName != null) {
             p0.r("lastPurchaseEpisodeName");
             TypeAdapters.A.write(p0, p1.lastPurchaseEpisodeName);
          }
          p0.r("lastPurchaseTime");
          p0.K(p1.lastPurchaseTime);
          p0.r("allPurchased");
          p0.P(p1.allPurchased);
          p0.j();
       }
       return;
    }
}
