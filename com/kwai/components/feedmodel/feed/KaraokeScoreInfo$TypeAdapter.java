package com.kwai.components.feedmodel.feed.KaraokeScoreInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo$KtvScoreRankInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo$KtvScoreRankInfo;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class KaraokeScoreInfo$TypeAdapter extends TypeAdapter	// class@000c55
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       KaraokeScoreInfo$TypeAdapter.c = a.get(KaraokeScoreInfo.class);
    }
    public void KaraokeScoreInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(KaraokeScoreInfo$KtvScoreRankInfo$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, KaraokeScoreInfo$TypeAdapter.class, "2");
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
             obj = new KaraokeScoreInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x8d57887f:
                      if (str.equals("karaLevel")) {
                         i = 0;
                      }
                      break;
                    case 0xd7087ed0:
                      if (str.equals("disPlayScore")) {
                         i = 1;
                      }
                      break;
                    case 0xeb31d593:
                      if (str.equals("karaTotalScore")) {
                         i = 2;
                      }
                      break;
                    case 0x27741b7:
                      if (str.equals("karaValidSegments")) {
                         i = 3;
                      }
                      break;
                    case 0xf3e2efa:
                      if (str.equals("rankInfo")) {
                         i = 4;
                      }
                      break;
                    case 0x3825c4ff:
                      if (str.equals("karaTotalSegments")) {
                         i = 5;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mLevel = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mShouldDisPlay = KnownTypeAdapters$g.a(p0, obj.mShouldDisPlay);
                      break;
                    case 2:
                      obj.mTotalScore = KnownTypeAdapters$k.a(p0, obj.mTotalScore);
                      break;
                    case 3:
                      obj.mValidSegment = KnownTypeAdapters$k.a(p0, obj.mValidSegment);
                      break;
                    case 4:
                      obj.mRankInfo = this.b.read(p0);
                      break;
                    case 5:
                      obj.mTotalSegment = KnownTypeAdapters$k.a(p0, obj.mTotalSegment);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KaraokeScoreInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("karaTotalScore");
          p0.K((long)p1.mTotalScore);
          p0.r("karaTotalSegments");
          p0.K((long)p1.mTotalSegment);
          p0.r("karaValidSegments");
          p0.K((long)p1.mValidSegment);
          if (p1.mLevel != null) {
             p0.r("karaLevel");
             TypeAdapters.A.write(p0, p1.mLevel);
          }
          p0.r("disPlayScore");
          p0.P(p1.mShouldDisPlay);
          if (p1.mRankInfo != null) {
             p0.r("rankInfo");
             this.b.write(p0, p1.mRankInfo);
          }
          p0.j();
       }
       return;
    }
}
