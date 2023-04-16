package com.kuaishou.commercial.tvc.TvcPluginImplWrapper$mTvcUserIdWhiteList$2;
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

public final class TvcPluginImplWrapper$mTvcUserIdWhiteList$2 extends Lambda implements a	// class@0016a2
{
    public static final TvcPluginImplWrapper$mTvcUserIdWhiteList$2 INSTANCE;

    static {
       TvcPluginImplWrapper$mTvcUserIdWhiteList$2.INSTANCE = new TvcPluginImplWrapper$mTvcUserIdWhiteList$2();
    }
    public void TvcPluginImplWrapper$mTvcUserIdWhiteList$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Object obj = PatchProxy.apply(null, this, TvcPluginImplWrapper$mTvcUserIdWhiteList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = a.t().c("tvcUserIdWhiteList", "");
       a.o(str, "SwitchConfigManager.getI¡­C_USER_ID_WHITE_LIST, \"\"\)");
       String[] stringArray = new String[]{","};
       return StringsKt__StringsKt.H4(str, stringArray, false, 0, 6, null);
    }
}
