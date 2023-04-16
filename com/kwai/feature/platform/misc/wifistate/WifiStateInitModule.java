package com.kwai.feature.platform.misc.wifistate.WifiStateInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;
import l06.b;
import q87.c;
import android.content.Context;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import android.app.Application;
import o56.a;
import ekd.s1;
import android.os.Looper;
import android.os.HandlerThread;
import android.os.Handler;
import com.kwai.feature.platform.misc.wifistate.WifiStateInitModule$1;
import java.lang.StringBuilder;
import android.content.IntentFilter;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$BaseStationPackage;
import android.telephony.CellLocation;
import com.kwai.privacykit.interceptor.LocationInterceptor;
import android.telephony.gsm.GsmCellLocation;
import android.telephony.cdma.CdmaCellLocation;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import java.util.List;
import ukd.a;
import java.lang.Exception;
import java.util.Iterator;
import android.telephony.NeighboringCellInfo;
import com.kwai.sdk.switchconfig.a;
import s06.b;
import java.lang.Runnable;
import ekd.p0;
import s06.a;
import com.yxcorp.utility.WifiUtil;
import com.yxcorp.utility.WifiUtil$WifiInfo;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$WiFiStatEvent;
import java.util.ArrayList;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$WiFiPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import k2b.u1;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import s06.e;
import java.lang.reflect.Type;
import el.a;
import com.yxcorp.utility.RomUtils;
import qe6.b;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$BaseStationStatEvent;
import java.lang.Number;
import s06.c;

public class WifiStateInitModule extends TTIInitModule	// class@0012c2
{
    public Handler q;
    public Context r;
    public BroadcastReceiver s;
    public String t;
    public static final int u;
    public static boolean v;
    public static boolean w;

