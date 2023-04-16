package com.kwai.lib.Spring$callbackReceiver$1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.lib.Spring;
import java.util.Map;
import msd.l;
import java.lang.Boolean;

public final class Spring$callbackReceiver$1 extends BroadcastReceiver	// class@000810
{

    public void Spring$callbackReceiver$1(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       a.p(p1, "intent");
       if (a.g(p1.getAction(), "com.android.push.spring.dialog.SHOWN")) {
          String stringExtra = p1.getStringExtra("fragment_tag");
          if (stringExtra != null) {
             l ol = Spring.a.a().remove(stringExtra);
             if (ol != null) {
                ol.invoke(Boolean.TRUE);
             }
          }
       }
       return;
    }
}
