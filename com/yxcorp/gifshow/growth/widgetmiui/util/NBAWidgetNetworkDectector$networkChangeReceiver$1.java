package com.yxcorp.gifshow.growth.widgetmiui.util.NBAWidgetNetworkDectector$networkChangeReceiver$1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.Integer;
import com.yxcorp.gifshow.growth.widgetmiui.util.NBAWidgetNetworkDectector;
import com.yxcorp.gifshow.growth.widgetmiui.NBAWidgetProviderManager;

public final class NBAWidgetNetworkDectector$networkChangeReceiver$1 extends BroadcastReceiver	// class@00161d
{

    public void NBAWidgetNetworkDectector$networkChangeReceiver$1(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NBAWidgetNetworkDectector$networkChangeReceiver$1.class, "1")) {
          return;
       }
       if (p0 != null && (p1 != null && a.g("android.net.conn.CONNECTIVITY_CHANGE", p1.getAction()))) {
          p0 = p0.getSystemService("connectivity");
          Objects.requireNonNull(p0, "null cannot be cast to non-null type android.net.ConnectivityManager");
          NetworkInfo activeNetwor = p0.getActiveNetworkInfo();
          Integer integer = (activeNetwor != null)? Integer.valueOf(activeNetwor.getType()): null;
          int i = -1;
          if (NBAWidgetNetworkDectector.a == i && (integer == null || integer.intValue() != i)) {
             NBAWidgetProviderManager.b.c();
          }
          if (integer != null) {
             i = integer.intValue();
          }
          NBAWidgetNetworkDectector.a = i;
       }
    label_0055 :
       return;
    }
}
