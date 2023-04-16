package com.kuaishou.android.model.mix.LipsSyncModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.LipsSyncModel;
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

public final class LipsSyncModel$TypeAdapter extends TypeAdapter	// class@000cfb
{
    public final Gson a;
    public static final a b;

    static {
       LipsSyncModel$TypeAdapter.b = a.get(LipsSyncModel.class);
    }
    public void LipsSyncModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public LipsSyncModel a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LipsSyncModel$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LipsSyncModel lipsSyncMode = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return lipsSyncMode;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return lipsSyncMode;
       }else {
          p0.c();
          LipsSyncModel lipsSyncMode1 = new LipsSyncModel();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x318dd7cd:
                   if (str.equals("detailPageText")) {
                      i = 0;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 1;
                   }
                   break;
                 case 0x739ebd0b:
                   if (str.equals("descAreaText")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   lipsSyncMode1.mDetailPageText = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   lipsSyncMode1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   lipsSyncMode1.mDescAreaText = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return lipsSyncMode1;
       }
    }
    public void b(b p0,LipsSyncModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LipsSyncModel$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mDescAreaText != null) {
             p0.r("descAreaText");
             TypeAdapters.A.write(p0, p1.mDescAreaText);
          }
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mDetailPageText != null) {
             p0.r("detailPageText");
             TypeAdapters.A.write(p0, p1.mDetailPageText);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
