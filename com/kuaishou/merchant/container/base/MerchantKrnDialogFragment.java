package com.kuaishou.merchant.container.base.MerchantKrnDialogFragment;
import us3.d;
import zt3.e;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.merchant.container.base.MerchantKrnDialogFragment$a;
import com.kuaishou.merchant.container.base.b;
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
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import us3.h;
import us3.f;
import java.util.HashMap;
import com.kuaishou.merchant.KernelsLogBiz;
import p74.a;
import java.util.Map;
import o74.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import js6.a;
import android.view.View;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.util.Pair;
import com.yxcorp.utility.n;
import java.lang.Number;
import lnc.o5;
import lnc.a1;
import java.lang.Float;
import com.kuaishou.merchant.basic.util.h;
import ekd.i;
import android.content.Context;
import java.lang.Integer;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import zt3.g;
import ik0.a;
import ik0.e;
import androidx.fragment.app.e;
import android.content.res.Configuration;
import tkd.b;
import tkd.d;
import ym5.a;
import r74.d;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import xm4.a;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import gu3.c;
import com.kuaishou.merchant.router.b;
import android.content.DialogInterface;
import gu3.d;
import java.lang.Boolean;

public class MerchantKrnDialogFragment extends KwaiDialogFragment implements d, e	// class@00162d
{
    public View p;
    public final MerchantKrnDialogFragment$a q;
    public KwaiRnFragment r;
    public static final int s;

