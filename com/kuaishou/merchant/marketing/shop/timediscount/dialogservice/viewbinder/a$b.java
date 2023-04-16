package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.fragment.app.Fragment;
import rk0.b;
import androidx.fragment.app.KwaiDialogFragment;
import kotlin.jvm.internal.a;
import y94.c;
import com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponsInfoModel;
import ca4.a;
import q94.b;
import q94.n;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.model.LiveMerchantContainerDataList;
import java.util.ArrayList;

public final class a$b extends m	// class@001c2a
{
    public final a c;

    public void a$b(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       n a;
       String str6;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       a$b tc = this.c;
       Objects.requireNonNull(tc);
       a uoa = a.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, uoa, "11")) {
          if (!PatchProxy.applyVoid(objArray, tc, uoa, "12") && tc.R8() instanceof KwaiDialogFragment) {
             Fragment uFragment = tc.R8();
             Objects.requireNonNull(uFragment, "null cannot be cast to non-null type androidx.fragment.app.KwaiDialogFragment");
             uFragment.dismiss();
          }
          uoa = tc.G;
          String str = "mContainerLiveData";
          if (uoa == null) {
             a.S(str);
          }
          if (uoa.g() == 4) {
             uoa = tc.G;
             if (uoa == null) {
                a.S(str);
             }
             if (uoa.c() != null) {
                uoa = tc.I;
                a g = tc.G;
                if (g == null) {
                   a.S(str);
                }
                DiscountCouponsInfoModel uDiscountCou = g.c();
                a.m(uDiscountCou);
                String buttonUrl = uDiscountCou.getButtonUrl();
                Objects.requireNonNull(uoa);
                if (!PatchProxy.applyVoidOneRefs(buttonUrl, uoa, a.class, "4")) {
                   uoa = uoa.f;
                   if (uoa != null) {
                      uoa.b(buttonUrl);
                   }
                }
             }
          }
       label_0082 :
          a = n.a;
          uoa = tc.G;
          if (uoa == null) {
             a.S(str);
          }
          String str1 = uoa.b();
          String str2 = (str1 != null)? str1: "";
          int i = tc.I.b.size();
          int i1 = tc.I.q0() + 1;
          int i2 = tc.S8();
          str1 = tc.I.getLiveStreamId();
          String str3 = (str1 != null)? str1: "";
          str1 = tc.I.p0();
          String str4 = (str1 != null)? str1: "";
          a i3 = tc.I;
          DiscountCouponsInfoModel uDiscountCou1 = i3.b.get(i3.q0()).c();
          if (uDiscountCou1 != null) {
             String str5 = String.valueOf(uDiscountCou1.getReceiveCondition());
             if (str5 != null) {
                str6 = str5;
             label_00e2 :
                a.c(str2, i, i1, i2, 3, str3, str4, str6);
             }
          }
          str6 = "";
          goto label_00e2 ;
       }
       return;
    }
}
