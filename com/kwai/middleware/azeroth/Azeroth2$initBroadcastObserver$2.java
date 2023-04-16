package com.kwai.middleware.azeroth.Azeroth2$initBroadcastObserver$2;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.kwai.middleware.azeroth.Azeroth2;
import q97.c;
import java.lang.String;
import tb7.b;
import java.lang.Object;
import rb7.c;
import l97.b;
import kotlin.jvm.internal.a;
import rb7.a;
import java.lang.Throwable;

public final class Azeroth2$initBroadcastObserver$2 extends BroadcastReceiver	// class@000d48
{

    public void Azeroth2$initBroadcastObserver$2(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       Azeroth2 b = Azeroth2.B;
       b.h().e("Received app life broadcast.");
       if (!b.i(b.d()) && p1 != null) {
          String stringExtra = p1.getStringExtra("KEY_APP_LIFE_STATE");
          if (stringExtra != null) {
             int i = stringExtra.hashCode();
             if (i != -747104798) {
                if (i == -578289054 && stringExtra.equals("ON_STOP")) {
                   Azeroth2.a(b, false);
                }
             }else if(stringExtra.equals("ON_START")){
                Azeroth2.a(b, true);
             }
             a.h(stringExtra, "state");
             c.c.e(new b(stringExtra));
          }
       }
       return;
    }
}
