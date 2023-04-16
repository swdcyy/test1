package com.yxcorp.plugin.setting.presenter.m$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.presenter.m;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.ArrayList;
import a17.g;
import lnc.a1;
import java.lang.CharSequence;
import a17.c$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.user.QCurrentUser;
import agd.j;
import com.yxcorp.plugin.setting.presenter.k;
import a17.b$b;
import java.util.List;
import tgd.v;
import a17.b$a;
import pgd.d;
import w07.l;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import a17.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import k2b.e0;
import pgd.y;
import java.lang.Integer;
import sgd.b;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public class m$a implements View$OnClickListener	// class@0008e4
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       m$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, m.class, "6")) {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(new g(a1.p(R.string.arg_RES_7f1001a8)));
          uArrayList.add(new g(a1.p(R.string.arg_RES_7f1010b6)));
          uArrayList.add(new g(a1.p(R.string.arg_RES_7f1004b3)));
          uArrayList.add(new g(a1.p(R.string.arg_RES_7f1003c5)));
          c$a uoa = new c$a(tb.getActivity());
          tb.r = QCurrentUser.ME.getNewsPrivate();
          tb.y = new j(uoa, tb.getActivity(), tb.R8(tb.r));
          uoa.i0(new k(tb));
          uoa.f0(a1.p(R.string.arg_RES_7f1051a1));
          uoa.l0(R.string.arg_RES_7f1037f6);
          uoa.j0(uArrayList);
          uoa.g0(R.string.cancel);
          uoa.d0(new v(tb));
          uoa.k0(R.layout.arg_RES_7f0d1648);
          uoa.b0(new d(tb.getActivity()));
          uoa.e0(tb.y);
          f.a(uoa).Y(PopupInterface.a);
       }
       String str = "WHO_CAN_SEE_MYNEWS";
       e0 activity = this.b.getActivity();
       Integer integer = Integer.valueOf(y.c(QCurrentUser.ME.getNewsPrivate()));
       int i = QCurrentUser.ME.isAllowPushMyCommentsToOther() ^ 0x01;
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidFourRefs(activity, str, integer, Boolean.valueOf(i), null, b.class, "11")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SECOND_SETTINGS_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("button_name", str);
          uElementPack.params = oi3.e();
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page2 = "NEWS_PRIVACY_SETTING";
          oi3 = i3.f();
          oi3.c("status", integer);
          oi3.a("gift_send_status", Boolean.valueOf(i));
          urlPackage.params = oi3.e();
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          uClickEvent.urlPackage = urlPackage;
          uClickEvent.elementPackage = uElementPack;
          b.a(0x4b316083).B(null, uClickEvent, activity);
       }
       return;
    }
}
