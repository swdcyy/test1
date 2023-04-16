package com.yxcorp.gifshow.tube.TubeRankInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.tube.TubeRankInfo;
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

public final class TubeRankInfo$TypeAdapter extends TypeAdapter	// class@001e22
{
    public final Gson a;
    public static final a b;

    static {
       TubeRankInfo$TypeAdapter.b = a.get(TubeRankInfo.class);
    }
    public void TubeRankInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, TubeRankInfo$TypeAdapter.class, "2");
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
             obj = new TubeRankInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xb6cf0e84:
                      if (str.equals("rankCoverUrl")) {
                         i = 0;
                      }
                      break;
                    case 0xc812fa67:
                      if (str.equals("rankId")) {
                         i = 1;
                      }
                      break;
                    case 0xee5c7336:
                      if (str.equals("updateTime")) {
                         i = 2;
                      }
                      break;
                    case 0x354c2c:
                      if (str.equals("rank")) {
                         i = 3;
                      }
                      break;
                    case 0xf4044d7:
                      if (str.equals("rankName")) {
                         i = 4;
                      }
                      break;
                    case 0x3a4c67ba:
                      if (str.equals("rankNum")) {
                         i = 5;
                      }
                      break;
                    case 0x5c4e84d3:
                      if (str.equals("ruleUrl")) {
                         i = 6;
                      }
                      break;
                    case 0x7667e249:
                      if (str.equals("totalSubscribeCount")) {
                         i = 7;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.coverUrl = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.rankId = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.updateTime = KnownTypeAdapters$n.a(p0, obj.updateTime);
                      break;
                    case 3:
                    case 5:
                      obj.rankNum = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.rankName = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.ruleUrl = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.totalSubscribeCount = KnownTypeAdapters$n.a(p0, obj.totalSubscribeCount);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TubeRankInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.rankId != null) {
             p0.r("rankId");
             TypeAdapters.A.write(p0, p1.rankId);
          }
          if (p1.rankName != null) {
             p0.r("rankName");
             TypeAdapters.A.write(p0, p1.rankName);
          }
          p0.r("totalSubscribeCount");
          p0.K(p1.totalSubscribeCount);
          p0.r("updateTime");
          p0.K(p1.updateTime);
          if (p1.rankNum != null) {
             p0.r("rank");
             TypeAdapters.A.write(p0, p1.rankNum);
          }
          if (p1.coverUrl != null) {
             p0.r("rankCoverUrl");
             TypeAdapters.A.write(p0, p1.coverUrl);
          }
          if (p1.ruleUrl != null) {
             p0.r("ruleUrl");
             TypeAdapters.A.write(p0, p1.ruleUrl);
          }
          p0.j();
       }
       return;
    }
}
