package com.kwai.nearby.local.speed.QueueCaller$runnableInterval$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.nearby.local.speed.QueueCaller;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.WindowManager;
import android.app.Activity;
import android.view.Display;
import usd.q;
import java.lang.Long;

public final class QueueCaller$runnableInterval$2 extends Lambda implements a	// class@000fe2
{
    public final QueueCaller this$0;

    public void QueueCaller$runnableInterval$2(QueueCaller p0){
       this.this$0 = p0;
       super(0);
    }
    public final long invoke(){
       Object[] objArray = null;
       QueueCaller obj = PatchProxy.apply(objArray, this, QueueCaller$runnableInterval$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.this$0.b;
       WindowManager windowManage = (obj != null)? obj.getWindowManager(): objArray;
       if (windowManage != null) {
          objArray = windowManage.getDefaultDisplay();
       }
       if (objArray != null) {
          return q.v((long)((1000.00f / objArray.getRefreshRate()) * (float)2), 32);
       }else {
          return 32;
       }
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
