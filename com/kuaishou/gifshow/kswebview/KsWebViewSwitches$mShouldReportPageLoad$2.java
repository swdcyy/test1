package com.kuaishou.gifshow.kswebview.KsWebViewSwitches$mShouldReportPageLoad$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Random;
import com.kuaishou.gifshow.kswebview.KsWebViewSwitches;

public final class KsWebViewSwitches$mShouldReportPageLoad$2 extends Lambda implements a	// class@0019e8
{
    public static final KsWebViewSwitches$mShouldReportPageLoad$2 INSTANCE;

    static {
       KsWebViewSwitches$mShouldReportPageLoad$2.INSTANCE = new KsWebViewSwitches$mShouldReportPageLoad$2();
    }
    public void KsWebViewSwitches$mShouldReportPageLoad$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, KsWebViewSwitches$mShouldReportPageLoad$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (new Random().nextFloat() - KsWebViewSwitches.c.c() < 0)? true: false;
       return b;
    }
}
