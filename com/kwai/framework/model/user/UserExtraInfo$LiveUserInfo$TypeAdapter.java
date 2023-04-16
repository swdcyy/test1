package com.kwai.framework.model.user.UserExtraInfo$LiveUserInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.UserExtraInfo$LiveUserInfo;
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

public final class UserExtraInfo$LiveUserInfo$TypeAdapter extends TypeAdapter	// class@001744
{
    public final Gson a;
    public static final a b;

    static {
       UserExtraInfo$LiveUserInfo$TypeAdapter.b = a.get(UserExtraInfo$LiveUserInfo.class);
    }
    public void UserExtraInfo$LiveUserInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UserExtraInfo$LiveUserInfo$TypeAdapter.class, "2");
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
             obj = new UserExtraInfo$LiveUserInfo();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("nickname")) {
                   p0.Q();
                }else {
                   obj.mNickname = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserExtraInfo$LiveUserInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mNickname != null) {
             p0.r("nickname");
             TypeAdapters.A.write(p0, p1.mNickname);
          }
          p0.j();
       }
       return;
    }
}