    public void MerchantKrnDialogFragment(){
       super();
       this.q = new MerchantKrnDialogFragment$a(null);
    }
    public final void Cb(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantKrnDialogFragment.class, "5")) {
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
       return this.r;
    }
    public void d8(LaunchModel p0){
       d.e(this, p0);
    }
    public String f(){
       MerchantKrnDialogFragment$a obj = PatchProxy.apply(null, this, MerchantKrnDialogFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q.d;
       if (obj != null) {
          return obj.g().getString("pageId");
       }
       return "";
    }
    public Activity getActivity(){
       return super.getActivity();
    }
    public String getUrl(){
       return this.q.a;
    }
    public void i3(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantKrnDialogFragment.class, "24")) {
          return;
       }
       MerchantKrnDialogFragment$a c = this.q.c;
       if (c != null) {
          c.a(p0);
       }
       return;
    }
    public String m7(){
       return this.q.b;
    }
    public void nf(){
       if (PatchProxy.applyVoid(null, this, MerchantKrnDialogFragment.class, "14")) {
          return;
       }
       this.dismissAllowingStateLoss();
       return;
    }
    public void onActivityCreated(Bundle p0){
       int i;
       boolean i3;
       float f3;
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantKrnDialogFragment.class, "9")) {
          return;
       }
       super.onActivityCreated(p0);
       MerchantKrnDialogFragment tq = this.q;
       String str = "MerchantKrnDialogFragment";
       if (tq.d == null) {
          HashMap hashMap = new HashMap();
          hashMap.put("url", this.q.a);
          a.p(KernelsLogBiz.RN_HALF, str, "url parse failed", hashMap);
          return;
       }else if(TextUtils.x(tq.a)){
          a.g(KernelsLogBiz.RN_HALF, str, "url is empty");
          return;
       }else {
          a.b.Gg(this.q.d);
          Object[] objArray = null;
          str = 1;
          String str1 = "";
          if (!PatchProxy.applyVoid(objArray, this, MerchantKrnDialogFragment.class, "16") && this.p != null) {
             String str3 = this.vh("backgroundColor", str1);
             if (!TextUtils.x(str3)) {
                this.p.setBackgroundColor(TextUtils.J(str3, 0));
             }
             i3 = this.sh("disableClickOutsideDismiss", 0);
             if (this.getDialog() != null) {
                this.getDialog().setCanceledOnTouchOutside((i3 ^ str));
             }
          }
       label_0083 :
          if (PatchProxy.applyVoid(objArray, this, MerchantKrnDialogFragment.class, "17") || (this.getDialog() != null && this.getActivity() != null)) {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             Pair pair = PatchProxy.apply(objArray, this, MerchantKrnDialogFragment.class, "18");
             String str2 = "dialogStyle";
             if (pair != patchProxyRe) {
             }else {
                float f1 = 0;
                float f2 = this.th("widthRatio", f1);
                int i1 = -2;
                int i2 = (f2 - f1 <= 0 || this.getActivity() == null)? -2: (int)((float)n.k(this.getActivity()) * f2);
                String obj = PatchProxy.apply(objArray, this, MerchantKrnDialogFragment.class, "19");
                if (obj != patchProxyRe) {
                   i3 = obj.intValue();
                }else {
                   str1 = this.vh("absoluteHeight", str1);
                   if (!TextUtils.x(str1)) {
                      i = o5.b(str1, 0);
                      if (i) {
                         i = a1.e((float)i);
                      label_00fb :
                         if (i <= 0) {
                            obj = this.vh("heightRatio", "0");
                            try{
                               f3 = Float.parseFloat(obj);
                            }catch(java.lang.Exception e0){
                               f3 = 0;
                            }
                            if (f3 - f1 > 0) {
                               i = (int)((float)n.j(this.getActivity()) * f3);
                            }
                         }
                         if (i <= 0) {
                            Object obj1 = PatchProxy.apply(e0, this, MerchantKrnDialogFragment.class, "20");
                            if (obj1 != patchProxyRe) {
                               i1 = obj1.intValue();
                            }else if(this.uh(str2, 0) != str){
                               i1 = h.g(this.getActivity()) - ((n.j(this.getActivity()) * 10) / 100);
                            }
                         }else {
                            i1 = i;
                         }
                         i3 = i1;
                      }
                   }
                   i = 0;
                   goto label_00fb ;
                }
                i = this.uh(str2, 0);
                if (i3 >= n.j(this.getActivity()) && i == str) {
                   i.h(this.getActivity(), -1, str);
                   i3 = i3 - n.A(this.getActivity());
                }
                pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
             }
             float f = this.th("alpha", 0.30f);
             i = this.uh(str2, 0);
             Window window = this.getDialog().getWindow();
             if (window != null) {
                if (i) {
                   if (i == str) {
                      window.setWindowAnimations(R.style.arg_RES_7f1103bf);
                      h.c(this, window, pair.second.intValue());
                   }
                }else {
                   window.getAttributes().width = pair.first.intValue();
                   window.getAttributes().height = pair.second.intValue();
                   window.getAttributes().gravity = 17;
                   window.setWindowAnimations(R.style.arg_RES_7f1103a5);
                }
                if (this.sh("setDim", 0)) {
                   window.addFlags(2);
                }
                window.setDimAmount(f);
                if (this.sh("hideDim", 0)) {
                   window.clearFlags(2);
                }
             }
          }
       label_01ef :
          if (!PatchProxy.applyVoid(objArray, this, MerchantKrnDialogFragment.class, "21")) {
             KwaiRnFragment kwaiRnFragme = KwaiRnFragment.Yg(this.q.d);
             if (this.getActivity() != null && (!this.getActivity().isFinishing() && !kwaiRnFragme.isHidden())) {
                kwaiRnFragme.setAttachedWindow(this.getDialog().getWindow());
                kwaiRnFragme.setCloseHandler(new g(this));
                kwaiRnFragme.setDegradeHandler(new b(this));
                this.r = kwaiRnFragme;
                e uoe = this.getChildFragmentManager().beginTransaction();
                uoe.f(R.id.merchant_rn_container, kwaiRnFragme);
                uoe.o();
                this.d8(this.q.d);
             }
          }
          return;
       }
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantKrnDialogFragment.class, "13")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (d.a(0x4c5dd1b8).f2()) {
          this.dismissAllowingStateLoss();
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantKrnDialogFragment.class, "7")) {
          return;
       }
       super.onCreate(p0);
       d.a(this).b();
       a.t(MerchantCommonLogBiz.RN, "MerchantKrnDialogFragment", "onCreate", "url", this.q.a);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantKrnDialogFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setStyle(1, R.style.arg_RES_7f110362);
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.getWindow().setSoftInputMode(48);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantKrnDialogFragment.class, "8");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.d(p0, R.layout.arg_RES_7f0d04f3, p1, false);
       this.p = view;
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MerchantKrnDialogFragment.class, "12")) {
          return;
       }
       super.onDestroy();
       MerchantKrnDialogFragment tq = this.q;
       if (tq.d != null) {
          MerchantKrnDialogFragment$a c = tq.c;
          if (c != null && (c instanceof c && this.sh("closeWithCallback", false))) {
             this.q.c.onDismiss();
          }
       }
       b.i(this.m7());
       this.Ha(this.q.d);
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantKrnDialogFragment.class, "11")) {
          return;
       }
       if (!this.sh("disableCloseActivity", false) && (this.getActivity() instanceof d && this.getActivity().E1())) {
          this.getActivity().finish();
          return;
       }else {
          j.b(this.getFragmentManager(), this);
          if (this.getActivity() != null) {
             i.h(this.getActivity(), false, true);
          }
          this.r = null;
          super.onDismiss(p0);
          return;
       }
    }
    public final boolean sh(String p0,boolean p1){
       MerchantKrnDialogFragment$a obj;
       if (PatchProxy.isSupport(MerchantKrnDialogFragment.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, MerchantKrnDialogFragment.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.q.d;
       if (obj == null) {
          return p1;
       }else {
          try{
             p1 = Boolean.parseBoolean(obj.g().getString(p0));
             return p1;
          }catch(java.lang.Exception e0){
          }
       }
    }
    public void show(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantKrnDialogFragment.class, "4")) {
          return;
       }
       super.show(p0, p1);
       j.c(p0, this);
       return;
    }
    public String te(LaunchModel p0){
       return d.a(this, p0);
    }
    public final float th(String p0,float p1){
       MerchantKrnDialogFragment$a obj;
       if (PatchProxy.isSupport(MerchantKrnDialogFragment.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, MerchantKrnDialogFragment.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       obj = this.q.d;
       if (obj == null) {
          return p1;
       }else {
          try{
             p1 = Float.parseFloat(obj.g().getString(p0));
             return p1;
          }catch(java.lang.Exception e0){
          }
       }
    }
    public final int uh(String p0,int p1){
       MerchantKrnDialogFragment$a obj;
       if (PatchProxy.isSupport(MerchantKrnDialogFragment.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, MerchantKrnDialogFragment.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.q.d;
       if (obj == null) {
          return p1;
       }else {
          return o5.b(obj.g().getString(p0), p1);
       }
    }
    public final String vh(String p0,String p1){
       MerchantKrnDialogFragment$a obj = PatchProxy.applyTwoRefs(p0, p1, this, MerchantKrnDialogFragment.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q.d;
       if (obj == null) {
          return p1;
       }
       return obj.g().getString(p0, p1);
    }
}
