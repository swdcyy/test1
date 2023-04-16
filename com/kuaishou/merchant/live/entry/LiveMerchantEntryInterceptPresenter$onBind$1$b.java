package com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$onBind$1$b;
import erd.g;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$onBind$1;
import msd.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter;
import java.lang.Boolean;

public final class LiveMerchantEntryInterceptPresenter$onBind$1$b implements g	// class@001a10
{
    public final LiveMerchantEntryInterceptPresenter$onBind$1 b;
    public final l c;

    public void LiveMerchantEntryInterceptPresenter$onBind$1$b(LiveMerchantEntryInterceptPresenter$onBind$1 p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantEntryInterceptPresenter$onBind$1$b.class, "1")) {
       }else {
          a.l(MerchantLiveLogBiz.ENTRY, "LiveMerchantEntryInterceptPresenter", "get crowd seller failed", p0);
          this.b.b.P8();
          this.c.invoke(Boolean.FALSE);
       }
       return;
    }
}
