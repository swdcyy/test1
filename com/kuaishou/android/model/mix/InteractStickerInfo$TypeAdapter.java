package com.kuaishou.android.model.mix.InteractStickerInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.InteractStickerInfo;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class InteractStickerInfo$TypeAdapter extends TypeAdapter	// class@000ce7
{
    public final Gson a;
    public static final a b;

    static {
       InteractStickerInfo$TypeAdapter.b = a.get(InteractStickerInfo.class);
    }
    public void InteractStickerInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public InteractStickerInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, InteractStickerInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       InteractStickerInfo interactStic = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return interactStic;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return interactStic;
       }else {
          p0.c();
          InteractStickerInfo interactStic1 = new InteractStickerInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("challengeId")) {
                p0.Q();
             }else {
                interactStic1.challengeId = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return interactStic1;
       }
    }
    public void b(b p0,InteractStickerInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, InteractStickerInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.challengeId != null) {
             p0.r("challengeId");
             TypeAdapters.A.write(p0, p1.challengeId);
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
