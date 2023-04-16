package com.kuaishou.merchant.transaction.purchase.dynamic.component.recharge.MtpRechargeViewBinder;
import vd4.b;
import com.kuaishou.merchant.transaction.purchase.dynamic.component.recharge.MtpRechargeViewBinder$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.purchase.dynamic.component.recharge.MtpRechargeViewBinder$mViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.merchant.transaction.purchase.dynamic.component.recharge.MtpRechargeViewBinder$mMobile344Formatter$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import mm4.d;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import android.widget.LinearLayout;
import android.view.View;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.merchant.transaction.purchase.model.RechargeConfig;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.Integer;
import mm4.c;
import java.util.HashMap;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import ub.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.EditText;
import android.text.TextWatcher;
import mm4.b;
import ekd.p1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.text.Editable;
import android.graphics.Typeface;

public final class MtpRechargeViewBinder extends b	// class@000908
{
    public final p A;
    public LinearLayout B;
    public Queue C;
    public Queue D;
    public final p E;
    public d y;
    public d z;
    public static final MtpRechargeViewBinder$a F;

    static {
       MtpRechargeViewBinder.F = new MtpRechargeViewBinder$a(null);
    }
    public void MtpRechargeViewBinder(Fragment p0){
       super(p0);
       this.A = s.c(new MtpRechargeViewBinder$mViewModel$2(p0));
       this.E = s.c(MtpRechargeViewBinder$mMobile344Formatter$2.INSTANCE);
    }
    public void E8(){
       int i2;
       MtpRechargeViewBinder b;
       View obj1;
       Object obj2;
       MtpRechargeViewBinder mtpRechargeV;
       int i6;
       View view;
       KwaiCDNImageView obj3;
       Object obj4;
       int i8;
       Queue queue = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, queue, MtpRechargeViewBinder.class, "6")) {
          return;
       }
       super.E8();
       MtpRechargeViewBinder y = queue.y;
       List list = (y != null)? y.a(): objArray;
       MtpRechargeViewBinder z = queue.z;
       List list1 = (z != null)? z.a(): objArray;
       if (a.g(list, list1)) {
          return;
       }else {
          y = queue.y;
          if (!PatchProxy.applyVoidOneRefs(y, queue, MtpRechargeViewBinder.class, "7")) {
             z = queue.B;
             int i = 0;
             if (!PatchProxy.applyVoidOneRefs(z, queue, MtpRechargeViewBinder.class, "16")) {
                int childCount = (z != null)? z.getChildCount(): 0;
                if (childCount) {
                   a.m(z);
                   childCount = z.getChildCount();
                   int i9 = 0;
                   while (i9 < childCount) {
                      int i10 = i9 % 2;
                      if (!i10) {
                         queue.s9(z.getChildAt(i9));
                      }else {
                         obj1 = z.getChildAt(i9);
                         if (!PatchProxy.applyVoidOneRefs(obj1, queue, MtpRechargeViewBinder.class, "17")) {
                            if (queue.D == null) {
                               queue.D = new LinkedList();
                            }
                            b = queue.D;
                            a.m(b);
                            b.add(obj1);
                         }
                      }
                      i9 = i9 + 1;
                   }
                   z.removeAllViews();
                }
             }
             a.m(y);
             List list2 = y.a();
             if (q.f(list2)) {
                a.g(MerchantTransactionLogBiz.PURCHASE_V2, "DyRechargeViewBinder", "dataEmptyWhenComponentShow");
             }else {
                a.m(list2);
                String str = PatchProxy.applyOneRefs(list2, queue, MtpRechargeViewBinder.class, "21");
                if (str != PatchProxyResult.class) {
                }else {
                   Iterator iterator = list2.iterator();
                   String str1 = "";
                   while (iterator.hasNext()) {
                      RechargeConfig rechargeConf = iterator.next();
                      if ((TextUtils.k(rechargeConf.mLabel)).length() > str1.length()) {
                         str1 = rechargeConf.mLabel;
                      }
                   }
                   str = str1;
                }
                z = queue.B;
                a.m(z);
                Integer obj = PatchProxy.applyTwoRefs(str, z, queue, MtpRechargeViewBinder.class, "22");
                int i1 = 0x7f0a4231;
                if (obj != PatchProxyResult.class) {
                   i2 = obj.intValue();
                }else {
                   View view2 = queue.o9(z);
                   TextView textView1 = view2.findViewById(i1);
                   textView1.setText(str);
                   textView1.measure(i, i);
                   i2 = textView1.getMeasuredWidth();
                   queue.s9(view2);
                }
                int i3 = i2;
                int i4 = list2.size();
                int i5 = 0;
                while (i5 < i4) {
                   b = queue.B;
                   a.m(b);
                   obj1 = list2.get(i5);
                   if (PatchProxy.isSupport(MtpRechargeViewBinder.class)) {
                      obj2 = obj1;
                      mtpRechargeV = b;
                      if (PatchProxy.applyVoidThreeRefs(b, obj1, Integer.valueOf(i3), this, MtpRechargeViewBinder.class, "8")) {
                         i6 = i4;
                         i4 = i5;
                      label_0279 :
                         i2 = list2.size() - 1;
                         if (i4 != i2) {
                            y = queue.B;
                            a.m(y);
                            if (!PatchProxy.applyVoidOneRefs(y, queue, MtpRechargeViewBinder.class, "11")) {
                               obj3 = PatchProxy.applyOneRefs(y, queue, MtpRechargeViewBinder.class, "14");
                               if (obj3 != PatchProxyResult.class) {
                                  obj = null;
                               }else {
                                  Object[] objArray1 = null;
                                  obj3 = PatchProxy.apply(objArray1, queue, MtpRechargeViewBinder.class, "15");
                                  if (obj3 == PatchProxyResult.class) {
                                     z = queue.D;
                                     if (z != null) {
                                        obj3 = z.poll();
                                     }else {
                                        obj3 = objArray1;
                                     label_02b1 :
                                        if (obj3 == null) {
                                           obj3 = p1.h(y, R.layout.arg_RES_7f0d07b2);
                                        }
                                     }
                                  }
                                  goto label_02b1 ;
                               }
                               y.addView(obj3);
                            label_02c0 :
                               i5 = i4 + 1;
                               i4 = i6;
                               view = 0x7f0a4231;
                            }
                         }
                         obj = null;
                         goto label_02c0 ;
                      }
                   }else {
                      obj2 = obj1;
                      mtpRechargeV = b;
                   }
                   View view1 = queue.o9(mtpRechargeV);
                   obj1 = this.q9().o0().get(obj2.mLabel);
                   if (PatchProxy.isSupport(MtpRechargeViewBinder.class)) {
                      obj4 = obj1;
                      view = view1;
                      i6 = i4;
                      i4 = i5;
                      if (PatchProxy.applyVoidFourRefs(view1, Integer.valueOf(i3), obj2, obj1, this, MtpRechargeViewBinder.class, "9")) {
                         int i7 = 0x7f0a4231;
                      label_0276 :
                         mtpRechargeV.addView(view);
                         goto label_0279 ;
                      }
                   }else {
                      obj4 = obj1;
                      view = view1;
                      i6 = i4;
                      i4 = i5;
                   }
                   RechargeConfig mAccountNumT = obj2.mAccountNumType;
                   obj3 = view.findViewById(R.id.icon);
                   i5 = 8;
                   view1 = 2;
                   if (!PatchProxy.isSupport(MtpRechargeViewBinder.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(mAccountNumT), obj3, queue, MtpRechargeViewBinder.class, "10")) {
                      if (mAccountNumT != view1) {
                         if (mAccountNumT != i5) {
                            i8 = (mAccountNumT != 11)? 0x7f103470: 0x7f103477;
                         }else {
                            i8 = 0x7f103472;
                         }
                      }else {
                         i8 = 0x7f103473;
                      }
                      KwaiCDNImageView.q0(obj3, i8, 1, null, 4, null);
                   }
                   TextView textView = view.findViewById(R.id.tv_recharge_label);
                   textView.setText(obj2.mLabel);
                   textView.getLayoutParams().width = i3;
                   textView.setLayoutParams(textView.getLayoutParams());
                   i5 = 2;
                   if (!PatchProxy.applyVoidThreeRefs(obj2, view, obj4, this, MtpRechargeViewBinder.class, "19")) {
                      EditText uEditText = view.findViewById(R.id.et_recharge_account);
                      if (obj2.mAccountNumType == i5) {
                         uEditText.setInputType(3);
                         TextWatcher textWatcher = PatchProxy.apply(null, queue, MtpRechargeViewBinder.class, "2");
                         if (textWatcher == PatchProxyResult.class) {
                            textWatcher = queue.E.getValue();
                         }
                         uEditText.addTextChangedListener(textWatcher);
                      }else {
                         uEditText.setInputType(1);
                      }
                      uEditText.addTextChangedListener(new b(queue, obj2, uEditText));
                      if (!TextUtils.x(obj4)) {
                         uEditText.setText(obj4);
                      }else {
                         uEditText.setText(obj2.mPhoneNumber);
                      }
                      uEditText.setHint(obj2.mInputHint);
                      queue.t9(uEditText);
                   }
                   textView = view.findViewById(R.id.tv_recharge_hint);
                   i5 = (TextUtils.x(obj2.mHint))? 8: 0;
                   textView.setVisibility(i5);
                   textView.setText(obj2.mHint);
                   goto label_0276 ;
                }
             }
          }
          queue.z = queue.y;
          return;
       }
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, MtpRechargeViewBinder.class, "4")) {
          return;
       }
       super.F8();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MtpRechargeViewBinder.class, "3")) {
          return;
       }
       super.doBindView(p0);
       this.B = p0.findViewById(0x7f0a343f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MtpRechargeViewBinder.class, "5")) {
          return;
       }
       this.y = this.s8(d.class);
       return;
    }
    public final View o9(ViewGroup p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MtpRechargeViewBinder mtpRechargeV = MtpRechargeViewBinder.class;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, mtpRechargeV, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       Object[] objArray = PatchProxy.apply(obj, this, mtpRechargeV, "13");
       if (objArray != patchProxyRe) {
       }else {
          MtpRechargeViewBinder tC = this.C;
          if (tC != null) {
             obj = tC.poll();
          }
          objArray = obj;
       }
       if (objArray == null) {
          objArray = p1.h(p0, R.layout.arg_RES_7f0d0671);
       }
       return objArray;
    }
    public final c q9(){
       Object obj = PatchProxy.apply(null, this, MtpRechargeViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.A.getValue();
    }
    public final void s9(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MtpRechargeViewBinder.class, "18")) {
          return;
       }
       if (this.C == null) {
          this.C = new LinkedList();
       }
       MtpRechargeViewBinder tC = this.C;
       a.m(tC);
       tC.add(p0);
       return;
    }
    public final void t9(EditText p0){
       Typeface typeface;
       if (PatchProxy.applyVoidOneRefs(p0, this, MtpRechargeViewBinder.class, "20")) {
          return;
       }
       Editable text = p0.getText();
       if (text != null) {
          typeface = (!text.length())? 1: null;
          if (typeface == 1) {
             typeface = Typeface.DEFAULT;
          label_0022 :
             p0.setTypeface(typeface);
             return;
          }
       }
       typeface = Typeface.DEFAULT_BOLD;
       goto label_0022 ;
    }
}
