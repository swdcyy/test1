package com.frog.engine.utils.TelephonyManagerWrapper$b;
import android.telephony.TelephonyCallback$CallStateListener;
import android.telephony.TelephonyCallback;
import com.frog.engine.utils.TelephonyManagerWrapper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class TelephonyManagerWrapper$b extends TelephonyCallback implements TelephonyCallback$CallStateListener	// class@00157c
{
    public final TelephonyManagerWrapper a;

    public void TelephonyManagerWrapper$b(TelephonyManagerWrapper p0){
       this.a = p0;
       super();
    }
    public void onCallStateChanged(int p0){
       if (PatchProxy.isSupport(TelephonyManagerWrapper$b.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TelephonyManagerWrapper$b.class, "1")) {
          return;
       }
       this.a.onCallStateChanged(p0);
       return;
    }
}
