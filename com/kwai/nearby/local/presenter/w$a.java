package com.kwai.nearby.local.presenter.w$a;
import qvb.q;
import com.kwai.nearby.local.presenter.w;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import tw5.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import fm7.d;
import lrb.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.nearby.model.WidgetState;

public class w$a implements q	// class@000fda
{
    public final w b;

    public void w$a(w p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       w$a uoa = w$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0 && this.b.p.c1()) {
          w$a tb = this.b;
          CityInfo uCityInfo = tb.D.d();
          Objects.requireNonNull(tb);
          CityInfo obj = PatchProxy.applyOneRefs(uCityInfo, tb, w.class, "16");
          if (obj != PatchProxyResult.class) {
             tb = obj.booleanValue();
          }else {
             uCityInfo = d.a(uCityInfo, tb.E);
             obj = a.h();
             tb = (obj != null)? TextUtils.equals(obj.mCityName, tb.F): true;
             if (!uCityInfo || !tb) {
                tb = true;
             }else {
                tb = false;
             }
          }
          if (tb) {
             tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(null, tb, w.class, "17")) {
                tb.E = tb.D.d();
                uCityInfo = a.h();
                if (uCityInfo != null) {
                   uCityInfo = uCityInfo.mCityName;
                   if (uCityInfo != null) {
                      tb.F = uCityInfo;
                   label_008e :
                      tb.s = false;
                      tb.v = 0;
                      tb.w = 0;
                      tb.y = WidgetState.ICON;
                      tb.S8();
                   }
                }
                tb.F = "";
                goto label_008e ;
             }
          }
       }
    label_009b :
       return;
    }
}
