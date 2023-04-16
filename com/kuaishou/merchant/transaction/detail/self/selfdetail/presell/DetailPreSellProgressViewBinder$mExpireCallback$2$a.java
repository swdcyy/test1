package com.kuaishou.merchant.transaction.detail.self.selfdetail.presell.DetailPreSellProgressViewBinder$mExpireCallback$2$a;
import di4.b;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.presell.DetailPreSellProgressViewBinder$mExpireCallback$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.presell.DetailPreSellProgressViewBinder;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.transaction.detail.detailv2.j;
import com.kuaishou.ksmvvm.command.KSCommand;

public final class DetailPreSellProgressViewBinder$mExpireCallback$2$a implements b	// class@000756
{
    public final DetailPreSellProgressViewBinder$mExpireCallback$2 a;

    public void DetailPreSellProgressViewBinder$mExpireCallback$2$a(DetailPreSellProgressViewBinder$mExpireCallback$2 p0){
       this.a = p0;
       super();
    }
    public final void callback(){
       if (PatchProxy.applyVoid(null, this, DetailPreSellProgressViewBinder$mExpireCallback$2$a.class, "1")) {
          return;
       }
       DetailPreSellProgressViewBinder x = this.a.this$0.x;
       if (x == null) {
          a.S("mDetailViewModel");
       }
       x.z.a();
       return;
    }
}
