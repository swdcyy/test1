package com.yxcorp.plugin.setting.stencil.item.logout.a;
import android.content.DialogInterface$OnClickListener;
import java.util.List;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import android.content.DialogInterface;
import chd.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import com.kwai.feature.api.social.login.model.SwitchAccountModel;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import sgd.c;
import oe6.a;
import tkd.b;
import tkd.d;
import ou5.b;
import chd.a;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams;
import n3d.a;
import android.app.Activity;
import chd.b;
import pv5.c;
import chd.c;
import erd.g;

public final class a implements DialogInterface$OnClickListener	// class@000926
{
    public final List b;
    public final FragmentActivity c;

    public void a(List p0,FragmentActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(DialogInterface p0,int p1){
       a tb = this.b;
       a tc = this.c;
       Object obj = null;
       boolean b = true;
       if (PatchProxy.applyVoidOneRefs(tb, obj, d.class, "2")) {
       }else if(q.f(tb)){
          tb = new ArrayList();
          SwitchAccountModel switchAccoun = new SwitchAccountModel();
          switchAccoun.mUserId = QCurrentUser.ME.getId();
          tb.add(switchAccoun);
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 1644;
       ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
       ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[tb.size()];
       Iterator iterator = tb.iterator();
       int i1 = 0;
       while (iterator.hasNext()) {
          SwitchAccountModel switchAccoun1 = iterator.next();
          if (!TextUtils.x(switchAccoun1.mUserId)) {
             userPackageA[i1] = new ClientContent$UserPackage();
             userPackageA[i1].identity = switchAccoun1.mUserId;
             i1 = i1 + 1;
          }
       }
       uBatchUserPa.userPackage = userPackageA;
       uContentPack.batchUserPackage = uBatchUserPa;
       u1.u(b, uElementPack, uContentPack);
       int i = -1712118428;
       if (p1 == 0x7f100110) {
          c.a(b);
          d.a(i).x00(tc, 88, obj, new a(tc, a.f(), a.e()));
       }
       if (p1 == 0x7f104b71 && !tc.isFinishing()) {
          c.a(false);
          d.a(i).Vl(tc, new b(QCurrentUser.me().getId(), tc));
       }
       if (p1 == 0x7f1030bd || p1 == 0x7f104b6b) {
          d.a(0x6154d94e).uA(tc, new c(tc));
       }
       return;
    }
}
