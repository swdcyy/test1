package com.kwai.framework.model.user.UserVerifiedDetail$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.UserVerifiedDetail;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class UserVerifiedDetail$TypeAdapter extends TypeAdapter	// class@00177c
{
    public final Gson a;
    public static final a b;

    static {
       UserVerifiedDetail$TypeAdapter.b = a.get(UserVerifiedDetail.class);
    }
    public void UserVerifiedDetail$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UserVerifiedDetail$TypeAdapter.class, "2");
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
             obj = new UserVerifiedDetail();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x993583fc:
                      if (str.equals("description")) {
                         i = 0;
                      }
                      break;
                    case 0xd4045b53:
                      if (str.equals("iconType")) {
                         i = 1;
                      }
                      break;
                    case 0x368f3a:
                      if (str.equals("type")) {
                         i = 2;
                      }
                      break;
                    case 0x304615b:
                      if (str.equals("isMusician")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mDescription = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mIconType = KnownTypeAdapters$k.a(p0, obj.mIconType);
                      break;
                    case 2:
                      obj.mType = KnownTypeAdapters$k.a(p0, obj.mType);
                      break;
                    case 3:
                      obj.mIsMusician = KnownTypeAdapters$g.a(p0, obj.mIsMusician);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserVerifiedDetail$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
          if (p1.mDescription != null) {
             p0.r("description");
             TypeAdapters.A.write(p0, p1.mDescription);
          }
          p0.r("iconType");
          p0.K((long)p1.mIconType);
          p0.r("isMusician");
          p0.P(p1.mIsMusician);
          p0.j();
       }
       return;
    }
}
