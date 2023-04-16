package com.kwai.video.stannis.observers.PhoneStatusMonitor$PhoneStatusThread;
import android.os.HandlerThread;
import com.kwai.video.stannis.observers.PhoneStatusMonitor;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.InterruptedException;
import android.os.Looper;
import com.kwai.video.stannis.observers.PhoneStatusMonitor$StannisPhoneStateListener;
import android.telephony.PhoneStateListener;
import com.kwai.video.stannis.observers.PhoneStatusTools;

public class PhoneStatusMonitor$PhoneStatusThread extends HandlerThread	// class@000c5f
{
    public Context mContext;
    public final PhoneStatusMonitor this$0;
    public static final boolean $assertionsDisabled;

    public void PhoneStatusMonitor$PhoneStatusThread(PhoneStatusMonitor p0,String p1,Context p2){
       this.this$0 = p0;
       super(p1);
       this.mContext = p2;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, PhoneStatusMonitor$PhoneStatusThread.class, "2")) {
          return;
       }
       this.quit();
       try{
          this.mContext = null;
          this.join();
       }catch(java.lang.InterruptedException e0){
          e0.printStackTrace();
       }
       return;
    }
    public void onLooperPrepared(){
       if (PatchProxy.applyVoid(null, this, PhoneStatusMonitor$PhoneStatusThread.class, "1")) {
          return;
       }
       Looper.myLooper();
       this.this$0.mPhoneStateListener = new PhoneStatusMonitor$StannisPhoneStateListener(this.this$0);
       PhoneStatusTools.listen(this.mContext, this.this$0.mPhoneStateListener, 32);
       return;
    }
}
