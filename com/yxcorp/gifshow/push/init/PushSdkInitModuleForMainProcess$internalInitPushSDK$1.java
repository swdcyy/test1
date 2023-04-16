package com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$internalInitPushSDK$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.android.dispatcher.PushConfig;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$internalInitPushSDK$1$a;
import erd.g;
import crd.b;
import eda.n;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$internalInitPushSDK$1$b;
import c97.d;
import kotlin.jvm.internal.a;

public final class PushSdkInitModuleForMainProcess$internalInitPushSDK$1 extends Lambda implements a	// class@001651
{
    public final PushSdkInitModuleForMainProcess this$0;

    public void PushSdkInitModuleForMainProcess$internalInitPushSDK$1(PushSdkInitModuleForMainProcess p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, PushSdkInitModuleForMainProcess$internalInitPushSDK$1.class, "1")) {
          return;
       }
       PushSdkInitModuleForMainProcess$a s = PushSdkInitModuleForMainProcess.s;
       Objects.requireNonNull(s);
       if (PushSdkInitModuleForMainProcess.r) {
          return;
       }
       Objects.requireNonNull(s);
       PushSdkInitModuleForMainProcess.r = true;
       this.this$0.n0(this.this$0.l0());
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       f.g(l.class, mAIN).subscribe(new PushSdkInitModuleForMainProcess$internalInitPushSDK$1$a(this));
       f.g(n.class, mAIN).subscribe(new PushSdkInitModuleForMainProcess$internalInitPushSDK$1$b(this));
       return;
    }
}
