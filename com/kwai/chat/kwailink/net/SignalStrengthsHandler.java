package com.kwai.chat.kwailink.net.SignalStrengthsHandler;
import java.lang.Object;
import com.kwai.chat.kwailink.net.SignalStrengthsHandler$c;
import com.kwai.chat.kwailink.utils.CustomHandlerThread;
import java.lang.String;
import android.os.Build$VERSION;
import android.content.Context;
import com.kwai.chat.kwailink.base.b;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.kwai.chat.kwailink.net.SignalStrengthsHandler$SimStateReceive;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.chat.kwailink.utils.AndroidUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;
import android.os.Process;
import android.telephony.SubscriptionInfo;
import android.telephony.PhoneStateListener;
import com.kwai.chat.kwailink.net.SignalStrengthsHandler$a;
import com.kwai.chat.kwailink.net.SignalStrengthsHandler$b;
import java.lang.Number;
import com.kwai.chat.kwailink.net.b;
import java.lang.Integer;
import java.lang.Exception;
import android.telephony.SignalStrength;
import java.lang.Boolean;
import w75.b;
import java.lang.Runnable;

public class SignalStrengthsHandler	// class@000a65
{
    public TelephonyManager a;
    public SubscriptionManager b;
    public SignalStrengthsHandler$SimStateReceive c;
    public final SignalStrengthsHandler$c d;
    public final SignalStrengthsHandler$c e;
    public SignalStrengthsHandler$a f;
    public SignalStrengthsHandler$b g;
    public final CustomHandlerThread h;
    public static SignalStrengthsHandler i;

