package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserManager$currentShowUserChange$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MerchantRecommendUserManager$currentShowUserChange$2 extends Lambda implements a	// class@001789
{
    public static final MerchantRecommendUserManager$currentShowUserChange$2 INSTANCE;

    static {
       MerchantRecommendUserManager$currentShowUserChange$2.INSTANCE = new MerchantRecommendUserManager$currentShowUserChange$2();
    }
    public void MerchantRecommendUserManager$currentShowUserChange$2(){
       super(0);
    }
    public final PublishSubject invoke(){
       Object obj = PatchProxy.applyWithListener(null, this, MerchantRecommendUserManager$currentShowUserChange$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(MerchantRecommendUserManager$currentShowUserChange$2.class, "1");
       return PublishSubject.g();
    }
    public Object invoke(){
       return this.invoke();
    }
}
