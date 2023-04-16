package com.kuaishou.android.model.feed.LiveCoverAnnexWrapper$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.feed.LiveCoverAnnexWrapper;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.feed.LiveCoverAnnex$TypeAdapter;
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
import java.util.List;
import com.google.gson.stream.b;

public final class LiveCoverAnnexWrapper$TypeAdapter extends TypeAdapter	// class@000b06
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       LiveCoverAnnexWrapper$TypeAdapter.d = a.get(LiveCoverAnnexWrapper.class);
    }
    public void LiveCoverAnnexWrapper$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(LiveCoverAnnex$TypeAdapter.i);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public LiveCoverAnnexWrapper a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveCoverAnnexWrapper$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LiveCoverAnnexWrapper liveCoverAnn = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return liveCoverAnn;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return liveCoverAnn;
       }else {
          p0.c();
          LiveCoverAnnexWrapper liveCoverAnn1 = new LiveCoverAnnexWrapper();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("liveCoverAnnexes")) {
                p0.Q();
             }else {
                liveCoverAnn1.mLiveCoverAnnexes = this.c.read(p0);
             }
          }
          p0.j();
          return liveCoverAnn1;
       }
    }
    public void b(b p0,LiveCoverAnnexWrapper p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCoverAnnexWrapper$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mLiveCoverAnnexes != null) {
             p0.r("liveCoverAnnexes");
             this.c.write(p0, p1.mLiveCoverAnnexes);
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
