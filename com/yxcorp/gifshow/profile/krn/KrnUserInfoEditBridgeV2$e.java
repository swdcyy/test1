package com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2$e;
import erd.g;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.ref.WeakReference;
import cx5.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2;

public class KrnUserInfoEditBridgeV2$e implements g	// class@001365
{
    public WeakReference b;

    public void KrnUserInfoEditBridgeV2$e(ReactContext p0){
       super();
       this.b = new WeakReference(p0);
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnUserInfoEditBridgeV2$e.class, "1")) {
       }else {
          KrnUserInfoEditBridgeV2$e tb = this.b;
          if (tb != null && tb.get() != null) {
             KrnUserInfoEditBridgeV2.handleUserInfoChangedEvent(this.b.get(), p0);
          }
       }
       return;
    }
}
