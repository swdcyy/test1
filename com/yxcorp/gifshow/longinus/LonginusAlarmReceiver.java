package com.yxcorp.gifshow.longinus.LonginusAlarmReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.longinus.LonginusAlarmReceiver$a;
import java.lang.Runnable;
import f97.d;

public final class LonginusAlarmReceiver extends BroadcastReceiver	// class@001b65
{

    public void LonginusAlarmReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LonginusAlarmReceiver.class, "1")) {
          return;
       }
       if (p0 != null) {
          d.b(new LonginusAlarmReceiver$a(p0));
       }
       return;
    }
}
