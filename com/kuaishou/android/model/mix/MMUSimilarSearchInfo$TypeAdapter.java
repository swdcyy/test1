package com.kuaishou.android.model.mix.MMUSimilarSearchInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.MMUSimilarSearchInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
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

public final class MMUSimilarSearchInfo$TypeAdapter extends TypeAdapter	// class@000d18
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       MMUSimilarSearchInfo$TypeAdapter.c = a.get(MMUSimilarSearchInfo.class);
    }
    public void MMUSimilarSearchInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.c, new KnownTypeAdapters$d());
    }
    public MMUSimilarSearchInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, MMUSimilarSearchInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       MMUSimilarSearchInfo mMUSimilarSe = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return mMUSimilarSe;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return mMUSimilarSe;
       }else {
          p0.c();
          MMUSimilarSearchInfo mMUSimilarSe1 = new MMUSimilarSearchInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("hasCommodityPicIndexes")) {
                p0.Q();
             }else {
                mMUSimilarSe1.mHasCommodityPicIndexes = this.b.read(p0);
             }
          }
          p0.j();
          return mMUSimilarSe1;
       }
    }
    public void b(b p0,MMUSimilarSearchInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MMUSimilarSearchInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mHasCommodityPicIndexes != null) {
             p0.r("hasCommodityPicIndexes");
             this.b.write(p0, p1.mHasCommodityPicIndexes);
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
