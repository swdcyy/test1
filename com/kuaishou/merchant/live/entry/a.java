package com.kuaishou.merchant.live.entry.a;
import u07.u;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$onBind$1$a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import msd.l;
import b64.a;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$onBind$1;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter;
import b64.b;
import msd.a;
import java.lang.Runnable;
import ekd.k1;

public final class a implements u	// class@001a16
{
    public final LiveMerchantEntryInterceptPresenter$onBind$1$a b;

    public void a(LiveMerchantEntryInterceptPresenter$onBind$1$a p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       this.b.e.invoke(Boolean.TRUE);
       a.a.a(true);
       LiveMerchantEntryInterceptPresenter t = this.b.b.b.t;
       if (t != null) {
          t = new b(t);
       }
       k1.r(t, 100);
       return;
    }
}
