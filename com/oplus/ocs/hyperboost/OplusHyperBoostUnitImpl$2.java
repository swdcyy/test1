package com.oplus.ocs.hyperboost.OplusHyperBoostUnitImpl$2;
import com.oplus.cosa.gamemanagersdk.IOplusHyperBoostNotifier$a;
import com.oplus.ocs.hyperboost.OplusHyperBoostUnitImpl;
import java.lang.String;
import java.lang.Object;
import java.lang.ref.WeakReference;
import com.oplus.ocs.hyperboost.HyperBoostCallback;

public final class OplusHyperBoostUnitImpl$2 extends IOplusHyperBoostNotifier$a	// class@000b32
{
    public final OplusHyperBoostUnitImpl a;

    public void OplusHyperBoostUnitImpl$2(OplusHyperBoostUnitImpl p0){
       this.a = p0;
       super();
    }
    public final void onSystemNotify(String p0){
       ("callback notify info-> ").concat(String.valueOf(p0));
       OplusHyperBoostUnitImpl mCallBacks = this.a.mCallBacks;
       if (mCallBacks != null && mCallBacks.get() != null) {
          this.a.mCallBacks.get().systemCallBack(p0);
       }
       return;
    }
}
