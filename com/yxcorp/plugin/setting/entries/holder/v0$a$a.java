package com.yxcorp.plugin.setting.entries.holder.v0$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.v0$a;
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
import agd.h;
import com.yxcorp.plugin.setting.entries.holder.v0;
import kgd.c2;
import a17.b$b;
import java.util.List;
import kgd.b2;
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
import java.lang.Boolean;
import sgd.b;

public class v0$a$a implements View$OnClickListener	// class@000898
{
    public final v0$a b;

    public void v0$a$a(v0$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v0$a$a.class, "1")) {
          return;
       }
       v0$a$a tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = PatchProxy.applyVoid(null, tb, v0$a.class, "3");
       if (!b) {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(new g(a1.p(R.string.arg_RES_7f105090)));
          uArrayList.add(new g(a1.p(R.string.arg_RES_7f1004b3)));
          c$a uoa = new c$a(tb.getActivity());
          v0$a r = tb.r;
          r.f = new h(uoa, r.a, QCurrentUser.ME.isNotPublicProfileCollect());
          uoa.i0(new c2(tb));
          uoa.f0(a1.p(R.string.arg_RES_7f1001c3));
          uoa.j0(uArrayList);
          uoa.g0(R.string.cancel);
          uoa.d0(new b2(tb));
          uoa.k0(R.layout.arg_RES_7f0d1648);
          d uod = new d(tb.r.a);
          uoa.b0(uod);
          uoa.e0(tb.r.f);
          b = PopupInterface.a;
          f.a(uoa).Y(b);
       }
       b.e(this.b.r.a, "WHO_CAN_VIEW_MYCOLLECT", null);
       return;
    }
}
