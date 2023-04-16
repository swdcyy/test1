package com.kwai.nearby.local.container.NearbySecondaryContainerFragment;
import qb5.e;
import com.kwai.nearby.item.NearbyItemFragment;
import com.yxcorp.gifshow.action.RealActionBizType;
import vc7.k0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yc7.g;
import y8c.t;
import jrb.c;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.nearby.local.presenter.secondary.RecycleItemRecoRealShowPresenter;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.i;
import wh5.c;
import com.kwai.nearby.tab.presenter.NearbyItemRefreshPresenter;
import dd7.i1;
import dd7.a;
import com.kwai.nearby.local.presenter.secondary.a;
import xc7.a;
import com.kwai.nearby.local.presenter.secondary.c;
import com.kwai.nearby.local.presenter.secondary.e;
import ed7.g;
import java.lang.Number;
import java.lang.Throwable;
import qb5.d;
import pd7.a;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.View;
import v1b.d;
import android.os.Bundle;
import krb.a;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import tw5.d;
import qb5.b;
import db5.c;
import androidx.recyclerview.widget.RecyclerView$r;
import ekd.m1;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import xc7.h;
import java.util.Map;
import urb.a;
import java.util.List;
import im8.c;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import yc7.f;
import android.content.Intent;
import android.app.Activity;
import kotlin.jvm.internal.a;
import android.net.Uri;
import ekd.x0;
import yc7.e;
import com.kwai.component.feedstaggercard.model.CardStyle;
import dd7.e;
import q99.a;
import com.yxcorp.gifshow.model.LivePlayConfig;
import java.lang.reflect.Type;
import kn4.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import y8c.g;
import vc7.e0;
import on5.b;
import java.lang.Boolean;
import com.kwai.kcube.TabIdentifier;
import a9c.e;
import pa5.n;
import com.kwai.component.photo.reduce.f;
import com.kwai.nearby.local.container.NearbySecondaryContainerFragment$a;
import ha5.e;
import em6.a;
import vm5.o;
import com.kwai.nearby.local.utils.d;
import java.lang.Integer;
import mrd.a;
import qvb.i;
import qvb.n0;
import sc7.i0;

public class NearbySecondaryContainerFragment extends NearbyItemFragment implements e	// class@000f84
{
    public int J;
    public CardStyle K;
    public c L;
    public a M;
    public k0 N;
    public CustomRecyclerView O;
    public g P;

