package com.yxcorp.gifshow.aicut.ui.loading.AICutLoadingFragment;
import c35.i;
import com.kuaishou.viewbinder.IBaseViewHost;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.aicut.ui.loading.AICutLoadingFragment$a;
import nsd.u;
import com.kuaishou.viewbinder.IViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.aicut.ui.loading.AbsAICutLoadingViewBinder;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.aicut.ui.loading.AbsAICutLoadingViewBinder$a;
import android.os.Bundle;
import com.kuaishou.viewbinder.ViewBinderOption;
import c35.c;
import com.yxcorp.gifshow.aicut.ui.loading.DefaultAICutLoadingViewBinder;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import r69.g;
import java.lang.Boolean;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.List;
import r69.c;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import java.util.Collection;
import ekd.q;
import h69.g;
import w46.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.aicut.logic.b;
import r69.f;
import i69.d;
import j69.a;
import j69.c;
import com.yxcorp.gifshow.aicut.logic.b$a;
import i69.f;
import k69.f;
import brd.t;
import lnc.a1;
import java.lang.Iterable;
import t45.d;
import brd.z;
import r69.h;
import erd.o;
import r69.i;
import r69.j;
import erd.g;
import crd.b;
import crd.a;
import q87.c;
import java.util.concurrent.TimeUnit;
import r69.k;
import r69.l;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.models.QMedia;
import com.kuaishou.viewbinder.BaseViewBinder;
import r69.d;
import r69.b;
import s69.f;

public final class AICutLoadingFragment extends RxFragment implements i, IBaseViewHost	// class@00196f
{
    public g c;
    public String d;
    public String e;
    public String f;
    public d g;
    public b h;
    public AbsAICutLoadingViewBinder i;
    public static final AICutLoadingFragment$a j;

