package com.kwai.framework.model.user.UserExtraInfo$RoleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.UserExtraInfo$RoleInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kwai.framework.model.user.b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;
import com.kwai.framework.model.user.a;

public final class UserExtraInfo$RoleInfo$TypeAdapter extends TypeAdapter	// class@001746
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       UserExtraInfo$RoleInfo$TypeAdapter.c = a.get(UserExtraInfo$RoleInfo.class);
    }
    public void UserExtraInfo$RoleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UserExtraInfo$RoleInfo$TypeAdapter.class, "2");
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
             obj = new UserExtraInfo$RoleInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xf0194421:
                      if (str.equals("roleName")) {
                         i = 0;
                      }
                      break;
                    case 0xf01c58d0:
                      if (str.equals("roleType")) {
                         i = 1;
                      }
                      break;
                    case 0x4b9a497a:
                      if (str.equals("roleHeadUrls")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mRoleName = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mRoleType = KnownTypeAdapters$k.a(p0, obj.mRoleType);
                      break;
                    case 2:
                      obj.mHeadUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new b(this)).a(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserExtraInfo$RoleInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("roleType");
          p0.K((long)p1.mRoleType);
          if (p1.mRoleName != null) {
             p0.r("roleName");
             TypeAdapters.A.write(p0, p1.mRoleName);
          }
          if (p1.mHeadUrls != null) {
             p0.r("roleHeadUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new a(this)).b(p0, p1.mHeadUrls);
          }
          p0.j();
       }
       return;
    }
}
