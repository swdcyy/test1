package com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem$action$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ihc.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tkd.b;
import tkd.d;
import ou5.b;
import com.yxcorp.plugin.setting.stencil.item.AccountSecurityItem$action$1$a;
import n3d.a;

public final class AccountSecurityItem$action$1 extends Lambda implements l	// class@000907
{
    public final AccountSecurityItem this$0;

    public void AccountSecurityItem$action$1(AccountSecurityItem p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AccountSecurityItem$action$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       a c = this.this$0.c;
       if (!c instanceof GifshowActivity) {
          c = null;
       }
       if (c != null) {
          d.a(-1712118428).kn(c, 297, new AccountSecurityItem$action$1$a(this));
       }
       return;
    }
}
