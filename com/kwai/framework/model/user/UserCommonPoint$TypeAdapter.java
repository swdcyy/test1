package com.kwai.framework.model.user.UserCommonPoint$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.UserCommonPoint;
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

public final class UserCommonPoint$TypeAdapter extends TypeAdapter	// class@001739
{
    public final Gson a;
    public static final a b;

    static {
       UserCommonPoint$TypeAdapter.b = a.get(UserCommonPoint.class);
    }
    public void UserCommonPoint$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UserCommonPoint$TypeAdapter.class, "2");
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
             obj = new UserCommonPoint();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa0aee821:
                      if (str.equals("startColor")) {
                         i = 0;
                      }
                      break;
                    case 0x368f3a:
                      if (str.equals("type")) {
                         i = 1;
                      }
                      break;
                    case 0x2e2b79ad:
                      if (str.equals("iconImageUrl")) {
                         i = 2;
                      }
                      break;
                    case 0x38b73479:
                      if (str.equals("content")) {
                         i = 3;
                      }
                      break;
                    case 0x654d0748:
                      if (str.equals("endColor")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mStartColor = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mType = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mIconUrl = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mContent = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mEndColor = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserCommonPoint$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mType != null) {
             p0.r("type");
             TypeAdapters.A.write(p0, p1.mType);
          }
          if (p1.mContent != null) {
             p0.r("content");
             TypeAdapters.A.write(p0, p1.mContent);
          }
          if (p1.mIconUrl != null) {
             p0.r("iconImageUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mStartColor != null) {
             p0.r("startColor");
             TypeAdapters.A.write(p0, p1.mStartColor);
          }
          if (p1.mEndColor != null) {
             p0.r("endColor");
             TypeAdapters.A.write(p0, p1.mEndColor);
          }
          p0.j();
       }
       return;
    }
}
