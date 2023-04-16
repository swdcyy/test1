package com.kuaishou.merchant.basic.widget.a;
import com.yxcorp.gifshow.widget.m;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import qt3.h;
import n3d.a;

public class a extends m	// class@0015fd
{
    public final View$OnClickListener c;
    public final boolean d;

    public void a(View$OnClickListener p0){
       super();
       this.c = p0;
       this.d = true;
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          LoginParams$a uoa = new LoginParams$a();
          uoa.d(a1.p(R.string.arg_RES_7f103078));
          d.a(-1712118428).x00(p0.getContext(), 0, uoa.a(), new h(this, p0));
       }else {
          this.c.onClick(p0);
       }
       return;
    }
}
