package com.yxcorp.gifshow.relation.select.half.SelectFriendHalfPanelFragment;
import wbc.a;
import rbc.a;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import ubc.a;
import com.yxcorp.gifshow.relation.select.SelectUsersActivity$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ubc.b;
import com.yxcorp.gifshow.relation.select.SelectUsersTabHostFragment;
import java.lang.Boolean;
import gbc.f;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.yxcorp.utility.n;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.gifshow.relation.select.half.HalfSelectFriendBottomSheet;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yxcorp.gifshow.relation.select.half.HalfPanelState;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import java.lang.System;
import com.yxcorp.gifshow.relation.select.model.SelectUsersConfigParams;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.relation.select.half.HalfSearchBarPreviewFragment;
import java.util.LinkedHashSet;
import brd.y;
import com.yxcorp.gifshow.model.ContactTargetItem;
import tbc.d;
import java.util.Collection;
import java.util.Set;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import jz6.a;
import android.view.LayoutInflater;
import android.view.View;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import i2b.a;
import com.yxcorp.gifshow.relation.select.half.a;
import android.content.DialogInterface$OnKeyListener;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crd.b;
import java.lang.Throwable;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.relation.select.half.HalfSearchUsersFragment;
import com.yxcorp.gifshow.relation.select.search.SearchUsersFragment;
import java.lang.IllegalStateException;
import sbc.c;
import android.view.View$OnClickListener;
import bh5.c;
import bh5.e;
import com.google.android.material.bottomsheet.BottomSheetMultiChildBehavior;
import sbc.i;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import sbc.f;
import erd.g;
import brd.t;
import sbc.g;
import sbc.e;
import vbc.k;
import vbc.l;
import com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment;
import sbc.d;
import com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment$d;
import java.lang.Integer;
import android.content.Intent;
import android.os.Parcelable;
import org.parceler.b;
import n3d.a;
import rbc.n;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class SelectFriendHalfPanelFragment extends BaseDialogFragment implements a, a	// class@00199e
{
    public SelectUsersTabHostFragment A;
    public PresenterV2 B;
    public SelectUsersActivity$a C;
    public String D;
    public b E;
    public b F;
    public b G;
    public DialogInterface$OnKeyListener H;
    public String I;
    public boolean p;
    public boolean q;
    public SelectUsersBundle r;
    public boolean s;
    public a t;
    public boolean u;
    public HalfSelectFriendBottomSheet v;
    public ViewGroup w;
    public a x;
    public HalfSearchBarPreviewFragment y;
    public SearchUsersFragment z;
    public static final int J;

    public void SelectFriendHalfPanelFragment(){
       super();
       this.p = true;
       this.q = false;
       this.t = new a();
       this.C = new SelectUsersActivity$a();
       this.D = "";
    }
    public int M(){
       return 1;
    }
    public void Q2(){
       if (PatchProxy.applyVoid(null, this, SelectFriendHalfPanelFragment.class, "20")) {
          return;
       }
       this.th();
       return;
    }
    public void U5(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectFriendHalfPanelFragment.class, "24")) {
          return;
       }
       this.A.Wh(p0);
       return;
    }
    public void g2(boolean p0){
       if (PatchProxy.isSupport(SelectFriendHalfPanelFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SelectFriendHalfPanelFragment.class, "18")) {
          return;
       }
       if (p0) {
          f.a.b();
       }
       SelectFriendHalfPanelFragment tw = this.w;
       if (tw != null && this.v != null) {
          ViewGroup$LayoutParams layoutParams = tw.getLayoutParams();
          int i = n.c(this.getContext(), 56.00f);
          int i1 = n.j(this.getActivity()) - i;
          layoutParams.height = i1;
          SelectFriendHalfPanelFragment tv = this.v;
          tv.c = i;
          tv.setPeekHeight(i1);
          this.v.d(HalfPanelState.STRETCH);
          this.v.setState(3);
          this.w.setLayoutParams(layoutParams);
       }
       return;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, SelectFriendHalfPanelFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.getLogExtraParams();
    }
    public String h5(){
       Object obj = PatchProxy.apply(null, this, SelectFriendHalfPanelFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.I == null) {
          this.I = String.valueOf(System.currentTimeMillis());
       }
       return this.I;
    }
    public boolean j9(SelectUsersConfigParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SelectFriendHalfPanelFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.s != null || p0 == null) {
          return false;
       }
       this.s = true;
       p0.setMultiSelect();
       p0.setSelectType(true);
       SelectFriendHalfPanelFragment tA = this.A;
       if (tA != null) {
          tA.Xh(p0);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, SelectFriendHalfPanelFragment.class, "12")) {
          HalfSearchBarPreviewFragment halfSearchBa = this.getChildFragmentManager().findFragmentByTag("tag_pre_search_fragment");
          this.y = halfSearchBa;
          if (halfSearchBa == null || !halfSearchBa.isVisible()) {
             this.uh();
          }
          if (this.t.b().size() > 0) {
             this.vh();
          }
          this.C.d.onNext(p0);
       }
       return true;
    }
    public void l1(ContactTargetItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectFriendHalfPanelFragment.class, "21")) {
          return;
       }
       if (p0.mSelected == null) {
          this.t.g(p0);
          this.vh();
       }else {
          this.t.a(p0);
          if (!this.r.isFromPanel()) {
             d.a.b(this.t.b());
          }
          if (this.p != null) {
             this.vh();
          }else {
             f.a.c();
             this.wh(this.t.b());
          }
       }
       if (this.q != null) {
          this.th();
       }
       return;
    }
    public String o(){
       return "CHOOSE_FRIENDS";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectFriendHalfPanelFragment.class, "6")) {
          return;
       }
       super.onActivityCreated(p0);
       Window window = (this.getDialog() != null)? this.getDialog().getWindow(): null;
       if (window != null) {
          window.clearFlags(0x4000000);
          window.addFlags(Integer.MIN_VALUE);
          window.setStatusBarColor(0);
          window.setBackgroundDrawable(new ColorDrawable(0));
          window.setLayout(-1, -1);
          window.setWindowAnimations(R.style.arg_RES_7f1103e2);
          window.setDimAmount(0);
       }
       return;
    }
    public final Dialog onCreateDialog(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, SelectFriendHalfPanelFragment.class, "5");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       this.setCancelable(false);
       a uoa = new a(this.getContext(), 0x7f110358);
       uoa.requestWindowFeature(1);
       uoa.setCanceledOnTouchOutside(false);
       return uoa;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       boolean i1;
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SelectFriendHalfPanelFragment.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       int i = 1;
       if (!PatchProxy.applyVoid(null, this, SelectFriendHalfPanelFragment.class, "11")) {
          if (this.getArguments() != null) {
             Serializable serializable = SerializableHook.getSerializable(this.getArguments(), "key_select_users_bundle");
             if (serializable != null) {
                this.r = serializable;
             }
          }
          if (this.r == null) {
             this.r = new SelectUsersBundle();
          }
          i1 = (this.r.getCheckedUsers().size() > 0)? true: false;
          this.u = i1;
          Iterator iterator = this.r.getCheckedUsers().iterator();
          while (iterator.hasNext()) {
             this.t.a(d.a.d(iterator.next()));
          }
       }
       i1 = 0x7f0d05ae;
       View view = (d.c(this.r))? a.b(this.getContext(), i1, i): a.a(this.getContext(), i1);
       this.H = new a(this);
       if (this.getDialog() != null) {
          this.getDialog().setOnKeyListener(this.H);
       }
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, SelectFriendHalfPanelFragment.class, "10")) {
          return;
       }
       super.onDestroy();
       SelectFriendHalfPanelFragment tB = this.B;
       if (tB != null) {
          tB.destroy();
       }
       tB = this.E;
       if (tB != null) {
          tB.dispose();
       }
       tB = this.F;
       if (tB != null) {
          tB.dispose();
       }
       tB = this.G;
       if (tB != null) {
          tB.dispose();
       }
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectFriendHalfPanelFragment.class, "27")) {
          return;
       }
       this.C.g.onNext(p0);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       e uoe;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SelectFriendHalfPanelFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoid(null, this, SelectFriendHalfPanelFragment.class, "8")) {
          SelectUsersTabHostFragment selectUsersT = new SelectUsersTabHostFragment();
          this.A = selectUsersT;
          selectUsersT.Vh(this);
          this.A.setArguments(this.getArguments());
          int i = 0x7f0a0fe6;
          if (TextUtils.isEmpty(this.r.getSearchText())) {
             uoe = this.getChildFragmentManager().beginTransaction();
             uoe.w(i, this.A, "tab_host_fragment");
             uoe.m();
          }else {
             HalfSearchUsersFragment halfSearchUs = new HalfSearchUsersFragment();
             this.z = halfSearchUs;
             halfSearchUs.Lh(this);
             this.z.setArguments(this.getArguments());
             this.z.Kh(this.p);
             SelectFriendHalfPanelFragment tz = this.z;
             String searchText = this.r.getSearchText();
             try{
                tz.Mh(searchText, 1);
                uoe = this.getChildFragmentManager().beginTransaction();
                uoe.g(i, this.z, "tag_search_fragment");
                uoe.o();
             }catch(java.lang.IllegalStateException e6){
                e6.printStackTrace();
             }
             this.q = true;
             tz = this.y;
             if (tz == null || !tz.isVisible()) {
                this.uh();
             }
             if (this.t.b().size() > 0) {
                this.vh();
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, SelectFriendHalfPanelFragment.class, "7")) {
          this.w = p0.findViewById(0x7f0a051e);
          p0.findViewById(R.id.bs_background).setOnClickListener(new c(this));
          ViewGroup$LayoutParams layoutParams = this.w.getLayoutParams();
          layoutParams.height = (c.a())? e.c(this.getActivity()): e.b(this.getActivity());
          this.w.setLayoutParams(layoutParams);
          HalfSelectFriendBottomSheet halfSelectFr = BottomSheetMultiChildBehavior.from(this.w);
          this.v = halfSelectFr;
          halfSelectFr.setState(3);
          this.v.setBottomSheetCallback(new i(this));
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, SelectFriendHalfPanelFragment.class, "9")) {
          this.E = this.C.e.subscribe(new f(this));
          this.F = this.C.f.subscribe(new g(this));
          this.G = this.C.h.subscribe(new e(this));
          PresenterV2 presenterV2 = new PresenterV2();
          this.B = presenterV2;
          presenterV2.U7(new k());
          this.B.U7(new l());
          this.B.f(p0);
          Object[] objArray = new Object[]{this.C,this.r};
          this.B.i(objArray);
       }
       return;
    }
    public a r0(){
       return this.t;
    }
    public final void th(){
       if (PatchProxy.applyVoid(null, this, SelectFriendHalfPanelFragment.class, "23")) {
          return;
       }
       SelectFriendHalfPanelFragment ty = this.y;
       if (ty != null) {
          ty.Gh();
       }
       return;
    }
    public final void uh(){
       if (PatchProxy.applyVoid(null, this, SelectFriendHalfPanelFragment.class, "13")) {
          return;
       }
       HalfSearchBarPreviewFragment halfSearchBa = new HalfSearchBarPreviewFragment();
       this.y = halfSearchBa;
       halfSearchBa.setArguments(this.getArguments());
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.g(R.id.select_fragment, this.y, "tag_pre_search_fragment");
       uoe.o();
       this.y.Ih(new d(this));
       this.y.Kh(this);
       return;
    }
    public final void vh(){
       if (PatchProxy.applyVoid(null, this, SelectFriendHalfPanelFragment.class, "22")) {
          return;
       }
       if (this.t.b().size() > 0 || this.r.isFromPanel()) {
          this.C.b.onNext(Boolean.TRUE);
       }else if(this.u == null){
          this.C.b.onNext(Boolean.FALSE);
       }
       this.C.c.onNext(Integer.valueOf(this.t.b().size()));
       this.y.Lh(this.t.b());
       return;
    }
    public void wh(Set p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectFriendHalfPanelFragment.class, "3")) {
          return;
       }
       this.dismiss();
       if (this.x != null) {
          Intent intent = new Intent();
          if (p0 != null) {
             intent.putExtra("key_select_users_result_data", b.c(p0));
          }
          this.x.onActivityCallback(115, -1, intent);
       }
       return;
    }
    public void z0(String p0){
       e uoe;
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectFriendHalfPanelFragment.class, "17")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, SelectFriendHalfPanelFragment.class, "29")) {
          this.D = p0;
          int i = 0x7f0a0fe6;
          Object[] objArray = null;
          boolean b = false;
          if (TextUtils.isEmpty(p0)) {
             this.r.setSearchText(p0);
             if (!PatchProxy.applyVoid(objArray, this, SelectFriendHalfPanelFragment.class, "15")) {
                SelectFriendHalfPanelFragment tz = this.z;
                if (tz != null && tz.isVisible()) {
                   this.z.Gh();
                   String str = "tab_host_fragment";
                   if (this.getChildFragmentManager().findFragmentByTag(str) == null) {
                      if (this.A == null) {
                         SelectUsersTabHostFragment selectUsersT = new SelectUsersTabHostFragment();
                         this.A = selectUsersT;
                         selectUsersT.Vh(this);
                         this.A.setArguments(this.getArguments());
                      }
                      uoe = this.getChildFragmentManager().beginTransaction();
                      uoe.g(i, this.A, str);
                      uoe.o();
                   }
                   this.getChildFragmentManager().beginTransaction().s(this.z).o();
                   this.getChildFragmentManager().beginTransaction().E(this.A).o();
                }
                this.q = b;
                this.v.c(b);
             }
          }else {
             SelectFriendHalfPanelFragment tz1 = this.z;
             if (tz1 != null && tz1.isVisible()) {
                this.z.Mh(p0, b);
             }else if(PatchProxy.applyVoid(objArray, this, SelectFriendHalfPanelFragment.class, "14") || !this.isAdded()){
                uoe = this.getChildFragmentManager().beginTransaction();
                SearchUsersFragment searchUsersF = this.getChildFragmentManager().findFragmentByTag("tag_search_fragment");
                this.z = searchUsersF;
                if (searchUsersF == null) {
                   HalfSearchUsersFragment halfSearchUs = new HalfSearchUsersFragment();
                   this.z = halfSearchUs;
                   halfSearchUs.Lh(this);
                   this.z.setArguments(this.getArguments());
                   this.z.Kh(this.p);
                   tz1 = this.z;
                   SelectFriendHalfPanelFragment tD = this.D;
                   try{
                      tz1.Mh(tD, true);
                      uoe.g(i, this.z, "tag_search_fragment");
                      uoe.o();
                   }catch(java.lang.IllegalStateException e6){
                      e6.printStackTrace();
                   }
                }else {
                   searchUsersF.Kh(this.p);
                   this.z.Ih().M0().k0();
                   this.z.Ih().y1(this.p);
                   tz1 = this.z;
                   SelectFriendHalfPanelFragment tD1 = this.D;
                   try{
                      tz1.Mh(tD1, b);
                      uoe.s(this.A).o();
                      uoe.E(this.z).o();
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
