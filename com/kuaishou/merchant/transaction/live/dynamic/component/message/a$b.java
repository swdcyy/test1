package com.kuaishou.merchant.transaction.live.dynamic.component.message.a$b;
import android.os.Handler;
import com.kuaishou.merchant.transaction.live.dynamic.component.message.a;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.content.Context;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation;

public class a$b extends Handler	// class@000799
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       super.handleMessage(p0);
       if (p0.what == null) {
          this.a.m8().getLocationOnScreen(this.a.w);
          a$b ta = this.a;
          int i = (n.j(this.a.getActivity()) - ta.w[1]) - ta.m8().getHeight();
          int i1 = n.n(this.a.getActivity());
          a u = this.a.u;
          if (u == null) {
             a.g(MerchantTransactionLogBiz.PURCHASE_PANEL_V2, "MessagePresenter", "getRecyclerView err");
             return;
          }else {
             int height = u.getHeight();
             if ((i - i1) < 0) {
                TranslateAnimation translateAni = new TranslateAnimation(1, 0, 1, 0, 1, 0, 1, (float)(- (((double)(i1 - i) * 0x3ff0000000000000) / (double)height)));
                i.v = i1;
                this.a.v.setDuration(100);
                this.a.v.setFillAfter(1);
                a$b ta1 = this.a;
                ta1.u.startAnimation(ta1.v);
             }
          }
       }
       return;
    }
}
