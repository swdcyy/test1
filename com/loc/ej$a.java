package com.loc.ej$a;
import android.content.BroadcastReceiver;
import com.loc.ej;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Object;
import com.loc.ex;
import android.os.Bundle;
import java.lang.Throwable;
import com.loc.fj;

public final class ej$a extends BroadcastReceiver	// class@001407
{
    public final ej a;

    public void ej$a(ej p0){
       this.a = p0;
       super();
    }
    public final void onReceive(Context p0,Intent p1){
       ej c;
       if (p0 == null || p1 == null) {
          return;
       }
       String action = p1.getAction();
       if (TextUtils.isEmpty(action)) {
          return;
       }
       if (action.equals("android.net.wifi.SCAN_RESULTS")) {
          c = this.a.c;
          if (c != null) {
             c.i();
          }
          if (p1.getExtras() != null && p1.getExtras().getBoolean("resultsUpdated", true)) {
             c = this.a.c;
             if (c != null) {
                c.h();
             }
          }
          return;
       }else if(action.equals("android.net.wifi.WIFI_STATE_CHANGED")){
          c = this.a.c;
          if (c != null) {
             c.j();
          }
       }
       return;
    }
}