    static {
       AICutLoadingFragment.j = new AICutLoadingFragment$a(null);
    }
    public void AICutLoadingFragment(){
       super();
    }
    public IViewBinder O1(){
       AICutLoadingFragment uAICutLoadin = PatchProxy.apply(null, this, AICutLoadingFragment.class, "4");
       if (uAICutLoadin != PatchProxyResult.class) {
       }else {
          uAICutLoadin = this.i;
          if (uAICutLoadin == null) {
             a.S("mViewBinder");
          }
       }
       return uAICutLoadin;
    }
    public IViewBinder V5(int p0){
       return this.Vg(p0);
    }
    public AbsAICutLoadingViewBinder Vg(int p0){
       AbsAICutLoadingViewBinder$a obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(AICutLoadingFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, AICutLoadingFragment.class, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = AbsAICutLoadingViewBinder.o;
       FragmentActivity activity = this.getActivity();
       String str = null;
       Intent intent = (activity != null)? activity.getIntent(): str;
       Objects.requireNonNull(obj);
       AbsAICutLoadingViewBinder$a uoa = AbsAICutLoadingViewBinder$a.class;
       Object obj1 = PatchProxy.applyOneRefs(intent, obj, uoa, "2");
       if (obj1 != patchProxyRe) {
          str = obj1;
       }else if(intent == null){
          Bundle extras = intent.getExtras();
          String obj2 = PatchProxy.applyOneRefs(extras, obj, uoa, "1");
          if (obj2 != patchProxyRe) {
             str = obj2;
          }else if(extras == null){
             try{
                obj2 = extras.getString("_key_view_binder_scenario");
             }catch(java.lang.Exception e0){
                obj2 = "";
             }
             str = obj2;
          }
       }
       AbsAICutLoadingViewBinder$a o = AbsAICutLoadingViewBinder.o;
       Objects.requireNonNull(o);
       AbsAICutLoadingViewBinder uAbsAICutLoa = PatchProxy.applyThreeRefs(str, AbsAICutLoadingViewBinder.class, this, o, AbsAICutLoadingViewBinder$a.class, "3");
       if (uAbsAICutLoa != patchProxyRe) {
       }else {
          a.p(AbsAICutLoadingViewBinder.class, "absViewBinder");
          uAbsAICutLoa = ViewBinderOption.c(new ViewBinderOption(str), AbsAICutLoadingViewBinder.class, this, 0, 4, null);
       }
       if (uAbsAICutLoa == null) {
          uAbsAICutLoa = new DefaultAICutLoadingViewBinder(this);
       }
       return uAbsAICutLoa;
    }
    public Context host(){
       Object obj = PatchProxy.apply(null, this, AICutLoadingFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getContext();
    }
    public LifecycleOwner lifecycleOwner(){
       return this;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       boolean b;
       AICutLoadingFragment i1;
       AICutLoadingFragment b1;
       AICutLoadingFragment c;
       int i2;
       boolean b2;
       z a;
       Object[] objArray3;
       g og = this;
       String obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AICutLoadingFragment.class, "2");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       a.p(obj, "inflater");
       obj1 = g.class;
       Object[] objArray = null;
       Bundle obj2 = PatchProxy.apply(objArray, og, AICutLoadingFragment.class, "1");
       int i = 0;
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else {
          obj2 = this.getArguments();
          Serializable serializable = (obj2 != null)? SerializableHook.getSerializable(obj2, "intent_key_data_list"): objArray;
          Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.collections.List<com.yxcorp.gifshow.models.QMedia>");
          ViewModel viewModel = ViewModelProviders.of(og, new c(serializable)).get(obj1);
          a.o(viewModel, "ViewModelProviders.of\(th¡­ingViewModel::class.java\)");
          og.c = viewModel;
          if (q.f(serializable)) {
             Object[] objArray1 = new Object[i];
             g.D().t("AICutLoadingFragment", "init: dataList is Empty", objArray1);
             FragmentActivity activity = this.getActivity();
             if (activity != null) {
                activity.finish();
             }
             b = false;
          }else {
             Bundle arguments = this.getArguments();
             String str = (arguments != null)? arguments.getString("intent_key_extra"): objArray;
             Bundle arguments1 = this.getArguments();
             String str1 = (arguments1 != null)? arguments1.getString("intent_key_share_app"): objArray;
             og.d = str1;
             arguments1 = this.getArguments();
             str1 = (arguments1 != null)? arguments1.getString("intent_key_share_app_id"): objArray;
             og.e = str1;
             arguments1 = this.getArguments();
             String str2 = (arguments1 != null)? arguments1.getString("tag"): objArray;
             arguments1 = this.getArguments();
             str1 = (arguments1 != null)? arguments1.getString("pre_select_theme_id"): objArray;
             Bundle arguments2 = this.getArguments();
             int intx = (arguments2 != null)? arguments2.getInt("pre_select_template_type"): 0;
             Bundle arguments3 = this.getArguments();
             String str3 = (arguments3 != null)? arguments3.getString("pre_select_music_id"): objArray;
             Bundle arguments4 = this.getArguments();
             int intx1 = (arguments4 != null)? arguments4.getInt("pre_select_music_type"): 0;
             AICutLoadingFragment c1 = og.c;
             if (c1 == null) {
                a.S("mViewModel");
             }
             Objects.requireNonNull(c1);
             String str4 = "AICutLoadingViewModel";
             if (PatchProxy.isSupport(obj1) && PatchProxy.applyVoidFourRefs(str1, Integer.valueOf(intx), str3, Integer.valueOf(intx1), c1, g.class, "1")) {
             label_016a :
                obj = 1;
             }else if(TextUtils.x(str1) || c1.x0()){
                b2 = true;
             }else {
                b2 = false;
             }
             c1.h = b2;
             c1.p = new b(60.00f, new f(c1), d.d.a().c().I2());
             c1.a.v(str1, intx, str3, intx1);
             c1.a.d(c1.q);
             c1.a.start();
             if (PatchProxy.applyVoid(null, c1, obj1, "2")) {
                goto label_016a ;
             }else {
                z Object[] c2 = d.c;
                a = d.a;
                b uob = t.fromIterable(c1.r).subscribeOn(c2).flatMap(new h(a1.e(45.00f))).observeOn(a).subscribe(new i(c1), j.b);
                c1.n = uob;
                if (uob != null) {
                   c1.m.c(uob);
                }
                if (c1.r.size() == 1 && c1.l != null) {
                   c2 = new Object[0];
                   g.D().w(str4, "playImages only one image", c2);
                }else {
                   c1.m.c(t.interval(1500, TimeUnit.MILLISECONDS).subscribeOn(c2).observeOn(a).subscribe(new k(c1), l.b));
                }
             }
             c = og.c;
             if (c == null) {
                a.S("mViewModel");
             }
             i1 = og.d;
             b1 = og.e;
             Objects.requireNonNull(c);
             obj = str2;
             if (PatchProxy.applyVoidFourRefs(i1, b1, str, str2, c, g.class, "11")) {
                i2 = 0;
             }else {
                i2 = 0;
                Object[] objArray2 = new Object[i2];
                g.D().s(str4, "setThirdAppInfo\(\) called with: shareApp = ["+i1+"], "+b1+"extraInfo = ["+str+"], tag = ["+obj+']', objArray2);
                c.a.u(i1, b1, str, obj);
             }
             og.f = serializable.get(i2).path;
             b = true;
          }
       }
       if (!b) {
          return null;
       }else {
          AbsAICutLoadingViewBinder uAbsAICutLoa = og.Vg(-1);
          og.i = uAbsAICutLoa;
          if (uAbsAICutLoa == null) {
             a.S("mViewBinder");
          }
          i1 = og.i;
          if (i1 == null) {
             a.S("mViewBinder");
          }
          uAbsAICutLoa.bindViews(i1.getBindedView(p0, p1, p2));
          i1 = og.i;
          if (i1 == null) {
             a.S("mViewBinder");
          }
          b1 = og.c;
          if (b1 == null) {
             a.S("mViewModel");
          }
          AICutLoadingFragment f = og.f;
          a.m(f);
          og.g = new d(i1, b1, og, f);
          c = og.c;
          if (c == null) {
             a.S("mViewModel");
          }
          if (c.h != null) {
             i1 = og.i;
             if (i1 == null) {
                a.S("mViewBinder");
             }
             b1 = og.c;
             if (b1 == null) {
                a.S("mViewModel");
             }
             og.h = new b(i1, b1, og);
          }
          c = og.i;
          if (c == null) {
             a.S("mViewBinder");
          }
          return c.d;
       }
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AICutLoadingFragment.class, "6")) {
          return;
       }
       super.onResume();
       AICutLoadingFragment th = this.h;
       if (th != null && !PatchProxy.applyVoid(objArray, th, b.class, "1")) {
          th.b = true;
          if (th.a != null) {
             th.a = false;
             f.a.a(true, true);
          }
       }
       return;
    }
}
