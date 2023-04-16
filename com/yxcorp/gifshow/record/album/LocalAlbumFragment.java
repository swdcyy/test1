package com.yxcorp.gifshow.record.album.LocalAlbumFragment;
import l8c.b;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import java.util.HashSet;
import java.util.ArrayList;
import crd.a;
import m8c.e;
import com.yxcorp.gifshow.fragment.user.l;
import l8c.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Set;
import java.lang.Long;
import k8c.a;
import q87.c;
import com.yxcorp.gifshow.record.album.LocalAlbumListFragment;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.record.album.LocalAlbumFragment$d;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.Integer;
import ekd.k1;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.record.album.RecordDraftFragment;
import android.view.View;
import ekd.m1;
import android.widget.LinearLayout;
import android.widget.Button;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.TextView;
import com.yxcorp.gifshow.record.album.LocalAlbumFragment$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.record.album.LocalAlbumFragment$b;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.record.album.LocalAlbumFragment$c;
import com.kwai.robust.PatchProxyResult;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.content.res.Resources;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentAccessor;
import java.util.Map;
import java.util.HashMap;
import mm6.d;
import android.content.Intent;
import android.app.Activity;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.record.album.model.LocalAlbumBannerInfo;
import p8c.v;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.Collection;
import ekd.q;
import a17.c$a;
import a17.g;
import lnc.a1;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import java.lang.CharSequence;
import java.util.Collections;
import k8c.b;
import a17.b$b;
import a17.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import q8c.d;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import k8c.f;
import android.view.animation.Animation$AnimationListener;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import brd.t;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import t45.d;
import brd.z;
import k8c.d;
import erd.o;
import java.util.concurrent.TimeUnit;
import k8c.c;
import com.yxcorp.gifshow.record.album.a;
import erd.g;
import crd.b;
import android.view.ViewParent;
import ei0.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k8c.h;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import kq.b;
import com.yxcorp.gifshow.record.album.utils.g0;

public class LocalAlbumFragment extends BaseFragment implements b, g	// class@0016fa
{
    public LinearLayout j;
    public Button k;
    public PublishSubject l;
    public ProgressFragment m;
    public View n;
    public KwaiActionBar o;
    public TextView p;
    public LocalAlbumListFragment q;
    public Set r;
    public int s;
    public boolean t;
    public boolean u;
    public LocalAlbumBannerInfo v;
    public boolean w;
    public List x;
    public List y;
    public final a z;
    public static final int A;

