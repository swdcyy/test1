package com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter$1;
import msd.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import android.view.View;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.CallableReference;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class LiteLazyLoadRecommendBarPresenter$1 extends FunctionReferenceImpl implements a	// class@001b9d
{

    public void LiteLazyLoadRecommendBarPresenter$1(LiteLazyLoadRecommendBarPresenter p0){
       super(0, p0, LiteLazyLoadRecommendBarPresenter.class, "getRootView", "getRootView\(\)Landroid/view/View;", 0);
    }
    public final View invoke(){
       Object obj = PatchProxy.apply(null, this, LiteLazyLoadRecommendBarPresenter$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.receiver.m8();
    }
    public Object invoke(){
       return this.invoke();
    }
}
