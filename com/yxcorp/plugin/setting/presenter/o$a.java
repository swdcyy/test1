package com.yxcorp.plugin.setting.presenter.o$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.presenter.o;
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
import ghd.v;
import agd.c;
import tgd.a0;
import a17.b$b;
import java.util.List;
import tgd.z;
import a17.b$a;
import pgd.d;
import w07.l;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import a17.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import pgd.y;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;
import k2b.e0;
import sgd.b;

public class o$a implements View$OnClickListener	// class@0008e8
{
    public final o b;

    public void o$a(o p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "1")) {
          return;
       }
       o$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, o.class, "5")) {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(new g(a1.p(R.string.arg_RES_7f100207)));
          uArrayList.add(new g(a1.p(R.string.arg_RES_7f100fa7)));
          c$a uoa = new c$a(tb.getActivity());
          int i = v.a() ^ 0x01;
          tb.t = i;
          tb.u = new c(uoa, tb.s, i);
          uoa.i0(new a0(tb));
          uoa.f0(a1.p(R.string.arg_RES_7f10519f));
          uoa.j0(uArrayList);
          uoa.g0(R.string.cancel);
          uoa.d0(new z(tb));
          uoa.k0(R.layout.arg_RES_7f0d1648);
          uoa.b0(new d(tb.getActivity()));
          uoa.e0(tb.u);
          f.a(uoa).Y(PopupInterface.a);
       }
       b.b(this.b.s, "WHO_CAN_COMMENT_ME", Integer.valueOf(y.b(v.a())), (QCurrentUser.ME.isAllowPushMyCommentsToOther() ^ 0x01));
       return;
    }
}
