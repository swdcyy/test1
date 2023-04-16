package com.kuaishou.merchant.marketing.platform.skyfallcoupon.e$d;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.e$e;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tkd.b;
import tkd.d;
import fs3.a;
import com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter;
import fq5.b;
import android.graphics.Rect;
import m84.a;

public class e$d implements e$e	// class@001b41
{
    public final e a;

    public void e$d(e p0){
       this.a = p0;
       super();
    }
    public float[] a(){
       Object[] objArray = null;
       Rect obj = PatchProxy.apply(objArray, this, e$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.getActivity() != null) {
          obj = d.a(-1432266865).Q20(this.a.getActivity(), this.a.u.getLiveStreamId(), objArray, "CouponCenterPendant");
          if (obj != null) {
             Rect left = obj.left;
             if (left >= null) {
                obj = obj.top;
                if (obj >= null) {
                   objArray = new float[]{(float)left,(float)obj};
                }
             }
          }
       }
       return objArray;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e$d.class, "3")) {
          return;
       }
       this.a.k9();
       return;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$d.class, "2")) {
          return;
       }
       this.a.o9(p0);
       return;
    }
}
