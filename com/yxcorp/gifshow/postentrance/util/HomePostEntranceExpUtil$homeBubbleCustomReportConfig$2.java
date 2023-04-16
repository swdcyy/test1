package com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil$homeBubbleCustomReportConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import jzb.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class HomePostEntranceExpUtil$homeBubbleCustomReportConfig$2 extends Lambda implements a	// class@001085
{
    public static final HomePostEntranceExpUtil$homeBubbleCustomReportConfig$2 INSTANCE;

    static {
       HomePostEntranceExpUtil$homeBubbleCustomReportConfig$2.INSTANCE = new HomePostEntranceExpUtil$homeBubbleCustomReportConfig$2();
    }
    public void HomePostEntranceExpUtil$homeBubbleCustomReportConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, HomePostEntranceExpUtil$homeBubbleCustomReportConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("enableHomeOperateBubbleStageReport", b.class, new b());
    }
}
