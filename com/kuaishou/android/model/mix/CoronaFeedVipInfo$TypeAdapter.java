package com.kuaishou.android.model.mix.CoronaFeedVipInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoronaFeedVipInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.CoronaFilmAdInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.kuaishou.android.model.mix.CoronaFilmAdInfo;
import com.google.gson.stream.b;

public final class CoronaFeedVipInfo$TypeAdapter extends TypeAdapter	// class@000c0b
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       CoronaFeedVipInfo$TypeAdapter.c = a.get(CoronaFeedVipInfo.class);
    }
    public void CoronaFeedVipInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(CoronaFilmAdInfo$TypeAdapter.b);
    }
    public CoronaFeedVipInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoronaFeedVipInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoronaFeedVipInfo uCoronaFeedV = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoronaFeedV;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoronaFeedV;
       }else {
          p0.c();
          CoronaFeedVipInfo uCoronaFeedV1 = new CoronaFeedVipInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x84a3502a:
                   if (str.equals("enableFilmAd")) {
                      i = 0;
                   }
                   break;
                 case 0xf2e9ca15:
                   if (str.equals("filmAdInfo")) {
                      i = 1;
                   }
                   break;
                 case 0x57f01015:
                   if (str.equals("vipPhoto")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCoronaFeedV1.enableFilmAd = KnownTypeAdapters$g.a(p0, uCoronaFeedV1.enableFilmAd);
                   break;
                 case 1:
                   uCoronaFeedV1.filmAdInfo = this.b.read(p0);
                   break;
                 case 2:
                   uCoronaFeedV1.vipPhoto = KnownTypeAdapters$g.a(p0, uCoronaFeedV1.vipPhoto);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCoronaFeedV1;
       }
    }
    public void b(b p0,CoronaFeedVipInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaFeedVipInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("vipPhoto");
          p0.P(p1.vipPhoto);
          p0.r("enableFilmAd");
          p0.P(p1.enableFilmAd);
          if (p1.filmAdInfo != null) {
             p0.r("filmAdInfo");
             this.b.write(p0, p1.filmAdInfo);
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
