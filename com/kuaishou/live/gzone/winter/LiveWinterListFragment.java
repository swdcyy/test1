package com.kuaishou.live.gzone.winter.LiveWinterListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import mrd.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y8c.t;
import gka.h;
import java.lang.Integer;
import android.view.View;
import androidx.fragment.app.Fragment;
import brd.y;
import java.util.List;
import java.lang.Boolean;
import y8c.g;
import m63.a;
import java.util.Objects;
import a9c.d;
import android.os.Bundle;
import ekd.m1;
import java.util.Map;
import m63.c;
import p91.m;
import mrd.c;
import lnc.g2;
import m63.i;
import lnc.g2$a;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import im8.c;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Collection;
import ekd.q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.RecyclerView$l;
import z8c.e;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import xtd.a;
import ytd.c;
import ytd.b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import qvb.i;
import m63.w;

public class LiveWinterListFragment extends RecyclerFragment	// class@001d03
{
    public c F;
    public g2 G;
    public List H;
    public m I;
    public View J;
    public int K;
    public String L;
    public c M;
    public PublishSubject N;
    public static final int O;

    public void LiveWinterListFragment(){
       super();
       this.M = a.g();
    }
    public PresenterV2 B2(){
       Object obj = PatchProxy.applyWithListener(null, this, LiveWinterListFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(LiveWinterListFragment.class, "8");
       return new PresenterV2();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveWinterListFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h();
    }
    public void Gh(int p0){
       if (PatchProxy.isSupport(LiveWinterListFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveWinterListFragment.class, "3")) {
          return;
       }
       this.K = p0;
       if (this.getView() != null) {
          this.getView().setBackgroundColor(p0);
       }
       return;
    }
    public void Hh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWinterListFragment.class, "2")) {
          return;
       }
       this.L = p0;
       this.M.onNext(p0);
       return;
    }
    public void Ih(List p0,int p1,boolean p2){
       if (PatchProxy.isSupport(LiveWinterListFragment.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, LiveWinterListFragment.class, "11")) {
          return;
       }
       if (this.getView() == null) {
          return;
       }
       this.K = p1;
       a uoa = this.g7();
       Objects.requireNonNull(uoa);
       a uoa1 = a.class;
       if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p2), uoa, uoa1, "2")) {
          if (p2) {
             uoa.m.c(p0);
          }else {
             uoa.m.b(p0);
          }
       }
       if (p0 == null || p0.isEmpty()) {
          this.J.setVisibility(0);
       }else {
          this.J.setVisibility(8);
       }
       this.getView().setBackgroundColor(p1);
       return;
    }
    public void a(){
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveWinterListFragment.class, "14")) {
          return;
       }
       super.fh(p0, p1);
       this.J = m1.f(p0, 0x7f0a2834);
       this.Ih(this.H, this.K, false);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0e89;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveWinterListFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveWinterListFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWinterListFragment.class, "5")) {
          return;
       }
       super.onCreate(p0);
       this.F = new c(this.I, this.M);
       this.G = new g2(this, new i(this));
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveWinterListFragment.class, "12")) {
          return;
       }
       super.onDestroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveWinterListFragment.class, "6")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = new Object[]{this.F,c.a("FRAGMENT", this),c.a("LIVE_WINTER_LIST_SWITCH_SUBJECT", this.N),c.a("TITLE", this.M)};
       ArrayList uArrayList = Lists.e(objArray);
       Collection uCollection = null;
       if (!q.f(uCollection)) {
          uArrayList.addAll(uCollection);
       }
       this.G.b(uArrayList);
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, LiveWinterListFragment.class, "4")) {
          return;
       }
       super.th();
       RecyclerView recyclerView = this.h0();
       recyclerView.setItemAnimator(new g());
       recyclerView.addItemDecoration(new e(0, a1.e(8.00f), a1.e(11.00f), a1.e(11.00f)));
       c uoc = new c(recyclerView);
       a uoa = new a(uoc, 0x3fc00000, 0x3f000000, -3.00f);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveWinterListFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.F);
    }
    public RecyclerView$LayoutManager xh(){
       LinearLayoutManager obj = PatchProxy.apply(null, this, LiveWinterListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinearLayoutManager(this.getContext(), 0, 0);
       obj.setItemPrefetchEnabled(0);
       return obj;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveWinterListFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new w(this.H);
    }
}
