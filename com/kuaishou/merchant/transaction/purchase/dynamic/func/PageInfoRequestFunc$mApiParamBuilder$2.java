package com.kuaishou.merchant.transaction.purchase.dynamic.func.PageInfoRequestFunc$mApiParamBuilder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.transaction.purchase.dynamic.func.PageInfoRequestFunc;
import com.kuaishou.merchant.transaction.purchase.dynamic.util.PageInfoParamBuilder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import androidx.fragment.app.Fragment;

public final class PageInfoRequestFunc$mApiParamBuilder$2 extends Lambda implements a	// class@00090e
{
    public final PageInfoRequestFunc this$0;

    public void PageInfoRequestFunc$mApiParamBuilder$2(PageInfoRequestFunc p0){
       this.this$0 = p0;
       super(0);
    }
    public final PageInfoParamBuilder invoke(){
       Object obj = PatchProxy.apply(null, this, PageInfoRequestFunc$mApiParamBuilder$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PageInfoParamBuilder(this.this$0.c.getContext());
    }
    public Object invoke(){
       return this.invoke();
    }
}
