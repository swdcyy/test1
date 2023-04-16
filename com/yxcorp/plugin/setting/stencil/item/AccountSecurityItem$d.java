package com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem$d;
import erd.g;
import com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class AccountSecurityItem$d implements g	// class@00090a
{
    public final AccountSecurityItem b;

    public void AccountSecurityItem$d(AccountSecurityItem p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AccountSecurityItem$d.class, "1")) {
       }else {
          this.b.p();
       }
       return;
    }
}
