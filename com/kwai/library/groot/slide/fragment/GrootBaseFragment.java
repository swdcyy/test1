package com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import pw6.d;
import qw6.a;
import yy6.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import java.lang.StringBuilder;
import lw6.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import com.google.common.collect.ImmutableList;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import pw6.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import dw6.b;
import android.os.Bundle;
import java.lang.System;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import k2b.d0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;

public abstract class GrootBaseFragment extends BaseFragment implements d, a, a	// class@000841
{
    public View j;
    public KwaiGrootViewPager k;
    public boolean l;
    public boolean m;
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public String u;
    public String v;
    public b w;

    public void GrootBaseFragment(){
       super();
       this.s = false;
       this.t = -1;
    }
    public void I(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrootBaseFragment.class, "1")) {
          return;
       }
       if (!this.gh()) {
          return;
       }
       GrootBaseFragment tk = this.k;
       if (tk != null && !tk.p0()) {
          return;
       }
       if (this.l != null) {
          return;
       }
       this.l = true;
       this.eh();
       this.Q1();
       if (!PatchProxy.applyVoid(objArray, this, GrootBaseFragment.class, "14")) {
          String str = "GrootBaseFragment";
          a.b(str, "updateKsOrderList of "+this);
          SlidePlayLogger logger = SlidePlayLogger.getLogger(this);
          if (logger != null) {
             BaseFeed baseFeed = logger.getBaseFeed();
             String str1 = "";
             CommonMeta mKsOrderId = (baseFeed != null)? baseFeed.a(CommonMeta.class).mKsOrderId: str1;
             ImmutableList customKsOrde = logger.getCustomKsOrderList();
             if (customKsOrde == null) {
                customKsOrde = (!TextUtils.x(mKsOrderId))? ImmutableList.of(mKsOrderId): ImmutableList.of();
             }
          label_007f :
             String str2 = this.o()+"/"+this.h5();
             ClientEvent$UrlPackage urlPackage = u1.r(this);
             if (urlPackage != null) {
                str1 = urlPackage.identity;
             }
             a.b(str, str2+"\("+str1+"\) -> "+customKsOrde);
             u1.N0(this.getActivity(), this, customKsOrde);
          }
       }
       return;
    }
    public void Mg(String p0){
       c.a(this, p0);
    }
    public void Q(){
       if (PatchProxy.applyVoid(null, this, GrootBaseFragment.class, "4")) {
          return;
       }
       if (!this.gh()) {
          return;
       }
       if (this.m == null) {
          return;
       }
       this.m = false;
       this.N2();
       return;
    }
    public void U(){
       if (PatchProxy.applyVoid(null, this, GrootBaseFragment.class, "2")) {
          return;
       }
       if (!this.gh()) {
          return;
       }
       if (this.l == null) {
          return;
       }
       this.n = "create_type_slide";
       this.l = false;
       this.Q0();
       this.eh();
       return;
    }
    public boolean Xg(){
       Object obj = PatchProxy.apply(null, this, GrootBaseFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.jh() ^ 0x01);
    }
    public void a0(){
       if (PatchProxy.applyVoid(null, this, GrootBaseFragment.class, "3")) {
          return;
       }
       if (!this.gh()) {
          return;
       }
       GrootBaseFragment tk = this.k;
       if (tk != null && !tk.p0()) {
          return;
       }
       if (this.m != null) {
          return;
       }
       this.m = true;
       this.H2();
       return;
    }
    public final b ch(){
       Object obj = PatchProxy.apply(null, this, GrootBaseFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getArguments() == null) {
          return null;
       }
       if (this.w == null) {
          this.w = b.j(this.getArguments());
       }
       return this.w;
    }
    public void d0(){
    }
    public int dh(){
       return this.t;
    }
    public final void eh(){
       if (PatchProxy.applyVoid(null, this, GrootBaseFragment.class, "13")) {
          return;
       }
       this.v = this.t+"-"+System.currentTimeMillis();
       return;
    }
    public void f0(){
       this.s = true;
    }
    public boolean fh(){
       GrootBaseFragment obj = PatchProxy.apply(null, this, GrootBaseFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       boolean b = true;
       if (obj == null) {
          return b;
       }
       if (this.t != obj.getCurrentItem()) {
          b = false;
       }
       return b;
    }
    public boolean gh(){
       return true;
    }
    public String h5(){
       Object obj = PatchProxy.apply(null, this, GrootBaseFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.jh()) {
          return d0.g(this);
       }
       if (TextUtils.x(this.v)) {
          this.eh();
       }
       if (!TextUtils.x(this.u)) {
          return this.u;
       }else {
          return this.v;
       }
    }
    public boolean hh(){
       Object obj = PatchProxy.apply(null, this, GrootBaseFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(this.n, "create_type_slide");
    }
    public boolean ih(){
       return this.p;
    }
    public abstract boolean jh();
    public abstract boolean kh();
    public void lh(){
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrootBaseFragment.class, "6")) {
          return;
       }
       super.onActivityCreated(p0);
       this.o = true;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, GrootBaseFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof KwaiGrootViewPager) {
          this.k = p1;
       }
       if (this.jh() && this.k == null) {
          this.k = this.getActivity().findViewById(0x7f0a111a);
       }
       if (this.jh() && (this.k == null && !this.getActivity().isFinishing())) {
          this.getActivity().finish();
       }
    label_0050 :
       if (this.ch() != null) {
          this.t = this.ch().c;
          this.n = this.ch().e("key_create_type");
          this.q = this.ch().a("key_is_first");
          this.p = this.ch().a.getBoolean(b.k("KEY_PROFILE_FEED_ON"), false);
          this.r = this.ch().a("key_is_refresh");
       }
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, GrootBaseFragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       this.o = false;
       this.U();
       this.Q();
       this.lh();
       if (!this.jh()) {
          this.f0();
       }
       this.w = null;
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(GrootBaseFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GrootBaseFragment.class, "7")) {
          return;
       }
       super.onHiddenChanged(p0);
       return;
    }
    public boolean yb(){
       return this.o;
    }
}
