package com.kwai.framework.model.user.QUserContactName$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.QUserContactName;
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

public final class QUserContactName$TypeAdapter extends TypeAdapter	// class@00171e
{
    public final Gson a;
    public static final a b;

    static {
       QUserContactName$TypeAdapter.b = a.get(QUserContactName.class);
    }
    public void QUserContactName$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, QUserContactName$TypeAdapter.class, "2");
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
             obj = new QUserContactName();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xc2a50b9c:
                      if (str.equals("phoneHash")) {
                         i = 0;
                      }
                      break;
                    case 3373:
                      if (str.equals("iv")) {
                         i = 1;
                      }
                      break;
                    case 0x337a8b:
                      if (str.equals("name")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mMobileHash = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mIv = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mName = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, QUserContactName$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mIv != null) {
             p0.r("iv");
             TypeAdapters.A.write(p0, p1.mIv);
          }
          if (p1.mMobileHash != null) {
             p0.r("phoneHash");
             TypeAdapters.A.write(p0, p1.mMobileHash);
          }
          p0.j();
       }
       return;
    }
}
