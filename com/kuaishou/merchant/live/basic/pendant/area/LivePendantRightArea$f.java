package com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$f;
import rq5.a;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import xm4.a;
import ekd.m1;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.kuaishou.merchant.live.basic.pendantgroup.view.MerchantViewFlipper;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$f$a;
import com.kuaishou.merchant.live.basic.pendantgroup.view.MerchantViewFlipper$a;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import java.lang.Boolean;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.s0;
import x14.b;
import java.util.List;
import java.util.ArrayList;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantPriority;

public final class LivePendantRightArea$f extends a	// class@0018a9
{
    public final LivePendantRightArea h;

    public void LivePendantRightArea$f(LivePendantRightArea p0){
       this.h = p0;
       super();
    }
    public View H(){
       Object[] objArray = null;
       LivePendantRightArea$f obj = PatchProxy.apply(objArray, this, LivePendantRightArea$f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       LivePendantRightArea t = obj.t;
       if (t == null) {
          obj.t = a.a(obj.B, 0x7f0d0c9b);
          obj = this.h;
          t = obj.t;
          if (t != null) {
             if (obj.v()) {
                View view = m1.f(t, R.id.linear_container);
                if (view != null) {
                   view.setBackground(objArray);
                   ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                   if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                      objArray = layoutParams;
                   }
                   if (objArray != null) {
                      objArray.setMarginEnd(a1.d(R.dimen.arg_RES_7f070334));
                   }
                   view.setLayoutParams(objArray);
                }
                float f = 0x3f6b851f;
                t.setPivotX((float)a1.d(R.dimen.arg_RES_7f070325));
                t.setScaleX(f);
                t.setScaleY(f);
             }
             this.h.u = m1.f(t, 0x7f0a25b6);
             LivePendantRightArea u = this.h.u;
             if (u != null) {
                u.setCurrentViewCallback(new LivePendantRightArea$f$a(this));
             }
             this.h.v = m1.f(t, 0x7f0a13e6);
          }
          obj = this.h;
          boolean b = (obj.t != null)? true: false;
          obj.f("init slide container", s0.k(r0.a("isSucceed", Boolean.valueOf(b))));
          t = this.h.t;
       }
       return t;
    }
    public List c(){
       Object obj = PatchProxy.apply(null, this, LivePendantRightArea$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList();
    }
    public LivePendantPriority f(){
       return LivePendantPriority.MERCHANT_PENDANT_SLIDE_CONTAINER;
    }
}
