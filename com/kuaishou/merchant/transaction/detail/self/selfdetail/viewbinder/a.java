package com.kuaishou.merchant.transaction.detail.self.selfdetail.viewbinder.a;
import xf4.b;
import androidx.fragment.app.Fragment;
import ei4.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v04.a;
import nh4.b;
import com.kuaishou.merchant.transaction.base.model.live.CertificatePropInfo;
import zf4.b;
import com.kuaishou.merchant.transaction.detail.detailv2.j;
import rk0.b;
import xf4.c;
import kg4.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.merchant.transaction.base.purchasepanel.secondhand.MerchantSecondHandCertificateView;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.viewbinder.a$a;
import android.view.View$OnClickListener;
import ei4.a;
import com.kuaishou.merchant.transaction.base.purchasepanel.secondhand.MerchantSecondHandCertificateView$b;
import ei4.k;
import ekd.m1;

public class a extends b	// class@000766
{
    public MerchantSecondHandCertificateView x;
    public j y;
    public b z;

    public void a(Fragment p0){
       super(p0);
       this.z = new b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       super.E8();
       this.Z8(this.u.d);
       this.y.p0("sku", this.z);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.y = c.a(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       super.J8();
       this.y.z0("sku", this.z);
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       if (this.u.d.isAvailable()) {
          this.y.m.G(this.u.d);
          if (!TextUtils.x(this.u.d.mReportUrl)) {
             this.y.m.F(this.u.d);
          }
       }
       return;
    }
    public final void Z8(CertificatePropInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.m8().getLayoutParams();
       if (!p0.isAvailable()) {
          if (layoutParams.height != null) {
             layoutParams.height = 0;
             this.m8().setLayoutParams(layoutParams);
          }
          this.m8().setVisibility(8);
       }else if(layoutParams.height != -2){
          layoutParams.height = -2;
          this.m8().setLayoutParams(layoutParams);
       }
       this.m8().setVisibility(0);
       this.x.setCertificatePropInfo(p0);
       this.x.setEnterOnClickListener(new a$a(this, p0));
       this.x.setOnItemShowListener(new a(this, p0));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.doBindView(p0);
       MerchantSecondHandCertificateView merchantSeco = m1.f(p0, R.id.certificate_view);
       this.x = merchantSeco;
       merchantSeco.H = 11;
       merchantSeco.G = 13;
       return;
    }
}
