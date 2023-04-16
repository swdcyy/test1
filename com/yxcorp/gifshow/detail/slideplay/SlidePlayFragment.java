package com.yxcorp.gifshow.detail.slideplay.SlidePlayFragment;
import vy6.a;
import yy6.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.e0;
import k2b.d0;
import k2b.k0;
import q87.c;
import androidx.fragment.app.Fragment;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import com.google.common.collect.ImmutableList;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;

public abstract class SlidePlayFragment extends BaseFragment implements a, a	// class@001716
{
    public View j;
    public boolean k;
    public boolean l;
    public String m;
    public boolean n;
    public boolean o;
    public int p;
    public String q;
    public String r;
    public boolean s;

    public void SlidePlayFragment(){
       super();
       this.p = -1;
    }
    private void dh(){
       if (PatchProxy.applyVoid(null, this, SlidePlayFragment.class, "13")) {
          return;
       }
       this.r = this.p+"-"+System.currentTimeMillis();
       return;
    }
    public boolean Xg(){
       Object obj = PatchProxy.apply(null, this, SlidePlayFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.gh() ^ 0x01);
    }
    public void ch(){
       this.s = true;
    }
    public boolean eh(){
       return true;
    }
    public boolean fh(){
       Object obj = PatchProxy.apply(null, this, SlidePlayFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(this.m, "create_type_slide");
    }
    public abstract boolean gh();
    public String h5(){
       Object obj = PatchProxy.apply(null, this, SlidePlayFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.gh()) {
          return d0.g(this);
       }
       if (TextUtils.x(this.r)) {
          this.dh();
       }
       if (!TextUtils.x(this.q)) {
          return this.q;
       }else {
          return this.r;
       }
    }
    public abstract boolean hh();
    public void ih(){
       if (PatchProxy.applyVoid(null, this, SlidePlayFragment.class, "3")) {
          return;
       }
       if (this.l != null) {
          return;
       }
       this.l = true;
       this.k1();
       return;
    }
    public void jh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SlidePlayFragment.class, "1")) {
          return;
       }
       if (this.k != null) {
          return;
       }
       this.k = true;
       this.dh();
       this.i2();
       if (!PatchProxy.applyVoid(objArray, this, SlidePlayFragment.class, "14")) {
          int i = 0;
          Object[] objArray1 = new Object[i];
          k0.C().s("SlidePlayFragment", "updateKsOrderList of "+this, objArray1);
          SlidePlayLogger logger = SlidePlayLogger.getLogger(this);
          if (logger != null) {
             BaseFeed baseFeed = logger.getBaseFeed();
             String str = "";
             CommonMeta mKsOrderId = (baseFeed != null)? baseFeed.a(CommonMeta.class).mKsOrderId: str;
             ImmutableList customKsOrde = logger.getCustomKsOrderList();
             if (customKsOrde == null) {
                customKsOrde = (!TextUtils.x(mKsOrderId))? ImmutableList.of(mKsOrderId): ImmutableList.of();
             }
          label_0074 :
             String str1 = this.o()+"/"+this.h5();
             ClientEvent$UrlPackage urlPackage = u1.r(this);
             if (urlPackage != null) {
                str = urlPackage.identity;
             }
             Object[] objArray2 = new Object[i];
             k0.C().s("SlidePlayFragment", str1+"\("+str+"\) -> "+customKsOrde, objArray2);
             u1.N0(this.getActivity(), this, customKsOrde);
          }
       }
       return;
    }
    public void kh(){
       if (PatchProxy.applyVoid(null, this, SlidePlayFragment.class, "2")) {
          return;
       }
       if (this.k == null) {
          return;
       }
       this.m = "create_type_slide";
       this.k = false;
       this.F1();
       this.dh();
       return;
    }
    public void lh(){
       if (PatchProxy.applyVoid(null, this, SlidePlayFragment.class, "4")) {
          return;
       }
       if (this.l == null) {
          return;
       }
       this.l = false;
       this.B0();
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayFragment.class, "6")) {
          return;
       }
       super.onActivityCreated(p0);
       this.n = true;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, SlidePlayFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getArguments() != null) {
          this.m = this.getArguments().getString("key_create_type");
          this.o = this.getArguments().getBoolean("KEY_PROFILE_FEED_ON", false);
       }
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, SlidePlayFragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       this.n = false;
       this.kh();
       this.lh();
       this.gh();
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(SlidePlayFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SlidePlayFragment.class, "7")) {
          return;
       }
       super.onHiddenChanged(p0);
       return;
    }
    public boolean yb(){
       return this.n;
    }
}
