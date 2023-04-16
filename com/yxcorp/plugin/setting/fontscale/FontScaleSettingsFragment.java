package com.yxcorp.plugin.setting.fontscale.FontScaleSettingsFragment;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import com.yxcorp.plugin.setting.fontscale.FontScaleHelper;
import com.yxcorp.plugin.setting.fontscale.FontScaleSettingsFragment$a;
import com.yxcorp.plugin.setting.fontscale.FontScaleFollowSystemStatus;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;
import mgd.b;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.robust.PatchProxyResult;
import xgc.f;
import xgc.f$a;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import java.util.Objects;
import wgc.c;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.List;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import nsd.u;
import ngd.c;
import ngd.b;
import qrd.l1;
import mgd.i;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;

public final class FontScaleSettingsFragment extends EntryListFragment	// class@0008a6
{
    public b t;
    public PresenterV2 u;
    public f v;
    public boolean w;
    public final SlipSwitchButton$c x;
    public HashMap y;

    public void FontScaleSettingsFragment(){
       super();
       this.w = FontScaleHelper.e();
       this.x = new FontScaleSettingsFragment$a(this);
    }
    public int M(){
       return 1;
    }
    public final void gh(FontScaleFollowSystemStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FontScaleSettingsFragment.class, "8")) {
          return;
       }
       boolean b = (p0 == FontScaleFollowSystemStatus.OPEN)? true: false;
       this.w = b;
       FontScaleSettingsFragment tt = this.t;
       if (tt != null) {
          PublishSubject publishSubje = tt.a();
          if (publishSubje != null) {
             publishSubje.onNext(p0);
          }
       }
       return;
    }
    public String o(){
       return "FONT_SETTING";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FontScaleSettingsFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.eh(R.string.arg_RES_7f101043);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, FontScaleSettingsFragment.class, "5")) {
          f uof = PatchProxy.apply(objArray, this, FontScaleSettingsFragment.class, "6");
          if (uof != PatchProxyResult.class) {
          }else {
             f$a uoa = new f$a().c(0, this.getString(R.string.arg_RES_7f101045), null, null, R.drawable.arg_RES_7f081083);
             uoa.a.c = this.x;
             uof = uoa.e(this.w).a();
             a.o(uof, "BaseSwitchEntryHolder.Bu¡­mStatus\)\n        .build\(\)");
          }
          this.v = uof;
          Objects.requireNonNull(uof, "null cannot be cast to non-null type com.yxcorp.gifshow.settings.holder.EntryHolder<*>");
          c[] uocArray = new c[]{uof};
          this.dh(CollectionsKt__CollectionsKt.r(uocArray));
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FontScaleSettingsFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d047c, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, FontScaleSettingsFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       FontScaleSettingsFragment tu = this.u;
       if (tu != null) {
          tu.destroy();
       }
       if (!PatchProxy.applyVoid(null, this, FontScaleSettingsFragment.class, "12")) {
          tu = this.y;
          if (tu != null) {
             tu.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FontScaleSettingsFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       b uob = PatchProxy.apply(objArray, this, FontScaleSettingsFragment.class, "9");
       if (uob != patchProxyRe) {
       }else {
          b uob1 = new b(this, null, null, null, 14, null);
       }
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(objArray, this, FontScaleSettingsFragment.class, "10");
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new c());
          presenterV2.U7(new b());
          PatchProxy.onMethodExit(FontScaleSettingsFragment.class, "10");
       }
       presenterV2.f(p0);
       Object[] objArray1 = new Object[]{uob};
       presenterV2.i(objArray1);
       this.u = presenterV2;
       PublishSubject publishSubje = uob.b();
       if (!PatchProxy.applyVoidOneRefs(publishSubje, this, FontScaleSettingsFragment.class, "7")) {
          publishSubje.subscribe(new i(this), Functions.e);
       }
       this.t = uob;
       return;
    }
}
