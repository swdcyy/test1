package com.kwai.lib.Spring$screenListener$1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.lib.Spring;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import java.lang.Iterable;
import msd.a;
import qrd.l1;

public final class Spring$screenListener$1 extends BroadcastReceiver	// class@000812
{

    public void Spring$screenListener$1(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       String str;
       a.p(p1, "intent");
       String action = p1.getAction();
       if (action != null) {
          int i = action.hashCode();
          if (i != -2128145023) {
             if (i != -1454123155) {
                if (i == 0x311a1d6c && action.equals("android.intent.action.USER_PRESENT")) {
                   List c = Spring.c;
                   _monitor_enter(c);
                   Iterator iterator = CollectionsKt___CollectionsKt.J5(Spring.c).iterator();
                   while (iterator.hasNext()) {
                      iterator.next().invoke();
                   }
                   Spring.c.clear();
                   _monitor_exit(c);
                }
             }else {
                str = "android.intent.action.SCREEN_ON";
             }
          }else {
             str = "android.intent.action.SCREEN_OFF";
          }
          action.equals(str);
       }
    label_005a :
       return;
    }
}
