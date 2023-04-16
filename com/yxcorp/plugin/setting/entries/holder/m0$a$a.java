package com.yxcorp.plugin.setting.entries.holder.m0$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.m0$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import a17.g;
import com.yxcorp.plugin.setting.entries.holder.m0;
import com.yxcorp.plugin.setting.startup.MessagePrivacySettingsDialogConfig;
import java.lang.CharSequence;
import a17.c$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import agd.g;
import com.kwai.framework.model.user.QCurrentUser;
import kgd.l1;
import a17.b$b;
import lnc.a1;
import kgd.j1;
import a17.b$a;
import kgd.k1;
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

public class m0$a$a implements View$OnClickListener	// class@000874
{
    public final m0$a b;

    public void m0$a$a(m0$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0$a$a.class, "1")) {
          return;
       }
       m0$a$a tb = this.b;
       Objects.requireNonNull(tb);
       m0$a uoa = m0$a.class;
       if (!PatchProxy.applyVoid(null, tb, uoa, "4")) {
          ArrayList uArrayList = PatchProxy.apply(null, tb, uoa, "3");
          if (uArrayList != PatchProxyResult.class) {
          }else {
             uArrayList = new ArrayList();
             uArrayList.add(new g(tb.r.g.getAllTypeCopy()));
             uArrayList.add(new g(tb.r.g.getFollowTypeCopy()));
             uArrayList.add(new g(tb.r.g.getFriendsTypeCopy()));
          }
          c$a uoa1 = new c$a(tb.getActivity());
          uoa1.i0(new l1(tb));
          uoa1.f0(a1.p(R.string.arg_RES_7f1034dd));
          uoa1.n0(tb.r.g.getSubTitleCopy());
          uoa1.j0(uArrayList);
          uoa1.g0(R.string.cancel);
          uoa1.d0(new j1(tb));
          uoa1.d0(new k1(tb));
          uoa1.k0(R.layout.arg_RES_7f0d1648);
          uoa1.b0(new d(tb.r.a));
          uoa1.e0(new g(uoa1, tb.r.a, (QCurrentUser.me().getMessagePrivacy() - 1)));
          f.a(uoa1).Y(PopupInterface.a);
       }
       b.e(this.b.r.a, "WHO_CAN_MEASSAGE_ME", null);
       return;
    }
}
