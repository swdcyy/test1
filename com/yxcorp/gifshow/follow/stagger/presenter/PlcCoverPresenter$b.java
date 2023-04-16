package com.yxcorp.gifshow.follow.stagger.presenter.PlcCoverPresenter$b;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.PlcCoverPresenter;
import android.view.ViewGroup;
import java.lang.Object;
import u06.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import u06.e;
import android.view.View;
import com.yxcorp.gifshow.follow.stagger.presenter.PlcCoverPresenter$MaskView;
import android.content.Context;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import qrd.l1;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout$LayoutParams;
import v06.a;
import v06.b;

public final class PlcCoverPresenter$b implements g	// class@001204
{
    public final PlcCoverPresenter b;
    public final ViewGroup c;

    public void PlcCoverPresenter$b(PlcCoverPresenter p0,ViewGroup p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcCoverPresenter$b.class, "1")) {
       }else if(p0 != null && p0.isValid()){
          List list = p0.a();
          AttributeSet uAttributeSe = null;
          e uoe = (list != null)? list.get(0): uAttributeSe;
          if (uoe != null) {
             View view = uoe.a();
             if (view != null) {
                Context context = this.c.getContext();
                a.o(context, "coverViewGroup.context");
                this.b.u = new PlcCoverPresenter$MaskView(context, uAttributeSe);
                PlcCoverPresenter$b tb = this.b;
                tb.s = view;
                PlcCoverPresenter u = tb.u;
                if (u != null) {
                   FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
                   layoutParams.gravity = 80;
                   layoutParams.leftMargin = a1.d(0x7f07025d);
                   layoutParams.rightMargin = a1.d(0x7f07025d);
                   layoutParams.bottomMargin = a1.d(this.b.P8());
                   u.addView(view, layoutParams);
                }
                RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(-1, a1.d(0x7f070254));
                layoutParams1.addRule(12);
                this.c.addView(this.b.u, layoutParams1);
                p0 = p0.e();
                if (p0 != null) {
                   p0.onShow();
                }
             }
          }
       }
    label_009c :
       return;
    }
}
