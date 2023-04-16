package com.oplus.ocs.hyperboost.HyperBoostUnitImpl$2;
import com.coloros.gamespace.gamesdk.IHyperBoostNotifier$a;
import com.oplus.ocs.hyperboost.HyperBoostUnitImpl;
import java.lang.String;
import java.lang.Object;
import java.lang.ref.WeakReference;
import com.oplus.ocs.hyperboost.HyperBoostCallback;

public final class HyperBoostUnitImpl$2 extends IHyperBoostNotifier$a	// class@000b2d
{
    public final HyperBoostUnitImpl a;

    public void HyperBoostUnitImpl$2(HyperBoostUnitImpl p0){
       this.a = p0;
       super();
    }
    public final void onSystemNotify(String p0){
       ("callback notify info-> ").concat(String.valueOf(p0));
       HyperBoostUnitImpl mCallBacks = this.a.mCallBacks;
       if (mCallBacks != null && mCallBacks.get() != null) {
          this.a.mCallBacks.get().systemCallBack(p0);
       }
       return;
    }
}
