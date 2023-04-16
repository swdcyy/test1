package com.kuaishou.merchant.live.entry.b;
import u07.u;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$onBind$1$a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b64.a;
import java.lang.Boolean;
import msd.l;

public final class b implements u	// class@001a17
{
    public final LiveMerchantEntryInterceptPresenter$onBind$1$a b;

    public void b(LiveMerchantEntryInterceptPresenter$onBind$1$a p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       a.a.a(false);
       this.b.e.invoke(Boolean.FALSE);
       return;
    }
}
