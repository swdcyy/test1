package com.kuaishou.android.model.mix.LivePlaybackQualityPlayUrls$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.LivePlaybackQualityPlayUrls;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
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
import com.google.gson.stream.b;

public final class LivePlaybackQualityPlayUrls$TypeAdapter extends TypeAdapter	// class@000d05
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       LivePlaybackQualityPlayUrls$TypeAdapter.d = a.get(LivePlaybackQualityPlayUrls.class);
    }
    public void LivePlaybackQualityPlayUrls$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public LivePlaybackQualityPlayUrls a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LivePlaybackQualityPlayUrls$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LivePlaybackQualityPlayUrls livePlayback = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return livePlayback;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return livePlayback;
       }else {
          p0.c();
          LivePlaybackQualityPlayUrls livePlayback1 = new LivePlaybackQualityPlayUrls();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("livePlaybackUris")) {
                if (!str.equals("livePlaybackClarityLevel")) {
                   p0.Q();
                }else {
                   livePlayback1.mLevel = TypeAdapters.A.read(p0);
                }
             }else {
                livePlayback1.mUrls = this.c.read(p0);
             }
          }
          p0.j();
          return livePlayback1;
       }
    }
    public void b(b p0,LivePlaybackQualityPlayUrls p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlaybackQualityPlayUrls$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mLevel != null) {
             p0.r("livePlaybackClarityLevel");
             TypeAdapters.A.write(p0, p1.mLevel);
          }
          if (p1.mUrls != null) {
             p0.r("livePlaybackUris");
             this.c.write(p0, p1.mUrls);
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
