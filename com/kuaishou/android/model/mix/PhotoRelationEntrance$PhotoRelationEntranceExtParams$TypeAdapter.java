package com.kuaishou.android.model.mix.PhotoRelationEntrance$PhotoRelationEntranceExtParams$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PhotoRelationEntrance$PhotoRelationEntranceExtParams;
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

public final class PhotoRelationEntrance$PhotoRelationEntranceExtParams$TypeAdapter extends TypeAdapter	// class@000d62
{
    public final Gson a;
    public static final a b;

    static {
       PhotoRelationEntrance$PhotoRelationEntranceExtParams$TypeAdapter.b = a.get(PhotoRelationEntrance$PhotoRelationEntranceExtParams.class);
    }
    public void PhotoRelationEntrance$PhotoRelationEntranceExtParams$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoRelationEntrance$PhotoRelationEntranceExtParams a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoRelationEntrance$PhotoRelationEntranceExtParams$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoRelationEntrance$PhotoRelationEntranceExtParams photoRelatio = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return photoRelatio;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return photoRelatio;
       }else {
          p0.c();
          PhotoRelationEntrance$PhotoRelationEntranceExtParams photoRelatio1 = new PhotoRelationEntrance$PhotoRelationEntranceExtParams();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("photoRelationEntranceSource")) {
                p0.Q();
             }else {
                photoRelatio1.mPhotoRelationEntranceSource = KnownTypeAdapters$k.a(p0, photoRelatio1.mPhotoRelationEntranceSource);
             }
          }
          p0.j();
          return photoRelatio1;
       }
    }
    public void b(b p0,PhotoRelationEntrance$PhotoRelationEntranceExtParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoRelationEntrance$PhotoRelationEntranceExtParams$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("photoRelationEntranceSource");
          p0.K((long)p1.mPhotoRelationEntranceSource);
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
