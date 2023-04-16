package com.kuaishou.merchant.container.rndialog.MerchantRnDialog;
import zt3.e;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.merchant.container.rndialog.MerchantRnDialog$a;
import nsd.u;
import androidx.fragment.app.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zt3.j;
import com.kuaishou.krn.model.LaunchModel;
import zt3.d;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import kotlin.Pair;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Integer;
import java.lang.Boolean;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import java.lang.Number;
import qrd.l1;
import lnc.a1;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import com.kwai.kds.krn.api.page.KwaiRnFragment$a;
import androidx.fragment.app.e;
import r74.d;
import android.os.Parcelable;
import lnc.o5;
import com.kuaishou.merchant.container.rndialog.MerchantRnDialog$b;
import android.content.DialogInterface$OnShowListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import android.content.DialogInterface;
import java.lang.Float;

public final class MerchantRnDialog extends KwaiDialogFragment implements e	// class@00164f
{
    public final String p;
    public final float q;
    public LaunchModel r;
    public int s;
    public DialogInterface$OnShowListener t;
    public static final MerchantRnDialog$a u;

    static {
       MerchantRnDialog.u = new MerchantRnDialog$a(null);
    }
    public void MerchantRnDialog(){
       super();
       this.p = "MerchantRnDialog";
       this.q = 0.30f;
    }
    public void Cb(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantRnDialog.class, "7")) {
          return;
       }
       super.Cb(p0, p1);
       j.c(p0, this);
       return;
    }
    public void Ha(LaunchModel p0){
       d.d(this, p0);
    }
    public KwaiRnFragment U2(){
       return d.b(this);
    }
    public void d8(LaunchModel p0){
       d.e(this, p0);
    }
    public String f(){
       String str;
       MerchantRnDialog obj = PatchProxy.apply(null, this, MerchantRnDialog.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj != null) {
          Bundle uBundle = obj.g();
          if (uBundle != null) {
             str = uBundle.getString("pageId");
             if (str != null) {
             label_0025 :
                return str;
             }
          }
       }
       str = "";
       goto label_0025 ;
    }
    public String getUrl(){
       return d.c(this);
    }
    public void nf(){
       if (PatchProxy.applyVoid(null, this, MerchantRnDialog.class, "16")) {
          return;
       }
       this.dismissAllowingStateLoss();
       return;
    }
    public void onActivityCreated(Bundle p0){
       float f;
       Dialog dialog;
       WindowManager$LayoutParams attributes;
       int i3;
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantRnDialog.class, "5")) {
          return;
       }
       super.onActivityCreated(p0);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, MerchantRnDialog.class, "11")) {
          if (this.getDialog() == null || this.getActivity() == null) {
             a.g(MerchantCommonLogBiz.RN, this.p, "Activity or Dialog is null");
          }else {
             Pair pair = PatchProxy.apply(objArray, this, MerchantRnDialog.class, "12");
             Dialog uDialog = null;
             if (pair != patchProxyRe) {
             }else {
                float f1 = 0;
                f = this.sh("widthRatio", f1);
                float f2 = (float)uDialog;
                int i2 = -2;
                if (f - f2 <= 0 || this.getActivity() == null) {
                   i3 = -2;
                }else {
                   FragmentActivity activity2 = this.getActivity();
                   a.m(activity2);
                   i3 = (int)((float)n.k(activity2) * f);
                }
                f1 = this.sh("heightRatio", f1);
                if (f1 - f2 > 0 && this.getActivity() != null) {
                   FragmentActivity activity1 = this.getActivity();
                   a.m(activity1);
                   i2 = (int)((float)n.j(activity1) * f1);
                }
                pair = new Pair(Integer.valueOf(i3), Integer.valueOf(i2));
             }
             f = this.sh("alpha", this.q);
             String str = "disableClickOutsideDismiss";
             if (PatchProxy.isSupport(MerchantRnDialog.class)) {
                Object obj = PatchProxy.applyTwoRefs(str, Boolean.FALSE, this, MerchantRnDialog.class, "13");
                if (obj != patchProxyRe) {
                   boolean b = obj.booleanValue();
                label_00c5 :
                   uDialog = this.getDialog();
                   boolean i = 1;
                   if (uDialog != null) {
                      uDialog.setCanceledOnTouchOutside((b ^ i));
                   }
                   dialog = this.getDialog();
                   if (dialog != null) {
                      Window window = dialog.getWindow();
                      if (window != null) {
                         if (this.s != i) {
                            attributes = window.getAttributes();
                            attributes.width = pair.getFirst().intValue();
                            attributes.height = pair.getSecond().intValue();
                            attributes.gravity = 17;
                            window.setWindowAnimations(R.style.arg_RES_7f1103a5);
                            window.setAttributes(attributes);
                         }else {
                            window.setWindowAnimations(R.style.arg_RES_7f1103bf);
                            attributes = window.getAttributes();
                            i = n.I(this.getActivity());
                            if (i) {
                               attributes.width = a1.d(0x7f0702ff);
                               attributes.height = -1;
                            }else {
                               attributes.width = -1;
                               attributes.height = pair.getSecond().intValue();
                            }
                            int i1 = (i)? 21: 81;
                            attributes.gravity = i1;
                            window.setAttributes(attributes);
                         }
                         window.setDimAmount(f);
                      }
                   }
                }
             }
             MerchantRnDialog tr = this.r;
             if (tr != null) {
                tr = tr.g();
                if (tr != null) {
                   String str1 = tr.getString(str);
                   if (str1 != null) {
                      uDialog = Boolean.parseBoolean(str1);
                   }
                }
             }
             dialog = uDialog;
             goto label_00c5 ;
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, MerchantRnDialog.class, "10")) {
          KwaiRnFragment kwaiRnFragme = KwaiRnFragment.B.a(this.r);
          if (kwaiRnFragme == null) {
             this.dismiss();
          }else {
             FragmentActivity activity = this.getActivity();
             if (activity != null && (!activity.isFinishing() && !kwaiRnFragme.isHidden())) {
                e uoe = this.getChildFragmentManager().beginTransaction();
                uoe.f(R.id.merchant_rn_container, kwaiRnFragme);
                uoe.o();
             }
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       MerchantRnDialog obj;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantRnDialog.class, "1")) {
          return;
       }
       super.onCreate(p0);
       d.a(this).b();
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, MerchantRnDialog.class, "2")) {
          p0 = this.getArguments();
          LaunchModel parcelable = (p0 != null)? p0.getParcelable("key.launch.mode"): objArray;
          this.r = parcelable;
          String str = "dialogStyle";
          if (PatchProxy.isSupport(MerchantRnDialog.class)) {
             obj = PatchProxy.applyTwoRefs(str, Integer.valueOf(0), this, MerchantRnDialog.class, "15");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             label_0067 :
                this.s = i;
             }
          }
          obj = this.r;
          if (obj != null) {
             Bundle uBundle = obj.g();
             if (uBundle != null) {
                objArray = uBundle.getString(str);
             }
          }
          i = o5.b(objArray, 0);
          goto label_0067 ;
       }
       super.ph(new MerchantRnDialog$b(this));
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantRnDialog.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setStyle(1, R.style.arg_RES_7f110362);
       return super.onCreateDialog(p0);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantRnDialog.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.d(p0, 0x7f0d0f4f, p1, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MerchantRnDialog.class, "9")) {
          return;
       }
       super.onDestroy();
       MerchantRnDialog tr = this.r;
       if (tr != null) {
          this.Ha(tr);
       }
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantRnDialog.class, "8")) {
          return;
       }
       j.b(this.getFragmentManager(), this);
       super.onDismiss(p0);
       return;
    }
    public void ph(DialogInterface$OnShowListener p0){
       this.t = p0;
    }
    public final float sh(String p0,float p1){
       MerchantRnDialog obj;
       if (PatchProxy.isSupport(MerchantRnDialog.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, MerchantRnDialog.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       obj = this.r;
       if (obj != null) {
          Bundle uBundle = obj.g();
          if (uBundle != null) {
             p0 = uBundle.getString(p0);
             try{
             label_002f :
                if (p0 != null) {
                   p1 = Float.parseFloat(p0);
                }
                return p1;
             }catch(java.lang.NumberFormatException e0){
             }
          }
       }
       p0 = null;
       goto label_002f ;
    }
    public void show(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantRnDialog.class, "3")) {
          return;
       }
       super.show(p0, p1);
       j.c(p0, this);
       return;
    }
    public String te(LaunchModel p0){
       return d.a(this, p0);
    }
}
