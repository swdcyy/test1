package com.yxcorp.gifshow.ad.fill.AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$2 extends Lambda implements l	// class@00176c
{
    public static final AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$2 INSTANCE;

    static {
       AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$2.INSTANCE = new AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$2();
    }
    public void AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(PhotoAdvertisement p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       boolean b = (p0.mCreativeId > 0)? true: false;
       return b;
    }
}
