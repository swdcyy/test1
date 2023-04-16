package com.kuaishou.merchant.transaction.purchase.dynamic.func.PageInfoRequestFunc$d;
import erd.g;
import mu4.d;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rd4.b;
import java.util.Objects;
import rd4.b$a;
import com.kwai.robust.PatchProxyResult;

public final class PageInfoRequestFunc$d implements g	// class@00090c
{
    public final d b;

    public void PageInfoRequestFunc$d(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageInfoRequestFunc$d.class, "1")) {
       }else {
          PageInfoRequestFunc$d tb = this.b;
          b$a a = b.a;
          Objects.requireNonNull(a);
          String str = PatchProxy.applyOneRefs(p0, a, b$a.class, "2");
          if (str != PatchProxyResult.class) {
          }else {
             str = new b(1, null, p0).a();
          }
          tb.a(str);
       }
       return;
    }
}
