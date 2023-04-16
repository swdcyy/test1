package com.kwai.framework.model.user.UserExtraInfo$TextColor$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.UserExtraInfo$TextColor;
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

public final class UserExtraInfo$TextColor$TypeAdapter extends TypeAdapter	// class@00174a
{
    public final Gson a;
    public static final a b;

    static {
       UserExtraInfo$TextColor$TypeAdapter.b = a.get(UserExtraInfo$TextColor.class);
    }
    public void UserExtraInfo$TextColor$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UserExtraInfo$TextColor$TypeAdapter.class, "2");
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
             obj = new UserExtraInfo$TextColor();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xf0e6c55d:
                      if (str.equals("extraText")) {
                         i = 0;
                      }
                      break;
                    case 0x357ce353:
                      if (str.equals("truncableText")) {
                         i = 1;
                      }
                      break;
                    case 0x5411155a:
                      if (str.equals("untruncableText")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mExtraText = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mTruncableText = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mUntruncableText = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserExtraInfo$TextColor$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mTruncableText != null) {
             p0.r("truncableText");
             TypeAdapters.A.write(p0, p1.mTruncableText);
          }
          if (p1.mUntruncableText != null) {
             p0.r("untruncableText");
             TypeAdapters.A.write(p0, p1.mUntruncableText);
          }
          if (p1.mExtraText != null) {
             p0.r("extraText");
             TypeAdapters.A.write(p0, p1.mExtraText);
          }
          p0.j();
       }
       return;
    }
}
