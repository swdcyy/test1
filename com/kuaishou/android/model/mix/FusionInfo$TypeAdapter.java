package com.kuaishou.android.model.mix.FusionInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.FusionInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.HighLightStartEndTime$TypeAdapter;
import com.kuaishou.android.model.mix.FusionPlayInfo$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import java.util.List;
import com.kuaishou.android.model.mix.HighLightStartEndTime;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class FusionInfo$TypeAdapter extends TypeAdapter	// class@000c91
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       FusionInfo$TypeAdapter.e = a.get(FusionInfo.class);
    }
    public void FusionInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(HighLightStartEndTime$TypeAdapter.b);
       TypeAdapter typeAdapter = p0.j(FusionPlayInfo$TypeAdapter.b);
       this.c = typeAdapter;
       this.d = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public FusionInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FusionInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       FusionInfo uFusionInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uFusionInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uFusionInfo;
       }else {
          p0.c();
          FusionInfo uFusionInfo1 = new FusionInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x84e5da10:
                   if (str.equals("highlightUrlFake")) {
                      i = 0;
                   }
                   break;
                 case 0x89444d94:
                   if (str.equals("duration")) {
                      i = 1;
                   }
                   break;
                 case 0xca90681b:
                   if (str.equals("source")) {
                      i = 2;
                   }
                   break;
                 case 0xe58f5e5a:
                   if (str.equals("highlightStartEndTime")) {
                      i = 3;
                   }
                   break;
                 case 0x65cdbbf:
                   if (str.equals("plays")) {
                      i = 4;
                   }
                   break;
                 case 0x3813101f:
                   if (str.equals("mediaId")) {
                      i = 5;
                   }
                   break;
                 case 0x6e7a3476:
                   if (str.equals("episodeId")) {
                      i = 6;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uFusionInfo1.mHighlightUrlFake = KnownTypeAdapters$g.a(p0, uFusionInfo1.mHighlightUrlFake);
                   break;
                 case 1:
                   uFusionInfo1.mDuration = KnownTypeAdapters$n.a(p0, uFusionInfo1.mDuration);
                   break;
                 case 2:
                   uFusionInfo1.mSource = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uFusionInfo1.mHighlightStartEndTime = this.b.read(p0);
                   break;
                 case 4:
                   uFusionInfo1.mPlays = this.d.read(p0);
                   break;
                 case 5:
                   uFusionInfo1.mMediaId = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uFusionInfo1.mEpisodeId = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uFusionInfo1;
       }
    }
    public void b(b p0,FusionInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FusionInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mMediaId != null) {
             p0.r("mediaId");
             TypeAdapters.A.write(p0, p1.mMediaId);
          }
          if (p1.mSource != null) {
             p0.r("source");
             TypeAdapters.A.write(p0, p1.mSource);
          }
          if (p1.mEpisodeId != null) {
             p0.r("episodeId");
             TypeAdapters.A.write(p0, p1.mEpisodeId);
          }
          p0.r("duration");
          p0.K(p1.mDuration);
          p0.r("highlightUrlFake");
          p0.P(p1.mHighlightUrlFake);
          if (p1.mHighlightStartEndTime != null) {
             p0.r("highlightStartEndTime");
             this.b.write(p0, p1.mHighlightStartEndTime);
          }
          if (p1.mPlays != null) {
             p0.r("plays");
             this.d.write(p0, p1.mPlays);
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
