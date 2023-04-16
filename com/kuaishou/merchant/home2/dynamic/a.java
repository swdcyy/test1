package com.kuaishou.merchant.home2.dynamic.a;
import cb5.g;
import com.kuaishou.merchant.home2.dynamic.MerchantMallFragment;
import android.view.View;
import com.google.gson.JsonElement;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fg6.a;
import jx3.a;
import com.google.gson.Gson;
import java.lang.Boolean;
import java.util.ArrayList;
import zf6.k;
import com.kuaishou.merchant.home2.dynamic.atmosphere.model.ChunkInfo;
import java.util.List;
import java.lang.Integer;
import android.graphics.Color;
import java.util.Locale;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.lifecycle.LifecycleOwner;
import hx3.h;
import androidx.lifecycle.Observer;
import b04.d;
import androidx.fragment.app.Fragment;
import wq6.d;
import as6.a;
import zq6.r;
import bo5.a;
import zq6.p;
import un5.b;
import pn5.a;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import lnc.a1;
import com.yxcorp.utility.TextUtils;
import gsa.e0;
import gsa.e0$a;
import com.kwai.framework.model.kcube.ActionBarSkinConfig;
import wq6.h;
import java.lang.CharSequence;
import tyc.o5;
import pua.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;

public class a extends g	// class@001719
{
    public d t;
    public MerchantMallFragment u;
    public boolean v;
    public e0 w;
    public Boolean x;
    public Integer y;

