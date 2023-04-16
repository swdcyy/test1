package com.kuaishou.android.model.mix.FashionShowInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.FashionShowInfo;
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
import com.google.gson.stream.b;

public final class FashionShowInfo$TypeAdapter extends TypeAdapter	// class@000c70
{
    public final Gson a;
    public static final a b;

    static {
       FashionShowInfo$TypeAdapter.b = a.get(FashionShowInfo.class);
    }
    public void FashionShowInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public FashionShowInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FashionShowInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       FashionShowInfo uFashionShow = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uFashionShow;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uFashionShow;
       }else {
          p0.c();
          FashionShowInfo uFashionShow1 = new FashionShowInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("showType")) {
                if (!str.equals("bizId")) {
                   p0.Q();
                }else {
                   uFashionShow1.mBizId = TypeAdapters.A.read(p0);
                }
             }else {
                uFashionShow1.mShowType = KnownTypeAdapters$k.a(p0, uFashionShow1.mShowType);
             }
          }
          p0.j();
          return uFashionShow1;
       }
    }
    public void b(b p0,FashionShowInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FashionShowInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("showType");
          p0.K((long)p1.mShowType);
          if (p1.mBizId != null) {
             p0.r("bizId");
             TypeAdapters.A.write(p0, p1.mBizId);
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
