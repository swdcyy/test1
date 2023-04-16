package com.kwai.components.feedmodel.feed.KaraokeScoreInfo$KtvScoreRankInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo$KtvScoreRankInfo;
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
import com.google.gson.stream.b;

public final class KaraokeScoreInfo$KtvScoreRankInfo$TypeAdapter extends TypeAdapter	// class@000c53
{
    public final Gson a;
    public static final a b;

    static {
       KaraokeScoreInfo$KtvScoreRankInfo$TypeAdapter.b = a.get(KaraokeScoreInfo$KtvScoreRankInfo.class);
    }
    public void KaraokeScoreInfo$KtvScoreRankInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, KaraokeScoreInfo$KtvScoreRankInfo$TypeAdapter.class, "2");
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
             obj = new KaraokeScoreInfo$KtvScoreRankInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x98627481:
                      if (str.equals("WEEKLY")) {
                         i = 0;
                      }
                      break;
                    case 0x203100:
                      if (str.equals("DUET")) {
                         i = 1;
                      }
                      break;
                    case 0x3dce5f9:
                      if (str.equals("DAILY")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mWeekly = KnownTypeAdapters$k.a(p0, obj.mWeekly);
                      break;
                    case 1:
                      obj.mDuet = KnownTypeAdapters$k.a(p0, obj.mDuet);
                      break;
                    case 2:
                      obj.mDaily = KnownTypeAdapters$k.a(p0, obj.mDaily);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KaraokeScoreInfo$KtvScoreRankInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("DAILY");
          p0.K((long)p1.mDaily);
          p0.r("WEEKLY");
          p0.K((long)p1.mWeekly);
          p0.r("DUET");
          p0.K((long)p1.mDuet);
          p0.j();
       }
       return;
    }
}
