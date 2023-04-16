package com.kuaishou.merchant.container.rnhalf.MerchantHalfRnFragmentWrapper;
import us3.d;
import zt3.e;
import com.kuaishou.merchant.basic.fragment.MerchantInterceptDismissBottomSheetFragment;
import com.kuaishou.merchant.container.rnhalf.MerchantHalfRnFragmentWrapper$b;
import com.kuaishou.merchant.container.rnhalf.MerchantHalfRnFragmentWrapper$a;
import java.lang.String;
import com.kuaishou.krn.model.LaunchModel;
import zt3.d;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import ekd.q;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import us3.h;
import us3.f;
import android.os.Bundle;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.KernelsLogBiz;
import p74.a;
import o74.a;
import android.net.Uri;
import java.lang.Boolean;
import ekd.x0;
import com.kuaishou.krn.model.LaunchModel$b;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.merchant.router.b;
import js6.a;
import java.util.HashMap;
import bld.b;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import java.lang.Number;
import lnc.o5;
import lnc.a1;
import java.lang.Float;
import com.yxcorp.utility.n;
import com.kuaishou.merchant.basic.util.h;
import ekd.i;
import android.content.Context;
import android.view.Window;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kuaishou.merchant.basic.fragment.MerchantBottomSheetFragment;
import r74.d;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import xm4.a;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import gu3.c;
import android.content.DialogInterface;
import gu3.d;
import zt3.j;
import androidx.fragment.app.KwaiDialogFragment;

public class MerchantHalfRnFragmentWrapper extends MerchantInterceptDismissBottomSheetFragment implements d, e	// class@001652
{
    public View D;
    public final MerchantHalfRnFragmentWrapper$b E;
    public KwaiRnFragment F;
    public LaunchModel G;
    public static final int H;

