package com.kuaishou.android.model.mix.TubeMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.TubeMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.tube.TubeInfo;
import com.yxcorp.gifshow.tube.TubeEpisodeInfo;
import com.yxcorp.gifshow.tube.TubeEntryInfo;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class TubeMeta$TypeAdapter extends TypeAdapter	// class@000e1f
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       TubeMeta$TypeAdapter.e = a.get(TubeMeta.class);
    }
    public void TubeMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(TubeInfo.class));
       this.c = p0.j(a.get(TubeEpisodeInfo.class));
       this.d = p0.j(a.get(TubeEntryInfo.class));
    }
    public TubeMeta a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, TubeMeta$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       TubeMeta tubeMeta = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return tubeMeta;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return tubeMeta;
       }else {
          p0.c();
          TubeMeta tubeMeta1 = new TubeMeta();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x367e84:
                   if (str.equals("tube")) {
                      i = 0;
                   }
                   break;
                 case 0x3eb1ce7c:
                   if (str.equals("hasTubeTag")) {
                      i = 1;
                   }
                   break;
                 case 0x52f00e1c:
                   if (str.equals("tubeEntryInfo")) {
                      i = 2;
                   }
                   break;
                 case 0x6530d025:
                   if (str.equals("tubeEpisodeInfo")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   tubeMeta1.mTubeInfo = this.b.read(p0);
                   break;
                 case 1:
                   tubeMeta1.mHasTubeTag = KnownTypeAdapters$g.a(p0, tubeMeta1.mHasTubeTag);
                   break;
                 case 2:
                   tubeMeta1.mTubeEntryInfo = this.d.read(p0);
                   break;
                 case 3:
                   tubeMeta1.mTubeEpisodeInfo = this.c.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return tubeMeta1;
       }
    }
    public void b(b p0,TubeMeta p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TubeMeta$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("hasTubeTag");
          p0.P(p1.mHasTubeTag);
          if (p1.mTubeInfo != null) {
             p0.r("tube");
             this.b.write(p0, p1.mTubeInfo);
          }
          if (p1.mTubeEpisodeInfo != null) {
             p0.r("tubeEpisodeInfo");
             this.c.write(p0, p1.mTubeEpisodeInfo);
          }
          if (p1.mTubeEntryInfo != null) {
             p0.r("tubeEntryInfo");
             this.d.write(p0, p1.mTubeEntryInfo);
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
