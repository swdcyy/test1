package com.kuaishou.merchant.container.mixhalf.LiveMerchantHalfMixRnH5ContainerFragment;
import zt3.e;
import com.kuaishou.merchant.basic.fragment.MerchantInterceptDismissBottomSheetFragment;
import java.util.ArrayList;
import java.lang.String;
import com.kuaishou.krn.model.LaunchModel;
import zt3.d;
import android.view.View;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.container.mixhalf.LiveMerchantHalfMixContainerTabLayout;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import android.view.ViewGroup;
import com.kuaishou.merchant.container.mixhalf.LiveMerchantHalfMixRnH5ContainerFragment$d;
import eu3.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import tkd.b;
import tkd.d;
import wr3.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.CommonParams;
import k2b.e0;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.container.mixhalf.LiveMerchantHalfMixRnH5ContainerFragment$b;
import java.util.Map;
import ekd.q;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.merchant.container.mixhalf.LiveMerchantHalfMixRnH5ContainerFragment$c;
import com.kuaishou.merchant.container.mixhalf.bean.LiveMerchantHalfMixContainerTabParams;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import com.kuaishou.merchant.container.mixhalf.bean.LiveMerchantHalfMixContainerTabParams$PageInfo;
import android.net.Uri;
import eu3.c;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.w0;
import fg6.a;
import com.google.gson.Gson;
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
import js6.a;
import ab4.f;
import com.kuaishou.merchant.container.mixhalf.b;
import z1.a;
import com.kuaishou.merchant.router.RouterConfig;
import us3.i;
import com.kuaishou.merchant.router.annotation.RouteType;
import rr3.r;
import eu3.g;
import com.kuaishou.merchant.container.mixhalf.LiveMerchantHalfMixContainerTabLayout$a;
import eu3.f;
import androidx.fragment.app.c$c;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.util.rx.RxBus;
import fu3.a;
import brd.t;
import eu3.h;
import eu3.i;
import erd.g;
import android.view.LayoutInflater;
import xm4.a;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import androidx.fragment.app.KwaiDialogFragment;

public class LiveMerchantHalfMixRnH5ContainerFragment extends MerchantInterceptDismissBottomSheetFragment implements e	// class@001646
{
    public LiveMerchantHalfMixRnH5ContainerFragment$b D;
    public View E;
    public LiveMerchantHalfMixRnH5ContainerFragment$c F;
    public LiveMerchantHalfMixContainerTabLayout G;
    public final List H;
    public int I;
    public int J;
    public int K;
    public b L;
    public static final int M;

