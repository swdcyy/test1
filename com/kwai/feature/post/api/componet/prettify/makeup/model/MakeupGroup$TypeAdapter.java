package com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupGroup;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.google.gson.stream.b;

public final class MakeupGroup$TypeAdapter extends TypeAdapter	// class@0012f5
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       MakeupGroup$TypeAdapter.c = a.get(MakeupGroup.class);
    }
    public void MakeupGroup$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, MakeupGroup$TypeAdapter.class, "2");
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
             obj = new MakeupGroup();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa7988daa:
                      if (str.equals("groupName")) {
                         i = 0;
                      }
                      break;
                    case 0xcb735571:
                      if (str.equals("suiteIdList")) {
                         i = 1;
                      }
                      break;
                    case 0x117d5bfa:
                      if (str.equals("groupId")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mGroupName = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mMakeupSuites = this.b.read(p0);
                      break;
                    case 2:
                      obj.mGroupId = KnownTypeAdapters$k.a(p0, obj.mGroupId);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MakeupGroup$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("groupId");
          p0.K((long)p1.mGroupId);
          if (p1.mGroupName != null) {
             p0.r("groupName");
             TypeAdapters.A.write(p0, p1.mGroupName);
          }
          if (p1.mMakeupSuites != null) {
             p0.r("suiteIdList");
             this.b.write(p0, p1.mMakeupSuites);
          }
          p0.j();
       }
       return;
    }
}
