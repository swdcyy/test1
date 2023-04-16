package com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem$b;
import erd.g;
import com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem;
import java.lang.Object;
import zca.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.accountsecurity.d;

public final class AccountSecurityItem$b implements g	// class@000908
{
    public final AccountSecurityItem b;

    public void AccountSecurityItem$b(AccountSecurityItem p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AccountSecurityItem$b.class, "1")) {
       }else if(p0 != null){
          p0 = p0.b;
       }else {
          p0 = null;
       }
       if (!TextUtils.x(p0)) {
          d.i(1);
       }
       this.b.p();
       return;
    }
}