    public void MerchantHalfRnFragmentWrapper(){
       super();
       this.E = new MerchantHalfRnFragmentWrapper$b(null);
    }
    public String C1(){
       return "MERCHANT_HALF_SCREEN_RN_COMMON";
    }
    public void Ha(LaunchModel p0){
       d.d(this, p0);
    }
    public KwaiRnFragment U2(){
       return this.F;
    }
    public void d8(LaunchModel p0){
       d.e(this, p0);
    }
    public String f(){
       Object obj = PatchProxy.apply(null, this, MerchantHalfRnFragmentWrapper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!q.h(this.E.b)) {
          return this.E.b.get("pageId");
       }
       return "";
    }
    public Activity getActivity(){
       return super.getActivity();
    }
    public String getUrl(){
       return this.E.a;
    }
    public void i3(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHalfRnFragmentWrapper.class, "22")) {
          return;
       }
       MerchantHalfRnFragmentWrapper$b d = this.E.d;
       if (d != null) {
          d.a(p0);
       }
       return;
    }
    public String m7(){
       return this.E.c;
    }
    public void nf(){
       if (PatchProxy.applyVoid(null, this, MerchantHalfRnFragmentWrapper.class, "5")) {
          return;
       }
       this.dismissAllowingStateLoss();
       return;
    }
    public void onActivityCreated(Bundle p0){
       MerchantHalfRnFragmentWrapper tG;
       Object obj1;
       String str1;
       int i2;
       String str2;
       int i3;
       float f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHalfRnFragmentWrapper.class, "9")) {
          return;
       }
       super.onActivityCreated(p0);
       String str = "LiveMerchantHalfRnFragmentWrapper";
       if (TextUtils.x(this.E.a)) {
          a.g(KernelsLogBiz.RN_HALF, str, "url is empty");
          return;
       }else {
          Uri uri = Uri.parse(this.E.a);
          boolean i = PatchProxy.applyOneRefs(uri, this, MerchantHalfRnFragmentWrapper.class, "19");
          int i1 = 0;
          boolean b = true;
          boolean b1 = false;
          if (i != patchProxyRe) {
          }else {
             LaunchModel$b obj2 = PatchProxy.applyOneRefs(uri, this, MerchantHalfRnFragmentWrapper.class, "21");
             String str4 = "componentName";
             String str5 = "bundleId";
             if (obj2 != patchProxyRe) {
                i = obj2.booleanValue();
             }else if(TextUtils.x(x0.a(uri, str5)) || TextUtils.x(x0.a(uri, str4))){
                i = false;
             }else {
                i = true;
             }
             if (!i) {
                i = i1;
             }else {
                obj2 = new LaunchModel$b();
                obj2.f("enableBackBtnHandler", b1);
                Set set = x0.c(uri);
                if (!q.f(set)) {
                   Iterator iterator = set.iterator();
                   while (iterator.hasNext()) {
                      str2 = iterator.next();
                      String str6 = x0.a(uri, str2);
                      if (TextUtils.n(str2, "title")) {
                         obj2.m(str6);
                      }else if(TextUtils.n(str2, str5)){
                         obj2.i(str6);
                      }else if(TextUtils.n(str2, str4)){
                         obj2.j(str6);
                      }else if(TextUtils.n(str2, "autoPageShow")){
                         obj2.g(Boolean.parseBoolean(str6));
                      }else {
                         obj2.e(str2, str6);
                      }
                   }
                }
                if (!q.h(this.E.b)) {
                   Iterator iterator1 = this.E.b.entrySet().iterator();
                   while (iterator1.hasNext()) {
                      Map$Entry uEntry = iterator1.next();
                      str5 = uEntry.getKey();
                      obj2.e(str5, uEntry.getValue());
                   }
                }
                tG = this.E;
                if (tG.d != null) {
                   MerchantHalfRnFragmentWrapper$b c = tG.c;
                   obj2.e("callbackId", c);
                   b.a(c, this);
                }
                i = obj2.h();
             }
          }
          this.G = i;
          a.b.Gg(i);
          tG = this.G;
          if (tG == null) {
             HashMap hashMap = new HashMap();
             hashMap.put("url", this.E.a);
             a.p(KernelsLogBiz.RN_HALF, str, "url parse failed", hashMap);
             return;
          }else if(PatchProxy.applyVoidOneRefs(tG, this, MerchantHalfRnFragmentWrapper.class, "12") || this.D == null){
             String str3 = tG.g().getString("backgroundColor", "");
             if (!TextUtils.x(str3)) {
                b uob = new b();
                uob.v(TextUtils.J(str3, -1));
                uob.s(DrawableCreator$Shape.Rectangle);
                uob.g(KwaiRadiusStyles.TL16_TR16);
                this.D.setBackground(uob.a());
             }
             str1 = tG.g().getString("disableClickOutsideDismiss", "false");
             if (this.getDialog() != null) {
                this.getDialog().setCanceledOnTouchOutside((Boolean.parseBoolean(str1) ^ b));
             }
          }
       label_0192 :
          tG = this.G;
          if (!PatchProxy.applyVoidOneRefs(tG, this, MerchantHalfRnFragmentWrapper.class, "13")) {
             Dialog dialog = this.getDialog();
             if (dialog == null) {
                a.g(KernelsLogBiz.RN_HALF, str, "Dialog is null");
             }else {
                String obj = PatchProxy.applyOneRefs(tG, this, MerchantHalfRnFragmentWrapper.class, "16");
                if (obj != patchProxyRe) {
                   i1 = obj.intValue();
                }else {
                   obj = tG.g().getString("absoluteHeight", "");
                   if (!TextUtils.x(obj)) {
                      i2 = o5.b(obj, b1);
                      if (i2) {
                         i2 = a1.e((float)i2);
                      label_01de :
                         if (i2 <= 0) {
                            str2 = tG.g().getString("heightRatio", "0");
                            try{
                               i3 = 0;
                               f = Float.parseFloat(str2);
                            }catch(java.lang.Exception e0){
                               f = 0;
                            }
                            if (f - i3 > 0) {
                               i2 = (int)((float)n.j(this.getActivity()) * f);
                            }
                         }
                         if (i2 <= 0) {
                            obj1 = PatchProxy.apply(i1, this, MerchantHalfRnFragmentWrapper.class, "17");
                            if (obj1 != e0) {
                               i1 = obj1.intValue();
                            }else {
                               i1 = h.g(this.getActivity()) - ((n.j(this.getActivity()) * 10) / 100);
                            }
                         }else {
                            i1 = i2;
                         }
                      }
                   }
                   i2 = 0;
                   goto label_01de ;
                }
                if (i1 >= n.j(this.getActivity())) {
                   i.h(this.getActivity(), -1, b);
                   i1 = i1 - n.A(this.getActivity());
                }
                h.c(this, dialog.getWindow(), i1);
                obj1 = PatchProxy.applyOneRefs(tG, this, MerchantHalfRnFragmentWrapper.class, "14");
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else {
                   str1 = tG.g().getString("hideDim", "");
                   if (!TextUtils.x(str1)) {
                      b1 = Boolean.parseBoolean(str1);
                   }
                }
                if (b1 && dialog.getWindow() != null) {
                   dialog.getWindow().clearFlags(2);
                }
             }
          }
          tG = this.G;
          if (!PatchProxy.applyVoidOneRefs(tG, this, MerchantHalfRnFragmentWrapper.class, "18")) {
             tG.g().putString("containerSource", str);
             KwaiRnFragment kwaiRnFragme = KwaiRnFragment.Yg(tG);
             if (kwaiRnFragme == null) {
                this.dismiss();
             }else if(this.getActivity() == null || (this.getActivity().isFinishing() || kwaiRnFragme.isHidden())){
                this.F = kwaiRnFragme;
                e uoe = this.getChildFragmentManager().beginTransaction();
                uoe.f(R.id.merchant_rn_container, kwaiRnFragme);
                uoe.o();
                this.d8(tG);
             }
          }
          return;
       }
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHalfRnFragmentWrapper.class, "3")) {
          return;
       }
       super.onCreate(p0);
       d.a(this).b();
       a.t(MerchantCommonLogBiz.RN, "LiveMerchantHalfRnFragmentWrapper", "onCreate", "url", this.E.a);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantHalfRnFragmentWrapper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.getWindow().setSoftInputMode(48);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantHalfRnFragmentWrapper.class, "8");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.d(p0, R.layout.arg_RES_7f0d04c9, p1, false);
       this.D = view;
       return view;
    }
    public void onDestroy(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, MerchantHalfRnFragmentWrapper.class, "10")) {
          return;
       }
       super.onDestroy();
       MerchantHalfRnFragmentWrapper tG = this.G;
       if (tG != null) {
          MerchantHalfRnFragmentWrapper$b d = this.E.d;
          if (d != null && d instanceof c) {
             Object obj = PatchProxy.applyOneRefs(tG, this, MerchantHalfRnFragmentWrapper.class, "15");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                String str = tG.g().getString("closeWithCallback", "");
                b = (!TextUtils.x(str))? Boolean.parseBoolean(str): false;
             }
             if (b) {
                this.E.d.onDismiss();
             }
          }
       }
       b.i(this.m7());
       this.Ha(this.G);
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHalfRnFragmentWrapper.class, "6")) {
          return;
       }
       if (this.getActivity() instanceof d && this.getActivity().E1()) {
          this.getActivity().finish();
          return;
       }else {
          j.b(this.getFragmentManager(), this);
          if (this.getActivity() != null) {
             i.h(this.getActivity(), 0, true);
          }
          super.onDismiss(p0);
          return;
       }
    }
    public String te(LaunchModel p0){
       return d.a(this, p0);
    }
}
