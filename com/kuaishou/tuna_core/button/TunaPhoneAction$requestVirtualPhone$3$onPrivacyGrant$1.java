package com.kuaishou.tuna_core.button.TunaPhoneAction$requestVirtualPhone$3$onPrivacyGrant$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import uz4.f;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.tuna_core.button.TunaPhoneAction;
import com.kwai.framework.model.tuna.button.PhoneInfoModel;
import com.kuaishou.tuna_core.button.TunaButtonMonitor;
import ma6.a;

public final class TunaPhoneAction$requestVirtualPhone$3$onPrivacyGrant$1 extends Lambda implements a	// class@0010ad
{
    public final Integer $asyncCheckPrivacyFlag;
    public final String $phoneNum;
    public final f this$0;

    public void TunaPhoneAction$requestVirtualPhone$3$onPrivacyGrant$1(f p0,String p1,Integer p2){
       this.this$0 = p0;
       this.$phoneNum = p1;
       this.$asyncCheckPrivacyFlag = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, TunaPhoneAction$requestVirtualPhone$3$onPrivacyGrant$1.class, "1")) {
          return;
       }
       f b = this.this$0.b;
       Objects.requireNonNull(b);
       TunaPhoneAction$requestVirtualPhone$3$onPrivacyGrant$1 tthis$0 = this.this$0;
       b.i("TunaPhoneAction", tthis$0.b.c, this.$phoneNum, 1, false, tthis$0.e);
       tthis$0 = this.this$0;
       tthis$0.b.f(this.$phoneNum, tthis$0.f, "requestedVirtualPhone");
       TunaButtonMonitor.b.b(this.this$0.b.d, this.$asyncCheckPrivacyFlag);
       return;
    }
}
