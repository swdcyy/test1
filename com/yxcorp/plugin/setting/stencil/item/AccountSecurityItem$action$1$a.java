package com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem$action$1$a;
import n3d.a;
import com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem$action$1;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem;

public final class AccountSecurityItem$action$1$a implements a	// class@000906
{
    public final AccountSecurityItem$action$1 b;

    public void AccountSecurityItem$action$1$a(AccountSecurityItem$action$1 p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport2(AccountSecurityItem$action$1$a.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, AccountSecurityItem$action$1$a.class, "1")) {
          return;
       }
       this.b.this$0.p();
       PatchProxy.onMethodExit(AccountSecurityItem$action$1$a.class, "1");
       return;
    }
}
