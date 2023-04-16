package com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter$a;
import vu.c;
import com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter;
import java.lang.Object;
import com.kuaishou.bowl.core.live.ComponentDataSource;
import vu.b;
import com.kuaishou.bowl.data.center.data.model.MaterialMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter$a$a;
import java.lang.Runnable;
import ekd.k1;

public final class MarketingBasePresenter$a implements c	// class@001af2
{
    public final MarketingBasePresenter a;
    public final c b;

    public void MarketingBasePresenter$a(MarketingBasePresenter p0,c p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void b(int p0,ComponentDataSource p1,int p2){
       b.a(this, p0, p1, p2);
    }
    public final void c(int p0,MaterialMap p1,ComponentDataSource p2){
       if (PatchProxy.isSupport(MarketingBasePresenter$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, MarketingBasePresenter$a.class, "1")) {
          return;
       }
       k1.o(new MarketingBasePresenter$a$a(this, p0, p1, p2));
       return;
    }
}
