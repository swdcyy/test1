package com.kuaishou.live.gzone.treasurebox.presenter.i;
import tq5.a;
import com.kuaishou.live.gzone.treasurebox.presenter.l;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import f37.o0;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel;
import r53.b;
import mrd.a;
import o53.b;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import p53.i0;
import u07.u;
import p53.j0;
import w07.i;
import w07.l;
import w77.h;
import lnc.a1;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import p53.l0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class i implements a	// class@001c89
{
    public final l a;

    public void i(l p0){
       this.a = p0;
    }
    public final int onBackPressed(){
       i ta = this.a;
       Objects.requireNonNull(ta);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SharedPreferences obj = PatchProxy.apply(null, ta, l.class, "5");
       boolean b = false;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = a.a;
          String str = "user";
          if (!TextUtils.equals(obj.getString(b.d(str)+"live_gzone_treasure_task_leave_dialog_time", ""), o0.g()) && !obj.getBoolean(b.d(str)+"live_gzone_hide_treasure_task_leave_dialog", b)) {
             b uob = ta.A.p().s.i();
             uob = (uob != null)? uob.b: null;
             if (uob != null && uob.mTaskStatus == 2) {
                t$a uoa = new t$a(ta.getActivity());
                uoa.S0(R.string.arg_RES_7f10247e);
                uoa.Q0(R.string.arg_RES_7f10247d);
                uoa.W0(R.string.arg_RES_7f102482);
                uoa.z0(uob.mLeaveTips);
                uoa.u0(new i0(ta));
                uoa.t0(new j0(ta));
                Object[] obj1 = PatchProxy.applyOneRefs(uoa, null, o0.class, "21");
                if (obj1 != patchProxyRe) {
                   uoa = obj1;
                }else {
                   uoa.a0(new i());
                   uoa.a0(new h(a1.p(R.string.arg_RES_7f101bcf)));
                   uoa.L(new PopupInterface$g(R.layout.arg_RES_7f0d0bf4));
                }
                uoa.Y(new l0(ta));
                b = 1;
             }
          }
       }
       return b;
    }
}
