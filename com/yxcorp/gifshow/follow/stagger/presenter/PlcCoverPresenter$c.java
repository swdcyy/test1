package com.yxcorp.gifshow.follow.stagger.presenter.PlcCoverPresenter$c;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.PlcCoverPresenter;
import android.view.ViewGroup;
import java.lang.Object;
import u06.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u06.a;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;
import u06.e;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import qrd.l1;
import android.view.ViewGroup$LayoutParams;

public final class PlcCoverPresenter$c implements g	// class@001205
{
    public final PlcCoverPresenter b;
    public final ViewGroup c;

    public void PlcCoverPresenter$c(PlcCoverPresenter p0,ViewGroup p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcCoverPresenter$c.class, "1")) {
       }else if(p0 != null){
          a uoa = p0.a();
          if (uoa != null) {
             if (uoa.isValid()) {
                if (p0.b()) {
                   PlcCoverPresenter$c tb = this.b;
                   PlcCoverPresenter s = tb.s;
                   if (s != null) {
                      PlcCoverPresenter u = tb.u;
                      if (u != null) {
                         u.removeView(s);
                      }
                   }
                }
                if (p0.c()) {
                   p0 = uoa.a();
                   p0 = (p0 != null)? p0.get(0): null;
                   if (p0 != null) {
                      p0 = p0.a();
                      if (p0 != null) {
                         PlcCoverPresenter$c tb1 = this.b;
                         tb1.s = p0;
                         PlcCoverPresenter u1 = tb1.u;
                         if (u1 != null) {
                            FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
                            layoutParams.gravity = 80;
                            layoutParams.leftMargin = a1.d(0x7f07025d);
                            layoutParams.rightMargin = a1.d(0x7f07025d);
                            layoutParams.bottomMargin = a1.d(this.b.P8());
                            u1.addView(p0, layoutParams);
                         }
                      }
                   }
                }
             }else if(uoa.b() != 999){
                this.c.removeView(this.b.u);
             }
          }
       }
       return;
    }
}
