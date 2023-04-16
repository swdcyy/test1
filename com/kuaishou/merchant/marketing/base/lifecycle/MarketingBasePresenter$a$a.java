package com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter$a$a;
import java.lang.Runnable;
import com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter$a;
import com.kuaishou.bowl.data.center.data.model.MaterialMap;
import com.kuaishou.bowl.core.live.ComponentDataSource;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fq5.b;
import com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter;
import d84.c;
import vu.c;

public final class MarketingBasePresenter$a$a implements Runnable	// class@001af1
{
    public final MarketingBasePresenter$a b;
    public final int c;
    public final MaterialMap d;
    public final ComponentDataSource e;

    public void MarketingBasePresenter$a$a(MarketingBasePresenter$a p0,int p1,MaterialMap p2,ComponentDataSource p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MarketingBasePresenter$a$a.class, "1")) {
          return;
       }
       c.a(this.b.a.W8().getLiveStreamId(), this.b.a.H, this.c, this.d, this.e);
       MarketingBasePresenter$a b = this.b.b;
       if (b != null) {
          b.c(this.c, this.d, this.e);
       }
       return;
    }
}
