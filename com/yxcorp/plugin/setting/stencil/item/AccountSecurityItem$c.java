package com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem$c;
import erd.g;
import com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.login.AccountSecurityStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.framework.accountsecurity.d;

public final class AccountSecurityItem$c implements g	// class@000909
{
    public final AccountSecurityItem b;

    public void AccountSecurityItem$c(AccountSecurityItem p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AccountSecurityItem$c.class, "1")) {
       }else {
          AccountSecurityItem$c tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, AccountSecurityItem.class, "4")) {
             int i = (p0.mTrustDeviceOn != null)? 1: -1;
             d.i(i);
             tb.p();
          }
       }
       return;
    }
}
