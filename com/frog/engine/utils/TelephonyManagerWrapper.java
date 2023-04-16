package com.frog.engine.utils.TelephonyManagerWrapper;
import android.app.Application;
import java.lang.Object;
import java.lang.String;
import android.telephony.TelephonyManager;
import android.os.Build$VERSION;
import com.frog.engine.utils.TelephonyManagerWrapper$b;
import java.util.concurrent.Executor;
import android.telephony.TelephonyCallback;
import com.frog.engine.internal.FrogLog;
import com.frog.engine.utils.TelephonyManagerWrapper$a;
import android.telephony.PhoneStateListener;

public abstract class TelephonyManagerWrapper	// class@00157d
{
    public Object mCB;

    public void TelephonyManagerWrapper(Application p0){
       super();
       this.mCB = null;
       TelephonyManager systemServic = p0.getSystemService("phone");
       if (Build$VERSION.SDK_INT >= 31) {
          if (!p0.checkSelfPermission("android.permission.READ_PHONE_STATE")) {
             this.mCB = new TelephonyManagerWrapper$b(this);
             systemServic.registerTelephonyCallback(p0.getMainExecutor(), this.mCB);
             FrogLog.d("TelephonyManagerWrapper", "init success with READ_PHONE_STATE permission");
          }else {
             FrogLog.d("TelephonyManagerWrapper", "init failed no READ_PHONE_STATE permission");
          }
       }else {
          TelephonyManagerWrapper$a uoa = new TelephonyManagerWrapper$a(this);
          this.mCB = uoa;
          systemServic.listen(uoa, 32);
          FrogLog.d("TelephonyManagerWrapper", "init success");
       }
       return;
    }
    public abstract void onCallStateChanged(int p0);
}
