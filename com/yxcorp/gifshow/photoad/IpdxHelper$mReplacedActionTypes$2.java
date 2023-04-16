package com.yxcorp.gifshow.photoad.IpdxHelper$mReplacedActionTypes$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;

public final class IpdxHelper$mReplacedActionTypes$2 extends Lambda implements a	// class@000f5f
{
    public static final IpdxHelper$mReplacedActionTypes$2 INSTANCE;

    static {
       IpdxHelper$mReplacedActionTypes$2.INSTANCE = new IpdxHelper$mReplacedActionTypes$2();
    }
    public void IpdxHelper$mReplacedActionTypes$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Object obj = PatchProxy.apply(null, this, IpdxHelper$mReplacedActionTypes$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = a.t().c("ipdxReplaceActionType", "1,2,68,85,86,120,124,283,729");
       a.o(str, "SwitchConfigManager.getI¡­8,85,86,120,124,283,729\"\)");
       String[] stringArray = new String[]{","};
       return StringsKt__StringsKt.H4(str, stringArray, false, 0, 6, null);
    }
}
