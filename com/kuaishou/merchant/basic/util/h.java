package com.kuaishou.merchant.basic.util.h;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.kuaishou.merchant.api.core.LiveMerchantSkin;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import java.lang.Number;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.io.File;
import com.kuaishou.merchant.api.core.LiveMerchantSkin$Resource;
import android.content.Context;
import lnc.a1;
import com.kuaishou.merchant.api.core.LiveMerchantSkin$Config;
import ot3.x;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import gr8.a;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import brd.x;
import ot3.w;
import com.kuaishou.merchant.basic.util.g;
import erd.g;
import crd.b;
import android.view.Window;
import java.lang.Integer;
import android.view.WindowManager$LayoutParams;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import java.lang.Float;
import lnc.l1;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import et3.a;
import com.kuaishou.merchant.basic.foldadapter.LiveMerchantFoldWrapperActivity;
import com.kuaishou.merchant.basic.util.FoldUtils;

public class h	// class@0015dd
{

    public void h(){
       super();
    }
    public static boolean a(Fragment p0,View p1,LiveMerchantSkin p2,boolean p3){
       FragmentActivity obj;
       int i;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, h.class, "16");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (p2 != null && (!p2.isMerchantPageUseSkin() || p1 == null)) {
          return false;
       }else {
          obj = p0.getActivity();
          if (p3) {
             i = h.f();
          }else {
             Object obj3 = PatchProxy.applyOneRefs(obj, null, oh, "12");
             i = (obj3 != patchProxyRe)? obj3.intValue(): n.k(obj);
          }
          if (p3) {
             Object obj1 = PatchProxy.applyOneRefs(obj, null, oh, "11");
             i1 = (obj1 != patchProxyRe)? obj1.intValue(): n.j(obj);
          }else {
             i1 = h.g(obj);
          }
          File file = (p3 && p2.mLiveMerchantPageBackgroundLandscape.getFile().exists())? p2.mLiveMerchantPageBackgroundLandscape.getFile(): p2.mLiveMerchantPageBackground.getFile();
          int paddingLeft = p1.getPaddingLeft();
          Object obj2 = PatchProxy.applyOneRefs(p2, null, oh, "18");
          int i2 = (obj2 != patchProxyRe)? obj2.intValue(): n.c(a1.c(), (float)p2.mConfig.mPageBackgroundTopMargin);
          p1.setPadding(paddingLeft, i2, p1.getPaddingRight(), p1.getPaddingBottom());
          t.fromCallable(new x(file, i, i1)).subscribeOn(d.c).observeOn(d.a).compose(p0.T8(FragmentEvent.DESTROY_VIEW)).subscribe(new w(p1), g.b);
          return true;
       }
    }
    public static void b(Fragment p0,Window p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, h.class, "4")) {
          return;
       }
       h.c(p0, p1, h.g(p0.getActivity()));
       return;
    }
    public static void c(Fragment p0,Window p1,int p2){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, h.class, "6")) {
          return;
       }
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.FALSE,Integer.valueOf(p2),null};
          if (PatchProxy.applyVoid(objArray, null, oh, "8")) {
          label_0072 :
             return;
          }
       }
       boolean b = n.I(p0.getActivity());
       WindowManager$LayoutParams attributes = p1.getAttributes();
       h.a(p0, p0.getView(), null, b);
       int i = -1;
       if (b) {
          attributes.width = h.f();
          attributes.height = i;
       }else {
          attributes.width = i;
          attributes.height = p2;
       }
       p1.setAttributes(attributes);
       i = (b)? 21: 81;
       p1.setGravity(i);
       goto label_0072 ;
    }
    public static void d(BottomSheetFragment p0,float p1,int p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), null, h.class, "2")) {
          return;
       }
       h.e(p0, null, null, p1, p2);
       return;
    }
    public static void e(BottomSheetFragment p0,View p1,LiveMerchantSkin p2,float p3,int p4){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,p1,p2,Float.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, oh, "3")) {
             return;
          }
       }
       FragmentActivity activity = p0.getActivity();
       boolean b = l1.a();
       p0.Gh(1);
       p0.Ah(0);
       p0.zh(0);
       h.a(p0, p1, p2, b);
       if (b) {
          p0.yh(h.f());
          p0.xh(0);
       }else {
          p0.xh(h.h(activity, p3, p4));
          p0.yh(0);
       }
       return;
    }
    public static int f(){
       Object obj = PatchProxy.apply(null, null, h.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070898);
    }
    public static int g(Activity p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, oh, "13");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       if (PatchProxy.isSupport(oh)) {
          Object obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(0), null, oh, "14");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          label_0034 :
             return i;
          }
       }
       i = h.h(p0, a.a, 0);
       goto label_0034 ;
    }
    public static int h(Activity p0,float p1,int p2){
       if (PatchProxy.isSupport(h.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), null, h.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 instanceof LiveMerchantFoldWrapperActivity && !FoldUtils.a(p0)) {
          return n.j(p0);
       }else if(p1 <= 0){
          p1 = a.a;
       }
       int i = (int)((float)n.j(p0) * p1);
       if (i <= 0) {
          i = a1.d(R.dimen.arg_RES_7f070899);
       }
       return (i + p2);
    }
}
