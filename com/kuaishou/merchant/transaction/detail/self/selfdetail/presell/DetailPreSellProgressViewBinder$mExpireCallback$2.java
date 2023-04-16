package com.kuaishou.merchant.transaction.detail.self.selfdetail.presell.DetailPreSellProgressViewBinder$mExpireCallback$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.presell.DetailPreSellProgressViewBinder;
import di4.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.presell.DetailPreSellProgressViewBinder$mExpireCallback$2$a;

public final class DetailPreSellProgressViewBinder$mExpireCallback$2 extends Lambda implements a	// class@000757
{
    public final DetailPreSellProgressViewBinder this$0;

    public void DetailPreSellProgressViewBinder$mExpireCallback$2(DetailPreSellProgressViewBinder p0){
       this.this$0 = p0;
       super(0);
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, DetailPreSellProgressViewBinder$mExpireCallback$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DetailPreSellProgressViewBinder$mExpireCallback$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
