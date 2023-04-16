package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a$a;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogGrabButtonView;
import qrd.l1;
import ca4.a;
import y94.c;
import q94.o;
import q94.b;
import da4.a;
import java.lang.CharSequence;
import e17.i;
import q94.n;
import g9c.a;

public final class a$a implements View$OnClickListener	// class@001c29
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       n a;
       int i;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, a$a.class, "1")) {
          return;
       }
       a$a b = obj.b;
       Objects.requireNonNull(b);
       a uoa = a.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, b, uoa, "8")) {
          a b1 = b.B;
          String str = "mGrabButton";
          if (b1 == null) {
             a.S(str);
          }
          if (!b1.getVisibility()) {
             b1 = b.B;
             if (b1 == null) {
                a.S(str);
             }
             if (b1.v == 1) {
                if (b.L == null) {
                   b.a9();
                   l1 a1 = l1.a;
                }
                b1 = b.I;
                a g = b.G;
                if (g == null) {
                   a.S("mContainerLiveData");
                }
                a l = b.L;
                Objects.requireNonNull(b1);
                if (!PatchProxy.applyVoidTwoRefs(g, l, b1, a.class, "3")) {
                   b1 = b1.f;
                   if (b1 != null) {
                      b1.c(g, l);
                   }
                }
             }else {
                b1 = b.B;
                if (b1 == null) {
                   a.S(str);
                }
                if (b1.v != 2) {
                   b1 = b.B;
                   if (b1 == null) {
                      a.S(str);
                   }
                   if (b1.v != 3) {
                   label_009a :
                      if (!PatchProxy.applyVoid(objArray, b, uoa, "23")) {
                         a = n.a;
                         uoa = b.G;
                         if (uoa == null) {
                            a.S("mContainerLiveData");
                         }
                         String str1 = uoa.b();
                         String str2 = (str1 != null)? str1: "";
                         uoa = b.H;
                         String str3 = "mAdapter";
                         if (uoa == null) {
                            a.S(str3);
                         }
                         int itemCount = uoa.getItemCount();
                         uoa = b.H;
                         if (uoa == null) {
                            a.S(str3);
                         }
                         b1 = b.G;
                         if (b1 == null) {
                            a.S("mContainerLiveData");
                         }
                         i = uoa.P0(b1) + 1;
                         int i1 = b.S8();
                         str1 = b.I.getLiveStreamId();
                         String str4 = (str1 != null)? str1: "";
                         str1 = b.I.p0();
                         String str5 = (str1 != null)? str1: "";
                         a.c(str2, itemCount, i, i1, 1, str4, str5, b.W8());
                      }
                   }
                }
                b1 = b.G;
                if (b1 == null) {
                   a.S("mContainerLiveData");
                }
                b1 = b1.e();
                if (b1 != null) {
                   b1 = b1.x;
                   if (b1 != null) {
                      i.d(R.style.arg_RES_7f11066a, b1);
                      goto label_009a ;
                   }else {
                      goto label_009a ;
                   }
                }else {
                   goto label_009a ;
                }
             }
          }
       }
    label_00fa :
       return;
    }
}
