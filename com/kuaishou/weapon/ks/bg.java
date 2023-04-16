package com.kuaishou.weapon.ks.bg;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.content.Intent;
import java.lang.StringBuilder;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public class bg	// class@0011e3
{

    public void bg(){
       super();
    }
    public static String a(Context p0){
       String str = null;
       Intent intent = bg.d(p0);
       if (intent != null) {
          str = (int)(((float)intent.getIntExtra("level", -1) / (float)intent.getIntExtra("scale", -1)) * 100.00f);
       }
       return str+"%";
    }
    public static String b(Context p0){
       int intExtra = bg.d(p0).getIntExtra("plugged", -1);
       if (intExtra == 1) {
          return "AC charger";
       }
       if (intExtra == 2) {
          return "USB charger";
       }
       if (intExtra != 4) {
          return "";
       }
       return "Wireless charger";
    }
    public static int c(Context p0){
       int intExtra = bg.d(p0).getIntExtra("health", -1);
       int i = 3;
       if (intExtra == 2) {
          return i;
       }
       if (intExtra == i) {
          return 4;
       }
       if (intExtra == 4) {
          return 2;
       }
       i = 5;
       if (intExtra == i) {
          return i;
       }
       if (intExtra != 7) {
          return 6;
       }
       return 1;
    }
    public static Intent d(Context p0){
       return UniversalReceiver.e(p0, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }
}
