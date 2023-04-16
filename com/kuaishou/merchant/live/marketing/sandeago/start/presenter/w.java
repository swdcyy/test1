package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.w;
import q64.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoPropertyItemModel;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoPropertyItemResponseModel;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.r$b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.kuaishou.merchant.live.marketing.sandeago.model.PropValue;
import com.google.gson.Gson;
import android.widget.TextView;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import o74.a;
import n64.d0;
import android.view.View;
import ekd.m1;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.w$a;
import com.yxcorp.gifshow.widget.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class w extends a	// class@001a9a
{
    public SandeagoPropertyItemModel u;
    public r$b v;
    public TextView w;

    public void w(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, w.class, "3")) {
          return;
       }
       super.E8();
       SandeagoPropertyItemResponseModel sandeagoProp = this.v.d(this.u.mPropId);
       if (sandeagoProp != null && !TextUtils.x(sandeagoProp.mPropValue)) {
          try{
             PropValue propValue = a.a.h(sandeagoProp.mPropValue, PropValue.class);
             if (propValue != null && !TextUtils.x(propValue.mPropValue)) {
                this.w.setText(propValue.mPropValue);
             }
          }catch(java.lang.Exception e0){
             a.s(MerchantLiveLogBiz.LIVE_SANDEAGO, "RadioSandeagoPropertyPresenter", "fail to parse filled property");
          }
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, w.class, "4")) {
          return;
       }
       this.w.setText("");
       return;
    }
    public void P8(PropValue p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "5")) {
          return;
       }
       this.w.setText(p0.mPropValue);
       this.v.c(d0.b(this.u, p0));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.w = m1.f(p0, 0x7f0a32fc);
       m1.b(p0, new w$a(this), R.id.property_content);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       super.j8();
       this.u = this.q8(SandeagoPropertyItemModel.class);
       this.v = this.r8("SANDEAGO_PROPERTY_UPDATE_SERVICE");
       return;
    }
}
