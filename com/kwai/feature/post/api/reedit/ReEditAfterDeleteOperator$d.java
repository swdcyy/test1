package com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$d;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.library.widget.popup.common.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator;
import java.util.Objects;
import androidx.cardview.widget.CardView;
import android.content.Context;
import o56.f;
import lnc.a1;
import com.yxcorp.utility.n;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import android.widget.TextView;
import android.widget.ImageView;
import zf6.k;
import android.graphics.drawable.Drawable;
import zf6.j;
import android.widget.FrameLayout;
import android.app.Activity;
import com.kwai.feature.post.api.util.g;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import l46.c;
import android.view.View$OnTouchListener;
import androidx.fragment.app.FragmentActivity;

public final class ReEditAfterDeleteOperator$d extends PopupInterface$g	// class@00142f
{
    public final GifshowActivity c;

    public void ReEditAfterDeleteOperator$d(GifshowActivity p0,int p1){
       this.c = p0;
       super(p1);
    }
    public void c(c p0,View p1){
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReEditAfterDeleteOperator$d.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       a.p(p1, "view");
       ReEditAfterDeleteOperator d = ReEditAfterDeleteOperator.d;
       ReEditAfterDeleteOperator$d tc = this.c;
       Objects.requireNonNull(d);
       if (!PatchProxy.applyVoidThreeRefs(p1, tc, p0, d, ReEditAfterDeleteOperator.class, "5") && p1 instanceof CardView) {
          int i = 0;
          int i1 = (f.b(tc))? a1.d(R.dimen.arg_RES_7f070bf1): n.q(tc) + i;
          Object[] objArray = new Object[i];
          p3.D().w("ReEditAfterDeleteOperator", "navigationBarHeight : "+i1, objArray);
          view = p1.findViewById(R.id.title);
          a.o(view, "rootView.findViewById\(R.id.title\)");
          View view1 = p1.findViewById(R.id.positive);
          a.o(view1, "rootView.findViewById\(R.id.positive\)");
          View view2 = p1.findViewById(R.id.delete_success_img);
          a.o(view2, "rootView.findViewById\(R.id.delete_success_img\)");
          int i2 = 1;
          int i3 = 0x7f0620c7;
          if (k.d() ^ i2) {
             p1.setCardBackgroundColor(a1.a(R.color.arg_RES_7f060748));
             view.setTextColor(a1.a(i3));
             view1.setTextColor(a1.a(R.color.arg_RES_7f060220));
             view2.setImageDrawable(j.j(R.drawable.arg_RES_7f08051d, 2));
          }else {
             p1.setCardBackgroundColor(a1.a(i3));
             view.setTextColor(a1.a(R.color.arg_RES_7f0619f2));
             view1.setTextColor(a1.a(R.color.arg_RES_7f06021c));
             view2.setImageDrawable(j.j(R.drawable.arg_RES_7f08051d, i2));
          }
          FrameLayout uFrameLayout = p1;
          uFrameLayout.setAlpha(0x3f75c28f);
          if (g.b(tc) - 0x3f100000 >= 0) {
             uFrameLayout.h(a1.d(R.dimen.arg_RES_7f070295), i, a1.d(R.dimen.arg_RES_7f070295), i);
          }
          ViewGroup$LayoutParams layoutParams = uFrameLayout.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
          layoutParams.bottomMargin = i1 + a1.d(0x7f07034b);
          p1.setOnTouchListener(new c(p0, p1));
       }
       if (f.b(this.c)) {
          d.j(this.c, p0);
       }
       return;
    }
}
