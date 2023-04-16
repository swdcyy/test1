package com.kuaishou.merchant.transaction.detail.self.selfdetail.viewbinder.b;
import xf4.b;
import androidx.fragment.app.Fragment;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v04.a;
import nh4.b;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailExpressInfo;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel;
import brd.t;
import com.kuaishou.merchant.basic.util.d;
import ei4.d;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.CharSequence;
import android.widget.TextView;
import rk0.b;
import com.kuaishou.merchant.transaction.detail.detailv2.j;
import xf4.c;
import android.text.SpannableStringBuilder;
import com.yxcorp.gifshow.util.span.SpannableStringBuilderUtils;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailHiddenConfig;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailResponse;
import android.view.View;
import ei4.k;
import ekd.m1;

public class b extends b	// class@000767
{
    public j A;
    public int x;
    public int y;
    public TextView z;

    public void b(Fragment p0){
       super(p0);
       this.x = a1.d(0x7f070283);
       this.y = a1.a(0x7f061d96);
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          uob = this.u.d;
          if (uob.mIconLabel != null) {
             Commodity$IconLabel[] iconLabelArr = new Commodity$IconLabel[]{uob.mIconLabel};
             this.X7(d.g(iconLabelArr).subscribe(new d(this)));
          }else {
             this.z.setText(this.a9());
          }
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.A = c.a(this);
       return;
    }
    public final void Z8(SpannableStringBuilder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       SpannableStringBuilderUtils.i(p0, a1.d(R.dimen.arg_RES_7f07031b));
       SpannableStringBuilderUtils.e(p0, "|", a1.d(R.dimen.arg_RES_7f070271), a1.a(R.color.arg_RES_7f061db8), true);
       SpannableStringBuilderUtils.i(p0, a1.d(R.dimen.arg_RES_7f07031b));
       return;
    }
    public final CharSequence a9(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       SpannableStringBuilder obj = PatchProxy.apply(objArray, this, uob, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new SpannableStringBuilder();
       DetailExpressInfo mDeliveryTex = this.u.d.mDeliveryText;
       int i = 1;
       int i1 = TextUtils.x(mDeliveryTex) ^ i;
       if (i1) {
          SpannableStringBuilderUtils.h(obj, mDeliveryTex, this.x, this.y);
       }
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(i1), this, uob, "6")) {
          int i2 = 0;
          if (!q.f(this.u.d.mAdditionalInfo)) {
             if (PatchProxy.isSupport(uob) && PatchProxy.applyTwoRefs(obj, Boolean.valueOf(i1), this, uob, "7") != patchProxyRe) {
             }else {
                DetailExpressInfo mAdditionalI = this.u.d.mAdditionalInfo;
                if (!q.f(mAdditionalI)) {
                   if (i1) {
                      this.Z8(obj);
                   }
                   while (i2 < mAdditionalI.size()) {
                      String str = mAdditionalI.get(i2);
                      if (!TextUtils.x(str)) {
                         SpannableStringBuilderUtils.h(obj, str, this.x, this.y);
                         int i3 = mAdditionalI.size() - i;
                         if (i2 != i3) {
                            SpannableStringBuilderUtils.i(obj, a1.d(R.dimen.arg_RES_7f07031b));
                            SpannableStringBuilderUtils.e(obj, "|", a1.d(R.dimen.arg_RES_7f070271), a1.a(R.color.arg_RES_7f061db8), i);
                            SpannableStringBuilderUtils.i(obj, a1.d(R.dimen.arg_RES_7f07031b));
                         }
                      }
                      i2 = i2 + 1;
                   }
                }
             }
          }else if(PatchProxy.isSupport(uob) && (!PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(i1), this, uob, "8") && !TextUtils.x(this.u.d.mPostageText))){
             Object obj1 = PatchProxy.apply(objArray, this, uob, "10");
             if (obj1 != patchProxyRe) {
                i = obj1.booleanValue();
             }else {
                j u = this.A.u;
                if (u == null || u.getHiddenConfig().mHiddenExpressFee == null) {
                   i = false;
                }
             }
             if (!i) {
                if (i1) {
                   this.Z8(obj);
                }
                obj.append(this.u.d.mPostageText);
             }
          }
       }
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.z = m1.f(p0, 0x7f0a0a8d);
       return;
    }
}
