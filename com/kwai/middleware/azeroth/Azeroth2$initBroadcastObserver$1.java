package com.kwai.middleware.azeroth.Azeroth2$initBroadcastObserver$1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.kwai.middleware.azeroth.Azeroth2;
import q97.c;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.os.Parcelable;
import com.kwai.middleware.azeroth.AzerothAccount;
import java.util.Objects;
import com.google.gson.Gson;
import xb7.a;
import com.kwai.middleware.azeroth.AzerothStorage;
import rb7.c;
import l97.a;
import rb7.a;
import java.lang.Throwable;

public final class Azeroth2$initBroadcastObserver$1 extends BroadcastReceiver	// class@000d47
{

    public void Azeroth2$initBroadcastObserver$1(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       String str;
       Azeroth2 b = Azeroth2.B;
       b.h().e("Received account changed broadcast.");
       if (p1 != null) {
          String stringExtra = p1.getStringExtra("KEY_ACCOUNT_CHANGED_TYPE");
          if (stringExtra != null) {
             a.h(stringExtra, "intent?.getStringExtra\(K\x20\x02T_CHANGED_TYPE\) ?: return\x00");
             AzerothAccount parcelableEx = p1.getParcelableExtra("KEY_ACCOUNT");
             AzerothStorage u = Azeroth2.u;
             if (u == null) {
                a.S("mStorage");
             }
             Objects.requireNonNull(u);
             if (parcelableEx != null) {
                String str1 = b.k().q(parcelableEx);
                if (str1 != null) {
                   str = str1;
                label_0040 :
                   a.d(u.a(), "KEY_ACCOUNT", str, false, 4, null);
                   c.c.e(new a(stringExtra, parcelableEx));
                }
             }
             str = "";
             goto label_0040 ;
          }
       }
       return;
    }
}
