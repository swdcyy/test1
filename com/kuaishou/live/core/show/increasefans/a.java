package com.kuaishou.live.core.show.increasefans.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.increasefans.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import ha2.a;
import com.kuaishou.live.core.show.increasefans.j;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import lp3.e;
import kq3.a;
import com.kuaishou.live.core.show.increasefans.f;
import com.kuaishou.live.core.show.increasefans.g;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import android.content.DialogInterface$OnDismissListener;

public final class a implements View$OnClickListener	// class@000c60
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       KwaiDialogFragment kwaiDialogFr;
       a tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       String str = "6";
       if (PatchProxy.applyVoid(objArray, tb, b.class, str)) {
       }else {
          x.E(tb.q);
          Activity activity = tb.getActivity();
          c childFragmen = tb.p.Z2.b().getChildFragmentManager();
          a0 z2 = tb.p.Z2;
          a uoa = new a(tb);
          j oj = j.class;
          int i = 2;
          if (PatchProxy.isSupport(oj)) {
             Object[] objArray1 = new Object[]{activity,childFragmen,z2,uoa,Integer.valueOf(0),Boolean.FALSE,Integer.valueOf(i)};
             kwaiDialogFr = PatchProxy.apply(objArray1, objArray, oj, str);
             if (kwaiDialogFr != PatchProxyResult.class) {
             label_008b :
                tb.q = kwaiDialogFr;
             }
          }
          if (z2 != null) {
             objArray = z2.t5();
          }
          kwaiDialogFr = j.g(activity, a.d(activity, childFragmen, objArray), j.d(j.c(), i, k0.b(z2, f.a, g.a).orNull()), childFragmen, uoa, 0, false);
          goto label_008b ;
       }
       return;
    }
}