    public void SignalStrengthsHandler(){
       super();
       this.d = new SignalStrengthsHandler$c();
       this.e = new SignalStrengthsHandler$c();
       this.h = new CustomHandlerThread("SignalStrengthsHandler");
       if (Build$VERSION.SDK_INT < 22) {
          return;
       }
       this.b = b.b().getSystemService("telephony_subscription_service");
       this.a = b.b().getSystemService("phone");
       this.j();
       this.c = new SignalStrengthsHandler$SimStateReceive(this);
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.intent.action.SIM_STATE_CHANGED");
       AndroidUtils.registerReceiverWithoutException(b.b(), this.c, intentFilter);
       return;
    }
    public static void a(SignalStrengthsHandler p0){
       p0.f();
    }
    public static SignalStrengthsHandler c(){
       SignalStrengthsHandler signalStreng = SignalStrengthsHandler.class;
       Object obj = PatchProxy.apply(null, null, signalStreng, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (SignalStrengthsHandler.i == null) {
          _monitor_enter(signalStreng);
          if (SignalStrengthsHandler.i == null) {
             SignalStrengthsHandler.i = new SignalStrengthsHandler();
          }
          _monitor_exit(signalStreng);
       }
       return SignalStrengthsHandler.i;
    }
    private void f(){
       SubscriptionInfo activeSubscr;
       int i3;
       boolean b;
       SignalStrengthsHandler$a uoa1;
       if (Build$VERSION.SDK_INT < 22) {
          return;
       }
       int i = this.b();
       String str = "SignalStrengthsHandler";
       a.g(str, "defaultDataSubId="+i);
       int i1 = 0;
       String str1 = ", new subId=";
       String str2 = "android.permission.READ_PHONE_STATE";
       int i2 = -1;
       if (this.e(i1)) {
          a.e(str, "sim1 exists");
          activeSubscr = (!AndroidUtils.checkPermission(b.b(), str2, Process.myPid(), Process.myUid()))? this.b.getActiveSubscriptionInfoForSimSlotIndex(i1): null;
          this.d.a = true;
          i3 = (activeSubscr == null)? i: activeSubscr.getSubscriptionId();
          a.e(str, "sim1 old subId="+this.d.b+str1+i3);
          SignalStrengthsHandler td = this.d;
          if (i3 != td.b) {
             td.b = i3;
             td.d = i1;
             td = this.f;
             if (td != null) {
                this.g(td, i1);
                this.f = null;
             }
          }
          td = this.d;
          b = (td.b == i)? true: false;
          td.c = b;
          if (this.f == null) {
             SignalStrengthsHandler$a uoa = new SignalStrengthsHandler$a(this, i3);
             this.f = uoa;
             this.g(uoa, 256);
          }
       }else {
          a.e(str, "sim1 does not exist");
          SignalStrengthsHandler td1 = this.d;
          td1.a = i1;
          td1.b = i2;
          td1.c = i1;
          td1.d = i1;
          td1 = this.f;
          if (td1 != null) {
             this.g(td1, i1);
             this.f = null;
          }
       }
       if (this.e(true)) {
          a.e(str, "sim2 exists");
          activeSubscr = (!AndroidUtils.checkPermission(b.b(), str2, Process.myPid(), Process.myUid()))? this.b.getActiveSubscriptionInfoForSimSlotIndex(true): null;
          this.e.a = true;
          i3 = (activeSubscr == null)? i: activeSubscr.getSubscriptionId();
          a.e(str, "sim2 old subId="+this.e.b+str1+i3);
          SignalStrengthsHandler te = this.e;
          if (i3 != te.b) {
             te.b = i3;
             te.d = i1;
             te = this.g;
             if (te != null) {
                this.g(te, i1);
                this.g = null;
             }
          }
          te = this.e;
          if (te.b == i) {
             i1 = true;
          }
          te.c = i1;
          if (this.g == null) {
             SignalStrengthsHandler$b uob = new SignalStrengthsHandler$b(this, i3);
             this.g = uob;
             this.g(uob, 256);
          }
       }else {
          a.e(str, "sim2 does not exist");
          SignalStrengthsHandler te1 = this.e;
          te1.a = i1;
          te1.b = i2;
          te1.c = i1;
          te1.d = i1;
          te1 = this.g;
          if (te1 != null) {
             this.g(te1, i1);
             this.g = null;
          }
       }
       this.i(this.d, this.e);
       return;
    }
    public final int b(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, SignalStrengthsHandler.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 24) {
          return SubscriptionManager.getDefaultDataSubscriptionId();
       }
       if (sDK_INT >= 22) {
          return b.c(SubscriptionManager.class, "getDefaultDataSubId", objArray, objArray).intValue();
       }
    }
    public int d(SignalStrength p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SignalStrengthsHandler.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          return (b.b(p0, "getLevel", null, null).intValue() + 1);
       }catch(java.lang.Exception e3){
          a.b("SignalStrengthsHandler", e3.getMessage());
          return 0;
       }
    }
    public final boolean e(int p0){
       SignalStrengthsHandler signalStreng = SignalStrengthsHandler.class;
       if (PatchProxy.isSupport(signalStreng)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, signalStreng, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean i = 1;
       int i1 = 0;
       try{
          Class[] uClassArray = new Class[i];
          uClassArray[i1] = Integer.TYPE;
          Object[] objArray = new Object[i];
          objArray[i1] = Integer.valueOf(p0);
          if (5 != b.b(this.a, "getSimState", uClassArray, objArray).intValue()) {
             i = false;
          }
          return i;
       }catch(java.lang.Exception e8){
          String message = e8.getMessage();
          try{
             a.b("SignalStrengthsHandler", message);
             if (5 != b.b(this.a, "getSimState", null, null).intValue()) {
                i = false;
             }
             return i;
          }catch(java.lang.Exception e8){
             a.b("SignalStrengthsHandler", e8.getMessage());
             return i1;
          }
       }
    }
    public final void g(PhoneStateListener p0,int p1){
       SignalStrengthsHandler signalStreng = SignalStrengthsHandler.class;
       if (PatchProxy.isSupport(signalStreng) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, signalStreng, "3")) {
          return;
       }
       try{
          this.a.listen(p0, p1);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void h(int p0,SignalStrengthsHandler$c p1){
       SignalStrengthsHandler signalStreng = SignalStrengthsHandler.class;
       if (PatchProxy.isSupport(signalStreng) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, signalStreng, "5")) {
          return;
       }
       a.e("SignalStrengthsHandler", "notifySignalStrengthChange, simIndex="+p0+", simInfo="+p1);
       return;
    }
    public final void i(SignalStrengthsHandler$c p0,SignalStrengthsHandler$c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SignalStrengthsHandler.class, "4")) {
          return;
       }
       a.e("SignalStrengthsHandler", "notifySimStateChange, sim1Info="+p0+", sim2Info="+p1);
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, SignalStrengthsHandler.class, "2")) {
          return;
       }
       this.h.post(new b(this));
       return;
    }
}
