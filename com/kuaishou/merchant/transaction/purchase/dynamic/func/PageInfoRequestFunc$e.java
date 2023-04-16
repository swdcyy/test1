package com.kuaishou.merchant.transaction.purchase.dynamic.func.PageInfoRequestFunc$e;
import erd.g;
import com.kuaishou.merchant.transaction.purchase.dynamic.func.PageInfoRequestFunc;
import mu4.d;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.retrofit.model.KwaiException;
import rd4.b;
import rd4.b$a;

public final class PageInfoRequestFunc$e implements g	// class@00090d
{
    public final PageInfoRequestFunc b;
    public final d c;

    public void PageInfoRequestFunc$e(PageInfoRequestFunc p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageInfoRequestFunc$e.class, "1")) {
       }else {
          PageInfoRequestFunc$e tc = this.c;
          PageInfoRequestFunc$e tb = this.b;
          Objects.requireNonNull(tb);
          String str = PatchProxy.applyOneRefs(p0, tb, PageInfoRequestFunc.class, "4");
          if (str != PatchProxyResult.class) {
          }else if(p0 instanceof KwaiException){
             p0 = b.a.a(p0.mErrorMessage);
          }else {
             b$a a = b.a;
             p0 = (p0 != null)? p0.getMessage(): null;
             p0 = a.b(p0);
          }
          str = p0;
          tc.a(str);
       }
       return;
    }
}
