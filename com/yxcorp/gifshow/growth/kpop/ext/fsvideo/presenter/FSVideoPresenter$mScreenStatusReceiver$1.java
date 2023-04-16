package com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter$mScreenStatusReceiver$1;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cra.w;
import java.lang.StringBuilder;
import q87.c;

public final class FSVideoPresenter$mScreenStatusReceiver$1 extends BroadcastReceiver	// class@001406
{
    public final FSVideoPresenter a;

    public void FSVideoPresenter$mScreenStatusReceiver$1(FSVideoPresenter p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FSVideoPresenter$mScreenStatusReceiver$1.class, "1")) {
          return;
       }
       a.p(p1, "intent");
       String action = p1.getAction();
       Object[] objArray = new Object[0];
       w.C().w("FSVideoPresenter", "mScreenStatusReceiver action="+action, objArray);
       if (a.g("android.intent.action.SCREEN_OFF", action)) {
          this.a.R8("screenOff");
       }
       return;
    }
}
