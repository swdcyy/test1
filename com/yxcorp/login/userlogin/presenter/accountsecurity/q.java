package com.yxcorp.login.userlogin.presenter.accountsecurity.q;
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
import android.view.View;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import o1d.m;
import f2d.a0;
import android.view.View$OnClickListener;
import ekd.m1;

public class q extends PresenterV2	// class@001bb6
{
    public View p;

    public void q(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q.class, "2")) {
          return;
       }
       AccountFreezeConfig uAccountFree = a.a(AccountFreezeConfig.class);
       if (uAccountFree != null) {
          if (TextUtils.x(uAccountFree.mFreezeUrl)) {
             this.p.setVisibility(8);
          }else {
             this.p.setVisibility(0);
             m.b("ACCOUNT_FREEZE_OR_UNFREEZE", "account_freeze", objArray);
          }
          this.p.setOnClickListener(new a0(this, uAccountFree));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a102a);
       return;
    }
}
