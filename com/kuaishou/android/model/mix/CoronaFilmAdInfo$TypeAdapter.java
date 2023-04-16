package com.kuaishou.android.model.mix.CoronaFilmAdInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoronaFilmAdInfo;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class CoronaFilmAdInfo$TypeAdapter extends TypeAdapter	// class@000c0d
{
    public final Gson a;
    public static final a b;

    static {
       CoronaFilmAdInfo$TypeAdapter.b = a.get(CoronaFilmAdInfo.class);
    }
    public void CoronaFilmAdInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public CoronaFilmAdInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoronaFilmAdInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoronaFilmAdInfo uCoronaFilmA = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoronaFilmA;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoronaFilmA;
       }else {
          p0.c();
          CoronaFilmAdInfo uCoronaFilmA1 = new CoronaFilmAdInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xc4a6040a:
                   if (str.equals("pageId")) {
                      i = 0;
                   }
                   break;
                 case 0xe2d4fe6a:
                   if (str.equals("subPageId")) {
                      i = 1;
                   }
                   break;
                 case 0x65e768f:
                   if (str.equals("posId")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCoronaFilmA1.pageId = KnownTypeAdapters$n.a(p0, uCoronaFilmA1.pageId);
                   break;
                 case 1:
                   uCoronaFilmA1.subPageId = KnownTypeAdapters$n.a(p0, uCoronaFilmA1.subPageId);
                   break;
                 case 2:
                   uCoronaFilmA1.posId = KnownTypeAdapters$k.a(p0, uCoronaFilmA1.posId);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCoronaFilmA1;
       }
    }
    public void b(b p0,CoronaFilmAdInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaFilmAdInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("pageId");
          p0.K(p1.pageId);
          p0.r("subPageId");
          p0.K(p1.subPageId);
          p0.r("posId");
          p0.K((long)p1.posId);
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
