package com.yxcorp.gifshow.relation.pymk.rn.KSPymkBridge$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.pymk.rn.KSPymkBridge;
import com.kwai.framework.model.user.RecoUser;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import nbc.l;
import android.content.Context;
import com.kwai.framework.model.user.User;
import ou7.h$b;
import ou7.h;

public class KSPymkBridge$b implements Runnable	// class@001954
{
    public final RecoUser b;
    public final KSPymkBridge c;

    public void KSPymkBridge$b(KSPymkBridge p0,RecoUser p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSPymkBridge$b.class, "1")) {
          return;
       }
       h.b(this.c.getCurrentActivity(), this.b.mUser, new ClientContent$ContentPackage(), new l(this.b));
       return;
    }
}
