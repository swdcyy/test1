package com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$showPrivacyClipDialogIntervalTime$2;
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

public final class HomeExperimentManager$showPrivacyClipDialogIntervalTime$2 extends Lambda implements a	// class@0016b9
{
    public static final HomeExperimentManager$showPrivacyClipDialogIntervalTime$2 INSTANCE;

    static {
       HomeExperimentManager$showPrivacyClipDialogIntervalTime$2.INSTANCE = new HomeExperimentManager$showPrivacyClipDialogIntervalTime$2();
    }
    public void HomeExperimentManager$showPrivacyClipDialogIntervalTime$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, HomeExperimentManager$showPrivacyClipDialogIntervalTime$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0x2a300;
       long l1 = a.t().b("pasteboardAlertTipShowIntervalTime", l);
       if (v6 = l1) {
          l = (v6 < 0)? 0: l1;
       }
    label_002d :
       return l;
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
