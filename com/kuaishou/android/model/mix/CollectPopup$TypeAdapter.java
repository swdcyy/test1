package com.kuaishou.android.model.mix.CollectPopup$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CollectPopup;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
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

public final class CollectPopup$TypeAdapter extends TypeAdapter	// class@000bef
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       CollectPopup$TypeAdapter.c = a.get(CollectPopup.class);
    }
    public void CollectPopup$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public CollectPopup a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CollectPopup$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CollectPopup uCollectPopu = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCollectPopu;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCollectPopu;
       }else {
          p0.c();
          CollectPopup uCollectPopu1 = new CollectPopup();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("actions")) {
                if (!str.equals("text")) {
                   p0.Q();
                }else {
                   uCollectPopu1.mText = TypeAdapters.A.read(p0);
                }
             }else {
                uCollectPopu1.mActions = this.b.read(p0);
             }
          }
          p0.j();
          return uCollectPopu1;
       }
    }
    public void b(b p0,CollectPopup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CollectPopup$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mActions != null) {
             p0.r("actions");
             this.b.write(p0, p1.mActions);
          }
          if (p1.mText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mText);
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
