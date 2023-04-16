package com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment;
import dgd.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Long;
import android.widget.TextView;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.Context;
import brd.t;
import y56.a;
import t45.d;
import brd.z;
import com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment$d;
import erd.g;
import crd.b;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import lnc.b9;
import java.util.HashMap;
import qvb.n0;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import ekd.m1;
import x56.d;
import java.lang.reflect.Type;
import com.kwai.framework.cache.initmodule.CheckDiskModule;
import com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment$b;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import z8c.a;
import o56.c;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import lnc.a1;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.graphics.drawable.Drawable;
import zf6.j;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Number;
import java.util.Objects;
import android.view.WindowManager;
import android.view.Display;
import com.yxcorp.gifshow.util.rx.RxBus;
import bgd.e;
import com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment$c;
import y8c.g;
import cgd.f;
import qvb.i;
import com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment$a;
import bgd.c;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class ClearCacheNewUiFragment extends RecyclerFragment implements a	// class@000837
{
    public KwaiActionBar F;
    public LinearLayout G;
    public LinearLayout H;
    public LinearLayout I;
    public LinearLayout J;
    public TextView K;
    public TextView L;
    public TextView M;
    public ClearCacheNewUiFragment$a N;
    public float O;
    public float P;
    public double Q;
    public final String R;
    public final Long[] S;
    public b T;
    public HashMap U;

    public void ClearCacheNewUiFragment(){
       super();
       this.R = "topCacheActivityClickCount";
       int i = a.t().a("topCacheActivityClickCount", 5);
       Long[] longArray = new Long[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          longArray[i1] = Long.valueOf(0);
       }
       this.S = longArray;
       return;
    }
    public static final TextView Gh(ClearCacheNewUiFragment p0){
       p0 = p0.L;
       if (p0 == null) {
          a.S("mAppDiskSizeTextView");
       }
       return p0;
    }
    public static final LinearLayout Hh(ClearCacheNewUiFragment p0){
       p0 = p0.H;
       if (p0 == null) {
          a.S("mKuaishouUsedSpaceView");
       }
       return p0;
    }
    public static final LinearLayout Ih(ClearCacheNewUiFragment p0){
       p0 = p0.I;
       if (p0 == null) {
          a.S("mOtherUsedSpaceView");
       }
       return p0;
    }
    public static final LinearLayout Jh(ClearCacheNewUiFragment p0){
       p0 = p0.J;
       if (p0 == null) {
          a.S("mSystemAvailableSpaceView");
       }
       return p0;
    }
    public final int Kh(int p0){
       return (int)(((float)p0 * this.O) + 0x3f000000);
    }
    public int M(){
       return 1;
    }
    public float R9(){
       return 0;
    }
    public boolean S1(){
       return false;
    }
    public final void We(){
       if (PatchProxy.applyVoid(null, this, ClearCacheNewUiFragment.class, "5")) {
          return;
       }
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       a.b(uApplication).subscribeOn(d.c).observeOn(d.a).subscribe(new ClearCacheNewUiFragment$d(this));
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d04a7;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClearCacheNewUiFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ClearCacheNewUiFragment.class, null);
       return objectsByTag;
    }
    public String o(){
       return "SECOND_STORAGE_SETTING_PAGE";
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ClearCacheNewUiFragment.class, "2")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.T);
       if (!PatchProxy.applyVoid(null, this, ClearCacheNewUiFragment.class, "9")) {
          ClearCacheNewUiFragment tU = this.U;
          if (tU != null) {
             tU.clear();
          }
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, ClearCacheNewUiFragment.class, "3")) {
          return;
       }
       super.onResume();
       ClearCacheNewUiFragment tN = this.N;
       if (tN == null) {
          a.S("mLocalPageList");
       }
       if (tN != null) {
          tN.a();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       ClearCacheNewUiFragment tG;
       float f;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClearCacheNewUiFragment.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       view = m1.f(p0, R.id.space_head_layout);
       a.o(view, "ViewBindUtils.bindWidget¡­, R.id.space_head_layout\)");
       this.G = view;
       d value = a.t().getValue("LOW_DISK_MODE_CONFIG", d.class, null);
       CheckDiskModule.t = value;
       if (value != null && value.hideAppTotalDiskSize != null) {
          tG = this.G;
          if (tG == null) {
             a.S("mHeadView");
          }
          tG.setVisibility(8);
       }
       view = m1.f(p0, R.id.space_used_by_kuaishou_layout);
       a.o(view, "ViewBindUtils.bindWidget¡­_used_by_kuaishou_layout\)");
       this.H = view;
       view = m1.f(p0, R.id.space_used_elsewhere_layout);
       a.o(view, "ViewBindUtils.bindWidget¡­ce_used_elsewhere_layout\)");
       this.I = view;
       view = m1.f(p0, R.id.space_remain_on_the_phone_layout);
       a.o(view, "ViewBindUtils.bindWidget¡­main_on_the_phone_layout\)");
       this.J = view;
       view = m1.f(p0, R.id.kuaishou_app_disk_tip_text);
       a.o(view, "ViewBindUtils.bindWidget¡­aishou_app_disk_tip_text\)");
       this.K = view;
       view = m1.f(p0, R.id.kuaishou_app_disk_space_text);
       a.o(view, "ViewBindUtils.bindWidget¡­shou_app_disk_space_text\)");
       this.L = view;
       if (view == null) {
          a.S("mAppDiskSizeTextView");
       }
       view.setOnClickListener(new ClearCacheNewUiFragment$b(this));
       view = m1.f(p0, R.id.space_kuaishou_used_proportion);
       a.o(view, "ViewBindUtils.bindWidget¡­kuaishou_used_proportion\)");
       this.M = view;
       a uoa = new a(1, false, false);
       uoa.m(n.c(a.a().a(), 18.00f));
       this.h0().addItemDecoration(uoa);
       view = m1.f(p0, R.id.title_root);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.title_root\)");
       this.F = view;
       value = CheckDiskModule.t;
       String str = (value != null && value.enableLowDiskModeAutoClear != null)? a1.p(R.string.arg_RES_7f104ab8): a1.p(R.string.arg_RES_7f1005ac);
       if (!TextUtils.isEmpty(str)) {
          ClearCacheNewUiFragment tF = this.F;
          String str1 = "mActionBar";
          if (tF == null) {
             a.S(str1);
          }
          tF.j(j.n(this.getActivity(), R.drawable.arg_RES_7f08068e, 0x7f060148));
          tF = this.F;
          if (tF == null) {
             a.S(str1);
          }
          tF.r(str);
          tG = this.F;
          if (tG == null) {
             a.S(str1);
          }
          tG.m(-1);
       }
       Resources resources = p0.getResources();
       a.o(resources, "view.resources");
       this.O = c.c(resources).density;
       resources = PatchProxy.apply(null, this, ClearCacheNewUiFragment.class, "4");
       if (resources != PatchProxyResult.class) {
          f = resources.floatValue();
       }else {
          DisplayMetrics uDisplayMetr = new DisplayMetrics();
          Object systemServic = a.b().getSystemService("window");
          Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.view.WindowManager");
          systemServic.getDefaultDisplay().getMetrics(uDisplayMetr);
          f = (float)this.Kh(6) / (float)(uDisplayMetr.widthPixels - this.Kh(42));
       }
       this.P = f;
       this.We();
       this.T = RxBus.f.f(e.class).observeOn(d.a).subscribe(new ClearCacheNewUiFragment$c(this));
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, ClearCacheNewUiFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f();
    }
    public i yh(){
       String str;
       String str1;
       ClearCacheNewUiFragment$a obj = PatchProxy.apply(null, this, ClearCacheNewUiFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c[] uocArray = new c[]{new c(0, str, "0MB", str1),new c(1, str, "0MB", str1)};
       str = a1.p(R.string.arg_RES_7f100476);
       a.o(str, "CommonUtil.string\(R.string.caches\)");
       str1 = a1.p(R.string.arg_RES_7f1005b9);
       a.o(str1, "CommonUtil.string\(\n     ¡­_use_kuaishou\n          \)");
       str = a1.p(R.string.arg_RES_7f100ac6);
       a.o(str, "CommonUtil.string\(R.string.draft_box\)");
       str1 = a1.p(R.string.arg_RES_7f1005b5);
       a.o(str1, "CommonUtil.string\(R.stri¡­that_no_longer_published\)");
       obj = new ClearCacheNewUiFragment$a(CollectionsKt__CollectionsKt.L(uocArray));
       this.N = obj;
       return obj;
    }
}
