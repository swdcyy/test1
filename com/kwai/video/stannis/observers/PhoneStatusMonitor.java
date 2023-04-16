package com.kwai.video.stannis.observers.PhoneStatusMonitor;
import android.content.Context;
import com.kwai.video.stannis.observers.PhoneStatusMonitor$PhoneStatusListener;
import java.lang.Object;
import com.kwai.video.stannis.observers.PhoneStatusMonitor$PhoneStatusReceiver;
import android.os.Looper;
import com.kwai.video.stannis.observers.PhoneStatusMonitor$PhoneStatusThread;
import java.lang.String;
import android.os.HandlerThread;
import android.os.Handler;
import java.lang.RuntimeException;
import com.kwai.video.stannis.observers.PhoneStatusMonitor$StannisPhoneStateListener;
import android.telephony.PhoneStateListener;
import com.kwai.video.stannis.observers.PhoneStatusTools;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.lang.Exception;
import com.kwai.video.stannis.utils.Log;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class PhoneStatusMonitor	// class@000c61
{
    public Context mContext;
    public boolean mIsCalling;
    public PhoneStateListener mPhoneStateListener;
    public Handler mPhoneStatusHandler;
    public PhoneStatusMonitor$PhoneStatusListener mPhoneStatusListener;
    public final Object mPhoneStatusLock;
    public PhoneStatusMonitor$PhoneStatusReceiver mPhoneStatusReceiver;
    public PhoneStatusMonitor$PhoneStatusThread mPhoneStatusThread;
    public boolean register_success;

    public void PhoneStatusMonitor(Context p0,PhoneStatusMonitor$PhoneStatusListener p1){
       super();
       this.mIsCalling = false;
       this.mPhoneStatusLock = new Object();
       this.register_success = false;
       this.mContext = p0;
       this.mPhoneStatusListener = p1;
       this.mPhoneStatusReceiver = new PhoneStatusMonitor$PhoneStatusReceiver(this);
       Looper looper = Looper.myLooper();
       if (looper == null) {
          PhoneStatusMonitor$PhoneStatusThread phoneStatusT = new PhoneStatusMonitor$PhoneStatusThread(this, "phone-status", p0);
          this.mPhoneStatusThread = phoneStatusT;
          phoneStatusT.start();
          looper = this.mPhoneStatusThread.getLooper();
          if (looper != null) {
             this.mPhoneStatusHandler = new Handler(looper);
          }else {
             throw new RuntimeException("get looper failed");
          }
       }else {
          this.mPhoneStatusHandler = new Handler(looper);
          PhoneStatusMonitor$StannisPhoneStateListener stannisPhone = new PhoneStatusMonitor$StannisPhoneStateListener(this);
          this.mPhoneStateListener = stannisPhone;
          PhoneStatusTools.listen(this.mContext, stannisPhone, 32);
       }
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.intent.action.PHONE_STATE");
       intentFilter.addAction("android.intent.action.PHONE_STATE2");
       intentFilter.addAction("android.intent.action.PHONE_STATE_2");
       intentFilter.addAction("android.intent.action.PHONE_STATE_EXT");
       String str = "android.intent.action.NEW_OUTGOING_CALL";
       try{
          intentFilter.addAction(str);
          UniversalReceiver.e(p0, this.mPhoneStatusReceiver, intentFilter);
          this.register_success = true;
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          Log.i("PhoneStatusMonitor", "init has exeception");
          this.register_success = false;
       }
       return;
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, PhoneStatusMonitor.class, "2")) {
          return;
       }
       super.finalize();
       return;
    }
    public boolean isCalling(){
       return this.mIsCalling;
    }
    public void uninit(){
       if (PatchProxy.applyVoid(null, this, PhoneStatusMonitor.class, "1")) {
          return;
       }
       PhoneStatusMonitor tmContext = this.mContext;
       PhoneStatusMonitor tmPhoneState = this.mPhoneStateListener;
       try{
          PhoneStatusTools.listen(tmContext, tmPhoneState, 0);
          if (this.register_success != null) {
             UniversalReceiver.f(this.mContext, this.mPhoneStatusReceiver);
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          Log.i("PhoneStatusMonitor", "uninit has exeception");
       }
       tmContext = this.mPhoneStatusLock;
       _monitor_enter(tmContext);
       tmPhoneState = this.mPhoneStatusThread;
       if (tmPhoneState != null) {
          tmPhoneState.close();
          this.mPhoneStatusHandler = null;
       }
       _monitor_exit(tmContext);
       this.mPhoneStatusListener = null;
       this.mPhoneStatusReceiver = null;
       this.mPhoneStateListener = null;
       this.mContext = null;
       return;
    }
}
