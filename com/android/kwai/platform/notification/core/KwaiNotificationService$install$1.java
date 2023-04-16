package com.android.kwai.platform.notification.core.KwaiNotificationService$install$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import android.os.Trace;
import android.os.Build$VERSION;
import com.android.kwai.platform.notification.core.KwaiNotificationService;
import t7.b;

public final class KwaiNotificationService$install$1 extends Lambda implements a	// class@000402
{
    public final Context $context;

    public void KwaiNotificationService$install$1(Context p0){
       this.$context = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Trace.beginSection("KwaiNotificationManager.step2-2");
       if (Build$VERSION.SDK_INT >= 26) {
          KwaiNotificationService.b(KwaiNotificationService.d).a(this.$context);
       }
       Trace.endSection();
       return;
    }
}
