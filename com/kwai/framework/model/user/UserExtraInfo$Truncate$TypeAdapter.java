package com.kwai.framework.model.user.UserExtraInfo$Truncate$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.UserExtraInfo$Truncate;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class UserExtraInfo$Truncate$TypeAdapter extends TypeAdapter	// class@00174e
{
    public final Gson a;
    public static final a b;

    static {
       UserExtraInfo$Truncate$TypeAdapter.b = a.get(UserExtraInfo$Truncate.class);
    }
    public void UserExtraInfo$Truncate$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UserExtraInfo$Truncate$TypeAdapter.class, "2");
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
             obj = new UserExtraInfo$Truncate();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("truncableText")) {
                   if (!str1.equals("untruncableText")) {
                      p0.Q();
                   }else {
                      obj.mUntruncableText = KnownTypeAdapters$g.a(p0, obj.mUntruncableText);
                   }
                }else {
                   obj.mTruncableText = KnownTypeAdapters$g.a(p0, obj.mTruncableText);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserExtraInfo$Truncate$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("truncableText");
          p0.P(p1.mTruncableText);
          p0.r("untruncableText");
          p0.P(p1.mUntruncableText);
          p0.j();
       }
       return;
    }
}
