package com.yxcorp.gifshow.model.OperationMaskTag$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.OperationMaskTag;
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

public final class OperationMaskTag$TypeAdapter extends TypeAdapter	// class@001e68
{
    public final Gson a;
    public static final a b;

    static {
       OperationMaskTag$TypeAdapter.b = a.get(OperationMaskTag.class);
    }
    public void OperationMaskTag$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, OperationMaskTag$TypeAdapter.class, "2");
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
             obj = new OperationMaskTag();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x36452d:
                      if (str.equals("text")) {
                         i = 0;
                      }
                      break;
                    case 0x5a72f63:
                      if (str.equals("color")) {
                         i = 1;
                      }
                      break;
                    case 0xe45a34f:
                      if (str.equals("secondColor")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.text = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.color = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.secondColor = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OperationMaskTag$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.color != null) {
             p0.r("color");
             TypeAdapters.A.write(p0, p1.color);
          }
          if (p1.secondColor != null) {
             p0.r("secondColor");
             TypeAdapters.A.write(p0, p1.secondColor);
          }
          if (p1.text != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.text);
          }
          p0.j();
       }
       return;
    }
}
