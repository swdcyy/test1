package com.yxcorp.gifshow.relation.select.SelectFriendPanelFragment;
import wbc.a;
import rbc.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.relation.select.model.SelectUsersConfigParams;
import ubc.a;
import com.yxcorp.gifshow.relation.select.SelectUsersActivity$a;
import ubc.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.select.SelectUsersTabHostFragment;
import android.app.Activity;
import java.util.Set;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import com.yxcorp.gifshow.relation.select.y;
import java.util.Objects;
import com.yxcorp.gifshow.relation.select.y$a;
import qa9.q;
import android.content.Intent;
import android.os.Parcelable;
import org.parceler.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.relation.select.search.SearchBarFragment;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.view.View;
import android.widget.FrameLayout;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.relation.select.SelectFriendPanelFragment$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.LinkedHashSet;
import java.lang.Boolean;
import brd.y;
import java.lang.Integer;
import com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment;
import gbc.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import rbc.b;
import com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment$d;
import com.yxcorp.gifshow.model.ContactTargetItem;
import tbc.d;
import java.util.Collection;
import com.yxcorp.gifshow.relation.select.search.SearchBarFragment$b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import android.content.Context;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crd.b;
import java.lang.Throwable;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.relation.select.search.SearchUsersFragment;
import java.lang.IllegalStateException;
import rbc.d;
import erd.g;
import brd.t;
import rbc.e;
import rbc.c;
import vbc.k;
import vbc.l;
import vbc.h;
import rbc.n;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class SelectFriendPanelFragment extends BaseFragment implements a, a	// class@001982
{
    public String A;
    public boolean j;
    public boolean k;
    public SelectUsersConfigParams l;
    public SelectUsersBundle m;
    public boolean n;
    public a o;
    public boolean p;
    public SearchBarPreviewFragment q;
    public SearchBarFragment r;
    public SearchUsersFragment s;
    public SelectUsersTabHostFragment t;
    public PresenterV2 u;
    public SelectUsersActivity$a v;
    public String w;
    public b x;
    public b y;
    public b z;
    public static final int B;

    public void SelectFriendPanelFragment(){
       super();
       this.j = false;
       this.k = false;
       this.l = new SelectUsersConfigParams();
       this.o = new a();
       this.v = new SelectUsersActivity$a();
       this.w = "";
    }
    public int M(){
       return 1;
    }
    public void Q2(){
    }
    public void U5(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectFriendPanelFragment.class, "20")) {
          return;
       }
       this.t.Wh(p0);
       return;
    }
    public final void ch(Activity p0,Set p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SelectFriendPanelFragment.class, "17")) {
          return;
       }
       if (this.m.isHalfScreen()) {
          y$a e = y.e;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoidOneRefs(p1, e, y$a.class, "2")) {
             y.d = p1;
             q a = y.a;
             if (a != null) {
                a.c();
             }
          }
       }else if(p1 != null){
          Intent intent = new Intent();
          intent.putExtra("key_select_users_result_data", b.c(p1));
          p0.setResult(-1, intent);
       }
       if (this.getActivity() != null) {
          this.getActivity().finish();
       }
    label_004e :
       return;
    }
    public final void dh(){
       if (PatchProxy.applyVoid(null, this, SelectFriendPanelFragment.class, "9")) {
          return;
       }
       SearchBarFragment searchBarFra = new SearchBarFragment();
       this.r = searchBarFra;
       searchBarFra.setArguments(this.getArguments());
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.g(R.id.select_fragment, this.r, "tag_search_bar_fragment");
       uoe.o();
       this.r.k = this;
       FrameLayout uFrameLayout = this.getView().findViewById(R.id.select_fragment);
       uFrameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new SelectFriendPanelFragment$a(this, uFrameLayout));
       return;
    }
    public final void eh(){
       if (PatchProxy.applyVoid(null, this, SelectFriendPanelFragment.class, "18")) {
          return;
       }
       if (this.o.b().size() > 0 || this.m.isFromPanel()) {
          this.v.b.onNext(Boolean.TRUE);
       }else if(this.p == null){
          this.v.b.onNext(Boolean.FALSE);
       }
       this.v.c.onNext(Integer.valueOf(this.o.b().size()));
       if (this.l.isPreviewSearch()) {
          this.q.Lh(this.o.b());
       }
       return;
    }
    public void g2(boolean p0){
       if (PatchProxy.isSupport(SelectFriendPanelFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SelectFriendPanelFragment.class, "14")) {
          return;
       }
       if (p0) {
          f.a.b();
       }
       return;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, SelectFriendPanelFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.getLogExtraParams();
    }
    public String h5(){
       Object obj = PatchProxy.apply(null, this, SelectFriendPanelFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.A == null) {
          this.A = String.valueOf(System.currentTimeMillis());
       }
       return this.A;
    }
    public boolean j9(SelectUsersConfigParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SelectFriendPanelFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.n != null || p0 == null) {
          return false;
       }
       this.n = true;
       if (this.o.b().size() > 0 || this.m.isHalfScreen()) {
          p0.setMultiSelect();
       }
       if (this.m.isHalfScreen()) {
          p0.setDefaultSearch();
       }
       this.t.Xh(p0);
       this.l = p0;
       this.j = p0.isMultiSelect();
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, SelectFriendPanelFragment.class, "7")) {
          if (this.l.isPreviewSearch()) {
             SearchBarPreviewFragment searchBarPre = this.getChildFragmentManager().findFragmentByTag("tag_pre_search_fragment");
             this.q = searchBarPre;
             if (searchBarPre != null && (!searchBarPre.isVisible() && !PatchProxy.applyVoid(objArray, this, SelectFriendPanelFragment.class, "8"))) {
                this.q = new SearchBarPreviewFragment();
                e uoe = this.getChildFragmentManager().beginTransaction();
                uoe.g(R.id.select_fragment, this.q, "tag_pre_search_fragment");
                uoe.m();
                this.q.Ih(new b(this));
                this.q.Kh(this);
             }
          }else if(this.l.isDisableSearch()){
             this.getView().findViewById(R.id.select_fragment).setVisibility(8);
          }else {
             SearchBarFragment searchBarFra = this.getChildFragmentManager().findFragmentByTag("tag_search_bar_fragment");
             this.r = searchBarFra;
             if (searchBarFra == null || !searchBarFra.isVisible()) {
                this.dh();
             }
          }
          this.v.d.onNext(this.l);
          if (this.o.b().size() > 0) {
             this.eh();
          }
       }
       return true;
    }
    public void l1(ContactTargetItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectFriendPanelFragment.class, "16")) {
          return;
       }
       if (p0.mSelected == null) {
          this.o.g(p0);
          this.eh();
       }else {
          this.o.a(p0);
          if (!this.m.isFromPanel()) {
             d.a.b(this.o.b());
          }
          if (this.j != null) {
             this.eh();
          }else {
             f.a.c();
             this.ch(this.getActivity(), this.o.b());
          }
       }
       if (this.k != null) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, SelectFriendPanelFragment.class, "19")) {
             SelectFriendPanelFragment tq = this.q;
             if (tq != null) {
                tq.Gh();
             }
             tq = this.r;
             if (tq != null && !PatchProxy.applyVoid(objArray, tq, SearchBarFragment.class, "5")) {
                tq.m.b.onNext(Boolean.FALSE);
             }
          }
       }
       return;
    }
    public String o(){
       return "CHOOSE_FRIENDS";
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       boolean i1;
       View view;
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SelectFriendPanelFragment.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       int i = 1;
       if (!PatchProxy.applyVoid(null, this, SelectFriendPanelFragment.class, "6")) {
          if (this.getArguments() != null) {
             Serializable serializable = SerializableHook.getSerializable(this.getArguments(), "key_select_users_bundle");
             if (serializable != null) {
                this.m = serializable;
             }
          }
          if (this.m == null) {
             this.m = new SelectUsersBundle();
          }
          i1 = (this.m.getCheckedUsers().size() > 0)? true: false;
          this.p = i1;
          Iterator iterator = this.m.getCheckedUsers().iterator();
          while (iterator.hasNext()) {
             this.o.a(d.a.d(iterator.next()));
          }
       }
       if (this.m.isHalfScreen()) {
          i1 = 0x7f0d05ad;
          view = (d.c(this.m))? a.b(this.getContext(), i1, i): a.a(this.getContext(), i1);
       }else {
          view = a.a(this.getContext(), R.layout.arg_RES_7f0d14aa);
       }
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, SelectFriendPanelFragment.class, "5")) {
          return;
       }
       super.onDestroy();
       SelectFriendPanelFragment tu = this.u;
       if (tu != null) {
          tu.destroy();
       }
       tu = this.x;
       if (tu != null) {
          tu.dispose();
       }
       tu = this.y;
       if (tu != null) {
          tu.dispose();
       }
       tu = this.z;
       if (tu != null) {
          tu.dispose();
       }
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectFriendPanelFragment.class, "23")) {
          return;
       }
       this.v.g.onNext(p0);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       SelectFriendPanelFragment tu;
       e uoe;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SelectFriendPanelFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, SelectFriendPanelFragment.class, "3")) {
          SelectUsersTabHostFragment selectUsersT = new SelectUsersTabHostFragment();
          this.t = selectUsersT;
          selectUsersT.Vh(this);
          this.t.setArguments(this.getArguments());
          int i = 0x7f0a0fe6;
          if (TextUtils.isEmpty(this.m.getSearchText())) {
             uoe = this.getChildFragmentManager().beginTransaction();
             uoe.w(i, this.t, "tab_host_fragment");
             uoe.o();
          }else {
             SearchUsersFragment searchUsersF = new SearchUsersFragment();
             this.s = searchUsersF;
             searchUsersF.Lh(this);
             this.s.setArguments(this.getArguments());
             if (this.m.isHalfScreen()) {
                this.j = true;
                this.s.Kh(1);
                this.v.d.onNext(this.l);
             }
             tu = this.s;
             String searchText = this.m.getSearchText();
             try{
                tu.Mh(searchText, 1);
                uoe = this.getChildFragmentManager().beginTransaction();
                uoe.g(i, this.s, "tag_search_fragment");
                uoe.o();
             }catch(java.lang.IllegalStateException e5){
                e5.printStackTrace();
             }
             tu = this.r;
             if (tu == null || !tu.isVisible()) {
                this.dh();
             }
             this.k = true;
             if (this.o.b().size() > 0) {
                this.eh();
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, SelectFriendPanelFragment.class, "4")) {
          this.x = this.v.e.subscribe(new d(this));
          this.y = this.v.f.subscribe(new e(this));
          this.z = this.v.h.subscribe(new c(this));
          this.u = new PresenterV2();
          if (this.m.isHalfScreen()) {
             tu = this.u;
             tu.U7(new k());
             tu.U7(new l());
          }else {
             this.u.U7(new h());
          }
          this.u.f(this.getView().findViewById(R.id.root));
          objArray = new Object[]{this.v,this.m};
          this.u.i(objArray);
       }
       return;
    }
    public a r0(){
       return this.o;
    }
    public void z0(String p0){
       e uoe;
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectFriendPanelFragment.class, "13")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, SelectFriendPanelFragment.class, "25")) {
          this.w = p0;
          int i = 0x7f0a0fe6;
          Object[] objArray = null;
          boolean b = false;
          if (TextUtils.isEmpty(p0)) {
             this.m.setSearchText("");
             if (!PatchProxy.applyVoid(objArray, this, SelectFriendPanelFragment.class, "11")) {
                SelectFriendPanelFragment ts = this.s;
                if (ts != null && ts.isVisible()) {
                   this.s.Gh();
                   String str = "tab_host_fragment";
                   if (this.getChildFragmentManager().findFragmentByTag(str) == null) {
                      if (this.t == null) {
                         SelectUsersTabHostFragment selectUsersT = new SelectUsersTabHostFragment();
                         this.t = selectUsersT;
                         selectUsersT.Vh(this);
                         this.t.setArguments(this.getArguments());
                      }
                      uoe = this.getChildFragmentManager().beginTransaction();
                      uoe.g(i, this.t, str);
                      uoe.o();
                   }
                   this.getChildFragmentManager().beginTransaction().s(this.s).o();
                   this.getChildFragmentManager().beginTransaction().E(this.t).o();
                }
                this.k = b;
             }
          }else {
             SelectFriendPanelFragment ts1 = this.s;
             if (ts1 != null && ts1.isVisible()) {
                this.s.Mh(p0, b);
             }else if(PatchProxy.applyVoid(objArray, this, SelectFriendPanelFragment.class, "10") || !this.isAdded()){
                uoe = this.getChildFragmentManager().beginTransaction();
                SearchUsersFragment searchUsersF = this.getChildFragmentManager().findFragmentByTag("tag_search_fragment");
                this.s = searchUsersF;
                if (searchUsersF == null) {
                   searchUsersF = new SearchUsersFragment();
                   this.s = searchUsersF;
                   searchUsersF.Lh(this);
                   this.s.setArguments(this.getArguments());
                   this.s.Kh(this.j);
                   ts1 = this.s;
                   SelectFriendPanelFragment tw = this.w;
                   try{
                      ts1.Mh(tw, true);
                      uoe.g(i, this.s, "tag_search_fragment");
                      uoe.o();
                   }catch(java.lang.IllegalStateException e6){
                      e6.printStackTrace();
                   }
                }else {
                   searchUsersF.Kh(this.j);
                   this.s.Ih().M0().k0();
                   this.s.Ih().y1(this.j);
                   ts1 = this.s;
                   SelectFriendPanelFragment tw1 = this.w;
                   try{
                      ts1.Mh(tw1, b);
                      uoe.s(this.t).m();
                      uoe.E(this.s).o();
                   }catch(java.lang.IllegalStateException e6){
                      e6.printStackTrace();
                   }
                }
             }
          }
       }
       return;
    }
}
