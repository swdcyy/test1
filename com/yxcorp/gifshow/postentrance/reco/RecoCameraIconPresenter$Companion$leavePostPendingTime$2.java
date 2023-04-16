package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$Companion$leavePostPendingTime$2;
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

public final class RecoCameraIconPresenter$Companion$leavePostPendingTime$2 extends Lambda implements a	// class@001057
{
    public static final RecoCameraIconPresenter$Companion$leavePostPendingTime$2 INSTANCE;

    static {
       RecoCameraIconPresenter$Companion$leavePostPendingTime$2.INSTANCE = new RecoCameraIconPresenter$Companion$leavePostPendingTime$2();
    }
    public void RecoCameraIconPresenter$Companion$leavePostPendingTime$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, RecoCameraIconPresenter$Companion$leavePostPendingTime$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("HomePostRecoLeavePostPendingTime", 0x4e20);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
