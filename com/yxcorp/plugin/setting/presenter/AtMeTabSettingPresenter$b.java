package com.yxcorp.plugin.setting.presenter.AtMeTabSettingPresenter$b;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.presenter.AtMeTabSettingPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.ArrayList;
import a17.g;
import lnc.a1;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import a17.c$a;
import android.app.Activity;
import agd.b;
import com.kwai.framework.model.user.QCurrentUser;
import tgd.e;
import a17.b$b;
import java.util.List;
import pgd.d;
import w07.l;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import a17.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import k2b.e0;
import sgd.b;

public final class AtMeTabSettingPresenter$b implements View$OnClickListener	// class@0008d0
{
    public final AtMeTabSettingPresenter b;

    public void AtMeTabSettingPresenter$b(AtMeTabSettingPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       AtMeTabSettingPresenter p;
       AtMeTabSettingPresenter y;
       if (PatchProxy.applyVoidOneRefs(p0, this, AtMeTabSettingPresenter$b.class, "1")) {
          return;
       }
       AtMeTabSettingPresenter$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, AtMeTabSettingPresenter.class, "6")) {
          ArrayList uArrayList = new ArrayList();
          String str = a1.p(R.string.arg_RES_7f1001a8);
          a.o(str, "CommonUtil.string\(R.string.all_people_can_see\)");
          uArrayList.add(new g(str));
          str = a1.p(R.string.arg_RES_7f1046f8);
          a.o(str, "CommonUtil.string\(R.string.setting_open_to_friend\)");
          uArrayList.add(new g(str));
          str = a1.p(R.string.arg_RES_7f1036d0);
          a.o(str, "CommonUtil.string\(R.string.more_private_visible\)");
          uArrayList.add(new g(str));
          AtMeTabSettingPresenter p1 = tb.p;
          if (p1 == null) {
             a.S("mActivity");
          }
          c$a uoa = new c$a(p1);
          uoa.f0(a1.p(R.string.arg_RES_7f10024a));
          AtMeTabSettingPresenter p2 = tb.p;
          if (p2 == null) {
             a.S("mActivity");
          }
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          int mentionedMeW = mE.getMentionedMeWorksSetting();
          if (mentionedMeW == tb.v) {
             y = tb.y;
          }else if(mentionedMeW == tb.w){
             y = tb.A;
          }else if(mentionedMeW == tb.x){
             y = tb.z;
          }else {
             y = tb.y;
          }
          b uob = new b(uoa, p2, y);
          uoa.i0(new e(tb));
          uoa.j0(uArrayList);
          uoa.g0(R.string.cancel);
          uoa.k0(R.layout.arg_RES_7f0d1648);
          p = tb.p;
          if (p == null) {
             a.S("mActivity");
          }
          uoa.b0(new d(p));
          uoa.e0(uob);
          f.a(uoa).Y(PopupInterface.a);
       }
       p = this.b.p;
       if (p == null) {
          a.S("mActivity");
       }
       b.f(p, this.b.u);
       return;
    }
}
