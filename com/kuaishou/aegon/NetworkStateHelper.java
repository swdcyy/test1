package com.kuaishou.aegon.NetworkStateHelper;
import android.telephony.PhoneStateListener;
import android.content.Context;
import bo.v;
import java.lang.Runnable;
import io.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import vk7.g0;
import java.util.List;
import com.yxcorp.utility.c;
import java.util.Iterator;
import android.telephony.CellInfo;
import android.telephony.CellInfoLte;
import android.telephony.CellSignalStrengthLte;
import android.os.Build$VERSION;
import android.telephony.CellInfoGsm;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellInfoCdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.CellSignalStrength;
import java.lang.Integer;
import bo.x;
import java.lang.Number;
import android.net.wifi.WifiInfo;
import com.yxcorp.utility.NetworkUtilsCached;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import android.net.wifi.WifiManager;
import android.telephony.SignalStrength;
import bo.w;
import ekd.p0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import bo.y;

public class NetworkStateHelper extends PhoneStateListener	// class@0005dc
{
    public Context a;
    public Boolean b;
    public Boolean c;
    public static final int d;

    public void NetworkStateHelper(Context p0){
       super();
       this.a = p0;
       b.c(new v(this));
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, NetworkStateHelper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.c == null) {
          boolean b = (!g0.a(this.a, "android.permission.ACCESS_COARSE_LOCATION"))? true: false;
          this.c = Boolean.valueOf(b);
       }
       return this.c.booleanValue();
    }
    public final void b(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NetworkStateHelper.class, "3")) {
          return;
       }
       if (this.a()) {
          List list = c.a(this.a);
          if (list != null) {
             Iterator iterator = list.iterator();
             objArray1 = objArray;
             while (iterator.hasNext()) {
                CellInfo uCellInfo = iterator.next();
                if (uCellInfo.isRegistered()) {
                   objArray1 = uCellInfo;
                }
             }
             if (objArray1 != null) {
                if (objArray1 instanceof CellInfoLte) {
                   objArray = objArray1.getCellSignalStrength();
                   if (Build$VERSION.SDK_INT >= 26) {
                      if (objArray.getRsrq() < Integer.MAX_VALUE) {
                         this.c(0, objArray.getRsrq());
                      }
                      if (objArray.getRsrp() < Integer.MAX_VALUE) {
                         this.c(1, objArray.getRsrp());
                      }
                      if (objArray.getRssnr() < Integer.MAX_VALUE) {
                         this.c(2, objArray.getRssnr());
                      }
                   }
                }else if(objArray1 instanceof CellInfoGsm){
                   objArray = objArray1.getCellSignalStrength();
                }else if(objArray1 instanceof CellInfoCdma){
                   objArray = objArray1.getCellSignalStrength();
                }else if(objArray1 instanceof CellInfoWcdma){
                   objArray = objArray1.getCellSignalStrength();
                }
                if (objArray != null) {
                   if (objArray.getAsuLevel() < Integer.MAX_VALUE) {
                      this.c(3, objArray.getAsuLevel());
                   }
                   if (objArray.getDbm() < Integer.MAX_VALUE) {
                      this.c(3, objArray.getDbm());
                   }
                }
             }
          label_00b1 :
             return;
          }
       }
       objArray1 = objArray;
       goto label_0034 ;
    }
    public final void c(int p0,int p1){
       if (PatchProxy.isSupport(NetworkStateHelper.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, NetworkStateHelper.class, "4")) {
          return;
       }
       b.c(new x(this, p0, p1));
       return;
    }
    public final int getWifiSignalLevel(int p0){
       Object obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(NetworkStateHelper.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, NetworkStateHelper.class, "5");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (this.a == null) {
          return -1;
       }else {
          Object[] objArray = null;
          obj = PatchProxy.apply(objArray, this, NetworkStateHelper.class, "6");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(this.b == null){
             b = (!g0.a(this.a, "android.permission.ACCESS_WIFI_STATE"))? true: false;
             this.b = Boolean.valueOf(b);
          }
          b = this.b.booleanValue();
          if (b) {
             WifiInfo wifiInfo = NetworkUtilsCached.e(this.a);
             if (wifiInfo == null) {
                return -1;
             }else {
                b = wifiInfo.getRssi();
             }
          }else {
             try{
                Intent intent = UniversalReceiver.e(this.a, objArray, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
                if (intent == null) {
                   return -1;
                }else {
                   b = intent.getIntExtra("newRssi", Integer.MIN_VALUE);
                }
             }catch(java.lang.IllegalArgumentException e0){
                return -1;
             }catch(java.lang.Exception e0){
             }
          }
          if (b == Integer.MIN_VALUE) {
             return -1;
          }else {
             b = WifiManager.calculateSignalLevel(b, p0);
             if (b < 0 || b >= p0) {
                goto label_0089 ;
             }else {
                return b;
             }
          }
       }
    }
    public native final void nativeOnCreated();
    public native final void nativeOnKwaiConnectionTypeValueUpdate(int p0,int p1);
    public native final void nativeOnSignalStrengthChanged();
    public native final void nativeOnSignalStrengthValueUpdate(int p0,int p1);
    public void onSignalStrengthsChanged(SignalStrength p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkStateHelper.class, "1")) {
          return;
       }
       b.c(new w(this));
       return;
    }
    public final void performKwaiConnectionTypeUpdate(int p0){
       if (PatchProxy.isSupport(NetworkStateHelper.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NetworkStateHelper.class, "8")) {
          return;
       }
       int i = 3;
       String str = 1;
       if (p0.F(this.a)) {
          i = 1;
       }else {
          String str1 = p0.u(this.a);
          if (!TextUtils.x(str1)) {
             Objects.requireNonNull(str1);
             switch (str1.hashCode()){
                 case 1653:
                   if (str1.equals("2g")) {
                      str = 0;
                   }
                   break;
                 case 1684:
                   if (str1.equals("3g")) {
                   }
                   break;
                 case 1715:
                   if (str1.equals("4g")) {
                      str = 2;
                   }
                   break;
                 case 1746:
                   if (str1.equals("5g")) {
                      str = 3;
                   }
                   break;
                 default:
                label_003c :
                   str = -1;
             }
             switch (str){
                 case 0:
                   i = 2;
                 case 1:
                 case 2:
                   i = 4;
                   break;
                 case 3:
                   i = 5;
                   break;
                 default:
             }
          }
          i = 0;
       }
       b.c(new y(this, p0, i));
       return;
    }
    public final void performSignalStrengthMetricsUpdate(){
       if (PatchProxy.applyVoid(null, this, NetworkStateHelper.class, "2")) {
          return;
       }
       try{
          if (Build$VERSION.SDK_INT >= 23) {
             this.b();
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