    public void a(MerchantMallFragment p0,View p1){
       super(p1);
       this.v = false;
       this.u = p0;
    }
    public static void X8(a p0,JsonElement p1){
       boolean b;
       boolean b1;
       try{
          Objects.requireNonNull(p0);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          a uoa = a.class;
          if (PatchProxy.applyVoidOneRefs(p1, p0, uoa, "5")) {
          }else {
             a uoa1 = a.a.c(p1, a.class);
             if (uoa1 != null) {
                a obj = PatchProxy.applyOneRefs(uoa1, p0, uoa, "7");
                int i = 0;
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else {
                   obj = uoa1.darkModeAtmosphere;
                   b = (obj != null && (!obj.isEmpty() && k.d()))? true: false;
                }
                Object obj1 = PatchProxy.applyOneRefs(uoa1, p0, uoa, "8");
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else if(uoa1.ceilingAtmosphere != null){
                   Object obj2 = PatchProxy.applyOneRefs(uoa1, p0, uoa, "6");
                   if (obj2 != patchProxyRe) {
                      b1 = obj2.booleanValue();
                   }else {
                      ChunkInfo bgColors = uoa1.ceilingAtmosphere.bgColors;
                      b1 = (bgColors != null && !bgColors.isEmpty())? true: false;
                   }
                   if (b1) {
                      i = 1;
                   }
                }
                b1 = i;
                if (b || b1) {
                   p0.a9(uoa1.ceilingAtmosphere, b);
                }else {
                   p0.Y8();
                }
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static String b9(int p0){
       Locale obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoa, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = Color.alpha(p0);
       int i1 = Color.red(p0);
       int i2 = Color.green(p0);
       p0 = Color.blue(p0);
       int i3 = 3;
       if (!i) {
          obj = Locale.US;
          Object[] objArray = new Object[i3];
          objArray[0] = Integer.valueOf(i1);
          objArray[1] = Integer.valueOf(i2);
          objArray[2] = Integer.valueOf(p0);
          return (String.format(obj, "#%02x%02x%02x", objArray)).toUpperCase(obj);
       }else {
          Locale uS = Locale.US;
          Object[] objArray1 = new Object[]{Integer.valueOf(i),Integer.valueOf(i1),Integer.valueOf(i2),Integer.valueOf(p0)};
          return (String.format(uS, "#%02x%02x%02x%02x", objArray1)).toUpperCase(uS);
       }
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       super.E8();
       this.t.H0(this.getActivity(), new h(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       super.J8();
       this.t.O0(new h(this));
       return;
    }
    public boolean W8(){
       return true;
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       if (this.v == null) {
          return;
       }
       a tu = this.u;
       if (tu != null && !tu.isDetached()) {
          d uod = a.e(this.u);
          if (uod == null) {
             return;
          }else {
             r or = uod.e0();
             if (or == null) {
                return;
             }else {
                or.a(a.e, this.w);
                or.a(b.a, this.x);
                or.a(a.e, this.y);
             }
          }
       }
       return;
    }
    public final int Z8(ChunkInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       p0 = p0.bgColors;
       if (q.f(p0)) {
          return i;
       }
       return TextUtils.J(p0.get(i), a1.a(0x7f062057));
    }
    public final void a9(ChunkInfo p0,boolean p1){
       int i2;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "9")) {
          return;
       }
       a tu = this.u;
       if (tu != null && !tu.isDetached()) {
          d uod = a.e(this.u);
          if (uod == null) {
             return;
          }else {
             r or = uod.e0();
             if (or == null) {
                return;
             }else if(this.v == null){
                this.v = true;
                this.w = or.d(a.e);
                this.x = or.d(b.a);
                this.y = or.d(a.e);
             }
             int i = 0x7f0620ea;
             if (p1) {
                if (!PatchProxy.applyVoidTwoRefs(uod, or, this, uoa, "11")) {
                   e0$a uoa1 = this.w.a();
                   int i1 = a1.a(R.color.arg_RES_7f061e52);
                   i2 = a1.a(R.color.arg_RES_7f061e52);
                   ActionBarSkinConfig uActionBarSk = new ActionBarSkinConfig();
                   uActionBarSk.mHomeActionBarTriangleColor = a.b9(i2);
                   uActionBarSk.mHomeActionBarIndicatorColor = a.b9(i1);
                   uod.r("KEY_TAB_ACTION_SKIN", uActionBarSk);
                   uoa1.a(true);
                   uoa1.Q(a1.a(i), a1.a(R.color.arg_RES_7f061e52));
                   uoa1.P(i1);
                   or.a(a.e, uoa1.d());
                   or.a(b.a, Boolean.FALSE);
                   or.a(a.e, Integer.valueOf(i2));
                }
             }else if(PatchProxy.applyVoidThreeRefs(p0, uod, or, this, a.class, "10")){
                e0$a uoa2 = this.w.a();
                int i3 = 0x7f061d77;
                i2 = (p0.isDarkMode != null)? a1.a(R.color.arg_RES_7f061e52): a1.a(i3);
                int i4 = (p0.isDarkMode != null)? a1.a(R.color.arg_RES_7f061e52): a1.a(i3);
                ActionBarSkinConfig uActionBarSk1 = new ActionBarSkinConfig();
                uActionBarSk1.mHomeActionBarTriangleColor = a.b9(i4);
                uActionBarSk1.mHomeActionBarIndicatorColor = a.b9(i2);
                if (p0.type != null && !TextUtils.x(p0.skinResource)) {
                   uActionBarSk1.mActionBarBgUrl = p0.skinResource;
                }
                uod.r("KEY_TAB_ACTION_SKIN", uActionBarSk1);
                p e = a.e;
                uoa2.h(new o5(p0.skinResource, this.Z8(p0), "bottom"));
                uoa2.L(this.Z8(p0));
                uoa2.a(p0.isDarkMode);
                if (p0.isDarkMode == null) {
                   i = 0x7f061d96;
                }
                int i5 = a1.a(i);
                i3 = (p0.isDarkMode != null)? a1.a(R.color.arg_RES_7f061e52): a1.a(i3);
                uoa2.Q(i5, i3);
                uoa2.P(i2);
                or.a(e, uoa2.d());
                or.a(b.a, Boolean.valueOf((p0.isDarkMode ^ true)));
                or.a(a.e, Integer.valueOf(i4));
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, a.class, "2");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.j8();
       this.t = d.J0(this.getActivity());
       return;
    }
}
