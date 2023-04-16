package com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayCardPresenter$mInterceptor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayCardPresenter;
import java.lang.Object;
import s99.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import px3.b;

public final class MerchantAutoPlayCardPresenter$mInterceptor$2 extends Lambda implements a	// class@00174e
{
    public final MerchantAutoPlayCardPresenter this$0;

    public void MerchantAutoPlayCardPresenter$mInterceptor$2(MerchantAutoPlayCardPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final d invoke(){
       Object[] objArray = null;
       MerchantAutoPlayCardPresenter$mInterceptor$2 obj = PatchProxy.apply(objArray, this, MerchantAutoPlayCardPresenter$mInterceptor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       b uob = PatchProxy.apply(objArray, obj, MerchantAutoPlayCardPresenter.class, "13");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(obj);
       }
       return uob;
    }
}
