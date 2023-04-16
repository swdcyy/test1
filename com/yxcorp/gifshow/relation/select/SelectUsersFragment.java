package com.yxcorp.gifshow.relation.select.SelectUsersFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import com.yxcorp.gifshow.relation.select.model.SelectUsersTabData;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vbc.m;
import y8c.t;
import com.yxcorp.gifshow.relation.select.SelectUsersFragment$b;
import rbc.r;
import qvb.i;
import java.lang.Throwable;
import java.lang.Boolean;
import rbc.a;
import hka.l;
import hka.j;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import tbc.d;
import i2b.a;
import java.util.List;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.relation.select.SelectUsersTabHostFragment;
import com.yxcorp.gifshow.relation.select.SelectUsersTabHostFragment$c;
import java.util.Map;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.t;
import rbc.p;
import com.yxcorp.gifshow.relation.select.x;
import erd.g;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import br8.c;
import y8c.g;
import rbc.n;
import br8.b;
import br8.d;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.relation.select.w;
import androidx.recyclerview.widget.RecyclerView$q;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.relation.select.SelectUsersFragment$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.library.widget.refresh.RefreshLayout;
import rbc.o;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import com.yxcorp.gifshow.relation.select.model.SelectUsersConfigParams;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class SelectUsersFragment extends RecyclerFragment	// class@001987
{
    public SelectUsersBundle F;
    public SelectUsersTabData G;
    public a H;
    public b I;
    public boolean J;
    public static final int K;

    public void SelectUsersFragment(){
       super();
       this.F = new SelectUsersBundle();
       this.G = new SelectUsersTabData();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, SelectUsersFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new m(this));
       PatchProxy.onMethodExit(SelectUsersFragment.class, "10");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, SelectUsersFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SelectUsersFragment$b(this, this);
    }
    public r Gh(){
       Object obj = PatchProxy.apply(null, this, SelectUsersFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.q();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(SelectUsersFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, SelectUsersFragment.class, "14")) {
          return;
       }
       super.M1(p0, p1);
       SelectUsersFragment tH = this.H;
       if (tH != null) {
          tH.onError(p1);
       }
       return;
    }
    public boolean S0(){
       return false;
    }
    public boolean S1(){
       Object obj = PatchProxy.apply(null, this, SelectUsersFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.F.isHalfScreen()) {
          return false;
       }
       return j.b(this);
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(SelectUsersFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, SelectUsersFragment.class, "6")) {
          return;
       }
       super.Z1(p0, p1);
       if (this.F.isHalfScreen()) {
          this.sh().d(true);
       }
       return;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SelectUsersFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.F.isHalfScreen() && d.c(this.F)) {
          return a.h(p0, 0x7f0d050f, p1, false, 1);
       }
       return a.g(p0, 0x7f0d050f, p1, false);
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, SelectUsersFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       if (this.getParentFragment() instanceof SelectUsersTabHostFragment) {
          obj.add(this.getParentFragment().Sh());
       }
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d050f;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SelectUsersFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SelectUsersFragment.class, null);
       return objectsByTag;
    }
    public boolean mh(){
       Object obj = PatchProxy.apply(null, this, SelectUsersFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.F.isHalfScreen()) {
          return false;
       }
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectUsersFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          Serializable serializable = SerializableHook.getSerializable(this.getArguments(), "key_select_users_bundle");
          Serializable serializable1 = SerializableHook.getSerializable(this.getArguments(), "key_select_tab_data");
          if (serializable != null) {
             this.F = serializable;
          }
          if (serializable1 != null) {
             this.G = serializable1;
          }
          this.J = this.getArguments().getBoolean("key_select_is_multi_select");
       }
       this.I = new FragmentCompositeLifecycleState(this).j().subscribe(new p(this), x.b);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, SelectUsersFragment.class, "17")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.I);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SelectUsersFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       c uoc = new c(this.g7());
       d uod = new d(this.h0(), uoc);
       uod.e = w.a;
       this.h0().addOnItemTouchListener(uod);
       this.h0().addItemDecoration(uoc);
       this.h0().addOnScrollListener(new SelectUsersFragment$a(this, p0));
       this.Ac().setOnRefreshListener(new o(this));
       return;
    }
    public i q(){
       return this.Gh();
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(SelectUsersFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, SelectUsersFragment.class, "13")) {
          return;
       }
       super.v2(p0, p1);
       if (p0) {
          SelectUsersFragment tH = this.H;
          if (tH != null && tH.j9(this.Gh().V1())) {
             this.J = this.Gh().V1().isMultiSelect();
             n on = this.g7();
             on.y1(this.J);
             on.k0();
          }
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, SelectUsersFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       n on = new n(this.F.isHalfScreen(), this.J, this.H, d.c(this.F));
       on.x1(this.F.getLimitConditions());
       return on;
    }
    public i yh(){
       r obj = PatchProxy.apply(null, this, SelectUsersFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new r(this.F.getBizId(), this.G.tabType, this.F.getExtraParams());
       obj.q = this.F.isNeedUseCache();
       return obj;
    }
}