    public void NearbySecondaryContainerFragment(){
       super();
       this.J = 1;
       this.L = RealActionBizType.LOCAL;
       this.N = new k0();
    }
    public PresenterV2 Bd(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, NearbySecondaryContainerFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       this.P.createLazyPresenterExtra(obj);
       PatchProxy.onMethodExit(NearbySecondaryContainerFragment.class, "12");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, NearbySecondaryContainerFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this);
    }
    public void Gh(){
       if (PatchProxy.applyVoid(null, this, NearbySecondaryContainerFragment.class, "7")) {
          return;
       }
       super.Gh();
       this.H.U7(new RecycleItemRecoRealShowPresenter("NEARBY"));
       this.H.U7(new i(c.b(), "n"));
       this.H.U7(new NearbyItemRefreshPresenter());
       this.H.U7(new i1());
       this.H.U7(new a(false));
       this.H.U7(new a());
       if (this.P.a().c != null) {
          this.H.U7(new c());
          this.H.U7(new e());
       }
       this.H.U7(new g());
       this.P.createItemPresenterExtra(this.H);
       return;
    }
    public int Ih(){
       Object obj = PatchProxy.apply(null, this, NearbySecondaryContainerFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.P.a().b;
    }
    public void Jc(boolean p0,boolean p1,Throwable p2){
       d.a(this, p0, p1, p2);
    }
    public void Jh(){
       if (PatchProxy.applyVoid(null, this, NearbySecondaryContainerFragment.class, "4")) {
          return;
       }
       super.Jh();
       this.G.b = 0;
       return;
    }
    public void N1(){
       if (PatchProxy.applyVoid(null, this, NearbySecondaryContainerFragment.class, "13")) {
          return;
       }
       this.O.scrollToPosition(0);
       d.a(this.Ac());
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, NearbySecondaryContainerFragment.class, "15")) {
          return;
       }
       super.a();
       return;
    }
    public RecyclerFragment a1(){
       return this;
    }
    public int f(){
       return 0;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NearbySecondaryContainerFragment.class, "5")) {
          return;
       }
       this.G.j = a.b().a(LocalDelegateType.HOME_LOCAL);
       super.fh(p0, p1);
       new b(this).b();
       this.h0().addOnScrollListener(c.b);
       this.O = m1.f(p0, 0x7f0a34da);
       return;
    }
    public int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, NearbySecondaryContainerFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.P.a().a;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NearbySecondaryContainerFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, NearbySecondaryContainerFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(NearbySecondaryContainerFragment.class, new h());
       }else {
          obj.put(NearbySecondaryContainerFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 0;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, NearbySecondaryContainerFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().e;
    }
    public String getUrl(){
       return null;
    }
    public List h(){
       Object[] obj = PatchProxy.apply(null, this, NearbySecondaryContainerFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{this,this.G,new c("FRAGMENT", this)};
       return Lists.e(obj);
    }
    public void l8(){
       d.b(this);
    }
    public boolean lh(){
       return true;
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, NearbySecondaryContainerFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.P.a().d;
    }
    public void onCreate(Bundle p0){
       e uoe1;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbySecondaryContainerFragment.class, str)) {
          return;
       }
       super.onCreate(p0);
       FragmentActivity activity = this.getActivity();
       e uoe = null;
       Object obj = PatchProxy.applyOneRefs(activity, uoe, f.class, str);
       if (obj != PatchProxyResult.class) {
       }else if(activity != null){
          Intent intent = activity.getIntent();
          a.o(intent, "activity.intent");
          String str1 = x0.a(intent.getData(), "secondaryStreamType");
          if (str1 != null) {
             int i = str1.hashCode();
             if (i != 50) {
                if (i == 51 && str1.equals("3")) {
                   uoe1 = new e();
                }
             }else if(str1.equals("2")){
                uoe1 = new e();
             }
             uoe = uoe1;
          }
       }
    label_0061 :
       obj = uoe;
       this.P = obj;
       if (obj == null && this.getActivity() != null) {
          this.getActivity().finish();
          return;
       }else {
          this.K = e.g(this);
          this.M = new a(this, a.b(LivePlayConfig.class), 5);
          return;
       }
    }
    public g vh(){
       Object[] objArray = null;
       e0 obj = PatchProxy.apply(objArray, this, NearbySecondaryContainerFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray1 = new Object[]{Boolean.FALSE,this.M};
       obj = new e0(b.d, this, this.F, objArray1);
       obj.x1(this.K);
       obj.z1(new f(this));
       obj.y1(new NearbySecondaryContainerFragment$a(this));
       obj.n1("HOME_RECYCLE_VIEW_SCROLL_STATE", this.G.g);
       obj.n1("RECYCLERVIEW_LAYOUT_COMPLETE", Boolean.valueOf(this.G.k));
       a uoa = this.P.a();
       obj.n1("PAGE_NAME", uoa.f);
       obj.n1("REDESIGN_PAGE", e.i(this));
       obj.n1("PHOTO_DETAIL_PARAM_PROCESSOR", d.a(this, objArray));
       obj.n1("LOCAL_SAME_STREAM_SLIDE_PLAY", Boolean.valueOf(uoa.e));
       a g = this.P.a().g;
       if (g != null) {
          obj.n1("CLICK_LIVE_SOURCE_TYPE", Integer.valueOf(g));
       }
       return obj;
    }
    public void y2(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbySecondaryContainerFragment.class, "16")) {
          return;
       }
       super.y2(p0);
       this.G.i.onNext(p0);
       return;
    }
    public i yh(){
       i0 oi0 = PatchProxy.apply(null, this, NearbySecondaryContainerFragment.class, "6");
       if (oi0 != PatchProxyResult.class) {
       }else {
          oi0 = new i0(this.getActivity(), this.N);
       }
       return oi0;
    }
}
