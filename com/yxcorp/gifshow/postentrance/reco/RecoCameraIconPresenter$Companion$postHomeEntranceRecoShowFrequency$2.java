package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$Companion$postHomeEntranceRecoShowFrequency$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter;
import java.util.Objects;
import java.lang.reflect.Type;

public final class RecoCameraIconPresenter$Companion$postHomeEntranceRecoShowFrequency$2 extends Lambda implements a	// class@001058
{
    public static final RecoCameraIconPresenter$Companion$postHomeEntranceRecoShowFrequency$2 INSTANCE;

    static {
       RecoCameraIconPresenter$Companion$postHomeEntranceRecoShowFrequency$2.INSTANCE = new RecoCameraIconPresenter$Companion$postHomeEntranceRecoShowFrequency$2();
    }
    public void RecoCameraIconPresenter$Companion$postHomeEntranceRecoShowFrequency$2(){
       super(0);
    }
    public final RecoCameraIconPresenter$b invoke(){
       Object obj = PatchProxy.apply(null, this, RecoCameraIconPresenter$Companion$postHomeEntranceRecoShowFrequency$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(RecoCameraIconPresenter.I);
       return a.t().getValue("postHomeEntranceRecoShowFrequency", RecoCameraIconPresenter$b.class, RecoCameraIconPresenter.E);
    }
    public Object invoke(){
       return this.invoke();
    }
}
