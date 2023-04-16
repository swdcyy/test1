package com.kuaishou.live.gzone.treasurebox.presenter.q;
import erd.g;
import com.kuaishou.live.gzone.treasurebox.presenter.r;
import java.lang.Object;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel$BoxListTipsStatus;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kuaishou.live.gzone.treasurebox.presenter.r$g;
import java.lang.Enum;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import p53.i1;
import android.view.View$OnClickListener;
import m53.b;
import p53.f1;

public final class q implements g	// class@001c91
{
    public final r b;

    public void q(r p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       KwaiEmptyStateView$a uoa;
       q tb = this.b;
       Objects.requireNonNull(tb);
       r or = r.class;
       Object[] objArray = null;
       int i = 1;
       if (PatchProxy.applyVoid(objArray, tb, or, "26")) {
       }else {
          b[] uobArray = new b[]{b.d,b.g};
          c.d(tb.F, uobArray);
          r o = tb.O;
          if (o != null) {
             c.c(tb.F, o);
          }
       }
       int i1 = r$g.a[p0.ordinal()];
       if (i1 != i) {
          if (i1 != 2) {
             if (i1 != 3) {
                if (i1 == 4 && !PatchProxy.applyVoid(objArray, tb, or, "18")) {
                   tb.E.setVisibility(8);
                   tb.D.setVisibility(8);
                   if (tb.O == null && tb.getContext() != null) {
                      tb.O = new KwaiEmptyStateView(tb.getContext());
                      i1 = KwaiEmptyStateView.e();
                      i1.b();
                      i1.h(R.string.arg_RES_7f102494);
                      i1.a(tb.O);
                   }
                   c.i(tb.F, tb.O);
                }
             }else if(PatchProxy.applyVoid(objArray, tb, or, "13")){
                if (!PatchProxy.applyVoid(objArray, tb, or, "14") && tb.q == null) {
                   tb.K.setVisibility(8);
                }
                uoa = KwaiEmptyStateView.e();
                uoa.b();
                uoa.k(R.drawable.arg_RES_7f080609);
                uoa.j(2);
                uoa.h(R.string.arg_RES_7f1030ae);
                uoa.e(R.string.arg_RES_7f103059);
                uoa.p(new i1(tb));
                uoa.a(c.h(tb.F, b.g));
             }
          }else if(PatchProxy.applyVoid(objArray, tb, or, "17")){
             i1 = tb.R;
             if (i1 == null || i1.D()) {
                uoa = KwaiEmptyStateView.e();
                uoa.b();
                uoa.p(new f1(tb));
                uoa.a(c.h(tb.F, b.g));
             }
          }
       }else if(PatchProxy.applyVoid(objArray, tb, or, "16")){
          i1 = tb.R;
          if (i1 == null || i1.D()) {
             c.h(tb.F, b.d);
          }
       }
       return;
    }
}
