package com.frog.engine.utils.TelephonyManagerWrapper$a;
import android.telephony.PhoneStateListener;
import com.frog.engine.utils.TelephonyManagerWrapper;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;

public class TelephonyManagerWrapper$a extends PhoneStateListener	// class@00157b
{
    public final TelephonyManagerWrapper a;

    public void TelephonyManagerWrapper$a(TelephonyManagerWrapper p0){
       this.a = p0;
       super();
    }
    public void onCallStateChanged(int p0,String p1){
       if (PatchProxy.isSupport(TelephonyManagerWrapper$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, TelephonyManagerWrapper$a.class, "1")) {
          return;
       }
       super.onCallStateChanged(p0, p1);
       this.a.onCallStateChanged(p0);
       return;
    }
}