    public void LocalAlbumFragment(){
       super();
       this.l = PublishSubject.g();
       this.r = new HashSet();
       this.s = 0;
       this.t = false;
       this.u = false;
       this.v = null;
       this.x = new ArrayList();
       this.y = new ArrayList();
       this.z = new a();
    }
    public void A2(e p0,l p1){
       a.f(this, p0, p1);
    }
    public void C6(e p0){
       a.k(this, p0);
    }
    public void Ef(e p0){
       a.b(this, p0);
    }
    public void F7(e p0,a p1){
       a.h(this, p0, p1);
    }
    public void G7(e p0){
       a.i(this, p0);
    }
    public int M(){
       return 1;
    }
    public void X1(e p0,l p1){
       a.j(this, p0, p1);
    }
    public void X2(e p0,int p1){
    }
    public void X4(e p0,boolean p1){
       if (PatchProxy.isSupport(LocalAlbumFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LocalAlbumFragment.class, "25")) {
          return;
       }
       if (p1) {
          this.r.add(p0);
       }else {
          this.r.remove(p0);
       }
       this.kh();
       return;
    }
    public void Z4(boolean p0,long p1){
       if (PatchProxy.isSupport(LocalAlbumFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Long.valueOf(p1), this, LocalAlbumFragment.class, "24")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("LocalAlbumFragment", "onReload, switch mLocalAlbumCheckable false", objArray);
       LocalAlbumFragment tq = this.q;
       if (tq != null) {
          tq.mh(0);
       }
       this.nh(this.s);
       this.r.clear();
       return;
    }
    public void b8(boolean p0){
       if (PatchProxy.isSupport(LocalAlbumFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LocalAlbumFragment.class, "23")) {
          return;
       }
       this.t = p0;
       this.nh(this.s);
       Iterator iterator = this.y.iterator();
       while (iterator.hasNext()) {
          int i = p0 ^ 0x01;
          iterator.next().g(i);
       }
       return;
    }
    public void ch(){
       Object[] objArray5;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LocalAlbumFragment.class, "10")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "LocalAlbumFragment";
       a.D().w(str, "addFragment", objArray1);
       if (this.q == null) {
          objArray1 = new Object[i];
          a.D().w(str, "addFragment mLocalAlbumListFragment is null, create", objArray1);
          LocalAlbumListFragment localAlbumLi = new LocalAlbumListFragment();
          this.q = localAlbumLi;
          localAlbumLi.G = this.hh();
          this.q.kh(this);
          this.q.setArguments(this.eh());
          this.q.I = this.gh();
       }
       e uoe = this.getActivity().getSupportFragmentManager().beginTransaction();
       LocalAlbumFragment tq = this.q;
       c supportFragm = this.getActivity().getSupportFragmentManager();
       LocalAlbumUtils localAlbumUt = LocalAlbumUtils.class;
       if (PatchProxy.isSupport(localAlbumUt)) {
          Object[] objArray2 = new Object[]{tq,uoe,supportFragm,str,Integer.valueOf(0x7f0a17c0)};
          if (!PatchProxy.applyVoid(objArray2, objArray, localAlbumUt, "61")) {
          label_0093 :
             Object[] objArray3 = new Object[i];
             a.D().w("LocalAlbumUtils", "addFragmentSafe tag:LocalAlbumFragment", objArray3);
             if (tq.isAdded()) {
                Object[] objArray4 = new Object[i];
                a.D().w("LocalAlbumUtils", "addFragmentSafe fragment is added", objArray4);
                if (k1.g()) {
                   try{
                      uoe.E(tq).o();
                   }catch(java.lang.Exception e1){
                      PostUtils.D("LocalAlbumUtils", "addFragmentSafeIfMainThread showFragment on UiThread by commitNow", e1);
                      uoe.E(tq).m();
                   }
                }else {
                   objArray5 = new Object[i];
                   a.D().w("LocalAlbumUtils", "addFragmentSafe not in main", objArray5);
                   uoe.E(tq).m();
                }
             }else {
                Fragment uFragment = supportFragm.findFragmentByTag(str);
                if (uFragment != null) {
                   Object[] objArray6 = new Object[i];
                   a.D().w("LocalAlbumUtils", "addFragmentSafe fragment not added but exist in manager", objArray6);
                   uoe.u(uFragment);
                }
                if (k1.g()) {
                   try{
                      uoe.g(R.id.list_wrap, tq, str);
                      uoe.o();
                   }catch(java.lang.Exception e1){
                      PostUtils.D("LocalAlbumUtils", "addFragmentSafeIfMainThread addFragment on UiThread by commitNow", e1);
                      uoe.g(R.id.list_wrap, tq, str);
                      uoe.m();
                   }
                }else {
                   objArray5 = new Object[i];
                   a.D().w("LocalAlbumUtils", "addFragmentSafe not in main", objArray5);
                   uoe.g(R.id.list_wrap, tq, str);
                   uoe.m();
                }
             }
          }
       }else {
          goto label_0093 ;
       }
    }
    public boolean dh(){
       return (this instanceof RecordDraftFragment ^ 0x01);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumFragment.class, "2")) {
          return;
       }
       this.j = m1.f(p0, 0x7f0a0468);
       this.k = m1.f(p0, 0x7f0a0a81);
       this.o = m1.f(p0, 0x7f0a3f6a);
       this.p = m1.f(p0, 0x7f0a3643);
       this.k.setOnClickListener(new LocalAlbumFragment$a(this));
       this.o.setEnableDynamicAdjustTitleSize(false);
       this.p.setOnClickListener(new LocalAlbumFragment$b(this));
       this.o.findViewById(R.id.right_btn2).setOnClickListener(new LocalAlbumFragment$c(this));
       this.o.setRight(-1);
       return;
    }
    public Bundle eh(){
       Object[] objArray = null;
       Bundle obj = PatchProxy.apply(objArray, this, LocalAlbumFragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.v == null) {
          return objArray;
       }
       obj = new Bundle();
       SerializableHook.putSerializable(obj, "key_intent_local_album_banner_params", this.v);
       return obj;
    }
    public String f8(){
       return a.a(this);
    }
    public String fh(){
       Object obj = PatchProxy.apply(null, this, LocalAlbumFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getResources().getString(0x7f1046e2);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocalAlbumFragment.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new LocalAlbumFragmentAccessor();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LocalAlbumFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LocalAlbumFragment.class, new LocalAlbumFragmentAccessor());
       }else {
          obj.put(LocalAlbumFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 68;
    }
    public String getUrl(){
       return "ks://local/";
    }
    public String gh(){
       String obj = PatchProxy.apply(null, this, LocalAlbumFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getActivity() == null || !this.getActivity() instanceof d) {
          return "";
       }
       obj = TextUtils.k(this.getActivity().getIntent().getStringExtra("photo_task_id"));
       Object[] objArray = new Object[0];
       a.D().w("LocalAlbumFragment", "getCameraActivityTaskId result:"+obj, objArray);
       return obj;
    }
    public int hh(){
       return 0;
    }
    public void ic(e p0,a p1){
       a.g(this, p0, p1);
    }
    public LocalAlbumBannerInfo ih(){
       return this.v;
    }
    public void jh(View p0){
       ClientEvent$ElementPackage uElementPack;
       v ov = v.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumFragment.class, "9")) {
          return;
       }
       if (this.isDetached()) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       int id = p0.getId();
       int i = 6;
       Object[] objArray = null;
       if (id == 0x7f0a3643) {
          if (this.s == null && !PatchProxy.applyVoid(objArray, objArray, ov, "60")) {
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SELECT_MULTI_PHOTO";
             u1.u(i, uElementPack, objArray);
          }
          id = (this.s == null)? 1: 0;
          this.nh(id);
       }else if(id == 0x7f0a0a81){
          if (!PatchProxy.applyVoid(objArray, this, LocalAlbumFragment.class, "20") && !q.f(this.r)) {
             if (!PatchProxy.applyVoid(objArray, objArray, ov, "61")) {
                uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "DELETE_MULTI_PHOTO";
                u1.u(i, uElementPack, objArray);
             }
             c$a uoa = new c$a(this.getActivity());
             uoa.l0(R.string.arg_RES_7f103d37);
             uoa.j0(Collections.singletonList(new g(a1.p(R.string.arg_RES_7f104281), SheetItemStatus.Primary)));
             uoa.g0(R.string.cancel);
             uoa.i0(new b(this));
             f.a(uoa).Y(PopupInterface.a);
          }
       }else if(id == 0x7f0a3644){
          this.nh(2);
          if (!PatchProxy.applyVoid(objArray, objArray, ov, "52")) {
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.action2 = "LOCAL_ALBUM_SETUP";
             u1.M("2707320", null, 1, uElementPack1, null, null);
          }
       }
       return;
    }
    public final void kh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LocalAlbumFragment.class, "26")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("LocalAlbumFragment", "onCheckedDataChanged mCheckedItems size: "+this.r.size(), objArray1);
       if (!PatchProxy.applyVoid(objArray, this, LocalAlbumFragment.class, "19")) {
          if (this.r.isEmpty()) {
             this.k.setEnabled(0);
          }else {
             this.k.setEnabled(true);
          }
       }
       this.oh(this.s);
       return;
    }
    public void lh(LocalAlbumBannerInfo p0){
       this.v = p0;
    }
    public void m6(e p0){
       a.c(this, p0);
    }
    public void mf(e p0){
       a.d(this, p0);
    }
    public final void mh(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumFragment.class, "13")) {
          return;
       }
       d uod = new d(this, this.n, this.hh());
       this.y.add(uod);
       this.x.add(uod);
       return;
    }
    public void na(e p0){
       a.e(this, p0);
    }
    public void nh(int p0){
       int b;
       FragmentActivity activity;
       if (PatchProxy.isSupport(LocalAlbumFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LocalAlbumFragment.class, "15")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       this.s = p0;
       Iterator iterator = this.y.iterator();
       while (iterator.hasNext()) {
          iterator.next().z(p0);
       }
       LocalAlbumFragment tq = this.q;
       int i = 1;
       if (tq != null) {
          b = (p0 == i)? true: false;
          tq.mh(b);
       }
       if (!PatchProxy.isSupport(LocalAlbumFragment.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LocalAlbumFragment.class, "16") && this.getActivity() != null)) {
          this.oh(p0);
          b = 0x7f0607c5;
          int i1 = 0x7f100f6b;
          if (this.t == null) {
             this.j.setVisibility(8);
             this.p.setText("");
             this.p.setVisibility(4);
             if (p0 == 2) {
                this.p.setText(i1);
                this.p.setTextColor(a1.a(b));
                if (this.dh()) {
                   this.p.setVisibility(0);
                }
             }
          }else {
             int i2 = 0x7f061942;
             if (p0 == i) {
                if (!PatchProxy.applyVoid(null, this, LocalAlbumFragment.class, "17")) {
                   activity = this.getActivity();
                   if (activity != null) {
                      LocalAlbumFragment tj = this.j;
                      if (tj != null && tj.getVisibility() == 8) {
                         this.l.onNext(Boolean.FALSE);
                         tj = this.q;
                         if (tj != null) {
                            tj.oh(this.j.getLayoutParams().height);
                         }
                         this.j.setVisibility(0);
                         this.j.clearAnimation();
                         this.j.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.arg_RES_7f010105));
                      }
                   }
                }
                this.p.setText(R.string.arg_RES_7f104d12);
                this.p.setTextColor(a1.a(i2));
                if (this.dh()) {
                   this.p.setVisibility(0);
                }
             }else if(p0 == 2){
                this.p.setText(i1);
                this.p.setTextColor(a1.a(b));
                if (this.dh()) {
                   this.p.setVisibility(0);
                }
             }else if(PatchProxy.applyVoid(null, this, LocalAlbumFragment.class, "18")){
                activity = this.getActivity();
                if (activity != null) {
                   LocalAlbumFragment tj1 = this.j;
                   if (tj1 != null && (!tj1.getVisibility() && this.j.getAnimation() == null)) {
                      tj1 = this.q;
                      if (tj1 != null) {
                         tj1.oh((this.j.getLayoutParams().height - 0));
                      }
                      Animation uAnimation = AnimationUtils.loadAnimation(activity, R.anim.arg_RES_7f01010d);
                      uAnimation.setAnimationListener(new f(this));
                      this.j.clearAnimation();
                      this.j.startAnimation(uAnimation);
                   }
                }
             }
             this.p.setText(R.string.arg_RES_7f104d13);
             this.p.setTextColor(a1.a(i2));
             if (this.dh()) {
                this.p.setVisibility(0);
             }
             if (this.u == null) {
                this.u = i;
                if (!PatchProxy.applyVoid(null, null, v.class, "59")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "SELECT_MULTI_PHOTO";
                   u1.u0(6, uElementPack, null);
                }
             }
             this.kh();
          }
       }
       return;
    }
    public void oh(int p0){
       if (PatchProxy.isSupport(LocalAlbumFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LocalAlbumFragment.class, "27")) {
          return;
       }
       if (p0 == 2) {
          this.o.j(null);
          this.o.q(R.string.arg_RES_7f10471b);
       }else {
          this.o.r(this.fh());
       }
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, LocalAlbumFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.s == null) {
          return 0;
       }
       this.nh(0);
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumFragment.class, "4")) {
          return;
       }
       super.onCreate(p0);
       u1.L0(this);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       z a;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LocalAlbumFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("LocalAlbumFragment", "onCreateView", objArray);
       LocalAlbumFragment tn = this.n;
       if (tn == null) {
          View view = a.h(p0, R.layout.arg_RES_7f0d0e9a, p1, i, this.hh());
          this.n = view;
          this.doBindView(view);
          this.oh(this.s);
          Object[] objArray1 = new Object[i];
          a.D().w("LocalAlbumFragment", "onCreateView root view is null", objArray1);
          if (!PatchProxy.applyVoid(null, this, LocalAlbumFragment.class, "12")) {
             objArray1 = new Object[i];
             a.D().w("LocalAlbumFragment", "updateBannerInfo", objArray1);
             a = d.a;
             t ot = LocalAlbumUtils.s().compose(this.ge()).observeOn(a).flatMap(new d(this)).subscribeOn(a);
             this.z.c(ot.timeout(1, TimeUnit.SECONDS).subscribe(new c(this), new a(this)));
          }
       }else if(tn.getParent() != null && this.n.getParent() instanceof ViewGroup){
          this.n.getParent().removeView(this.n);
       }
       return this.n;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LocalAlbumFragment.class, "8")) {
          return;
       }
       LocalAlbumFragment tq = this.q;
       if (tq != null) {
          tq.kh(objArray);
       }
       super.onDestroyView();
       Iterator iterator = this.x.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       this.z.dispose();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumFragment.class, "7")) {
          return;
       }
       super.onResume();
       this.l.onNext(Boolean.TRUE);
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LocalAlbumFragment.class, "6")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, LocalAlbumFragment.class, "22")) {
          GifshowActivity activity = this.getActivity();
          if (activity != null) {
             g0.f(activity, -1, new h(this, activity));
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalAlbumFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Iterator iterator = this.x.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
}
