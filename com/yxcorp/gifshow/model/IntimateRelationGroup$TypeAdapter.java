package com.yxcorp.gifshow.model.IntimateRelationGroup$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.IntimateRelationGroup;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateRelation$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateCircle$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateCircle;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class IntimateRelationGroup$TypeAdapter extends TypeAdapter	// class@001e34
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       IntimateRelationGroup$TypeAdapter.e = a.get(IntimateRelationGroup.class);
    }
    public void IntimateRelationGroup$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(IntimateRelationGroup$IntimateRelation$TypeAdapter.e);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(IntimateRelationGroup$IntimateCircle$TypeAdapter.c);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, IntimateRelationGroup$TypeAdapter.class, "2");
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
             obj = new IntimateRelationGroup();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xac8eaa9a:
                      if (str.equals("hideAllIntimateRelation")) {
                         i = 0;
                      }
                      break;
                    case 0x11b93f7b:
                      if (str.equals("intimateRelation")) {
                         i = 1;
                      }
                      break;
                    case 0x48f3560f:
                      if (str.equals("intimateCircle")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mHideAllIntimateRelation = KnownTypeAdapters$g.a(p0, obj.mHideAllIntimateRelation);
                      break;
                    case 1:
                      obj.mIntimateRelations = this.c.read(p0);
                      break;
                    case 2:
                      obj.mIntimateCircle = this.d.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IntimateRelationGroup$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("hideAllIntimateRelation");
          p0.P(p1.mHideAllIntimateRelation);
          if (p1.mIntimateRelations != null) {
             p0.r("intimateRelation");
             this.c.write(p0, p1.mIntimateRelations);
          }
          if (p1.mIntimateCircle != null) {
             p0.r("intimateCircle");
             this.d.write(p0, p1.mIntimateCircle);
          }
          p0.j();
       }
       return;
    }
}
