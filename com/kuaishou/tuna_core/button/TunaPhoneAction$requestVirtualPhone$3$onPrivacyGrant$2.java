package com.kuaishou.tuna_core.button.TunaPhoneAction$requestVirtualPhone$3$onPrivacyGrant$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import uz4.f;
import java.lang.Integer;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.tuna_core.button.TunaPhoneAction;
import com.kwai.framework.model.tuna.button.PhoneInfoModel$VirtualPhone;
import com.kwai.framework.model.tuna.button.PhoneInfoModel;
import com.kuaishou.tuna_core.button.TunaButtonMonitor;
import ma6.a;

public final class TunaPhoneAction$requestVirtualPhone$3$onPrivacyGrant$2 extends Lambda implements a	// class@0010ae
{
    public final Integer $asyncCheckPrivacyFlag;
    public final f this$0;

    public void TunaPhoneAction$requestVirtualPhone$3$onPrivacyGrant$2(f p0,Integer p1){
       this.this$0 = p0;
       this.$asyncCheckPrivacyFlag = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, TunaPhoneAction$requestVirtualPhone$3$onPrivacyGrant$2.class, "1")) {
          return;
       }
       TunaPhoneAction$requestVirtualPhone$3$onPrivacyGrant$2 tthis$0 = this.this$0;
       f b = tthis$0.b;
       Objects.requireNonNull(b);
       tthis$0 = this.this$0;
       b.d(tthis$0.e, "TunaPhoneAction", tthis$0.b.c, 1, tthis$0.g.mBackupPhone, tthis$0.f);
       TunaButtonMonitor.b.b(this.this$0.b.d, this.$asyncCheckPrivacyFlag);
       return;
    }
}
