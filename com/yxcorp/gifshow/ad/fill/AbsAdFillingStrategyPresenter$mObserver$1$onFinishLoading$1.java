package com.yxcorp.gifshow.ad.fill.AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.feed.k;

public final class AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$1 extends Lambda implements l	// class@00176b
{
    public static final AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$1 INSTANCE;

    static {
       AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$1.INSTANCE = new AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$1();
    }
    public void AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$1(){
       super(1);
    }
    public final PhotoAdvertisement invoke(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return k.B(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
