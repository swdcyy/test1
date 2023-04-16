package com.kwai.sdk.switchconfig.v2.internal.SwitchConfigUpdateReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import oo7.f;
import java.lang.String;
import com.kwai.sdk.switchconfig.v2.internal.c;
import java.lang.Runnable;
import am8.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import po7.j;

public class SwitchConfigUpdateReceiver extends BroadcastReceiver	// class@00167d
{
    public static final int a;

    public void SwitchConfigUpdateReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (p1 != null && p1.getExtras() != null) {
          if (!f.d()) {
             return;
          }else {
             Bundle extras = p1.getExtras();
             try{
                int i = 0;
                int intx = extras.getInt("ARG_ACTION_TYPE", i);
                if (intx == 1) {
                   d.d(c.b, "SwitchConfig", 2);
                }else if(intx == 2){
                   String str = extras.getString("ARG_SOURCE_TYPE", "");
                   int intx1 = extras.getInt("config_priority_value", i);
                   if (TextUtils.isEmpty(str)) {
                      return;
                   }else {
                      d.d(new j(str, intx1), "SwitchConfig", 2);
                   }
                }
             }catch(java.lang.Exception e0){
             }
          }
       }
       return;
    }
}
