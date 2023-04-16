package com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$onBind$1$emmit$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import brd.v;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import brd.g;

public final class LiveMerchantEntryInterceptPresenter$onBind$1$emmit$1 extends Lambda implements l	// class@001a11
{
    public final v $it;

    public void LiveMerchantEntryInterceptPresenter$onBind$1$emmit$1(v p0){
       this.$it = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(LiveMerchantEntryInterceptPresenter$onBind$1$emmit$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveMerchantEntryInterceptPresenter$onBind$1$emmit$1.class, "1")) {
          return;
       }
       this.$it.onNext(Boolean.valueOf(p0));
       this.$it.onComplete();
       return;
    }
}
