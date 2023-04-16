package com.kuaishou.merchant.transaction.purchase.presenter.j$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.purchase.presenter.j;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.BottomTipInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.router.b;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kuaishou.merchant.transaction.purchase.presenter.i;
import erd.r;
import um4.q;
import erd.g;
import crd.b;

public class j$a extends m	// class@000981
{
    public final j c;

    public void j$a(j p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
          return;
       }
       j$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, j.class, "12") && tc.y != null) {
          tc.P8();
          j y = tc.y;
          if (y.mClickActionType == 2 && (!TextUtils.x(y.mClickRedirectLink) && tc.getActivity() != null)) {
             b.k(tc.getActivity(), tc.y.mClickRedirectLink);
          }else {
             y = tc.y;
             if (y.mClickActionType == 3 && (!TextUtils.x(y.mClickRedirectLink) && tc.getActivity() != null)) {
                BottomTipInfo mClickRedire = tc.y.mClickRedirectLink;
                Activity activity = tc.getActivity();
                j u = tc.u;
                if (!PatchProxy.applyVoidThreeRefs(mClickRedire, activity, u, tc, j.class, "13")) {
                   b.k(activity, mClickRedire);
                   if (u != null) {
                      tc.t = u.m().skip(1).filter(i.b).subscribe(new q(tc));
                   }
                }
             }else {
                y = tc.y;
                if (y.mClickActionType == 8) {
                   tc.R8(y.mClickRedirectLink);
                }
             }
          }
       }
       return;
    }
}