    static {
       WifiStateInitModule.u = (int)TimeUnit.SECONDS.toMillis(30);
       WifiStateInitModule.v = false;
       WifiStateInitModule.w = false;
    }
    public void WifiStateInitModule(){
       super();
       this.t = null;
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       Object obj = PatchProxy.apply(null, this, WifiStateInitModule.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 21;
    }
    public void h0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, WifiStateInitModule.class, "2")) {
          return;
       }
       boolean b = false;
       WifiStateInitModule.w = b;
       this.r0();
       if (!PatchProxy.applyVoid(objArray, this, WifiStateInitModule.class, "12") && this.s != null) {
          Object[] objArray1 = new Object[b];
          b.C().w("WifiAndBaseStationInitModule", "Unregister network receiver", objArray1);
          UniversalReceiver.f(this.r, this.s);
       }
       return;
    }
    public void i0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, WifiStateInitModule.class, "1")) {
          return;
       }
       boolean b = true;
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, WifiStateInitModule.class, "3") && !WifiStateInitModule.v) {
          WifiStateInitModule.v = b;
          this.r = a.b();
          if (s1.b().getLooper() == null) {
             WifiStateInitModule.v = i;
          }else {
             this.q = new Handler(s1.b().getLooper());
             this.s = new WifiStateInitModule$1(this);
          }
       }
       if (this.q == null) {
          Object[] objArray1 = new Object[i];
          b.C().t("LaunchErr", " init "+WifiStateInitModule.v, objArray1);
       }
       try{
          WifiStateInitModule.w = b;
          this.p0();
          if (PatchProxy.applyVoid(objArray, this, WifiStateInitModule.class, "11") || (WifiStateInitModule.w && this.s != null)) {
             objArray = new Object[i];
             b.C().w("WifiAndBaseStationInitModule", "Register network receiver", objArray);
             String str = "android.net.conn.CONNECTIVITY_CHANGE";
             IntentFilter intentFilter = new IntentFilter(str);
             UniversalReceiver.e(this.r, this.s, intentFilter);
          }
       label_009f :
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final ClientStat$BaseStationPackage n0(TelephonyManager p0){
       ClientStat$BaseStationPackage uBaseStation;
       String obj = PatchProxy.applyOneRefs(p0, this, WifiStateInitModule.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getNetworkOperator();
       try{
          uBaseStation = new ClientStat$BaseStationPackage();
          CellLocation cellLocation = LocationInterceptor.getCellLocation(p0);
          if (cellLocation instanceof GsmCellLocation) {
             uBaseStation.cellId = cellLocation.getCid();
             uBaseStation.locationAreaCode = cellLocation.getLac();
          }else if(cellLocation instanceof CdmaCellLocation){
             uBaseStation.cellId = cellLocation.getBaseStationId();
          }
       }catch(java.lang.SecurityException e0){
       }
       if (!TextUtils.isEmpty(e0) && e0.length() > 3) {
          uBaseStation.mobileCountryCode = Integer.parseInt(e0.substring(0, 3));
          uBaseStation.mobileNetworkCode = Integer.parseInt(e0.substring(3));
          uBaseStation.connected = true;
       }
       return uBaseStation;
    }
    public final List o0(TelephonyManager p0){
       List list1;
       Object obj = PatchProxy.applyOneRefs(p0, this, WifiStateInitModule.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       List list = null;
       try{
          Object[] objArray = new Object[i];
          list1 = a.a(p0, "getNeighboringCellInfo", objArray);
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
          list1 = list;
       }
       if (list1 != null && !list1.isEmpty()) {
          Iterator iterator = list1.iterator();
          if (iterator.hasNext()) {
             NeighboringCellInfo neighboringC = iterator.next();
             ClientStat$BaseStationPackage uBaseStation = new ClientStat$BaseStationPackage();
             uBaseStation.locationAreaCode = neighboringC.getLac();
             uBaseStation.mobileNetworkCode = neighboringC.getNetworkType();
             uBaseStation.connected = i;
             uBaseStation.cellId = neighboringC.getCid();
             uBaseStation.signalStrength = neighboringC.getRssi();
             throw list;
          }
       }
       return list;
    }
    public void p0(){
       if (PatchProxy.applyVoid(null, this, WifiStateInitModule.class, "5")) {
          return;
       }
       if (this.q == null) {
          return;
       }
       if (a.t().d("enableUploadWifiAndBaseStation", false)) {
          this.r0();
          this.q.post(new b(this));
       }
       return;
    }
    public final void q0(boolean p0){
       boolean b;
       int i;
       ClientStat$BaseStationPackage uBaseStation;
       ArrayList uArrayList;
       List list;
       Iterator iterator;
       ClientStat$BaseStationStatEvent uBaseStation1;
       ClientStat$BaseStationPackage[] uBaseStation2;
       String str;
       Object[] objArray2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(WifiStateInitModule.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, WifiStateInitModule.class, "6")) {
          return;
       }
       Object[] objArray = null;
       if (p0.C(this.r)) {
          b = true;
          if (!PatchProxy.applyVoid(objArray, this, WifiStateInitModule.class, "9")) {
             try{
                Object[] objArray3 = new Object[0];
                b.C().w("WifiAndBaseStationInitModule", "Send wifi_stat_event.", objArray3);
                if (!PatchProxy.applyVoid(objArray, objArray, a.class, "1")) {
                   List list1 = WifiUtil.b(a.B);
                   WifiUtil$WifiInfo wifiInfo = WifiUtil.a(a.B);
                   ClientStat$WiFiStatEvent wiFiStatEven = new ClientStat$WiFiStatEvent();
                   if (!list1.isEmpty()) {
                      ClientStat$WiFiPackage[] wiFiPackageA = new ClientStat$WiFiPackage[list1.size()];
                      for (int i1 = 0; i1 < list1.size(); i1 = i1 + 1) {
                         WifiUtil$WifiInfo wifiInfo1 = list1.get(i1);
                         WifiUtil$WifiInfo mBssid = wifiInfo.mBssid;
                         boolean b1 = (mBssid != null && mBssid.equals(wifiInfo1.mBssid))? true: false;
                         wiFiPackageA[i1] = a.a(wifiInfo1, b1);
                      }
                      wiFiStatEven.wifi = wiFiPackageA;
                   }else {
                      ClientStat$WiFiPackage[] wiFiPackageA1 = new ClientStat$WiFiPackage[b];
                      wiFiPackageA1[0] = a.a(wifiInfo, b);
                      wiFiStatEven.wifi = wiFiPackageA1;
                   }
                   ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
                   statPackage.wifiStatEvent = wiFiStatEven;
                   u1.j0(statPackage);
                }
             }catch(java.lang.SecurityException e0){
             }catch(java.lang.Exception e1){
                ExceptionHandler.handleCaughtException(e1);
             }
          }
       }else {
          Object[] objArray1 = new Object[0];
          b.C().w("WifiAndBaseStationInitModule", "Network is not connected, ignore this round", objArray1);
       }
    label_019c :
       TelephonyManager obj = PatchProxy.apply(objArray, this, WifiStateInitModule.class, "8");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          i = a.t().a("networkStatEventReportIntervalMs", (int)TimeUnit.MINUTES.toMillis(5));
          int u = WifiStateInitModule.u;
          if (i < u) {
             i = u;
          }
       }
       objArray = new Object[0];
       b.C().w("WifiAndBaseStationInitModule", "Next send interval: "+i, objArray);
       this.q.postDelayed(new c(this), (long)i);
       return;
    }
    public final void r0(){
       if (PatchProxy.applyVoid(null, this, WifiStateInitModule.class, "4")) {
          return;
       }
       if (this.q == null) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("WifiAndBaseStationInitModule", "Remove all sending events", objArray);
       this.q.removeCallbacksAndMessages(null);
       return;
    }
}
