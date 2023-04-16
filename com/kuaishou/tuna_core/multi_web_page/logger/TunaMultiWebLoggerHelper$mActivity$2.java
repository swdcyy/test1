package com.kuaishou.tuna_core.multi_web_page.logger.TunaMultiWebLoggerHelper$mActivity$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.app.Activity;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TunaMultiWebLoggerHelper$mActivity$2 extends Lambda implements a	// class@0010ec
{
    public final Activity $activity;

    public void TunaMultiWebLoggerHelper$mActivity$2(Activity p0){
       this.$activity = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final WeakReference invoke(){
       Object obj = PatchProxy.apply(null, this, TunaMultiWebLoggerHelper$mActivity$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WeakReference(this.$activity);
    }
}
