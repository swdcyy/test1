package com.kuaishou.android.model.mix.OperationExpTagDisplayInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.OperationExpTagDisplayInfo;
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

public final class OperationExpTagDisplayInfo$TypeAdapter extends TypeAdapter	// class@000d2a
{
    public final Gson a;
    public static final a b;

    static {
       OperationExpTagDisplayInfo$TypeAdapter.b = a.get(OperationExpTagDisplayInfo.class);
    }
    public void OperationExpTagDisplayInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public OperationExpTagDisplayInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, OperationExpTagDisplayInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       OperationExpTagDisplayInfo operationExp = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return operationExp;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return operationExp;
       }else {
          p0.c();
          OperationExpTagDisplayInfo operationExp1 = new OperationExpTagDisplayInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("text")) {
                if (!str.equals("type")) {
                   p0.Q();
                }else {
                   operationExp1.type = TypeAdapters.A.read(p0);
                }
             }else {
                operationExp1.text = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return operationExp1;
       }
    }
    public void b(b p0,OperationExpTagDisplayInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OperationExpTagDisplayInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.type != null) {
             p0.r("type");
             TypeAdapters.A.write(p0, p1.type);
          }
          if (p1.text != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.text);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
