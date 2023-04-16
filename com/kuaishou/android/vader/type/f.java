package com.kuaishou.android.vader.type.f;
import com.kuaishou.android.vader.type.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.c;
import com.google.gson.JsonElement;
import com.kuaishou.android.vader.type.d;
import com.google.gson.JsonObject;
import zk.g;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.kuaishou.android.vader.type.Operator;
import java.lang.Boolean;
import java.lang.UnsupportedOperationException;
import com.kuaishou.android.vader.type.a;
import com.kuaishou.android.vader.type.e;
import java.lang.Number;

public final class f implements b	// class@000f8a
{
    public final String a;

    public void f(String p0){
       super();
       this.a = p0;
    }
    public b a(String p0){
       JsonElement obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c().a(this.a);
       if (!obj.E()) {
          return d.a;
       }
       obj = obj.r().e0(p0);
       if (obj == null) {
          return d.a;
       }
       if (obj.E()) {
          return new f(obj.toString());
       }
       if (obj.F()) {
          return this.c(obj.s());
       }
       if (obj.B()) {
          throw new IllegalStateException("JsonArray is not supported yet. Request field : "+p0);
       }
       if (obj.D()) {
          throw new IllegalStateException("JsonNull does not have more fields. Request field : "+p0);
       }
       throw new IllegalStateException("Unknown type : "+obj.toString());
    }
    public boolean b(Operator p0,String p1){
       JsonElement obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == Operator.eq) {
          c uoc = new c();
          obj = uoc.a(this.a);
          if (obj.E()) {
             return obj.r().equals(uoc.a(p1).r());
          }
          return (this.a).equals(p1);
       }else if(p0 == Operator.regex){
          return (this.a).matches(p1);
       }else {
          throw new UnsupportedOperationException("Unknown operator : "+p0);
       }
    }
    public final b c(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.G()) {
          return new a(p0.d());
       }
       if (p0.N()) {
          return new e(p0.u());
       }
       if (p0.a0()) {
          return new f(p0.w());
       }
       throw new IllegalStateException("Unknown json primitive : "+p0);
    }
}
