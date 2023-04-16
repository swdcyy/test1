package com.yxcorp.gifshow.widget.AvatarListView;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.widget.AvatarListView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.facebook.drawee.generic.RoundingParams;
import lnc.a1;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import yb.b;
import android.content.res.Resources;
import xb.t$b;
import yb.a;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import java.util.List;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import qrd.l1;
import android.view.View;
import android.util.AttributeSet;

public final class AvatarListView extends FrameLayout	// class@0017ee
{
    public final List b;
    public static final AvatarListView$a c;

    static {
       AvatarListView.c = new AvatarListView$a(null);
    }
    public void AvatarListView(Context p0){
       a.p(p0, "context");
       super(p0);
       int i = 3;
       ArrayList uArrayList = new ArrayList(i);
       int i1 = 0;
       boolean b = true;
       while (i1 < i) {
          KwaiImageView kwaiImageVie = new KwaiImageView(this.getContext());
          RoundingParams roundingPara = new RoundingParams();
          roundingPara.q(b);
          roundingPara.k(a1.a(R.color.arg_RES_7f061c09));
          roundingPara.l((float)a1.e(2.00f));
          roundingPara.p((float)a1.e(2.00f));
          kwaiImageVie.setLayoutParams(new FrameLayout$LayoutParams(a1.e(24.00f), a1.e(24.00f), 0x800005));
          b uob = new b(kwaiImageVie.getResources());
          uob.r(R.drawable.detail_avatar_secret);
          uob.j(t$b.i);
          uob.z(roundingPara);
          kwaiImageVie.setHierarchy(uob.a());
          uArrayList.add(kwaiImageVie);
          i1 = i1 + 1;
       }
       this.b = uArrayList;
       for (int i2 = uArrayList.size() - b; i2 >= 0; i2--) {
          KwaiImageView kwaiImageVie1 = this.b.get(i2);
          ViewGroup$LayoutParams layoutParams = kwaiImageVie1.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          int i3 = this.b.size() - b;
          i3 = i3 - i2;
          int i4 = a1.e(16.00f) * i3;
          layoutParams.setMarginEnd(i4);
          kwaiImageVie1.setLayoutParams(layoutParams);
          this.addView(kwaiImageVie1);
       }
       return;
    }
    public void AvatarListView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       int i = 3;
       ArrayList uArrayList = new ArrayList(i);
       int i1 = 0;
       boolean b = true;
       while (i1 < i) {
          KwaiImageView kwaiImageVie = new KwaiImageView(this.getContext());
          RoundingParams roundingPara = new RoundingParams();
          roundingPara.q(b);
          roundingPara.k(a1.a(R.color.arg_RES_7f061c09));
          roundingPara.l((float)a1.e(2.00f));
          roundingPara.p((float)a1.e(2.00f));
          kwaiImageVie.setLayoutParams(new FrameLayout$LayoutParams(a1.e(24.00f), a1.e(24.00f), 0x800005));
          b uob = new b(kwaiImageVie.getResources());
          uob.r(R.drawable.detail_avatar_secret);
          uob.j(t$b.i);
          uob.z(roundingPara);
          kwaiImageVie.setHierarchy(uob.a());
          uArrayList.add(kwaiImageVie);
          i1 = i1 + 1;
       }
       this.b = uArrayList;
       for (int i2 = uArrayList.size() - b; i2 >= 0; i2--) {
          KwaiImageView kwaiImageVie1 = this.b.get(i2);
          ViewGroup$LayoutParams layoutParams = kwaiImageVie1.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          int i3 = this.b.size() - b;
          i3 = i3 - i2;
          int i4 = a1.e(16.00f) * i3;
          layoutParams.setMarginEnd(i4);
          kwaiImageVie1.setLayoutParams(layoutParams);
          this.addView(kwaiImageVie1);
       }
       return;
    }
}
