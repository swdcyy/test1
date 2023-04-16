package com.kuaishou.merchant.live.entry.c;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$onBind$1$a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import msd.l;

public final class c implements PopupInterface$d	// class@001a18
{
    public final LiveMerchantEntryInterceptPresenter$onBind$1$a a;

    public void c(LiveMerchantEntryInterceptPresenter$onBind$1$a p0){
       this.a = p0;
       super();
    }
    public final void a(c p0,int p1){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, c.class, "1")) {
          return;
       }
       this.a.e.invoke(Boolean.TRUE);
       return;
    }
}
