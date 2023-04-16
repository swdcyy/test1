package com.kuaishou.commercial.tvc.TvcPluginImplWrapper$mTvcStreamIdWhiteList$2;
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

public final class TvcPluginImplWrapper$mTvcStreamIdWhiteList$2 extends Lambda implements a	// class@0016a1
{
    public static final TvcPluginImplWrapper$mTvcStreamIdWhiteList$2 INSTANCE;

    static {
       TvcPluginImplWrapper$mTvcStreamIdWhiteList$2.INSTANCE = new TvcPluginImplWrapper$mTvcStreamIdWhiteList$2();
    }
    public void TvcPluginImplWrapper$mTvcStreamIdWhiteList$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Object obj = PatchProxy.apply(null, this, TvcPluginImplWrapper$mTvcStreamIdWhiteList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = a.t().c("tvcStreamIdWhiteList", "");
       a.o(str, "SwitchConfigManager.getI¡­STREAM_ID_WHITE_LIST, \"\"\)");
       String[] stringArray = new String[]{","};
       return StringsKt__StringsKt.H4(str, stringArray, false, 0, 6, null);
    }
}
