package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$Companion$showDuration$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Long;

public final class RecoCameraIconPresenter$Companion$showDuration$2 extends Lambda implements a	// class@00105b
{
    public static final RecoCameraIconPresenter$Companion$showDuration$2 INSTANCE;

    static {
       RecoCameraIconPresenter$Companion$showDuration$2.INSTANCE = new RecoCameraIconPresenter$Companion$showDuration$2();
    }
    public void RecoCameraIconPresenter$Companion$showDuration$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, RecoCameraIconPresenter$Companion$showDuration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("homePostRecoDismissTime", 0x2710);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
