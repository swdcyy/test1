package com.yxcorp.gifshow.model.ExtractFrameInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.ExtractFrameInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.ExtractFrameAttribute$TypeAdapter;
import com.yxcorp.gifshow.model.ExtractFrameVerify$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.yxcorp.gifshow.model.ExtractFrameAttribute;
import com.yxcorp.gifshow.model.ExtractFrameVerify;
import com.google.gson.stream.b;

public final class ExtractFrameInfo$TypeAdapter extends TypeAdapter	// class@001e0a
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       ExtractFrameInfo$TypeAdapter.d = a.get(ExtractFrameInfo.class);
    }
    public void ExtractFrameInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(ExtractFrameAttribute$TypeAdapter.b);
       this.c = p0.j(ExtractFrameVerify$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ExtractFrameInfo$TypeAdapter.class, "2");
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
             obj = new ExtractFrameInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x892059ea:
                      if (str.equals("verify_0")) {
                         i = 0;
                      }
                      break;
                    case 0x892059eb:
                      if (str.equals("verify_1")) {
                         i = 1;
                      }
                      break;
                    case 0xc9e5d0cb:
                      if (str.equals("script")) {
                         i = 2;
                      }
                      break;
                    case 0x19e5f:
                      if (str.equals("key")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mVerify = this.c.read(p0);
                      break;
                    case 1:
                      obj.mAttribute = this.b.read(p0);
                      break;
                    case 2:
                      obj.mLuaScript = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mKey = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExtractFrameInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mKey != null) {
             p0.r("key");
             TypeAdapters.A.write(p0, p1.mKey);
          }
          if (p1.mAttribute != null) {
             p0.r("verify_1");
             this.b.write(p0, p1.mAttribute);
          }
          if (p1.mVerify != null) {
             p0.r("verify_0");
             this.c.write(p0, p1.mVerify);
          }
          if (p1.mLuaScript != null) {
             p0.r("script");
             TypeAdapters.A.write(p0, p1.mLuaScript);
          }
          p0.j();
       }
       return;
    }
}
