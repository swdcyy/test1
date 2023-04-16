package com.yxcorp.gifshow.relation.pymk.rn.KSPymkBridge$a;
import android.os.Handler;
import com.yxcorp.gifshow.relation.pymk.rn.KSPymkBridge;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;

public class KSPymkBridge$a extends Handler	// class@001953
{
    public final KSPymkBridge a;

    public void KSPymkBridge$a(KSPymkBridge p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge$a.class, "1")) {
          return;
       }
       super.handleMessage(p0);
       if (p0.what == 0x10000) {
          KSPymkBridge$a ta = this.a;
          ta.showEvent(ta.mShowUsers);
          this.a.mShowUsers.clear();
          ta.mHasUpload = true;
       }
       return;
    }
}
