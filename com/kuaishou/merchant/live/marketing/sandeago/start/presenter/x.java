package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.x;
import q64.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoPropertyItemModel;
import fg6.a;
import java.util.Map;
import com.google.gson.JsonElement;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoPropertyItemModel$InputFormat;
import com.google.gson.Gson;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.x$a;
import android.text.TextWatcher;
import android.widget.EditText;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoPropertyItemResponseModel;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.r$b;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.live.marketing.sandeago.model.PropValue;
import android.view.View;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class x extends a	// class@001a9c
{
    public SandeagoPropertyItemModel u;
    public r$b v;
    public EditText w;
    public TextView x;
    public TextWatcher y;
    public SandeagoPropertyItemModel$InputFormat z;

    public void x(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, x.class, "3")) {
          return;
       }
       super.E8();
       this.x.setVisibility(8);
       SandeagoPropertyItemModel mInputConfig = this.u.mInputConfig;
       if (mInputConfig != null) {
          this.z = a.a.c(mInputConfig.get("inputFormat"), SandeagoPropertyItemModel$InputFormat.class);
       }
       if (this.y == null) {
          this.y = new x$a(this);
       }
       this.w.addTextChangedListener(this.y);
       SandeagoPropertyItemResponseModel sandeagoProp = this.v.d(this.u.mPropId);
       if (sandeagoProp != null && !TextUtils.isEmpty(sandeagoProp.mPropValue)) {
          this.w.setText(sandeagoProp.mPropValue);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, x.class, "4")) {
          return;
       }
       this.w.removeTextChangedListener(this.y);
       this.w.setText("");
       return;
    }
    public void P8(PropValue p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "5")) {
          return;
       }
       this.w.setText(p0.mPropValue);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.w = m1.f(p0, 0x7f0a32fd);
       this.x = m1.f(p0, 0x7f0a3300);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       super.j8();
       this.u = this.q8(SandeagoPropertyItemModel.class);
       this.v = this.r8("SANDEAGO_PROPERTY_UPDATE_SERVICE");
       return;
    }
}
