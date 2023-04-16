package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserManager$replaceShowUser$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserManager;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public final class MerchantRecommendUserManager$replaceShowUser$1 extends Lambda implements l	// class@00178a
{
    public final boolean $isNeedNotify;
    public final MerchantRecommendUserManager this$0;

    public void MerchantRecommendUserManager$replaceShowUser$1(MerchantRecommendUserManager p0,boolean p1){
       this.this$0 = p0;
       this.$isNeedNotify = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.intValue());
       return l1.a;
    }
    public final void invoke(int p0){
       if (PatchProxy.isSupport2(MerchantRecommendUserManager$replaceShowUser$1.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, MerchantRecommendUserManager$replaceShowUser$1.class, "1")) {
          return;
       }
       if (this.$isNeedNotify != null) {
          this.this$0.a().onNext(Integer.valueOf(p0));
       }
       PatchProxy.onMethodExit(MerchantRecommendUserManager$replaceShowUser$1.class, "1");
       return;
    }
}
