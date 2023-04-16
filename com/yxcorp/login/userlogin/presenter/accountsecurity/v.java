package com.yxcorp.login.userlogin.presenter.accountsecurity.v;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.social.startup.relation.model.AccountFreezeConfig;
import java.lang.reflect.Type;
import mw4.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import o1d.m;
import android.view.View;
import f2d.j0;
import android.view.View$OnClickListener;
import ekd.m1;

public class v extends PresenterV2	// class@001bbc
{
    public View p;

    public void v(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v.class, "2")) {
          return;
       }
       AccountFreezeConfig uAccountFree = a.a(AccountFreezeConfig.class);
       if (uAccountFree != null) {
          int b = TextUtils.x(uAccountFree.mUnFreezeUrl);
          if (!b) {
             m.b("ACCOUNT_FREEZE_OR_UNFREEZE", "account_unfreeze", objArray);
          }
          v tp = this.p;
          b = (b)? 8: 0;
          tp.setVisibility(b);
          this.p.setOnClickListener(new j0(this, uAccountFree));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a432b);
       return;
    }
}
