package com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateRelation$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateRelation;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateTypeMetaInfo$TypeAdapter;
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
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateTypeMetaInfo;
import java.util.List;
import com.google.gson.stream.b;

public final class IntimateRelationGroup$IntimateRelation$TypeAdapter extends TypeAdapter	// class@001e30
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       IntimateRelationGroup$IntimateRelation$TypeAdapter.e = a.get(IntimateRelationGroup$IntimateRelation.class);
    }
    public void IntimateRelationGroup$IntimateRelation$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(IntimateRelationGroup$IntimateTypeMetaInfo$TypeAdapter.b);
       TypeAdapter typeAdapter = p0.j(a.get(User.class));
       this.c = typeAdapter;
       this.d = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, IntimateRelationGroup$IntimateRelation$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new IntimateRelationGroup$IntimateRelation();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("intimateFriends")) {
                   if (!str1.equals("intimateTypeMetaInfo")) {
                      p0.Q();
                   }else {
                      obj.mTypeMetaInfo = this.b.read(p0);
                   }
                }else {
                   obj.mIntimateFriends = this.d.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IntimateRelationGroup$IntimateRelation$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mTypeMetaInfo != null) {
             p0.r("intimateTypeMetaInfo");
             this.b.write(p0, p1.mTypeMetaInfo);
          }
          if (p1.mIntimateFriends != null) {
             p0.r("intimateFriends");
             this.d.write(p0, p1.mIntimateFriends);
          }
          p0.j();
       }
       return;
    }
}
