package com.yxcorp.gifshow.longinus.LonginusAlarmReceiver$a;
import java.lang.Runnable;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.longinus.LonginusWorkManager;
import kotlin.jvm.internal.a;

public final class LonginusAlarmReceiver$a implements Runnable	// class@001b64
{
    public final Context b;

    public void LonginusAlarmReceiver$a(Context p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LonginusAlarmReceiver$a.class, "1")) {
          return;
       }
       Context applicationC = this.b.getApplicationContext();
       a.o(applicationC, "it.applicationContext");
       LonginusWorkManager.a.a(applicationC);
       return;
    }
}
