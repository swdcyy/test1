package com.kuaishou.merchant.marketing.shop.timediscount.a$c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.marketing.shop.timediscount.a;
import y94.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.model.LiveMerchantContainerDataList;
import fa4.a;
import q94.n;
import com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter;
import fq5.b;
import da4.a;

public class a$c extends m	// class@001c02
{
    public final c c;
    public final a d;

    public void a$c(a p0,c p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       a$c td = this.d;
       td.j9(true, this.c, td.N.c());
       n a = n.a;
       int i = this.d.N.d(this.c) + 1;
       int i1 = this.c.g();
       String liveStreamId = this.d.u.getLiveStreamId();
       String str = this.d.u.d();
       String str1 = (this.c.e() == null)? "": this.c.e().f();
       a.d(i, i1, liveStreamId, str, str1);
       return;
    }
}
