package com.kwai.android.common.utils.PushLogcat$tailProcessName$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import com.kwai.android.common.utils.ContextProvider;
import com.kwai.android.common.utils.ProcessUtil;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.lang.StringBuilder;

public final class PushLogcat$tailProcessName$2 extends Lambda implements a	// class@0009a3
{
    public static final PushLogcat$tailProcessName$2 INSTANCE;

    static {
       PushLogcat$tailProcessName$2.INSTANCE = new PushLogcat$tailProcessName$2();
    }
    public void PushLogcat$tailProcessName$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String currentProce = ProcessUtil.getCurrentProcessName(ContextProvider.getContext());
       Context context = ContextProvider.getContext();
       a.o(context, "ContextProvider.getContext\(\)");
       if (a.g(currentProce, context.getPackageName())) {
          currentProce = "MainProcess";
       }else if(currentProce == null || StringsKt__StringsKt.w3(currentProce, ":", 0, false, 6, null) != -1){
          if (currentProce != null) {
             String str = StringsKt__StringsKt.b5(currentProce, ":", null, 2, null);
             if (str != null) {
                currentProce = str;
             }
          }
          currentProce = "SubProcess\("+currentProce+')';
       }else {
          currentProce = "SubProcess\("+currentProce+')';
       }
       return currentProce;
    }
}
