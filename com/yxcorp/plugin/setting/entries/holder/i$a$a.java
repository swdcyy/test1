package com.yxcorp.plugin.setting.entries.holder.i$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.i$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.setting.entries.holder.i;
import kgd.s;
import com.yxcorp.plugin.setting.utils.b;
import java.util.ArrayList;
import com.kwai.framework.model.user.QCurrentUser;
import a17.g;
import lnc.a1;
import java.lang.CharSequence;
import java.lang.Math;
import a17.c$a;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c$b;
import agd.a;
import ghd.f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import qyb.a;
import a17.b$b;
import java.util.List;
import ghd.e;
import a17.b$a;
import pgd.d;
import w07.l;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import a17.f;
import ghd.q;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import k2b.e0;
import java.lang.Boolean;
import sgd.b;

public class i$a$a implements View$OnClickListener	// class@000860
{
    public final i$a b;

    public void i$a$a(i$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a$a.class, "1")) {
          return;
       }
       i a = this.b.r.a;
       s os = new s(this);
       if (!PatchProxy.applyVoidTwoRefs(a, os, null, b.class, "2")) {
          ArrayList uArrayList = new ArrayList();
          int followListVi = QCurrentUser.me().getFollowListVisibilityOption();
          int i = 3;
          int i1 = 1;
          int i2 = 2;
          if (followListVi != i1) {
             if (followListVi != i2) {
                i = (followListVi != i)? 4: 2;
             }else {
                i = 1;
             }
          }
          i = i - i1;
          uArrayList.add(new g(a1.p(R.string.arg_RES_7f104710)));
          if (i == i1) {
             uArrayList.add(new g(a1.p(R.string.arg_RES_7f1010b6)));
          }
          uArrayList.add(new g(a1.p(R.string.arg_RES_7f1004b3)));
          followListVi = Math.min(i1, i);
          c$a uoa = new c$a(a);
          uoa.n();
          uoa.i0(new f(i, a, followListVi, os));
          uoa.f0(a1.p(R.string.arg_RES_7f1046da));
          uoa.j0(uArrayList);
          uoa.d0(new e(followListVi, a));
          uoa.g0(R.string.cancel);
          uoa.k0(R.layout.arg_RES_7f0d1648);
          uoa.b0(new d(a));
          uoa.e0(new a(uoa, a, followListVi));
          f.a(uoa).Y(new q(i, a));
       }
       b.e(this.b.r.a, "FOLLOWER_AND_FOLLOWING", null);
       return;
    }
}
