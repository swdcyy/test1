package com.kuaishou.tuna_core.button.TunaPhoneAction$requestVirtualPhone$3$onPrivacyDenied$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import uz4.f;
import java.lang.Integer;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_core.button.TunaPhoneAction;
import ma6.a;
import com.kuaishou.tuna_core.button.TunaButtonMonitor;

public final class TunaPhoneAction$requestVirtualPhone$3$onPrivacyDenied$1 extends Lambda implements a	// class@0010ac
{
    public final Integer $asyncCheckPrivacyFlag;
    public final f this$0;

    public void TunaPhoneAction$requestVirtualPhone$3$onPrivacyDenied$1(f p0,Integer p1){
       this.this$0 = p0;
       this.$asyncCheckPrivacyFlag = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, TunaPhoneAction$requestVirtualPhone$3$onPrivacyDenied$1.class, "1")) {
          return;
       }
       TunaPhoneAction d = this.this$0.b.d;
       if (d != null) {
          d.mFailureReason = "CallDeniedPrivacyPolicy";
       }
       TunaButtonMonitor.b.b(d, this.$asyncCheckPrivacyFlag);
       return;
    }
}