    public void LiveMerchantHalfMixRnH5ContainerFragment(){
       super();
       this.H = new ArrayList();
       this.I = -1;
       this.J = -1;
       this.K = -1;
    }
    public String C1(){
       return "MERCHANT_MIX_RN_H5";
    }
    public String D1(){
       return "µÁ…ÃªÏ∫œ∞Î∆¡»›∆˜";
    }
    public void Ha(LaunchModel p0){
       d.d(this, p0);
    }
    public void Jh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMerchantHalfMixRnH5ContainerFragment.class, "5")) {
          return;
       }
       this.G = this.E.findViewById(0x7f0a2b11);
       return;
    }
    public boolean Kh(int p0){
       if (PatchProxy.isSupport(LiveMerchantHalfMixRnH5ContainerFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveMerchantHalfMixRnH5ContainerFragment.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return super.Kh(p0);
    }
    public final void Lh(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantHalfMixRnH5ContainerFragment.class, "7")) {
          return;
       }
       this.H.clear();
       this.I = -1;
       this.J = -1;
       LiveMerchantHalfMixRnH5ContainerFragment tG = this.G;
       if (tG != null) {
          tG.removeAllViews();
       }
       return;
    }
    public final void Mh(int p0){
       if (PatchProxy.isSupport(LiveMerchantHalfMixRnH5ContainerFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveMerchantHalfMixRnH5ContainerFragment.class, "13")) {
          return;
       }
       if (p0 == this.I) {
          return;
       }
       if (p0 < 0 || p0 >= this.H.size()) {
          p0 = 0;
       }
       LiveMerchantHalfMixRnH5ContainerFragment$d uod = this.H.get(p0);
       if (uod == null) {
          return;
       }else {
          LiveMerchantHalfMixRnH5ContainerFragment$d b = uod.b;
          if (!PatchProxy.applyVoidOneRefs(b, null, e.class, "1")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             i3 oi3 = i3.f();
             oi3.d("tag_name", b);
             uElementPack.params = oi3.e();
             uElementPack.action2 = "MERCHANT_TASK_TOPGUIDE_BUTTON";
             d.a(0x4538a29d).MO(uElementPack, null, null, null);
          }
          b = uod.a;
          if (!PatchProxy.applyVoidTwoRefs(uod, b, this, LiveMerchantHalfMixRnH5ContainerFragment.class, "14")) {
             e uoe = this.getChildFragmentManager().beginTransaction();
             LiveMerchantHalfMixRnH5ContainerFragment tI = this.I;
             if (tI != -1) {
                uoe.s(this.H.get(tI).a);
             }
             if (uod.c == null) {
                Fragment uFragment = this.getChildFragmentManager().findFragmentByTag(String.valueOf(uod.b));
                if (uFragment != null && uFragment.isAdded()) {
                   uoe.u(uFragment);
                }
                uoe.g(R.id.merchant_mix_rn_h5_container, b, String.valueOf(uod.b));
                uoe.j(null);
                uod.c = true;
             }else {
                uoe.E(b);
             }
             uoe.m();
          }
          this.I = p0;
          return;
       }
    }
    public KwaiRnFragment U2(){
       return d.b(this);
    }
    public void d8(LaunchModel p0){
       d.e(this, p0);
    }
    public String f(){
       LiveMerchantHalfMixRnH5ContainerFragment obj = PatchProxy.apply(null, this, LiveMerchantHalfMixRnH5ContainerFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.d(MerchantCommonLogBiz.MIX_RN_H5_CONTAINER, "LiveMerchantHalfMixRnH5ContainerFragment", "call getPageId\(\) ");
       obj = this.D;
       if (obj != null) {
          LiveMerchantHalfMixRnH5ContainerFragment$b b = obj.b;
          if (b != null && !q.h(b)) {
             return this.D.b.get("pageId");
          }
       }
       return "";
    }
    public Activity getActivity(){
       return super.getActivity();
    }
    public final LaunchModel getLaunchModel(){
       LiveMerchantHalfMixRnH5ContainerFragment obj = PatchProxy.apply(null, this, LiveMerchantHalfMixRnH5ContainerFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.F;
       if (obj != null) {
          LiveMerchantHalfMixRnH5ContainerFragment$c a = obj.a;
          if (a == null || (!q.f(a.mContainers) && this.D != null)) {
             HashMap hashMap = new HashMap(this.D.b);
             Iterator iterator = this.F.a.mContainers.iterator();
             while (iterator.hasNext()) {
                LaunchModel launchModel = c.a(Uri.parse(iterator.next().mUrl), hashMap);
                if (launchModel != null && launchModel.g() != null) {
                   return launchModel;
                }
             }
          }
       }
       return null;
    }
    public String getUrl(){
       LiveMerchantHalfMixRnH5ContainerFragment tD = this.D;
       if (tD != null) {
          return tD.a;
       }
       return "";
    }
    public void nf(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantHalfMixRnH5ContainerFragment.class, "10")) {
          return;
       }
       a.g(MerchantCommonLogBiz.RN, "LiveMerchantHalfMixRnH5ContainerFragment", "no need to dismiss self");
       return;
    }
    public void onActivityCreated(Bundle p0){
       boolean b;
       int i;
       i oi;
       int i1;
       int i2;
       float f;
       String str;
       LiveMerchantHalfMixRnH5ContainerFragment$c uoc = this;
       LiveMerchantHalfMixRnH5ContainerFragment obj = p0;
       LiveMerchantHalfMixRnH5ContainerFragment$c uoc1 = LiveMerchantHalfMixRnH5ContainerFragment$c.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(obj, uoc, LiveMerchantHalfMixRnH5ContainerFragment.class, "6")) {
          return;
       }
       super.onActivityCreated(p0);
       MerchantCommonLogBiz mIX_RN_H5_CO = MerchantCommonLogBiz.MIX_RN_H5_CONTAINER;
       a.d(mIX_RN_H5_CO, "LiveMerchantHalfMixRnH5ContainerFragment", uoc.D.a);
       if (uoc.D.b != null) {
          a.d(mIX_RN_H5_CO, "LiveMerchantHalfMixRnH5ContainerFragment", " tab size : "+uoc.D.b.size());
       }
       LiveMerchantHalfMixRnH5ContainerFragment d = uoc.D;
       KwaiRnFragment obj1 = PatchProxy.applyOneRefs(d, null, uoc1, "2");
       if (obj1 != patchProxyRe) {
       }else if(TextUtils.x(d.a)){
          a.g(mIX_RN_H5_CO, "LiveMerchantHalfMixRnH5ContainerFragment", "params.mUrl is null");
          obj1 = null;
       }else {
          obj1 = new LiveMerchantHalfMixRnH5ContainerFragment$c();
          Uri uri = w0.f(d.a);
          str = uri.getQueryParameter("params");
          if (TextUtils.x(str)) {
             LiveMerchantHalfMixRnH5ContainerFragment$b b2 = d.b;
             if (b2 != null && b2.containsKey("params")) {
                str = d.b.get("params");
             }
          }
          obj1.a = a.a.h(str, LiveMerchantHalfMixContainerTabParams.class);
          obj1.c = uri.getQueryParameter("absoluteHeight");
          obj1.b = uri.getQueryParameter("heightRatio");
       }
       uoc.F = obj1;
       LiveMerchantHalfMixRnH5ContainerFragment obj2 = PatchProxy.applyOneRefs(obj1, null, uoc1, "1");
       LiveMerchantHalfMixRnH5ContainerFragment liveMerchant = null;
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else if(obj1 == null){
          a.g(mIX_RN_H5_CO, "LiveMerchantHalfMixRnH5ContainerFragment", "mLaunchParams is null");
       }else {
          str = "mTabParams is not valid";
          if (obj1.a == null) {
             a.g(mIX_RN_H5_CO, "LiveMerchantHalfMixRnH5ContainerFragment", str);
          }else if(TextUtils.x(obj1.c) && TextUtils.x(obj1.b)){
             a.g(mIX_RN_H5_CO, "LiveMerchantHalfMixRnH5ContainerFragment", "both mAbsoluteHeight and  mHeightRatio are null");
          }else if(!LiveMerchantHalfMixContainerTabParams.isTabParamsValid(obj1.a)){
             a.g(mIX_RN_H5_CO, "LiveMerchantHalfMixRnH5ContainerFragment", str);
          }else {
             b = true;
          }
       }
       b = false;
       if (!b) {
          a.g(mIX_RN_H5_CO, "LiveMerchantHalfMixRnH5ContainerFragment", "mLaunchParams is not valid, close fragment!");
          this.dismissAllowingStateLoss();
          return;
       }else {
          obj2 = uoc.F;
          if (!PatchProxy.applyVoidOneRefs(obj2, uoc, LiveMerchantHalfMixRnH5ContainerFragment.class, "15")) {
             Dialog dialog = this.getDialog();
             if (dialog == null) {
                a.g(mIX_RN_H5_CO, "LiveMerchantHalfMixRnH5ContainerFragment", "Dialog is null");
             }else {
                LiveMerchantHalfMixRnH5ContainerFragment$c obj3 = PatchProxy.applyOneRefs(obj2, uoc, LiveMerchantHalfMixRnH5ContainerFragment.class, "16");
                if (obj3 != patchProxyRe) {
                   i1 = obj3.intValue();
                }else {
                   obj3 = obj2.c;
                   if (!TextUtils.x(obj3)) {
                      i2 = o5.b(obj3, liveMerchant);
                      if (i2) {
                         i2 = a1.e((float)i2);
                      label_013e :
                         a.d(mIX_RN_H5_CO, "LiveMerchantHalfMixRnH5ContainerFragment", "mAbsoluteHeight is "+obj3+" targetHeight ="+i2);
                         if (i2 <= 0) {
                            LiveMerchantHalfMixRnH5ContainerFragment$c b1 = obj2.b;
                            i = 0;
                            try{
                               f = Float.parseFloat(b1);
                            }catch(java.lang.Exception e0){
                               f = 0;
                            }
                            if (f - i > 0) {
                               i1 = (int)((float)n.j(this.getActivity()) * f);
                            label_0177 :
                               if (i1 <= 0) {
                                  Object obj4 = PatchProxy.apply(null, e0, LiveMerchantHalfMixRnH5ContainerFragment.class, "17");
                                  if (obj4 != patchProxyRe) {
                                     i1 = obj4.intValue();
                                  }else {
                                     i1 = h.g(this.getActivity()) - ((n.j(this.getActivity()) * 10) / 100);
                                  }
                               }
                            }
                         }
                         i1 = i2;
                         goto label_0177 ;
                      }
                   }
                   i2 = 0;
                   goto label_013e ;
                }
                if (i1 >= n.j(this.getActivity())) {
                   i.h(this.getActivity(), -1, true);
                   i1 = i1 - n.A(this.getActivity());
                }
                a.d(MerchantCommonLogBiz.MIX_RN_H5_CONTAINER, "LiveMerchantHalfMixRnH5ContainerFragment", "dialogHeight is "+i1);
                h.c(uoc, dialog.getWindow(), i1);
                if (obj2.d != null && dialog.getWindow() != null) {
                   dialog.getWindow().clearFlags(2);
                }
             }
          }
          this.Lh();
          if (obj != null) {
             uoc.K = obj.getInt("lastSaveTabPosition", -1);
          }
          if (!PatchProxy.applyVoid(null, uoc, LiveMerchantHalfMixRnH5ContainerFragment.class, "8")) {
             if (q.f(uoc.F.a.mContainers)) {
                a.g(MerchantCommonLogBiz.MIX_RN_H5_CONTAINER, "LiveMerchantHalfMixRnH5ContainerFragment", "mLaunchParams.mTabParams.mContainers is null, close fragment!");
                this.dismissAllowingStateLoss();
             }else {
                uoc.G.setTabParams(uoc.F.a);
                Iterator iterator = uoc.F.a.mContainers.iterator();
                while (iterator.hasNext()) {
                   LiveMerchantHalfMixContainerTabParams$PageInfo pageInfo = iterator.next();
                   LiveMerchantHalfMixContainerTabParams$PageInfo mComponentTy = pageInfo.mComponentType;
                   if (mComponentTy == true) {
                      mComponentTy = pageInfo.mUrl;
                      obj1 = PatchProxy.applyOneRefs(mComponentTy, uoc, LiveMerchantHalfMixRnH5ContainerFragment.class, "12");
                      if (obj1 != patchProxyRe) {
                      }else {
                         HashMap hashMap = new HashMap(uoc.D.b);
                         hashMap.remove("params");
                         hashMap.put("inMixContainer", "true");
                         LaunchModel launchModel = c.a(Uri.parse(mComponentTy), hashMap);
                         if (launchModel == null) {
                         label_02a4 :
                            oi = null;
                         }else {
                            launchModel.g().putString("containerSource", "LiveMerchantHalfMixRnH5ContainerFragment");
                            a.b.Gg(launchModel);
                            oi = KwaiRnFragment.Yg(launchModel);
                         }
                      }
                   }else if(mComponentTy == 2){
                      i oi1 = f.a.e(b.a).e(this.getActivity(), pageInfo.mUrl);
                      oi = (oi1.b() == RouteType.FRAGMENT)? oi1.a: null;
                      r.a(oi1, pageInfo.mUrl);
                   }else {
                      goto label_02a4 ;
                   }
                   if (obj1 == null) {
                      a.g(MerchantCommonLogBiz.MIX_RN_H5_CONTAINER, "LiveMerchantHalfMixRnH5ContainerFragment", "create fragment fail");
                   }else {
                      uoc.H.add(new LiveMerchantHalfMixRnH5ContainerFragment$d(obj1, pageInfo.mActivityTitle));
                   }
                }
                uoc.G.setOnTabSelectListener(new g(uoc));
                if (uoc.F.a.needSwitchSelectTab()) {
                   uoc.Mh(uoc.F.a.mSelectTabIndex);
                }
             }
          }
          this.getChildFragmentManager().addOnBackStackChangedListener(new f(uoc));
          obj = uoc.K;
          if (obj > null && obj < uoc.F.a.mContainers.size()) {
             liveMerchant = uoc.K;
             uoc.K = -1;
          }else {
             i = 0;
          }
          uoc.G.P(liveMerchant);
          obj = uoc.L;
          if (obj != null) {
             b9.a(obj);
          }
          uoc.L = RxBus.f.f(a.class).subscribe(new h(uoc), new i(uoc));
          uoc.d8(this.getLaunchModel());
          return;
       }
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantHalfMixRnH5ContainerFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.getWindow().setSoftInputMode(48);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveMerchantHalfMixRnH5ContainerFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.d(p0, R.layout.arg_RES_7f0d04c8, p1, false);
       this.E = view;
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantHalfMixRnH5ContainerFragment.class, "19")) {
          return;
       }
       super.onDestroy();
       this.Ha(this.getLaunchModel());
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantHalfMixRnH5ContainerFragment.class, "18")) {
          return;
       }
       super.onDestroyView();
       this.Lh();
       b9.a(this.L);
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantHalfMixRnH5ContainerFragment.class, "9")) {
          return;
       }
       super.onSaveInstanceState(p0);
       p0.putInt("lastSaveTabPosition", this.I);
       return;
    }
    public String te(LaunchModel p0){
       return d.a(this, p0);
    }
}
