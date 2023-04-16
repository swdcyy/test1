package com.kwai.framework.model.user.UserExtraInfo$UserInfoExposed$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.UserExtraInfo$UserInfoExposed;
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

public final class UserExtraInfo$UserInfoExposed$TypeAdapter extends TypeAdapter	// class@001751
{
    public final Gson a;
    public static final a b;

    static {
       UserExtraInfo$UserInfoExposed$TypeAdapter.b = a.get(UserExtraInfo$UserInfoExposed.class);
    }
    public void UserExtraInfo$UserInfoExposed$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UserExtraInfo$UserInfoExposed$TypeAdapter.class, "2");
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
             obj = new UserExtraInfo$UserInfoExposed();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x938d0b1c:
                      if (str.equals("lineFirst")) {
                         i = 0;
                      }
                      break;
                    case 0x9451bdd3:
                      if (str.equals("lineThird")) {
                         i = 1;
                      }
                      break;
                    case 0xf4041988:
                      if (str.equals("lineSecond")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mlineFirst = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mlineThird = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mLineSecond = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserExtraInfo$UserInfoExposed$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mlineFirst != null) {
             p0.r("lineFirst");
             TypeAdapters.A.write(p0, p1.mlineFirst);
          }
          if (p1.mLineSecond != null) {
             p0.r("lineSecond");
             TypeAdapters.A.write(p0, p1.mLineSecond);
          }
          if (p1.mlineThird != null) {
             p0.r("lineThird");
             TypeAdapters.A.write(p0, p1.mlineThird);
          }
          p0.j();
       }
       return;
    }
}
