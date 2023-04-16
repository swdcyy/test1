package com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment;
import com.yxcorp.gifshow.profile.fragment.ProfileTabItemFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y2c.p;
import y8c.q;
import com.yxcorp.gifshow.profile.presenter.profile.ProfileFewFeedLoadMorePresenter;
import e9c.i;
import hka.l;
import e9c.a;
import com.yxcorp.gifshow.profile.presenter.profile.z;
import s1c.r0;
import e9c.k;
import em6.a;
import lv6.a$b;
import lv6.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import dm6.e;
import java.util.List;
import java.util.ArrayList;
import im8.c;
import android.view.View;
import android.os.Bundle;
import uv6.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import am6.b;
import brd.t;
import t45.d;
import brd.z;
import k3c.e0;
import erd.g;
import crd.b;
import k3c.i0;
import java.util.Map;
import android.content.res.Configuration;
import androidx.fragment.app.Fragment;
import rkd.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k3c.f0;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Integer;
import androidx.fragment.app.FragmentActivity;
import android.content.res.Resources;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import lnc.u1;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import lnc.b9;
import cda.g;
import qvb.i;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment$b;
import cw9.c;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.y;
import wh5.c;
import z5c.k0;
import zf6.j;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment$1;
import android.content.Context;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import androidx.recyclerview.widget.GridLayoutManager;

public abstract class BaseProfileFeedFragment extends ProfileTabItemFragment	// class@001305
{
    public int F;
    public r0 G;
    public GridLayoutManager H;
    public RecyclerView$n I;
    public Integer J;
    public int K;
    public a L;
    public boolean M;
    public Runnable N;
    public b O;
    public static final int P;

    public void BaseProfileFeedFragment(){
       super();
       this.M = false;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, BaseProfileFeedFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       this.Gh(obj);
       obj.U7(new p(this));
       obj.U7(new ProfileFewFeedLoadMorePresenter());
       obj.U7(new i(this));
       obj.U7(new a());
       obj.U7(new z());
       PatchProxy.onMethodExit(BaseProfileFeedFragment.class, "8");
       return obj;
    }
    public void Fc(r0 p0){
       this.G = p0;
       this.K = p0.c;
    }
    public void Gh(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, BaseProfileFeedFragment.class, "15")) {
          return;
       }
       p0.U7(new k());
       PatchProxy.onMethodExit(BaseProfileFeedFragment.class, "15");
       return;
    }
    public final void Hh(){
       if (PatchProxy.applyVoid(null, this, BaseProfileFeedFragment.class, "5")) {
          return;
       }
       a$b uob = new a$b();
       uob.e("BaseProfileFeedFragment");
       uob.c("list_feed_dynamic_prefetch");
       uob.d(":ks-features:ft-social:profile");
       a uoa = new a(uob.a());
       this.L = uoa;
       uoa.r(this);
       return;
    }
    public void Ih(){
    }
    public List fg(){
       ArrayList obj = PatchProxy.apply(null, this, BaseProfileFeedFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new c("FRAGMENT", this));
       obj.add(this);
       obj.add(this.G);
       obj.add(this.G.e);
       return obj;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseProfileFeedFragment.class, "4")) {
          return;
       }
       super.fh(p0, p1);
       if (b.e()) {
          this.Hh();
       }else {
          this.O = RxBus.f.f(b.class).observeOn(d.a).subscribe(new e0(this));
       }
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d1251;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseProfileFeedFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, BaseProfileFeedFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(BaseProfileFeedFragment.class, new i0());
       }else {
          obj.put(BaseProfileFeedFragment.class, null);
       }
       return obj;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseProfileFeedFragment.class, "12")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (this.M != null) {
          return;
       }
       if (b.g()) {
          this.F = p0.orientation;
          if (!PatchProxy.applyVoid(null, this, BaseProfileFeedFragment.class, "13")) {
             this.h0().setLayoutManager(this.xh());
          }
       }
       this.M = true;
       f0 uof0 = new f0(this, p0);
       this.N = uof0;
       k1.r(uof0, 500);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseProfileFeedFragment.class, "6")) {
          return;
       }
       super.onCreate(p0);
       if (!PatchProxy.applyVoid(null, this, BaseProfileFeedFragment.class, "3")) {
          this.J = Integer.valueOf(9);
       }
       this.F = this.getActivity().getResources().getConfiguration().orientation;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, BaseProfileFeedFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       u1.a(this);
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, BaseProfileFeedFragment.class, "10")) {
          return;
       }
       super.onDestroyView();
       BaseProfileFeedFragment tN = this.N;
       if (tN != null) {
          k1.m(tN);
          this.N = null;
       }
       u1.b(this);
       b9.a(this.O);
       return;
    }
    public void onEventMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseProfileFeedFragment.class, "11")) {
          return;
       }
       if (!this.c1() || (p0 != null && p0.a != null)) {
          Iterator iterator = this.q().getItems().iterator();
          while (iterator.hasNext()) {
             QPhoto qPhoto = iterator.next();
             if (TextUtils.n(p0.a, qPhoto.getPhotoId())) {
                this.q().remove(qPhoto);
                break ;
             }
          }
       }
       return;
    }
    public void th(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseProfileFeedFragment.class, "7")) {
          return;
       }
       super.th();
       boolean b = true;
       this.ia().G0(b);
       this.h0().setLayoutManager(this.H);
       if (this.I == null) {
          this.I = new BaseProfileFeedFragment$b(c.b(this.getResources(), 0x7f070cf8), 3, this.ia());
       }
       int b1 = false;
       int i = 0;
       while (true) {
          if (i < this.h0().getItemDecorationCount()) {
             if (this.h0().getItemDecorationAt(i) == this.I) {
             label_0058 :
                if (!b) {
                   this.h0().addItemDecoration(this.I);
                }
                RecyclerView$l itemAnimator = this.h0().getItemAnimator();
                if (itemAnimator instanceof y) {
                   itemAnimator.K(b1);
                }
                if (!PatchProxy.applyVoid(objArray, this, BaseProfileFeedFragment.class, "14")) {
                   b1 = 0x7f061ca5;
                   if (c.j()) {
                      b1 = 0x7f06173f;
                   }else if(k0.s()){
                      b1 = 0x7f061ca6;
                   }
                   this.h0().setBackgroundColor(j.d(this.h0(), b1));
                   break ;
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             b = false;
             goto label_0058 ;
          }
       }
       return;
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, BaseProfileFeedFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 3;
       if (b.g() && this.F == 2) {
          i = 5;
       }
       BaseProfileFeedFragment$1 u1 = new BaseProfileFeedFragment$1(this, this.getContext(), i);
       this.H = u1;
       u1.m1(new BaseProfileFeedFragment$a(this, i));
       return this.H;
    }
}
