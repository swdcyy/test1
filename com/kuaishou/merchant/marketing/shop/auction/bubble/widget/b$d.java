package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b$d;
import ekd.f$i;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import g94.b;
import com.kwai.robust.PatchProxyResult;
import androidx.transition.TransitionSet;
import androidx.transition.ChangeBounds;
import androidx.transition.Transition;
import androidx.transition.Fade;
import androidx.transition.Transition$f;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import androidx.transition.e;
import android.widget.ViewSwitcher;
import android.view.animation.Animation$AnimationListener;

public class b$d extends f$i	// class@001b94
{
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
          return;
       }
       b$d tb = this.b;
       Objects.requireNonNull(tb);
       b uob = b.class;
       if (!PatchProxy.applyVoid(null, tb, uob, "40")) {
          a uoa = new a();
          uoa.i(tb.U0);
          uoa.Q(tb.R.getId(), 4, a1.d(R.dimen.arg_RES_7f070316));
          uoa.Q(tb.R.getId(), 6, a1.d(R.dimen.arg_RES_7f070271));
          tb.R.setText(a1.p(R.string.arg_RES_7f10026c));
          uoa.l(tb.R.getId(), 4, R.id.auction_bid_tool, 3);
          uoa.l(tb.R.getId(), 6, R.id.auction_commodity_icon, 7);
          uoa.g(tb.Q.getId(), 6);
          uoa.g(tb.Q.getId(), 4);
          uoa.Q(tb.Q.getId(), 6, a1.d(R.dimen.arg_RES_7f07028d));
          tb.Q.setTextSize(16.00f);
          uoa.Q(tb.T.getId(), 4, a1.d(R.dimen.arg_RES_7f070316));
          uoa.l(tb.T.getId(), 4, R.id.auction_bid_tool, 3);
          uoa.l(tb.Q.getId(), 5, tb.R.getId(), 5);
          uoa.l(tb.Q.getId(), 6, tb.R.getId(), 7);
          uoa.Q(tb.T.getId(), 4, a1.d(R.dimen.arg_RES_7f070316));
          uoa.Q(tb.T.getId(), 7, a1.d(R.dimen.arg_RES_7f07034b));
          uoa.Q(tb.T.getId(), 6, a1.d(R.dimen.arg_RES_7f0702e3));
          uoa.l(tb.T.getId(), 4, R.id.auction_bid_tool, 3);
          uoa.l(tb.T.getId(), 7, R.id.auction_bidder_item_container, 6);
          uoa.l(tb.T.getId(), 6, tb.Q.getId(), 7);
          uoa.S(tb.T.getId(), 0x3f800000);
          tb.S.removeAllViews();
          b.a(tb.S, 12, 28);
          tb.S.setCurrentText(tb.n1);
          b u0 = tb.U0;
          TransitionSet transitionSe = PatchProxy.apply(null, tb, uob, "38");
          if (transitionSe != PatchProxyResult.class) {
          }else {
             transitionSe = new TransitionSet();
             transitionSe.l0(new ChangeBounds());
             transitionSe.l0(new Fade());
             transitionSe = transitionSe.j0(tb.C1);
             transitionSe.r0(200);
             transitionSe = transitionSe.s0(new LinearInterpolator());
          }
          e.b(u0, transitionSe);
          uoa.b(tb.U0);
       }
       this.b.X.getInAnimation().setAnimationListener(null);
       tb.r1 = false;
       return;
    }
}
