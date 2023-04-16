package com.kwai.android.dispatcher.KwaiPush$refreshToken$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import android.content.Context;
import com.kwai.android.common.utils.ContextProvider;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.android.common.ext.ContextExtKt;
import com.kwai.android.dispatcher.KwaiPush;
import java.util.List;
import com.kwai.android.dispatcher.KwaiPush$refreshToken$1$1;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.android.register.Register;
import android.content.Intent;
import java.lang.StringBuilder;

public final class KwaiPush$refreshToken$1 extends Lambda implements a	// class@0009b3
{
    public final boolean $ignoreRestrict;

    public void KwaiPush$refreshToken$1(boolean p0){
       this.$ignoreRestrict = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Context context = ContextProvider.getContext();
       String str = "ContextProvider.getContext\(\)";
       a.o(context, str);
       if (!ContextExtKt.isMainProcess(context)) {
          return;
       }
       KwaiPush iNSTANCE = KwaiPush.INSTANCE;
       if (KwaiPush.access$isCoreNeedPendingRunning$p(iNSTANCE)) {
          KwaiPush.access$getCorePendingRunnableList$p(iNSTANCE).add(new KwaiPush$refreshToken$1$1(this));
          return;
       }else {
          Iterator iterator = KwaiPush.access$getRegisterInstance$p(iNSTANCE).entrySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().getValue().refreshToken(this.$ignoreRestrict);
          }
          Intent intent = new Intent("com.action.kwai.force.refreshToken.ACTION");
          intent.putExtra("ignoreRestrict", this.$ignoreRestrict);
          Context context1 = ContextProvider.getContext();
          a.o(context1, str);
          ContextProvider.getContext().sendBroadcast(intent, context1.getPackageName()+".refreshToken.ALLOW_RECEIVED");
          return;
       }
    }
}
