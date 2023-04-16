package com.kuaishou.gifshow.kswebview.KsWebViewSwitches$mPageLoadReportRatio$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.SystemUtil;
import com.kwai.sdk.switchconfig.a;
import java.lang.Double;
import java.lang.reflect.Type;
import java.lang.Float;

public final class KsWebViewSwitches$mPageLoadReportRatio$2 extends Lambda implements a	// class@0019e7
{
    public static final KsWebViewSwitches$mPageLoadReportRatio$2 INSTANCE;

    static {
       KsWebViewSwitches$mPageLoadReportRatio$2.INSTANCE = new KsWebViewSwitches$mPageLoadReportRatio$2();
    }
    public void KsWebViewSwitches$mPageLoadReportRatio$2(){
       super(0);
    }
    public final float invoke(){
       Object obj = PatchProxy.apply(null, this, KsWebViewSwitches$mPageLoadReportRatio$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = (SystemUtil.I())? 0x3f800000: (float)a.t().getValue("switchKsWebViewPageLoadReportRatio", Double.TYPE, Double.valueOf(0x3fb999999999999a)).doubleValue();
       return f;
    }
    public Object invoke(){
       return Float.valueOf(this.invoke());
    }
}
