package com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import ok8.b;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver$ConnectivityBroadcastReceiver;
import android.content.IntentFilter;
import java.lang.String;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.reactnativecommunity.netinfo.types.ConnectionType;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.reactnativecommunity.netinfo.types.CellularGeneration;

public class BroadcastReceiverConnectivityReceiver extends b	// class@000b65
{
    public final BroadcastReceiverConnectivityReceiver$ConnectivityBroadcastReceiver j;

    public void BroadcastReceiverConnectivityReceiver(ReactApplicationContext p0){
       super(p0);
       this.j = new BroadcastReceiverConnectivityReceiver$ConnectivityBroadcastReceiver(this);
    }
    public void d(){
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
       UniversalReceiver.e(this.c(), this.j, intentFilter);
       this.j.a(true);
       this.h();
    }
    public void f(){
       if (this.j.a != null) {
          UniversalReceiver.f(this.c(), this.j);
          this.j.a(false);
       }
       return;
    }
    public void h(){
       ConnectionType uNKNOWN = ConnectionType.UNKNOWN;
       CellularGeneration uCellularGen = null;
       boolean b = false;
       try{
          NetworkInfo activeNetwor = this.b().getActiveNetworkInfo();
          if (activeNetwor == null || !activeNetwor.isConnected()) {
             uNKNOWN = ConnectionType.NONE;
          }else {
             b = activeNetwor.isConnected();
             int type = activeNetwor.getType();
             if (type) {
                if (type != 1) {
                   if (type != 4) {
                      if (type != 9) {
                         if (type != 17) {
                            if (type != 6) {
                               if (type == 7) {
                                  uNKNOWN = ConnectionType.BLUETOOTH;
                               }
                            }else {
                               uNKNOWN = ConnectionType.WIMAX;
                            }
                         }else {
                            uNKNOWN = ConnectionType.VPN;
                         }
                      }else {
                         uNKNOWN = ConnectionType.ETHERNET;
                      }
                   }
                }else {
                   uNKNOWN = ConnectionType.WIFI;
                }
             }
             uNKNOWN = ConnectionType.CELLULAR;
             uCellularGen = CellularGeneration.fromNetworkInfo(activeNetwor);
          }
       }catch(java.lang.SecurityException e0){
          uNKNOWN = ConnectionType.UNKNOWN;
       }
       this.g(uNKNOWN, uCellularGen, b);
       return;
    }
}
